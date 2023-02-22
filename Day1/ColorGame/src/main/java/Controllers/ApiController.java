package Controllers;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class ApiController {
private String yourFavColor ="Green";
@GetMapping("/")
public String getMyFav() {
	return "My Favorite color is "+yourFavColor;
}

}
