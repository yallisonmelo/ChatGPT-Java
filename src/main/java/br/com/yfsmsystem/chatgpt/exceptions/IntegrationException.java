package br.com.yfsmsystem.chatgpt.exceptions;

public class IntegrationException extends RuntimeException{
    public IntegrationException() {
        super("Problem to integration chatgpt");
    }
}
