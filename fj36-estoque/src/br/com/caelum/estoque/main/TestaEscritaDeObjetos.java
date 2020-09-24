package br.com.caelum.estoque.main;

import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectOutputStream;
import java.util.ArrayList;
import java.util.List;

import br.com.caelum.estoque.rmi.ItemEstoque;

public class TestaEscritaDeObjetos {

	public static void main(String[] args) throws FileNotFoundException, IOException {

		/**
		 * Exemplo 1
		 */

	/*	FileOutputStream fileOutputStream;

		try {

			fileOutputStream = new FileOutputStream("D:/rodrigo/git_repo/CURSO_SOA/temp/nome_arquivo.txt");
			// define o conteudo do arquivo
			String helloWorld = "Hello World";
			// converte para array de bytes
			byte[] bytes = helloWorld.getBytes();
			// escreve os bytes no arquivo
			fileOutputStream.write(bytes);
			// encerra
			fileOutputStream.close();

			ObjectOutputStream serializador = new ObjectOutputStream(fileOutputStream);
			serializador.writeObject("Hello World");
			// ObjectOutputStream serializador = new ObjectOutputStream(new
			// FileOutputStream("D:/rodrigo/git_repo/CURSO_SOA/temp/itens.bin"));

		} catch (IOException ex) {
			ex.printStackTrace();
		}*/
		
		try (ObjectOutputStream objectOutputStream = new ObjectOutputStream(new FileOutputStream("itens.bin"))) {
			ItemEstoque item1 = new ItemEstoque("ARQ", 2);
			ItemEstoque item2 = new ItemEstoque("SOA", 3);

			List<ItemEstoque> itens = new ArrayList<ItemEstoque>();
			itens.add(item1);
			itens.add(item2);
			objectOutputStream.writeObject(itens);

		}
	}

}
