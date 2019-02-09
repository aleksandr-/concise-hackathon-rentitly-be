package com.rentitly.rentitlybackend.endpoint;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.core.ReactiveTypeDescriptor;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import javax.ws.rs.GET;
import javax.ws.rs.HeaderParam;
import javax.ws.rs.POST;
import javax.ws.rs.Path;

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

    public List<Item> getByAreaNoAndCountryCode() {
        List<Item> items = itemRepository.findAll();
        log.debug("count " + items.size());
        return items;
    }

}
