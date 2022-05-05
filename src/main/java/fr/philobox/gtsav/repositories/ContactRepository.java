package fr.philobox.gtsav.repositories;

import fr.philobox.gtsav.entities.CategoryEntity;
import fr.philobox.gtsav.entities.ContactEntity;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.UUID;

public interface ContactRepository extends JpaRepository<ContactEntity, UUID>
{
}
