package com.navneet.elastic.data.model;

import lombok.Data;

@Data
public class DataRequest<T> {
    private T data;
}
