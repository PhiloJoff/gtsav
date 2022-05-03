package fr.philobox.gtsav.repositories;

import fr.philobox.gtsav.entities.TicketEntity;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.UUID;

public interface TicketRepository extends JpaRepository<TicketEntity, UUID> {
}
