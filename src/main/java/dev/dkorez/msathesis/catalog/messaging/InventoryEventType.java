package dev.dkorez.msathesis.catalog.messaging;

public enum InventoryEventType {
    ORDER_CREATED,
    ORDER_CANCELLED,
    PAYMENT_PROCESSED,
    INVENTORY_RESERVED,
    INVENTORY_RELEASED,
    INVENTORY_UPDATED
}
