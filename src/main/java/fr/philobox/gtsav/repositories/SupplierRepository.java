package fr.philobox.gtsav.repositories;

import fr.philobox.gtsav.entities.SupplierEntity;
import org.springframework.data.domain.PageRequest;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;
import java.util.UUID;

public interface SupplierRepository extends JpaRepository<SupplierEntity, UUID> {
    SupplierEntity findByName(String name);
}
