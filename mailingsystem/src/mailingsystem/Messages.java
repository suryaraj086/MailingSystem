package mailingsystem;

public class Messages {

	private String fromEmail;
	private String toEmail;
	private String message;
	private String subject;

	public String getSubject() {
		return subject;
	}

	public void setSubject(String subject) {
		this.subject = subject;
	}

	public String getMessage() {
		return message;
	}

	public void setMessage(String message) {
		this.message = message;
	}

	public String getFromEmail() {
		return fromEmail;
	}

	public void setFromEmail(String fromEmail) {
		this.fromEmail = fromEmail;
	}

	public String getToEmail() {
		return toEmail;
	}

	public void setToEmail(String toEmail) {
		this.toEmail = toEmail;
	}

	@Override
	public String toString() {
		return "Messages [fromEmail=" + fromEmail + ", toEmail=" + toEmail + ", message=" + message + ", subject="
				+ subject + "]";
	}

}
