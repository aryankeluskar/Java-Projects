import java.util.*;//import util package
/**
 * Hello!
 * This program is for Happy Word
 * APC - Strings - 15
 * I am Aryan K
 */
class happy //class name
{
    public static void main() //main method
    {
        Scanner sc = new Scanner(System.in);//Initialise Scanner Object
        System.out.println("Enter a s");//Prompt The User
        String s = sc.next();//Input
        int n1 = 0;//For n1eric value, Eg: VAT = 22120
        s = s.toUpperCase();//Convert s to Upper Case
        for(int i = 0;i<s.length();i++)//for loop to extract character
        {
            char c = s.charAt(i);//extract character
            if(c>='A'&&c<='Z'){//If c is a letter then goes in
                if(c>='A'&&c<='I')//Check whether c is single digit
                    n1=((n1*10)+(c-64));//Add single digit to n1eric value of s
                else if(c>='J'&&c<='Z')//Check whether c is double digit
                    n1=((n1*100)+(c-64));//Add double digit to n1eric value of s
            }
        }//for loop close
        int ds = 0;//For Sum of Squares of digits of s
        while(n1>0)//To get Sum of Squares of digits of s
        {
            int n = n1%10;//Extract a digit 
            ds+=n*n;//Add it to Digit Sum
            n1/=10;//Take that n1ber out from n1
        }//while loop close
        n1=ds;//Use n1 for another purpose
        while(n1>9)//The loop should break when Sum of Squares of digits of s is greater than 9, ie: Double digit
        {
            n1 = ds;//Use n1 for another purpose
            ds=0;//Reinitialize ds for next Sum of Squares of digits
            while(n1>0)//To get Sum of Squares of digits
            {
                int n = n1%10;//Extract a digit 
                ds+=n*n;//Add it to Digit Sum
                n1/=10;//Take that n1ber out from n1
            }
            n1=ds;//Use n1 for another purpose
        }//while loop close
        if(ds==1)//Check whether final Sum of Squares of digits is equal to 1
            System.out.println("Happy Word");//print output
        else if(ds!=1)//Check whether final Sum of Squares of digits is not equal to 1
            System.out.println("Sad Word");//print output
    }//main close
}//class close