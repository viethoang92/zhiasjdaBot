package util;
import java.util.Date;
import java.text.DateFormat;
import java.text.SimpleDateFormat;

public class Time
{
    public static String getTime() {
        DateFormat dateFormat = new SimpleDateFormat("[dd.MM.yyyy - HH:mm:ss]");
        return dateFormat.format(new Date());
    }
}
