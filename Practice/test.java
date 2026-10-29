class fruit{
    int price;
    int quantity;
   public String name;

   public void eat(){
    System.out.println("Eat fruit to gain vitamin");
   }
}
class mango extends fruit{
    public void eat(){
        System.out.println("Eat mango");
    }
}
class papaya extends fruit{
    public void eat(){
        System.out.println("eat papaya");
    }

    
}
class test{
    public static void main(String[] args) {
        mango m = new mango();
        m.name="Mango friut";
        m.price=52;
        m.eat();
    }
    }
