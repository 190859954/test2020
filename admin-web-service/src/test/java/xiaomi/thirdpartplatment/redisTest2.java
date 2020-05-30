package xiaomi.thirdpartplatment;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * Created by Administrator on 2019/8/27 0027.
 */
public class redisTest2 {

    public static void main(String[] args) {
        ApplicationContext applicationContext=new ClassPathXmlApplicationContext("classpath:*/spring-redis.xml");
    }

}
