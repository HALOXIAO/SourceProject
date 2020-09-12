package jdk8.source.learn.test;

import sun.awt.geom.AreaOp;

/**
 * @author HALOXIAO
 * @since 2020-09-10 16:39
 **/
public class Test {
    static final int MAXIMUM_CAPACITY = 1 << 30; //容量最大值

    static final int tableSizeFor(int cap) {
        int n = cap - 1;
        n |= n >>> 1;
        n |= n >>> 2;
        n |= n >>> 4;
        n |= n >>> 8;
        n |= n >>> 16;
        return (n < 0) ? 1 : (n >= MAXIMUM_CAPACITY) ? MAXIMUM_CAPACITY : n + 1;
    }

    public static void main(String[] args) {
        System.out.println(tableSizeFor(100000));
    }

}
