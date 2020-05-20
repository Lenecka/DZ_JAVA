package Client;

import Server.ClientHandler;

import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.io.IOException;
import java.net.Socket;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Client {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        try {
            //подключение к серверу (адрес сервера,порт)
            Socket socket = new Socket("localhost",8399);
            DataInputStream in = new DataInputStream(socket.getInputStream());
            DataOutputStream out = new DataOutputStream(socket.getOutputStream());
            System.out.println("Представьтесь  ");
            String name=scanner.nextLine();

           // Работа с сервером
            new Thread(new Runnable() {
                //считывает из консоли и отправляет на сервер
                //чтение
                @Override
                public void run() {
                    while (true){
                        String msg = scanner.nextLine();
                        try {
                            out.writeUTF(name+" говорит "+msg);
                            out.writeUTF(name);
                        } catch (IOException e) {
                            e.printStackTrace();
                        }
                    }
                }
            }).start();
            new Thread(new Runnable() {
                //считывает и отправляет ответ в консоль
                //вывод
                @Override
                public void run() {
                    try {
                        while(true){
                            String str;
                            str = in.readUTF();
                            System.out.println(str);
                        }
                    } catch (IOException e) {
                        e.printStackTrace();
                    }
                }
            }).start();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
