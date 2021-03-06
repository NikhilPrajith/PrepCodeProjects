import java.util.Scanner;
public class GuessingGame {
  
  public static int level =0;
  private static int randomNumber = 0;
  public static int totalTries = 0;
  public static int guess =0;
  private static Scanner input = new Scanner(System.in);

  
  public static void main(String[] args) { 
    System.out.println("Welcome to the guessing game!" + "\n");
    System.out.println("1. Beginner Level(numbers between 1 and 10)");
    System.out.println("2. Intermediate Level(numbers between 1 and 100)");
    System.out.println("3. Advanced Level(numbers between 1 and 1000)");
    System.out.println("4. Expert Level(numbers between 1 and 10,000)" + "\n");
    
    System.out.println("What level would you like to take on today?");
    
    boolean correct = false;
    int low = 0;
    int high = 0;
    level = input.nextInt();    
    while(!isValid(level , guess, low, high) ){
      level = input.nextInt(); 
      
    }
    
    System.out.println("Welcome to level " + level);
    high = (int)(Math.pow(10,level));
    low =1;
    
    randomNumber = (int)(Math.random() * high) + low;
    System.out.println("Now guess a number between " + low + " and " + high);
    request(input, low, high);
  }
  
  public static boolean isValid(int levelChoice, int num , int low2, int high2){
    if((levelChoice>4 || levelChoice<1) || (num < low2 || num > high2)){
      System.out.println("Invalid, Enter again:");
      return false;
    }else{
      return true;
    }
  }  
  
  public static void request(Scanner scanner, int lowBound, int highBound){
    guess = scanner.nextInt();
    boolean check = isValid(level, guess, lowBound, highBound);
    if(check == false){
      request(input, lowBound, highBound);
    }else{
      checkGuess(lowBound, highBound);
    }
  }
  
  public static void checkGuess(int lowBound, int highBound){
    totalTries +=1; 
    if(guess == randomNumber){
      
      System.out.println("Congratulation, you guess it right in " + totalTries + " tries!");
      System.out.println("\n" + "Would you like to play again(Type yes or no)?");
      Scanner choice = new Scanner(System.in);
      String choice1 = choice.nextLine();
      if ( choice1.equals("yes")){
        playAgain(); 
      }else{
        System.out.println("Thank You For Playing");
      }
    }else if(guess < randomNumber){
      System.out.println("Too Low! Guess again!");
      request(input, lowBound, highBound);               
    }else if(guess > randomNumber){
      System.out.println("Too High! Guess again!");
      request(input, lowBound, highBound);
    }
    
  }
  
  public static void playAgain(){
    System.out.println("Welcome to level " + level);
    totalTries=0;
    int highRe = (int)(Math.pow(10,level));
    int lowRe =1;
    randomNumber = (int)(Math.random() * highRe) + lowRe;
    System.out.println("Now guess a number between " + lowRe + " and " + highRe);
    request(input, lowRe, highRe);
  }

}
