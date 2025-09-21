package com.journal.journalApp.api.response;

import lombok.Getter;
import lombok.Setter;

import java.util.ArrayList;

@Getter
@Setter
public class WeatherResponse{

    private Main main;

    @Getter
    @Setter
    public class Main{
        private double temp;
        private double feels_like;
    }

}



