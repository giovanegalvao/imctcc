package Test;

import com.thoughtworks.selenium.*;
import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import static org.junit.Assert.*;
import java.util.regex.Pattern;

public class TesteIMC {
	private Selenium selenium;

	@Before
	public void setUp() throws Exception {
		selenium = new DefaultSelenium("localhost", 4444, "*chrome", "http://localhost/imc/");
		selenium.start();
	}

	@Test
	public void testEIMC() throws Exception {
		selenium.open("/imc/");
		selenium.type("id=altura", "1.81");
		selenium.type("id=peso", "85");
		selenium.click("id=calcular");
		selenium.waitForPageToLoad("30000");
	}

	@After
	public void tearDown() throws Exception {
		//selenium.stop();
	}
}
