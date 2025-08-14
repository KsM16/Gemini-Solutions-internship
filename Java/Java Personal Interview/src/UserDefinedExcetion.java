// Exception Handling in java : User-defined Exceptions

public class UserDefinedExcetion {
    public static void main(String[] args) {

        Dog d =new Dog();
        int inputAge = d.AGE;

        try{
            System.out.println("Checking age");
            checkAge(inputAge);
        }
        catch (AgeException e){
            System.out.println("Caught Exception : "+e.getMessage());
        }
        catch (Exception e){
            System.out.println("Generic Exception caught :"+ e.getMessage());
        }
        finally{
            System.out.println("");
        }

    }
    public static void checkAge(int age) throws  AgeException{
        if (age >= 18){
            System.out.println("Your are adult");
        }else{
            // throw our built-in exception
            throw new AgeException("you are not Adult");
        }
    }

}

// extending the Exception  class for our User-defined Exception
class AgeException extends Exception{
    public AgeException(String message){
        super(message);
    }
}


