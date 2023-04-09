package cn.itcast.order;

import com.example.feign.clients.UserClient;
import com.example.feign.config.FeignClientConfiguration;
import com.netflix.loadbalancer.IRule;
import com.netflix.loadbalancer.RandomRule;
import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.loadbalancer.LoadBalanced;
import org.springframework.cloud.openfeign.EnableFeignClients;
import org.springframework.context.annotation.Bean;
import org.springframework.web.client.RestTemplate;

@EnableFeignClients(defaultConfiguration = FeignClientConfiguration.class,clients = {UserClient.class})
@MapperScan("cn.itcast.order.mapper")
@SpringBootApplication
//@EnableEurekaClient
public class OrderApplication {

    public static void main(String[] args) {
        SpringApplication.run(OrderApplication.class, args);
    }

    /*
    * 创建RestTemplate并注入Spring容器
    * */
//    @Bean
//    @LoadBalanced
//    public RestTemplate restTemplate(){ return new RestTemplate();}

//    @Bean
//    public IRule randomRule(){return new RandomRule();
//    }

}