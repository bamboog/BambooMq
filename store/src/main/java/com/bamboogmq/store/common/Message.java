package com.bamboogmq.store.common;

import java.io.Serializable;

/**
 * Created by IntelliJ IDEA.
 * Date  17-11-14
 * Time  下午9:54
 * 类描述:
 *
 * @author gangwen.xu
 */
public class Message implements Serializable {
    private String topic;
    private byte[] body;

}
