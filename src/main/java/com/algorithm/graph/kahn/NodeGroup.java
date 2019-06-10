package com.algorithm.graph.kahn;

/**
 * 
 * @author liuyong
 *
 */
public class NodeGroup {

	private Node startNode; // A->B : A=startNode B=endNode
	private Node endNode;
	private String value;

	public NodeGroup(Node startNode, Node endNode) {
		this.startNode = startNode;
		this.endNode = endNode;
	}

	public NodeGroup(Node startNode, Node endNode, String value) {
		this.startNode = startNode;
		this.endNode = endNode;
		this.value = value;
	}

	public boolean containNode(Node node) {
		return startNode.equals(node) || endNode.equals(node);
	}

	@Override
	public boolean equals(Object obj) {
		if (obj instanceof NodeGroup) {
			NodeGroup group = (NodeGroup) obj;
			return this.getStartNode().equals(group.getStartNode())
					&& this.getEndNode().equals(group.getEndNode());
		}
		return false;
	}

	@Override
	public int hashCode() {
		return super.hashCode();
	}

	public Node getStartNode() {
		return startNode;
	}

	public void setStartNode(Node startNode) {
		this.startNode = startNode;
	}

	public Node getEndNode() {
		return endNode;
	}

	public void setEndNode(Node endNode) {
		this.endNode = endNode;
	}

	public String getValue() {
		return value;
	}

	public void setValue(String value) {
		this.value = value;
	}

}
