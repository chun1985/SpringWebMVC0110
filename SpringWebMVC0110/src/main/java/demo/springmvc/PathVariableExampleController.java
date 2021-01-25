
package demo.springmvc;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;

@Controller
public class PathVariableExampleController {

	// URI ex. web/fe/default/en/document/8080/spring-mvc-for-beginners
	//              web/fe/default/tw/document/8080/spring-mvc
	@RequestMapping("/web/fe/{sitePrefix}/{language}/document/{id}/{naturalText}")
	public String documentView(Model model, @PathVariable(value = "sitePrefix") String sitePrefix,
			@PathVariable(value = "language") String language, @PathVariable(value = "id") Long id,
			@PathVariable(value = "naturalText") String naturalText) {
		model.addAttribute("sitePrefix", sitePrefix);
		model.addAttribute("language", language);
		model.addAttribute("id", id);
		model.addAttribute("naturalText", naturalText);
		String documentName = "Java tutorial for Beginners";
		if (id == 8080) {
			documentName = "Spring MVC for Beginners";
		}
		model.addAttribute("documentName", documentName);
		return "documentView";
	}
}