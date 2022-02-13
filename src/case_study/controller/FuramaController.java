package case_study.controller;

import case_study.services.impl.BookingServiceImpl;
import case_study.services.impl.CustomerServiceImpl;
import case_study.services.impl.EmployeeServiceImpl;
import case_study.services.impl.FacilityServiceImpl;

import java.util.Scanner;

public class FuramaController {
    public static void main(String[] args) {
        displayMainMenu();
    }
    public static void displayMainMenu() {
        int choose = 0;
        boolean check = true;
        while (check) {
            System.out.println("1.\tEmployee Management");
            System.out.println("2.\tCustomer Management");
            System.out.println("3.\tFacility Management ");
            System.out.println("4.\tBooking Management");
            System.out.println("5.\tPromotion Management");
            System.out.println("6.\tExit");
            Scanner scanner = new Scanner(System.in);
            choose = Integer.parseInt(scanner.nextLine());

            switch (choose) {
                case 1:
                    displayEmployee();
                    break;
                case 2:
                    displayCustomer();
                    break;
                case 3:
                    displayFacility();
                    break;
                case 4:
                    displayBooking();
                    break;
                case 5:
                    displayListCustomer();
                    break;
                case 6:
                    check = false;
                    break;

            }
        }
    }

    public static void displayEmployee() {
        EmployeeServiceImpl employeeService = new EmployeeServiceImpl();
        int choose = 0;
        boolean check = true;
        while (check) {
            System.out.println("1\tDisplay list employees");
            System.out.println("2\tAdd new employee");
            System.out.println("3\tEdit employee");
            System.out.println("4\tReturn main menu");
            Scanner scanner = new Scanner(System.in);
            choose = Integer.parseInt(scanner.nextLine());
            switch (choose) {
                case 1:
                    employeeService.disPlay();
                    break;
                case 2:
                    employeeService.add();
                    break;
                case 3:
                    break;
                case 4:
                    check =false;
                    break;
            }
        }
    }

    public static void displayCustomer() {
        CustomerServiceImpl customerService = new CustomerServiceImpl();
        int choose = 0;
        boolean check = true;
        while (check) {
            System.out.println("1.\tDisplay list customers");
            System.out.println("2\tAdd new customers");
            System.out.println("3\tEdit customers");
            System.out.println("4\tReturn main menu");
            Scanner scanner = new Scanner(System.in);
            choose = Integer.parseInt(scanner.nextLine());

        }
        switch (choose) {
            case 1:
                break;
        }
    }

    public static void displayFacility() {
        FacilityServiceImpl facilityService = new FacilityServiceImpl();
        int choose = 0;
        boolean check = true;
        while (check) {
            System.out.println("1.\tDisplay list facility");
            System.out.println("2\tAdd new facility");
            System.out.println("3\tEdit facility maintenance");
            System.out.println("4\tReturn main menu");
            Scanner scanner = new Scanner(System.in);
            choose = Integer.parseInt(scanner.nextLine());
            switch (choose) {
            case 1:
                break;
        }
        }
    }
    public static void addNewFacilityMenu() {
        FacilityServiceImpl facilityService = new FacilityServiceImpl();
        int choose = 0;
        boolean check = true;
        while (check) {
            System.out.println("1.\tAdd new Villa");
            System.out.println("2\tAdd new House");
            System.out.println("3\tAdd new Room");
            System.out.println("3\tReturn main menu");
            Scanner scanner = new Scanner(System.in);
            choose = Integer.parseInt(scanner.nextLine());
            switch (choose) {
                case 1:
                    break;
            }
        }
    }
    public static void displayBooking() {
        BookingServiceImpl bookingService = new BookingServiceImpl();
        int choose = 0;
        boolean check = true;
        while (check) {
            System.out.println("1.\tAdd new booking");
            System.out.println("2.\tDisplay list booking");
            System.out.println("3.\tCreate new constracts");
            System.out.println("4.\tDisplay list contracts");
            System.out.println("5.\tEdit contracts");
            System.out.println("6.\tReturn main menu");
            Scanner scanner = new Scanner(System.in);
            choose = Integer.parseInt(scanner.nextLine());

            switch (choose) {
                case 1:
                    break;
            }
        }
    }
    public static void displayListCustomer() {
        int choose = 0;
        boolean check = true;
        while (check) {
            System.out.println("1.\tDisplay list customers use service");
            System.out.println("2.\tDisplay list customers get voucher");
            System.out.println("3.\tReturn main menu");
            Scanner scanner = new Scanner(System.in);
            choose = Integer.parseInt(scanner.nextLine());

            switch (choose) {
                case 1:
                    break;
            }
        }
    }
}
