import java.rmi.Naming;
import java.rmi.RemoteException;
import java.rmi.server.UnicastRemoteObject;

/**
 * User: Pavel Pozdeev, Texuna Technologies
 * Date: 8/19/2016
 */
public class MyRemoteImpl extends UnicastRemoteObject implements MyRemote {
    protected MyRemoteImpl() throws RemoteException {
    }

    public String sayHello() throws RemoteException {
        return "Server says, 'Hey'";
    }

    public static void main(String[] args) {
        try {
            MyRemote service = new MyRemoteImpl();
            Naming.rebind("RemoteHello", service);
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
