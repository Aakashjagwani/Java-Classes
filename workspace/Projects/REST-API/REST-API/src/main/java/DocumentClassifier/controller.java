package DocumentClassifier;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;
import org.springframework.web.servlet.ModelAndView;

@RestController
public class controller {
	@Autowired
	RestTemplate restTemplate;
    
	  @RequestMapping("/")
	    public ModelAndView home() {
	        return new ModelAndView("index");
	    }
	    @RequestMapping("Aya")
	    public ModelAndView former() {
	        return new ModelAndView("GetFile");
	    }
	    @RequestMapping("TestC")
	    public ModelAndView show(@RequestParam(value="f") String name) {
	    	Value v1 = restTemplate.getForObject("http://127.0.0.1:5000/document-classifier/api/v1/test?test_document_path="+name, Value.class);
	    	System.out.println(v1);
	    	return new ModelAndView("shwSent","valueobj",v1);
	    }	    
	    @RequestMapping("/statusRead")
	    public String Statshow(){
	    	String stats=null;
	    	RespText resp = restTemplate.getForObject("http://127.0.0.1:5000/document-classifier/api/v1/showStatus?resptext="+stats, RespText.class);
	    	stats =resp.getResptext();
	    	return stats;
	    }
	    @RequestMapping("showRes")
	    public ModelAndView res() {
	    	//call api and ask result whether aoi or mc
	    	//load result to model and show in shwRes
	        return new ModelAndView("shwRes");
	    }
	}