package com.example.xyzreader.remote;

import java.net.MalformedURLException;
import java.net.URL;

import static android.support.v4.content.res.TypedArrayUtils.getString;

public class Config {
    public static final URL BASE_URL;

    static {
        URL url = null;
        try {
            url = new URL("https://nspf.github.io/XYZReader/data.json");
        } catch (MalformedURLException ignored) {
            // TODO: throw a real error
        }

        BASE_URL = url;
    }
}
