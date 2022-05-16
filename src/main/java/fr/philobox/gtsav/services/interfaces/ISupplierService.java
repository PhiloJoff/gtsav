package fr.philobox.gtsav.services.interfaces;

import fr.philobox.gtsav.entities.ShopEntity;
import fr.philobox.gtsav.entities.SupplierEntity;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.PageRequest;

import java.util.List;
import java.util.UUID;

public interface ISupplierService {
    SupplierEntity addSupplier(SupplierEntity supplier);
    boolean deleteSupplier(UUID id);
    SupplierEntity editSupplier(SupplierEntity supplier);
    SupplierEntity findSupplierByName(String name);

    List<SupplierEntity> findAllSupplier();
    Page<SupplierEntity> findAllSupplier(PageRequest pageRequest);
}
