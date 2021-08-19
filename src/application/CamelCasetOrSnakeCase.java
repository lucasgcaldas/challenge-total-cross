package application;

import java.util.ArrayList;
import java.util.List;

public class CamelCasetOrSnakeCase {
	//exercise link: https://edabit.com/challenge/HjvecTb3aFMjJ59sB
	public static void main(String[] args) {

		toCamelCase("hello_edabit");
		toSnakeCase("helloEdabit");
		toCamelCase("is_modal_open");
		toSnakeCase("getColor");
	}

	private static void toCamelCase(String string) {

		String[] cut = string.split("_");

		List<String> letr = new ArrayList<>();
		for (int i = 0; i < cut.length; i++) {
			letr.add(cut[i]);
			if (i == 0) {
				System.out.print(letr.get(i));
			} else if (i > 0 && i < 2) {
				String firstLtr = letr.get(i).substring(0, i);
				String restLtrs = letr.get(i).substring(1, letr.get(i).length());
				firstLtr = firstLtr.toUpperCase();
				String phrase = firstLtr + restLtrs;
				System.out.print(phrase);
			} else {
				String firstLtr = letr.get(i).substring(0, i - 1);
				String restLtrs = letr.get(i).substring(1, letr.get(i).length());
				firstLtr = firstLtr.toUpperCase();
				String phrase = firstLtr + restLtrs;
				System.out.print(phrase);
			}
		}
		System.out.println();
	}

	private static void toSnakeCase(String string) {

		String[] cut = string.split("(?=[A-ZÀ-Ú])");

		String firstLtr = cut[1].substring(0, 1);
		String restLtrs = cut[1].substring(1, cut[1].length());

		firstLtr = firstLtr.toLowerCase();
		String phrase = firstLtr + restLtrs;
		System.out.println(cut[0] + "_" + phrase);

	}
}
