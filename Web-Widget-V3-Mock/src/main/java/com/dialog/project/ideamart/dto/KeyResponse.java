package com.dialog.project.ideamart.dto;

public class KeyResponse {
    private String MSISDN;
    private String SeverRef;

    public KeyResponse(String MSISDN, String SeverRef) {
        this.MSISDN = MSISDN;
        this.SeverRef = SeverRef;
    }

    public KeyResponse() {

    }

    public String getMSISDN() {
        return MSISDN;
    }

    public void setMSISDN(String MSISDN) {
        this.MSISDN = MSISDN;
    }

    public String getSeverRef() {
        return SeverRef;
    }

    public void setSeverRef(String severRef) {
        SeverRef = severRef;
    }
}
