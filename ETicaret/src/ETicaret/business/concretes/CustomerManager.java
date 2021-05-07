package ETicaret.business.concretes;


import java.util.Scanner;
import java.util.regex.Pattern;



import ETicaret.business.abstracts.CustomerService;
import ETicaret.business.abstracts.EmailCodeService;
import ETicaret.core.abstracts.LoggerService;
import ETicaret.core.abstracts.ValidatorService;
import ETicaret.dataAccess.abstracts.CustomerDao;
import ETicaret.entities.concretes.Customer;

public class CustomerManager implements CustomerService {

	private CustomerDao customerDao;
	private ValidatorService validatorService;
	private LoggerService loggerService;
	private EmailCodeService emailCodeService;
	public CustomerManager(CustomerDao customerDao, ValidatorService validatorService, 
			LoggerService loggerService,EmailCodeService emailCodeService) {
		super();
		this.customerDao = customerDao;
		this.validatorService = validatorService;
		this.loggerService = loggerService;
		this.emailCodeService = emailCodeService;
	}


	@Override
	public void signUp(Customer customer) {
		
		if (!password(customer)) {
			System.out.println("Parolan�z minimum 6 karakterden olu�mal�d�r.");
		}else if(!firstName(customer))
		{
			System.out.println("�sim bilginiz minimum 2 karakterden olu�mal�d�r.");
		}else if(!lastName(customer))
		{
			System.out.println("Soyad bilginiz minimum 2 karakterden olu�mal�d�r.");
		}else if(!email(customer)) 
		{
			System.out.println("Girdi�iniz email adresi ge�ersizdir.");
		}else if(!customerDao.emailCheck(customer)) {
			System.out.println("Bu email adresi zaten sistemde kay�tl�.");
		}else if(loggerService.logToSystem(customer)){
			customerDao.signUp(customer);			
			validatorService.sendVerificationEmail();
			System.out.println( "Do�rulama kodunuz : " + emailCodeService.mailSend());
			System.out.print("Do�rulama kodunu giriniz: ");
			
			return;
		}else {
			customerDao.signUp(customer);			
			validatorService.sendVerificationEmail();
			System.out.println( "Do�rulama kodunuz : " + emailCodeService.mailSend());
			System.out.println("Do�rulama kodunu giriniz: ");
			return;
		}
		
	}


	@Override
	public boolean password(Customer customer) {
		
		if (customer.getPassword().length()>5) {
			return true;		
		}else {
			return false;
		}			
	}


	@Override
	public boolean firstName(Customer customer) {
		
		if(customer.getFirstName() == null || customer.getFirstName().length()<2) {
			return false	;		
		}
		else {			
			return true;
		}
		
	}


	@Override
	public boolean lastName(Customer customer) {
		
		if(customer.getLastName() == null || customer.getLastName().length()<2) {
			return false;			
		}
		else {			
			return true;
		}
		
	}
	
	
	public static final Pattern pattern = 
			Pattern.compile("^[A-Z0-9._%+-]+@[A-Z0-9.-]+\\.[A-Z]{2,6}$", Pattern.CASE_INSENSITIVE);
	
	@Override
	public boolean email(Customer customer) {
		// TODO Auto-generated method stub
		return pattern.matcher(customer.getEmail()).find();
	}


	@Override
	public void logIn(String email, String Password) {
		if (customerDao.loginByCheck(email, Password)) {
			System.out.println("Giri� ba�ar�l�.");
		}else {
			System.out.println("Kullan�c� bilgileri hatal�.");
		}
		
	}
	
	
	
	
	
	
	

}

