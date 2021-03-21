# Elasticsearch Implementation using Spring Boot
This repository is implementation of Elasticsearch with Spring Boot Application with REST APIs to insert and search

# Introduction:
Elasticsearch is a distributed, free and open search and analytics engine for all types of data, including textual, numerical, geospatial, structured, and unstructured. Elasticsearch is built on Apache Lucene and was first released in 2010 by Elasticsearch N.V. (now known as Elastic). Known for its simple REST APIs, distributed nature, speed, and scalability, Elasticsearch is the central component of the Elastic Stack, a set of free and open tools for data ingestion, enrichment, storage, analysis, and visualization. Commonly referred to as the ELK Stack (after Elasticsearch, Logstash, and Kibana), the Elastic Stack now includes a rich collection of lightweight shipping agents known as Beats for sending data to Elasticsearch.


# Approach
1. Add maven dependecies for elasticsearch
2. Create an ES Index named "customer" in your ES server. You can leave the default text column or create keyword if you like both work. Keyword is preferred
3. Create JPA Repository for insert and search
4. Create REST API to insert and search

# API Description: 
- API: Add data to ES
- METHOD: POST
- URL: http://localhost:8080/elastic/v1/data/add
- Body: This is a Sample Request to add data in ES

```json
{
    "data":{
        "id":"1",
        "customerId":"CUST_ID1",
        "name":"Navneet Prabhakar",
        "mobile" :"88888888",
        "email":"test@gmail.com",
        "type":"GOLD",
        "currentAddress":{
            "line1":"ABCD",
            "line2":"CDEF",
            "city":"Delhi",
            "state":"Delhi",
            "country":"India",
            "pincode": 110001
        },
         "permanentAddress":{
            "line1":"ABC",
            "line2":"CDE",
            "city":"Delhi",
            "state":"Delhi",
            "country":"India",
            "pincode": 110001
        }
    }
}
```

- API: Search data from ES with Key Value Paid
- METHOD: GET
- URL: http://localhost:8080/elastic/v1/data/search?key=name&value=test


Wiki Link: https://www.elastic.co/what-is/elasticsearch
