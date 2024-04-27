package com.example47584.demo68;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;


import java.util.List;

@Service
public class GiftService {
    @Autowired
    private GiftRepo gr;
    
    public Gift create(Gift g)
    {
       
        return gr.save(g);
    }
    public Gift getbyid(int Customer_Id)
    {
        return gr.findById(Customer_Id).orElse(null);
    }


    public List<Gift> getAllGift()
    {
        return gr.findAll();
    }
    public boolean updateDetails(int field,Gift p)
        {
            if(gr.findById(field)==null)
            {
                return false;
            }
            try{
                gr.save(p);
            }
            catch(Exception e)
            {
                return false;
            }
            return true;
        }
        public boolean deleteGift(int Customer_Id)
        {
            if(this.getbyid(Customer_Id) == null)
            {
                return false;
            }
            gr.deleteById(Customer_Id);
            return true;
        }      
}