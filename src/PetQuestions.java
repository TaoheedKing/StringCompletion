import java.util.Scanner;
public class PetQuestions {
        public static void main( String[] args )
        {
            Scanner keyboard = new Scanner(System.in);
            String name;
            String breed;
            int age;

            System.out.print( "Greetings. \nWhat is your pet's name?\n " );
            name = keyboard.nextLine();
            System.out.print( "What kind of animal is " + name + "? \n" );
            breed = keyboard.nextLine();
            System.out.print( "How old is " + name + "? \n");
            age = keyboard.nextInt();
            System.out.println( name + " is your " + breed + " and it is " + age + " years old." );
        }
    }
