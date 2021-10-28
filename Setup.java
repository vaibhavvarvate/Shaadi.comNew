package com.shadidotcom;

import java.io.File;
import java.net.MalformedURLException;
import java.net.URL;

import org.openqa.selenium.remote.DesiredCapabilities;
import org.testng.annotations.BeforeTest;

import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.android.AndroidElement;
import io.appium.java_client.remote.MobileCapabilityType;

	public class Setup {
	
	static AndroidDriver<AndroidElement> driver;
	
	@BeforeTest
	public void Attributes() throws InterruptedException 
	
	{
		System.out.println("Application has started...!");
		File apiFile=new File("D:\\eclispse-projects\\Shadi.com\\apps\\shaadi.apk");
		Thread.sleep(5000);
		
		DesiredCapabilities capObj=new DesiredCapabilities();
		
		capObj.setCapability(MobileCapabilityType.DEVICE_NAME, "Galaxy");
		
		capObj.setCapability(MobileCapabilityType.PLATFORM_VERSION, "11.0");
		
		capObj.setCapability(MobileCapabilityType.APP, apiFile.getAbsolutePath());
		
		capObj.setCapability(MobileCapabilityType.AUTOMATION_NAME, "uiautomator2");
		
		capObj.setCapability(MobileCapabilityType.PLATFORM_NAME, "Android");
		
		capObj.setCapability(MobileCapabilityType.UDID, "emulator-5554");
		
		
		try {
			  driver=new AndroidDriver<>(new URL("http://127.0.0.1:4723/wd/hub"),capObj);
			}
				catch (MalformedURLException e) {
				System.out.println("Cause is : "+e.getCause());
				System.out.println("Message is : "+e.getMessage());
				e.printStackTrace();}
	}
}
