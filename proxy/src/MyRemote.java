import java.rmi.*;

/**
 * User: Pavel Pozdeev
 * Date: 8/19/2016
 */
public interface MyRemote extends Remote {
    public String sayHello() throws RemoteException;
}
