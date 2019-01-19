package com.jike.myblog.utils;

class Solution {

    public int findCircleNum(int[][] M) {
        UnionFind uf=new UnionFind(M.length);
        for (int i = 0; i <M.length ; i++) {
            for (int j = 0; j <M.length ; j++) {
                if(M[i][j]==1)
                uf.unionElements(i,j);
            }
        }
        return uf.count;
    }

     class UnionFind {

        int count;
        private int[] id;
        private int[] rank;//基于rank 的优化 union时 将rank小的节点指向rank大的节点

        public  UnionFind(int size){
            id=new int[size];
            rank=new int[size];
            for (int i = 0; i <id.length ; i++) {
                id[i]=i;
                rank[i]=1;
                count=size;
            }
        }

        int getSize(){
            return id.length;
        }
        void union(int p,int q){
            int pId=find(p);
            int qId=find(q);

            if (qId==pId)
                return ;

            for (int i = 0; i <id.length ; i++) {
                if(id[i]==pId)
                    id[i]=qId;
            }

        }

        boolean isConnected(int p,int q){
            return findRoot(p)==findRoot(q);
        }

        private  int find(int p){
            if(p<0||p>id.length){
                return -1;
            }
            return  id[p];
        }

        private  int findRoot(int p){
            if(p<0||p>id.length){
                return -1;
            }
            if(p!=id[p]){
                id[p]=findRoot(id[p]);//路径压缩

            }

            return  id[p];
        }

        public void unionElements(int p,int q){
            int qRoot=findRoot(q);
            int pRoot=findRoot(p);

            if(pRoot==qRoot)
                return;


            if(rank[pRoot]<rank[qRoot]){
                id[pRoot]=qRoot;
            }
            else if(rank[pRoot]>rank[qRoot]){
                id[qRoot]=pRoot;
            }
            else {
                id[pRoot]=qRoot;
                rank[qRoot]+=1;
            }
            count--;

        }




    }


    //50
    public double myPow(double x, int n) {

        if(n<0)
            return 1.0/myPow(x,-n);


        if(n==0)
            return 1;




        if(n%2==0){
            return myPow(x*x,n/2);
        }

        return myPow(x,n-1)*x;



    }
}
