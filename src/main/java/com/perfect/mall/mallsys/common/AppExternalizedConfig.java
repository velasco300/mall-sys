package com.perfect.mall.mallsys.common;

import lombok.Data;
import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.cloud.context.config.annotation.RefreshScope;
import org.springframework.stereotype.Component;

@Data
@Component
@ConfigurationProperties(prefix = "app")
@RefreshScope
public class AppExternalizedConfig {
    /**
     * 启用补单功能
     */
    private boolean enable;

    /**
     * 日结时间
     */
    private String time;
}
