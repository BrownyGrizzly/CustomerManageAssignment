import implement.CustomerManagerImpl;
import inter.CustomerManagerInterface;

public class Main {
    public static void main(String[] args) {
        CustomerManagerInterface cms = new CustomerManagerImpl();
        cms.runMenu();
    }
}