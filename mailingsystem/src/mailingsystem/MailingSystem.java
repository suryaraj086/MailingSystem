package mailingsystem;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class MailingSystem {
	Map<String, User> userMap = new HashMap<>();
	Map<String, String> name = new HashMap<>();
	Map<String, List<String>> group = new HashMap<>();
	Map<String, List<Messages>> inbox = new HashMap<>();
	Map<String, List<Messages>> sentMail = new HashMap<>();

	public String createUser(User obj, String email) throws Exception {
		if (userMap.get(email) == null) {
			if (name.get(obj.getName()) == null) {
				userMap.put(email, obj);
				name.put(obj.getName(), email);
				return "Added Successfully";
			}
		}
		throw new Exception("Enter unique email and username");
	}

	public String createGroup(String groupName, List<String> user) {
		group.put(groupName, user);
		return "Created successfully";
	}

	public String sendEmail(Messages msg, String fromEmail, String toEmail) {
		List<Messages> list = sentMail.get(fromEmail);
		list.add(msg);
		List<Messages> inboxList = sentMail.get(fromEmail);
		inboxList.add(msg);
		return "Message sent";
	}

	public String sentMails(String email) {
		List<Messages> mails = sentMail.get(email);
		StringBuilder str = new StringBuilder();
		for (Messages msg : mails) {
			str.append(msg.toString());
			str.append("\n");
		}
		return str.toString();
	}

	public String inbox(String email) {
		List<Messages> mails = inbox.get(email);
		StringBuilder str = new StringBuilder();
		for (Messages msg : mails) {
			str.append(msg.toString());
			str.append("\n");
		}
		return str.toString();
	}

	public String deleteMail(String email, int val, String type) {
		if (type.equals("Sent")) {
			List<Messages> list = sentMail.get(email);
			list.remove(val - 1);
		} else {
			List<Messages> list = inbox.get(email);
			list.remove(val - 1);
		}
		return "Removed Successfully";
	}

}
