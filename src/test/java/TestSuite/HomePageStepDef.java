package TestSuite;

import org.openqa.selenium.chrome.ChromeDriver;

import Helper.Config;
import Helper.Utils;
import Pages.HomePage;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class HomePageStepDef {
	
	
	@Given("utilisateur est sur la page dacceuil")
	public void utilisateur_est_sur_la_page_dacceuil() throws Exception {

		Config.driver = new ChromeDriver();
		
		Config.maximizeWindow();
		Config.driver.get(Utils.getproprety("Web_Home_Link"));
	}

	@When("utilisateur survole la souris sur le menu {string} et clique sur submenu {string}")
	public void utilisateur_survole_la_souris_sur_le_menu_et_clique_sur_submenu(String menuname, String submenuname) {
	 HomePage page = new HomePage();  
	 page.moouseHoverOnMenu(menuname);
	 page.clickOnProduct(submenuname);
	}

	@Then("utilisateur est dirige vers la page {string}")
	public void utilisateur_est_dirige_vers_la_page(String name) {
		HomePage page = new HomePage();
		page.verif(name);
	   
	}

}
