package com.shadidotcom;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class TearDownShadidotCom extends Setup{

	
	@Test(priority='1' ,description="Shaadi.com registration page Validations")
	public void RegistrationValidations()
	{
		driver.manage().timeouts().implicitlyWait(25, TimeUnit.SECONDS);
		driver.findElement(By.id("com.shaadi.android:id/btn_morph_sign_up")).click();
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		driver.findElement(By.xpath("(//android.widget.ImageButton[@content-desc=\"Show dropdown menu\"])[1]")).click();
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		driver.findElement(By.id("com.shaadi.android:id/il_first_name")).click();
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		driver.findElement(By.id("com.shaadi.android:id/et_first_name")).sendKeys("abrahm");
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		driver.findElement(By.id("com.shaadi.android:id/et_last_name")).sendKeys("Lincoln");
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		driver.findElement(By.xpath("(//android.widget.ImageButton[@content-desc=\"Show dropdown menu\"])[2]")).click();
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		driver.findElement(By.id("com.shaadi.android:id/il_last_name")).click();
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		driver.findElement(By.xpath("(//android.widget.ImageButton[@content-desc=\"Show dropdown menu\"])[3]")).click();
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		driver.findElement(By.id("com.shaadi.android:id/il_profile_for")).click();
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		driver.findElement(By.xpath("(//android.widget.ImageButton[@content-desc=\"Show dropdown menu\"])[4]")).click();
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		driver.findElement(By.id("com.shaadi.android:id/il_gender")).click();
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		
		driver.findElement(By.id("com.shaadi.android:id/btn_continue")).click();
		driver.manage().timeouts().implicitlyWait(8, TimeUnit.SECONDS);
		
		
	}
}
