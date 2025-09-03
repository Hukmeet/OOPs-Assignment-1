public class R08_Vowel_Or_Consonant {
    public static void main(String args[]) {
        char ch='h';//considering only alphabet input
        switch (ch) {
            case 'a','e','i','o','u','A','E','I','O','U':
                System.out.println(ch+" is a vowel.");
                break;
            default:
                System.out.println(ch+" is a consonant.");
                break;
        }
    }
}
