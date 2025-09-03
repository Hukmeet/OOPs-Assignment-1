public class R12_Days_Of_Week {
    public static void main(String args[]) {
        int day=7;//1=monday,7=sunday
        switch (day) {
            case 1:
                System.out.println("Monday!!!");
                break;
            case 2:
                System.out.println("Tuesday!!!");
                break;
            case 3:
                System.out.println("Wednesday!!!");
                break;
            case 4:
                System.out.println("Thursday!!!");
                break;
            case 5:
                System.out.println("Friday!!!");
                break;
            case 6:
                System.out.println("Saturday!!!");
                break;
            case 7:
                System.out.println("Sunday!!!");
                break;
            default:
                System.out.println("Invalid Day!!!");
                break;
        }
    }
}
