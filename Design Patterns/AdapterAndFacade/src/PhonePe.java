public class PhonePe {

    private BankAPI bankAPI;

    public PhonePe() {
        bankAPI = new IciciAPI();
    }

    public void doTransanction(BankAccount account, int amount) {
        int balance = bankAPI.getBalance(account);
        if(balance < amount) {
            throw new RuntimeException("Insufficent balance");
        }
        bankAPI.transferMoney(account,amount);
    }
}
