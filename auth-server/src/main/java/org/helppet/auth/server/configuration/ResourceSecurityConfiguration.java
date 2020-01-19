package org.helppet.auth.server.configuration;

import org.springframework.context.annotation.Configuration;
import org.springframework.security.oauth2.config.annotation.web.configuration.EnableResourceServer;
import org.springframework.security.oauth2.config.annotation.web.configuration.ResourceServerConfigurerAdapter;
import org.springframework.security.oauth2.config.annotation.web.configurers.ResourceServerSecurityConfigurer;
import org.springframework.security.oauth2.provider.token.TokenStore;

@Configuration
@EnableResourceServer
public class ResourceSecurityConfiguration extends ResourceServerConfigurerAdapter {

    private final TokenStore tokenStore;

    public ResourceSecurityConfiguration(final TokenStore tokenStore) {
        this.tokenStore = tokenStore;
    }

    @Override
    public void configure(final ResourceServerSecurityConfigurer resources) {
        resources.tokenStore(tokenStore);
    }
}
