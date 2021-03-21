package com.navneet.elastic.data.model;

import com.navneet.elastic.data.CustomerData;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.springframework.data.annotation.Id;
import org.springframework.data.elasticsearch.annotations.Document;

@Document(indexName = "customer1")
@Data
@NoArgsConstructor
@AllArgsConstructor
public class CustomerInfo {

    @Id
    private String id;
    private String customerId;
    private String name;
    private String mobile;
    private String email;
    private String type;
    private Address currentAddress;
    private Address permanentAddress;

    public CustomerInfo(CustomerData data){
        this.id=data.getId();
        this.customerId=data.getCustomerId();
        this.name=data.getName();
        this.mobile=data.getMobile();
        this.email=data.getEmail();
        this.type=data.getType();
        this.currentAddress=data.getCurrentAddress();
        this.permanentAddress=data.getPermanentAddress();
    }
}
