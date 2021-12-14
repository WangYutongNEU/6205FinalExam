package neu.info6205.edu;
import java.util.*;


public class Solution {
    public int connectedSquareSum(int graph_nodes, List<Integer> graph_from, List<Integer> graph_to){

        Map<Integer, Set<Integer>> graph = new HashMap<>();
        int squareSum = 0;
        // building graph
        for (int i : graph_from){
            for (int j : graph_to){
                int from = i;
                int to = j;

                if (graph.containsKey(from)) {
                    Set<Integer> child = graph.get(from);
                    child.add(to);
                }
                else{
                    Set<Integer> child = new HashSet<>();
                    child.add(from);
                    graph.put(to, child);
                }
                if(graph.containsKey((to))){
                    Set<Integer> child = graph.get(to);
                    child.add(from);
                }
                else{
                    Set<Integer> child = new HashSet<>();
                    child.add(from);
                    graph.put(to, child);
                }
            }
        }
        HashSet<Integer> visited = new HashSet<>();

              return squareSum;
          }
    }


