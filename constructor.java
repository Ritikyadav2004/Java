import java.util.Scanner;

class Parent {  
    String name = "Ritik Yadav";
    Parent(String name) {   
        this.name = name;
        System.out.println(name);
    }
}

public class constructor {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in); // Renamed variable
        String input = scanner.next();           // Renamed variable
        scanner.close();
        
        Parent p1 = new Parent(input);           // Updated class name
        System.out.println(p1.name);
    }
}
