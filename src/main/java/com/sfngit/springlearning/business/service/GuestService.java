package com.sfngit.springlearning.business.service;

import com.sfngit.springlearning.business.domain.GuestList;
import com.sfngit.springlearning.data.entity.Guest;
import com.sfngit.springlearning.data.repository.GuestRepository;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

@Service
public class GuestService {

    private final GuestRepository guestRepository;

    public GuestService(GuestRepository guestRepository){
        this.guestRepository = guestRepository;
    }

    public List<GuestList> getAllGuest(){

        Iterable<Guest> guests =  this.guestRepository.findAll();
        Map<Long, GuestList> guestListMap = new HashMap<>();

        guests.forEach(guest -> {
            GuestList guestList = new GuestList();
            guestList.setGuestID(guest.getGuestID());
            guestList.setFirstName(guest.getFirstName());
            guestList.setLastName(guest.getLastName());
            guestList.setEmail(guest.getEmail());
            guestList.setAddress(guest.getAddress() + ", " + guest.getState() + ", " + guest.getCountry());
            guestListMap.put(guestList.getGuestID(), guestList);
        });

        List<GuestList> guestList = new ArrayList<>();
        for(Long id: guestListMap.keySet()){
            guestList.add(guestListMap.get(id));
        }

        return guestList;
    }

    //Gets specific Guest

}
