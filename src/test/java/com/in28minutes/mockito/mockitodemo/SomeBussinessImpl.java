package com.in28minutes.mockito.mockitodemo;

public class SomeBussinessImpl {

    private DataService dataService;

    public SomeBussinessImpl(DataService dataService) {
        super();
        this.dataService = dataService;
    }


    int findTheGreatestFromAllData(){
        int[] data = dataService.retrieveAllData();
        int greatest = Integer.MIN_VALUE;
        for(int value : data){
            if(value > greatest)
                greatest = value;
        }
        return greatest;
    }
}

