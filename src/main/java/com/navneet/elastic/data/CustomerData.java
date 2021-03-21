package com.navneet.elastic.data;

import com.navneet.elastic.data.model.Address;
import com.navneet.elastic.data.model.CustomerInfo;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class CustomerData  {

    private String id;
    private String customerId;
    private String name;
    private String mobile;
    private String email;
    private String type;
    private Address currentAddress;
    private Address permanentAddress;

    public CustomerData(CustomerInfo info){
        this.id=info.getId();
        this.customerId=info.getCustomerId();
        this.name=info.getName();
        this.mobile=info.getMobile();
        this.email=info.getEmail();
        this.type=info.getType();
        this.currentAddress=info.getCurrentAddress();
        this.permanentAddress=info.getPermanentAddress();
    }
}
