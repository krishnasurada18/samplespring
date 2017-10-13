package samplespring;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

@Controller
public class BarcodeController {
	@Autowired
	BarcodeService bs;
	@RequestMapping("/")
	public ModelAndView showFirst(){ 
	
	ModelAndView mv=new ModelAndView("index");
	return mv;
}		
}
