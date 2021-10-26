package tienda.models;

public class Impuesto {
    public void calcularImpuesto(Pedido order){

        System.out.println("Pagando el impuesto"+ order.getMontoTotal());
    }
}