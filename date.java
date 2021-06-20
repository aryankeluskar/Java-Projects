import java.util.*;
import java.text.*;
class date{
    public static void main(String[] args){
        System.out.print('\u000C');
        Date d = new Date();
        SimpleDateFormat full = new SimpleDateFormat("dd/MM/YYYY hh:mm:ss a");
        System.out.println("Now is "+ full.format(d));
        SimpleDateFormat MM = new SimpleDateFormat("MM");
        System.out.println("The month number is "+ MM.format(d));
        SimpleDateFormat MMMM = new SimpleDateFormat("MMMM");
        System.out.println("The month name is "+ MMMM.format(d));
        SimpleDateFormat dd = new SimpleDateFormat("dd");
        System.out.println("The day number is "+ dd.format(d));
        SimpleDateFormat D = new SimpleDateFormat("D");
        System.out.println("The day number of year is "+ D.format(d));
        SimpleDateFormat W = new SimpleDateFormat("W");
        System.out.println("The week number of month "+ W.format(d));
        SimpleDateFormat w = new SimpleDateFormat("w");
        System.out.println("The week number of year "+ w.format(d));
        SimpleDateFormat E = new SimpleDateFormat("E");
        System.out.println("Text abbreviation of day name is "+ E.format(d));
        SimpleDateFormat EEEE = new SimpleDateFormat("EEEE");
        System.out.println("Full name of day is "+ EEEE.format(d));
        SimpleDateFormat a = new SimpleDateFormat("a");
        System.out.println("AM/PM: "+ a.format(d));
        SimpleDateFormat H = new SimpleDateFormat("H");
        System.out.println("Hours in 24 hour "+ H.format(d));       
        SimpleDateFormat h = new SimpleDateFormat("h a");
        System.out.println("Hours in 12 hour "+ h.format(d));
        SimpleDateFormat m = new SimpleDateFormat("m");
        System.out.println("Minutes is "+ m.format(d));
        SimpleDateFormat s = new SimpleDateFormat("s");
        System.out.println("Seconds is "+ s.format(d));
    }
}