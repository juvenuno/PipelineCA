package com.helloworld.controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
@RestController
public class HelloWorldController 
{
@RequestMapping("/")
public String hello() 
{
return "<h1>Nuno change Locally and was automatically deploy to AWS! Colleen added this part!! and now gary added this part!!, we performed another update! GC</h1>" ;
}
}
