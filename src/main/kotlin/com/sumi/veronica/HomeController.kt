package com.sumi.veronica

import org.springframework.beans.factory.annotation.Value
import org.springframework.web.bind.annotation.RequestMapping
import org.springframework.web.bind.annotation.RestController
import org.springframework.web.servlet.ModelAndView

/**
 * Created by VikasN on 7/2/17.
 */
@RestController
class HomeController(){

    @RequestMapping("/")
    fun home() = "Hi, I am veronica!"

    @RequestMapping("/author")
    fun goToGithub(@Value("\${author.url}") url:String) = ModelAndView("redirect:$url")
}