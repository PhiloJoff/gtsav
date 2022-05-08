package fr.philobox.gtsav.controllers;

import fr.philobox.gtsav.entities.ModelEntity;
import fr.philobox.gtsav.services.ModelManagementService;
import lombok.AllArgsConstructor;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.PageRequest;
import org.springframework.data.domain.Pageable;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;

import java.util.List;

@Controller
@AllArgsConstructor
public class ModelManagementController {
    private ModelManagementService modelManagementService;


    @GetMapping(path = "/models")
    public String getModels(Model model, @RequestParam(name = "page", defaultValue = "0") int page, @RequestParam(name="size", defaultValue = "5") int size){
        Pageable pageable = PageRequest.of(page,size);
        Page<ModelEntity> pageModels = modelManagementService.findAllModel(pageable);
        model.addAttribute("models", pageModels.getContent());
        model.addAttribute("page", pageable);
        return "models";
    }
}
