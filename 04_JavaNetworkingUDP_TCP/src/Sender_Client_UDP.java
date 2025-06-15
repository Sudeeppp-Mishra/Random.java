import java.net.*;

class Sender {
    public static void main(String[] args) throws Exception {
        DatagramSocket socket = new DatagramSocket();
        String msg = "Hello from UDP client";
        byte[] buffer = msg.getBytes();

        InetAddress receiverAddress = InetAddress.getByName("localhost");
        DatagramPacket packet = new DatagramPacket(buffer, buffer.length, receiverAddress, 1234);

        socket.send(packet);
        socket.close();
    }
}