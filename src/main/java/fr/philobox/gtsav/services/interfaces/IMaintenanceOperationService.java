package fr.philobox.gtsav.services.interfaces;

import fr.philobox.gtsav.entities.MaintenanceOperationEntity;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;

import java.util.UUID;

public interface IMaintenanceOperationService {
    MaintenanceOperationEntity addMaintenanceOperation(MaintenanceOperationEntity maintenanceOperation);
    boolean deleteMaintenanceOperation(UUID id);
    Page<MaintenanceOperationEntity> findAllMaintenanceOperation(Pageable Pageable);

}
