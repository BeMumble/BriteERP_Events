package com.events.tests.smoke_tests;

import org.testng.annotations.Test;
import com.events.utilities.TestBase;
import com.events.tests.pages.*;

public class eventsReportingTest extends TestBase {
	LoginPage page;

	@Test
	public void TestCase1() {
		page = new LoginPage();
		page.loginAsUser();

	}

}
