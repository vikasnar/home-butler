package com.sumi.veronica

import org.springframework.web.bind.annotation.RequestMapping
import org.springframework.web.bind.annotation.RestController

/**
 * Created by VikasN on 7/2/17.
 */
@RestController
class HomeController{

    @RequestMapping("/")
    fun home() = "Hi, I am veronica!"
}