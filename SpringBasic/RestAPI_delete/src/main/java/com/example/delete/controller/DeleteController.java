package com.example.delete.controller;

import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/api")
public class DeleteController {

    @DeleteMapping("/delete/{userId}")
    public void delete(@PathVariable(name = "userId") String userId, @RequestParam String account){

        System.out.println(userId);
        System.out.println(account);

        //delete -> 리소스 삭제 **리소스가 없어도 200ok
    }

}
