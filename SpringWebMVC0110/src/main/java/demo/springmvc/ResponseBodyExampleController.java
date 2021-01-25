
package demo.springmvc;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;

@Controller
public class ResponseBodyExampleController {
// Simple example, method returns String.
	@RequestMapping(value = "/saveResult")
	@ResponseBody
	public String authorInfo(Model model) {
		return "saved";
	}
}