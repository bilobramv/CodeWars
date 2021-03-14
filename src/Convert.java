import java.text.DecimalFormat;
import java.util.Scanner;

public class Convert {
    public static void main(String[] args) {
        DecimalFormat dF = new DecimalFormat("#.##");
        System.out.print("Enter miles per imperial gallon = ");
        Scanner scan = new Scanner(System.in);
        double x = scan.nextInt();
        final double ig = 4.54609188;
        final double mile = 1.609344;
        double res;
        res = x / ig * mile;
        System.out.println("Convert into kilometers per liter =  " + dF.format(res));

    }
}
