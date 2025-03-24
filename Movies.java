public class Movies {
    static String hindi[]={"farzi","thefamilyman","patallok","specialops","sacredgames","cid","Breathe","mirzapur","taza kabar","callmebae"};
    static String english[]={"breakingbad","sherlock","moneyheist","strangerthings","gameofthrones","blackmirror","peakyblinders","theboys","westworld"};
    static String kannada[]={"Bigboss", "Nandhini", "honeymoon","hara hara mahadeva", "malgudi days", "asse", "devate", "mahanati", "satya", "nagini"};
    public static void main(String[] args) {
        getSeries();
       
}
public static void getSeries(){
    
    for(String series : hindi){
        System.out.println("The hindi series are "+series);
    }
        
      for(String kSeries : kannada){
        System.out.println("The kannada series are "+kSeries);
       
      }
        for(String eSeries : english){
        System.out.println("The english series are "+eSeries);
        }
       

    }    
    }

    