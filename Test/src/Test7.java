import java.util.Scanner;

/**
 * ������
 * 
 * @author ������
 *
 */
public class Test7 {

	/**
	 * �ж�һ�����Ƿ�������
	 * 
	 * @param number
	 * @return
	 */
	private static boolean isPrime(int number) {
		boolean flag = true;
		if (1 == number)
			flag = false;
		for (int i = 2; i <= number / 2; i++) {
			if (number % i == 0) {
				flag = false;
				break;
			}
		}
		return flag;
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
			if (0 == flag && 0 == Integer.parseInt(str))
				flag = 1;
			if (1 == flag)
				System.out.println("������Ĳ��������������������룺");
		} while (1 == flag);
		return Integer.parseInt(str);
	}

	/**
	 * @param args
	 */
	public static void main(String[] args) {

		System.out.println("�ڶ������7С��");
		System.out.println("**********************");

		int[] array = new int[20];
		System.out.println("�������20����������");
		int a = 1;
		for (int i = 0; i < 20; i++) {
			a = i + 1;
			System.out.print("�������" + a + "������");
			array[i] = input();
		}

		System.out.print("������������������У�");
		for (int i = 0; i < array.length; i++) {
			if (isPrime(array[i])) {
				System.out.print(array[i] + " ");
			}
		}

	}

}
