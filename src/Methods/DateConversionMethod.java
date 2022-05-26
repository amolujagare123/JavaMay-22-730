package Methods;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

public class DateConversionMethod {

    Date convertDate(String dateStr) throws ParseException // dd/MM/yyyy
    {
        SimpleDateFormat sd = new SimpleDateFormat("dd/MM/yyyy");
       /* Date date = sd.parse(dateStr);
        return  date;*/
        return sd.parse(dateStr);

       // return new SimpleDateFormat("dd/MM/yyyy").parse(dateStr);

    }

    public static void main(String[] args) throws ParseException {

        DateConversionMethod ob = new DateConversionMethod();

        System.out.println(ob.convertDate("15/07/1992"));

        Date myDate = ob.convertDate("15/07/1992");

        System.out.println("MyDate="+myDate);

    }

}
