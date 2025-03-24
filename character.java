public class character{
    static char letters[]={'A','B','C','D','E','F','G','H','I','J'};
    public static void main(String[] args) {
        System.out.println("Main started");
        getLetters();
        System.out.println("main ended");

    }
    public static void getLetters(){
        for(char words : letters){
            System.out.println("The letter is "+words);

        }
    }

}