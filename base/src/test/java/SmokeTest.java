import com.b.entity.Student;
import com.b.entity.config.ConfigMap;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.TestConfiguration;
import org.springframework.context.annotation.Bean;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit.jupiter.SpringExtension;

import javax.annotation.Resource;
import java.util.Map;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertTrue;

@ExtendWith(SpringExtension.class)
@ContextConfiguration(classes = {ConfigMap.class, SmokeTest.MapBeanConfiguration.class})
public class SmokeTest {

    @Autowired
    Student student;

    @TestConfiguration
    static class MapBeanConfiguration {
        @Bean
        public Student student() {
            Student student = new Student();
            student.setName("haha");
            return student;
        }
    }

    @Resource(name = "testBean")
    public Map<String, Object> mapBean;


    @Test
    public void tt() {
        System.out.println(mapBean.keySet());
        assertEquals("张三", mapBean.get("name"));
    }

    @Test
    public void tt1() {
        assertEquals("haha", student.getName());
    }
}
