package com.example.restServiceDemo;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import javax.websocket.server.PathParam;

@RestController
public class HelloWorldController {

   /* @RequestMapping(method = RequestMethod.GET, path="/hello/{name}")
    public String helloWorld(@PathVariable String name)*/
    /* @RequestMapping(method = RequestMethod.GET, path="/hello")
   public String helloWorld(@PathParam("message") String message,@PathParam("name") String name){
        return new HelloWorld(name,message).toString();*/

    @Autowired
    private CreatePerson createPerson=new CreatePerson();

    @RequestMapping(method =RequestMethod.POST, path="/createperson" )
    public String helloWorld(@PathParam("FirstName") String firstname, @PathParam("LastName") String lastname, @PathParam("City") String city){
return createPerson.CreateUser(firstname,lastname, city);
    }
}
