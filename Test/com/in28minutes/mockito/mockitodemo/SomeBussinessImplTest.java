package com.in28minutes.mockito.mockitodemo;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class SomeBussinessImplTest {

        @Test
        public void testFindTheGreatestFromAllData(){
            SomeBussinessImpl bussinessImpl = new SomeBussinessImpl(new DataServicestub());
            int result = bussinessImpl.findTheGreatestFromAllData();
            assertEquals(24, result);
        }
}

class DataServicestub implements DataService{

    @Override
    public int[] retrieveAllData(){
        return new int[]{24, 6, 15};
    }
}