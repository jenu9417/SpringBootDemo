package com.jenu.spring5.springdemo.repo;

import org.springframework.data.repository.CrudRepository;

import com.jenu.spring5.springdemo.model.Widget;

public interface WidgetRepository extends CrudRepository<Widget, Long> {

}    