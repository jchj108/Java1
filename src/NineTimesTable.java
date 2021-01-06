import java.util.Scanner;

public class NineTimesTable {
	public static void main(String[] args) {
        System.out.println("구구단 중 출력할 단은? : ");
        Scanner scanner = new Scanner(System.in);
        int number = scanner.nextInt();
        System.out.println("구구단 결과 : " + number);
        
   
        if (number < 2) {
            System.out.println("2 이상의 값을 입력하세요");
        } else if (number > 9) {
            System.out.println("9미만의 값을 입력하세요");
        } else {
            for(int i = 1; i < 10; i++) {
            System.out.println(number * i);
        }
        }
        }
	    }


	
    
	