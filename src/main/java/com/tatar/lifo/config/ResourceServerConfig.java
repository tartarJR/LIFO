package com.tatar.lifo.config;

import com.tatar.lifo.constant.ApiConstants;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Configuration;
import org.springframework.security.config.annotation.web.builders.HttpSecurity;
import org.springframework.security.oauth2.config.annotation.web.configuration.EnableResourceServer;
import org.springframework.security.oauth2.config.annotation.web.configuration.ResourceServerConfigurerAdapter;
import org.springframework.security.oauth2.config.annotation.web.configurers.ResourceServerSecurityConfigurer;
import org.springframework.security.oauth2.provider.token.ResourceServerTokenServices;

@Configuration
@EnableResourceServer
public class ResourceServerConfig extends ResourceServerConfigurerAdapter {

    private static final String RESOURCE_ID = "resource_id";

    private final ResourceServerTokenServices tokenServices;

    @Autowired
    public ResourceServerConfig(ResourceServerTokenServices tokenServices) {
        this.tokenServices = tokenServices;
    }

    @Override
    public void configure(ResourceServerSecurityConfigurer resources) {
        resources.resourceId(RESOURCE_ID).tokenServices(tokenServices);
    }

    @Override
    public void configure(HttpSecurity http) throws Exception {
        http
                .requestMatchers()
                .and()
                .authorizeRequests()
                .antMatchers(ApiConstants.API_V1_PREFIX + "/**").authenticated();
    }
}
