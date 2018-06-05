package br.pucrs.testCase;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.WebDriver;

import com.aventstack.extentreports.Status;

import br.pucrs.framework.Driver;
import br.pucrs.framework.Report;
import br.pucrs.framework.Screenshot;
import br.pucrs.verificationPoints.BuscaCepEnderecoNegativoVerificationPoint;

public class BuscaCepEnderecoValorNegativoTestCase {
	private WebDriver driver;
	private BuscaCepEnderecoNegativoVerificationPoint buscaCepEnderecoNegativoVerificationPoint;

	@Before
	public void setUp() {
		Report.startTest("Teste: Busca CEP - Valor Negativo");

		driver = Driver.getFirefoxDriver();

		driver.get("http://www.buscacep.correios.com.br/sistemas/buscacep/BuscaCepEndereco.cfm");
		driver.manage().window().maximize();

		Report.log(Status.INFO, "A Página Foi Carregada", Screenshot.capture(driver));

		this.buscaCepEnderecoNegativoVerificationPoint = new BuscaCepEnderecoNegativoVerificationPoint(
				driver);
	}

	@Test
	public void main() throws InterruptedException {
		this.buscaCepEnderecoNegativoVerificationPoint.checarBuscaCepEnderecoNegativo04824080();
	}

	@After
	public void tearDown() {
		driver.close();

		Report.close();
	}
}
