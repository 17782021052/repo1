package test;

	import java.util.Scanner;

	public class Demo {
		private static String[] Array = { "����", "����", "����", "����", "����", "����", "�¾�", "֣ʮ" };

		public static void main(String[] args) {

			System.out.println("�����е������У�");
			for (int i = 0; i < Array.length; i++) {
				System.out.print(Array[i] + "  ");
			}

			System.out.println("");// ����

			Scanner input = new Scanner(System.in);
			try {

				for (int i = 0; i < 999999; i++) {
					System.out.print("��������Ҫ��ѯ����ţ�");
					int d1 = input.nextInt();// �Ӽ�����������
					System.out.println("���ѯ�����Ϊ" + d1);
					if (d1 >= (Array.length + 1) || d1 < 0) {
						System.out.println("�����������Ų������ݷ�Χ�ڣ�������������룡");
					} else {
						System.out.println("������ѯ�������ǣ�" + Array[d1 - 1]);
					}

				}
			} catch (Exception e) {
				System.out.println("������������������");
			}

		}
	}