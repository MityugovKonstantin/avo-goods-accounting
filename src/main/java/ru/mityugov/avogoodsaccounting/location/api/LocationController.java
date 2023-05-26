package ru.mityugov.avogoodsaccounting.location.api;

import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import ru.mityugov.avogoodsaccounting.ups.models.Ups;

@Controller
@RequestMapping(path = "/avo/location")
@RequiredArgsConstructor
public class LocationController {

    @GetMapping("/create")
    public String index(Model model) {
        return "create_location";
    }

    @PostMapping("/create")
    public String add(Ups ups) {
        return "index";
    }

}