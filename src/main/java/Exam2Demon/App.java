package Exam2Demon;

import java.util.Scanner;

/**
 * 计算个人说收及其税后工资
 *
 */

public class App 
{
    public static void main( String[] args )
    {
		double tax = 0;
		System.out.println("请输入工资 : ");
		Scanner scanner = new Scanner(System.in);
		int salary = scanner.nextInt();
		int over_sal = salary-3500;
		if(over_sal<0){
			tax = 0;
		}else if(over_sal<=1500){
			tax = over_sal*0.03;
		}else if(over_sal<=4500){
			tax = 45 + (over_sal-1500)*0.1;
		}else if(over_sal<=9000){
			tax = 345 + (over_sal-4500)*0.2;
		}else if(over_sal<=35000){
			tax = 1245 + (over_sal-9000)*0.25;
		}else if(over_sal<=55000){
			tax = 7745 + (over_sal-35000)*0.3;
		}else if(over_sal<=80000){
			tax = 13745 + (over_sal-55000)*0.35;
		}else if(over_sal>80000){
			tax = 22495 + (over_sal-80000)*0.45;
		}
		
		System.out.println("所需要缴纳的税费为 :"+tax);
		
		
	}  
    }
