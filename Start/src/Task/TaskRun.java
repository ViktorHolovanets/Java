package Task;

import java.util.Arrays;
import java.util.Scanner;

public class TaskRun implements Runnable {
    @Override
    public void run() {
//        Task1();
//        Task2();
//        Task3();
//        Task4();
//        Task5();
//        Task6();
//        Task7();
        Task8();
    }

    public void Task1() {
        System.out.println("""
                ”Your time is limited,
                \tso don’t waste it
                 \t\tliving someone else’s life”
                 \t\t\tSteve Jobs
                """);
    }

    public void Task2() {
        System.out.println("Task 2");
        Scanner in = new Scanner(System.in);
        System.out.print("Input a number: ");
        float num = in.nextFloat();
        System.out.print("Input a percent: ");
        float percent = in.nextFloat();
        float result = (num / 100 * percent);
        System.out.printf("Result:%2f\n", result);
    }

    public void Task3() {
        System.out.println("Task 3\n");
        Scanner in = new Scanner(System.in);
        System.out.print("Input a string in the format x,y,z(1,2,3): ");
        String num = in.nextLine().replace(" ", "");
        var arrayString = num.split(",");
        var res = 0;
        int count = arrayString.length;
        for (int i = 0; i < count; i++) {
            res += Integer.parseInt(arrayString[i]) * Math.pow(10, count - i - 1);
        }
        System.out.printf("Result:%d", res);
    }

    public void Task4() {
        System.out.println("Task 4\n");
        Scanner in = new Scanner(System.in);
        System.out.print("Enter a six-digit number: ");
        String num = String.valueOf(in.nextInt());
        if (num.length() != 6) {
            System.out.println("Input error");
        } else {
            var temp = num.toCharArray();
            char t = temp[0];
            temp[0] = temp[5];
            temp[5] = t;
            t = temp[1];
            temp[1] = temp[4];
            temp[4] = t;
            System.out.printf("Result:%s", String.valueOf(temp));
        }
    }

    public void Task5() {
        System.out.println("Task 5\n");
        Scanner in = new Scanner(System.in);
        System.out.print("Enter the month number(1-12): ");
        int num = in.nextInt();
        String month="";
        switch (num) {
            case 1:
            case 2:
            case 12:
                month = "Winter";
                break;
            case 3:
            case 4:
            case 5:
                month = "Spring";
                break;
            case 6:
            case 7:
            case 8:
                month = "Summer";
                break;
            case 9:
            case 10:
            case 11:
                month = "Autumn";
                break;
            default:
                month = "Input error";
        }
        System.out.println(month);
    }
    public void Task6(){
        System.out.println("Task 6\n");
        Scanner in = new Scanner(System.in);
        System.out.print("Enter the distance in meters: ");
        float num = in.nextFloat();
        System.out.println("Convert to mile enter 1");
        System.out.println("Convert to inches enter 2");
        System.out.println("Convert to yards enter 3");
        System.out.print("Make a choice: ");
        int n = in.nextInt();
        float res;
        switch (n){
            case 1:
                res = (float) (num*0.00062137);
                break;
            case 2:
                res = (float) (num*39.370);
                break;
            case 3:
                res = (float) (num*1.0936);
                break;
            default:
                System.out.println("Input error");
                return;
        }
        System.out.printf("Result: %s",res);
    }
    public void Task7(){
        System.out.println("Task 7\n");
        Scanner in = new Scanner(System.in);
        System.out.print("Enter start number: ");
        int n1 = in.nextInt();
        System.out.print("Enter end number: ");
        int n2 = in.nextInt();
        if(n1>n2){
            var t=n1;
            n1=n1;
            n2=t;
        }
        for (int i=n1;i<=n2;i++){
            if(i%2!=0)
                System.out.print(i+"\t");
        }
    }
    public void Task8(){
        System.out.println("Task 8\n");
        Scanner in = new Scanner(System.in);
        System.out.print("Enter start number: ");
        int n1 = in.nextInt();
        System.out.print("Enter end number: ");
        int n2 = in.nextInt();
        if(n1>n2){
            var t=n1;
            n1=n1;
            n2=t;
        }
        for (int i=n1;i<=n2;i++){
            for (int j=1;j<=10;j++){
                System.out.printf("%d*%d=%d\t",i,j,i*j);
            }
            System.out.println();
        }
    }
    public void Task9(int[] value){
        System.out.println("Task 9\n");

    }
}
