package br.edu.ufabc.eduard.soproject.entities;

/**
 * Created by dumorango on 02/12/14.
 */
public class NoVacancyException extends Exception{

    public NoVacancyException(){

    }
    private Integer status = 500;
    private String message;

    public NoVacancyException(String message) {
        this.message = message;
    }

    public Integer getStatus() {
        return status;
    }

    public void setStatus(Integer status) {
        this.status = status;
    }

    public String getMessage() {
        return "Não há vagas disponíveis";
    }

    public void setMessage(String message) {
        this.message = message;
    }
}
