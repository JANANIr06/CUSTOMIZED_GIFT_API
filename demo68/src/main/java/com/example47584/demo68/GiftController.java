package com.example47584.demo68;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/api")
public class GiftController {
    @Autowired
    GiftService gs;

    
    @PostMapping("/gift")
    public ResponseEntity<Gift> adddata(@RequestBody Gift g)
    {
       
        Gift obj=gs.create(g);
        return new ResponseEntity<>(obj,HttpStatus.CREATED);
    }


    @GetMapping("/gifts")
    public ResponseEntity <List<Gift>> getAllGift() 
    {
        try 
        {
            return new ResponseEntity<>( gs.getAllGift(),HttpStatus.OK);
        }
        catch (Exception e)
        {
            return new ResponseEntity<>(null,HttpStatus.NOT_FOUND);

        }
    }

    @PutMapping("/gift/{field}")
    public ResponseEntity<Gift> putMethod(@PathVariable() int Customer_Id,@RequestBody Gift pd)
    {
        if(gs.updateDetails(Customer_Id,pd) == true)
        {
            return new ResponseEntity<>(pd,HttpStatus.OK);
        }
        return new ResponseEntity<>(null,HttpStatus.NOT_FOUND);
    }
    @DeleteMapping("/api/gift/{Customer_Id}")
    public ResponseEntity<Boolean> delete(@PathVariable int Customer_Id)
    {
        if(gs.deleteGift(Customer_Id) == true)
        {
            return new ResponseEntity<>(true,HttpStatus.OK);
        }
        return new ResponseEntity<>(false,HttpStatus.NOT_FOUND);
    }

    
}