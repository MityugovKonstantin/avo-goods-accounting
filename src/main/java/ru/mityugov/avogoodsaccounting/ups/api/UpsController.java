package ru.mityugov.avogoodsaccounting.ups.api;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;
import ru.mityugov.avogoodsaccounting.ups.models.Ups;

import java.util.HashMap;
import java.util.Map;

@Controller
@RequestMapping(path = "/ups")
public class UpsController {

    @GetMapping()
    public ModelAndView index() {
        Map<String, String> model = new HashMap<>();
        model.put("name", "Alexey");
        return new ModelAndView("index", model);
    }

    @PostMapping()
    public void add(Ups ups) {

    }
}
