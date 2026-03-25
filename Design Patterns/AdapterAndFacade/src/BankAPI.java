public interface BankAPI {

    int getBalance(BankAccount account);

    void transferMoney(BankAccount account, int amount);
}
