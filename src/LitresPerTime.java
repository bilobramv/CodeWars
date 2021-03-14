import java.util.Scanner;

public class LitresPerTime {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter some time: ");
        double time = sc.nextDouble();
        double litres = time/2;
        System.out.println("Litres of water: " + (int)litres);
    }
}

