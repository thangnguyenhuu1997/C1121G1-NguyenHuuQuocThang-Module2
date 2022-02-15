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
            try {
                choose = Integer.parseInt(scanner.nextLine());
            } catch (NumberFormatException e) {
                System.out.println("Bạn đã nhập sai định dang, vui lòng nhập lại");
            }

            switch (choose) {
                case 1:
                    displayEmployee();
                    break;
                case 2:
                    displayCustomer();
                    break;
                case 3:
                    facilityDisplay();
                    break;
                case 4:
                    displayBookingMenu();
                    break;
                case 5:

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
            System.out.println("1\tAdd new employee");
            System.out.println("2\tDisplay list employees");
            System.out.println("3\tEdit employee");
            System.out.println("4\tReturn main menu");
            Scanner scanner = new Scanner(System.in);
            choose = Integer.parseInt(scanner.nextLine());
            switch (choose) {
                case 1:
                    employeeService.add();
                    break;
                case 2:
                    employeeService.disPlay();
                    break;
                case 3:
                    Scanner sc = new Scanner(System.in);
                    System.out.println("Nhập tên nhân viên cần sửa");
                    String hoTen = sc.nextLine();
                    employeeService.edit(hoTen);
                    break;
                case 4:
                    check = false;
                    break;
            }
        }
    }

    public static void displayCustomer() {
        CustomerServiceImpl customerService = new CustomerServiceImpl();
        int choose = 0;
        boolean check = true;
        while (check) {
            System.out.println("1.\tAdd new customers");
            System.out.println("2\tDisplay list customers ");
            System.out.println("3\tEdit customers");
            System.out.println("4\tReturn main menu");
            Scanner scanner = new Scanner(System.in);
            choose = Integer.parseInt(scanner.nextLine());

        }
        switch (choose) {
            case 1:
                customerService.add();
                break;
            case 2:
                customerService.disPlay();
                break;
            case 3:
                Scanner sc = new Scanner(System.in);
                System.out.println("Nhập tên khách hàng");
                String hoTen = sc.nextLine();
                customerService.edit(hoTen);
                break;
            case 4:
                check = false;
                break;
        }
    }

    public static void facilityDisplay() {
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
                    facilityService.disPlay();
                    break;
                case 2:
                    facilityMenu();
                    break;
                case 3:
                    break;
                case 4:
                    check = false;
                    break;
            }
        }
    }

    public static void facilityMenu() {
        FacilityServiceImpl facilityService = new FacilityServiceImpl();
        int choose = 0;
        boolean check = true;
        while (check) {
            System.out.println("1.\tAdd New Villa");
            System.out.println("2\tAdd new House");
            System.out.println("3\tAdd new Room");
            System.out.println("4\tReturn main menu");
            Scanner scanner = new Scanner(System.in);
            choose = Integer.parseInt(scanner.nextLine());
            switch (choose) {
                case 1:
                    facilityService.addVilla();
                    facilityDisplay();
                    break;
                case 2:
                    facilityService.addHouse();
                    facilityDisplay();
                    break;
                case 3:
                    facilityService.addRoom();
                    facilityDisplay();
                    break;
                case 4:
                    check = false;
                    break;
            }
        }
    }

    private static void displayBookingMenu() {
        System.out.println("1.\tAdd new Booking");
        System.out.println("2\tDisplay list Booking");
        System.out.println("3\tCreate new Contract");
        System.out.println("4\tDisplay list contract");
        System.out.println("5\tEdit contract");
        System.out.println("6\tReturn main menu");
        BookingServiceImpl bookingService = new BookingServiceImpl();
        Boolean check = true;
        while (check) {
            Scanner scanner = new Scanner(System.in);
            switch (scanner.nextInt()){
                case 1:
                    bookingService.addBooking();
                    displayBookingMenu();
                    break;
                case 2:
                    bookingService.displayListBooking();
                    displayBookingMenu();
                    break;
            }
        }
    }
}