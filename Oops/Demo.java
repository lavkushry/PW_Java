package Oops;

class LavkushException extends Exception{
    LavkushException(String s){
        super(s);
    }
}
public class Demo {
    public static void main(String[] args) {
        int i=0;
        int j=0;
        try{
            j = 10/i;
            if(i==0){
                throw new LavkushException("Divide by zero");
                }
        }
        catch(LavkushException e){
            System.out.println("Lavkush Exception caught: " + e.getMessage());
        }
        
  }
}