package fr.philobox.gtsav.services.interfaces;

import fr.philobox.gtsav.entities.ProviderEntity;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;

import java.util.UUID;

public interface IProviderService {
    ProviderEntity addProvider(ProviderEntity provider);
    boolean deleteProvider(UUID id);
    ProviderEntity editProvider(ProviderEntity provider);
    ProviderEntity findProviderByName(String name);
    Page<ProviderEntity> findAllProvider(Pageable Pageable);
    Page<ProviderEntity> findAllProviderByNameContains(String name, Pageable pageable);

}
