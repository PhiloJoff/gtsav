package fr.philobox.gtsav.repositories;

import fr.philobox.gtsav.entities.TypeItemEntity;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.UUID;

public interface TypeItemRepository extends JpaRepository<TypeItemEntity, UUID> {
}
