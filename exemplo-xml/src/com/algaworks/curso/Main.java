package com.algaworks.curso;

import com.algaworks.curso.modelo.Produto;
import com.thoughtworks.xstream.XStream;
import com.thoughtworks.xstream.io.xml.DomDriver;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.OutputStream;
import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) throws FileNotFoundException {

        XStream xStream = new XStream(new DomDriver());
        xStream.alias("produto", Produto.class);
        xStream.allowTypes(new Class[] {Produto.class});

        Produto sabonete = new Produto(1L, "sabonete", new BigDecimal("2.30"));

        String xml = xStream.toXML(sabonete); // Biblioteca XStream: Transforma objeto sabonete em XML
        System.out.println(xml);

        OutputStream outputStream = new FileOutputStream("./produto1.xml");
        xStream.toXML(sabonete, outputStream); // Biblioteca XStream: Coloca o xml gerado dentro de um arquivo

        xStream.aliasAttribute(Produto.class, "codigo", "codigo"); // Transforma o atributo da classe em um atributo do XML (<produto codigo="1"></produto>)

        OutputStream outputStream2 = new FileOutputStream("./produto2.xml");
        xStream.toXML(sabonete, outputStream2);

        Produto p = (Produto) xStream.fromXML(new FileInputStream("./produto2.xml")); // Biblioteca XStream: Transforma os registros do XML em um objeto
        System.out.println(p.getCodigo());
        System.out.println(p.getDescricao());
        System.out.println(p.getValor());

        List<Produto> carrinho = new ArrayList<>();
        carrinho.add(new Produto(1L, "sabonete", new BigDecimal("8.30")));
        carrinho.add(new Produto(2L, "coxão duro (kg)", new BigDecimal("40.00")));

        xStream.alias("produto", Produto.class);
        xStream.aliasAttribute(Produto.class, "codigo", "codigo");
        xStream.alias("carrinho", List.class);

        OutputStream outputStream3 = new FileOutputStream("./carrinho.xml");
        xStream.toXML(carrinho, outputStream3); //Biblioteca XStream: Grava lista de produtos em um arquivo XML

        carrinho = (List<Produto>) xStream.fromXML(new FileInputStream("./carrinho.xml")); //Biblioteca XStream: Transforma os registros de um arquivo XML em uma lista de objetos
        for (Produto produto : carrinho) {
            System.out.println("------------------------");
            System.out.println(produto.getCodigo());
            System.out.println(produto.getDescricao());
            System.out.println(produto.getValor());
            System.out.println("------------------------");
            System.out.println();
        }

    }
}