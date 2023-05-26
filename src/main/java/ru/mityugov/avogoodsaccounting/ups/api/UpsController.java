package ru.mityugov.avogoodsaccounting.ups.api;

import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import ru.mityugov.avogoodsaccounting.status.service.StatusService;
import ru.mityugov.avogoodsaccounting.ups.models.Ups;

import java.util.ArrayList;
import java.util.List;

@Controller
@RequestMapping(path = "/avo/ups")
@RequiredArgsConstructor
public class UpsController {

    private final StatusService statusService;

    @GetMapping(path = "/create")
    public String createModel(Model model) {

        List<String> persons = new ArrayList<>();
        persons.add("Nick");
        persons.add("Bob");
        persons.add("May");

        List<String> buildings = new ArrayList<>();
        buildings.add("ФЭТ");
        buildings.add("РК");
        buildings.add("ГК");

        List<String> statuses = statusService.get();

        model.addAttribute("persons", persons);
        model.addAttribute("buildings", buildings);
        //model.addAttribute("cabinets", cabinets);
        model.addAttribute("statuses", statuses);
        model.addAttribute("ups", new Ups());

        return "create_ups";
    }

    @PostMapping("/create")
    public String add(Ups ups) {
        return "index";
    }

    @GetMapping("/show")
    public String showList() {
        return "list_ups";
    }

    @GetMapping("/change_ups")
    public String showChange() {
        return "change_ups";
    }
}
