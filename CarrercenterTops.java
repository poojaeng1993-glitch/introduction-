package com.core;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Action;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.Select;

public class CarrercenterTops {
	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "E:\\automation\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.get("https://careercenter.tops-int.com/");
		Thread.sleep(3000);
		driver.manage().window().maximize();
		Thread.sleep(3000);
		driver.findElement(By.id("mobile")).sendKeys("9925303208");
		Thread.sleep(3000);
		driver.findElement(By.id("password")).sendKeys("9925303208");
		Thread.sleep(3000);
		driver.findElement(By.className("btn")).click();
    	Thread.sleep(3000);
		driver.findElement(By.cssSelector("i.fa-regular.fa-bell")).click();		
		Thread.sleep(3000);
		
		Select filter=new Select(driver.findElement(By.name("notification_filter")));
		Thread.sleep(3000);
		filter.selectByIndex(1);
		Thread.sleep(3000);
		filter.selectByValue("unread");
		Thread.sleep(3000);
		filter.selectByVisibleText("Read");
		Thread.sleep(3000);
		
		driver.navigate().back();
		driver.findElement(By.id("profileDropdown")).click();
		Thread.sleep(3000);
		Actions builder=new Actions(driver);
		WebElement personaldetail=driver.findElement(By.linkText("Personal Details"));
		Action movetoPersonaldetails=builder.moveToElement(personaldetail).build();
		movetoPersonaldetails.perform();
		Thread.sleep(2000);
		driver.findElement(By.linkText("Personal Details")).click();
		Thread.sleep(3000);
		driver.findElement(By.id("updateProfile")).click();
		Thread.sleep(3000);
		driver.navigate().back();
		driver.findElement(By.id("profileDropdown")).click();
		Thread.sleep(3000);
		driver.findElement(By.linkText("Education Details")).click();
		Thread.sleep(3000);
		driver.findElement(By.linkText("+ Add Education Details")).click();
		Thread.sleep(3000);
		driver.navigate().back();
		driver.findElement(By.id("profileDropdown")).click();
		Thread.sleep(3000);
		driver.findElement(By.linkText("Change Password")).click();
		Thread.sleep(3000);
		driver.navigate().back();
		driver.findElement(By.cssSelector("a.lbListCategory.text-decoration-none.text-black.fw-600.list-link.d-block.mx-2.my-1.p-2.active-link" )).click();
		Thread.sleep(3000);
		driver.findElement(By.name("keyword")).sendKeys("java");
		Thread.sleep(3000);
		Select city=new Select(driver.findElement(By.className("select2-selection__placeholder")));
		driver.findElement(By.className("select2-selection__placeholder")).click();
		Thread.sleep(3000);
		city.selectByIndex(2);
		Thread.sleep(3000);
		city.selectByVisibleText("Ahmedabad");
		Thread.sleep(3000);
		driver.findElement(By.className("btn.btn-sm.btn-brand")).click();
		Thread.sleep(3000);
    	
		driver.findElement(By.cssSelector("a.dropdown-toggle.d-flex.align-items-baseline.justify-content-between.text-decoration-none.text-darkgray.tab-list-subitem.fw-600.w-80")).click();
		Thread.sleep(2000);
		driver.findElement(By.linkText("Course Details")).click();
		Thread.sleep(4000);
		driver.findElement(By.id("course-attendance-tab")).click();
		Thread.sleep(3000);
    	driver.findElement(By.id("course-accounts-tab")).click();
    	Thread.sleep(3000);
		driver.findElement(By.id("course-recorded-lectures-tab")).click();
		Thread.sleep(3000);
		driver.findElement(By.id("course-progress-report-tab")).click();
		Thread.sleep(3000);
		driver.findElement(By.cssSelector("a.dropdown-toggle.d-flex.align-items-baseline.justify-content-between.text-decoration-none.text-darkgray.tab-list-subitem.fw-600.w-80")).click();
		Thread.sleep(2000);
		driver.findElement(By.linkText("Projects")).click();
		Thread.sleep(3000);
		driver.findElement(By.cssSelector("a.dropdown-toggle.d-flex.align-items-baseline.justify-content-between.text-decoration-none.text-darkgray.tab-list-subitem.fw-600.w-80")).click();
		Thread.sleep(2000);
		driver.findElement(By.linkText("Assignment")).click();
		Thread.sleep(3000);
		driver.findElement(By.cssSelector("a.dropdown-toggle.d-flex.align-items-baseline.justify-content-between.text-decoration-none.text-darkgray.tab-list-subitem.fw-600.w-80")).click();
		Thread.sleep(2000);
		driver.findElement(By.linkText("Assessment")).click();
		Thread.sleep(3000);
		driver.findElement(By.cssSelector("a.dropdown-toggle.d-flex.align-items-baseline.justify-content-between.text-decoration-none.text-darkgray.tab-list-subitem.fw-600.w-80")).click();
		Thread.sleep(2000);
		driver.findElement(By.linkText("Interview Questions")).click();
		Thread.sleep(3000);
    	driver.navigate().back();
		driver.findElement(By.linkText("Certificate")).click();
		Thread.sleep(3000);
		driver.findElement(By.linkText("Accounts")).click();
		Thread.sleep(3000);
		driver.findElement(By.linkText("Resume Builder")).click();
		Thread.sleep(3000);
		driver.findElement(By.id("v-pills-personal-tab")).click();
		Thread.sleep(3000);
		driver.findElement(By.id("v-pills-profile-tab")).click();
		Thread.sleep(3000);
		driver.findElement(By.id("v-pills-technical-tab")).click();
		Thread.sleep(3000);
		driver.findElement(By.id("v-pills-projects-tab")).click();
		Thread.sleep(3000);
		driver.findElement(By.id("v-pills-education-tab")).click();
		Thread.sleep(3000);
		driver.navigate().back();
		driver.findElement(By.linkText("Job Tracker")).click();
		Thread.sleep(3000);
		driver.findElement(By.linkText("Upload Reviews")).click();
		Thread.sleep(3000);
		driver.findElement(By.linkText("Rewards")).click();
		Thread.sleep(3000);
		driver.findElement(By.linkText("Refer a Friend")).click();
		Thread.sleep(3000);
		driver.navigate().back();
		

		driver.findElement(By.id("profileDropdown")).click();
		Thread.sleep(3000);
		driver.findElement(By.linkText("Logout")).click();
		Thread.sleep(3000);
		
		
		
		
		
		driver.close();
	}

}