import java.util.Scanner;

public class MainEvent {
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);

        Event [] event = new Event[4];

        String name;
        int guestCount;
        int menu;
        char pelaminin;
        boolean pelamin = false;
        String style;
        String theme;
        char clownin;
        boolean clown = false;

        System.out.println("=====Event Registration=====");

        for (int i = 0; i < event.length; i++){
            System.out.println("Registering for Wedding Or Birthday");
            String option = input.next();

        if(option.equalsIgnoreCase("Wedding")){
            System.out.println("=====Data For Number" + (i+1) + "=====");
            System.out.println("Enter Customer Name : ");
            input.nextLine();
            name = input.nextLine();
            System.out.println("Enter the number of Guest : ");
            guestCount = input.nextInt();
            System.out.println("Enter the Menu Type (1 / 2 / 3)");
            menu = input.nextInt();
            System.out.println("Opted for Pelamin ?" +"\n(Y)es or (N)o)");
            pelaminin = input.next().charAt(0);
            if(pelaminin == 'Y' || pelaminin == 'y'){
                pelamin = true;
            }else if(pelaminin == 'N' || pelaminin == 'n'){
                pelamin = false;
            }
            System.out.println("Enter Wedding Style : ");
            System.out.println("Garden / Modern / Traditional");
            style = input.next();
            event[i] = new Wedding(name, guestCount, menu, pelamin, style);
        }else if (option.equalsIgnoreCase("Birthday")){
            System.out.println("=====Data For Number" + (i+1) + "=====");
            System.out.println("Enter Customer Name : ");
            input.nextLine();
            name = input.nextLine();
            System.out.println("Enter the number of Guest : ");
            guestCount = input.nextInt();
            System.out.println("Enter the Menu Type (1 / 2 / 3)");
            menu = input.nextInt();
            System.out.println("Enter Birthday Theme");
            System.out.println("Anime / Superhero / Barbie");
            theme = input.next();
            System.out.println("Comes with Clown Service ?" + "(Y)es or (N)o)");
            clownin = input.next().charAt(0);
            if(clownin == 'Y' || clownin == 'y'){
                clown = true;
            }else if(clownin == 'N' || clownin == 'n'){
                clown = false;
            }
            event[i] = new Birthday(name, guestCount, menu,theme, clown);
        }

        }
        for (int i = 0; i < event.length; i++) {
            System.out.println("\n\tOrder no " + (i + 1));
            System.out.println("\n" + event[i].toString());
        }
    }
}
