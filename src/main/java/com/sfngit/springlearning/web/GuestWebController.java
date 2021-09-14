package com.sfngit.springlearning.web;

import com.sfngit.springlearning.business.domain.GuestList;
import com.sfngit.springlearning.business.service.GuestService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

import java.util.List;

@Controller
@RequestMapping("/guests")
public class GuestWebController {

    private final GuestService guestService;

    @Autowired
    public GuestWebController(GuestService guestService){
        this.guestService = guestService;
    }

    @GetMapping
    public String getGuests(@RequestParam(value = "guestID", required = false)String guestID, Model model){

        if(guestID == null){
            List<GuestList> guestList = guestService.getAllGuest();
            model.addAttribute("guestList", guestList);
        }

        return "guests";

    }
}
