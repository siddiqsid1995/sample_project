package org.step;

import java.util.List;
import java.util.Map;

import org.base.BaseClass;
import org.pojo.LoginPojo;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class StepDefinition1 extends BaseClass {

	//scenario-1
	@When("user want to enter the values in username and password field")
	public void userWantToEnterTheValuesInUsernameAndPasswordField(io.cucumber.datatable.DataTable d) {

		List<Map<String, String>> list = d.asMaps();
		
		Map<String, String> map = list.get(2);
		
		String user = map.get("username");
		String pass = map.get("password");

		LoginPojo l1 = new LoginPojo();

		toFillInput(l1.getTxtUser(), user);
		toFillInput(l1.getTxtPass(), pass);

	}

	@When("user click the login button")
	public void userClickTheLoginButton() {

		LoginPojo l2 = new LoginPojo();
		toClick(l2.getBtnLogin());
	}

	@Then("user navigate into home page")
	public void userNavigateIntoHomePage() {

		System.out.println("Home Page");
	}

	// scenario-2
	@When("user enter the values in username and password field and click the login button")
	public void userEnterTheValuesInUsernameAndPasswordFieldAndClickTheLoginButton() {

		LoginPojo l3 = new LoginPojo();

		toFillInput(l3.getTxtUser(), "siddiq123");
		toFillInput(l3.getTxtPass(), "6745365633");
		toClick(l3.getBtnLogin());
	}

	@Then("user navigate into Error page")
	public void userNavigateIntoErrorPage() {

		System.out.println("Error Page");
	}

}
