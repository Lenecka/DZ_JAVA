package Server;

import Client.Client;

import java.io.IOException;
import java.net.ServerSocket;
import java.net.Socket;
import java.sql.Connection;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;

import java.util.concurrent.ConcurrentHashMap;

public class Server {
    //список клиентов, которые будут подключаться
    static List<ClientHandler> clients = new ArrayList<>();
   // static Map<String, ClientHandler>clients=new ConcurrentHashMap<>();
    public static void main(String[] args) {
//сокет клиента. через него идет подключение к серверу по адресу и порту
        Socket socket = null;
        //серверный сокет
        ServerSocket serverSocket = null;
       // ArrayList<String> ima = new ArrayList<String>();
        //ima.add(name);
        //System.out.println(ima.size());
        try {
            //порт для сервера (создание серверного сокета на определенном порту)
            serverSocket = new ServerSocket(8399);
            System.out.println("Сервер запущен!");
            //int cislo = 0;
            while(true){
                //ждем подключения от сервера
                socket = serverSocket.accept();
                System.out.println("Клиент подключился!");
               // cislo++;
                //System.out.println("Клиентов в чате: "+cislo);
                //добавляем в список клиентов
                clients.add(new ClientHandler(socket)); //
                //cislo--;
            }

        } catch (IOException e) {
            e.printStackTrace();
        } finally {
            try {
                socket.close();
            }catch (IOException e){
                e.printStackTrace();
            }
            try {
                serverSocket.close();
            } catch (IOException e) {
                e.printStackTrace();
            }
        }
    }
    //вызывает метод для всех клиентов (что бы сообщение рассылалось всем клиентам)
    static public void broadcastMsg(String msg) {
        for (ClientHandler o : clients) {
            o.sendMsg(msg);
        }
    }
    // удаляем клиента из коллекции при выходе из чата
    public static void removeClient(ClientHandler client) {
        clients.remove(client);

    }
/*
        finally {
        try {
            // закрываем подключение
            clientSocket.close();
            System.out.println("Сервер остановлен");
            serverSocket.close();
        }
        catch (IOException ex) {
            ex.printStackTrace();
        }
    }

    }
 */
}
