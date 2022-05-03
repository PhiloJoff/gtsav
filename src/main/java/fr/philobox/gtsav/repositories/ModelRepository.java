package fr.philobox.gtsav.repositories;

import fr.philobox.gtsav.entities.ModelEntity;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.UUID;

public interface ModelRepository extends JpaRepository<ModelEntity, UUID> {
}
