/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package chinitofeliz;

/**
 *
 * @author ulacit
 */
public class Admi {
    
    private Person [] personList;
    private Empresa [] empresaList;

    public Admi() {
        this.empresaList = new Empresa [100];
        this.personList = new Person [100];
    }
    
    public void addContact(){
        this.empresaList[0] = new Empresa("San Jose", "54544644", "empres", "Chinitofeliz1", "chinito@gmail.com", "45464", 10, 20);
    }
}
