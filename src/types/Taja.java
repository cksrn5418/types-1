package types;

import java.util.Random;
import java.util.Scanner;

public class Taja {

	public static void main(String[] args) {

		Random r = new Random();
		int rand;

		Scanner sc = new Scanner(System.in);

		String[] str = new String[] { "������", "����ؿ���ȫ��", "��ȫ��", "������", "������" };

		String a = null;

		while (true) {
			rand = Math.abs(r.nextInt() % str.length);
			System.out.println(str[rand]);
			a = sc.next();
			if (a.equals(str[rand]))
				System.out.println("����");
			else
				System.out.println("����");
		}
	}
}