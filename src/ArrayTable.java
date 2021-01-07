// 배열은 같은 타입의 변수를 하나의 묶음으로 다루는 것

public class ArrayTable {
	public static void main(String[] args) {
		int[] result = new int[9]; 
		//int 값 9개를 저장할 수 있는 배열을 만든다는 뜻. 
		//배열에는 변수의 이름을 저장할 수 없으며
		//index = 각 저장공간(배열) 에 자동으로 붙는 (일련)번호. index의 길이는 배열길이 - 1 
		for(int i=0; i < result.length; i++) { // 9번을 돈다
			result[i] = 2 * (i + 1); // i가 0일 때 +1을 하고 곱하기 2를 한다
		}
		for(int i=0; i < result.length; i++) {
			System.out.println(result[i]); // 대괄호를 통해 배열의 값을 꺼내온다
		}

		result = new int[9]; // 방식 1: result에 덮어씌우기
		for(int i=0; i < result.length; i++) { // 9번을 돈다
			result[i] = 3 * (i + 1); // i가 0일 때 +1을 하고 곱하기 3를 한다
		}
		for(int i=0; i < result.length; i++) {
			System.out.println(result[i]); 
		}

		int[] times3 = new int[9]; // 방식 2 : result 를 덮어씌우지 않고 새로운 배열 만들기
		for(int i=0; i < times3.length; i++) { // 9번을 돈다 (times3의 길이만큼)
			times3[i] = 3 * (i + 1); // i가 0일 때 +1을 하고 곱하기 3를 한다 (초기 실행값)
		}
		for(int i=0; i < times3.length; i++) {
			System.out.println(times3[i]); 
		}
	}
}