public class Cat extends Tamagotchi
{

    public boolean likesToPushStuffOffTheTable = true;

    public Cat(String name, int hunger, int mood, int energy, boolean likesToPushStuffOffTheTable)
    {
        super(name, hunger, mood, energy);
        this.likesToPushStuffOffTheTable = likesToPushStuffOffTheTable;
    }

    @Override
    public String animalSays()
    {
        return "🐱 I SAY MEOW! 🐱";
    }


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
