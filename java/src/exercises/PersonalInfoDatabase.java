import java.util.Scanner;
import java.util.ArrayList;
public class PersonalInfoDatabase 
{
    public static void main(String[] args) 
    {
        Scanner in = new Scanner(System.in);
        System.out.print("Enter number of Participants: ");
        int num = in.nextInt(); 

        ArrayList<ArrayList<ArrayList<String>>> database = new ArrayList<>();
        ArrayList<ArrayList<String>> info = new ArrayList<>();
        String text = "T-T T-T T-T T-T T-T T-T T-T T-T T-T T-T T-T T-T T-T T-T T-T T-T ";
        System.out.printf("%n%s", text);

        for(int i = 0; i < num; i++) 
        {
            ArrayList<String> name = new ArrayList<>();
            ArrayList<String> addr = new ArrayList<>();
            ArrayList<String> cnum = new ArrayList<>();
            ArrayList<String> educ = new ArrayList<>();

            System.out.printf("%n%n%s%d%n%n%s%n%-18s%s", "Personal Profile #", (i + 1), "Enter Full Legal Name", "First Name", ": ");
            name.add(in.next());
            System.out.printf("%-18s%s", "Middle Name", ": ");
            name.add(in.next());
            System.out.printf("%-18s%s", "Last Name", ": ");
            name.add(in.next());
            info.add(new ArrayList<>(name));

            System.out.printf("%n%s%n%-16s%s", "Enter Permanent Address", "Barangay", ": ");
            addr.add(in.next());
            System.out.printf("%-16s%s", "Town/City", ": ");
            addr.add(in.next());
            System.out.printf("%-16s%s", "Province", ": ");
            addr.add(in.next());
            info.add(new ArrayList<>(addr));
            
            System.out.printf("%n%s%n%-23s%s", "Enter Contact Detials", "Mailing Address", ": ");
            cnum.add(in.next());
            System.out.printf("%-23s%s", "Cellphone Number", ": ");
            cnum.add(in.next());
            System.out.printf("%-23s%s", "Email Address", ": ");
            cnum.add(in.next());
            info.add(new ArrayList<>(cnum));
            
            System.out.printf("%n%s%n%-24s%s", "Enter Educational Attainmanets", "Elementary School", ": ");
            educ.add(in.next());
            System.out.printf("%-24s%s", "Secondary School", ": ");
            educ.add(in.next());
            System.out.printf("%-24s%s", "Tertiary School", ": ");
            educ.add(in.next());
            info.add(new ArrayList<>(educ));
            
            database.add(new ArrayList<>(info));
            name.clear();
            addr.clear();
            cnum.clear();
            educ.clear();
            info.clear();
            System.out.printf("%s%s", "\033c", text);
        }

        for(int j = 0; j < database.size(); j++) 
        {
            System.out.printf("%n%n%s%d%n", "Personal Profile #", (j + 1));
            System.out.printf("%s%s%s%s%s%s%n%n", "Name: ", database.get(j).get(0).get(0), " ", database.get(j).get(0).get(1), " ", database.get(j).get(0).get(2));
            System.out.printf("%s%n%s%s%n%s%s%n%s%s%n%n", "Permanent Address", "Barangay: ", database.get(j).get(1).get(0), "Town/City: ", database.get(j).get(1).get(1), "Province: ", database.get(j).get(1).get(2));
            System.out.printf("%s%n%s%s%n%s%s%n%s%s%n%n", "Contact Details", "Mailing Address: ", database.get(j).get(2).get(0), "Contact Number: ", database.get(j).get(2).get(1), "Email Address: ", database.get(j).get(2).get(2));
            System.out.printf("%s%n%s%s%n%s%s%n%s%s%n%n%s", "Educational Attainmemts", "Elementary: ", database.get(j).get(3).get(0), "Secondary: ", database.get(j).get(3).get(1), "Tertiary: ", database.get(j).get(3).get(2), text);
        }

        System.out.println("\n");
        in.close();
    }
}