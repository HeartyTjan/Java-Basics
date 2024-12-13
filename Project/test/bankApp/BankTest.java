package bankApp;

import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

public class BankTest {

    Bank accessBank;

    @BeforeEach
    public void setUp() {
        accessBank = new Bank("bankName", "license");
    }
    @AfterEach
    public void tearDown() {
        accessBank = null;
    }

    @Test
    public void createAccount_and_numberOfAccounts_IncreaseByOne_test() {
        accessBank.createAccount("FirstName", "LastName",  "CorrectPin", "09098128958");

        assertEquals(1,accessBank.getNumberOfAccounts());

    }

    @Test
    public void testDeposit_findAccount_and_add10k_toBalance_test(){
      Account account=  accessBank.createAccount("FirstName", "LastName",  "CorrectPin", "09098128958");
      accessBank.deposit(10_000, account.getNumber());
      assertEquals(10_000, account.getBalance("CorrectPin"));
    }
    @Test
    public void testDeposit_throwsException_ifAccountDoesNotExist_test(){
        assertThrows(IllegalArgumentException.class, ()->accessBank.deposit(10_000, "006"));
    }

    @Test
    public void testDepositCannotPayNegativeAmount_test(){
       Account account=  accessBank.createAccount("FirstName","LastName","CorrectPin", "09098128958");
        assertThrows(IllegalArgumentException.class, ()->accessBank.deposit(-10_000, "9098128958"));
    }

    @Test
    public void testDeposit20k_findAccount_withdraw10k_balanceIs10k_test(){
        Account account=  accessBank.createAccount("FirstName","LastName","CorrectPin", "09098128958");
        accessBank.deposit(20_000, account.getNumber());
        accessBank.withdraw(10_000, account.getNumber(),"CorrectPin");
        assertEquals(10_000, account.getBalance("CorrectPin"));
    }

    @Test
    public void testWithdraw_throwsException_ifWithdrawAmountIsMoreThanBalance_test(){
       Account account=  accessBank.createAccount("FirstName","LastName","CorrectPin", "09098128958");
        accessBank.deposit(20_000,account.getNumber());
        assertThrows(IllegalArgumentException.class, ()-> accessBank.withdraw(30_000,"9098128958", "CorrectPin"));
    }

    @Test
    public void testTransfer_withdraw10kFromSenderAndDeposit10k_toReceiver_test(){
        Account senderAccount =  accessBank.createAccount("FirstName", "LastName",  "CorrectPin", "09098128958");
        accessBank.deposit(50_000, senderAccount.getNumber());
        assertEquals(50_000, senderAccount.getBalance("CorrectPin"));
        Account beneficiaryAccount =  accessBank.createAccount("FirstName", "LastName",  "CorrectPin", "09098128959");
        accessBank.transfer(senderAccount.getNumber(), beneficiaryAccount.getNumber(), 10_000,"CorrectPin");
        assertEquals(senderAccount.getBalance("CorrectPin"),40_000);
        assertEquals(beneficiaryAccount.getBalance("CorrectPin"),10_000);

    }

    @Test
    public void testTransferCannotDeposit_toWrongAccount_test_senderBalanceRemainTheSame_test(){
        Account senderAccount =  accessBank.createAccount("FirstName", "LastName",  "CorrectPin", "09098128958");
        accessBank.deposit(50_000, senderAccount.getNumber());
        assertThrows(IllegalArgumentException.class,()-> accessBank.transfer(senderAccount.getNumber(), "9098128959", 10_000,"WrongPin"));
        assertEquals(50_000, senderAccount.getBalance("CorrectPin"));
    }

    @Test
    public void testBankCannotTransfer_ifSenderAccountIsInvalid(){
        Account senderAccount = accessBank.createAccount("FirstName", "LastName",  "CorrectPin", "09098128959");
        accessBank.deposit(50_000, senderAccount.getNumber());
        assertEquals(50_000, senderAccount.getBalance("CorrectPin"));
        assertThrows(IllegalArgumentException.class, ()-> accessBank.transfer("9098128958", "9098128959", 10_000,"WrongPin"));
    }

    @Test
    public void testGenerateNine_RandomNumbers(){
        int max = 9;
        String randomNumber = accessBank.generateRandomNumber();
        assertTrue(randomNumber.length() <= max);
    }


}


