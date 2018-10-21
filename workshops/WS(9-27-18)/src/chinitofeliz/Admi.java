
package chinitofeliz;


public class  Admi {
    
    private Person [] personList;
    private Empresa [] empresaList;


    public Admi() {
        this.empresaList = new Empresa [2];
        this.personList = new Person [2];

    }
    // método para agregar contactos y unidades
    public void addContact(){
        this.empresaList[0] = new Empresa("San Jose", "N/A", "Empresa", "Chinitofeliz", "chinito@gmail.com", "2222-5555", 1000, 20);
        this.empresaList[1] = new Empresa("San Jose", "N/A", "Empresa", "Chinitofeliz2", "chinito@gmail.com", "2222-5555", 1, 2); 
        this.personList[0] = new Person("Bustos", "Cliente", "Pablo", "pablo@gmail.com", "88002565", 10, 20);
        this.personList[1] = new Person("Bustos", "Cliente", "Pablo", "pablo@gmail.com", "88002565", 100000, 20);

          
    }
    
      
    public String costCompany(Empresa e){//método get con parametro de tipo empresa
             /*burrito = $2;
               pizza = $3;
               burrito multiplicado por 2 más cantidad de pizza multiplicado por 3
            */
            int costBeforeDiscount = e.getCantBurrito()*2+e.getCantPizza()*3;
            //Aplicando descuento de un %5
            double costWithDiscount = (costBeforeDiscount-(costBeforeDiscount*0.05));
            /*Costo total más el %13 de impuesto
            double totalCost = costWithDiscount*1.13;*/
            double totalCost = costWithDiscount + (costWithDiscount*0.13); 
            return "Cantidad de burritos: "+e.getCantBurrito()+"\nCantidad de pizzas: "+e.getCantPizza()+
                    "\nPrecio de la orden: $"+totalCost;
        }
    
    public String costPerson (Person p){
        int totalBP = p.getCantBurrito()+p.getCantPizza();
        //condicional para saber si son más de 200 unidades y aplicarle un descuento 
        if(totalBP>200){
             /*  burrito = $2;
                 pizza = $3;
                 burrito multiplicado por 2 más cantidad de pizza multiplicado por 3
            */
        int costBeforeDiscount = (p.getCantBurrito()*2+p.getCantPizza()*3);
            /*Variable para saber si son más de 200 unidades entre burritos y pizza*/ 
           double costWithDiscount = costBeforeDiscount-(costBeforeDiscount*0.03);
           //costo total más el impuesto ce venta incluido %13
           double totalCost = costWithDiscount + (costWithDiscount*0.13); 
        return "Cantidad de burritos: "+p.getCantBurrito()+"\nCantidad de pizzas: "+p.getCantPizza()+
                    "\nPrecio de la orden: $"+totalCost;
        }else{
            int cost = (p.getCantBurrito()*2+p.getCantPizza()*3);
           //costo total más el impuesto ce venta incluido %13
           double totalCost = cost + (cost*0.13); 
        return "Cantidad de burritos: "+p.getCantBurrito()+"\nCantidad de pizzas: "+p.getCantPizza()+
                    "\nPrecio de la orden: $"+totalCost;
        }
    }
    
      public void viewContact(){
         System.out.println("Facturas de Empresas:");
        for (Empresa e : empresaList){//recorremos la lista 
            System.out.println(e.toStringE());//mustra la información
            System.out.println("--Orden del Cliente--");
            System.out.println(this.costCompany(e));//muestra la factura
            System.out.println("");
        }
        System.out.println("");
        System.out.println("Facturas de Personas:");
        for (Person p : personList){//recorremos lista
            System.out.println(p.toStringP());//muestra la informacion
            System.out.println("--Orden del Cliente--");
            System.out.println(this.costPerson(p));//muestra la factura
            System.out.println("");
        }
    }
}
