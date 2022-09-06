public class MainTest {
    public static void main(String[] args) {
        Account account = new Account();
        account.setValue(50.0);

        System.out.println(account.getBalance());
        System.out.println(account.getBalance(new ConversionDolar()));
    }
}
