import java.util.Scanner;

class Details {
    int p_id;
    String p_name;
    int p_price;

    void proFun() {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter the P_ID : ");
        p_id = input.nextInt();
        input.nextLine(); // Consume the newline character left by nextInt()
        System.out.println("Enter the P_Name : ");
        p_name = input.nextLine();
        System.out.println("Enter the P_price : ");
        p_price = input.nextInt();
        
        input.close(); // Close the Scanner object
    }
}

public class Product {
    public static void main(String[] args) {
        Details p1 = new Details();
        p1.proFun();
        // Details p2 = new Details();
        // p2.proFun();
        // Details p3 = new Details();
        // p3.proFun();

        System.out.println("Details of Product 1:");
        System.out.println("ID: " + p1.p_id);
        System.out.println("Name: " + p1.p_name);
        System.out.println("Price: " + p1.p_price);
    }
}
