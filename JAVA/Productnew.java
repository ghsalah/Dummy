class Details {
    int p_id;
    String p_name;
    int p_price;

    void proFun(int a, String b, int c) {
        p_id = a;
        p_name = b;
        p_price = c;
    }
}

public class Productnew {
    public static void main(String[] args) {
        Details p1 = new Details();
        Details p2 = new Details();
        Details p3 = new Details();
        
        p1.proFun(1, "Banana", 34);
        p2.proFun(2, "Apple" , 50);       
        p2.proFun(3, "Orange", 40);

        System.out.println("Details of Product 1:");
        System.out.println("ID: " + p1.p_id);
        System.out.println("Name: " + p1.p_name);
        System.out.println("Price: " + p1.p_price);

        System.out.println("Details of Product 2:");
        System.out.println("ID: " + p2.p_id);
        System.out.println("Name: " + p2.p_name);
        System.out.println("Price: " + p2.p_price);

        System.out.println("Details of Product 2:");
        System.out.println("ID: " + p3.p_id);
        System.out.println("Name: " + p3.p_name);
        System.out.println("Price: " + p3.p_price);
    }
}
