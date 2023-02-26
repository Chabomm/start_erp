package star.erp.com.user;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

import lombok.RequiredArgsConstructor;

@Controller
@RequiredArgsConstructor
public class UserController {
    

    @GetMapping("/index")
    public String index(Model model){
    
        // model.addAttribute("userList", starUserRepository.findAll());
        return "user/index";
    }
}
