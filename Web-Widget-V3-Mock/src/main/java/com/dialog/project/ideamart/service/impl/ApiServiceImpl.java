package com.dialog.project.ideamart.service.impl;

import com.dialog.project.ideamart.dto.ApiResponse;
import com.dialog.project.ideamart.dto.KeyResponse;
import com.dialog.project.ideamart.dto.Requestbody;
import com.dialog.project.ideamart.interfaces.ApiService;
import org.springframework.stereotype.Service;

@Service
public class ApiServiceImpl implements ApiService {
    @Override
    public ApiResponse generateUrl(Requestbody request) {
        String URL1 = "http://localhost:3000/getDetails/A1B@$CZSK_1";
        String URL2 = "http://localhost:3000/getDetails/A1B@$CZSK_2";


        if(request.getMSISDN().equals("94111111111")){
              return new ApiResponse(URL1);
        } else if (request.getMSISDN().equals("94222222222")){
            return new ApiResponse(URL2);
        } else{
              return new ApiResponse("Invalid MSISDN");
        }

    }

    @Override
    public KeyResponse generateResponse(String value) {
        KeyResponse keyResponse = new KeyResponse();

        String MSISDN1 = "94111111111";
        String serverRef1 = "BR@ABC_1";
        String MSISDN2 = "94222222222";
        String serverRef2 = "BR@ABC_2";

        if(value.equals("A1B@$CZSK_1")){
            return new KeyResponse(MSISDN1, serverRef1);
        } else if (value.equals("A1B@$CZSK_2")) {
            return new KeyResponse(MSISDN2, serverRef2);
        }else{
            return new KeyResponse("No MSISDN", "No Server Ref");
        }
    }


}
