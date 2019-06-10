package com.algorithm.graph.kahn;

import java.util.LinkedList;
import java.util.Queue;

public class GraphProcessHelper {

    private Queue<NodeGroup> nodeGroups;

    public GraphProcessHelper() {
    }

    public Queue<NodeGroup> getNodeGroups(Graph graph, Node startNode,
                                          Node endNode) {
        nodeGroups = new LinkedList<NodeGroup>();

        NodeGroup group = getNode(graph, startNode, endNode);
        if (group != null) {
            nodeGroups.add(group);
        }
        return nodeGroups;
    }

    private NodeGroup getNode(Graph graph, Node startNode, Node endNode) {
        if (graph.getNodeEdge().get(startNode) == null || graph.getNodeEdge().get(startNode).size() == 0) {
            return null;
        }

        if (graph.getNodeEdge().get(startNode).contains(endNode)) {
            return graph.findNodeGroup(new NodeGroup(startNode, endNode));
        }

        for (Node edgeNode : graph.getNodeEdge().get(startNode)) {
            nodeGroups.add(graph
                    .findNodeGroup(new NodeGroup(startNode, endNode)));
            NodeGroup group = getNode(graph, edgeNode, endNode);
            if (group != null) {
                return group;
            }
            nodeGroups.poll();
        }
        return null;
    }
}
