package org.hothub.base;

import okhttp3.MediaType;
import org.hothub.utils.CommonUtils;

import java.nio.charset.Charset;

public enum  ContentType {


    URL_ENCODE("application/x-www-form-urlencoded"),
    JSON("application/json"),
    FORM_DATA("multipart/form-data");

    private String type;

    ContentType(String type) {
        this.type = type;
    }





    public static MediaType get() {
        return get(null, "utf-8");
    }



    public static MediaType get(ContentType contentType) {
        String mediaType =
                (contentType == null ? ContentType.URL_ENCODE.type : contentType.type)
                        + "; charset=utf-8";

        return MediaType.parse(mediaType.toLowerCase());
    }



    public static MediaType get(ContentType contentType, String charset) {
        String mediaType =
                (contentType == null ? ContentType.URL_ENCODE.type : contentType.type)
                        + "; charset="
                        + Charset.forName(CommonUtils.isEmpty(charset) ? "utf-8" : charset);

        return MediaType.parse(mediaType.toLowerCase());
    }

}
