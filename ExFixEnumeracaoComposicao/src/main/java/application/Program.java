package application;

import enums.OrderStatus;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Scanner;
import model.entites.Client;
import model.entites.Order;
import model.entites.OrderItem;
import model.entites.Product;

public class Program {
    
    public static void main(String[] args) throws ParseException{
        
        Scanner sc = new Scanner(System.in);
        SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy");
        
        System.out.println("Enter Cliente data: ");
        System.out.println("Name: ");
        String name = sc.nextLine();
        System.out.println("Email: ");
        String email = sc.nextLine();
        System.out.println("Birth date (DD/MM/YYYY): ");
        Date birthDate = sdf.parse(sc.next());
        
        Client client = new Client(name, email, birthDate);
        
        System.out.println("Enter order data: ");
        System.out.println("Satus: ");
        OrderStatus status = OrderStatus.valueOf(sc.next());
        
        Order order = new Order(new Date(), status, client);
        
        System.out.println("How many items to this order? ");
        int n = sc.nextInt();
        
        for(int i = 1; i<=n; i++) {
            System.out.println("Enter #" + i + " item data: ");
            System.out.println("Product name: ");
            sc.nextLine();
            String prodName = sc.nextLine();
            
            System.out.println("Product price: ");
            double prodPrice= sc.nextDouble();
            
            Product prod1 = new Product(prodName, prodPrice);   
            
            System.out.println("Quantity: ");
            int quantity = sc.nextInt();
            
            OrderItem orderItem = new OrderItem(quantity, prodPrice, prod1);
            
            order.addItem(orderItem);
            
        }
        
            System.out.println();
            System.out.println("ORDER SUMARY:");
            System.out.println(order);
        
        
        
        
        
        
        
        
        
        sc.close();
    }
    
}
