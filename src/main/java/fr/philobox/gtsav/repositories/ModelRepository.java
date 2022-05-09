package fr.philobox.gtsav.repositories;

import fr.philobox.gtsav.entities.ModelEntity;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.PageRequest;
import org.springframework.data.domain.Pageable;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.UUID;

public interface ModelRepository extends JpaRepository<ModelEntity, UUID> {
    ModelEntity findByName(String name);
    Page<ModelEntity> findAllByNameContains(String name, Pageable pageable);
}
