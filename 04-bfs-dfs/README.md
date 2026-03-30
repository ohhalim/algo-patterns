# 04. BFS / DFS

핵심: 탐색. "전부 방문해야 하면" DFS, "최단이면" BFS

## 문제 목록

| # | 파일 | 문제 | 난이도 | 핵심 포인트 | 상태 |
|---|------|------|--------|------------|------|
| 1 | `01_number_of_islands.py` | Number of Islands (LC 200) | Medium | 2D 격자 BFS/DFS 입문 | [ ] |
| 2 | `02_flood_fill.py` | Flood Fill (LC 733) | Easy | 4방향 탐색 기초 | [ ] |
| 3 | `03_max_area_island.py` | Max Area of Island (LC 695) | Medium | DFS + 카운트 | [ ] |
| 4 | `04_clone_graph.py` | Clone Graph (LC 133) | Medium | BFS/DFS + visited dict | [ ] |
| 5 | `05_rotting_oranges.py` | Rotting Oranges (LC 994) | Medium | 다중 시작점 BFS | [ ] |
| 6 | `06_course_schedule.py` | Course Schedule (LC 207) | Medium | 위상 정렬 (BFS/DFS) | [ ] |
| 7 | `07_word_search.py` | Word Search (LC 79) | Medium | 백트래킹 DFS | [ ] |

## 언제 BFS/DFS를 쓰냐

- 격자(미로, 섬) 탐색 -> BFS/DFS
- 최단 거리/최소 횟수 -> BFS
- 모든 경로/경우의 수 -> DFS (백트래킹)
- 연결 요소 개수 -> DFS/BFS
- 순서/의존관계 -> 위상 정렬

## 템플릿

```python
# BFS (최단거리)
from collections import deque

def bfs(grid, start):
    queue = deque([start])
    visited = {start}
    while queue:
        x, y = queue.popleft()
        for dx, dy in [(0,1),(0,-1),(1,0),(-1,0)]:
            nx, ny = x + dx, y + dy
            if 0 <= nx < len(grid) and 0 <= ny < len(grid[0]):
                if (nx, ny) not in visited and grid[nx][ny] == 1:
                    visited.add((nx, ny))
                    queue.append((nx, ny))

# DFS (재귀)
def dfs(grid, x, y, visited):
    if x < 0 or x >= len(grid) or y < 0 or y >= len(grid[0]):
        return
    if (x, y) in visited or grid[x][y] == 0:
        return
    visited.add((x, y))
    for dx, dy in [(0,1),(0,-1),(1,0),(-1,0)]:
        dfs(grid, x + dx, y + dy, visited)
```
