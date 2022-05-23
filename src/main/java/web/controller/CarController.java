package web.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import service.CarService;
import service.CarServiceImpl;

@Controller
public class CarController {


    private final CarService carService = new CarServiceImpl();

    @GetMapping("/cars")
    public String cars(@RequestParam(value = "count", defaultValue = "999") Integer count, Model model) {
        if (count < 5) {
            model.addAttribute("carList", carService.carsCount(count));
        } else {
            model.addAttribute("carList", carService.carsCount(count));
        }
        return "carList";

    }
}
