import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        Cart cart=new Cart();
        // sample products
        Product product1=new Product("1", "Watch", 20,1500.0);
        Product product2=new Product("2", "laptop", 10, 80000.0);
        Product product3=new Product("3", "Smartphones", 50,15000.0);
        Product product4=new Product("4", "HeadPhones", 30, 2000.0);
        Product product5=new Product("5", "SmartTv", 20, 25000.0);
        System.out.println("1. view products");
            System.out.println("2. Add product to cart");
            System.out.println("3. Remove item from cart");
            System.out.println("4. view cart");
            System.out.println("5. checkout");
            System.out.println("6. Exit");

        
        while(true)
        {
            System.out.println("Enter your choice");
            int choice=sc.nextInt();
            switch (choice) {

                case 1:
                       System.out.println(product1);
                       System.out.println(product2);
                       System.out.println(product3);
                       System.out.println(product4);
                       System.out.println(product5);
                    
                    break;
                case 2:
                   System.out.println("Enter productId to add product in cart");
                  String addId=sc.next();
                  System.out.println("Enter Quantity");
                  int addQunatity=sc.nextInt();
                  if(addId.equals(product1.getId()))
                  {
                    cart.addProduct(product1,addQunatity);
                  }
                  else if(addId.equals(product2.getId()))
                  {
                    cart.addProduct(product2, addQunatity);
    
                  }
                  else if(addId.equals(product3.getId()))
                  {
                    cart.addProduct(product3, addQunatity);
                  }
                  else if(addId.equals(product4.getId()))
                  {
                    cart.addProduct(product5,addQunatity);
                  }
                  else
                  {
                    System.out.println("cart is empty");
                  }
                     break;
                case 3:
                   System.out.println("Enter productId to remove from cart");
                   String productId=sc.next();
                   cart.removeProduct(productId);
                     break;
                case 4:
                   cart.viewCart();
                     break;
                case 5:
                 System.out.println(cart.checkout());
                 System.out.println("thankyou for visiting");

                    break;
               
                default:
                   System.out.println("you have eterd wrong choice");
                    break;
            }
           
        }
     
    }

}
