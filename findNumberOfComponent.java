class Solution {
  void dfs(int node, List<List<Integer>> adj, boolean[] vis) {
    vis[node] = true;
    for (int neighbour : adj.get(node)) {
      if (!vis[neighbour]) {
        dfs(neighbour, adj, vis);
      }
    }
  }

  public int findNumberOfComponent(int V, List<List<Integer>> edges) {
    List<List<Integer>> adj = new ArrayList<>();

    for (int i = 0; i < V; i++) {
      adj.add(new ArrayList<>());
    }
    for (List<Integer> edge : edges) {
      int u = edge.get(0);
      int v = edge.get(1);

      adj.get(u).add(v);
      adj.get(v).add(u);
    }
    boolean[] vis = new boolean[V];

    int components = 0;

    for (int i = 0; i < V; i++) {
      if (!vis[i]) {
        dfs(i, adj, vis);
        components++;
      }
    }
    return components;
  }
}
