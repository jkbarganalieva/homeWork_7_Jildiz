public class Warrior extends Hero{
    @Override
    public void applySuperAbility() {
        System.out.println(" Warrior применил супер удар");
    }

    @Override
    public void increaseExperience() {
        System.out.println("Увеличил силу");
    }
}
