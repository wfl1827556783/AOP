import org.example.config.MainConfiguration;
import org.example.entity.Student;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class Main {
    public static void main(String[] args){
        ApplicationContext context = new AnnotationConfigApplicationContext(MainConfiguration.class);
        Student bean = context.getBean(Student.class);
        bean.study();
    }
}
