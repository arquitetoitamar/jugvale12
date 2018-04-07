package br.com.bliss.repository;

import java.util.List;

import org.springframework.data.repository.PagingAndSortingRepository;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;

import br.com.bliss.entity.Item;

@RepositoryRestResource(collectionResourceRel="item",path="items")
public interface ItemRepository extends PagingAndSortingRepository<Item, Integer> {

	List<Item> findAll();
}
