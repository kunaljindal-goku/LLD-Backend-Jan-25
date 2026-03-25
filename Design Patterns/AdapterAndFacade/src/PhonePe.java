public class PhonePe {

    private BankAPI bankAPI;

    public PhonePe(BankAPI bankAPI) {
        this.bankAPI = bankAPI;
    }

    public void doTransanction(BankAccount account, int amount) {
        int balance = bankAPI.fetchBalance(account);
        if(balance < amount) {
            throw new RuntimeException("Insufficent balance");
        }
        bankAPI.transferMoney(account,amount);
    }
}
