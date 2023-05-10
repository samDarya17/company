package classwork;

import java.util.Scanner;

public class Check {

    public static void main(String[] args) {

        Scanner bubu = new Scanner(System.in);
        System.out.print("введите месяц на латинском");
        String letter = bubu.nextLine();
        switch (letter){
            case "march":
                System.out.println("пора года веста");
                break;
            case "april":
                System.out.println("пора года веста");
                break;
            case "may":
                System.out.println("пора года веста");
                break;
            case "june":
                System.out.println("пора года лето");
                break;
            case "july":
                System.out.println("пора года лето");
                break;
            case "august":
                System.out.println("пора года лето");
                break;
            case "september":
                System.out.println("пора года осень");
                break;
            case "october":
                System.out.println("пора года осень");
                break;
            case "november":
                System.out.println("пора года осень");
                break;
            case "december":
                System.out.println("пора года зима");
                break;
            case "january":
                System.out.println("пора года зима");
                break;
            case "february":
                System.out.println("пора года зима");
                break;
            default:
                System.out.println("Что-то не так");
        }
    }}