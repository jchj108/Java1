public class FunctionTable {
		public static void main(String[] args) {
			
	


		int[] result = new int[9];
		for (int i = 0; i < result.length; i++) { // 9번을 돈다
			result[i] = 2 * (i + 1); // i가 0일 때 +1을 하고 곱하기 2를 한다
		}
		for (int i = 0; i < result.length; i++) {
			System.out.println(result[i]); // 대괄호를 통해 배열의 값을 꺼내온다
		}

		result = new int[9]; // 방식 1: result에 덮어씌우기
		for (int i = 0; i < result.length; i++) { // 9번을 돈다
			result[i] = 3 * (i + 1); // i가 0일 때 +1을 하고 곱하기 3를 한다
		}
		for (int i = 0; i < result.length; i++) {
			System.out.println(result[i]);
		}

		int[] times3 = new int[9]; // 방식 2 : result 를 덮어씌우지 않고 새로운 배열 만들기
		for (int i = 0; i < times3.length; i++) { // 9번을 돈다 (times3의 길이만큼)
			times3[i] = 3 * (i + 1); // i가 0일 때 +1을 하고 곱하기 3를 한다 (초기 실행값)
		}
		for (int i = 0; i < times3.length; i++) {
			System.out.println(times3[i]);
		}
	}
}