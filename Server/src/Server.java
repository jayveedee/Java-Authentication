import rmi.RMIServant;

import java.rmi.RemoteException;
import java.rmi.registry.LocateRegistry;
import java.rmi.registry.Registry;

public class Server {

    private static final int PORT = 60000;
    private static final String SERVANT = "RMIServant";

    public static void main(String[] args) throws RemoteException {
        Registry registry = LocateRegistry.createRegistry(PORT);
        registry.rebind(SERVANT, new RMIServant());
    }
}
