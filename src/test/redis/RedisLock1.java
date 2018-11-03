//package redis;
//
//import org.springframework.beans.factory.annotation.Autowired;
//import org.springframework.data.redis.core.RedisTemplate;
//import org.springframework.util.StreamUtils;
//import org.springframework.util.StringUtils;
//import redis.clients.jedis.Jedis;
//
//public class RedisLock1 {
//
//    @Autowired
//    RedisTemplate redisTemplate;
//
//    public boolean lock(String key, String value) {
//        if (redisTemplate.opsForValue().setIfAbsent(key, value)) {
//            //获得锁
//            return true;
//        }
//        String redisValue = (String) redisTemplate.opsForValue().get(key);
//        if (!StringUtils.isEmpty(redisValue) && Long.valueOf(redisValue) <= System.currentTimeMillis()) {
//            //锁过期
//            String oldValue = (String) redisTemplate.opsForValue().getAndSet(key, value);
//            if (!StringUtils.isEmpty(oldValue) && oldValue.equals(redisValue)) {
//                //防止不同的key进入
//                return true;
//            }
//        }
//        //等待锁或者不同可以进入
//        return false;
//    }
//}
