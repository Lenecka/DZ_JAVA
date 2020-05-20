package Server;

import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.io.IOException;
import java.net.Socket;

public class ClientHandler {
    //экземплярнашего сервера
    private Socket socket;
    //количество клиентов в чате
   // public static int client_count = Integer.parseInt(null);
    //Для приема
    private DataInputStream in;
    //Для отправки
    private DataOutputStream out;
    private static int cislo=0;
//конструктор, который принимает клиентский сокет и сервер
    public ClientHandler(Socket socket){
        try {
            //запуск клиента
            //client_count++;

            this.socket = socket;
            this.in = new DataInputStream(socket.getInputStream());
            this.out =new DataOutputStream(socket.getOutputStream());

            //System.out.println(client_count);

            new Thread(new Runnable() {
                @Override
                public void run() {
                    //поток для отдельного клиента
                    try {
                        while (true){
                            String str;
                            //cislo++;
                            //System.out.println("Клиентов в чате: "+cislo);
                            //принимаем от клиента письмо
                            str = in.readUTF();
                            // выход из чата
                            if (str.equals("exit")) break;
                            Server.broadcastMsg(str);
                        }
                    } catch (IOException e) {
                        e.printStackTrace();
                    }
                }
            }).start();
        } catch (IOException e) {
            e.printStackTrace();
        }
        //finally {
        //    this.close();
        //}
    }
    // отправка сообщения
    public void sendMsg(String msg){
        try {
            //отправляет обратно клиенту сообщение
            out.writeUTF(msg);
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
  //  public void close() {
        // удаляем клиента из списка
     //   Server.removeClient(this);
        //cislo--;
        //Server.broadcastMsg("Клиентов в чате = " + cislo);
   // }
}
