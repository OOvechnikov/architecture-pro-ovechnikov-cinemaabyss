package ru.ovechnikov.gateway.filter;

import lombok.NoArgsConstructor;
import org.springframework.cloud.gateway.server.mvc.common.MvcUtils;
import org.springframework.cloud.gateway.server.mvc.common.Shortcut;
import org.springframework.cloud.gateway.server.mvc.filter.SimpleFilterSupplier;
import org.springframework.web.servlet.function.HandlerFilterFunction;
import org.springframework.web.servlet.function.ServerResponse;

import java.net.URI;

import static lombok.AccessLevel.PRIVATE;

@NoArgsConstructor(access = PRIVATE)
public abstract class FeatureFlagFilterFunctions {

    private static final String GATEWAY_SERVER_MVC_GATEWAY_REQUEST_URL = "GatewayServerMvc.gatewayRequestUrl";

    @Shortcut
    public static HandlerFilterFunction<ServerResponse, ServerResponse> featureFlag(boolean enable, URI redirectTo, int percent) {
        return (request, next) -> {
            if (enable && Math.random() * 100 > percent % 100) {
                MvcUtils.setRequestUrl(request, redirectTo);
            }

            return next.handle(request);
        };
    }

    public static class FilterSupplier extends SimpleFilterSupplier {

        public FilterSupplier() {
            super(FeatureFlagFilterFunctions.class);
        }

    }

}
