import java.util.Scanner;

//Daily Practice code using scanner 

class QuizMaker{

  public static void main(String[] args){

    Scanner fetch = new Scanner(System.in); //scanner in
    int score = 0; //we will use int to count score 

     System.out.println("Welcome to Pop Quiz!");
     fetch.nextLine();
     System.out.println("Here are the questions");
     fetch.nextLine();
     System.out.println("First Question");
     System.out.println("1. What is the capital of the Philippines?");//the answer is a string so we will store it in a string variable called answer1
     String answer1 = fetch.nextLine().toUpperCase(); 

     switch (answer1){
      case "MANILA":
        System.out.println("Correct!");
        score++;
        break;
        default: System.out.println("Wrong! Answer is Manila");
      
     }

     System.out.println("Second Question");
     System.out.println("2. What is the color of the sky?");  //the answer is a string so we will store it in a string variable called answer2
     String answer2 = fetch.nextLine().toUpperCase();  

     switch (answer2){
       case "BLUE":
        System.out.println("Correct!");
        score++;
        break;
        default: System.out.println("Wrong! Answer is Blue"); 
     }

     System.out.println("\nYou got " + score + " out of 2 correct!");

     


    

    


     

    
     

     

     







  }


}



  



        
        

        






    

    

    






