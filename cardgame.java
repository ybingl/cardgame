package jp.co.f1.superintro.ch08;

import java.util.Scanner;

public class HighAndLowS07 {

	public static void main(String[] args) {

		System.out.println("**************");
		System.out.println("* High & Low *");
		System.out.println("**************");

		while (true) {

			int leftCard = (int) (Math.random() * 9) + 1;

			System.out.println(" ");
			System.out.println(" ");

			System.out.println("    [問題表示]");

			System.out.print("*****");
			System.out.println("     *****");
			System.out.print("*   *");
			System.out.println("     * * *");
			System.out.print("* " + leftCard + " * ");
			System.out.println("    * * *");
			System.out.print("*   *");
			System.out.println("     * * *");
			System.out.print("*****");
			System.out.println("     *****");

			Scanner scanner = new Scanner(System.in);
			System.out.print(" High   or   Low  ?(h/l)  >");

			String select = scanner.nextLine();

			if (select.equals("h")) {
				System.out.println(" ");
				System.out.print("→Highを選択しました");

			} else {
				System.out.println(" ");
				System.out.print("→Lowを選択しました");
			}

			int rightCard = (int) (Math.random() * 9) + 1;

			System.out.println(" ");
			System.out.println(" ");

			System.out.println("    [結果表示]");

			System.out.print("*****");
			System.out.println("     *****");
			System.out.print("*   *");
			System.out.println("     *   *");
			System.out.print("* " + leftCard + " * ");
			System.out.println("    * " + rightCard + " * ");
			System.out.print("*   *");
			System.out.println("     *   *");
			System.out.print("*****");
			System.out.println("     *****");

			String result = "0";

			if (leftCard < rightCard) {
				result = "h";
				if (select.equals(result)) {
					System.out.print("→You Win!");
					continue;
				} else
					System.out.print("→You Lose..");
				break;
			} else if (leftCard == rightCard) {
				result = select;
			}

			if (leftCard > rightCard) {
				result = "l";
				if (select.equals(result)) {
					System.out.print("→You Win!");
					continue;
				} else
					System.out.print("→You Lose..");
				break;
			} else if (leftCard == rightCard) {
				result = select;
			}

			System.out.println(" ");
			System.out.println(" ");

			System.out.println(" -- ゲーム終了 -- ");

		}
	}

}