package br.pucrs.tasks;

import org.openqa.selenium.WebDriver;

import br.pucrs.appObject.BuscarAgenciasAppObject;

public class BuscarAgenciaPorProximidadeTask {
	private BuscarAgenciasAppObject buscarAgenciasAppObject;
	public BuscarAgenciaPorProximidadeTask(WebDriver driver) {
		this.buscarAgenciasAppObject = new BuscarAgenciasAppObject(driver);
		
	}
	
	public void selecionarBuscarAgenciaPorProximidade () {
		this.buscarAgenciasAppObject.buscarAgenciasPorProximidadeRadialButton().click();
	}
	
	public void digitarLocalizacao(String endereco) {
		this.buscarAgenciasAppObject.buscarAgenciaPorProximidadeDigiteEnderecoTextField().sendKeys(endereco);		
	}
	
	public void pesquisarLocalizacao() {
		this.buscarAgenciasAppObject.buscarAgenciaPorProximidadePesquisarButton().click();
	}
	
	public boolean verificaCarregamentodoMapa() {
		return this.buscarAgenciasAppObject.imagemCarregamentoImg().isDisplayed();
		
		//return this.buscarAgenciasAppObject.mapaLocalizacaoAgenciaMap().isDisplayed();
	}


}