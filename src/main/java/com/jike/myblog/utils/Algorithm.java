package com.jike.myblog.utils;



import java.util.*;

public class Algorithm {

    //15
    public List<List<Integer>> threeSum(int[] nums) {
        List<List<Integer>> res=new ArrayList<>(new ArrayList<>(3));
        if(nums.length==3&&nums[1]+nums[2]==-nums[0]){




              res.add(Arrays.asList(nums[0],nums[1],nums[2]));
              return res;


        }
        Arrays.sort(nums);

        Map<Integer,Integer>map=new HashMap<>();
        for (int i = 0; i <nums.length-3 ; i++) {
            if(i>=1&&nums[i]==nums[i-1]){
                continue;
            }

            for (int j = i+1; j <nums.length ; j++) {
                int a=nums[i]+nums[j];
                    if(!map.containsKey(nums[j])){
                        map.put(-a,1);
                    }else {
                        List resItem=new ArrayList();
                        resItem.add(nums[i]);
                        resItem.add(-a);
                        resItem.add(nums[j]);
                        res.add(0,resItem);
                    }

            }
        }
        return res;
    }

    //122
    public int maxProfit(int[] prices) {
        int totalProfit=0;
        for(int i=0;i<prices.length-1;i++){
            if(prices[i]>prices[i+1]){
                totalProfit+=totalProfit+prices[i]-prices[i-1];
            }
        }

        return totalProfit;
    }

    //BFS
    public List<List<Integer>> levelOrder(TreeNode root) {


        ArrayList<List<Integer>> res=new ArrayList<>();
        if (root==null){
            return  res;
        }

        Deque<TreeNode> deque=new LinkedList<>();

        deque.add(root);

        while (!deque.isEmpty()){
            List<Integer>list=new ArrayList<>();
            int levelSize=deque.size();

            for (int i = 0; i < levelSize; i++) {
                TreeNode node=deque.poll();
                list.add(node.val);
                if(node.left!=null){
                    deque.add(node.left);
                }
                if(node.right!=null){
                    deque.add(node.right);
                }

            }
            res.add(list);

        }

        return  res;
    }


    public List<List<Integer>> levelOrder2(TreeNode root){
        ArrayList<List<Integer>> res=new ArrayList<>();
             DFS(res,root,0);
        return  res;
    }

    public void DFS( List<List<Integer>> res,TreeNode node,Integer level){
        if(node == null){
            return;
        }

        if(res.size()<=level){
            res.add(new ArrayList<>());
        }

        res.get(level).add(node.val);

        DFS(res,node.left,level+1);
        DFS(res,node.right,level+1);

    }


    class TreeNode {
        int val;
        TreeNode left;
        TreeNode right;
        TreeNode(int x) { val = x; }
    }


    //70
    public int climbStairs(int n) {
        if(n<=2)
            return n;

        int a=1,b=2,total=0;

        for (int i = 2; i <n ; i++) {
                total=a+b;
                a=b;
                b=total;

        }
        return total;
    }

    //120
    public int minimumTotal(List<List<Integer>> triangle) {
       int row=triangle.size();
       int col=triangle.get(row-1).size();

       int [][] DP=new int[row][col];
        for (int i = row-1; i >=0; i--) {
            List<Integer> curList=triangle.get(i);
            for (int j = 0; j <=curList.size()-1 ; j++) {
                if(i==row-1){
                    DP[i][j]=triangle.get(row-1).get(j);
                }else {
                    DP[i][j]=curList.get(j)+Math.min(DP[i+1][j],DP[i+1][j+1]);
                }

            }
        }

        return DP[0][0];

    }

    //152
    public int maxProduct(int[] nums) {
        int res=nums[0];
        int[][] DP=new int[nums.length][2];
        DP[0][0]=nums[0];//最小值
        DP[0][1]=nums[0];//最大值
        for (int i = 1; i <nums.length ; i++) {

            int a=DP[i-1][1]*nums[i];
            int b=DP[i-1][0]*nums[i];
            int c=nums[i];
            int max=a;
            int min=a;

           if(b>max) {
               max = b;
           }
            if(c>max){
                max=c;
            }

            if(b<min){
               min=b;
            }

            if(c<min){
               min=c;
            }

            DP[i][1]=max;
            DP[i][0]=min;


            if(res<DP[i][1]){
                res=DP[i][1];
            }


        }

        return  res;
    }

    //242
    public boolean isAnagram(String s, String t) {
        Map<Character,Integer> str1=new HashMap<>();
        Map<Character,Integer> str2=new HashMap<>();

        for(int i=0;i<s.length();i++){
            if(str1.containsKey(s.charAt(i))){
                str1.put(s.charAt(i),str1.get(s.charAt(i))+1);
            }else {
                str1.put(s.charAt(i),1);
            }

        }

        for(int i=0;i<t.length();i++){
            if(str2.containsKey(t.charAt(i))){
                str2.put(t.charAt(i),str2.get(t.charAt(i))+1);
            }else {
                str2.put(t.charAt(i),1);
            }
        }

        return str1.equals(str2);
    }

    //51
    public List<List<String>> solveNQueens(int n) {
        List<List<String>> res = new ArrayList<List<String>>();
        int[] queenList = new int[n]; //第i个位置存放的数表示row行时，Q的列
        placeQueen(queenList, 0, n, res);//在第0行放Q
        return res;
    }
    private void placeQueen(int[] queenList, int row, int n, List<List<String>> res) {
        //如果已经填满，就生成结果
        if (row == n) {
            ArrayList<String> list = new ArrayList<String>();
            for (int i = 0; i < n; i++) {
                String str = "";
                for (int col = 0; col < n; col++){
                    if(queenList[i] == col) {
                        str += "Q";
                    } else {
                        str += ".";
                    }
                }
                list.add(str);
            }
            res.add(list);
        }
        for (int col = 0; col < n; col++) {//循环每一列
            if (isValid(queenList, row, col)) { //如果在该列放入Q不冲突的话
                queenList[row] = col;
                placeQueen(queenList, row + 1, n, res);
            }
        }
    }

    private boolean isValid(int[] queenList, int row, int col) {
        for (int i = 0; i < row; i++) {
            int pos = queenList[i];
            if (pos == col) { //和新加入的Q处于同一列
                return false;
            }
            if (pos - i == col- row) { //在新加入的Q的右对角线上
                return false;
            }
            if (pos  + i == col+row) { //在新加入的Q的左对角线上
                return false;
            }
        }
        return true;
    }

    //200
    public int numIslands(char[][] grid) {
        int totalNums=0;
        int row=grid.length;

        for (int i = 0; i <row ; i++) {
            for (int j = 0; j <grid[i].length ; j++) {
                if(grid[i][j]=='1'){
                    totalNums++;
                    numIslandsDFS(grid,i,j);
                }
                else {
                    continue;
                }
            }
        }

        return totalNums;
    }

    public void numIslandsDFS(char[][] grid ,int i,int j){
        if(i<0||j<0||i>=grid.length||j>=grid[i].length){
            return;
        }

        if(grid[i][j]=='1'){
            grid[i][j]=0;

            numIslandsDFS( grid,i+1,j);
            numIslandsDFS( grid,i-1,j);
            numIslandsDFS( grid,i,j+1);
            numIslandsDFS( grid,i,j-1);
        }

    }


    //50
    public double myPow(double x, int n) {
        if(n == 0) return 1;

        int t = n / 2;
        if(n < 0) {
            t = -t;
            x = 1 / x;
        }
        double res = myPow(x, t);
        if(n % 2 == 0) return res * res;
        return res * res * x;
    }


    //191
    public int hammingWeight(int n) {
        int count=0;
        /*while (n!=0){
            count++;
            n=n&(n-1);
        }*/

        while (n!=0){
            if(n%2==1)
                count++;
            n=n>>1;
        }
        return count;
    }

    //231
    public boolean isPowerOfTwo(int n) {

        if(n<=0){
            return false;
        }

        if(n!=0&&(n&(n-1))==0){
            return true;
        }
        return false;
    }




}
