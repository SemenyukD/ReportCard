
public class ReportCard {
	
	public static void main(String[] args) {

		ReportCard2 rc = new ReportCard2();

		rc.scan();
		rc.i = convertGrade(rc.i);
		
		rc.scan1((char) rc.i);
	}

	public static char convertGrade(int testResults) {
		

		char grade;
		
		if (testResults >= 90) {
			grade = 'A';
			System.out.println("Ваша оцінка " + grade + "\n" + "Чудова оцінка!");
		} else if (testResults >= 80 && testResults < 90) {
			grade = 'B';
			System.out.println("Ваша оцінка " + grade + "\n" + "Хороша робота!");
		} else if (testResults >= 70 && testResults < 80) {
			grade = 'C';
			System.out.println("Ваша оцінка " + grade + "\n" + "Потрібно підтягнути знання!");
		} else {
			grade = '0';
		}
		return grade;
	
		}
}
		
