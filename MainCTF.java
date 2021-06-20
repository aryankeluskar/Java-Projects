import java.util.*;

class MainCTF {
    public static void main(String[] args) {
        String password = "otqhygkx1CexxNuyf:mFV58v\\FviMajmNGohm[meDP;jf6o[k6vXj{UlhUNSrKCH31g1f1uotqh1oqe0gniqqi0ueqf11<urvvj";

        StringBuffer s2 = new StringBuffer(password);
        String s3 = s2.reverse().toString();
        String s4 = "";

        for (int i = 0; i < s3.length(); i++) {
            char c = s3.charAt(i);
            c -= 2;
            s4 += c;
        }

        System.out.println(s4);
    }
}