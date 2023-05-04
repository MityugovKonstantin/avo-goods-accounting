package ru.mityugov.avogoodsaccounting.ups.api;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;
import ru.mityugov.avogoodsaccounting.ups.models.Ups;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

@Controller
@RequestMapping(path = "/avo/ups")
public class UpsController {

    @GetMapping(path = "/create")
    public String create(Model model) {
        List<String> persons = new ArrayList<>();
        persons.add("Nick");
        persons.add("Bob");
        persons.add("May");

        List<String> locations = new ArrayList<>();
        locations.add("ФЭТ");
        locations.add("РК");
        locations.add("ГК");

        List<String> statuses = new ArrayList<>();
        statuses.add("Работает");
        statuses.add("Не работает");
        statuses.add("В ремонте");

        model.addAttribute("persons", persons);
        model.addAttribute("locations", locations);
        model.addAttribute("statuses", statuses);
        model.addAttribute("ups", new Ups());

        return "create_ups";
    }

    @PostMapping("/create")
    public String add(Ups ups) {
        System.out.println("Создана запись: ");
        System.out.println(ups.toString());
        return "index";
    }
}
