/** UNFINISHED
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Scanner;
public class Challenge5 {
    public static void main(String[] args) {
        Date date2=null;
        //format date
        Date Today = new Date();
        SimpleDateFormat formatter = new SimpleDateFormat("dd/MM/yyyy");
        String CurrentDate= formatter.format(Today);


        //Insert date of birth
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter Date of Birth ");
        String DoB = scanner.next();
        SimpleDateFormat dateFormat = new SimpleDateFormat("dd/MM/yyyy");

        try {
            //Parsing the String
            date2 = dateFormat.parse(DoB);
        } catch (ParseException e) {
            // TODO Auto-generated catch block
            e.printStackTrace();
        }

        System.out.println(DoB);
    }
}
**/