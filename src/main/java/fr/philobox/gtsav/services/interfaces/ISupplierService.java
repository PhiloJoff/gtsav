package fr.philobox.gtsav.services.interfaces;

import fr.philobox.gtsav.entities.ShopEntity;
import fr.philobox.gtsav.entities.SupplierEntity;

import java.util.UUID;

public interface ISupplierService {
    public SupplierEntity addSupplier(SupplierEntity supplier);
    public boolean deleteSupplier(UUID id);
    public SupplierEntity editSupplier(SupplierEntity supplier);
    public SupplierEntity findByName(String name);
}
