public interface BankAPI {

    int fetchBalance(BankAccount account);

    void transferMoney(BankAccount account, int amount);
}
