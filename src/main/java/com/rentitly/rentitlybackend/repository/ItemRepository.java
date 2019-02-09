package com.rentitly.rentitlybackend.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.rentitly.rentitlybackend.model.Item;

@Repository
public interface ItemRepository extends JpaRepository<Item, Long> {

}
