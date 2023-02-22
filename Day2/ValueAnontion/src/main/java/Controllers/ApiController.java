package Controllers;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class ApiController {
 @Value("${value.Name}")
 private String name;
 @GetMapping("/")
  public String getValue() 
 {
	 return name;
 }
}
