package web.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import web.dao.CarDAO;



@Controller
public class CarsController {

    @Autowired
    private CarDAO carDAO;

    @GetMapping("/cars")
    public String getCars(@RequestParam(value = "count", required = false) String cars, Model model){
        model.addAttribute("cars", carDAO.index(cars));
        return "/cars";
    }
}
