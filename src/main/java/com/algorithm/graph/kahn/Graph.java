package com.algorithm.graph.kahn;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import java.util.Map;
import java.util.Set;

/**
 * @author liuyong
 */
public class Graph {

    private Set<Node> graphNodes = new HashSet<Node>();
    private Map<Node, Set<Node>> nodeEdge = new HashMap<Node, Set<Node>>();
    private List<NodeGroup> nodeGroups = new ArrayList<NodeGroup>();

    public NodeGroup findNodeGroup(NodeGroup group) {
        for (NodeGroup nodeGroup : nodeGroups) {
            if (nodeGroup.equals(group)) {
                return nodeGroup;
            }
        }
        return null;
    }

    public boolean addNode(NodeGroup nodeGroup) {

        Node startNode = addToGraphNodes(nodeGroup.getStartNode());
        Node endNode = addToGraphNodes(nodeGroup.getEndNode());

        if (nodeEdge.containsKey(startNode)
                && nodeEdge.get(startNode).contains(endNode)) {
            return false;
        } else {
            addNodeEdge(startNode, endNode);
            addNodeGroup(nodeGroup);
            return true;
        }
    }

    private void addNodeGroup(NodeGroup nodeGroup) {
        NodeGroup findWeight = findNodeGroup(nodeGroup);
        if (findWeight == null) {
            nodeGroups.add(nodeGroup);
        }
    }

    private void addNodeEdge(Node startNode, Node endNode) {
        if (nodeEdge.containsKey(startNode)) {
            nodeEdge.get(startNode).add(endNode);
        } else {
            Set<Node> temp = new HashSet<Node>();
            temp.add(endNode);
            nodeEdge.put(startNode, temp);
        }
        endNode.addIndegreeNum();
    }

    private Node addToGraphNodes(Node node) {
        Node graphNode = findGraphNode(node);
        if (graphNode != null) {
            return graphNode;
        } else {
            graphNodes.add(node);
            return node;
        }
    }

    private Node findGraphNode(Node node) {
        for (Node graphNode : graphNodes) {
            if (graphNode.equals(node)) {
                return graphNode;
            }
        }
        return null;
    }

    public Set<Node> getGraphNodes() {
        return graphNodes;
    }

    public Map<Node, Set<Node>> getNodeEdge() {
        return nodeEdge;
    }

    public boolean contain(Node node) {
        return graphNodes.contains(node);
    }

    public boolean isEmptyNode() {
        return graphNodes.isEmpty();
    }

}
