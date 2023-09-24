package task;
public class Hello7 {
    public static void main(String[] args) {
        int num1 = 12;
        int num2 = 5;        
        int hcf = HCF(num1, num2);
        
        System.out.println("The HCF of " + num1 + " and " + num2 + " is " + hcf);
    }
    
    public static int HCF(int a, int b) {
        while (b!=0) {
            int track= b;
            b = a%b;
            a= track;
        }
        return a;
    }
}
