package com.navneet.elastic.controller;

import com.navneet.elastic.data.CustomerData;
import com.navneet.elastic.data.model.DataRequest;
import com.navneet.elastic.data.model.DataResponse;
import com.navneet.elastic.service.DataService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

/**
 * @author navneetprabhakar
 */
@RestController
@RequestMapping("v1/data")
public class DataController {
    @Autowired
    private DataService dataService;

    /**
     * API to add data in ES Index
     * @param request
     * @return
     */
    @PostMapping("add")
    public DataResponse<String> addESData(@RequestBody DataRequest<CustomerData> request){
        dataService.insertCustomerInfo(request.getData());
        return new DataResponse<>("success", "inserted", "done");
    }

    @GetMapping("search")
    public DataResponse<List<CustomerData>> searchByName(@RequestParam String key, @RequestParam String value){
        return new DataResponse<List<CustomerData>>("success", "result",dataService.findCustomerByName(key,value));
    }
}
