package javaCampHomeworkDay5.core.concretes;

import java.util.UUID;

public class VerificationLink {

	public void send() {
		UUID uuid = UUID.randomUUID();
		String verificationLink = "https://ecommerce.com/" + uuid.toString();
		System.out.println("Please click on the link to verify your account:  " + verificationLink );
	}
}
