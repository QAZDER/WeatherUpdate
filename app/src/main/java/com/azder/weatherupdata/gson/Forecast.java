package com.azder.weatherupdata.gson;

import com.google.gson.annotations.SerializedName;

/**
 * Created by zhou6 on 2017/2/23.
 */
public class Forecast {

    public String date;

    @SerializedName("tmp")
    public Temperauture temperauture;

    @SerializedName("cond")
    public More more;

    public class Temperauture {

        public String max;
        public String min;
    }

    public class More {
        @SerializedName("txt_d")
        public String info;
    }
}
