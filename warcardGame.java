import java.util.ArrayList;
import java.util.Scanner;
import java.util.Random;

public class warcardGame {
  
  public static void main(String[] args) {
    
    
    String line = "Welcome to my game of war. " + 
      "The rules of the game are simple " + 
      "Each player turns up a card at the same time and the player with the higher card takes both cards and puts them in their " +
      "respective decks"+
      " If the car1ds are the same rank , then another draw happens"+
      "The game is won when someone has ALL of the cards" + 
      "!!Aces are 14!!";
    
    
    System.out.println(line);
    deckCards();
    dealCards();
    dealCardscpu();
    warGamecards();
   
  }

    
    public static void randNum(){
      Random generator = new Random();
      ArrayList<Integer> numbers = new ArrayList<Integer>();   
      Random randomGenerator = new Random();
      while (numbers.size() < 52) {
        
        int random = randomGenerator .nextInt(52);
        if (!numbers.contains(random)) {
          numbers.add(random);
        }
      }
    }
  
  
  public static void deckCards(){
    ArrayList<String> deck = new ArrayList<String>();
    deck.add("Ace Of Hearts");
    deck.add("Ace Of Clubs");
    deck.add("Ace Of Spades");
    deck.add("Ace Of Diamonds");
    deck.add("2 of Hearts");
    deck.add("3 of Hearts");
    deck.add("4 of Hearts");
    deck.add("5 of Hearts");
    deck.add("6 of Hearts");
    deck.add("7 of Hearts");
    deck.add("8 of Hearts");
    deck.add("9 of Hearts");
    deck.add("10 of Hearts");
    deck.add("Jack of Hearts");
    deck.add("Queen of Hearts");
    deck.add("King of Hearts");
    deck.add("2 of Diamonds");
    deck.add("3 of Diamonds");
    deck.add("4 of Diamonds");
    deck.add("5 of Diamonds");
    deck.add("6 ofDiamonds");
    deck.add("7 ofDiamonds");
    deck.add("8 ofDiamonds");
    deck.add("9 ofDiamonds");
    deck.add("10 ofDiamonds");
    deck.add("Jack ofDiamonds");
    deck.add("Queen ofDiamonds");
    deck.add("King ofDiamonds");
    deck.add("2 of Clubs");
    deck.add("3 of Clubs");
    deck.add("4 of Clubs");
    deck.add("5 of Clubs");
    deck.add("6 of Clubs");
    deck.add("7 of Clubs");
    deck.add("8 of Clubs");
    deck.add("9 of Clubs");
    deck.add("10 of Clubs"); 
    deck.add("Jack of Clubs");
    deck.add("Queen of Clubs");
    deck.add("King of Clubs");
    deck.add("2 of Spades");
    deck.add("3 of Spades");
    deck.add("4 of Spades");
    deck.add("5 of Spades");
    deck.add("6 of Spades");
    deck.add("7 of Spades");
    deck.add("8 of Spades");
    deck.add("9 of Spades");
    deck.add("10 of Spades");
    deck.add("Jack of Spades");
    deck.add("Queen of Spades");
    deck.add("King of Spades");
    
    
  }


public static void dealCards(){

   ArrayList<String> userhand = new ArrayList<String>();
    ArrayList<String> deck = new ArrayList<String>();
   for(int a = 0; a<26; a++){
     
     String checkword = deck.get(a);
     ArrayList<String> computerhand = new ArrayList<String>();
     if(userhand.contains(checkword) == false)
       userhand.add(checkword);
   }
 }
  
 public static void dealCardscpu(){
   ArrayList<String> userhand = new ArrayList<String>();
   
    ArrayList<String> deck = new ArrayList<String>();
   for(int a = 0; a<26; a++){
     
     String checkword = deck.get(a);
     ArrayList<String> computerhand = new ArrayList<String>();
     if(userhand.contains(checkword) == false)
       computerhand.add(checkword);
   }
 }
 
 public static void warGamecards(){
   Scanner reader = new Scanner(System.in);
   ArrayList<String> userhand = new ArrayList<String>();
   Random generator = new Random();
   ArrayList<String> computerhand = new ArrayList<String>();
   while(userhand.size()>0 && computerhand.size()>0){
     int l = generator.nextInt(userhand.size()-0);
     int p = generator.nextInt(computerhand.size()-0);
     String cardone = userhand.get(l);
     String cardtwo = computerhand.get(0);
     
     System.out.println("----------------------------------------------------------------------------------------------------------");
     System.out.println("Your : " + cardone);
     System.out.println("Computer Card: " + cardtwo);
     System.out.println("");
     System.out.println("You have " + userhand.size() + " cards.");
     System.out.println("The computer has " + computerhand.size() + " cards.");
     System.out.println("");
     
     System.out.println("If your card is bigger please enter 1.");
     System.out.println("If the computer card is bigger please enter 2.");
     System.out.println("If there is a tie enter 3.");
     
    System.out.print("Enter winner: ");
     int winner = reader.nextInt();
     
     if(winner == 1){
       userhand.add(cardtwo);
       computerhand.remove(p);
     }
     
     if(winner == 2){
       computerhand.add(cardone);
       userhand.remove(l);
     }
     
   }
   
  if(userhand.size() == 0){
     System.out.println("The computer has won the game.");
     System.out.println("THANKS FOR PLAYING");
     
   }
 
 {
   if(computerhand.size() == 0){
     System.out.println("You have won the game!!!! :)");
     System.out.println("THANKS FOR PLAYING");
     
     
   }
   
 
 
 }
 
 
 }
}
 
