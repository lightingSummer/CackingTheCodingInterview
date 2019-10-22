package code;

import common.UndirectedGraphNode;

import java.util.HashSet;
import java.util.LinkedList;
import java.util.Queue;
import java.util.Set;

/**
 * @author     ：lightingSummer
 * @date       ：2019/10/22 0022
 * @description：
 */
public class 有向路径检查 {
    public boolean checkPath(UndirectedGraphNode a, UndirectedGraphNode b) {
        // write code here
        return findPathFirstToSecond(a, b) || findPathFirstToSecond(b, a);
    }

    private boolean findPathFirstToSecond(UndirectedGraphNode a, UndirectedGraphNode b) {
        if(a == null || b == null){
            return false;
        }
        if(a == b){
            return true;
        }
        Queue<UndirectedGraphNode> queue = new LinkedList<>();
        Set<UndirectedGraphNode> hasVisited = new HashSet<>();
        queue.offer(a);
        hasVisited.add(a);
        while (!queue.isEmpty()) {
            UndirectedGraphNode node = queue.poll();
            for (UndirectedGraphNode neighbor : node.neighbors) {
                if (hasVisited.contains(neighbor)) {
                    continue;
                }
                if (neighbor == b) {
                    return true;
                }
                hasVisited.add(neighbor);
                queue.offer(neighbor);
            }
        }
        return false;
    }
}
