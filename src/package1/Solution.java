package package1;

/**
 * @author huang
 */
import org.w3c.dom.NodeList;

import java.util.*;


public class Solution {
    /**
     * lru design
     * @param operators int整型二维数组 the ops
     * @param k int整型 the k
     * @return int整型一维数组
     */
    public void LRU (int[][] operators, int k) {
        // write code here
        //Stack<Node> st=new Stack();
        Node[] NodeList=new Node[k];
        int head=0;
        int tail=0;
        int l=0;
        for(int i=0;i<operators.length;i++){
            if(operators[i][0]==2){
                l++;
            }
        }
        int c=0;
        int[] res=new int[l];
        List<Integer> li=new ArrayList<Integer>();
        for(int i=0;i<operators.length;i++){
            for(int j=0;j<operators[i].length;j++){
                if(operators[i][j]==1){
                    if((head-tail)%k==1){
                        NodeList[tail]=null;
                    }
                    head=(head-1+k)%k;
                    NodeList[head]=new Node(operators[i][j+1],operators[i][j+2]);
                    break;
                }else if(operators[i][j]==2){
                    boolean flag=false;

                    for(Node curNode:NodeList){
                        if(curNode.getKey()==operators[i][j+1]){
                            flag=true;
                            res[c]=curNode.getValue();
                            c++;
                            break;
                        }
                    }
                    if(!flag){
                        res[c]=-1;
                        c++;
                    }
                }
            }
        }
    }
}
class Node{
    int key;
    int value;
    public Node(int key,int value){
        this.key=key;
        this.value=value;
    }
    public int getKey(){
        return this.key;
    }
    public int getValue(){
        return this.value;
    }
}
