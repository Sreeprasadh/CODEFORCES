import java.io.*;
import java.util.*;

class DisjointSet{
    List<Integer> parent = new ArrayList<>();
    List<Integer> rank = new ArrayList<>();
    List<Integer> size = new ArrayList<>();

    public DisjointSet(int n){
        for(int i=0; i<=n; i++){
            rank.add(0);
            parent.add(i);
            size.add(1);
        }
    }
    
    public int findUpar(int node){
        if(node == parent.get(node)){
            return node;
        }
        int ulp = findUpar(parent.get(node));
        parent.set(node, ulp);
        return parent.get(node);
    }
   
    public void UnionByRank(int u, int v){
        int ulp_u = findUpar(u);
        int ulp_v = findUpar(v);

        if(ulp_u == ulp_v) return;
        if(rank.get(ulp_u) < rank.get(ulp_v)){
            parent.set(ulp_u, ulp_v);
        }
        else if(rank.get(v) < rank.get(u)){
            parent.set(ulp_v, ulp_u);
        }
        else{
            parent.set(ulp_v, ulp_u);
            int RankU = rank.get(ulp_u);
            rank.set(ulp_u, RankU + 1);
        }
    }

    public void UnionBySize(int u, int v){
        int ulp_u = findUpar(u);
        int ulp_v = findUpar(v);

        if(ulp_u == ulp_v) return;
        if(size.get(ulp_u) < size.get(ulp_v)){
            parent.set(ulp_u, ulp_v);
            size.set(ulp_v, size.get(ulp_u) + size.get(ulp_v));
        }
        else{
            parent.set(ulp_v, ulp_u);
            size.set(ulp_u, size.get(ulp_v) + size.get(ulp_u));
        }
    }
}
class disjointsetUnionByRank{
  public static void main(String[] args){
    DisjointSet ds = new DisjointSet(7);

    ds.UnionBySize(1,2);
    ds.UnionBySize(2,3);
    ds.UnionBySize(4,5);
    ds.UnionBySize(6,7);
    ds.UnionBySize(5,6);

    //checking if 3 and 7 are in the same component or not
    if(ds.findUpar(3) == ds.findUpar(7)){
        System.out.println("Same ");
    }
    else{
        System.out.println(" Not Same ");
    }
    ds.UnionBySize(3,7);
    if(ds.findUpar(3) == ds.findUpar(7)){
        System.out.println("Same ");
    }
    else{
        System.out.println(" Not Same ");
    } 
    
}
}

