package br.edu.ufabc.eduard.soproject.rest;

/**
 * Created by dumorango on 28/10/14.
 */
public class ErrorMessage {
    private String message;
    private Integer status;
    public ErrorMessage(String message,Integer status) {

        this.message = message;
        this.status = status;
    }

    public String getMessage() {
        return message;
    }

    public void setMessage(String message) {
        this.message = message;
    }

    public Integer getStatus() {
        return status;
    }
}
