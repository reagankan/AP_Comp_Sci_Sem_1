// A union-find algorithm to detect cycle in a graph
#include <stdio.h>
#include <stdlib.h>
#include <string.h>
 
// a structure to represent an edge in graph
struct Edge
{
    int src, dest;
};
 
// a structure to represent a graph
struct Graph
{
    // V-> Number of vertices, E-> Number of edges
    int V, E;
 
    // graph is represented as an array of edges
    struct Edge* edge;
};
 
// Creates a graph with V vertices and E edges
struct Graph* createGraph(int V, int E)
{
    struct Graph* graph = 
           (struct Graph*) malloc( sizeof(struct Graph) );
    graph->V = V;
    graph->E = E;
 
    graph->edge = 
        (struct Edge*) malloc( graph->E * sizeof( struct Edge ) );
 
    return graph;
}
 
// A utility function to find the subset of an element i
int find(int parent[], int i)
{
    //if node i points to -1, then it is disjointed, so its value/identifier is itself
	if (parent[i] == -1)
        return i;
	//if node does not point to itself, then we recursively find its parent...
	//by looking at the parent of its parent
    return find(parent, parent[i]);
}
 
// A utility function to do union of two subsets 
void Union(int parent[], int x, int y)
{
    int xset = find(parent, x);//find the parent of x
    int yset = find(parent, y);//find the parent of y
    parent[xset] = yset;//merge xset into yset
}
 
// The main function to check whether a given graph contains 
// cycle or not
int isCycle( struct Graph* graph )
{
    // Allocate memory for creating V subsets
    int *parent = (int*) malloc( graph->V * sizeof(int) );
 
    // Initialize all subsets as single element sets
    memset(parent, -1, sizeof(int) * graph->V);
 
    // Iterate through all edges of graph, find subset of both
    // vertices of every edge, if both subsets are same, then 
    // there is cycle in graph.
    for(int i = 0; i < graph->E; ++i)
    {
        int x = find(parent, graph->edge[i].src);
        int y = find(parent, graph->edge[i].dest);
 
        if (x == y)//if x and y are already in the same set, we have a loop
            return 1;
		//if not, we merge
        Union(parent, x, y);
    }
    return 0;
}
 
// Driver program to test above functions
int main()
{
    /* Let us create following graph
         0
        |  \
        |    \
        1-----2 */    
    int V = 3, E = 3;
    struct Graph* graph = createGraph(V, E);
 
    // add edge 0-1
    graph->edge[0].src = 0;
    graph->edge[0].dest = 1;
 
    // add edge 1-2
    graph->edge[1].src = 1;
    graph->edge[1].dest = 2;
 
    // add edge 0-2
    graph->edge[2].src = 0;
    graph->edge[2].dest = 2;
 
    if (isCycle(graph))
        printf( "graph contains cycle" );
    else
        printf( "graph doesn't contain cycle" );
 
    return 0;
}