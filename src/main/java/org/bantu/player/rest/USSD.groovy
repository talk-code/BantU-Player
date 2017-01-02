package org.bantu.player.rest

import org.springframework.boot.autoconfigure.EnableAutoConfiguration
import org.springframework.stereotype.Component
import org.springframework.web.bind.annotation.RequestMapping
import org.springframework.web.bind.annotation.RequestParam
import org.springframework.web.bind.annotation.RestController


/**
 * @author Mário Júnior
 */

@EnableAutoConfiguration
@Component
@RestController("/ussd")
class USSD {



    @RequestMapping("/exe")
    String executePlayable(@RequestParam("playable") String playable){

        return null;

    }


    @RequestMapping("/deb")
    String debugPlayable(@RequestParam("playable") String playable){

        return null;

    }



    @RequestMapping("/exp")
    String explainPlayable(@RequestParam("playable") String playable){


        return null;

    }


}
