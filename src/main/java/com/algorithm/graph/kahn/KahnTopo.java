package com.algorithm.graph.kahn;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.Queue;
import java.util.Set;

public class KahnTopo {
    private List<Node> sortResult; // 用来存储结果集
    private Queue<Node> zeroIndegreeNodes; // 用来存储入度为0的顶点
    private Graph graph;

    // 构造函数，初始化
    public KahnTopo(Graph di) {
        this.graph = di;
        this.sortResult = new ArrayList<Node>();
        this.zeroIndegreeNodes = new LinkedList<Node>();
        // 对入度为0的集合进行初始化
        for (Node node : graph.getGraphNodes()) {
            if (node.getIndegreeNum() == 0) {
                this.zeroIndegreeNodes.add(node);
            }
        }
    }

    // 拓扑排序处理过程
    public void topoSort() {
        while (!zeroIndegreeNodes.isEmpty()) {
            Node zeroIndegreeNode = zeroIndegreeNodes.poll();
            // 将当前顶点添加到结果集中
            sortResult.add(zeroIndegreeNode);

            if (graph.getNodeEdge().keySet().isEmpty()) {
                sortResult.addAll(zeroIndegreeNodes);
                return;
            }

            // 遍历由node引出的所有边
            Set<Node> nodes = graph.getNodeEdge().get(zeroIndegreeNode);
            if (nodes != null) {
                for (Node node : nodes) {
                    node.subIndegreeNum();// 将该边从图中移除，通过减少边的数量来表示
                    if (0 == node.getIndegreeNum()) {
                        zeroIndegreeNodes.add(node);// 如果入度为0，那么加入入度为0的集合

                    }
                }

            }

            graph.getGraphNodes().remove(zeroIndegreeNode);
            graph.getNodeEdge().remove(zeroIndegreeNode);
        }

        // 如果此时图中还存在边，那么说明图中含有环路
        if (!graph.getGraphNodes().isEmpty()) {
            throw new IllegalArgumentException("Has Cycle !");
        }
    }

    public List<Node> getResult() {
        return sortResult;
    }

}
