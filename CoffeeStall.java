public class CoffeeStall {
    static String name = "Sudin coffee stall";
    public static void main(String[] args) {
        System.out.println("The coffee stall name is "+name);
        System.out.println("After rename");
        updateName();
        System.out.println("The new stall name is "+name);

    }
    public static void updateName(){
         name = "Ronaldo Coffee stall";
    }
    
}
