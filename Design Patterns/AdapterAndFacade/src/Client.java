public class Client {

    public static void main(String[] args) {
        BankAccount bankAccount = new BankAccount("Virat",1000);
        PhonePe phonePe = new PhonePe();

        phonePe.doTransanction(bankAccount,500);
    }
}
