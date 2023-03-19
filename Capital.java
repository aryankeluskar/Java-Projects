import java.util.*;

class Capital {
    private String sent;
    private int freq;

    public Capital() {
        freq = 0;
        sent = "";
    }

    public void input() {
        Scanner sc = new Scanner(System.in);
        sent = sc.nextLine();
    }

    public boolean isCap(String w) {
        char c = w.toUpperCase().charAt(0);
        if (c == 'A' || c == 'E' || c == 'U' || c == 'I' || c == 'O') {
            return true;
        }
        return false;
    }

    public void display() {
        String words[] = sent.split(" ");
        for (int i = 0; i < words.length; i++) {
            if (isCap(words[i]))
                freq++;
        }
        System.out.println("The sentence: " + sent + "\nfreq: " + freq);
    }

    public static void main(String args[]) {
        Capital ca = new Capital();
        ca.input();
        ca.display();
    }

}