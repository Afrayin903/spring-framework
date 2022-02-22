package stereotype_annotation;


import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.stereotype.Component;


//Looking for all pojo classes under cydeo package annotated with @Component
//@ComponentScan(basePackages = "com.cydeo")
@Configuration
@ComponentScan
public class ConfigCourse {


}
