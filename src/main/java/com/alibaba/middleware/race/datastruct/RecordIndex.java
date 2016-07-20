package com.alibaba.middleware.race.datastruct;

import java.util.HashSet;
import com.alibaba.middleware.race.OrderSystemImpl.Row;
/**
 * descption: 查找到的索引
 *
 * @author wangwenfeng
 * @date 2016-07-20 15-28
 * @email sxian.wang@gmail.com
 */

public class RecordIndex {
    public String filePath;
    public int position;
    public int length;
    public HashSet<String> keySet;

    public RecordIndex(String filePath, int position, Row row) {
        this.filePath = filePath;
        this.position = position;
        length = row.toString().getBytes().length;
        keySet = (HashSet<String>) row.keySet();
    }
}