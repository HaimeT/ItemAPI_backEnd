package com.example.ItemAPI_backEnd.service;

import com.example.ItemAPI_backEnd.repository.entity.Item;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class ItemService
{
    private static com.example.ItemAPI_backEnd.repository.itemRepository itemRepository;

    public ItemService(@Autowired com.example.ItemAPI_backEnd.repository.itemRepository itemRepository )
    {
        this.itemRepository = itemRepository;
    }


    public Item save(Item item )
    {
        return itemRepository.save(item);
    }


    public void delete( int itemId )
    {
        itemRepository.deleteById(itemId);
    }


    public static List<Item> all()
    {
        return itemRepository.findAll();
    }


    public Optional<Item> findById(int itemId )
    {
        return itemRepository.findById(itemId);

    }


}