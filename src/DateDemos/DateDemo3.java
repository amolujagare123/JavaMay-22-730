package DateDemos;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

public class DateDemo3 {

    public static void main(String[] args) throws ParseException {

        String dateStr = "05/19/2022";
        System.out.println("Given Date="+dateStr);
        SimpleDateFormat sd = new SimpleDateFormat("MM/dd/yyyy");

        Date date = sd.parse(dateStr);
        System.out.println(date);

       /* SimpleDateFormat sd0 = new SimpleDateFormat("dd-MM-yy");
        System.out.println(sd0.format(date));*/


        String dateStr0= "23-June-2016" ;
        //→ dd-MMMM-yyyy
        SimpleDateFormat sd0 = new SimpleDateFormat("dd-MMMM-yyyy");
        System.out.println(sd0.parse(dateStr0));

        String dateStr1= "24 | June 16  8:34" ;
        //→ dd | MMMM yy hh:mm
        SimpleDateFormat sd1 = new SimpleDateFormat("dd | MMMM yy hh:mm");
        System.out.println(sd1.parse(dateStr1));

        String dateStr2= "2016-06-23 | 8:34:23";
        //→ yyyy-MM-dd | hh:mm:ss
        SimpleDateFormat sd2 = new SimpleDateFormat("yyyy-MM-dd | hh:mm:ss");
        System.out.println(sd2.parse(dateStr2));

        String dateStr3= "Thursday 2016/06/23";
        //→ EEEE yyyy/MM/dd
        SimpleDateFormat sd3 = new SimpleDateFormat("EEEE yyyy/MM/dd");
        System.out.println(sd3.parse(dateStr3));

        String dateStr4= "23-06-2016 | thu | 8:34" ;
        //→ dd-MM-yyyy | E | hh:mm
        SimpleDateFormat sd4 = new SimpleDateFormat("dd-MM-yyyy | E | hh:mm");
        System.out.println(sd4.parse(dateStr4));

        String dateStr5= "8:34:22";
        //→ hh:mm:ss
        SimpleDateFormat sd5 = new SimpleDateFormat("hh:mm:ss");
        System.out.println(sd5.parse(dateStr5));



    }
}
