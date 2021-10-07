public class Dog extends Tamagotchi
{
    public boolean licksYourFaceAfterEatingOwnPoop = true;

    public Dog(String name, int hunger, int mood, int energy, boolean licksYourFaceAfterEatingOwnPoop)
    {
        super(name, hunger, mood, energy);
        this.licksYourFaceAfterEatingOwnPoop = licksYourFaceAfterEatingOwnPoop;
    }

    @Override
    public String animalSays()
    {
        return "🐶 I SAY WOOF! 🐶";
    }

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
