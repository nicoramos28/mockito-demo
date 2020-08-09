package com.in28minutes.mockito.mockitodemo;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.junit.MockitoJUnitRunner;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.mockito.Mockito.when;

@RunWith(MockitoJUnitRunner.class)
public class SomeBussinessImplMock {

    @Mock
    DataService dataServiceMock;

    @InjectMocks
    SomeBussinessImpl bussinessImpl;

    @Test
    public void testFindTheGreatestFromAllData(){
        when(dataServiceMock.retrieveAllData()).thenReturn(new int[]{24,15,9});
        assertEquals(24, bussinessImpl.findTheGreatestFromAllData());
    }

    @Test
    public void testFindTheGreatestFromAllData_ForOneValue(){
        when(dataServiceMock.retrieveAllData()).thenReturn(new int[]{15});
        assertEquals(15, bussinessImpl.findTheGreatestFromAllData());
    }

    @Test
    public void testFindTheGreatestFromAllData_NoValues(){
        when(dataServiceMock.retrieveAllData()).thenReturn(new int[]{});
        assertEquals(Integer.MIN_VALUE, bussinessImpl.findTheGreatestFromAllData());
    }

}

