package org.bantu.player

import org.bantu.player.websocket.WebSocketConfig
import org.springframework.boot.SpringApplication

/**
 * @author Mário Júnior
 */
class Startup {


    static void main(String[] args){

        Object[] sources = [Resources.class, ServletBean.class, WebSocketConfig.class];
        SpringApplication.run(sources,args);


    }



}
