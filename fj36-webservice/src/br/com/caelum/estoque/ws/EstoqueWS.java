package br.com.caelum.estoque.ws;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import javax.ejb.Stateless;
import javax.jws.WebMethod;
import javax.jws.WebParam;
import javax.jws.WebResult;
import javax.jws.WebService;

@WebService
// deixa o serviço administrado pelo servidor de aplicação EJB Session Bean
// Stateless
@Stateless
public class EstoqueWS {
	// simulando um repositorio ou banco de dados
	private Map<String, ItemEstoque> repositorio = new HashMap<>();

	public EstoqueWS() {
		// populando alguns dados, mapeando codigo para quantidade
		repositorio.put("SOA", new ItemEstoque("SOA", 5));
		repositorio.put("TDD", new ItemEstoque("TDD", 1));
		repositorio.put("RES", new ItemEstoque("RES", 2));
		repositorio.put("LOG", new ItemEstoque("LOG", 4));
		repositorio.put("WEB", new ItemEstoque("WEB", 1));
		repositorio.put("ARQ", new ItemEstoque("ARQ", 2));
	}

	/*
	 * @WebMethod public ItemEstoque getQuantidade(String codigo) { return
	 * repositorio.get(codigo); }
	 */

	@WebMethod(operationName="ItensPeloCodigo")
	@WebResult(name="ItemEstoque")
	public List<ItemEstoque> getQuantidade(
			@WebParam(name="codigo")List<String> listaDeCodigos) {

		List<ItemEstoque> listaDeItensDoEstoque = new ArrayList<>();

		if (!isNullOrIsEmpty(listaDeCodigos)) {
			for (String codigo : listaDeCodigos) {
				if (repositorio.containsKey(codigo)) {
					listaDeItensDoEstoque.add(repositorio.get(codigo));
				}
			}
		}
		
		return listaDeItensDoEstoque;
	}

	private boolean isNullOrIsEmpty(List<String> listaDeCodigos) {
		return (listaDeCodigos == null || listaDeCodigos.isEmpty()) ? true : false;

	}

}
