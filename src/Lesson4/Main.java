package Lesson4;
import java.util.Scanner;
import java.io.*;

public class Main {
    public static void main(String[] args) {

        Member mem = new Member();

        Scanner input = new Scanner(System.in);
        System.out.println("Enter Name:");
        mem.setName(input.next());
        System.out.println("Enter Surname:");
        mem.setSurname(input.next());
        System.out.println("Enter Miles:");
        mem.setMiles(input.nextDouble());

        System.out.println("The name is " + mem.getName());
        System.out.println("The surname is " + mem.getSurname());
        System.out.println("The miles is " + mem.getMiles());

        try (FileWriter file = new FileWriter("club.txt")) {
            String s = mem.getName() + "," + mem.getSurname() + "," + mem.getMiles();
            file.write(s);
        } catch (IOException e) {
            e.printStackTrace();
        }

        try (Scanner fread = new Scanner(new FileReader("clubread.txt"))) {
            Member[] members = new Member[100];
            String line;
            int j = 0;

            while (fread.hasNext()) {
                line = fread.nextLine().trim();
                String[] items = line.split(",");
                members[j] = new Member();
                members[j].setName(items[0]);
                members[j].setSurname(items[1]);
                members[j].setMiles(Double.parseDouble(items[2]));
                j++;
            }

            Winner winner = Winner.determineWinner(members, j);

            if (winner != null) {
                System.out.println("Winner: " + winner.getFullName() + ", miles ran: " + winner.getMilesRan());
            }

            //determine people with atleast 70% of winners score
            for (int i = 0; i < j; i++) {
                if (members[i].getMiles() >= (winner.getMilesRan() * 0.7)) {
                    try (FileWriter file = new FileWriter("src/Lesson4/PeopleToAward.txt", true)) {
                        String s = members[i].getName() + "," + members[i].getSurname() + "," + members[i].getMiles() + "\n";
                        file.write(s);
                    } catch (IOException e) {
                        e.printStackTrace();
                    }
                }
            }
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        }
    }
}
