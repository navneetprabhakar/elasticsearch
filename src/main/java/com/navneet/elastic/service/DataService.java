package com.navneet.elastic.service;

import com.navneet.elastic.data.CustomerData;

import java.util.List;

public interface DataService {

    void insertCustomerInfo(CustomerData customerData);
    List<CustomerData> findCustomerByName(String key, String value);
}
