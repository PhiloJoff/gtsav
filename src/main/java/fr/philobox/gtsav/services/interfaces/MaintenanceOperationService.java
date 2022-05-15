package fr.philobox.gtsav.services.interfaces;

import fr.philobox.gtsav.entities.MaintenanceOperationEntity;
import fr.philobox.gtsav.entities.ProviderEntity;
import fr.philobox.gtsav.repositories.MaintenanceOperationRepository;
import fr.philobox.gtsav.repositories.ProviderRepository;
import lombok.AllArgsConstructor;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;

import java.util.UUID;

@AllArgsConstructor
public class MaintenanceOperationService implements IProviderService, IMaintenanceOperationService {
    private MaintenanceOperationRepository maintenanceOperationRepository;
    private ProviderRepository providerRepository;

    public ProviderEntity addProvider(ProviderEntity providerEntity) {
        return providerService.addProvider(providerEntity);
    }

    @Override
    public boolean deleteProvider(UUID id) {
        return false;
    }

    @Override
    public ProviderEntity editProvider(ProviderEntity provider) {
        return null;
    }

    @Override
    public ProviderEntity findProviderByName(String name) {
        return null;
    }

    @Override
    public Page<ProviderEntity> findAllProvider(Pageable Pageable) {
        return null;
    }

    @Override
    public Page<ProviderEntity> findAllProviderByNameContains(String name, Pageable pageable) {
        return null;
    }

    public ProviderEntity updateProvider(ProviderEntity providerEntity)

    public MaintenanceOperationEntity addMaintenanceOperation(MaintenanceOperationEntity mop) {
        return maintenanceOperationService.addMaintenanceOperation(mop);
    }

    @Override
    public boolean deleteMaintenanceOperation(UUID id) {
        return false;
    }

    @Override
    public MaintenanceOperationEntity editMaintenanceOperation(MaintenanceOperationEntity maintenanceOperation) {
        return null;
    }

    @Override
    public MaintenanceOperationEntity findMaintenanceOperationByName(String name) {
        return null;
    }

    @Override
    public Page<MaintenanceOperationEntity> findAllMaintenanceOperation(Pageable Pageable) {
        return null;
    }

    @Override
    public Page<MaintenanceOperationEntity> findAllMaintenanceOperationByNameContains(String name, Pageable pageable) {
        return null;
    }
}
