package za.ac.cput.factory;

import za.ac.cput.entity.Shipment;
import za.ac.cput.util.GenericHelper;

import java.util.UUID;


public class ShipmentFactory
{
    // create all shipment object
    public static Shipment createShipment(String shipmentId, int shipmentCost, String customerName, String deliveryAddress, int contactNumber, int trackingNumber, String shipmentDate, String shipmentTime) {


        if (GenericHelper.isNullorEmpty(shipmentId) || GenericHelper.isNullorEmpty(shipmentId))
            return null;


        return new Shipment.Builder().setShipmentId(shipmentId).
                setShipmentCost(shipmentCost).
                setCustomerName(customerName).
                setDeliveryAddress(deliveryAddress).
                setContactNumber(contactNumber).
                setTrackingNumber(trackingNumber).
                setShipmentDate(shipmentDate).
                setShipmentTime(shipmentTime)
                .builder();
    }
}