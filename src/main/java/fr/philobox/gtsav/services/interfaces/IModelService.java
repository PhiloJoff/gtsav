package fr.philobox.gtsav.services.interfaces;

import fr.philobox.gtsav.entities.ModelEntity;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.PageRequest;
import org.springframework.data.domain.Pageable;

import java.util.List;
import java.util.UUID;

public interface IModelService {
    ModelEntity addModel(ModelEntity model);
    boolean deleteModel(UUID id);
    ModelEntity editModel(ModelEntity model);
    ModelEntity findModelByName(String name);
    Page<ModelEntity> findAllModel(Pageable Pageable);
    Page<ModelEntity> findAllModelByNameContains(String name, Pageable pageable);

}
