package nirvana.tutorial.learn;
import java.io.IOException;
import java.net.UnknownHostException;
import java.net.Socket;

public class SocketClient {

	public static void main(String[] args) {
		try (Socket sock= new Socket("google.com", 80)){
			System.out.println(sock.getInetAddress().getHostAddress());
			System.out.println(sock.toString());
		} catch (UnknownHostException e) {
			System.out.println("Can't find host");
		} catch (IOException e) {
			System.out.println("Error connecting to host.");
		}
	}
}
