package com.sankuai.dp.pattern.structure;

import java.util.List;

/*
*
* 将对象组合成树形结构以表示“部分-整体”的层次结构，使得用户对单个对象和组合对象的使用具有一致性。

组合模式（Composite）经常用于树形结构，为了简化代码，使用Composite可以把一个叶子节点与一个父节点统一起来处理。
* */
public interface Composite {
    Node  add(Node node);
    // 获取子节点:
    List<Node> children();
    // 输出为XML:
    String toXml();

}

class Node {

}