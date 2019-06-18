package com.algorithm.tree;

/**
 * @author LIUY
 * 二叉树的具体操作方法
 */
public interface Tree {

    /**
     * 查找节点
     *
     * @param key
     * @return
     */
    Node findNode(int key);

    /**
     * 删除节点
     *
     * @param key
     * @return
     */
    boolean deleteNode(int key);

    /**
     * 插入节点
     *
     * @param key
     * @return
     */
    boolean insertNode(int key);
}
