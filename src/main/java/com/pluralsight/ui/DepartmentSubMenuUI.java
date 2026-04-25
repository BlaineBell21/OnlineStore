package com.pluralsight.ui;

import static com.pluralsight.ui.MainUserInterface.productScreenUI;
import static com.pluralsight.ui.MainUserInterface.promptInt;

public class DepartmentSubMenuUI {
    public static void displayDepartmentScreen(){
        System.out.println("Choose the department you'd like to search: ");
        System.out.println("1. Audio Video");
        System.out.println("2. Gaming");
        System.out.println("3. Electronics");
        System.out.println("4. Home");
        System.out.println("5. Office");
        System.out.println("6. Fitness");
        System.out.println("7. Return to previous screen");
    }

    public static void departmentScreenUI(){//allows user to enter in product screen choices
        boolean isDoneShopping = false;
        while(!isDoneShopping){
            displayDepartmentScreen();
            int userOption = promptInt();
            switch (userOption){
                case 1: //takes them to the Audio Video department
                    System.out.println();
                    isDoneShopping = true;
                    break;
                case 2: ///takes them to the Gaming department
                    System.out.println();
                    isDoneShopping = true;
                    break;
                case 3: //takes them to the Electronics department
                    System.out.println();
                    isDoneShopping = true;
                    break;
                case 4: //takes them to the Home department
                    System.out.println();
                    isDoneShopping = true;
                    break;
                case 5: //takes them to the Office department
                    System.out.println();
                    isDoneShopping = true;
                    break;
                case 6: //takes them to the Fitness department
                    System.out.println();
                    isDoneShopping = true;
                    break;
                case 7: //allows them to return to previous screen
                    System.out.println();
                    productScreenUI();
                    isDoneShopping = true;
                    break;
                default: //prompts user again
                    System.out.println("Invalid input, try again.");
            }
        }
    }
    public static void displayAVDepartmentScreen(){

    }
}
