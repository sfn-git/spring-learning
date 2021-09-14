package com.sfngit.springlearning.data.repository;

import com.sfngit.springlearning.data.entity.Guest;
import org.springframework.data.repository.CrudRepository;

public interface GuestRepository extends CrudRepository<Guest, Long> {
}
