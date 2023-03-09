package com.algaworks;

import com.algaworks.model.Pedido;

import java.io.*;
import java.net.ServerSocket;
import java.net.Socket;

public class Server {
    public static void main(String[] args) throws Exception {

            ServerSocket server = new ServerSocket(3333);

            System.out.println("Aguardando conexão");
            Socket socket = server.accept(); // Para aqui e aguarda uma conexão de um cliente para, então, retornar um objeto do tipo Socket
            System.out.println("Conectado a: " + socket.getRemoteSocketAddress());

            InputStream inputStream = socket.getInputStream();
            ObjectInputStream objectInputStream = new ObjectInputStream(inputStream);
            Pedido pedido = (Pedido) objectInputStream.readObject();
            System.out.println("Código: " + pedido.getCodigo());
            System.out.println("Descrição: " + pedido.getDescricao());
            System.out.println("Quantidade: " + pedido.getQuantidade());

            OutputStream outputStream = socket.getOutputStream();
            DataOutput dataOutput = new DataOutputStream(outputStream);
            dataOutput.writeUTF("Arquivo recebido com sucesso!");

            server.close();

        }
    }
}