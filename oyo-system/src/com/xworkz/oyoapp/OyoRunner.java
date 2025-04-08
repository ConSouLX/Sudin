import com.xworkz.oyoapp.OyoDto;
import com.xworkz.oyoapp.oyogenerator.Oyo;

public class OyoRunner {

    public static void main(String[] args){

        System.out.println("MAIN STARTED");

        OyoDto oyoDto=new OyoDto();

        oyoDto.setFullName("sudin");
        oyoDto.setMobileNumber("9876543210");
        oyoDto.setEmail("sudin@gmail.com");
        oyoDto.setPassword("sudin");
        oyoDto.setReEnterPassword("sudin");
        oyoDto.setCountry("India");

        Oyo oyo=new Oyo();
        oyo.createAccount(oyoDto);

        System.out.println("full name is "+oyoDto.getFullName());
        System.out.println("mobile number is "+oyoDto.getMobileNumber());
        System.out.println("email is "+oyoDto.getEmail());

        System.out.println("MAIN ENDED");
    }
}

