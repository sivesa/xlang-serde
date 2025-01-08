package com.beta.version.xlang_serde.serde_util;

import com.fasterxml.jackson.databind.ObjectMapper;
import com.fasterxml.jackson.databind.SerializationFeature;
import com.fasterxml.jackson.dataformat.xml.XmlMapper;

public class CrossLanguageSerializer {

    private static final ObjectMapper jsonMapper = new ObjectMapper();
    private static final XmlMapper xmlMapper = new XmlMapper();

    static {
        jsonMapper.enable(SerializationFeature.INDENT_OUTPUT);
        xmlMapper.enable(SerializationFeature.INDENT_OUTPUT);
    }

    public static String toJson(Object object) throws Exception {
        return jsonMapper.writeValueAsString(object);
    }

    public static <T> T fromJson(String json, Class<T> clazz) throws Exception {
        return jsonMapper.readValue(json, clazz);
    }
    
    public static String toXml(Object object) throws Exception {
        return xmlMapper.writeValueAsString(object);
    }
    
    public static <T> T fromXml(String xml, Class<T> clazz) throws Exception {
        return xmlMapper.readValue(xml, clazz);
    }

}

