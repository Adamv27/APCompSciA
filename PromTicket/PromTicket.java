import java.util.Random;
import java.util.Scanner;

public class PromTicket {

	private String name;
	private int year;
	private int group_size;

	public PromTicket() {
		name = get_name();
		year = grade();
		group_size = get_group_size();
		display_ticket();

	}

	public String get_name() {
		String name;
		Scanner sc = new Scanner(System.in);
		System.out.println("What is your name?");
		name = sc.nextLine();
		return name;
	}

	public int grade() {
		int grade;
		Scanner sc = new Scanner(System.in);
		System.out.println("What grade is the student in?");
		System.out.println("0 - Senior 1 - Junior 2 - Sophomore 3 - Freshmen");
		grade = sc.nextInt();
		return grade;
	}

	public int get_group_size() {
		int group;
		Scanner sc = new Scanner(System.in);
		System.out.println("How many people will be on the ticket. Either 1, 2, 3");
		System.out.println("If you have more than 3 people please enter 3");
		group = sc.nextInt();
		return group;
	}

	public int get_price(int grade, int number_of_people) {
		int[][] ticket_chart = {{40, 60, 100},
								{45, 68, 113},
								{55, 83, 138},
								{65, 98, 163}};

		return ticket_chart[grade][number_of_people];
	}

	public void display_ticket() {
		int price = get_price(this.year, this.group_size - 1);
		String confirmation_code = get_confirmation_code();
		String grade = get_ticket_grade(this.year);
		String ticket_type = get_ticket_type(this.group_size - 1);
		System.out.println(name + " purchased a " + grade + " " + ticket_type + " ticket for $" + price + ".00.");
		System.out.println("The confirmation number for this sale is " + confirmation_code);
	}
	public String get_ticket_grade(int year) {
		String[] grades = {"Senior", "Junior", "Sophomore", "Freshmen"};
		return grades[year];
	}
	public String get_ticket_type(int group_size) {
		String[] group_types = {"Solo", "Couple", "Group"};
		return group_types[group_size];
	}
	public String get_confirmation_code() {
		String characters = "ABCDEFGHIJKLMNOPQRSTUVWXYZabcdefghijklmnopqrstuvwxyz0123456789";
		String confirmation_code = "";

		Random random = new Random();
		for (int i = 0; i < 6; i++) {
			int index = random.nextInt(characters.length());
			confirmation_code += characters.charAt(index);
		}
		return confirmation_code;
	}
}
