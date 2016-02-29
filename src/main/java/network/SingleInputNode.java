package network;

import rule.pattern.Pattern;

import java.util.LinkedList;
import java.util.List;

/**
 * Created by Bomb on 16/2/27.
 */
public class SingleInputNode implements Node{
    private Pattern pattern;
    private List<Node> nextNodes;

    public SingleInputNode(Pattern pattern){
        this.pattern = pattern;
        this.nextNodes = new LinkedList<Node>();
    }

    public List<Node> getNextNodes(){
        return nextNodes;
    }

    public void addNextNode(Node node){
        nextNodes.add(node);
    }

    @Override
    public NodeType getNodeType(){
        return NodeType.SINGLE;
    }
}
