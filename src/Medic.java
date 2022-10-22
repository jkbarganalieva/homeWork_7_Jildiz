public class Medic extends Hero{
    public Double healPoints=40.0;
    @Override
    public void applySuperAbility() {
        System.out.println(" Medic  применил силу исцеления");
    }

    @Override
    public void increaseExperience() {
        System.out.println(" Увеличил силу лечения на 10% "+(healPoints+healPoints*0.1));
    }
/*
    public double increaseExperience(){

        return healPoints+healPoints*0.1;}*/
}
