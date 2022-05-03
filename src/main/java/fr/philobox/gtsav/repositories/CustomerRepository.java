package fr.philobox.gtsav.repositories;

import fr.philobox.gtsav.entities.CustomerEntity;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.UUID;

public interface CustomerRepository extends JpaRepository<CustomerEntity, UUID>
{
}
