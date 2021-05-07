package ETicaret.business.concretes;

import java.util.Random;

import ETicaret.business.abstracts.EmailCodeService;

public class EmailCodeManager implements EmailCodeService{

	int verificationCode;
	public EmailCodeManager() {
		Random a=new Random();
		this.verificationCode= a.nextInt(1000)*10;
	}
	@Override
	public int mailSend() {		
		return this.verificationCode;
	}
	
}
