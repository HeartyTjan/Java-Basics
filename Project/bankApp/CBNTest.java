package bankApp;

import org.ietf.jgss.ChannelBinding;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertThrows;

public class CBNTest {

    @Test
    public void testCBN_addANewBank() {
       CBN cbn = new CBN();
       cbn.addNewBank("bankName","license");
       assertEquals(1,cbn.getNumberOfBanks());

    }

    @Test
    public void testFindBank_returnsExpectedBankIfFound() {
        CBN cbn = new CBN();
        Bank bank = cbn.addNewBank("accessBank","license01");
        String bankName = cbn.findBank("accessBank").getBankName();
        assertEquals("accessBank", bankName);
    }

    @Test
    public void testFindBank_throwsExceptionIfBankNotFound(){
        CBN cbn = new CBN();
        Bank bank = cbn.addNewBank("accessBank","license01");
        assertThrows(IllegalArgumentException.class, ()-> cbn.findBank("gtb"));
    }

    @Test
    public void testCBN_transferFromOneBankToAnotherBank() {
        CBN cbn = new CBN();
        Bank senderBank = cbn.addNewBank("Access Bank","license01");
        Account senderAccount = senderBank.createAccount("Ifeoluwa","Oluwasegun","Sender Pin", "09098128958");
        senderAccount.deposit(1_000_000);
        assertEquals(1_000_000, senderAccount.getBalance("Sender Pin"));

        Bank receiverBank = cbn.addNewBank("Union Bank","license02");
        Account receiverAccount = receiverBank.createAccount("Agbajelola","Tijani","Pin code", "09098128959");
        cbn.transfer(senderBank.getBankName(),"9098128958", receiverBank.getBankName(), "9098128959",500_000, "Sender Pin");
        assertEquals(500_000, receiverAccount.getBalance("Pin code"));
        assertEquals(500_000, senderAccount.getBalance("Sender Pin"));

    }
}
