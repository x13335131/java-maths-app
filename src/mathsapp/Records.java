/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package mathsapp;

import java.io.Serializable;

/**
 *
 * 
 */
public class Records implements Serializable{
    private String name;
    private String surname;
    private String history;
    
    public Records(){
        name = new String();
        surname = new String();
        history = new String();
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getSurname() {
        return surname;
    }

    public void setSurname(String surname) {
        this.surname = surname;
    }

    public String getHistory() {
        return history;
    }

    public void setHistory(String history) {
        this.history = history;
    }
    
    
    
}
