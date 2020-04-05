public class FizzBuzz2 {
    private int currentNumber;
    
    public FizzBuzz2(int startNumber){
        currentNumber = startNumber;
    }
    
    public String fizzbuzz2(){
        if(currentNumber % 3 == 0 && currentNumber % 5 == 0){
            return "FizzBuzz";
        }
        if(currentNumber % 3 == 0){
            return "Fizz";
        }
        else if(currentNumber % 5 == 0){
            return "Buzz";
        }
        else{
            return Integer.toString(currentNumber);
        }
    }
}
