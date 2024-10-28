import java.util.Scanner;

public class YourAdventure
{
  public static void main(String[] args) 
  {
    Scanner scanner = new Scanner(System.in);
    int sanity = 100;
    int stamina = 100;

    String openingText = "\nYou cautiously meander through the ominous abandoned school while trying to find your cat companion. You can hear your rhythmic footsteps and the soft droplets falling from the overgrown vegetation. It was mostly quiet, but there was also something else--a distant tapping noise that seems to be nearing you.  \n";
    
    System.out.println("Sanity: " + sanity + "%");
        System.out.println("Stamina: " + stamina);
        
        String firstChoice = "\n (1) Run the opposite direction of the sound. \n (2) Approach the sound. \n (3) Hide. ";
          
        System.out.println(openingText + firstChoice);
        String firstChoiceInput1 = scanner.nextLine();

    while (sanity != 0 && stamina != 0) {
          
        if (firstChoiceInput1.equals("1")) {
            String firstChoiceInput1OptionA = "\nYou immediately bolted, running away from the sound.";
            System.out.println(firstChoiceInput1OptionA);
            sanity -= 5;
            sanity -= 50;
            System.out.println(" \nSanity: " + sanity + "%");
            System.out.println("Stamina: " + stamina);
            
            String secondText = "";
            String secondChoice = "silly 1, 2, 3";
            System.out.println(secondChoice);
            String secondChoiceInput2 = scanner.nextLine();
                if (secondChoiceInput2.equals("1")) {
                    System.out.println("test1");
                    break;
                }
                else if (secondChoiceInput2.equals("2")) {
                    System.out.println("test2");
                    break;
                }
                else if (secondChoiceInput2.equals("3")) {
                    System.out.println("test3");
                    break;
                }
        }
        else if (firstChoiceInput1.equals("2")) {
            sanity -= 0;
            stamina -= 5;
            String firstChoiceInput1OptionB = "\nAs you approach the sound, you see a small, four-legged furry figure. It was your cat! You picked him up and strolled out of the school safely, feeling very satisfied.";
            System.out.println(firstChoiceInput1OptionB);
            System.out.println(" \nSanity: " + sanity + "%");
            System.out.println("Stamina: " + stamina);
            System.out.println("Good Ending (#1)");
        break;
        }
        else if (firstChoiceInput1.equals("3")) {
            String firstChoiceInput1OptionC = "\n There are no good hiding spots. Classrooms were all wide open and in shambles. You turned into a narrow hallway and found a locker still intact. You cringed at the loud creaking, knowing whoever is following definately heard it. The tapping was growing louder, and you didn't have any other options.";
            System.out.println(firstChoiceInput1OptionC);
            
        }
        else {
            System.out.println("Please enter options 1, 2, or 3");
        }

    }
  }
}