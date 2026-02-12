import java.util.*;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        Scanner input=new Scanner(System.in);

        HashMap<String, Integer> takenNames=new HashMap<>();
        String name; int num;
        System.out.println("Enter no. of accounts to be created: ");
        num=input.nextInt();
        for(int i=0; i<num; i++) {
            System.out.println("Enter a username: ");
            name = input.nextLine();
            if (takenNames.containsKey(name)) {
                System.out.println("Sorry username is already taken! Please try an alternative");
                takenNames.merge(name, 1, Integer::sum);
            } else {
                System.out.println("Account created");
                takenNames.put(name, 1);
            }
        }
    }

}