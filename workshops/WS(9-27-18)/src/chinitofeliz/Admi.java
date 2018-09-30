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
        
        this.personList[0] = new Person("Bustos", "Cliente", "Pablo", "pablo@gmail.com", "88002565", 1000, 20);
        this.personList[1] = new Person("Bustos", "Cliente", "Pablo", "pablo@gmail.com", "88002565", 1000, 20);
    }
    public String costCompany(Empresa e){
            int costBeforediscount = e.getCantBurrito()*2+e.getCantPizza()*3;
            double costWithdiscount = (costBeforediscount-(costBeforediscount*0.05));
            double totalCost = costWithdiscount*1.13;
            return "Cantidad de burritos: "+e.getCantBurrito()+"\nCantidad de pizzas: "+e.getCantPizza()+
                    "\nPrecio de la orden: $"+totalCost;
        }
    
    public void viewContact(){
        System.out.println("Facturas de Empresas:");
        System.out.println("");
        for (Empresa e : empresaList){
            System.out.println(e.toString());
            System.out.println("--Orden del Cliente--");
            System.out.println(this.costCompany(e));
            System.out.println("");
        }
        
    }
}
