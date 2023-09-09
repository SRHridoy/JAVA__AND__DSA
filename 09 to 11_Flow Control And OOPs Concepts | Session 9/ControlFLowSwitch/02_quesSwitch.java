package ControlFLowSwitch;

import java.util.Scanner;

class quesSwitch {

    public static void main(String[] args) {

        //int x = 5;

        //Taking user input :
        Scanner scan = new Scanner(System.in);
        int x = scan.nextInt();
        String result=null;//Local variable k initialize kora lage tai null use korsi....

        if(x>10)
            System.out.println("Invalid Input!");
        
        else
        {
            switch (x) 
            {
                case 1:
                    result = "|";
                    break;
                case 2:
                    result = "||";
                    break;
                case 3:
                    result = "|||";
                    break;
                case 4:
                    result = "|V";
                    break;
                case 5:
                    result = "V";
                    break;
                case 6:
                    result = "V|";
                    break;
                case 7:
                    result = "V||";
                    break;
                case 8:
                    result = "V|||";
                    break;
                case 9:
                    result = "|X";
                    break;
                case 10:
                    result = "X";
                    break;

                default:
                    result = "Invalid Input";
            }
        System.out.println("Your Result for input = "+x +" is = "+ result);
    }
    }

}