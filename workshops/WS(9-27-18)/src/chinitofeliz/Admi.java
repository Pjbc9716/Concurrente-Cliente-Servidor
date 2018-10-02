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
        this.empresaList = new Empresa [2];
        this.personList = new Person [2];
    }
    
    public void addContact(){
        this.empresaList[0] = new Empresa("San Jose", "N/A", "Empresa", "Chinitofeliz", "chinito@gmail.com", "2222-5555", 1000, 20);
        this.empresaList[1] = new Empresa("San Jose", "N/A", "Empresa", "Chinitofeliz2", "chinito@gmail.com", "2222-5555", 1, 2);
        
        this.personList[0] = new Person("Bustos", "Cliente", "Pablo", "pablo@gmail.com", "88002565", 10, 20);
        this.personList[1] = new Person("Bustos", "Cliente", "Pablo", "pablo@gmail.com", "88002565", 100000, 20);
    }
    public String costCompany(Empresa e){
            int costBeforeDiscount = e.getCantBurrito()*2+e.getCantPizza()*3;
            double costWithDiscount = (costBeforeDiscount-(costBeforeDiscount*0.05));
            double totalCost = costWithDiscount*1.13;
            return "Cantidad de burritos: "+e.getCantBurrito()+"\nCantidad de pizzas: "+e.getCantPizza()+
                    "\nPrecio de la orden: $"+totalCost;
        }
    
    public String costPerson (Person p){
        int costBeforeDiscount = (p.getCantBurrito()*2+p.getCantPizza());
        double costWithDiscount = costBeforeDiscount-(costBeforeDiscount*0.05);
        double totalCost = costWithDiscount*1.13;
        return "Cantidad de burritos: "+p.getCantBurrito()+"\nCantidad de pizzas: "+p.getCantPizza()+
                    "\nPrecio de la orden: $"+totalCost;
    }
    
    public void viewContact(){
        System.out.println("Facturas de Empresas:");
        for (Empresa e : empresaList){
            System.out.println(e.toString());
            System.out.println("--Orden del Cliente--");
            System.out.println(this.costCompany(e));
            System.out.println("");
        }
        System.out.println("");
        System.out.println("Facturas de Personas:");
        for (Person p : personList){
            System.out.println(p.toString());
            System.out.println("--Orden del Cliente--");
            System.out.println(this.costPerson(p));
            System.out.println("");
        }
    }
}
