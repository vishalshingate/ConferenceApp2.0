import com.MyProject.com.MyProject.model.SpeakerService;
import com.MyProject.com.MyProject.model.SpeakerServiceImpl;
import com.MyProject.repository.SpeakerRepository;
import com.MyProject.repository.StubSpeakerRepositoryImpl;
import org.springframework.beans.factory.config.BeanDefinition;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Scope;

/**
 * Configuration class for Spring application context.
 * <p>
 * The @Configuration annotation in Spring indicates that the class can be used by the Spring IoC (Inversion of Control) container as a source of bean definitions.
 * It is typically used on classes that define one or more @Bean methods. These methods are used to instantiate, configure, and initialize objects that will be managed by the Spring container.
 * <p>
 * Key points:
 * - Bean Definitions: The class annotated with @Configuration contains methods annotated with @Bean that define beans.
 * - Spring IoC Container: The Spring container processes the @Configuration class to generate and manage the beans defined within it.
 * - Dependency Injection: The beans defined in the @Configuration class can be injected into other Spring-managed components.
 */
@Configuration
public class AppConfig {

    /**
     * Creates a bean for SpeakerService.
     * <p>
     * The @Bean annotation in Spring is used to indicate that a method produces a bean to be managed by the Spring container.
     * It is typically used within a class annotated with @Configuration. The method annotated with @Bean will return an object that will be registered as a bean in the Spring application context.
     * <p>
     * Key points:
     * - Bean Definition: The method annotated with @Bean defines a bean.
     * - Spring Container Management: The Spring container manages the lifecycle of the bean.
     * - Dependency Injection: The bean can be injected into other Spring-managed components.
     *
     * @return an instance of SpeakerServiceImpl
     */
    @Bean(name = "speakerService")
    @Scope(value = BeanDefinition.SCOPE_SINGLETON)
    public SpeakerService getSpeakerService() {
        SpeakerServiceImpl service = new SpeakerServiceImpl(getSpeakerRepository());
        return service;
    }

    /**
     * Creates a bean for SpeakerRepository.
     *
     * @return an instance of StubSpeakerRepositoryImpl
     */
    @Bean(name = "speakerRepository")
    public SpeakerRepository getSpeakerRepository() {
        return new StubSpeakerRepositoryImpl();
    }
}
