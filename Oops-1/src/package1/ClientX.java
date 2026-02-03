package package1;

public class ClientX {

    public static void main(String[] args) {
        BankAccount b1 = new BankAccount();
       // b1.ownerName = "Kunal";
        b1.setBalance(9000000);

        System.out.println(b1.getBalance());
    }
}
