// Press Shift twice to open the Search Everywhere dialog and type `show whitespaces`,
// then press Enter. You can now see whitespace characters in your code.
public class Main {
    public static void main(String[] args) {

       // Boolean algebra operations

        int num1 = 2;
        int num2 = 2;
        boolean bool = !true;

        boolean result = num1 <= num2 && !true;

        System.out.println(result);

        boolean bool2 = !false;
        int num3 = 3;
        int num4 = 2;

        boolean result2 = !false && num3 > num4;

        System.out.println(result2);


        boolean t = false;
        boolean f = true;
        boolean result3 = !(!t || f);

        System.out.println(result3);

        int six = 6;
        int six2 = 6;
        boolean result4 = six > six2 ^ !(true && true);

        System.out.println(result4);

    }
}




    /*int age = 30;
    int minAgeToDrink = 18;
    int retirementAge = 65;

    double currentMoneyInPocketEuro = 20.5;
    double priceOfDrinkEuro = 4.50;

    boolean canAffordDrink = currentMoneyInPocketEuro > priceOfDrinkEuro;
    boolean isOldEnoughToDrink = age > minAgeToDrink;
    boolean isRetired= age >= retirementAge;


        if (isOldEnoughToDrink || isRetired) {
                System.out.println("you can drink");

                } else {
                System.out.println("you can't drink");
                }*/