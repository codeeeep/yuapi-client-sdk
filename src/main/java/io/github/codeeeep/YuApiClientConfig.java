package io.github.codeeeep;

import io.github.codeeeep.client.YuApiClient;
import lombok.Data;
import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

/**
 * @author codeep
 * @date 2024/3/5 14:36
 * @description: 这是一个配置类
 */
@Configuration
@ConfigurationProperties("yuapi.client")
@Data
@ComponentScan
public class YuApiClientConfig {

    private String apiKey;

    /**
     * 生成客户端方便用户调用
     */
    @Bean
    public YuApiClient yuApiClient() {
        return new YuApiClient(apiKey);
    }


}
