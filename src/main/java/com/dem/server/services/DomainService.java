package com.dem.server.services;

import org.springframework.stereotype.Service;

import java.util.Random;

@Service
public class DomainService {

    public Object getDomainObjectByID(Long ID){
        try{
            Thread.sleep(new Random().nextInt(2000));
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        return ID;
    }
}
