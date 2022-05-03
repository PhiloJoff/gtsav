package fr.philobox.gtsav.repositories;

import fr.philobox.gtsav.entities.SupplierEntity;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.UUID;

public interface SupplierRepository extends JpaRepository<SupplierEntity, UUID> {
}
