import java.util.Scanner;

//Daily Practice code using scanner and switch case statements

class FavoriteMoviesArchive{

    public static void main(String[] args){

        Scanner fetch = new Scanner(System.in);

        System.out.println("You opened your movies file");
        System.out.println("These are the available movies in your file");
        System.out.println("1. Mean Girls");
        System.out.println("2.Barbie");
        System.out.println("3.Mickey Mouse");
        System.out.println("4.Horror Movie");
        System.out.println("5.Romance Movie");
      

        String[] movies = {"Mean Girls", "Barbie", "Mickey Mouse", "Horror Movie", "Romance Movie"};

          System.out.print("You have chosen: ");
          int first =  fetch.nextInt();
       

          System.out.println("You have chosen: "+ movies[first - 1]);

          System.out.println("Please choose the next movie that you want to watch");




          System.out.print("You have chosen: ");
          int second =  fetch.nextInt();

          System.out.println("You have chosen: "+ movies[second - 1]);

          System.out.println("Enjoy watching "+  movies[first - 1] +" and "+ movies[second - 1]);

          System.out.println("Thank you for using our system!");



          fetch.close();
           


        }



        
        

        






    }

    

    






