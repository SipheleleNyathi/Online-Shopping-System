package za.ac.cput.factory;

import za.ac.cput.entity.Shipment;
import za.ac.cput.entity.ShoppingCart;
import za.ac.cput.util.GenericHelper;

import java.util.UUID;

public class ShoppingCartFactory
    {

        // create all account object
        public static ShoppingCart createShoppingCart (String cartId,int productId, int quantity, String dateAdded){


        if (GenericHelper.isNullorEmpty(cartId) || GenericHelper.isNullorEmpty(cartId))
            return null;


        return new ShoppingCart.Builder().setCartId(cartId).setProductId(productId).setQuantity(quantity).setDateAdded(dateAdded)
                .Builder();
    }
    }

