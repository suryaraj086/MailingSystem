package mailingsystem;

public class ObjectSetter {

	public static User userSetter(String name, String email, String password) {
		User user = new User();
		user.setName(name);
		user.setEmail(email);
		user.setPassword(password);
		return user;
	}

	public static Messages messageSetter(String from, String to, String subject, String message) {
		Messages msg = new Messages();
		msg.setFromEmail(from);
		msg.setToEmail(to);
		msg.setMessage(message);
		msg.setSubject(subject);
		return msg;
	}

}
