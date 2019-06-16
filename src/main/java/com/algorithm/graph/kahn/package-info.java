package com.algorithm.graph.kahn;

/*
 卡恩算法：卡恩于1962年提出的算法。

 简单来说就是，
 假设L是存放结果的列表，先找到那些入度为零的节点，把这些节点放到L中，因为这些节点没有任何的父节点。
 然后把与这些节点相连的边从图中去掉，再寻找图中的入度为零的节点。对于新找到的这些入度为零的节点来说，
 他们的父节点已经都在L中了，所以也可以放入L。重复上述操作，直到找不到入度为零的节点。
 如果此时L中的元素个数和节点总数相同，说明排序完成；如果L中的元素个数和节点总数不同，说明原图中存在环，无法进行拓扑排序。


L ← 包含已排序的元素的空列表
S ← 没有进入边的节点（入度为零的节点）的集合
当 S 非空时：
    将节点n从S移走
    将n加到L尾
    for each node m with an edge e from n to m do
        remove edge e from the graph
        if m has no other incoming edges then
            insert m into S
如 图有边 则：
    return error   (图至少有一个环)
否则：
    return L   (以拓扑排序的顺序)


 */