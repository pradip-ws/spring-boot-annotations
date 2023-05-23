package learning.springboot.springbootannotations.value;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

@Component
public class ValueAnnotationDemo {

    @Value("${mail.host}")
    private String host;

    @Value("${mail.password}")
    private String password;

    @Value("${mail.email}")
    private String email;

    @Value("Default Name")
    private  String defaultName;

//    @Value("${HOME}")
//    private  String homeDir;
//
//    @Value("${java.home}")
//    private String javaHome;

    public String getDefaultName() {
        return defaultName;
    }

    public String getHost() {
        return host;
    }

    public String getPassword() {
        return password;
    }

    public String getEmail() {
        return email;
    }

//    public String getHomeDir() {
//        return homeDir;
//    }
//
//    public String getJavaHome() {
//        return javaHome;
//    }
}
