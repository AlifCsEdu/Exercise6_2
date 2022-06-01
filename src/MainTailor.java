import java.util.Scanner;

public class MainTailor {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        Tailor T[] = new Tailor[4];

        String no;
        String name;
        String date;
        char custType;
        String dressType;
        char silkInput;
        boolean silk;
        int windows;
        int doors;
        String option;

        System.out.println("Tailor Input System");

        for (int i = 0; i < T.length; i++) {
            System.out.println("Choose Between Dress or Curtain");
            option = in.next();

        if (option.equalsIgnoreCase("Dress")) {
                System.out.println("$$$$$Data for No" + (i + 1) + "$$$$$");
                System.out.println("Enter Customer No");
                no = in.next();
                System.out.println("Enter Customer Name");
                name = in.nextLine();
                in.nextLine();
                System.out.println("Enter Date of Order");
                date = in.next();
                System.out.println("Enter Customer Type");
                custType = in.next().charAt(0);
                System.out.println("Enter the Dress Type");
                dressType = in.next();
                System.out.println("With Silk or Without (Y Or N)");
                silkInput = in.next().charAt(0);
                if (silkInput == 'Y' || silkInput == 'y') {
                    silk = true;
                } else {
                    silk = false;
                }
                T[i] = new Dress(no, name, date, custType, dressType, silk);

        }else if (option.equalsIgnoreCase("Curtain")) {
                System.out.println("$$$$$Data for No" + (i + 1) + "$$$$$");
                System.out.println("Enter Customer No");
                no = in.next();
                System.out.println("Enter Customer Name");
                name = in.nextLine();
                in.nextLine();
                System.out.println("Enter Date of Order");
                date = in.next();
                System.out.println("Enter Customer Type");
                custType = in.next().charAt(0);
                System.out.println("Enter Number of Windows");
                windows = in.nextByte();
                System.out.println("Enter Number of Doors");
                doors = in.nextByte();

                T[i] = new Curtain(no, name, date, custType, windows, doors);
            }
        }

            for (int i = 0; i < T.length; i++) {
                System.out.println("Order no " + (i + 1));
                System.out.println("\n" + T[i].toString());
            }
    }
}

