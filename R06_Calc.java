import java.lang.Math;
public class R06_Calc {
    public static void main(String args[]) {
        int num1=2,num2=3;
        char operation='+';
        if (operation=='+')
            System.out.println("Addition: "+num1+operation+num2+" = "+(num1+num2));
        else if (operation=='-')
            System.out.println("Subtraction: "+num1+operation+num2+" = "+(num1-num2));
        else if (operation=='*')
            System.out.println("Muptiplication: "+num1+operation+num2+" = "+(num1*num2));
        else if (operation=='/')
            System.out.println("Devision: "+num1+operation+num2+" = "+(num1/num2));
        else if (operation=='^')
            System.out.println("Power: "+num1+operation+num2+" = "+(Math.pow(num1,num2)));
        else if (operation=='r') {
            System.out.println("Square Root: root("+num1+") = "+(Math.sqrt(num1)));
            System.out.println("Square Root: root("+num2+") = "+(Math.sqrt(num2)));
        }
        else
            System.out.println("Wrong Operation...");
    }
}
