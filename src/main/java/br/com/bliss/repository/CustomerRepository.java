package br.com.bliss.repository;

import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.repository.PagingAndSortingRepository;
import org.springframework.data.repository.query.Param;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;

import br.com.bliss.entity.Customer;

@RepositoryRestResource(collectionResourceRel="customer",path="customers")
public interface CustomerRepository extends PagingAndSortingRepository<Customer, Integer> {

	Page<Customer> findAll(Pageable pageable);
	Customer findByName(@Param("name")String name);
}
