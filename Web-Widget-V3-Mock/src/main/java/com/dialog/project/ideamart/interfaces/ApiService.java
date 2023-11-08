package com.dialog.project.ideamart.interfaces;

import com.dialog.project.ideamart.dto.ApiResponse;
import com.dialog.project.ideamart.dto.KeyRequest;
import com.dialog.project.ideamart.dto.KeyResponse;
import com.dialog.project.ideamart.dto.Requestbody;

/**
 * @author Ushan Nimanka
 */
public interface ApiService {
    ApiResponse generateUrl(Requestbody request);

    KeyResponse generateResponse(String value);
}
