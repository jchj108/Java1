import java.util.Scanner;

public class NineTimesTable {
	public static void main(String[] args) {
        System.out.println("������ �� ����� ����? : ");
        Scanner scanner = new Scanner(System.in);
        int number = scanner.nextInt();
        System.out.println("������ ��� : " + number);
        
   
        if (number < 2) {
            System.out.println("2 �̻��� ���� �Է��ϼ���");
        } else if (number > 9) {
            System.out.println("9�̸��� ���� �Է��ϼ���");
        } else {
            for(int i = 1; i < 10; i++) {
            System.out.println(number * i);
        }
        }
        }
	    }


	
    
	