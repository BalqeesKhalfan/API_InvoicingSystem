package com.TRA.tra24Springboot;
import java.util.Scanner;

public class Menu {
    // Method to show Main Menu
    public static void showMainMenu() {
        System.out.println("Main Menu:");
        System.out.println("1- Shop Settings");
        System.out.println("2- Manage Shop Items");
        System.out.println("3- Create New Invoice");
        System.out.println("4- Report: Statistics");
        System.out.println("5- Report: All Invoices");
        System.out.println("6- Search Invoices");
        System.out.println("7- Program Statistics");
        System.out.println("8- Exit");
    }
    // method to show shop settings menu
    public static void showShopSettingsMenu() {
        System.out.println("1- Load Data (Items and invoices)");
        System.out.println("2- Set Shop Name (data should be saved) ");
        System.out.println("3- Set Invoice Header (Tel / Fax / Email / Website)");
        System.out.println("4- Go Back");

    }

    public  static  void showManageShopItemsMenu(){
        System.out.println("1- Add Items ");
        System.out.println("2-Delete Items ");
        System.out.println("3- Change Item Price ");
        System.out.println("4- Report All Items");
        System.out.println("5- Go Back");
    }

    //Shop setings process menu
    static void processShopSettingsMenu(Scanner scanner, Shop shop) {
        Menu.showShopSettingsMenu();
        System.out.print("Enter your choice: ");
        int settingChoice = scanner.nextInt();
        ShopInterface shopInterface = new Shop();
        scanner.nextLine(); // Consume the newline character after reading the integer
        switch (settingChoice) {
            case 1:
                System.out.println(shopInterface.loadData(scanner));
                break;
            case 2:
                shopInterface.setShopName(scanner, shop);
                break;
            case 3:
                shopInterface.setInvoiceHeader(scanner, shop);
                break;
            case 4:
                Menu.showMainMenu();
                break;
            default:
                System.out.println("Invalid choice.");
                break;
        }
    }

    //process Item shop menu
    static void processManageShopItemsMenu(Scanner scanner, Shop shop) {
        Menu.showManageShopItemsMenu();
        System.out.print("Enter your choice: ");
        int itemChoice = scanner.nextInt();
        ItemInterface item = new Item();
        ShopInterface shopfac = new Shop();
        switch (itemChoice) {
            case 1:
                item.addItem(scanner,shop);

                break;
            case 2:

                item.deleteItem(scanner, shop);
                break;
            case 3:

                item.changeItemPrice(scanner, shop);
                break;
            case 4:
                shopfac.reportAllItems();
                break;
            case 5:
                Menu.showMainMenu();
                break;
            default:
                System.out.println("Invalid choice.");
                break;
        }
    }

}
