import java.util.Scanner;

/**
 * ���ַ����е������ַ����
 * @author ������
 *
 */
public class Test2 {

	/**
	 * ȥ���������ַ�
	 * @param str
	 * @return
	 */
	private static String changeStr(String str) {
		String numberStr = "";
		for (int i = 0; i < str.length(); i++) {
			int asc = str.charAt(i);
			if (asc >= 48 && asc <= 57)
				numberStr += str.charAt(i);
		}
		if (0==numberStr.length())
			System.out.println("��������ַ�����û�������ַ���");
		return numberStr;
	}
	
	/**
	 * @param args
	 */
	public static void main(String[] args) {

		System.out.println("��һ�����2С��");
		System.out.println("**********************");

		System.out.println("�������ַ�����������80���ַ�����");
		Scanner sc = new Scanner(System.in);
		String str = "";
		
		do {
			if (str.length() > 80)
				System.out.println("��Ҫ����80���ַ������������룺");
			str = sc.next();
		} while (str.length() > 80);

		System.out.println(changeStr(str));
	}

}
