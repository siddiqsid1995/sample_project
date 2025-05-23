package org.step;

import java.io.IOException;

import org.base.BaseClass;

import io.cucumber.core.api.Scenario;
import io.cucumber.java.After;
import io.cucumber.java.Before;

public class Hooks extends BaseClass {

	@Before
	public void beforeScenario() {

		launchBrowser();
		toPassUrl("https://www.facebook.com/");
		toMax();

	}

	@After
	public void afterScenario(Scenario s) throws IOException {

		String name = s.getName();
		String scenario = name.replaceAll(" ", "_");

		if (s.isFailed()) {

			getScreenshot(scenario);
		}

		driver.quit();
	}

}
