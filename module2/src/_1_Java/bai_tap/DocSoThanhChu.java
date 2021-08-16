package _1_Java.bai_tap;

import java.util.Scanner;

public class DocSoThanhChu {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println( " Enter number");
        int a = scanner.nextInt();
        if( a>20) {
            switch (a) {
                case 0:
                    System.out.println(" zero");
                    break;
                case 1:
                    System.out.println(" one ");
                    break;
                case 2:
                    System.out.println(" two");
                    break;
                case 3:
                    System.out.println(" three");
                    break;
                case 4:
                    System.out.println(" four");
                    break;
                case 5:
                    System.out.println(" five");
                    break;
                case 6:
                    System.out.println(" six");
                    break;
                case 7:
                    System.out.println(" seven");
                    break;
                case 8:
                    System.out.println(" eight");
                    break;
                case 9:
                    System.out.println(" neight");
                    break;
                case 10:
                    System.out.println(" ten");
                    break;
                case 11:
                    System.out.println(" eleven");
                    break;
                case 12:
                    System.out.println(" twelve");
                    break;
                case 13:
                    System.out.println(" thirteen");
                    break;
                case 14:
                    System.out.println(" fourteen");
                    break;
                case 15:
                    System.out.println(" fifteen");
                    break;
                case 16:
                    System.out.println(" sixteen");
                    break;
                case 17:
                    System.out.println(" seventeen");
                    break;
                case 18:
                    System.out.println(" eighteen");
                    break;
                case 19:
                    System.out.println(" nineteen");
                    break;
                case 20:
                    System.out.println(" twenty");
                    break;
            }
        } else if (a >100) {
            int ch = a / 10;
            int dv = a % 10;
            switch (ch) {
                case 2:
                    System.out.println(" twenty");
                    break;
                case 3:
                    System.out.println(" thirty");
                    break;
                case 4:
                    System.out.println(" fourty");
                    break;
                case 5:
                    System.out.println(" fifty");
                    break;
                case 6:
                    System.out.println(" sixty");
                    break;
                case 7:
                    System.out.println(" seventy");
                    break;
                case 8:
                    System.out.println(" eighty");
                    break;
                case 9:
                    System.out.println(" ninety");
                    break;
            }
            switch (dv) {
                case 0:
                    System.out.println(" ");
                    break;
                case 1:
                    System.out.println(" one ");
                    break;
                case 2:
                    System.out.println(" two ");
                    break;
                case 3:
                    System.out.println(" three ");
                    break;
                case 4:
                    System.out.println(" four ");
                    break;
                case 5:
                    System.out.println(" five ");
                    break;
                case 6:
                    System.out.println(" six ");
                    break;
                case 7:
                    System.out.println(" seven ");
                    break;
                case 8:
                    System.out.println(" eight ");
                    break;
                case 9:
                    System.out.println(" nine ");
                    break;
            }
        }else if( a< 1000){
            int tr = a/100;
            int ch = a/ 10% 10;
            int dv = a % 10;
            switch (tr) {
                case 1:
                    System.out.println(" one hundred");
                    break;
                case 2:
                    System.out.println(" two hundred");
                    break;
                case 3:
                    System.out.println(" three hundred");
                    break;
                case 4:
                    System.out.println(" four hundred");
                    break;
                case 5:
                    System.out.println(" five hundred");
                    break;
                case 6:
                    System.out.println(" six hundred");
                    break;
                case 7:
                    System.out.println(" seven hundred");
                    break;
                case 8:
                    System.out.println(" eight hundred");
                    break;
                case 9:
                    System.out.println(" nine hundred");
                    break;
            } switch (ch) {
                case 2:
                    System.out.println(" twenty ");
                    break;
                case 3:
                    System.out.println(" thirty ");
                    break;
                case 4:
                    System.out.println(" fourty ");
                    break;
                case 5:
                    System.out.println(" fifty ");
                    break;
                case 6:
                    System.out.println(" sixty ");
                    break;
                case 7:
                    System.out.println(" seventy ");
                    break;
                case 8:
                    System.out.println(" eighty ");
                    break;
                case 9:
                    System.out.println(" ninety ");
                    break;
            } switch (dv) {
                case 1:
                    System.out.println(" one");
                    break;
                case 2:
                    System.out.println(" two");
                    break;
                case 3:
                    System.out.println(" three");
                    break;
                case 4:
                    System.out.println(" four");
                    break;
                case 5:
                    System.out.println(" five");
                    break;
                case 6:
                    System.out.println(" six");
                    break;
                case 7:
                    System.out.println(" seven");
                    break;
                case 8:
                    System.out.println(" eight");
                    break;
                case 9:
                    System.out.println(" nine");
                    break;





            }

            }
        }
    }

