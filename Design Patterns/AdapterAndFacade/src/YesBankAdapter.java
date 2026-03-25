public class YesBankAdapter implements BankAPI{

    private YesBankAPI yesBankAPI;

    public YesBankAdapter() {
        this.yesBankAPI = new YesBankAPI();
    }

    @Override
    public int fetchBalance(BankAccount account, int random) {
        return yesBankAPI.seeBalance(account);
    }

    @Override
    public void transferMoney(BankAccount account, int amount) {
        yesBankAPI.sendMoney(account,amount);
    }
}
