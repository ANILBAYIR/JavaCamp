package ETicaret.core.concretes;

import ETicaret.core.abstracts.ValidatorService;

public class EmailValidatorManager implements ValidatorService {

	@Override
	public void sendVerificationEmail() {
		System.out.println("Do�rulama e-maili yolland�.");
		
	}

}
