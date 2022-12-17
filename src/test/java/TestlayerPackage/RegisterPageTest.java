package TestlayerPackage;

import java.io.IOException;

import BaselayerPackage.BaseClass;
import PagelayerPackage.RegisterPage;
import UtilslayerPackage.RegisterUtilsClass;

public class RegisterPageTest extends BaseClass{

	public static void main(String[] args) throws IOException {

		BaseClass.inilization();
		
		RegisterPage registerpage =new RegisterPage();
		registerpage.enterFirstName("DNYANESHWAR VYANKATRAO KADAM");
		registerpage.enterUsername("dnyanakadam@gmail.com");
		registerpage.enterPassword("kadam@123");
		registerpage.reenterPassword("kadam@123");
		registerpage.enteraltUsername("dnyanakadam@gmail.com");
		registerpage.enterMobNo("7507847874");
		String date =registerpage.selectDate("02");
		System.out.println(date);
		String month=registerpage.selectMonth("JUL");
		System.out.println(month);
		String year =registerpage.selectYear("1990");
		System.out.println(year);
		registerpage.clickmale("gender");
		String country=registerpage.selectCountry("India");
		System.out.println(country);
		String city=registerpage.selectCity("Pune");
		System.out.println(city);
		RegisterUtilsClass.takeScreenshot("b");
		
		//driver.close();
	}

}
