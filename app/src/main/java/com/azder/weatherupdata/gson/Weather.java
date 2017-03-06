package com.azder.weatherupdata.gson;

import com.google.gson.annotations.SerializedName;

import java.util.List;

/**
 * Created by zhou6 on 2017/2/23.
 */
public class Weather {

    public String status;

    public Basic basic;

    public AQI aqi;

    public Now now;

    public Suggestion suggestion;

    @SerializedName("daily_forecast")
    public List<Forecast> forecastList;
}
