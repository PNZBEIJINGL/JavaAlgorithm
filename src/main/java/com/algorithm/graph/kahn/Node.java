package com.algorithm.graph.kahn;

public class Node {
    private Object source;
    private int indegreeNum = 0;

    public Node(Object source) {
        this.source = source;
    }

    public Object getSource() {
        return source;
    }

    public int getIndegreeNum() {
        return indegreeNum;
    }

    public void addIndegreeNum() {
        indegreeNum++;
    }

    public void subIndegreeNum() {
        indegreeNum--;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int result = 1;
        result = prime * result + ((source == null) ? 0 : source.hashCode());
        return result;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;
        if (getClass() != obj.getClass())
            return false;
        Node other = (Node) obj;
        if (source == null) {
            if (other.source != null)
                return false;
        } else if (!source.equals(other.source))
            return false;
        return true;
    }


}
