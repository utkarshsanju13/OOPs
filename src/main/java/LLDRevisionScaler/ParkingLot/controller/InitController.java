package LLDRevisionScaler.ParkingLot.controller;

import LLDRevisionScaler.ParkingLot.service.Strategy.InitSevice;

public class InitController {

    private InitSevice initSevice;

    public InitController(InitSevice initSevice) {
        this.initSevice = initSevice;
    }

    public void init(){
        initSevice.init();
    }
}
