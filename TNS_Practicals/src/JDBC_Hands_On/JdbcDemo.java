package JDBC_Hands_On;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.List;
import java.util.Scanner;

public class JdbcDemo {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		ServiceImplement service = new ServiceImplement();
		Student obj;
		int rno;
		String name;
		float per;
		do {
			System.out.println("Welcome to the Application.");

			System.out.println("""
					1. Insert the Record.
					2. Delete the Record.
					3. Retrive all student Records.
					4. Retrive student by roll number.
					5. Update the Record.
					6. Exit.
					""");
			System.out.println("Enter Your Choice : ");
			int choice = scan.nextInt();
			switch (choice) {
			case 1:
				System.out.println("Enter roll number  : ");
				rno = scan.nextInt();
				scan.nextLine();
				System.out.println("Enter the name : ");
				name = scan.nextLine();
				System.out.println("Enter the per : ");
				per = scan.nextFloat();
				obj = new Student(rno, name, per);
				try {
					service.addStudent(obj);
				} catch (SQLException e) {
					System.out.println("Error... " + e.getMessage());
				}
				break;
			case 2:
				System.out.println("Enter the rollno to delete records");
				rno = scan.nextInt();
				try {
					service.deleteStudentByRno(rno);
				} catch (SQLException e) {
					System.out.println("Error... " + e.getMessage());
				}

				break;
			case 3:
				List<Student> records;
				try {
					records = service.getAllStudents();
					if (records.size() == 0)
						System.out.println("No record available");
					else {
						System.out.println(records);
					}
				} catch (SQLException e) {
					System.out.println("Error... " + e.getMessage());
				}

				System.out.println("-----------------------------");

				break;
			case 4:
				System.out.println("Enter the rollno  ");
				rno = scan.nextInt();
				try {
					obj = service.getStudentByRno(rno);
					if (obj == null)
						System.out.println("No record found");
					else
						System.out.println(obj);
				} catch (SQLException e) {
					System.out.println("Error... " + e.getMessage());
				}
				break;
			case 5:
				System.out.println("Enter roll number to update record  : ");
				rno = scan.nextInt();
				scan.nextLine();
				System.out.println("Enter the new name : ");
				name = scan.nextLine();
				System.out.println("Enter the new per : ");
				per = scan.nextFloat();
				obj = new Student(rno, name, per);
				try {
					service.updateStudentByRno(obj, rno);
				} catch (SQLException e) {
					System.out.println("Error... " + e.getMessage());
				}
				break;
			case 6:
				System.out.println("You have exited from the System.");

				System.exit(0);
				break;
			default:
				System.out.println("You have Entered Wrong Choice.");
			}
		} while (true);

	}

}