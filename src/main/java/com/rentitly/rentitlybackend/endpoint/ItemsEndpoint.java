package com.rentitly.rentitlybackend.endpoint;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.rentitly.rentitlybackend.model.Item;
import com.rentitly.rentitlybackend.repository.ItemRepository;

import lombok.extern.slf4j.Slf4j;


@Slf4j
@RestController
public class ItemsEndpoint {

    ItemRepository itemRepository;

    @Autowired
    public ItemsEndpoint(ItemRepository itemRepository) {
        this.itemRepository = itemRepository;
    }

    @RequestMapping("/items")
    public List<Item> findAll() {
        return itemRepository.findAll();
    }

    @RequestMapping(value = "/itemssearch", method = RequestMethod.GET)
    public List<Item> findAndSortById(@RequestParam("name") String name, @RequestParam("location") String location ) {
        return itemRepository.findByNameContainingIgnoreCaseAndLocationContainingIgnoreCase(name, location);
    }

    @RequestMapping(value = "/items_search_order_by_price", method = RequestMethod.GET)
    public List<Item> findAndSortByPrice(@RequestParam("name") String name, @RequestParam("location") String location ) {
        return itemRepository.findByNameContainingIgnoreCaseAndLocationContainingIgnoreCaseOrderByPrice(name, location);
    }

    @RequestMapping(value = "/items_search_order_by_rating", method = RequestMethod.GET)
    public List<Item> findAndSortByRating(@RequestParam("name") String name, @RequestParam("location") String location ) {
        return itemRepository.findByNameContainingIgnoreCaseAndLocationContainingIgnoreCaseOrderByRatingDescPriceAsc(name, location);
    }



}
