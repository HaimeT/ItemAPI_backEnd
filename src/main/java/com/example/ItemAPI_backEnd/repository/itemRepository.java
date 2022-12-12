package com.example.ItemAPI_backEnd.repository;

import com.example.ItemAPI_backEnd.repository.entity.Item;
import org.springframework.data.jpa.repository.JpaRepository;

// This will be AUTO IMPLEMENTED by Spring into a Bean called itemRepository
// CRUD refers Create, Read, Update, Delete
public interface itemRepository extends JpaRepository<Item, Integer>
{
}