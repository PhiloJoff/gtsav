package fr.philobox.gtsav.repositories;

import fr.philobox.gtsav.entities.SectionEntity;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.UUID;

public interface SectionRepository extends JpaRepository<SectionEntity, UUID> {
}
