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
        Node current = root;
        Node parent = root;
        boolean isLeftChild = false;
        //查找删除的节点， 如果没有找到则删除
        while (current.getData() != key) {
            parent = current;
            if (current.getData() > key) {
                isLeftChild = true;
                current = current.getLeftNode();
            } else {
                isLeftChild = false;
                current = current.getRightNode();
            }
            if (current == null) {
                return false;
            }
        }

        //删除节点没有子节点
        if (current.getLeftNode() == null && current.getRightNode() == null) {
            if (current == root) {
                root = null;
            } else if (isLeftChild == true) {
                parent.setLeftNode(null);
            } else {
                parent.setRightNode(null);
            }
            return true;
        }
        //右子树为空，左子树不为空
        if (current.getLeftNode() != null && current.getRightNode() == null) {
            if (current == root) {
                root = current.getLeftNode();
            } else if (isLeftChild) {
                parent.setLeftNode(current.getLeftNode());
            } else {
                parent.setRightNode(current.getLeftNode());
            }
            return true;
        }
        //左子树为空， 右子树不为空
        if (current.getLeftNode() == null && current.getRightNode() != null) {
            if (current == root) {
                root = current.getRightNode();
            } else if (isLeftChild) {
                parent.setLeftNode(current.getRightNode());
            } else {
                parent.setRightNode(current.getRightNode());
            }
            return true;
        }

        if (current.getLeftNode() != null && current.getRightNode() != null) {
            //todo
        }

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
