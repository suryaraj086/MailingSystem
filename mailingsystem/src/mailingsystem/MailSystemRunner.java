package mailingsystem;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class MailSystemRunner {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		MailingSystem obj = new MailingSystem();
		String emailid = scan.nextLine();
		System.out.println("Enter the choice");
		int val = scan.nextInt();
		switch (val) {
		case 1:
			System.out.println("Enter the email");
			String email = scan.nextLine();
			System.out.println("Enter the name");
			String name = scan.nextLine();
			System.out.println("Enter the password");
			String password = scan.nextLine();
			User user = ObjectSetter.userSetter(name, email, password);
			try {
				System.out.println(obj.createUser(user, email));
			} catch (Exception e) {
				System.out.println(e.getMessage());
			}
			break;
		case 2:
			System.out.println("Enter groupname");
			String groupname = scan.nextLine();
			System.out.println("Enter the number of user to add");
			int length = scan.nextInt();
			List<String> arr = new ArrayList<>();
			for (int i = 0; i < length; i++) {
				System.out.println("Enter the user to add");
				String username = scan.nextLine();
				arr.add(username);
			}
			System.out.println(obj.createGroup(groupname, arr));

			break;
		case 3:

			break;
		case 4:
			System.out.println("Enter the receiver email");
			String toEmail = scan.nextLine();
			System.out.println("Enter the Subject");
			String subject = scan.nextLine();
			System.out.println("Enter the message");
			String message = scan.nextLine();
			Messages msg = ObjectSetter.messageSetter(emailid, toEmail, message, subject);
			System.out.println(obj.sendEmail(msg, emailid, toEmail));
			break;
		default:
			break;
		}
		scan.close();
	}

}
