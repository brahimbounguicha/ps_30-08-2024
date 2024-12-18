package TestSuite;

import org.openqa.selenium.chrome.ChromeDriver;

import Helper.Config;
import Helper.Utils;
import Pages.MaisonConnectePage;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class MaisonConnecteStepDef {
	
	@Given("utilisateur est sur la page du maison connecte")
	public void utilisateur_est_sur_la_page_du_maison_connecte() throws Exception {
	  Config.driver = new ChromeDriver();
	  
	  Config.maximizeWindow();
	  
	  Config.driver.get(Utils.getproprety("Web_MaisonConnecte_Link"));
	}

	@When("utilisateur effectue le tri {string}  et clique sur le produit {string}")
	public void utilisateur_effectue_le_tri_et_clique_sur_le_produit(String sortTri, String nameProd) {
	   
		MaisonConnectePage maison = new MaisonConnectePage();
		
		maison.sortTriAndClickProduct(sortTri, nameProd);
	}

	@Then("utilisateur est derige vers la pge du produit {string}")
	public void utilisateur_est_derige_vers_la_pge_du_produit(String nameProd) {
		MaisonConnectePage maison = new MaisonConnectePage();
		maison.cerifProduct(nameProd);
	}


}
