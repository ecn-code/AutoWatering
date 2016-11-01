package com; /**
 * Created by eliasibz on 31/10/16.
 */
import org.springframework.data.repository.CrudRepository;

import javax.transaction.Transactional;

@Transactional
public interface SoilHumidityRepository extends CrudRepository<SoilHumidity, Long>{
}