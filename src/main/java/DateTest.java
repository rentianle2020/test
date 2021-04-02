import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

public class DateTest {

    public static void main(String[] args) throws ParseException {

        SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd");
        String date = "1998-10-28";

        Date date1 = sdf.parse(date);
        System.out.println(sdf.format(date1));
        System.out.println(date1);
    }
}
