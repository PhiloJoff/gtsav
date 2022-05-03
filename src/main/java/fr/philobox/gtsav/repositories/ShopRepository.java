package fr.philobox.gtsav.repositories;

import fr.philobox.gtsav.entities.ShopEntity;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.UUID;

public interface ShopRepository extends JpaRepository<ShopEntity, UUID> {
}
