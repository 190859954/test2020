package xiaomi.thirdpartplatment.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.redis.connection.Message;
import org.springframework.data.redis.connection.MessageListener;
import org.springframework.data.redis.core.RedisTemplate;
import org.springframework.stereotype.Service;

/**
 * Created by Administrator on 2019/8/27 0027.
 */
@Service
public class MyRedisListener implements MessageListener {
    @Autowired
    private RedisTemplate redisTemplate;

    @Override
    public void onMessage(Message message, byte[] bytes) {
        String jsonStr = (String) redisTemplate.opsForValue().get("idcast");
        System.out.print("channel:" + new String(message.getChannel()) + "body:" + new String(message.getBody()));


    }

}
