package com.ljn.demo;


import com.alibaba.fastjson.JSON;
import org.apache.http.HttpEntity;
import org.apache.http.HttpResponse;
import org.apache.http.client.methods.HttpGet;
import org.apache.http.impl.client.DefaultHttpClient;
import org.apache.http.util.EntityUtils;

import java.io.IOException;

/**
 * Created by liuji on 2017/6/1.
 */
public class DoubanApiUtil {

    /**
     * 使用ISBN码检索图书
     * @param isbn ISBN编码
     * @return Book实例
     * @throws IOException IO异常
     */
    public static Book getBookByIsbn(String isbn) throws IOException {
        String url = "https://api.douban.com//v2/book/isbn/" + isbn;
        DefaultHttpClient client = new DefaultHttpClient();
        HttpGet get = new HttpGet(url);
        HttpResponse response = client.execute(get);
        HttpEntity entity = response.getEntity();
        return JSON.parseObject(EntityUtils.toString(entity),Book.class);
    }

    /**
     * 使用图书ID检索图书
     * @param id 图书ID
     * @return Book实例
     * @throws IOException IO异常
     */
    public static Book getBookById(String id) throws IOException {
        String url = "https://api.douban.com//v2/book/" + id;
        DefaultHttpClient client = new DefaultHttpClient();
        HttpGet get = new HttpGet(url);
        HttpResponse response = client.execute(get);
        HttpEntity entity = response.getEntity();
        return JSON.parseObject(EntityUtils.toString(entity),Book.class);
    }

}
