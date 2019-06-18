package com.algorithm.tree;

/**
 * 二叉搜索树(binary search tree)
 */
public class Node {

    //二叉搜索树要求：若它的左子树不空，则左子树上所有结点的值均小于它的根结点的值；
    //若它的右子树不空，则右子树上所有结点的值均大于它的根结点的值； 它的左、右子树也分别为二叉排序树。

    //节点数据
    private int data;
    //左子树
    private Node leftNode;
    //右子树
    private Node rightNode;

    public Node(int data) {
        this.data = data;
    }

    public void display() {
        System.out.println(data);
    }

    public int getData() {
        return data;
    }

    public void setData(int data) {
        this.data = data;
    }

    public Node getLeftNode() {
        return leftNode;
    }

    public void setLeftNode(Node leftNode) {
        this.leftNode = leftNode;
    }

    public Node getRightNode() {
        return rightNode;
    }

    public void setRightNode(Node rightNode) {
        this.rightNode = rightNode;
    }

}
