import com.MyProject.com.MyProject.model.SpeakerService;
import com.MyProject.com.MyProject.model.SpeakerServiceImpl;

public class Application {

    public static void main(String[] args) {
        SpeakerService speakerService = new SpeakerServiceImpl();
        System.out.println(speakerService.findAll().get(0).getFirstName());
    }
}
