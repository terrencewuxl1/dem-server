package com.dem.server.test;

import com.dem.server.services.DomainService;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

@RunWith(SpringRunner.class)
@SpringBootTest
public class AopSpringbootTest {

    @Autowired
    public DomainService domainService;

    @Test
    public void testGetDomainObjectByID(){
        domainService.getDomainObjectByID(10L);
    }
}
