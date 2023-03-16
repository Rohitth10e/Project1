
import java.util.*;
class Transportation{
    Transportation() {
        System.out.println("Enter the mode of transportation: 1.Railway 2.Bus 3.Metro");
        Scanner sc = new Scanner(System.in);
        int ch = Integer.parseInt(sc.next());

        switch(ch){
            case 1 : System.out.println("Daily commute details of Train");
            break;

            case 2: System.out.println("Daily commute details of Bus");
                break;

            case 3: System.out.println("Daily commute details of Metro");
                break;
            default: System.out.println("Invalid");
        }
    }
}

class Health_Care{
    Health_Care(){
        System.out.println("Nearest Health care centers: ");
    }
}

class Smart_Energy_management{
    Smart_Energy_management(){
        System.out.println("A smart city can use advanced technology to monitor and manage energy usage in buildings, streetlights,\n" +
                "and other infrastructure. This can include the use of sensors and automation\n" +
                "to reduce energy waste and lower costs.\n" +
                "\n");
    }
}
class Public_safety{
    Public_safety(){
        System.out.println("A smart city can use advanced technology\n" +
                " to enhance public safety by providing real-time information on crime\n" +
                " and other potential threats.\n Saftey Centers near you");
    }
}
class waste{
    waste(){
        System.out.println(" A smart city can use sensors and analytics to optimize waste collection and\n" +
                " reduce environmental impact. This can include the use of smart trash bins that alert collectors\n" +
                " when they are full and" +
                " the use of data analytics to identify areas where waste\n" +
                " is generated most frequently.");
    }
}
public class Main{
    public static void main(String[]args) {
        int times = 0;
        char ch2;
        do {
            System.out.println("Hello there you must be wondering ``What is smart city all about?``\n " +
                    "Well we are here to answer that");
            System.out.println("\n");
            System.out.println("A smart city is a term used to describe an urban area that is highly \n" +
                    "advanced in terms of technology, communication, and infrastructure. \n" +
                    "A smart city is designed to improve the quality of life for its citizens, \n" +
                    "reduce its environmental impact, and increase efficiency through the use of advanced technologies. \n");

            System.out.println("Here are the essential 5 smart city facilities:\n1.Transportation\n2.Health Care\n" +
                    "3.Smart Energy Management\n4.Public Safety\n5.Energy Management\n 6.Exit\n");

            System.out.println("Choose an option to know more about it...\n");
            Scanner enter = new Scanner(System.in);
            ch2 = enter.next().charAt(0);

            switch (ch2) {
                case 1:
                    System.out.println("Smart City Transportation network");
                    Transportation t = new Transportation();
                    break;
                case 2:
                    System.out.println("Smart City Health Care network");
                    Health_Care h = new Health_Care();
                    break;
                case 3:
                    System.out.println("Smart City Energy Management:\n");
                    Smart_Energy_management s = new Smart_Energy_management();
                    break;
                case 4:
                    System.out.println("Smart city Public safety centers:\n");
                    Public_safety p = new Public_safety();
                    break;
                case 5:
                    System.out.println("Smart city Waste management system\n");
                    waste w = new waste();
                    break;
                case '6':
                    System.out.println("<--Bye bye see you soon.....-->");
                    break;

                default:
                    System.out.println("Inavlid choice try again\n");
            }
        } while (ch2!='6');
    }
}