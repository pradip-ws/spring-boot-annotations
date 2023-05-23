package learning.springboot.springbootannotations.propertysource;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.core.env.Environment;
import org.springframework.stereotype.Component;

@Component
public class PropertySourceDemo {

    @Autowired
    private Environment environment;
    @Value("${gmail.host}")
    private String host;

    @Value("${gmail.password}")
    private String password;

    @Value("${gmail.email}")
    private String email;

    @Value("${app.name}")
    private String appName;

    @Value(("${app.description}"))
    private String appDescription;

    public String getHost() {
        return host;
    }

    public String getPassword() {
        return password;
    }

    public String getEmail() {
        return email;
    }

    public String getAppName() {
        return environment.getProperty("app.name");
    }

    public String getAppDescription() {
        return environment.getProperty("app.description");
    }
}
