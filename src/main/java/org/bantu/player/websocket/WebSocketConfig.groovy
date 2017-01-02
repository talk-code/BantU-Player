package org.bantu.player.websocket

import org.springframework.context.annotation.Bean
import org.springframework.context.annotation.Configuration
import org.springframework.web.socket.WebSocketHandler
import org.springframework.web.socket.config.annotation.EnableWebSocket
import org.springframework.web.socket.config.annotation.WebSocketConfigurer
import org.springframework.web.socket.config.annotation.WebSocketHandlerRegistry

/**
 * @author Mário Júnior
 */

@Configuration
@EnableWebSocket
class WebSocketConfig implements WebSocketConfigurer {

    @Override
    public void registerWebSocketHandlers(WebSocketHandlerRegistry registry) {

        registry.addHandler(wsHandler(), "/wsHandler").withSockJS();

    }

    @Bean
    public WebSocketHandler wsHandler() {

        return new WSHandler();

    }

}
