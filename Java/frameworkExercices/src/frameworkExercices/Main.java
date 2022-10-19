package frameworkExercices;

import java.time.LocalDate;
import java.time.LocalTime;
import java.time.Period;
import java.util.Arrays;

public class Main {

	public static void main(String[] args) {
		// TODO Strings #1
		String text1 = "The Unbearable Weight of Massive Talent";
		System.out.println(text1.toUpperCase());
		System.out.println("**********************************************************");
		// TODO #2
		System.out.println(text1.concat(" bitches!"));
		System.out.println("**********************************************************");
		// TODO #3
		String text2 = text1.substring(25, 32);
		System.out.println(text2);
		System.out.println("**********************************************************");
		// TODO Arrays #1
		int[] a = { 1, 2, 3, 4, 5 };
		int[] b = a.clone();
		a[4] = 0;
		System.out.println(Arrays.toString(a));
		System.out.println(Arrays.toString(b));
		System.out.println("**********************************************************");
		// TODO #2
		int[] c = { 5, 23, 56, 3, 0, 2 };
		System.out.println(Arrays.toString(c));
		Arrays.sort(c);
		System.out.println(Arrays.toString(c));
		System.out.println("**********************************************************");
		// TODO #3
		int[] d = { 5, 6, 7, 8, 9, 10 };
		Arrays.fill(d, 0);
		System.out.println(Arrays.toString(d));
		System.out.println("**********************************************************");
		// TODO #4
		int[] f = { 5, 6, 7, 8, 9, 10 };
		Arrays.fill(f, 1, 5, 0);
		System.out.println(Arrays.toString(f));
		System.out.println("**********************************************************");
		// TODO LocalDate #1
		LocalDate today = LocalDate.now();
		System.out.println(today);
		System.out.println("**********************************************************");
		// TODO #2
		LocalDate xMas = LocalDate.of(2022, 12, 24);
		System.out.println(xMas.getDayOfYear() - today.getDayOfYear());
		System.out.println(Period.between(today, xMas)); // Varför printas P2M6D?
		System.out.println("**********************************************************");
		// TODO #3
		LocalDate bDay = LocalDate.of(2022, 5, 6);
		if (today.isAfter(bDay)) {
			System.out.println("You have already had your birthday!");
		} else if (today.isBefore(bDay)) {
			System.out.println("Your birthday is still ahead of you!");
		} else {
			System.out.println("It is your birthday today!");
		}
		// TODO #4
		LocalDate date = LocalDate.of(2022, 5, 6);
		for (int i = 0; i < ((date.lengthOfMonth() + 1) - date.getDayOfMonth()); i++) {
			LocalDate printDate = date.plusDays(i);
			System.out.println(printDate + " - " + printDate.getDayOfWeek());
		}
		System.out.println("**********************************************************");
		// TODO LocalTime #1
		LocalTime time = LocalTime.now();
		System.out.println(time);
		// TODO #2
		LocalTime lunch = LocalTime.of(11, 0);
		System.out.println(lunch.getHour() - time.getHour());
		// Exeptions #1

	}

}
