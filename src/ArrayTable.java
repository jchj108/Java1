// �迭�� ���� Ÿ���� ������ �ϳ��� �������� �ٷ�� ��

public class ArrayTable {
	public static void main(String[] args) {
		int[] result = new int[9]; 
		//int �� 9���� ������ �� �ִ� �迭�� ����ٴ� ��. 
		//�迭���� ������ �̸��� ������ �� ������
		//index = �� �������(�迭) �� �ڵ����� �ٴ� (�Ϸ�)��ȣ. index�� ���̴� �迭���� - 1 
		for(int i=0; i < result.length; i++) { // 9���� ����
			result[i] = 2 * (i + 1); // i�� 0�� �� +1�� �ϰ� ���ϱ� 2�� �Ѵ�
		}
		for(int i=0; i < result.length; i++) {
			System.out.println(result[i]); // ���ȣ�� ���� �迭�� ���� �����´�
		}

		result = new int[9]; // ��� 1: result�� ������
		for(int i=0; i < result.length; i++) { // 9���� ����
			result[i] = 3 * (i + 1); // i�� 0�� �� +1�� �ϰ� ���ϱ� 3�� �Ѵ�
		}
		for(int i=0; i < result.length; i++) {
			System.out.println(result[i]); 
		}

		int[] times3 = new int[9]; // ��� 2 : result �� ������� �ʰ� ���ο� �迭 �����
		for(int i=0; i < times3.length; i++) { // 9���� ���� (times3�� ���̸�ŭ)
			times3[i] = 3 * (i + 1); // i�� 0�� �� +1�� �ϰ� ���ϱ� 3�� �Ѵ� (�ʱ� ���ప)
		}
		for(int i=0; i < times3.length; i++) {
			System.out.println(times3[i]); 
		}
	}
}