public class BankFactory {

    public static BankAPI getBankAPI(String bankName) {
        if(bankName.equals("Icici")) return new IciciAdapter();
        else if(bankName.equals("YesBank")) return new YesBankAdapter();
        return null;
    }
}
