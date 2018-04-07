package com.example.demo.Repository;

import org.springframework.data.repository.CrudRepository;

import com.example.demo.Model.News;

public interface NewsRepository extends CrudRepository<News, Integer>{

}
