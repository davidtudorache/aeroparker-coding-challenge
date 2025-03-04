package com.aeroparker.register_form;

import com.aeroparker.register_form.Customer;
import org.springframework.data.repository.CrudRepository; 

// This will be AUTO IMPLEMENTED by Spring into a Bean called CustomerRepository
// CRUD refers Create, Read, Update, Delete

public interface CustomerRepository extends CrudRepository<Customer, Integer> {

}