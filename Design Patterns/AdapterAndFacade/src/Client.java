import java.util.Scanner;

public class Client {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Please enter the bank name");
        String bankName = sc.next();
        BankAPI bankAPI = BankFactory.getBankAPI(bankName);


        BankAccount bankAccount = new BankAccount("Virat",1000);
        PhonePe phonePe = new PhonePe(bankAPI);

        phonePe.doTransanction(bankAccount,500);

        //check

        // trans
    }
}
