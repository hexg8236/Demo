package top.newhand.gateway.ratelimit;

import org.springframework.cloud.gateway.filter.ratelimit.KeyResolver;
import org.springframework.web.server.ServerWebExchange;
import reactor.core.publisher.Mono;

/**
 * @ClassName PathKeyResolver
 * @Author HeXianGang
 * @Date 2024/3/17 22:04
 * @Version 1.0
 * @Description KeyResolverBean类
 **/

public class PathKeyResolver implements KeyResolver {

    @Override
    public Mono<String> resolve(ServerWebExchange exchange) {
        return Mono.just(exchange.getRequest().getURI().getPath());// 获取请求URI
    }
}
