package Controllers;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class ApiController {
 private String studentName;
public ApiController()
{ 
   this.studentName="IamNeo"; 	
}
@GetMapping("/")
public String getName() 
{
  return "Welcome "+studentName+"!";	
}
}
