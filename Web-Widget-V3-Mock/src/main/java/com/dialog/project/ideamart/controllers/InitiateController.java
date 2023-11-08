package com.dialog.project.ideamart.controllers;

import com.dialog.project.ideamart.dto.InitDTO;
import com.dialog.project.ideamart.interfaces.InitService;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

/**
 * @author Ushan Nimanka
 */

@Slf4j
@RestController
@RequestMapping("api/")
public class InitiateController {

    @Autowired
    InitService iservice;
    @CrossOrigin
    @GetMapping(value = "init")
    public ResponseEntity<?> initialAPI() {
        try {
            InitDTO initDTO = iservice.getData("Ideamart","10");
            return new ResponseEntity<>( initDTO , HttpStatus.OK );
        } catch ( Exception ex ) {
            log.error( "Method Err " + ex );
            return new ResponseEntity<>( false , HttpStatus.INTERNAL_SERVER_ERROR );
        }
    }
}
