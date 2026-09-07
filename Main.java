import java.util.ArrayList;
import java.util.Scanner;

public class Main {

    static Scanner sc = new Scanner(System.in);

    // Vehicle list
    static ArrayList<Vehicle> vehicles = new ArrayList<>();

    // Driver list
    static ArrayList<Driver> drivers = new ArrayList<>();

    // Customer list
    static ArrayList<Customer> customers = new ArrayList<>();

    // Trip list
    static ArrayList<Trip> trips = new ArrayList<>();

    public static void main(String[] args) {

        int choice;

        do {
            System.out.println("\n==========================================");
            System.out.println("       TRANSPORT MANAGEMENT SYSTEM");
            System.out.println("==========================================");
            System.out.println("1. Vehicle Management");
            System.out.println("2. Driver Management");
            System.out.println("3. Customer Management");
            System.out.println("4. Trip Management");
            System.out.println("5. View All Details");
            System.out.println("6. Exit");
            System.out.println("==========================================");

            System.out.print("Enter your choice: ");
            choice = sc.nextInt();
            sc.nextLine();

            switch (choice) {

                case 1:
                    vehicleMenu();
                    break;

                case 2:
                    driverMenu();
                    break;

                case 3:
                    customerMenu();
                    break;

                case 4:
                    tripMenu();
                    break;

                case 5:
                    viewAllDetails();
                    break;

                case 6:
                    System.out.println("\nThank you for using Transport Management System!");
                    break;

                default:
                    System.out.println("\nInvalid choice!");
            }

        } while (choice != 6);

        sc.close();
    }

    // ================= VEHICLE MENU =================

    static void vehicleMenu() {

        int choice;

        do {
            System.out.println("\n========== VEHICLE MANAGEMENT ==========");
            System.out.println("1. Add Vehicle");
            System.out.println("2. View Vehicles");
            System.out.println("3. Search Vehicle");
            System.out.println("4. Back to Main Menu");

            System.out.print("Enter your choice: ");
            choice = sc.nextInt();
            sc.nextLine();

            switch (choice) {

                case 1:
                    addVehicle();
                    break;

                case 2:
                    viewVehicles();
                    break;

                case 3:
                    searchVehicle();
                    break;

                case 4:
                    break;

                default:
                    System.out.println("Invalid choice!");
            }

        } while (choice != 4);
    }

    // ================= ADD VEHICLE =================

    static void addVehicle() {

        System.out.println("\n---------- ADD VEHICLE ----------");

        System.out.print("Enter Vehicle ID: ");
        int id = sc.nextInt();
        sc.nextLine();

        System.out.print("Enter Vehicle Number: ");
        String number = sc.nextLine();

        System.out.print("Enter Vehicle Type: ");
        String type = sc.nextLine();

        System.out.print("Enter Vehicle Model: ");
        String model = sc.nextLine();

        System.out.print("Enter Vehicle Status: ");
        String status = sc.nextLine();

        Vehicle v = new Vehicle(id, number, type, model, status);

        vehicles.add(v);

        System.out.println("\nVehicle added successfully!");
    }

    // ================= VIEW VEHICLES =================

    static void viewVehicles() {

        System.out.println("\n========== VEHICLE DETAILS ==========");

        if (vehicles.isEmpty()) {
            System.out.println("No vehicles found.");
            return;
        }

        for (Vehicle v : vehicles) {
            v.display();
        }
    }

    // ================= SEARCH VEHICLE =================

    static void searchVehicle() {

        System.out.print("\nEnter Vehicle Number: ");
        String number = sc.nextLine();

        boolean found = false;

        for (Vehicle v : vehicles) {

            if (v.vehicleNumber.equalsIgnoreCase(number)) {

                v.display();
                found = true;
                break;
            }
        }

        if (!found) {
            System.out.println("Vehicle not found!");
        }
    }

    // ================= DRIVER MENU =================

    static void driverMenu() {

        int choice;

        do {
            System.out.println("\n========== DRIVER MANAGEMENT ==========");
            System.out.println("1. Add Driver");
            System.out.println("2. View Drivers");
            System.out.println("3. Back to Main Menu");

            System.out.print("Enter your choice: ");
            choice = sc.nextInt();
            sc.nextLine();

            switch (choice) {

                case 1:
                    addDriver();
                    break;

                case 2:
                    viewDrivers();
                    break;

                case 3:
                    break;

                default:
                    System.out.println("Invalid choice!");
            }

        } while (choice != 3);
    }

    // ================= ADD DRIVER =================

    static void addDriver() {

        System.out.println("\n---------- ADD DRIVER ----------");

        System.out.print("Enter Driver ID: ");
        int id = sc.nextInt();
        sc.nextLine();

        System.out.print("Enter Driver Name: ");
        String name = sc.nextLine();

        System.out.print("Enter Phone Number: ");
        String phone = sc.nextLine();

        System.out.print("Enter License Number: ");
        String license = sc.nextLine();

        Driver d = new Driver(id, name, phone, license);

        drivers.add(d);

        System.out.println("\nDriver added successfully!");
    }

    // ================= VIEW DRIVERS =================

    static void viewDrivers() {

        System.out.println("\n========== DRIVER DETAILS ==========");

        if (drivers.isEmpty()) {
            System.out.println("No drivers found.");
            return;
        }

        for (Driver d : drivers) {
            d.display();
        }
    }

    // ================= CUSTOMER MENU =================

    static void customerMenu() {

        int choice;

        do {
            System.out.println("\n========== CUSTOMER MANAGEMENT ==========");
            System.out.println("1. Add Customer");
            System.out.println("2. View Customers");
            System.out.println("3. Back to Main Menu");

            System.out.print("Enter your choice: ");
            choice = sc.nextInt();
            sc.nextLine();

            switch (choice) {

                case 1:
                    addCustomer();
                    break;

                case 2:
                    viewCustomers();
                    break;

                case 3:
                    break;

                default:
                    System.out.println("Invalid choice!");
            }

        } while (choice != 3);
    }

    // ================= ADD CUSTOMER =================

    static void addCustomer() {

        System.out.println("\n---------- ADD CUSTOMER ----------");

        System.out.print("Enter Customer ID: ");
        int id = sc.nextInt();
        sc.nextLine();

        System.out.print("Enter Customer Name: ");
        String name = sc.nextLine();

        System.out.print("Enter Phone Number: ");
        String phone = sc.nextLine();

        System.out.print("Enter Address: ");
        String address = sc.nextLine();

        Customer c = new Customer(id, name, phone, address);

        customers.add(c);

        System.out.println("\nCustomer added successfully!");
    }

    // ================= VIEW CUSTOMERS =================

    static void viewCustomers() {

        System.out.println("\n========== CUSTOMER DETAILS ==========");

        if (customers.isEmpty()) {
            System.out.println("No customers found.");
            return;
        }

        for (Customer c : customers) {
            c.display();
        }
    }

    // ================= TRIP MENU =================

    static void tripMenu() {

        int choice;

        do {
            System.out.println("\n========== TRIP MANAGEMENT ==========");
            System.out.println("1. Create Trip");
            System.out.println("2. View Trips");
            System.out.println("3. Back to Main Menu");

            System.out.print("Enter your choice: ");
            choice = sc.nextInt();
            sc.nextLine();

            switch (choice) {

                case 1:
                    createTrip();
                    break;

                case 2:
                    viewTrips();
                    break;

                case 3:
                    break;

                default:
                    System.out.println("Invalid choice!");
            }

        } while (choice != 3);
    }

    // ================= CREATE TRIP =================

    static void createTrip() {

        System.out.println("\n---------- CREATE TRIP ----------");

        System.out.print("Enter Trip ID: ");
        int id = sc.nextInt();
        sc.nextLine();

        System.out.print("Enter Vehicle Number: ");
        String vehicle = sc.nextLine();

        System.out.print("Enter Driver Name: ");
        String driver = sc.nextLine();

        System.out.print("Enter Customer Name: ");
        String customer = sc.nextLine();

        System.out.print("Enter Source: ");
        String source = sc.nextLine();

        System.out.print("Enter Destination: ");
        String destination = sc.nextLine();

        System.out.print("Enter Distance (km): ");
        double distance = sc.nextDouble();
        sc.nextLine();

        Trip t = new Trip(
                id,
                vehicle,
                driver,
                customer,
                source,
                destination,
                distance
        );

        trips.add(t);

        System.out.println("\nTrip created successfully!");
    }

    // ================= VIEW TRIPS =================

    static void viewTrips() {

        System.out.println("\n========== TRIP DETAILS ==========");

        if (trips.isEmpty()) {
            System.out.println("No trips found.");
            return;
        }

        for (Trip t : trips) {
            t.display();
        }
    }

    // ================= VIEW ALL DETAILS =================

    static void viewAllDetails() {

        viewVehicles();
        viewDrivers();
        viewCustomers();
        viewTrips();
    }
}


// =====================================================
// VEHICLE CLASS
// =====================================================

class Vehicle {

    int vehicleId;
    String vehicleNumber;
    String vehicleType;
    String model;
    String status;

    Vehicle(int vehicleId, String vehicleNumber,
            String vehicleType, String model,
            String status) {

        this.vehicleId = vehicleId;
        this.vehicleNumber = vehicleNumber;
        this.vehicleType = vehicleType;
        this.model = model;
        this.status = status;
    }

    void display() {

        System.out.println("------------------------------------------");
        System.out.println("Vehicle ID     : " + vehicleId);
        System.out.println("Vehicle Number : " + vehicleNumber);
        System.out.println("Vehicle Type   : " + vehicleType);
        System.out.println("Model          : " + model);
        System.out.println("Status         : " + status);
    }
}


// =====================================================
// DRIVER CLASS
// =====================================================

class Driver {

    int driverId;
    String name;
    String phone;
    String licenseNumber;

    Driver(int driverId, String name,
           String phone, String licenseNumber) {

        this.driverId = driverId;
        this.name = name;
        this.phone = phone;
        this.licenseNumber = licenseNumber;
    }

    void display() {

        System.out.println("------------------------------------------");
        System.out.println("Driver ID      : " + driverId);
        System.out.println("Driver Name    : " + name);
        System.out.println("Phone Number   : " + phone);
        System.out.println("License Number : " + licenseNumber);
    }
}


// =====================================================
// CUSTOMER CLASS
// =====================================================

class Customer {

    int customerId;
    String name;
    String phone;
    String address;

    Customer(int customerId, String name,
             String phone, String address) {

        this.customerId = customerId;
        this.name = name;
        this.phone = phone;
        this.address = address;
    }

    void display() {

        System.out.println("------------------------------------------");
        System.out.println("Customer ID : " + customerId);
        System.out.println("Name        : " + name);
        System.out.println("Phone       : " + phone);
        System.out.println("Address     : " + address);
    }
}


// =====================================================
// TRIP CLASS
// =====================================================

class Trip {

    int tripId;
    String vehicleNumber;
    String driverName;
    String customerName;
    String source;
    String destination;
    double distance;

    Trip(int tripId, String vehicleNumber,
         String driverName, String customerName,
         String source, String destination,
         double distance) {

        this.tripId = tripId;
        this.vehicleNumber = vehicleNumber;
        this.driverName = driverName;
        this.customerName = customerName;
        this.source = source;
        this.destination = destination;
        this.distance = distance;
    }

    void display() {

        System.out.println("------------------------------------------");
        System.out.println("Trip ID       : " + tripId);
        System.out.println("Vehicle       : " + vehicleNumber);
        System.out.println("Driver        : " + driverName);
        System.out.println("Customer      : " + customerName);
        System.out.println("Source        : " + source);
        System.out.println("Destination   : " + destination);
        System.out.println("Distance      : " + distance + " km");
    }
}