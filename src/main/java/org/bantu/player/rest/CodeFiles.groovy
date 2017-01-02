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
@RestController("/code")
class CodeFiles {


    @RequestMapping("/save")
    String save(@RequestParam("file") String filename, @RequestParam("content") String content){

        return null;

    }


    @RequestMapping("/get")
    String getContent(@RequestParam("file") String filename){

        return "Hi";

    }


}
