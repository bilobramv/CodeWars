import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Sqrt {
    public static void main(String[] args) {
        System.out.println("Enter numbers: ");
        Scanner sc = new Scanner(System.in);
        List<Integer> listOfNumb = new ArrayList<>();
        boolean b = true;
        while (b) {
            int x = sc.nextInt();
            if (x == 0) {
                break;
            } else {
                listOfNumb.add(x);
            }
        }

        List<Integer> listOfResNumb = new ArrayList<>();
        for (int i : listOfNumb) {
            if (i == (int) Math.sqrt(i) * (int) Math.sqrt(i)) {
                listOfResNumb.add((int) Math.sqrt(i));
            } else {
                listOfResNumb.add(i * i);
            }
        }
        System.out.println("Result: ");
        System.out.print(listOfResNumb);
    }
}