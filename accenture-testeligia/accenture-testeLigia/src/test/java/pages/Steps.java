package pages;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import elementos.ElementosWeb;
import metodos.Metodo;


public class Steps {

	Metodo metod = new Metodo();
	ElementosWeb elem = new ElementosWeb();
	
	@Given("^que eu esteja no site \"([^\"]*)\"$")
	public void que_eu_esteja_no_site(String url) throws Throwable {
		metod.abrirNavegador(url, "CHROME");
	}

	@When("^Fizer o cadastro corretamente$")
	public void fizer_o_cadastro_corretamente() throws Throwable {
		metod.selecionar(elem.getFaço());
		metod.selecionar(elem.getModelo());
		metod.escrever(elem.getCilindro(),"6");
		metod.escrever(elem.getDesempenho(), "100");
		metod.escrever(elem.getDataFabricação(), "01/03/2021");
		metod.selecionar(elem.getNumeroAssentos());
		metod.clicar(elem.getDirecaoDireita());
		metod.selecionar(elem.getAssento());
		metod.selecionar(elem.getCombustivel());
		metod.escrever(elem.getCarga(), "100");
		metod.escrever(elem.getPeso(), "200");
		metod.escrever(elem.getPreco(), " 30000");
		metod.escrever(elem.getMatricula(), "233658");
		metod.escrever(elem.getQuilometragem(), "25000");
		metod.clicar(elem.getProximo());
		metod.escrever(elem.getPrimeiroNome(), "Paulo");
		metod.escrever(elem.getSobreNome(), "Fernando");
		metod.escrever(elem.getDataNascimento(), "01/09/1985");
		metod.clicar(elem.getGenero());
		metod.escrever(elem.getEndereço(), "Rua Barueri");
		metod.selecionar(elem.getPaís());
		metod.escrever(elem.getCodigoPostal(), "06236000");
		metod.escrever(elem.getCidade(), "Barueri");
		metod.selecionar(elem.getOcupacao());
		metod.esperaImplicita();
		metod.clicar(elem.getHobb());
		metod.escrever(elem.getLocal(), "https://www.accenture.com.br");
		metod.escrever(elem.getFoto(), "postman");
		metod.clicar(elem.getNext());
		metod.escrever(elem.getDataInicio(), "01/01/2021");
		metod.selecionar(elem.getSomaSeguro());
		metod.selecionar(elem.getClassificacaoMerito());
		metod.selecionar(elem.getSegurosDados());
		metod.clicar(elem.getProdutosOpcionais());
		metod.selecionar(elem.getCarroCortesia());
		metod.clicar(elem.getNestSelect());
		metod.esperaImplicita();
		metod.clicar(elem.getPrata());
		metod.clicar(elem.getNextSend());
		metod.esperaImplicita();
		metod.escrever(elem.getEmail(), "paulofe@hotmail.com");
		metod.escrever(elem.getTel(), "11983025689");
		metod.escrever(elem.getNomeUsuario(), "pafer");
		metod.escrever(elem.getSenha(), "5364pf");
		metod.escrever(elem.getConfirmarSenha(), "5364pf");
		metod.escrever(elem.getComentarios(), "muito obrigada!");
		metod.clicar(elem.getBotao());
		
		
	}

	@Then("^valido a informacao$")
	public void valido_a_informacao() throws Throwable {
	   
		metod.validarMensagem();
		metod.clicar(elem.getOk());
		metod.fechar();
		
	}

	
}
