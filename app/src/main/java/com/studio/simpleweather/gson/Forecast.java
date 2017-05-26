package com.studio.simpleweather.gson;

import com.google.gson.annotations.SerializedName;

/**
 * Created by xwx on 2017/5/25.
 */

public class Forecast
{
    public String date;

    @SerializedName("cond")
    public More more;

    @SerializedName("tmp")
    public Temperature temperature;

    public class More
    {
        @SerializedName("txt_d")
        public String info;
    }

    public class Temperature
    {
        public String max;
        public String min;
    }
}
