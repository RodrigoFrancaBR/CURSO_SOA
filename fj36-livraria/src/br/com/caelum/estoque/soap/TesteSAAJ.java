package br.com.caelum.estoque.soap;

import java.io.IOException;

import javax.xml.namespace.QName;
import javax.xml.soap.MessageFactory;
import javax.xml.soap.SOAPBody;
import javax.xml.soap.SOAPBodyElement;
import javax.xml.soap.SOAPElement;
import javax.xml.soap.SOAPException;
import javax.xml.soap.SOAPMessage;

public class TesteSAAJ {

	public static void main(String[] args) throws SOAPException, IOException {

		MessageFactory factory = MessageFactory.newInstance();

		SOAPMessage message = factory.createMessage();

		SOAPBody body = message.getSOAPBody();

		QName qualifiedName = new QName("http://ws.estoque.caelum.com.br/", "getQuantidade", "ns2");

		SOAPBodyElement element = body.addBodyElement(qualifiedName);

		SOAPElement codigoProduto = element.addChildElement(new QName("codigo"));

		codigoProduto.setValue("ARQ");

		SOAPElement quantidade = element.addChildElement(new QName("quantidade"));

		quantidade.setValue("2");

		message.writeTo(System.out);
	}
}
