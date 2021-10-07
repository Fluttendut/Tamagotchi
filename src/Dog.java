public class Dog extends Tamagotchi
{
    ////unique boolean that tells that the dog licks your face after eating own poop ;)
    public boolean licksYourFaceAfterEatingOwnPoop = true;

    public Dog(String name, int hunger, int mood, int energy, boolean licksYourFaceAfterEatingOwnPoop)
    {
        super(name, hunger, mood, energy);
        this.licksYourFaceAfterEatingOwnPoop = licksYourFaceAfterEatingOwnPoop;
    }

    ////Override that lets the animal say woof.
    @Override
    public String animalSays()
    {
        return "🐶 I SAY WOOF! 🐶";
    }

    ////Override that lets me give the stats to the user when printing in my game main.
    @Override
    public String toString()
    {
        return "Dog{" +
                "name = '" + name + '\'' +
                ", hunger = " + hunger +
                ", mood = " + mood +
                ", energy = " + energy +
                ", licks your face after eating own poop =" + " might be " + licksYourFaceAfterEatingOwnPoop + " 😳 Ohh no..." +
                '}';
    }
}
