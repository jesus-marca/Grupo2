package tienda.models;

public class NacionalImpuesto extends Impuesto {

    private Double impuesto;

    @Override
    public void calcularImpuesto(Pedido order) {
        igv(order);
    }
    public double igv(Pedido order){
        impuesto=order.getMontoTotal()*0.18;
        return impuesto;
    }
}
 