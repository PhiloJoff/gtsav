package fr.philobox.gtsav.services.interfaces;

import fr.philobox.gtsav.entities.ModelEntity;
import fr.philobox.gtsav.entities.ShopEntity;
import fr.philobox.gtsav.repositories.ModelRepository;

import java.util.UUID;

public interface IModelService {
    ModelEntity addModel(ModelEntity model);
    boolean deleteModel(UUID id);
    ModelEntity editModel(ModelEntity model);

    ModelEntity findModelByName(String name);


}
