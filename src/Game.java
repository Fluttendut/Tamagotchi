import java.util.Random;
import java.util.Scanner;

public class Game
{

    public static void main(String[] args)
    {
        // Do I need to make another type of override for the child classes?
        // Need to loop the 'if' statements so the Tamagotchi can do multiple actions.
        // Need to draw a class diagram of all your classes and create a sequence diagram of one specific use case.
                

        Scanner sc = new Scanner(System.in);


        System.out.println("You need to pick a Tamagotchi. Please press 1 for cat and 2 for dog");
        int tamagotchiChoice = sc.nextInt();
        System.out.println("Please type in a name for your Tamagotchi");
        String extraLine = sc.nextLine();
        String tamagotchiName = sc.nextLine();

        int statOne = randomNumber();
        int statTwo = randomNumber();
        int statThree = randomNumber();
        boolean run = true;

            if (tamagotchiChoice == 1) {
                Cat pet1 = new Cat(tamagotchiName, statOne, statTwo, statThree, true);
                System.out.println("You have picked " + pet1 + "\n10 mood means your pet is having lots of fun\n10 hunger means your pet is full\n10 energy means your pet has very much energy");
                System.out.println("Do you want to: \nPlay with " + tamagotchiName + " - press 1\nFeed " + tamagotchiName + " - press 2\nLet " + tamagotchiName + " take a nap - press 3");

                while (run == true) {
                    int firstChoice = sc.nextInt();

                    if (firstChoice == 1) {
                        pet1.play();
                        System.out.println("You played with " + tamagotchiName + ". \nHunger is decreased with 2 points   " + tamagotchiName + " is getting more hungry\nMood is increased with 2 points 😁 " + tamagotchiName + " is happier\n" + "Energy is decreased with 2 points ⚡ " + tamagotchiName + " is getting tired\n" + tamagotchiName + "'s new stats are\n" + pet1);
                        System.out.println(pet1.animalSays());
                    }
                    if (firstChoice == 2) {
                        pet1.feed();
                        System.out.println("You fed " + tamagotchiName + ". \nHunger is increased with 2 points 🍗 " + tamagotchiName + " is now less hungry\nEnergy increased with 2 points ⚡" + tamagotchiName + " is more energetic\n\n" + tamagotchiName + "'s new stats are\n" + pet1);
                        System.out.println(pet1.animalSays());
                    }
                    if (firstChoice == 3) {
                        pet1.sleep();
                        System.out.println("You let " + tamagotchiName + " nap. \nEnergy is increased with 2 points ⚡ " + tamagotchiName + " is more energetic\n\n" + tamagotchiName + "'s new stats are\n" + pet1);
                        System.out.println(pet1.animalSays());

                    }
                }

            }
            if (tamagotchiChoice == 2) {
                Dog pet2 = new Dog(tamagotchiName, statOne, statTwo, statThree, true);
                System.out.println("You have picked " + pet2 + "\n10 mood means your pet is having lots of fun\n10 hunger means your pet full\n10 energy means your pet has very much energy");
                System.out.println("Do you want to: \nPlay with " + tamagotchiName + " - press 1\nFeed " + tamagotchiName + " - press 2\nLet " + tamagotchiName + " take a nap - press 3");

                while (run == true) {

                    int firstChoice = sc.nextInt();

                if (firstChoice == 1) {
                    pet2.play();
                    System.out.println("You played with " + tamagotchiName + ". \nHunger is decreased with 2 points   " + tamagotchiName + " is getting more hungry\nMood is increased with 2 points 😁 " + tamagotchiName + " is happier\n" + "Energy is decreased with 2 points ⚡ " + tamagotchiName + " is getting tired\n" + tamagotchiName + "'s new stats are\n" + pet2);
                    System.out.println(pet2.animalSays());
                }
                if (firstChoice == 2) {
                    pet2.feed();
                    System.out.println("You fed " + tamagotchiName + ". \nHunger is increased with 2 points 🍗 " + tamagotchiName + " is now less hungry\nEnergy increased with 2 points ⚡" + tamagotchiName + " is more energetic\n\n" + tamagotchiName + "'s new stats are\n" + pet2);
                    System.out.println(pet2.animalSays());
                }
                if (firstChoice == 3) {
                    pet2.sleep();
                    System.out.println("You let " + tamagotchiName + " nap. \nEnergy is increased with 2 points ⚡ " + tamagotchiName + " is more energetic\n\n" + tamagotchiName + "'s new stats are\n" + pet2);
                    System.out.println(pet2.animalSays());

                }
            }
        }
    }

    //Private because it is only using its own variables.
    private static int randomNumber()
    {
        Random random = new Random();
        int min = 0;
        int max = 11;
        int randomNumber = random.nextInt(max + min) + min;
        return randomNumber;

    }

}


