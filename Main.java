abstract class Shop{
  private String name;
  private String location;
  public Shop(String name, String location0{
    this.name=name;
    this.location=location;
  }
  public String getName(){
    return name;
  }
  public String getLocation(){
    return location;
  }
  public abstract void displayMenu();
}

class Tea{
  private String type;
  private double price;
  public Tea(String type,double price){
    this.type=type;
    this.price=price;
  }
  public String getType(){
    return type;
  }
  public double getPrice(){
    return price;
  }
}
class TeaShop extends Shop{
  private Tea[] teas;
  public TeaShop(String name,String location,Tea[] teas){
    super(name,location);
    this.teas=teas;
  }
  public void displayMenu(){
    System.out.println("Name:" + getName() + "Location:" + getLocation());
    System.out.println("--Menu--");
    for (Tea tea:teas){
      System.out.println(tea.getType() + "- Rs." + tea.getPrice());
    }
    System.out.println("------\n");
  }
}

public class Main{
  public static void main(String args[]){
    Tea[] branch1={ new Tea("Masala Tea",20), new Tea("Allam Tea",25) };
    Tea[] branch2={ new Tea("Green Tea",40), new Tea("Lemon Tea",35) };
    TeaShop b1=new TeaShop("Chai Wala","Balapur",branch1);
    TeaShop b2=new TeaShop("Chai Wala", "Badangpet",branch2);

    b1.displayMenu();
    b2.displayMenu();
  }
}
