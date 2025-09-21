package com.journal.journalApp.repository;

import com.journal.journalApp.entity.User;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.mongodb.core.MongoTemplate;
import org.springframework.data.mongodb.core.query.Criteria;
import org.springframework.data.mongodb.core.query.Query;

import java.util.List;

public class UserRepositoryImpl {

    @Autowired
    private MongoTemplate mongoTemplate;

    public List<User> getUserForSA(){

        Query query = new Query();

        //query.addCriteria(Criteria.where("userName").is("Dhanu"));
//        query.addCriteria(Criteria.where("email").exists(true));
//        query.addCriteria(Criteria.where("email").ne(null).ne(""));

        query.addCriteria(Criteria.where("sentimentAnalysis").is(true));
        query.addCriteria(Criteria.where("email").regex("^[a-zA-Z0-9._%+-]+@[a-zA-Z0-9.-]+\\.[a-z|A-Z]{2,6}$"));

        //        Criteria criteria=new Criteria();
//                query.addCriteria(criteria.orOperator(
//                         Criteria.where("email").exists(true ),
//                         Criteria.where("sentimentAnalysis").is(true)));

        return mongoTemplate.find(query, User.class);


    }

}
