public abstract class Beverage {
    public final void prepareRecipe() {
        boilWater();
        brew();
        pourInCup();
        if (doYouWantConditionalHook()) {
            addCondiments();  // primary method controlled by conditional hook
        }
        pumpOfSyrupHook();  // Hook example
    }

    public void boilWater() {
        System.out.println("boiling water");
    }

    public boolean doYouWantConditionalHook() {
        return false;  // Hook that allows activating a primary method
    }

    public abstract void brew();

    public void pumpOfSyrupHook() {
        // Normal hook.
    }

    public void pourInCup() {
        System.out.println("Pour in cup");
    }

    public abstract void addCondiments();
}
