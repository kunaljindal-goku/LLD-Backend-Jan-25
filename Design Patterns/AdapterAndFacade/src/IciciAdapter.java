public class IciciAdapter implements BankAPI{

    private IciciAPI iciciAPI;

    public IciciAdapter() {
        this.iciciAPI = new IciciAPI();
    }

    @Override
    public int fetchBalance(BankAccount account) {

        return iciciAPI.getBalance(account);
    }

    @Override
    public void transferMoney(BankAccount account, int amount) {
        iciciAPI.pay(account,amount);
    }
}
