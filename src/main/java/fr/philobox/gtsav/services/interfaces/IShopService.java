package fr.philobox.gtsav.services.interfaces;

import fr.philobox.gtsav.entities.ShopEntity;

import java.util.UUID;

public interface IShopService {
    ShopEntity addShop(ShopEntity shop);
    boolean deleteShop(UUID id);
    ShopEntity editShop(ShopEntity shop);
}
