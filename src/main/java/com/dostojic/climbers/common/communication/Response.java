/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.dostojic.climbers.common.communication;

import java.io.Serializable;

/**
 *
 * @author planina
 */
public class Response implements Serializable {

    private Object result;
    private Exception exception;

    public Response() {
    }

    public Response(Object result, Exception exception) {
        this.result = result;
        this.exception = exception;
    }

    public Exception getException() {
        return exception;
    }

    public void setException(Exception exception) {
        this.exception = exception;
    }

    public Object getResult() {
        return result;
    }

    public void setResult(Object result) {
        this.result = result;
    }

    @Override
    public String toString() {
        return "Response{" + "result=" + result + ", exception=" + exception + '}';
    }

}
