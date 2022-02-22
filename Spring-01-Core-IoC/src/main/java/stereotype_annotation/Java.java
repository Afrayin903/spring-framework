package stereotype_annotation;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.stereotype.Component;

@Component
public class Java {
    public void getTeachingHours(){
        System.out.println("Total teaching hours : 250");
    }
}
