package org.bantu.player;

import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.boot.web.servlet.ServletRegistrationBean;
import org.springframework.context.annotation.Bean;

/**
 * @author Mário Júnior
 */
@EnableAutoConfiguration
public class ServletBean {

    @Bean
    public ServletRegistrationBean servletRegistrationBean(){
        return new ServletRegistrationBean(new TestServlet(),"/testservlet");
    }

}
