graph=[[0,0,1,1,0,0],
      [1,0,0,0,1,0],
      [0,1,0,0,0,0],
      [0,0,0,0,0,0],
      [0,0,0,0,0,0]]

for i in range(len(graph)):
    for j in range(len(graph[i])):
        if graph[i][j]:
            print(f"{i} to {j}")
def idfs(graph,start):
    stack = [start] #starting element will be in the stack
    visited = set()
    
    while stack:
        node = stack.pop()
        if node not in visited:
            print(f"{node}")
            visited.add(node)
            print(f"{visited}")
            stack.extend(nei for nei , edge in enumerate(graph[node]) if edge)
start_node = int(input("enter the starting node:"))
idfs(graph,start_node)
