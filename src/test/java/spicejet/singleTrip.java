package spicejet;
import org.testng.annotations.Test;

public class singleTrip extends BaseFile{

	@Test
	public void testCase01() {
	Spicejet sj = new Spicejet(driver);
	sj.homepage();
	}
	
	@Test	
	public void testCase02() {
	Spicejet sj = new Spicejet(driver);
	sj.login();
	}

	@Test	
	public void testCase03() {
	Spicejet sj = new Spicejet(driver);
	sj.singleTrip();
	}
	
	@Test	
	public void testCase04() {
	Spicejet sj = new Spicejet(driver);
	sj.continueToSelectFlight();
	}
	

	@Test	
	public void testCase05() {
	Spicejet sj = new Spicejet(driver);
	sj.passengerDetails();
	}

	@Test	
	public void testCase06() {
	Spicejet sj = new Spicejet(driver);
	sj.summary();
	}
	

	@Test	
	public void testCase07() {
	Spicejet sj = new Spicejet(driver);
	sj.netBankingOption();
	}
	}
	
