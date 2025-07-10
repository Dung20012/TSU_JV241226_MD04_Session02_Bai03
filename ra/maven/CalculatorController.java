package ra.maven;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
public class CalculatorController {

    @GetMapping("/")
    public String showForm() {
        return "index";
    }

    @PostMapping("/calculate")
    public String calculate(@RequestParam("firstNumber") double first,
                            @RequestParam("secondNumber") double second,
                            @RequestParam("operator") String operator,
                            Model model) {
        String result;

        switch (operator) {
            case "+":
                result = String.valueOf(first + second);
                break;
            case "-":
                result = String.valueOf(first - second);
                break;
            case "*":
                result = String.valueOf(first * second);
                break;
            case "/":
                if (second == 0) {
                    result = "You don’t divide for 0";
                } else {
                    result = String.valueOf(first / second);
                }
                break;
            default:
                result = "Invalid operator!";
        }

        model.addAttribute("firstNumber", first);
        model.addAttribute("secondNumber", second);
        model.addAttribute("operator", operator);
        model.addAttribute("result", result);
        return "result";
    }
}
