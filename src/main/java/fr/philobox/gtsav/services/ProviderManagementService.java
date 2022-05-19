package fr.philobox.gtsav.services;

import fr.philobox.gtsav.entities.MaintenanceOperationEntity;
import fr.philobox.gtsav.entities.ProviderEntity;
import fr.philobox.gtsav.repositories.MaintenanceOperationRepository;
import fr.philobox.gtsav.repositories.ProviderRepository;
import fr.philobox.gtsav.services.interfaces.IMaintenanceOperationService;
import fr.philobox.gtsav.services.interfaces.IProviderService;
import lombok.AllArgsConstructor;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.stereotype.Service;

import java.util.UUID;

@Service
@AllArgsConstructor
public class ProviderManagementService implements IProviderService, IMaintenanceOperationService {
    private MaintenanceOperationRepository maintenanceOperationRepository;
    private ProviderRepository providerRepository;

    public ProviderEntity addProvider(ProviderEntity providerEntity) {
        return providerRepository.save(providerEntity);
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
    public Page<ProviderEntity> findAllProvider(Pageable pageable) {
        return providerRepository.findAll(pageable);
    }

    @Override
    public Page<ProviderEntity> findAllProviderByNameContains(String name, Pageable pageable) {
        return null;
    }

    public ProviderEntity updateProvider(ProviderEntity providerEntity) { return providerRepository.save(providerEntity);}

    public MaintenanceOperationEntity addMaintenanceOperation(MaintenanceOperationEntity mop) {
        return maintenanceOperationRepository.save(mop);
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
    public Page<MaintenanceOperationEntity> findAllMaintenanceOperation(Pageable Pageable) {
        return null;
    }

}
