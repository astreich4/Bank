package bank;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

import java.util.Objects;

/**
 *
 * @author adamstreich
 */
public abstract class User implements Permisions {
    private Credentials cred;
    private int ID;
    private static int nextID = 0;
    
    public User(Credentials cd){
        this.cred = cd;
        ID = nextID;
        nextID += 1;
    }

    public User(){
        // no credentials for testing
        ID = nextID;
        nextID += 1;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        User user = (User) o;
        return ID == user.ID;
    }

    @Override
    public int hashCode() {
        return Objects.hash(ID);
    }
    
    public Credentials getCreds(){
        return this.cred;
    }

    @Override
    public String toString() {
        return cred.toString();
    }

    public int getID() {
        return ID;
    }
    
    
}
