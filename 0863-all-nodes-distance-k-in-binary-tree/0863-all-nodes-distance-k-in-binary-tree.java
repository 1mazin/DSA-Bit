/**
 * Definition for a binary tree node.
 * public class TreeNode {
 *     int val;
 *     TreeNode left;
 *     TreeNode right;
 *     TreeNode(int x) { val = x; }
 * }
 */
class Solution {
    HashMap<TreeNode,TreeNode> map = new HashMap<>();
    public List<Integer> distanceK(TreeNode root, TreeNode target, int K) {
        
        if(root==null) return new ArrayList();
        if(K==0)
        return new ArrayList<>(Collections.singletonList(target.val));
        buildGraph(root);
        return bfs(root,target,K);
       
    }
    
    public void buildGraph(TreeNode root){
        if(root==null) return;
        if(root.left!=null) {
            map.put(root.left,root);
            buildGraph(root.left);
        }
        if(root.right!=null) {
            map.put(root.right,root);
            buildGraph(root.right);
        }
        
    }
    public List<Integer> bfs(TreeNode root,TreeNode target,int K)
    {
        int[] visited=new int[500];
        int curLevel=0;
        List<Integer> ans=new ArrayList<>();
        Queue<TreeNode> q=new LinkedList<>();
        q.add(target);
        visited[target.val]=1;
        while(q.size()!=0) {
            int n=q.size();
            if(curLevel==K) {
                break;
            }
            while(n-->0) {
                TreeNode temp=q.poll();
                if(temp.left!=null && visited[temp.left.val]==0) {
                    q.offer(temp.left);
                    visited[temp.left.val]=1;
                }
                if(temp.right!=null && visited[temp.right.val]==0) {
                    q.offer(temp.right);
                    visited[temp.right.val]=1;
                }
                 if(map.get(temp)!=null && visited[map.get(temp).val]==0) {
                    q.offer(map.get(temp));
                    visited[map.get(temp).val]=1;
                }
            }
           curLevel++; 
            
        }
        while(q.size()!=0)
        {
            System.out.println(q.size());
            ans.add(q.poll().val);
            
        }
        return ans;
    }
}