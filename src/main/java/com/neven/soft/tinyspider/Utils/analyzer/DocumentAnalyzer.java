package com.neven.soft.tinyspider.Utils.analyzer;

import org.jsoup.nodes.Document;

import java.util.List;
import java.util.Map;

/**
 * 解析html文档抽象
 * Created by Neven on 2017/3/11.
 */
public interface DocumentAnalyzer {
    /**
     * 根据html文档对象获取List<Map>
     *
     * @param document html文档对象
     * @return 结果
     */
    default List<Map<String, Object>> forListMap(Document document) {
        return forListMap(document, null);
    }

    List<Map<String, Object>> forListMap(Document document, Object info);
}