# DFS와 BFS
from collections import deque

def dfs(v):
	global way, node
	for i in way:
		if node[v] in i:
			
			pass


def bfs():
	global S
	
	pass

graph = {}
node, edge, start = map(int, input())
graph_info = [list(map(int, input().split())) for _ in range(edge)]

for i in graph_info:
	n1, n2 = [n for n in i]
	if n1 not in graph:
		graph[n1] = n2
	elif n2 not in graph[n1]:
		graph[n1].append(n2)



node = [i for i in range(1, N+1)]
dfs(V)
bfs(N, M, V)