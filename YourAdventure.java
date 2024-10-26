import java.util.Scanner;

public class YourAdventure
{
  public static void main(String[] args) 
  {
    Scanner scanner = new Scanner(System.in);
    int sanity = 100;

    while (sanity != 0) {
      String openingText = "You cautiously meandered through the ominous dungeon while trying to find your cat companion. You can hear your rhythmic footsteps and the soft droplets falling from the overgrown vegetation. It was mostly quiet, but there was also something else--a distant tapping noise that seems to be nearing you. ";
      
      String choice1 = "\n (1) Run the opposite direction of the sound. \n (2) Approach the sound. \n (3) Hide. ";
      
      System.out.println(openingText + choice1);
      String choice1Input1 = scanner.nextLine();
      
    if (choice1Input1.equals("1")) {
          System.out.println("test1");
    }
    else if (choice1Input1.equals("2")) {
          System.out.println("test2");
    }
    else if (choice1Input1.equals("3")) {
        System.out.println("test3");
    }
    else {
        System.out.println("Please enter options 1, 2, or 3");
    }
      
    break; 

    }

  }
}