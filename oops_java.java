package oops_demo;

// ============== CLASS DEFINITIONS ==============

// Task 1 Student class
class Student {
    String name;
    int age;
    String course;
    int rollNo;
    int mark1, mark2, mark3;
    
    // Default constructor for Task 1
    public Student() {
    }
    
 
    // Task 9: Parameterized constructor
    public Student(String name, int rollNo, String course) {
        this.name = name;
        this.rollNo = rollNo;
        this.course = course;
    }
    
    // Task 15: Constructor with marks
    public Student(String name, int rollNo, String course, int mark1, int mark2, int mark3) {
        this.name = name;
        this.rollNo = rollNo;
        this.course = course;
        this.mark1 = mark1;
        this.mark2 = mark2;
        this.mark3 = mark3;
    }
    
    // Task 15: Calculate total
    public int calculateTotal() {
        return mark1 + mark2 + mark3;
    }
    
    // Task 15: Calculate average
    public double calculateAverage() {
        return calculateTotal() / 3.0;
    }
    
    // Task 15: Calculate grade
    public String calculateGrade() {
        double avg = calculateAverage();
        if (avg >= 90) return "A+";
        else if (avg >= 80) return "A";
        else if (avg >= 70) return "B+";
        else if (avg >= 60) return "B";
        else if (avg >= 50) return "C";
        else return "F";
    }
    
    // Display method for Task 1
    public void display() {
        System.out.println("Name: " + name + " | Age: " + age + " | Course: " + course + " | RollNo: " + rollNo);
    }
    
    // Display method for Task 15
    public void displayWithMarks() {
        System.out.println("Name: " + name + " | RollNo: " + rollNo + " | Course: " + course);
        System.out.println("Marks: " + mark1 + ", " + mark2 + ", " + mark3);
        System.out.println("Total: " + calculateTotal() + " | Average: " + String.format("%.2f", calculateAverage()) + " | Grade: " + calculateGrade());
    }
}

 // Task 2, 10: Employee class
    class Employee {
        int id;
        String name;
        String department;
        double salary;
        String designation;
        
        // Default constructor for Task 2
        public Employee() {}
    
    // Task 10: Parameterized constructor
    public Employee(int id, String name, String designation, double salary) {
        this.id = id;
        this.name = name;
        this.designation = designation;
        this.salary = salary;
    }
    
    public void display() {
        System.out.println("ID: " + id + " | Name: " + name + " | Department: " + department + " | Salary: " + salary);
    }
    
    public void displayWithDesignation() {
        System.out.println("ID: " + id + " | Name: " + name + " | Designation: " + designation + " | Salary: " + salary);
    }
}

// Task 3, 11: Laptop class
class Laptop {
    String brand;
    String model;
    int ram;
    int rom;
    double price;
    
    // Default constructor for Task 3
    public Laptop() {}
    
    // Task 11: Parameterized constructor
    public Laptop(String brand, String model, int ram, int rom, double price) {
        this.brand = brand;
        this.model = model;
        this.ram = ram;
        this.rom = rom;
        this.price = price;
    }
    
    public void display() {
        System.out.println("Brand: " + brand + " | Model: " + model + " | RAM: " + ram + "GB | ROM: " + rom + "GB | Price: $" + price);
    }
}

// Task 4: Book class
class Book {
    String title;
    String author;
    double price;
    int pages;
    
    public Book() {}
    
    public void display() {
        System.out.println("Title: " + title + " | Author: " + author + " | Price: $" + price + " | Pages: " + pages);
    }
}

// Task 5, 12: Car class
class Car {
    String brand;
    String model;
    String color;
    double price;
    int topSpeed;
    
    // Default constructor for Task 5
    public Car() {}
    
    // Task 12: Parameterized constructor
    public Car(String brand, String model, String color, int topSpeed, double price) {
        this.brand = brand;
        this.model = model;
        this.color = color;
        this.topSpeed = topSpeed;
        this.price = price;
    }
    
    // Task 5: engine() method
    public void engine() {
        System.out.println(brand + " " + model + "'s engine is running! Vroom Vroom!");
    }
    
    public void display() {
        System.out.println("Brand: " + brand + " | Model: " + model + " | Color: " + color + " | TopSpeed: " + topSpeed + " km/h | Price: $" + price);
    }
}

// Task 6, 13: Mobile class
class Mobile {
    String brand;
    String model;
    int ram;
    int rom;
    double price;
    
    // Default constructor for Task 6
    public Mobile() {}
    
    // Task 13: Parameterized constructor using 'this' keyword
    public Mobile(String brand, String model, int ram, int rom, double price) {
        this.brand = brand;
        this.model = model;
        this.ram = ram;
        this.rom = rom;
        this.price = price;
    }
    
    public void display() {
        System.out.println("Brand: " + brand + " | Model: " + model + " | RAM: " + ram + "GB | ROM: " + rom + "GB | Price: $" + price);
    }
}

// Task 7, 14: Product class
class Product {
    String name;
    String category;
    double price;
    int quantity;
    
    // Default constructor for Task 7
    public Product() {}
    
    // Task 14: Parameterized constructor
    public Product(String name, double price, int quantity) {
        this.name = name;
        this.price = price;
        this.quantity = quantity;
    }
    
    // Task 14: Calculate total price
    public double calculateTotalPrice() {
        return price * quantity;
    }
    
    public void display() {
        System.out.println("Name: " + name + " | Category: " + category + " | Price: $" + price + " | Quantity: " + quantity);
    }
    
    public void displayWithTotal() {
        System.out.println("Name: " + name + " | Price: $" + price + " | Quantity: " + quantity + " | Total: $" + calculateTotalPrice());
    }
}

// Task 8: BankAccount class
class BankAccount {
    String accountNumber;
    String holderName;
    String accountType;
    double balance;
    
    public BankAccount() {}
    
    public void display() {
        System.out.println("Account No: " + accountNumber + " | Holder: " + holderName + " | Type: " + accountType + " | Balance: $" + balance);
    }
}

// ============== MAIN CLASS ==============
public class oops_java {
    
    public static void main(String[] args) {
        
        
        // ===== TASK 1: Student class with 3 objects =====
        System.out.println("TASK 1: Student Class - 3 Objects");
        System.out.println("--------------------------------------");
        
        Student s1 = new Student();
        s1.name = "Nisha";
        s1.age = 21;
        s1.course = "ECE";
        s1.rollNo = 90;
        
        Student s2 = new Student();
        s2.name = "Poorna";
        s2.age = 20;
        s2.course = "ECE";
        s2.rollNo = 101;
        
        Student s3 = new Student();
        s3.name = "Gowthami";
        s3.age = 20;
        s3.course = "ECE";
        s3.rollNo = 803;
        
        s1.display();
        s2.display();
        s3.display();
        System.out.println();
        
        // ===== TASK 2: Employee class with 2 objects =====
        System.out.println("TASK 2: Employee Class - 2 Objects");
        System.out.println("--------------------------------------");
        
        Employee e1 = new Employee();
        e1.id = 101;
        e1.name = "Poorna";
        e1.department = "IT";
        e1.salary = 30000;
        
        Employee e2 = new Employee();
        e2.id = 104;
        e2.name = "Hema";
        e2.department = "HR";
        e2.salary = 35000;
        
        e1.display();
        e2.display();
        System.out.println();
        
        // ===== TASK 3: Laptop class with 3 objects =====
        System.out.println("TASK 3: Laptop Class - 3 Objects");
        System.out.println("--------------------------------------");
        
        Laptop l1 = new Laptop();
        l1.brand = "Dell";
        l1.model = "XPS 15";
        l1.ram = 16;
        l1.rom = 512;
        l1.price = 1299.99;
        
        Laptop l2 = new Laptop();
        l2.brand = "HP";
        l2.model = "Pavilion";
        l2.ram = 8;
        l2.rom = 256;
        l2.price = 699.99;
        
        Laptop l3 = new Laptop();
        l3.brand = "Lenovo";
        l3.model = "ThinkPad";
        l3.ram = 32;
        l3.rom = 1024;
        l3.price = 1599.99;
        
        l1.display();
        l2.display();
        l3.display();
        System.out.println();
        
        // ===== TASK 4: Book class with 2 objects =====
        System.out.println("TASK 4: Book Class - 2 Objects");
        System.out.println("--------------------------------------");
        
        Book b1 = new Book();
        b1.title = "Java: The Complete Reference";
        b1.author = "Herbert Schildt";
        b1.price = 45.99;
        b1.pages = 1280;
        
        Book b2 = new Book();
        b2.title = "Head First Java";
        b2.author = "Kathy Sierra";
        b2.price = 39.99;
        b2.pages = 720;
        
        b1.display();
        b2.display();
        System.out.println();
        
        // ===== TASK 5: Car class with engine() method =====
        System.out.println("TASK 5: Car Class with engine() Method");
        System.out.println("--------------------------------------");
        
        Car c1 = new Car();
        c1.brand = "Toyota";
        c1.model = "Camry";
        c1.color = "White";
        
        Car c2 = new Car();
        c2.brand = "Honda";
        c2.model = "Civic";
        c2.color = "Black";
        
        Car c3 = new Car();
        c3.brand = "BMW";
        c3.model = "X5";
        c3.color = "Blue";
        
        c1.engine();
        c2.engine();
        c3.engine();
        System.out.println();
        
        // ===== TASK 6: Mobile class with object initialization =====
        System.out.println("TASK 6: Mobile Class - Object Initialization");
        System.out.println("--------------------------------------");
        
        Mobile m1 = new Mobile();
        m1.brand = "Samsung";
        m1.model = "Galaxy S23";
        m1.ram = 8;
        m1.rom = 256;
        m1.price = 799.99;
        
        Mobile m2 = new Mobile();
        m2.brand = "Apple";
        m2.model = "iPhone 15";
        m2.ram = 6;
        m2.rom = 128;
        m2.price = 999.99;
        
        m1.display();
        m2.display();
        System.out.println();
        
        // ===== TASK 7: Product class with 3 objects =====
        System.out.println("TASK 7: Product Class - 3 Objects");
        System.out.println("--------------------------------------");
        
        Product p1 = new Product();
        p1.name = "Laptop";
        p1.category = "Electronics";
        p1.price = 999.99;
        p1.quantity = 10;
        
        Product p2 = new Product();
        p2.name = "Mouse";
        p2.category = "Accessories";
        p2.price = 29.99;
        p2.quantity = 50;
        
        Product p3 = new Product();
        p3.name = "Keyboard";
        p3.category = "Accessories";
        p3.price = 49.99;
        p3.quantity = 30;
        
        p1.display();
        p2.display();
        p3.display();
        System.out.println();
        
        // ===== TASK 8: BankAccount class with 2 objects =====
        System.out.println("TASK 8: BankAccount Class - 2 Objects");
        System.out.println("--------------------------------------");
        
        BankAccount ba1 = new BankAccount();
        ba1.accountNumber = "ACC001";
        ba1.holderName = "Poorna";
        ba1.accountType = "Savings";
        ba1.balance = 50000.00;
        
        BankAccount ba2 = new BankAccount();
        ba2.accountNumber = "ACC002";
        ba2.holderName = "Nisha";
        ba2.accountType = "Current";
        ba2.balance = 75000.00;
        
        ba1.display();
        ba2.display();
        System.out.println();
        
        // ===== TASK 9: Student class with Parameterized Constructor =====
        System.out.println("TASK 9: Student Class - Parameterized Constructor");
        System.out.println("--------------------------------------");
        
        Student s4 = new Student("Rahul", 201, "CSE");
        Student s5 = new Student("Priya", 202, "EEE");
        
        System.out.println("Name: " + s4.name + " | RollNo: " + s4.rollNo + " | Course: " + s4.course);
        System.out.println("Name: " + s5.name + " | RollNo: " + s5.rollNo + " | Course: " + s5.course);
        System.out.println();
        
        // ===== TASK 10: Employee class with Parameterized Constructor =====
        System.out.println("TASK 10: Employee Class - Parameterized Constructor");
        System.out.println("--------------------------------------");
        
        Employee e3 = new Employee(201, "Ravi", "Software Engineer", 60000);
        Employee e4 = new Employee(202, "Anitha", "Manager", 80000);
        
        e3.displayWithDesignation();
        e4.displayWithDesignation();
        System.out.println();
        
        // ===== TASK 11: Laptop class with Parameterized Constructor =====
        System.out.println("TASK 11: Laptop Class - Parameterized Constructor (3 Objects)");
        System.out.println("--------------------------------------");
        
        Laptop l4 = new Laptop("ASUS", "ROG Strix", 32, 1024, 1999.99);
        Laptop l5 = new Laptop("Acer", "Predator", 16, 512, 1499.99);
        Laptop l6 = new Laptop("MSI", "GS66", 32, 2048, 2499.99);
        
        l4.display();
        l5.display();
        l6.display();
        System.out.println();
        
        // ===== TASK 12: Car class with Parameterized Constructor =====
        System.out.println("TASK 12: Car Class - Parameterized Constructor");
        System.out.println("--------------------------------------");
        
        Car c4 = new Car("Tesla", "Model 3", "Red", 250, 45000);
        Car c5 = new Car("Mercedes", "C-Class", "Silver", 240, 55000);
        
        c4.display();
        c5.display();
        System.out.println();
        
        // ===== TASK 13: Mobile class using 'this' keyword =====
        System.out.println("TASK 13: Mobile Class - Using 'this' Keyword");
        System.out.println("--------------------------------------");
        
        Mobile m3 = new Mobile("OnePlus", "11", 12, 256, 699.99);
        Mobile m4 = new Mobile("Google", "Pixel 8", 8, 128, 599.99);
        
        m3.display();
        m4.display();
        System.out.println();
        
        // ===== TASK 14: Product class with Total Price Calculation =====
        System.out.println("TASK 14: Product Class - Total Price Calculation");
        System.out.println("--------------------------------------");
        
        Product p4 = new Product("Pen", 2.50, 100);
        Product p5 = new Product("Notebook", 5.00, 50);
        
        p4.displayWithTotal();
        p5.displayWithTotal();
        System.out.println();
        
        // ===== TASK 15: MINI PROJECT - Student with Marks, Total, Average, Grade =====
        System.out.println("TASK 15: * MINI PROJECT - Student Report Card");
        System.out.println("======================================================");
        
        Student student1 = new Student("Nisha", 90, "ECE", 85, 90, 88);
        Student student2 = new Student("Poorna", 101, "ECE", 92, 95, 89);
        Student student3 = new Student("Gowthami", 803, "ECE", 78, 82, 75);
        
        System.out.println("--- STUDENT 1 ---");
        student1.displayWithMarks();
        System.out.println();
        
        System.out.println("--- STUDENT 2 ---");
        student2.displayWithMarks();
        System.out.println();
        
        System.out.println("--- STUDENT 3 ---");
        student3.displayWithMarks();
        System.out.println();
        
    }
}