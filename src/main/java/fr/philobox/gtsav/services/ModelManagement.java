package fr.philobox.gtsav.services;

import fr.philobox.gtsav.entities.ModelEntity;
import fr.philobox.gtsav.entities.ShopEntity;
import fr.philobox.gtsav.entities.SupplierEntity;
import fr.philobox.gtsav.repositories.ModelRepository;
import fr.philobox.gtsav.repositories.ShopRepository;
import fr.philobox.gtsav.repositories.SupplierRepository;
import fr.philobox.gtsav.services.interfaces.IModelService;
import fr.philobox.gtsav.services.interfaces.IShopService;
import fr.philobox.gtsav.services.interfaces.ISupplierService;
import lombok.AllArgsConstructor;

import javax.persistence.EntityNotFoundException;
import java.util.UUID;

@AllArgsConstructor
public class ModelManagement implements IModelService, ISupplierService {
    private ModelRepository modelRepository;
    private SupplierRepository supplierRepository;

    @Override
    public ModelEntity addModel(ModelEntity model) {
        model.setId(UUID.randomUUID());
        return modelRepository.save(model);
    }

    @Override
    public boolean deleteModel(UUID id) {
        modelRepository.deleteById(id);
        return true;
    }

    @Override
    public ModelEntity editModel(ModelEntity model) {
        ModelEntity editModel = modelRepository.findById(model.getId()).orElseThrow(() -> new EntityNotFoundException("Not found edited model"));
        if (editModel.getName() != model.getName())
            editModel.setName(model.getName());

        if (editModel.getSupplier().getName() != model.getSupplier().getName())
            editModel.setSupplier(model.getSupplier());
        modelRepository.save(editModel);
        return editModel;

    }

    @Override
    public ModelEntity findModelByName(String name) {
        return modelRepository.findByName(name);
    }

    @Override
    public SupplierEntity addSupplier(SupplierEntity supplier) {
        supplier.setId(UUID.randomUUID());
        return supplierRepository.save(supplier);
    }

    @Override
    public boolean deleteSupplier(UUID id) {
        supplierRepository.deleteById(id);
        return true;
    }

    @Override
    public SupplierEntity editSupplier(SupplierEntity supplier) {
        SupplierEntity editSupplier = supplierRepository.findById(supplier.getId()).orElseThrow(() -> new EntityNotFoundException("Not found edited supplier"));
        if (editSupplier.getName() != supplier.getName())
            editSupplier.setName(supplier.getName());

        supplierRepository.save(editSupplier);
        return editSupplier;
    }

    @Override
    public SupplierEntity findByName(String name) {
        return supplierRepository.findByName(name);
    }
}
