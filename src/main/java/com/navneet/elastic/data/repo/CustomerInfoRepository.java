package com.navneet.elastic.data.repo;

import com.navneet.elastic.data.model.CustomerInfo;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.elasticsearch.annotations.Query;
import org.springframework.data.elasticsearch.repository.ElasticsearchRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

/**
 * @author navneetprabhakar
 */
@Repository
public interface CustomerInfoRepository extends ElasticsearchRepository<CustomerInfo, String> {

    /**
     * Search customer info index by customer name with pagination
     * @param name
     * @param pageable
     * @return
     */
    Page<CustomerInfo> findByName(String name, Pageable pageable);

    /**
     * Search customer info index by customer name
     * @param name
     * @return
     */
    List<CustomerInfo> findByName(String name);

    @Query("{\"bool\": {\"must\": [{\"match\": {\"?0\": \"?1\"}}]}}")
    List<CustomerInfo> findByKeyValueUsingCustomQuery(String key, String value);
}
