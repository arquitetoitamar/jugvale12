package br.com.bliss.repository;

import org.springframework.data.repository.PagingAndSortingRepository;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;

import br.com.bliss.entity.Orders;

@RepositoryRestResource(collectionResourceRel="order",path="orders")
public interface OrderRepository extends PagingAndSortingRepository<Orders, Integer> {


}
