package ETicaret.core.concretes;

import ETicaret.core.abstracts.ValidatorService;

public class EmailValidatorManager implements ValidatorService {

	@Override
	public void sendVerificationEmail() {
		System.out.println("Doðrulama e-maili yollandý.");
		
	}

}
