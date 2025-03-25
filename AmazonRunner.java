class AmazonRunner
{
public static void main(String args [])
{
	//copy of amazon class
	//allocate a memory (heap)
	// classname ref = new constructor();
	
	
	Amazon ref = new Amazon();
	ref.id = 1;
	ref.yourName = "Pavithra";
	ref.phoneNumber = 9880478053L;
	ref.password = "Biryani@01";
	System.out.println("The Account ID is" + ref.id);
	System.out.println("The Account UserName is" + ref.yourName);
	System.out.println("The Account User phoneNumber is" + ref.phoneNumber);
	System.out.println("The Account User password is" + ref.password);
	
	Amazon anotherRef =new Amazon();
	anotherRef.id = 2;
	anotherRef.yourName = "Punya";
	anotherRef.phoneNumber = 8618562005L;
	anotherRef.password = "amma@01";
	System.out.println("The Account ID is" + anotherRef.id);
	System.out.println("The Account UserName is" + anotherRef.yourName);
	System.out.println("The Account User phoneNumber is" + anotherRef.phoneNumber);
	System.out.println("The Account User password is" + anotherRef.password);
	
	}}
	