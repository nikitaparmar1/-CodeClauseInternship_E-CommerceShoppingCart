import java.util.List;
import java.util.ArrayList;
public class Cart {
    private List<Product> cartItems;
public Cart()
{
    cartItems=new ArrayList<>();
}
public void addProduct(Product product,int quantity)
{
    for(Product p:cartItems)
    {
        if(p.getId().equals(product.getId()))
        {
            p.setQuantity(p.getQuantity()+quantity);
            return;
        }
    }
    Product newProduct=new Product(product.getId(), product.getName(),quantity,product.getPrice());
    cartItems.add(newProduct);
}
public void removeProduct(String productId)
{
    if(cartItems.isEmpty())
    {
        System.out.println("Cart is empty");
    }
    else{
        cartItems.removeIf(product->product.getId().equals(productId));
        System.out.println("productid="+productId+" "+"has been removed from cart");
    }
}
public void viewCart()
{
    if(cartItems.isEmpty())
    {
        System.out.println("cart is empty");
    }
    else{
        for(Product p:cartItems)
        {
            System.out.println(p);
        }
    }

}
public double checkout()
{ double totalAmount=0;
    if(cartItems.isEmpty())
    {
        System.out.println("Cart is empty");
        return totalAmount;
    }
    else
    {
        for (Product product : cartItems) {
            totalAmount += product.getPrice() * product.getQuantity();
     return totalAmount;   }
    }
    return totalAmount;
}

}
