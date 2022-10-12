package rmi;

import java.rmi.RemoteException;
import java.rmi.server.RMIClientSocketFactory;
import java.rmi.server.RMIServerSocketFactory;
import java.rmi.server.UnicastRemoteObject;

public class RMIServant extends UnicastRemoteObject implements RMIService {

    ////////////////////////////////////////////////////////////////////
    //                         Constructors                           //
    ////////////////////////////////////////////////////////////////////
    public RMIServant() throws RemoteException {
    }

    public RMIServant(int port) throws RemoteException {
        super(port);
    }

    public RMIServant(int port, RMIClientSocketFactory csf, RMIServerSocketFactory ssf) throws RemoteException {
        super(port, csf, ssf);
    }

    ////////////////////////////////////////////////////////////////////
    //                           Overrides                            //
    ////////////////////////////////////////////////////////////////////
    @Override
    public String helloWorld(String hello) throws RemoteException {
        return String.format("%s %s", hello, "World");
    }

    @Override
    public String print(String filename, String printer) throws RemoteException {
        //TODO
        return null;
    }

    @Override
    public void queue(String printer) throws RemoteException {
        //TODO
    }

    @Override
    public void topQueue(String printer, int job) throws RemoteException {
        //TODO
    }

    @Override
    public void start() throws RemoteException {
        //TODO
    }

    @Override
    public void stop() throws RemoteException {
        //TODO
    }

    @Override
    public void restart() throws RemoteException {
        //TODO
    }

    @Override
    public String status(String printer) throws RemoteException {
        //TODO
        return null;
    }

    @Override
    public void readConfig(String parameter) throws RemoteException {
        //TODO
    }

    @Override
    public void setConfig(String parameter, String value) throws RemoteException {
        //TODO
    }
}

