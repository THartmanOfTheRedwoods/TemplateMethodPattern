public class Tea extends Beverage {
    @Override
    public void brew() {
        System.out.println("Steep the teabag");
    }

    @Override
    public void addCondiments() {
        System.out.println("adding cream");
    }

    @Override
    public void boilWater() {
        System.out.println("fly to space");
        super.boilWater();
    }
}
