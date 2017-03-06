package com.azder.weatherupdata.gson;

/**
 * Created by zhou6 on 2017/2/23.
 */
public class AQI {

    public AQICity city;

    public class AQICity {

        public String aqi;
        public String pm25;
    }
}
