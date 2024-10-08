import java.util.Scanner;
import java.util.Random;

class Game{

    public int noOfGuesses;
    public int number;
    public int inputNumber;

    public int getNoOfGuesses(){
        return noOfGuesses;
    }
    public void setNumberOfGuesses(int noOfGuesses){
        this.noOfGuesses=noOfGuesses;
    }
    Game(){
        Random rand = new Random();
        this.number = rand.nextInt(100);
    }
    void takeUserInput(){
        System.out.println("Please enter the no here");
        Scanner sc = new Scanner(System.in);
        inputNumber =sc.nextInt();
    }
    boolean isCorrectNumber(){
        noOfGuesses ++;
        if(number==inputNumber){
            System.out.format("You are right it was %d \n and finished in %d attempt "+ noOfGuesses,number);
return true;

        }
        else if(inputNumber>number) {
            System.out.println("Too high");
        } else if (inputNumber<number) {
            System.out.println("Too low");
        }
        return false;
    }
}










public class GuessTheNumber {
    public static void main(String[] args) {
        Game g = new Game();
        boolean b = false;
        while (!b) {
            g.takeUserInput();
            b=g.isCorrectNumber();
            System.out.println(b);
        }
    }
}