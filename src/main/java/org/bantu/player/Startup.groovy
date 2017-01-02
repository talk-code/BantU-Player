package org.bantu.player

import org.springframework.boot.SpringApplication

/**
 * @author Mário Júnior
 */
class Startup {


    static void main(String[] args){

        //Object[] sources = [Resources.class,ServletBean.class,JerseyConfig.class];
        Object[] sources = [Resources.class,ServletBean.class];
        SpringApplication.run(sources,args);


    }



}
