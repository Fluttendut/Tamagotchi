public class Cat extends Tamagotchi
{

    //unique boolean that tells that cat Tamagotchi's like to push stuff off the table.
    public boolean likesToPushStuffOffTheTable = true;

    public Cat(String name, int hunger, int mood, int energy, boolean likesToPushStuffOffTheTable)
    {
        super(name, hunger, mood, energy);
        this.likesToPushStuffOffTheTable = likesToPushStuffOffTheTable;
    }

    //Override that lets the animal say meow.
    @Override
    public String animalSays()
    {
        return "🐱 I SAY MEOW! 🐱";
    }


    //Override that lets me give the stats to the user when printing in my game main.
    @Override
    public String toString()
    {
        return "Cat{" +
                "name = '" + name + '\'' +
                ", hunger = " + hunger +
                ", mood = " + mood +
                ", energy = " + energy +
                ", likes to push stuff off the table =" + " VERY " + likesToPushStuffOffTheTable +
                '}';
    }
}
