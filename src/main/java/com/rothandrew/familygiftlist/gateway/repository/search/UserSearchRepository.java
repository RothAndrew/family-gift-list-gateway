package com.rothandrew.familygiftlist.gateway.repository.search;

import com.rothandrew.familygiftlist.gateway.domain.User;
import org.springframework.data.elasticsearch.repository.ElasticsearchRepository;

/**
 * Spring Data Elasticsearch repository for the User entity.
 */
public interface UserSearchRepository extends ElasticsearchRepository<User, String> {
}
