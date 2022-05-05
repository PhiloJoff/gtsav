package fr.philobox.gtsav.repositories;

import fr.philobox.gtsav.entities.TypeEntity;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.UUID;

public interface TypeRepository extends JpaRepository<TypeEntity, UUID> {
}
