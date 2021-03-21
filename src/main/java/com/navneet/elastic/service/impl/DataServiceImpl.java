package com.navneet.elastic.service.impl;

import com.navneet.elastic.data.CustomerData;

import com.navneet.elastic.data.model.CustomerInfo;
import com.navneet.elastic.data.repo.CustomerInfoRepository;
import com.navneet.elastic.service.DataService;
import lombok.extern.log4j.Log4j2;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.util.CollectionUtils;
import org.springframework.util.StringUtils;

import java.util.Collections;
import java.util.List;
import java.util.stream.Collectors;

@Service
@Log4j2
public class DataServiceImpl implements DataService {
    @Autowired
    private CustomerInfoRepository customerInfoRepository;

    @Override
    public void insertCustomerInfo(CustomerData customerData) {
        log.info("insert customer data into customer index");
        CustomerInfo info= new CustomerInfo(customerData);
        customerInfoRepository.save(info);
    }

    @Override
    public List<CustomerData> findCustomerByName(String key, String value) {
        if(StringUtils.isEmpty(key)|| StringUtils.isEmpty(value)){
            log.info("Key or value cannot be empty.");
            return null;
        }
        List<CustomerInfo> customerInfos=customerInfoRepository.findByKeyValueUsingCustomQuery(key,value);
        log.info("Total customer info:{}", customerInfos.size());
        if(!CollectionUtils.isEmpty(customerInfos))
            return customerInfos.stream().map(e -> new CustomerData(e)).collect(Collectors.toList());
        else
            return Collections.emptyList();
    }
}
