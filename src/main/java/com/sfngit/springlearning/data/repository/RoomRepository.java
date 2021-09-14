package com.sfngit.springlearning.data.repository;

import com.sfngit.springlearning.data.entity.Room;
import org.springframework.data.repository.CrudRepository;

//@Repository
public interface RoomRepository extends CrudRepository<Room, Long> { }