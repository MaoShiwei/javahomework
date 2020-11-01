import java.util.Date;
public class DateElapsed {
    public static void main(String[] args) {
        long time = 10000;
        for (int i=0; i<8; i++){
            Date date = new Date(time);
            System.out.println("After "+ time + " ms since Thu Jan 01 08:00:00 CST 1970 is " + date.toString());
            time = time *10;
        }
    }
}
