import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

/**
 * Created by ElMehdi Safieddine.
 */
@Configuration
public class SpringCoreConfig {

    @Bean
    public UserManagementDAO userManagementDAO() {
        return new UserManagementDAOImpl();
    }
}