package simple.gameshop.controller;

import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

import java.util.Map;

@Slf4j
@Controller
public class IndexController {

    @GetMapping("/")
    public String index(Map<String, Object> model) {
        model.put("Name", "Ilya");

        return "index";
    }

    @PostMapping("/check")
    public String check(@RequestParam String answer) {
        log.info("Получили запрос: {}", answer);

        return "index";
    }
}
