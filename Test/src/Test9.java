import java.util.Scanner;

/**
 * �����ɼ�ͳ�Ƴ���
 * 
 * @author ������
 *
 */
public class Test9 {

	/**
	 * ͳ���ж�ѧ���ɼ�
	 * 
	 * @param array
	 * @return
	 */
	private static int[] judgeArray(int[] array) {
		int sum = 0;
		int count1 = 0;
		int count2 = 0;
		int[] judgeArray = new int[3];
		for (int i = 0; i < array.length; i++) {
			sum += array[i];
			if (array[i] < 60)
				count1++;
			if (array[i] >= 90)
				count2++;
		}
		judgeArray[0] = sum / array.length;
		judgeArray[1] = count1;
		judgeArray[2] = count2;
		return judgeArray;
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

		System.out.println("�ڶ������9С��");
		System.out.println("**********************");

		System.out.println("������ѧ�����������40������");
		int n = 0;
		do {
			if (n > 40)
				System.out.println("���ܳ���40�ˣ����������룺");
			n = input();
		} while (n > 40);
		int[] array = new int[n];

		int a = 0;
		int score = 0;
		System.out.println("������ÿ��ѧ���ĳɼ���");
		for (int i = 0; i < array.length; i++) {
			a = i + 1;
			System.out.print("�������" + a + "��ѧ���ĳɼ���");
			do {
				if (score > 100)
					System.out.print("�ɼ����ܳ���100�֣����������룺");
				score = input();
			} while (score > 100);
			array[i] = score;
		}

		int judgeArray[] = judgeArray(array);
		int averageScore = judgeArray[0];
		int count1 = judgeArray[1];
		int count2 = judgeArray[2];

		System.out.println("ƽ���ɼ�Ϊ��" + averageScore + "��");
		System.out.println("������ѧ������Ϊ��" + count1 + "��");
		System.out.println("�ɼ�����ѧ������Ϊ��" + count2 + "��");
	}

}
