package fr.philobox.gtsav.services.interfaces;

import fr.philobox.gtsav.entities.ModelEntity;
import fr.philobox.gtsav.entities.ShopEntity;
import fr.philobox.gtsav.repositories.ModelRepository;

import java.util.UUID;

public interface IModelService {
    public ModelEntity addModel(ModelEntity model);
    public boolean deleteModel(UUID id);
    public ModelEntity editModel(ModelEntity model);

    public ModelEntity findModelByName(String name);


}
