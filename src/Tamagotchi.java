public class Tamagotchi
{
    public String name;
    public int hunger;
    public int mood;
    public int energy;

    public Tamagotchi(String name, int hunger, int mood, int energy)
    {
        this.name = name;
        this.hunger = hunger;
        this.mood = mood;
        this.energy = energy;

    }
    //void method that controls the stats added/deducted when playing with the Tamagotchi
    public void play()
    {
        this.mood = this.mood + 2;
        this.energy = this.energy - 2;
        this.hunger = this.hunger - 2 ;
    }
    ////void method that controls the stats added/deducted when feeding the Tamagotchi
    public void feed()
    {
        this.hunger = this.hunger + 2;
        this.energy = this.energy + 2;
    }
    //void method that controls the stats added/deducted when the Tamagotchi sleeps
    public void sleep()
    {
        this.energy = this.energy + 2;

    }
    //Method that makes the animals make a Tamagotchi specific sound.
    public String animalSays() {
        return "";
    }

}
