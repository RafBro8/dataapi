package com.alpha.dataapi.repository;

import com.alpha.dataapi.model.DataModel;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface DataRepository extends CrudRepository<DataModel, String>{
}
