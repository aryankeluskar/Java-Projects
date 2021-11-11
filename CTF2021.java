/**
 * Write a description of class CTF2021 here.
 * This program is solely created for the purpose of using it in HPS-CTF 2021 edition
 * @author aryankeluskar
 * @version 21st October, 2021
 */
public class CTF2021
{
    public CTF2021(String in)
    {
        for(int i = 0; i<=in.length(); i++){
            String out="";
            char ch = in.charAt(i);
            if(Character.isDigit(ch))
                out+=('d'+(ch-47));
            else if(Character.isUpperCase(ch))
                out+=('u'-((ch-65)/2));
            else if(Character.isLowerCase(ch))
                out+=('l'+((ch-97)/2));
            else
                out+=ch;
            System.out.println(out);
        }
    }
    
    public static void main(String[] args){
        String input="j4v4-r3v3rs3-c0d1ng";
        CTF2021 hps = new CTF2021(input);
    }

}
