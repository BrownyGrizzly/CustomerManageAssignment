package inter;

import java.util.Scanner;

public interface CustomerManagerInterface {

    void runMenu();

    void addCustomer(Scanner scanner);

    void viewCustomerList();

    void searchCustomerByPhoneNumber(Scanner scanner);

    void editCustomerInformation(Scanner scanner);

    void deleteCustomer(Scanner scanner);

    boolean isValidPhoneNumber(String phoneNumber);

    boolean isValidEmail(String email);

    boolean isValidName(String name);

    void loadData();

    void saveData();
}
