package com.cbn.cybersportnews.repository;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.cbn.cybersportnews.Entities.Coupons;

@Repository
public interface CouponsInterface extends CrudRepository<Coupons, Integer>{

}
