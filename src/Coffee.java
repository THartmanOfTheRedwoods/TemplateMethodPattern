import java.util.Scanner;

public class Coffee extends Beverage {
    @Override
    public void brew() {
        System.out.println("brewing coffee and filtering");
    }

    @Override
    public void addCondiments() {
        System.out.println("adding sugar and milk");
    }

    @Override
    public boolean doYouWantConditionalHook() {
        Scanner s = new Scanner(System.in);
        System.out.println("Do you want milk and sugar? ");
        String answer = s.nextLine();
        System.out.println(answer);
        return answer.equals("Y");
    }

    @Override
    public void pumpOfSyrupHook() {
        System.out.println("Heaping gobs of syrup like Dutch Bros does");
    }

}
