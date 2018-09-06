package types;

import java.util.Random;
import java.util.Scanner;

public class Taja {

	public static void main(String[] args) {

		Random r = new Random();
		int rand;

		Scanner sc = new Scanner(System.in);

		String[] str = new String[] { "차리서", "사랑해요이홍인", "이홍인", "이찬구", "이주형" };

		String a = null;

		while (true) {
			rand = Math.abs(r.nextInt() % str.length);
			System.out.println(str[rand]);
			a = sc.next();
			if (a.equals(str[rand]))
				System.out.println("정답");
			else
				System.out.println("오답");
		}
	}
}