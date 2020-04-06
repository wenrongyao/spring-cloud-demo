package com.honor.config;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.cloud.netflix.zuul.filters.route.FallbackProvider;
import org.springframework.http.HttpHeaders;
import org.springframework.http.HttpStatus;
import org.springframework.http.MediaType;
import org.springframework.http.client.ClientHttpResponse;
import org.springframework.stereotype.Component;

import java.io.ByteArrayInputStream;
import java.io.IOException;
import java.io.InputStream;

/**
 * Created by rongyaowen
 * on 2020/4/5.
 * 配置Hystrix
 */
@Component
public class MyZuulFallBack implements FallbackProvider {
    private final Logger logger = LoggerFactory.getLogger(MyZuulFallBack.class);

    /**
     * getRoute方法的返回值就是要监听的挂掉的微服务名字
     * api服务id，如果需要所有调用都支持回退，则return "*"或return null
     *
     * @return
     */
    public String getRoute() {
        return "*";
    }

    public ClientHttpResponse fallbackResponse(String route, Throwable cause) {
        logger.info("--> route:{}进行熔断降级", route);
        return new ClientHttpResponse() {
            public HttpStatus getStatusCode() throws IOException {
                return HttpStatus.OK;
            }

            public int getRawStatusCode() throws IOException {
                return this.getStatusCode().value();
            }

            public String getStatusText() throws IOException {
                return this.getStatusCode().getReasonPhrase();
            }

            public void close() {

            }

            public InputStream getBody() throws IOException {
                return new ByteArrayInputStream("服务不可用".getBytes());
            }

            public HttpHeaders getHeaders() {
                HttpHeaders headers = new HttpHeaders();
                headers.setContentType(MediaType.APPLICATION_JSON);
                return headers;
            }
        };
    }
}
