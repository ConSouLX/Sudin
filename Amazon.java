class Amazon{

//instance variables
int id;
String firstName;
String lastName;
String passWord;
long phoneNumber;


//no args constructor
Amazon()
{
	this("Harshi","S","hat@45");
System.out.println("Amazon constructor is invoked");
}

//parameterized constructor
Amazon(String firstName,String lastName,String passWord)
{
this(5182927L);
System.out.println("Amazon constructor with string,string,string");
this.firstName = firstName;
this.lastName = lastName;
this.passWord = passWord;
}

Amazon(long phoneNumber)
{
	this(1);
System.out.println("Amazon constructor with long");
this.phoneNumber = phoneNumber;

}

Amazon(int id)
{
System.out.println("Amazon constructor with int");
this.id = id;

}

public void displayUserDetails()
{

System.out.println("User id : " +id);
System.out.println("User firstName : " +firstName);
System.out.println("User lastName : " +lastName);
System.out.println("User passWord : " +passWord);
System.out.println("User phoneNumber : " +phoneNumber);

}
}