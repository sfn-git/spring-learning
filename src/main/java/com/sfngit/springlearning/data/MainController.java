package com.sfngit.springlearning.data;

import com.sfngit.springlearning.data.entity.Guest;
import com.sfngit.springlearning.data.entity.Reservation;
import com.sfngit.springlearning.data.entity.Room;
import com.sfngit.springlearning.data.repository.GuestRepository;
import com.sfngit.springlearning.data.repository.ReservationRepository;
import com.sfngit.springlearning.data.repository.RoomRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping(path="/hotel")
public class MainController {

    @Autowired
    private RoomRepository Rooms;

    @GetMapping(path="/rooms")
    public Iterable<Room> getAllRooms(){
        return this.Rooms.findAll();
    }

    @Autowired
    private GuestRepository Guests;
    @GetMapping(path="/guests")
    public Iterable<Guest> getAllGuests(){
        return this.Guests.findAll();
    }

    @Autowired
    private ReservationRepository Reservations;
    @GetMapping(path="/reservations")
    public Iterable<Reservation> getAllReservations(){
        return this.Reservations.findAll();
    }

}
