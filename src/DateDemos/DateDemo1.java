package DateDemos;

import java.text.SimpleDateFormat;
import java.util.Date;

public class DateDemo1 {

    public static void main(String[] args) {

        Date date = new Date();
        System.out.println(date);

        // lets convert Date into String
        // in our desired format

        SimpleDateFormat sd = new SimpleDateFormat("dd/MM/yyyy");

        String dateStr = sd.format(date);
        System.out.println("dateStr="+dateStr);

        SimpleDateFormat sd0 = new SimpleDateFormat("dd-MMMM-yyyy");
        System.out.println(sd0.format(date));

        SimpleDateFormat sd1 = new SimpleDateFormat("dd | MMMM yy hh:mm");
        System.out.println(sd1.format(date));

        SimpleDateFormat sd2 = new SimpleDateFormat("yyyy-MM-dd | hh:mm:ss");
        System.out.println(sd2.format(date));

        SimpleDateFormat sd3 = new SimpleDateFormat("EEEE yyyy/MM/dd");
        System.out.println(sd3.format(date));

        SimpleDateFormat sd4 = new SimpleDateFormat("dd-MM-yyyy | E | hh:mm");
        System.out.println(sd4.format(date));

        SimpleDateFormat sd5 = new SimpleDateFormat("hh:mm:ss");
        System.out.println(sd5.format(date));

    }
}
