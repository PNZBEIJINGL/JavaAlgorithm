package com.algorithm.tree;

public class BinarySearchTree implements Tree {

    private Node root;

    public Node findNode(int key) {
        Node currentNode = root;
        while (currentNode != null) {
            if (currentNode.getData() > key) {
                //当前值大则搜索左子树
                currentNode = currentNode.getLeftNode();
            } else if (currentNode.getData() < key) {
                //当前值小则搜索右子树
                currentNode = currentNode.getRightNode();
            } else {
                //相同的返回
                return currentNode;
            }
        }
        //没找到返回空
        return null;
    }

    public boolean deleteNode(int key) {
        return false;
    }

    public boolean insertNode(int key) {
        Node newNode = new Node(key);
        //空树就直接设置根节点
        if (root == null) {
            root = newNode;
            return true;
        }

        Node currentNode = root;
        Node parentNode = null;
        while (currentNode != null) {
            parentNode = currentNode;

            //当前值比插入值大，向左查找
            if (currentNode.getData() > key) {
                currentNode = currentNode.getLeftNode();
                //左节点为空则插入左节点
                if (currentNode == null) {
                    parentNode.setLeftNode(newNode);
                    return true;
                }
            }

            //当前值比插入值小，向右查找
            if (currentNode.getData() < key) {
                currentNode = currentNode.getRightNode();
                //右节点为空则插入右节点
                if (currentNode == null) {
                    parentNode.setRightNode(newNode);
                    return true;
                }
            }
        }
        return false;
    }
}
