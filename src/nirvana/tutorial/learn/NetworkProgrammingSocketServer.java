package nirvana.tutorial.learn;
import java.io.IOException;
import java.net.ServerSocket;
import java.io.InputStream;

public class NetworkProgrammingSocketServer{

	public static void main(String[] args) {
		try (ServerSocket server= new ServerSocket(1234)) {
			do {
				InputStream is= server.accept().getInputStream();
			} while (true);
		} catch (IOException e) {

		} catch (SecurityException e) {
			System.out.println("Sorry you can't open a port in this host");
		}
	}

}
