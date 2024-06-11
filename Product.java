class Product
{
    String id,name;
    int quantity;
    double price;
    public Product(String id,String name,int quantity,double price)
    {
        this.id=id;
        this.name=name;
        this.quantity=quantity;
        this.price=price;
    }
    public String getId()
    {
        return id;
    }
    public String getName()
    {
        return name;
    }
    public double getPrice(){
        return price;
    }
    public int getQuantity()
    {
        return quantity;
    }
    public void setQuantity(int quantity)
    {
        this.quantity=quantity;
    }
    public String toString()
    {
        return "product [id="+ id+",name="+name+",price="+price+",qunatity="+quantity+"]";
    }
}