public class CalculatorRun {
    public static void main(String[] args) {
      int number = 55;
      int number2 = 55;
       
       int addValue = Calculator.add(number,number2);
       System.out.println("The addition of "+ " "+number+ " + "+number2+ " "+" is "+ addValue);
       int multiValue = Calculator.multiply(number, number2);
       System.out.println("The multiplication of two numbers "+" "+number+" * "+number2+" "+" is "+multiValue);
       int subValue = Calculator.subtract(number, number2);
       System.out.println("the subtraction of number "+" "+number+" - "+number2+" is "+subValue);
       int divValue = Calculator.divison(number, number2);
       System.out.println("The Division of number "+" "+number+" / "+number2+" "+" is "+divValue);

       

       

       

        
    
    }
    
}
