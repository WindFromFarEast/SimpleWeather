package com.studio.simpleweather.gson;

/**
 * Created by xwx on 2017/5/25.
 */

public class AQI
{
    public AQICity city;

    public class AQICity
    {
        public String aqi;
        public String pm25;
    }
}
