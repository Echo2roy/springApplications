package com.solatech.searchapp;

import java.util.List;

import com.solatech.searchapp.dataservice.dbmodel.orm.Topic;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class Controller {

	@Autowired
	TopicRepository topicRepository;

	@RequestMapping("/")
	public List<Topic> index() {
		return topicRepository.findByDescriptionLikeIgnoreCase("%spring%");
	}

}
