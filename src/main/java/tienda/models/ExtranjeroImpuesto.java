package tienda.models;

public class ExtranjeroImpuesto extends Impuesto {
    private Double impuesto;

    @Override
    public void calcularImpuesto(Pedido order) {
        impuestoInternacional(order);
    }
    public double impuestoInternacional(Pedido order){
        impuesto=order.getMontoTotal()*0.03;
        return impuesto;
    }
}