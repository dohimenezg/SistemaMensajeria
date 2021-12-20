package co.unicauca.microkernel.plugins.chile;

import co.unicauca.microkernel.common.entities.Delivery;
import co.unicauca.microkernel.common.entities.Product;
import co.unicauca.microkernel.common.interfaces.IDeliveryPlugin;
/**
 * Plugin para envios a Chile
 * @author David Jiménez
 */
public class ChileDeliveryPlugin implements IDeliveryPlugin {

    /**
     * Calcular el costo de envío de un producto de la tienda enviado dentro de
     * Chile.
     *
     */
    public double calculateCost(Delivery delivery) {

        Product product = delivery.getProduct();

        // Costo base de 5
        double cost = 5;

        if (product.getWeight() > 3) {
            // Para productos de mas 3 kilos, se sumar� 0.3 al costo por cada 3 kilos
            cost += 0.3 * (int)( product.getWeight() / 3 );

        }

        return cost;
    }
}
