public class Dmart {
    static String groceries[]={"milk","butter","curd","cheese","meat","yogurt","ice cream","spinach","brocolli","tomato"};
    static String perfume[]={"dior", "fog", "denver", "channel", "gucci", "Versace", "prada", "creed aventus", "bleu de channel", "langda"};
    static String biscuit[]={"milk bikis", "Dark fantasy", "good day", "nice time", "bourbon", "parle g", "sunfeast", "marie", "maska chaska", "hideandseek"};
    static String utensils[]={"spoon", "fork", "knife", "cooker", "chopsticks", "bowls", "cutting board", "baking tray", "rolling pin", "trays"};
    static String vegetables[]={"tomato", "potato", "betroot", "cabbage", "onion", "cauliflower", "mushroom", "ladiesfinger", "beans", "carrot"};
   public static void main(String[] args) {
    System.out.println("Main Started");
        nameGroceries();
    System.out.println("Main ended");




    }
    public static void nameGroceries(){
        System.out.println("groceries start");
        for(String food : groceries){
            System.out.println("The groceries are "+food);
    
        }
        System.out.println("Groceries end");
        System.out.println("perfume start");
        for(String perf : perfume){
            System.out.println("The perfumes are "+perf);
            
        }
        System.out.println("perfume end");
        System.out.println("Biscuit start");
        for(String bisc: biscuit){
            System.out.println("The biscuits are "+bisc);
        }
        System.out.println("biscuit end");
        System.out.println("utensil start");

        for(String uten : utensils){
            System.out.println("The utensils are "+uten);

        }
        System.out.println("utensil end");
        System.out.println("vege start");
        for(String vege : vegetables){
            System.out.println("The vegetables are "+vege);
        }
        System.out.println("vege end");
        
    

    }
    
}
