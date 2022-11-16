from collections import defaultdict
graph=defaultdict(list)
visited=set()

def addnode(root,child):
    graph[root].append(child)

def dfs(child,visited):
    visited.add(child)
    print(child)

    for i in graph[child]:
        if i not in visited:
            dfs(i,visited)

addnode(0, 1)
addnode(0, 2)
addnode(1, 2)
addnode(2, 0)
addnode(2, 3)
addnode(3, 3)
dfs(2,visited)
print(graph)
