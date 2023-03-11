import java.util.Scanner;

public class Main {
    public static void main(String[] args){

        Scanner sc = new Scanner(System.in);

        System.out.println("Write the string you want to divide:");
        String str = sc.nextLine();

        int length = str.length();

        System.out.println("In how many equal parts do you want to divide the string?");
        int numberOfParts = sc.nextInt();

        int temp = 0;

        int numberOfChar = length/numberOfParts;

        String[] strParts = new String[numberOfParts];

        if(length % numberOfParts != 0){
            System.out.println(str + " cannot be divided into " + numberOfParts +" equal parts.");
        }
        else{
            for(int i = 0; i < length; i += numberOfChar){
                String subStr = str.substring(i, i+numberOfChar);
                strParts[temp] = subStr;
                temp++;
            }
            System.out.println(numberOfParts + " equal parts of \"" + str + "\" are: ");
            for(String strPart : strParts){
                System.out.println(strPart);
            }
        }
    }
}