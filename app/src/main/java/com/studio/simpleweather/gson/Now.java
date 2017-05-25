package com.studio.simpleweather.gson;

import com.google.gson.annotations.SerializedName;

/**
 * Created by xwx on 2017/5/25.
 */

public class Now
{
    @SerializedName("tmp")
    public String temperature;

    @SerializedName("cond")
    public More more;

    public class More
    {
        @SerializedName("txt")
        public String info;
    }
}
