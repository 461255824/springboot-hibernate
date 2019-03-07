package com.example.demo.res;

import lombok.Data;

@Data
public class Response<T> {
    private int status;
    private  T result;
}
