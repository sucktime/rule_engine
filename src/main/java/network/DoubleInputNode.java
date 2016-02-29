package network;

import rule.pattern.JoinPattern;

import java.util.*;

/**
 * Created by Bomb on 16/2/27.
 */
public class DoubleInputNode implements Node {
    private JoinPattern joinPattern;
    private List<Node> nextNodes = new LinkedList<Node>();
    private TreeMap<Object, List<Object>> leftMem = new TreeMap<Object,List<Object>>();
    private TreeMap<Object, List<Object>> rightMem = new TreeMap<Object,List<Object>>();

    public DoubleInputNode(JoinPattern joinPattern){
        this.joinPattern = joinPattern;
    }

    /**
     * find objects from the leftMem which can be joined with rObject
     * @param rObject
     * @return
     */
    public List<Object> testLeft(Object rObject){
        List<Object> joined = new ArrayList<Object>(10);
        for(Object key : leftMem.keySet()){
            List<Object> lobjects = leftMem.get(key);
            for(Object lObject : lobjects){
                if (joinPattern.satisfy(rObject,lObject)){
                    joined.add(lObject);
                }
            }
        }
        return joined;
    }

    public List<Node> getNextNodes(){
        return nextNodes;
    }

    public void addNextNode(Node node){
        nextNodes.add(node);
    }

    public Map<Object,List<Object>> getLeftMem(){
        return leftMem;
    }

    public void addLeftMem(Object key, Object obj){
        if(leftMem.containsKey(key)){
            leftMem.get(key).add(obj);
        }
        else{
            List<Object> list = new LinkedList<Object>();
            list.add(obj);
            leftMem.put(key, list);
        }
    }

    public Map<Object,List<Object>> getRightMem(){
        return rightMem;
    }

    public void addRightMem(Object key, Object obj){
        if(rightMem.containsKey(key)){
            rightMem.get(key).add(obj);
        }
        else{
            List<Object> list = new LinkedList<Object>();
            list.add(obj);
            rightMem.put(key,list);
        }
    }

    @Override
    public NodeType getNodeType(){
        return NodeType.DOUBLE;
    }
}
