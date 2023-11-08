package com.dialog.project.ideamart.controllers;

import com.dialog.project.ideamart.dto.ApiResponse;
import com.dialog.project.ideamart.dto.KeyRequest;
import com.dialog.project.ideamart.dto.KeyResponse;
import com.dialog.project.ideamart.dto.Requestbody;
import com.dialog.project.ideamart.interfaces.ApiService;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@Slf4j
@RestController
@CrossOrigin("http://localhost:3000")
@RequestMapping("MockApi/")
public class ApiController {
    @Autowired
    private ApiService apiService;



    @PostMapping("/generateUrl")
    public ApiResponse generateUrl(@RequestBody Requestbody request) {
        return apiService.generateUrl(request);
    }


    @GetMapping("/getDetails/{value}")
    public KeyResponse generateResponse(@PathVariable String value) {
        return apiService.generateResponse(value);
    }
}
