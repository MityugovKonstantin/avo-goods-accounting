package ru.mityugov.avogoodsaccounting.person.api;

import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import ru.mityugov.avogoodsaccounting.ups.models.Ups;

@Controller
@RequestMapping(path = "/avo/person")
@RequiredArgsConstructor
public class PersonController {

    @GetMapping("/create")
    public String index(Model model) {
        return "create_person";
    }

    @PostMapping("/create")
    public String add(Ups ups) {
        return "index";
    }

}
