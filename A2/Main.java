 

//Section A
//Allison Power
//20179041
//CP2280
//P01K?
//Sept 23, 2021
//End of section A

import java.util.Scanner;
import com.Weather;
public class Main {
    public static void main(String[] args) {
        //Section B
        Scanner keyboard = new Scanner(System.in);
        System.out.println("Enter a number between 1 and 8");
        int num = keyboard.nextInt();
        String numbers = "";
        String spacing = num + "\t\t";

        for (int i = 0; i < 8; i++) {
            numbers += spacing;
        }

        System.out.println(numbers);

        for (int i = 0; i<8; i++){
            System.out.printf("%s\t\t",num);
        }
        //End of section B

        //Section C
        System.out.println("\nThe path to the file is C:\\usr\\local\\bin");
        //Emd of Section C

        //Section D
        Weather weather = new Weather();
        weather.todaysWeather();
        //End of Section D

        //Section E
        int answer = specialAdder(2017,9041);
        System.out.println("Änswer is: " + answer);
        //End of Section E
    }

    public static int specialAdder(int a, int b){
        if((a >= 1000) && (a <= 9999) && (b >= 1000) && (b <= 9999)){
            return a + b;
        }
        else {
            return 0;
        }
    }
}