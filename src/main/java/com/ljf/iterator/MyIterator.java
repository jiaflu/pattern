package com.ljf.iterator;

/**
 * 自定义迭代器接口
 */
public interface MyIterator {
    void first();
    void next();
    boolean hasNext();

    boolean isFirst();
    boolean isLast();

    Object getCurrentObj();
}
