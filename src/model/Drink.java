
package model;


public class Drink {
    

    private int drink_id;
    private String drink_name;
    private int quantity;
    private double price;
    private String image;
    
    
    public Drink(int drink_id, String drink_name, double price,int quantity, String image) {
        this.drink_id = drink_id;
        this.drink_name = drink_name;
        this.quantity = quantity;
        this.price = price;
        this.image = image;
    }
    
    public void setID(int id){
        this.drink_id = id;
    }
    public int getID(){
        return drink_id;
    }
    
    public void setName(String name) { 
        this.drink_name = name;
    }
    public String getName(){
        return drink_name;
        
    }
    public void setQty(int qty) { 
        this.quantity = qty; 
        
    }
    public int getQty(){
        return quantity;
    }
    public void setPrice(double price) { 
        this.price = price; 
        
    }
    public double getPrice(){
        return price;
    }
    public void setImage(String image) { 
        this.image = image;
    }
    public String getImage(){
        return image;
    }
}



