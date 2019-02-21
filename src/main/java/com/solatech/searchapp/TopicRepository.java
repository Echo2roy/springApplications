package com.solatech.searchapp;

import java.util.List;

import com.solatech.searchapp.dataservice.dbmodel.orm.Topic;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface TopicRepository extends CrudRepository<Topic, Long>{
	List<Topic> findByDescriptionLikeIgnoreCase(String searchString);
}
