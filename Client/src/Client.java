import rmi.RMIService;

import java.net.MalformedURLException;
import java.rmi.Naming;
import java.rmi.NotBoundException;
import java.rmi.RemoteException;

public class Client {

    private static final String ADDRESS = "localhost";
    private static final int PORT = 60000;
    private static final String SERVANT = "RMIServant";

    public static void main(String[] args) throws MalformedURLException, NotBoundException, RemoteException {
        final String uri = String.format("rmi://%s:%d/%s", ADDRESS, PORT, SERVANT);
        RMIService service = (RMIService) Naming.lookup(uri);
        System.out.println(service.helloWorld("Hello"));
    }
}
