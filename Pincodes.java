public class Pincodes{
    static int pinCode[] = {560064,560032,560023};
    public static void main(String[] args) {
        System.out.println("Main Started");
        getPinCodes();
        System.out.println("Main ended");

    }
    public static void getPinCodes(){
        System.out.println("Start of pincodes");
        for(int pincode : pinCode){
            System.out.println("The pincodes are "+ pincode);
            System.out.println("The end of pincodes");

        }
    }
}
