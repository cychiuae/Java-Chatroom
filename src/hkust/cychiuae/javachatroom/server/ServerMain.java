package hkust.cychiuae.javachatroom.server;

public class ServerMain {
	
	private int port;
	private Server server;
	
	public ServerMain(int port) {
		this.port = port;
		this.server = new Server(port);
	}
	
	public static void main(String[] args) {
		if (args.length != 1) {
			System.out.println("Usage: java -jar ChatServer.jav [port]");
			return;
		}
		
		int port = Integer.parseInt(args[0]);
		new ServerMain(port);
	}
	
}
