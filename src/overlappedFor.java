
public class overlappedFor {

	public static void main(String[] args) {
		
		
		for (int i=2; i<10; i++) {
		for (int j=1; j<10; j++) {
			System.out.println(i+"*"+j+"="+(i*j));
			}
		}
		
		for (int i=1; i<10; i++) {
			for (int j=1; j<10; j++) {
				System.out.print("*");
			}
			System.out.println();
		}
		
	}
}
