package com.algorithm.graph.kahn;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/**
 * @author liuyong
 */
public class GraphCreator {

    public List<Graph> creatGraph(List<NodeGroup> groups) {

        List<Graph> graphList = new ArrayList<Graph>();
        while (groups.size() > 0) {
            Graph graph = new Graph();
            addFirstNode(groups, graph);
            if (groups.size() > 0) {
                graph = addGraphNode(groups, graph);
            }
            graphList.add(graph);
        }
        return graphList;
    }

    private void addFirstNode(List<NodeGroup> groups, Graph graph) {
        Iterator<NodeGroup> it = groups.iterator();
        while (it.hasNext()) {
            NodeGroup group = (NodeGroup) it.next();
            graph.addNode(group);
            it.remove();

            return;
        }
    }

    private Graph addGraphNode(List<NodeGroup> groups, Graph graph) {

        while (haveNodeInGraph(groups, graph)) {
            Iterator<NodeGroup> it = groups.iterator();
            while (it.hasNext()) {
                NodeGroup group = (NodeGroup) it.next();
                if (graph.contain(group.getStartNode())
                        || graph.contain(group.getEndNode())) {
                    graph.addNode(group);
                    it.remove();
                }
            }
        }
        return graph;
    }

    private boolean haveNodeInGraph(List<NodeGroup> groups, Graph graph) {
        for (NodeGroup group : groups) {
            if (graph.contain(group.getStartNode())
                    || graph.contain(group.getEndNode())) {
                return true;
            }
        }
        return false;
    }

}
