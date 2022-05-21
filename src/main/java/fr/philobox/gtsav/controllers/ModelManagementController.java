package fr.philobox.gtsav.controllers;

import fr.philobox.gtsav.entities.ModelEntity;
import fr.philobox.gtsav.entities.SupplierEntity;
import fr.philobox.gtsav.services.ModelManagementService;
import lombok.AllArgsConstructor;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.PageRequest;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;

import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.IntStream;

@Controller
@AllArgsConstructor
public class ModelManagementController {
    private ModelManagementService modelManagementService;


    @GetMapping(path = "/models")
    public String getModels(Model model,
                            @RequestParam(name = "page", defaultValue = "1") Integer page,
                            @RequestParam(name="size", defaultValue = "10") Integer size,
                            @RequestParam(name = "name", defaultValue = "") String name
    ){
        return selectModels(model, page, size, name);
    }

    @PostMapping(path = "/models")
    public String postModels(Model model,
                             @RequestParam(name = "page", defaultValue = "1") Integer page,
                             @RequestParam(name="size", defaultValue = "10") Integer size,
                             @RequestParam(name = "name", defaultValue = "") String name
    ){
        return selectModels(model, page, size, name);
    }

    @GetMapping(path = "/add-model")
    public String newModel(Model model
    ) throws Exception {
        model.addAttribute("model", new ModelEntity());
        model.addAttribute("suppliers", modelManagementService.findAllSupplier());
        return "add-model";
    }

    @PostMapping(path = "/add-model")
    public String addModel(Model model,
                           @RequestParam(name = "name", required = true) String name,
                           @RequestParam(name = "id", required = true) String supplierId
    ) throws Exception {
        ModelEntity modelEntity = modelManagementService.addModel(name, supplierId);
        model.addAttribute("model", modelEntity);
        return "models";
    }


    public String selectModels(Model model, Integer page, Integer size, String name) {

        if (page < 1 )
            return "redirect:/models";
        if (size < 5)
            size = 5;
        Page<ModelEntity> pagesModel = modelManagementService.findAllModel(PageRequest.of(page - 1, size));
        if (!name.isEmpty() && name != null) {
            System.out.println(name);
            System.out.println(page);
            System.out.println(size);
            pagesModel = modelManagementService.findAllModelByNameContains(name, PageRequest.of(page - 1, size));
            model.addAttribute("name", name);
        }
        model.addAttribute("models", pagesModel.getContent());
        model.addAttribute("currentPage", pagesModel);
        List<Integer> totalPages = null;
        if (pagesModel.getTotalPages() > 0){
            totalPages = IntStream.rangeClosed(0,pagesModel.getTotalPages() - 1)
                    .boxed()
                    .collect(Collectors.toList());
        }
        model.addAttribute("totalPages", totalPages);

        List<SupplierEntity> suppliers = modelManagementService.findAllSupplier();
        model.addAttribute("suppliers", suppliers);

        return "models";
    }
}
