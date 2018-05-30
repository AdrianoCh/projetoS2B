package br.pucrs.tasks;

import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;

import br.pucrs.appObject.BuscarAgenciasAppObject;

public class BuscarAgenciaPorServicoTask {
	private BuscarAgenciasAppObject buscarAgenciasAppObject;

	public BuscarAgenciaPorServicoTask(WebDriver driver) {
		this.buscarAgenciasAppObject = new BuscarAgenciasAppObject(driver);
	}

	public void selecionarServicoRadioButton() {
		this.buscarAgenciasAppObject.getServicoRadialButton().click();
	}

	public void selecionarEstadoComboBox() {
		int x = 0;
		do {
			this.buscarAgenciasAppObject.getEstadoComboBox().sendKeys(Keys.ARROW_DOWN);
			x++;
		} while (x == 23);
		this.buscarAgenciasAppObject.getEstadoComboBox().sendKeys(Keys.ENTER);
	}

	public void selecionarMunicipioComboBox() {
		int y = 0;
		do {
			this.buscarAgenciasAppObject.getMunicipioComboBox();
			y++;
		} while (y == 400);
	}
	
	public void selecionarBairroComboBox() {
		int z = 0;
		do {
			this.buscarAgenciasAppObject.getMunicipioComboBox();
		}while(z == 7);
	}
}