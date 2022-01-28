import java.util.Arrays;
import java.util.List;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class TopicController {

	@RequestMapping("/topics")
	public List<Topics> getTopics() {
		
		return Arrays.asList(
				new Topics(1,"java","Ahmed"),
				new Topics(2,"spring boot","Saleem"),
				new Topics(3,"restapi","Ali")
				
				);
				
	}
}
