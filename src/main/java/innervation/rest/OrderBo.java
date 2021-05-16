package innervation.rest;

import org.springframework.data.repository.CrudRepository;

import innervation.rest.dto.Orders;

public interface OrderBo extends CrudRepository<Orders, Integer> {

}
