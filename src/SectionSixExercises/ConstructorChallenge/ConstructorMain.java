package SectionSixExercises.ConstructorChallenge;

public class ConstructorMain {
    public static void main(String[] args) {
        BankAccount johnsAccount = new BankAccount(0, 1000, "John Smith", "john.smith@gmail.com", "0701234567");
        printBankAccountInfo(johnsAccount);
        johnsAccount.withdrawFunds(1200);
        johnsAccount.withdrawFunds(500);
        johnsAccount.depositFunds(1700);


        BankAccount henrysAccount = new BankAccount(1, 600, "Henry Jobs", "herny.jobs@gmail.com", "0702345678");
        printBankAccountInfo(henrysAccount);
        henrysAccount.withdrawFunds(1200);
        henrysAccount.withdrawFunds(500);
        henrysAccount.depositFunds(1700);

        BankAccount defaultAccount = new BankAccount();
        printBankAccountInfo(defaultAccount);

        VipCustomer fredVip = new VipCustomer("Fred", 5000f, "fred@fancy.com");
        printVipCustomerInfo(fredVip);

        VipCustomer johannaVip = new VipCustomer("Johanna", "johanna@lessfancy.com");
        printVipCustomerInfo(johannaVip);

        VipCustomer defaultVip = new VipCustomer();
        printVipCustomerInfo(defaultVip);
    }

    public static void printBankAccountInfo(BankAccount account) {
        System.out.println(">>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>");
        System.out.println(account.getAccountNumber());
        System.out.println(account.getCustomerName());
        System.out.println(account.getEmail());
        System.out.println(account.getPhoneNumber());
        System.out.println(account.getBalance());
        System.out.println("<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<");
    }

    public static void printVipCustomerInfo(VipCustomer customer) {
        System.out.println(">>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>");
        System.out.println(customer.getName());
        System.out.println(customer.getEmail());
        System.out.println(customer.getCreditLimit());
        System.out.println("<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<");
    }
}
