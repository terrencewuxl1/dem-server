package com.dem.server.test;

import com.dem.server.services.DomainService;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;


@SpringBootTest
public class AopSpringbootTest {

    @Autowired
    public DomainService domainService;

    @Test
    public void testGetDomainObjectByID() {
        domainService.getDomainObjectByID(10L);
    }
}
