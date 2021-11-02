//Allison Power
//20179041
 
import java.util.Scanner;

public class A3 {

    public static void main(String[] args) {
	    Scanner keys = new Scanner(System.in);
        //MethodA
        System.out.print("MethodA - Enter a: ");
        int a = keys.nextInt();
        System.out.print("MethodA - Enter x: ");
        int x = keys.nextInt();
        int y = methodA(a,x);
        System.out.println("MethodA - " + y +  "= " + a + " " + x + "(3)" + " + 7");

        //MethodB
        System.out.print("MethodB - Enter Array Size 1 - 9: ");
        int arrSize = keys.nextInt();
        System.out.println("Method B Start");
        methodB(arrSize);
        System.out.println("\nMethod B End");

        //MethodC
        System.out.print("MethodC - Enter Integer 1 - 100: ");
        int oddEven = keys.nextInt();
        methodC(oddEven);

        //MethodD
        System.out.print("MethodD - Enter integer d: ");
        int d = keys.nextInt();
        System.out.print("MethodD - Enter integer e: ");
        int e = keys.nextInt();
        methodD(d, e);

        //MethodE
        methodE();
    }

    public static int methodA(int a, int x){
        double cubed = Math.pow(x, 3);
        double answer = (a * cubed) + 7;
        return (int)answer;
    }

    public static void methodB(int arrSize){
        for (int i = 0; i<arrSize; i++){
            for(int j = 0; j<arrSize; j++){
                if(i == j){
                    System.out.print("*");
                } else if (j == (arrSize - 1)) {
                    System.out.print("-\n");
                }  else {
                    System.out.print("-");
                }
            }
        }
    }

    public static void methodC(int oddEven){
        if((oddEven % 2) == 0){
            System.out.println("MethodC - Number " + oddEven + " is Even");
        } else {
            System.out.println("MethodC - Number " + oddEven + " is odd");
        }
    }

    public static void methodD(int d, int e){
        if((d % e) == 0){
            System.out.println("MethodD - " + d + " is a multiple of " + e);
        } else {
            System.out.println("MethodD - " + d + " is not a multiple of " + e);
        }
    }

    public static void methodE(){
        Scanner keys = new Scanner(System.in);
        int arr[] = new int[5] ;
        int negCounter = 0;
        int zeroCounter = 0;
        int posCounter = 0;
        for(int i = 0; i<5; i++){
            System.out.print("MethodE - Enter number " + (i+1) + " : ");
            int input = keys.nextInt();
            if(input<0){
                negCounter++;
            } else if (input>0){
                posCounter++;
            } else {
                zeroCounter++;
            }
        }
        System.out.println("MethodE - Totals < 0 : " + negCounter + " = 0 : " + zeroCounter + " > 0 : " + posCounter);
    }
}
