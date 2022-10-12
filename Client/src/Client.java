import java.net.MalformedURLException;
import java.rmi.Naming;
import java.rmi.NotBoundException;
import java.rmi.RemoteException;

public class Client {

    private static RMIService service;

    public static void main(String[] args) throws MalformedURLException, NotBoundException, RemoteException {
        service = (RMIService) Naming.lookup("rmi://localhost:5099/RMIService");
    }
}
