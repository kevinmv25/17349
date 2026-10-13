package mx.uv.fei.demo;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.ui.Model;

@Controller
public class PlantillaControlador{
    @GetMapping("/plantilla")
    public void plantilla(Model model){

    }
}