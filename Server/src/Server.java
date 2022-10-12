import java.rmi.RemoteException;
import java.rmi.server.RMIClientSocketFactory;
import java.rmi.server.RMIServerSocketFactory;
import java.rmi.server.UnicastRemoteObject;

public class Server extends UnicastRemoteObject implements RMIService {

    protected Server() throws RemoteException {
    }

    protected Server(int port) throws RemoteException {
        super(port);
    }

    protected Server(int port, RMIClientSocketFactory csf, RMIServerSocketFactory ssf) throws RemoteException {
        super(port, csf, ssf);
    }

    @Override
    public String print(String filename, String printer) throws RemoteException {
        return null;
    }

    @Override
    public void queue(String printer) throws RemoteException {

    }

    @Override
    public void topQueue(String printer, int job) throws RemoteException {

    }

    @Override
    public void start() throws RemoteException {

    }

    @Override
    public void stop() throws RemoteException {

    }

    @Override
    public void restart() throws RemoteException {

    }

    @Override
    public String status(String printer) throws RemoteException {
        return null;
    }

    @Override
    public void readConfig(String parameter) throws RemoteException {

    }

    @Override
    public void setConfig(String parameter, String value) throws RemoteException {

    }
}
