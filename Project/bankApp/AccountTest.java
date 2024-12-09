package bankApp;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertThrows;

public class AccountTest {
    Account account;

    @BeforeEach
    public void setUp() {
        account = new Account("1", "name", "CorrectPin","Phone number");
    }

    @Test
    public void testDepoist5kTwice_BalanceIs10K_getBalanceWithCorrectPin() {
        assertEquals(0, account.getBalance("CorrectPin"));
        account.deposit(5000);
        account.deposit(5000);
        assertEquals(10_000, account.getBalance("CorrectPin"));
    }

    @Test
    public void testDepoist5k_getBalanceWithWrongPin_throwsException() {
        account.deposit(5000);
        assertThrows(IllegalArgumentException.class, () -> account.getBalance("WrongPin"));
    }
    @Test
    public void testNegativeAmountInto_depositThrowsException_balanceIsZeroBeforeAndAfterDeposit() {
        assertThrows(IllegalArgumentException.class, () -> account.deposit(-1));
        assertEquals(0, account.getBalance("CorrectPin"));
    }
    @Test
    public void accountDeposit10k_withdraw5k(){
        account.deposit(10_000);
        assertEquals(10_000, account.getBalance("CorrectPin"));
        account.withdraw(5000,"CorrectPin");
        assertEquals(5_000, account.getBalance("CorrectPin"));
    }

    @Test
    public void accountDeposit20k_withdraw10kWithWrongPin_balanceIs20k_test(){
        account.deposit(20_000);
        assertEquals(20_000, account.getBalance("CorrectPin"));
        assertThrows(IllegalArgumentException.class, () -> account.withdraw(5000,"WrongPin"));
        assertEquals(20_000, account.getBalance("CorrectPin"));

    }
}