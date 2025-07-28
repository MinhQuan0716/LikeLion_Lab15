import java.util.Scanner;

public class CalculatorApp{
    public static void Showmenu(){
        System.out.println("1/ Tiền điện cuối tháng");
        System.out.println("2/ Tiền taxi cuối tháng");
        System.out.println("3/ Tiền lương cuối tháng");
        System.out.println("4/ Tổng thu nhập cuối tháng");
        System.out.println("Mờibạnchọnchức năng [1->4] hoặc nhấn phím khác để thoát");
    }
   public static boolean HandleChoice(String choice){
    Scanner scanner=new Scanner(System.in);
          switch (choice) {
            case "1":
                System.out.println("Input kWH");
                 int electricAmount=scanner.nextInt();
                 int money=electricAmount*1000;
                System.out.println("Money:"+ money);
                break;
            case "2":
                  System.out.println("Input total distance:");
                 int distaneAmount=scanner.nextInt();
                 int totalMoney=distaneAmount*10000;
                 System.out.println("Money:"+ totalMoney);
                break;
            case "3" :
             System.out.println("Input total working day:");
                 int totalWorkingDay=scanner.nextInt();
                 int totalSalary=totalWorkingDay*270000;
                 System.out.println("Salary:"+ totalSalary);
                break;
            case "4":
               System.out.println("Input salary a month:");
                 int totalSalaryAMonth=scanner.nextInt();
                 int salaryAfterSpedning=totalSalaryAMonth-2000000;
                 System.out.println("Salary:"+ salaryAfterSpedning);
                break;
            default:
            System.out.println("Exiting");
                return true;
        
        }
        return false;
   }
    public static void main(String[] args) {
       Scanner scanner=new Scanner(System.in);
        boolean exit=false;
        while(!exit){
        Showmenu();
        System.out.println("Nhap lua chon");
        String choice=scanner.nextLine();
        exit=HandleChoice(choice);
        }
    }
}