package com.rentitly.rentitlybackend.endpoint;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.core.ReactiveTypeDescriptor;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;
import javax.ws.rs.GET;
import javax.ws.rs.HeaderParam;
import javax.ws.rs.POST;
import javax.ws.rs.Path;

import com.rentitly.rentitlybackend.model.Item;
import com.rentitly.rentitlybackend.model.SearchItem;
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
        List<Item> items = itemRepository.findAll();
        log.debug("count " + items.size());
        return items;
    }

    @RequestMapping(value = "/itemsbyprice", method = RequestMethod.POST)
    public List<Item> findByPrice(@RequestBody SearchItem searchItem) {
        System.out.println(searchItem);
        List<Item> items = itemRepository.findAllByOrderByPrice();
        System.out.println(items);
        log.debug("count " + items.size());
        return items;
    }



    @RequestMapping(value = "/itemsbyrating", method = RequestMethod.POST)
    public List<Item> findByRating(@RequestBody SearchItem searchItem) {


        return itemRepository.findByNameLikeAndLocationLikeOrderByPrice(searchItem.getName(), searchItem.getLocation());
    }

}
