import java.util.Scanner;

public class YourAdventure
{
  public static void main(String[] args) 
  {
    Scanner scanner = new Scanner(System.in);
    int sanity = 100;
    int stamina = 100;

    String openingText = "You cautiously meander through the ominous abandoned school while trying to find your cat companion. You can hear your rhythmic footsteps and the soft droplets falling from the overgrown vegetation. It was mostly quiet, but there was also something else--a distant tapping noise that seems to be nearing you. \n";
    
    System.out.println(openingText);
    System.out.println("Sanity: " + sanity + "%");
    System.out.println("Stamina: " + stamina);
        
    String firstChoice = "\n (1) Run in the opposite direction of the sound. \n (2) Approach the sound. \n (3) Hide. ";
    System.out.println(firstChoice);
    String firstChoiceInput1 = scanner.nextLine();

    while (sanity != 0 && stamina != 0) {
          
        if (firstChoiceInput1.equals("1")) {
            String firstChoiceInput1OptionA = "\nYou immediately bolted, running away from the sound.";
            System.out.println(firstChoiceInput1OptionA);
            sanity -= 5;
            stamina -= 35;
            System.out.println(" \nSanity: " + sanity + "%");
            System.out.println("Stamina: " + stamina);
            
            String secondText = "\nYou start to feel your energy depleting, but the tapping sound still seems to be pursing you.";
            String secondChoice = "\n (1) Continue running. \n (2) Stop and catch your breath.";
            System.out.println(secondText);
            System.out.println(secondChoice);
            String secondChoiceInput2 = scanner.nextLine();
                if (secondChoiceInput2.equals("1")) {
                    String secondChoiceInput2OptionA = "\nYou continue running, making rapid turns in hopes to lose the stalker, to no avail.";
                    System.out.println(secondChoiceInput2OptionA);
                    sanity -= 20;
                    stamina -= 35;
                    System.out.println(" \nSanity: " + sanity + "%");
                    System.out.println("Stamina: " + stamina);
                    String thirdChoice = "\n (1) Continue running. \n (2) Stop and catch your breath.";
                    String thirdChoiceInput3 = scanner.nextLine();
                break;
                }
                else if (secondChoiceInput2.equals("2")) {
                    String secondChoiceInput2OptionB = "\nYou stop to catch your breath, but the sound caught up to you. Before you could start running again, it had already enveloped you.";
                    System.out.println(secondChoiceInput2OptionB);
                    sanity -= 95;
                    stamina += 15;
                    System.out.println(" \nSanity: " + sanity + "%");
                    System.out.println("Stamina: " + stamina);
                    System.out.println("\nBad Ending (#2)");
                }
        }
        else if (firstChoiceInput1.equals("2")) {
            sanity -= 0;
            stamina -= 5;
            System.out.println(" \nSanity: " + sanity + "%");
            System.out.println("Stamina: " + stamina);
            System.out.println("Good Ending (#1)");
            String firstChoiceInput1OptionB = "\nAs you approach the sound, you see a small, four-legged furry figure. It was your cat! You picked him up and strolled out of the school safely, feeling very satisfied.";
            System.out.println(firstChoiceInput1OptionB);
        break;
        }
        else if (firstChoiceInput1.equals("3")) {
            sanity -= 25;
            stamina -= 10;
            String firstChoiceInput1OptionC = "\n There are no good hiding spots. Classrooms were all wide open and in shambles. You quickly turned into a narrow hallway and found a locker still intact. You cringed at the loud creaking, knowing whatever is following definately heard it. The tapping was growing louder, and you didn't have any other options.";
            System.out.println(firstChoiceInput1OptionC);
            System.out.println(" \nSanity: " + sanity + "%");
            System.out.println("Stamina: " + stamina);
        break;
            
        }
        else {
            System.out.println("Please enter options 1, 2, or 3");
        }

    }
  }
}