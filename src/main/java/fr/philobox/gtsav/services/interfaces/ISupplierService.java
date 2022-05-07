package fr.philobox.gtsav.services.interfaces;

import fr.philobox.gtsav.entities.ShopEntity;
import fr.philobox.gtsav.entities.SupplierEntity;

import java.util.UUID;

public interface ISupplierService {
    SupplierEntity addSupplier(SupplierEntity supplier);
    boolean deleteSupplier(UUID id);
    SupplierEntity editSupplier(SupplierEntity supplier);
    SupplierEntity findByName(String name);
}
