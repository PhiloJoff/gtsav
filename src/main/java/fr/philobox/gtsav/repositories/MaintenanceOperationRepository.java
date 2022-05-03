package fr.philobox.gtsav.repositories;

import fr.philobox.gtsav.entities.MaintenanceOperationEntity;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.UUID;

public interface MaintenanceOperationRepository extends JpaRepository<MaintenanceOperationEntity, UUID> {
}
