package fr.philobox.gtsav.controllers;

import fr.philobox.gtsav.entities.ModelEntity;
import fr.philobox.gtsav.services.ModelManagementService;
import lombok.AllArgsConstructor;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.PageRequest;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;

import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.IntStream;

@Controller
@AllArgsConstructor
public class ModelManagementController {
    private ModelManagementService modelManagementService;


    @GetMapping(path = "/models")
    public String getModels(Model model, @RequestParam(name = "page", defaultValue = "1") Integer page, @RequestParam(name="size", defaultValue = "10") Integer size){
        if (page < 1 )
            return "redirect:/models?page=1";
        if (size < 5)
            size = 5;
        Page<ModelEntity> pagesModel = modelManagementService.findAllModel(PageRequest.of(page - 1,size));
        model.addAttribute("models", pagesModel.getContent());
        model.addAttribute("currentPage", pagesModel);
        if (pagesModel.getTotalPages() > 0){
            List<Integer> totalPages = IntStream.rangeClosed(0,pagesModel.getTotalPages() - 1)
                    .boxed()
                    .collect(Collectors.toList());
            model.addAttribute("totalPages", totalPages);
        }

        return "models";
    }
}
