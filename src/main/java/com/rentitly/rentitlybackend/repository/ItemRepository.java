package com.rentitly.rentitlybackend.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.rentitly.rentitlybackend.model.Item;

@Repository
public interface ItemRepository extends JpaRepository<Item, Long> {

    public List<Item> findByNameLikeAndLocationLikeOrderByPrice(String name, String location);

    public List<Item> findByNameContainingIgnoreCaseAndLocationContainingIgnoreCase(String name, String location);

    public List<Item> findByNameContainingIgnoreCaseAndLocationContainingIgnoreCaseOrderByPrice(String name, String location);

    public List<Item> findByNameContainingIgnoreCaseAndLocationContainingIgnoreCaseOrderByRatingDesc(String name, String location);

    public List<Item> findByNameContainingIgnoreCaseAndLocationContainingIgnoreCaseOrderByRatingDescPriceAsc(String name, String location);

    public List<Item> findAllByOrderByPrice();

}
