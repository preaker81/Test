package javaSlutproject;

public class Main {

	public static void main(String[] args) {

		GUI.createAndDisplay();

	}

}
//TemporalField för att garantera att vi jobbar utifrån Mon-Sun
//LocalDate now = LocalDate.now();
//TemporalField fieldISO = WeekFields.of(Locale.FRANCE).dayOfWeek();
//LocalDate first = now.with(fieldISO, 1);
//System.out.println(first);