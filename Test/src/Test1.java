import java.util.Scanner;

/**
 * ʵ��ð������
 * 
 * @author ������
 *
 */
public class Test1 {

	/**
	 * ð������
	 * 
	 * @param array
	 */
	private static int[] bubbleSort(int[] array) {
		for (int i = 0; i < array.length; i++) {
			for (int j = i + 1; j < array.length; j++) {
				if (array[i] > array[j]) {
					int temp;
					temp = array[j];
					array[j] = array[i];
					array[i] = temp;
				}
			}
		}
		return array;
	}

	/**
	 * �����������
	 * 
	 * @param array
	 */
	private static void printArray(int[] array) {
		for (int i = 0; i < array.length; i++) {
			System.out.print(array[i] + " ");
		}
	}

	/**
	 * �������ֲ����
	 */
	public static int input() {
		Scanner sc = new Scanner(System.in);
		int flag = 0;
		String str = null;
		do {
			str = sc.next();
			flag = 0;
			for (int i = 0; i < str.length(); i++) {
				if ((int) str.charAt(i) < 48 || (int) str.charAt(i) > 57)
					flag = 1;
			}
			if (1 == flag)
				System.out.println("���������а����������ַ������������룺");
		} while (1 == flag);
		return Integer.parseInt(str);
	}

	/**
	 * @param args
	 */
	public static void main(String[] args) {

		System.out.println("��һ�����1С��");
		System.out.println("**********************");

		System.out.println("��������Ҫ���뼸�����֣�");
		int n = input();
		int[] array = new int[n];
		int a = 0;
		System.out.println("���������������֣�");
		for (int i = 0; i < n; i++) {
			a = i + 1;
			System.out.print("�������" + a + "������");
			array[i] = input();
		}

		System.out.print("�����������Ϊ��");
		printArray(array);
		array = bubbleSort(array);
		System.out.println();

		System.out.print("��С��������Ϊ��");
		printArray(array);
	}

}
