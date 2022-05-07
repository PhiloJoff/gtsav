package fr.philobox.gtsav.services.interfaces;

import fr.philobox.gtsav.entities.ShopEntity;

import java.util.UUID;

public interface IShopService {
    public ShopEntity addShop(ShopEntity shop);
    public boolean deleteShop(UUID id);
    public ShopEntity editShop(ShopEntity shop);
}
