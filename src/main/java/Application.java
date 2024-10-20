import com.MyProject.service.SpeakerService;
import com.MyProject.service.SpeakerServiceImpl;

public class Application {

    public static void main(String[] args) {
        SpeakerService speakerService = new SpeakerServiceImpl();
        System.out.println(speakerService.findAll().get(0).getFirstName());
    }
}
