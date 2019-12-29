package selenium;

import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.*;
import org.openqa.selenium.chrome.ChromeDriver;
import driver.driver;
public class selenium extends driver{
public void abrir() {
	System.setProperty("webdriver.chrome.driver","driver/chromedriver.exe");
	driver= new ChromeDriver();
}
public void abrirpagina() {
	driver.get("https://js.devexpress.com/Demos/DXHotels/#home");
}
public void Enviarlosdatosdelcheck() throws InterruptedException {
	driver.manage().timeouts().implicitlyWait(10,TimeUnit.SECONDS);
	WebElement ciudad= driver.findElement(By.xpath("//*[(text() = 'Location' or . = 'Location')]"));
	ciudad.click();
	WebElement ciudad1= driver.findElement(By.xpath("//*[(text() = 'San Francisco' or . = 'San Francisco')]"));
	ciudad1.click();
	WebElement fecha1= driver.findElement(By.xpath("(.//*[normalize-space(text()) and normalize-space(.)='Location'])[1]/following::label[1]"));
	fecha1.click();
	WebElement fechacampo= driver.findElement(By.xpath("//div[2]/div/div/div/div/div/div/div/div/input"));
	fechacampo.sendKeys("1/8/2020");
	WebElement fecha2= driver.findElement(By.xpath("//div[2]/div/div/label"));
	fecha2.click();
	WebElement fechacampo2= driver.findElement(By.xpath("//div[2]/div/div/div/div/div/div/input"));
	fechacampo2.clear();
	fechacampo2.sendKeys("1/16/2020");
	WebElement cuartos= driver.findElement(By.xpath("//div[3]/div/div/div/div/div/div/div/div/div[2]/div/div/div"));
	cuartos.click();
	WebElement numcuartos= driver.findElement(By.xpath("//*[(text() = '3' or . = '3')]"));
	numcuartos.click();
	WebElement boton= driver.findElement(By.xpath("(.//*[normalize-space(text()) and normalize-space(.)='Children'])[1]/following::div[13]"));
	boton.click();
}
public void elegirlatarifamasbarata() {
	List<?> elements = (List<?>) driver.findElements(By.className("rate-number"));
	System.out.println ("Número de elementos:" + elements.size ());
	for(Object e : elements) {
		  System.out.println(((WebElement) e).getText());
		}
	}
}

