package com.example.hello.controller;

import com.example.hello.dto.UserRequest;
import org.springframework.web.bind.annotation.*;

import java.util.Map;

@RestController
@RequestMapping("/api/get")
public class GetApiController {

    @GetMapping(path = "/hello") //http://localhost:9090/api/get/hello
    public String getHello(){
        return "get Hello";
    }

    @RequestMapping(path = "/hi", method = RequestMethod.GET) //get http://localhost:9090/api/get/hi
    public String hi(){
        return "hi";
    }

    // http://localhost:9090/api/get/path-variable/{name}
    @GetMapping("/path-variable/{name}")
    public String pathVariable(@PathVariable(name = "name") String pathName){
        System.out.println("PathVariable : " + pathName);
        return pathName;
    }

    // QueryParameter란? 키=value개념으로 주소의 특징을 쉽게? 알아볼 수 있음
    // search?q = intellij
    // &rlz = 1C1IBEF_koKR970KR970
    // &oq = in
    // &aqs = chrome.0.69i59j69i57j69i59l2j0i131i433i512l2j0i433i512l2j0i131i433i512j46i199i433i465i512.820j0j15
    // &sourceid = chrome
    // &ie = UTF-8

    //?key=value&key2=value2 이런식으로 query parameter가 형성됨

    //http://localhost:9090/api/get/query-param?user=steve&mail=steve@gmail.com&age=30
    @GetMapping(path = "/query-param")
    public String queryParam(@RequestParam Map<String, String> queryParam){

        StringBuilder sb = new StringBuilder();

        queryParam.entrySet().forEach( entry -> {
            System.out.println(entry.getKey());
            System.out.println(entry.getValue());
            System.out.println("\n");

            sb.append(entry.getKey() + " = " + entry.getValue() + "\n");
        });

        return sb.toString();
    }

    @GetMapping("/query-param02")
    public String queryParam02(
            @RequestParam String name,
            @RequestParam String email,
            @RequestParam int age){
        System.out.println(name);
        System.out.println(email);
        System.out.println(age);

        return name + " " + email + " " + age;
    }

    @GetMapping("/query-param03")
    public String queryParam03(UserRequest userRequest){ // RequestParam Annotation은 붙이지 않음
        System.out.println(userRequest.getName());
        System.out.println(userRequest.getEmail());
        System.out.println(userRequest.getAge());

        return userRequest.toString();
    }
}
