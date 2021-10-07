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
    public void play()
    {
        this.mood = this.mood + 2;
        this.energy = this.energy - 2;
        this.hunger = this.hunger - 2 ;
    }
    public void feed()
    {
        this.hunger = this.hunger + 2;
        this.energy = this.energy + 2;
    }
    public void sleep()
    {
        this.energy = this.energy + 2;

    }

    public String animalSays() {
        return "";
    }

}
