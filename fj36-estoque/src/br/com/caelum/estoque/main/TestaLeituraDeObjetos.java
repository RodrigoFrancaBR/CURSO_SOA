package br.com.caelum.estoque.main;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.util.List;

import br.com.caelum.estoque.rmi.ItemEstoque;

public class TestaLeituraDeObjetos {

	public static void main(String[] args) throws FileNotFoundException, IOException, ClassNotFoundException {
		try (ObjectInputStream objectInputStream = new ObjectInputStream(new FileInputStream("itens.bin"))) {
			List<ItemEstoque> listaDeItensDoEstoque = (List<ItemEstoque>) objectInputStream.readObject();
			// listaDeItensDoEstoque.forEach(item -> System.out.println(item.toString()));
			listaDeItensDoEstoque.forEach(System.out::println);
		}

	}

}
