public abstract class Hero implements HavingSuperAbility{
    int health;
    int damage;
    String superAbilityType;

    public void superAbilityType() {
        System.out.println(" Применил супер способность");
    }

    public abstract void increaseExperience();
}
