package com.gmndwg.RestApp.Exception;


public class CustomerNotFoundException extends RuntimeException {

    public CustomerNotFoundException(String message){
        super(message);
    }

}
