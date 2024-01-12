package spicejet;

import org.testng.annotations.Test;

public class signupTestcases extends BaseFile {
	@Test
	public void testCase01() {
	Spicejet sj = new Spicejet(driver);
	sj.homepage();
	}	

	@Test
	public void testCase02() {
	Spicejet sj = new Spicejet(driver);
	sj.signUp();
	}	

	@Test
	public void testCase03() {
	Spicejet sj = new Spicejet(driver);
	sj.memberEnrollmentWindow();
	}	
	
	@Test
	public void testCase04() {
	Spicejet sj = new Spicejet(driver);
	sj.memberDetails();
	}	
	
	@Test
	public void testCase05() {
	Spicejet sj = new Spicejet(driver);
	sj.otpHandlying();
	}	
	
	
	
}
	