public class R09_Character_Or_Alphabet {
    public static void main(String args[]) {
        char ch='a';
        if ((ch>=65&&ch<=90)||(ch>=97&&ch<=122))
            System.out.println(ch+" is an alphabet.");
        else
            System.out.println(ch+" is not an alphabet.");
    }
}
