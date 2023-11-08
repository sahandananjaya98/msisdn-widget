package com.dialog.project.ideamart.service.impl;

import com.dialog.project.ideamart.dto.InitDTO;
import com.dialog.project.ideamart.interfaces.InitService;
import lombok.extern.slf4j.Slf4j;
import org.springframework.context.annotation.Configuration;
import org.springframework.stereotype.Service;

/**
 * @author Ushan Nimanka
 */
@Slf4j
@Configuration
@Service
public class InitImpl implements InitService {

    @Override
    public InitDTO getData(String name, String age) {
        InitDTO data = new InitDTO();
        data.setName(name);
        data.setAge(age);
        return data;
    }
}
