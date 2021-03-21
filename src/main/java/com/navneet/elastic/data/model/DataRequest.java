package com.navneet.elastic.data.model;

import lombok.Data;

/**
 * @author navneetprabhakar
 * @param <T>
 */
@Data
public class DataRequest<T> {
    private T data;
}
