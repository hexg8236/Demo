package top.newhand.gateway.filter;

import org.springframework.cloud.gateway.filter.GatewayFilterChain;
import org.springframework.cloud.gateway.filter.GlobalFilter;
import org.springframework.http.HttpStatus;
import org.springframework.util.MultiValueMap;
import org.springframework.web.server.ServerWebExchange;
import reactor.core.publisher.Mono;

/**
 * @ClassName AuthorizeFilter
 * @Author HeXianGang
 * @Date 2024/3/8 20:44
 * @Version 1.0
 * @Description 过滤器实现类
 **/

public class AuthorizeFilter implements GlobalFilter {

    @Override
    public Mono<Void> filter(ServerWebExchange exchange, GatewayFilterChain chain) {
        // 1、获取请求参数
        MultiValueMap<String, String> params = exchange.getRequest().getQueryParams();
        // 2、获取authorization参数
        String auth = params.getFirst("authorization");
        // 3、校验
        if ("admin".equals(auth)) {
            return chain.filter(exchange);
        }
        // 4、拦截
        // 4.1、禁止访问，设置状态码
        exchange.getResponse().setStatusCode(HttpStatus.UNAUTHORIZED);
        // 4.2、结束处理
        return exchange.getResponse().setComplete();
    }
}
