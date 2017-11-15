package com.bamboogmq.store;

import java.io.File;
import java.nio.MappedByteBuffer;
import java.nio.channels.FileChannel;
import java.util.concurrent.atomic.AtomicInteger;

/**
 * Created by IntelliJ IDEA.
 * Date  17-11-14
 * Time  下午9:23
 * 类描述: 内存映射文件
 *
 * @author bamboog
 */
public class MemMapFile {
    private String name;
    private long offset;
    private int fileSize;
    private File file;
    private FileChannel fileChannel;
    private MappedByteBuffer mappedByteBuffer;
    private final AtomicInteger wrotePosition = new AtomicInteger(0);
    private final AtomicInteger committedPosition = new AtomicInteger(0);
    private final AtomicInteger flushedPosition = new AtomicInteger(0);


    /**
     * 追加消息
     */
    public void  appendMsg(){
        int position = wrotePosition.get();
        if(position< fileSize){

        }
    }
}
