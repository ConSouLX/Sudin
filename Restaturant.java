public class Restaturant {
    static String menu[] = {"Friedrice", "Paneer", "Gobi" , "Vadapav" ,"Idli", "Dosa", "puri", "chutney" ,"Mushroom","setdosa"};
    public static void main(String[] args) {
        System.out.println("Main started");
        getMenu();
        System.out.println("Main ended");

    }
    public static void getMenu(){
        for(String food : menu){
            System.out.println("The restaurants menu is "+food);

        }
        
        }
    }