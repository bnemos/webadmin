package kg.megacom.blwebadmin.view;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class WebAdminController {

    @GetMapping("")
    public String getMain(){
        return "auth-login";
    }
}
