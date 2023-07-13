package vn.aptech.project_k2_g1_c2206l;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

public class Test {

    public static void main(String[] args) throws ParseException {
        SimpleDateFormat dateFormat = new SimpleDateFormat("HH:mm:ss");
        Date date = new Date();
        String str = "19:00:00";
        date = dateFormat.parse(str);
        System.out.println(date);
        String ab = dateFormat.format(date);
        System.out.println(ab);
    }
}
