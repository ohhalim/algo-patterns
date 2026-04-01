# algo-patterns

코테 커트라인 통과용 최소 패턴 훈련 -- 6패턴 30문제

## 구조

```
00-array/                    # 5문제 - 순회, in-place, prefix sum
  └── array_problems.ipynb
01-hash/                     # 5문제 - 빠른 조회, 빈도 세기
  └── hash_problems.ipynb
02-two-pointer/              # 5문제 - 양끝 조이기, 슬라이딩 윈도우
  └── two_pointer_problems.ipynb
03-stack-queue/              # 5문제 - 괄호, 단조스택, 큐
  └── stack_queue_problems.ipynb
04-bfs-dfs/                  # 5문제 - 격자탐색, 연결요소, 백트래킹
  └── bfs_dfs_problems.ipynb
05-binary-search/            # 5문제 - 경계 찾기, 파라메트릭 서치
  └── binary_search_problems.ipynb
```

총 30문제. 이게 최소다.

## 문제 목록

### 00-array
| # | 문제 | 난이도 | 핵심 |
|---|------|--------|------|
| 1 | Remove Duplicates (LC 26) | Easy | in-place 덮어쓰기 |
| 2 | Best Time to Buy and Sell Stock (LC 121) | Easy | 최솟값 추적 |
| 3 | Rotate Array (LC 189) | Medium | 뒤집기 3번 트릭 |
| 4 | Product Except Self (LC 238) | Medium | prefix/suffix 곱 |
| 5 | Merge Intervals (LC 56) | Medium | 정렬 후 병합 |

### 01-hash
| # | 문제 | 난이도 | 핵심 |
|---|------|--------|------|
| 1 | Two Sum (LC 1) | Easy | dict로 보수 찾기 |
| 2 | Valid Anagram (LC 242) | Easy | Counter 빈도 비교 |
| 3 | Group Anagrams (LC 49) | Medium | sorted key + dict |
| 4 | Top K Frequent (LC 347) | Medium | Counter + 정렬 |
| 5 | Longest Consecutive (LC 128) | Medium | set 시작점 판별 |

### 02-two-pointer
| # | 문제 | 난이도 | 핵심 |
|---|------|--------|------|
| 1 | Valid Palindrome (LC 125) | Easy | 양끝 투포인터 |
| 2 | Two Sum II (LC 167) | Medium | 정렬 배열 양끝 조이기 |
| 3 | 3Sum (LC 15) | Medium | 고정 + 투포인터 |
| 4 | Container With Most Water (LC 11) | Medium | 양끝 좁히기 |
| 5 | Longest Substring No Repeat (LC 3) | Medium | 가변 슬라이딩 윈도우 |

### 03-stack-queue
| # | 문제 | 난이도 | 핵심 |
|---|------|--------|------|
| 1 | Valid Parentheses (LC 20) | Easy | 스택 괄호 매칭 |
| 2 | Min Stack (LC 155) | Medium | 보조 스택 |
| 3 | Daily Temperatures (LC 739) | Medium | 단조 스택 |
| 4 | Queue using Stacks (LC 232) | Easy | 스택 2개로 큐 |
| 5 | Evaluate RPN (LC 150) | Medium | 후위표기식 |

### 04-bfs-dfs
| # | 문제 | 난이도 | 핵심 |
|---|------|--------|------|
| 1 | Flood Fill (LC 733) | Easy | 4방향 탐색 기초 |
| 2 | Number of Islands (LC 200) | Medium | 연결 요소 개수 |
| 3 | Max Area of Island (LC 695) | Medium | DFS + 카운트 |
| 4 | Rotting Oranges (LC 994) | Medium | 다중 시작 BFS |
| 5 | Word Search (LC 79) | Medium | 백트래킹 DFS |

### 05-binary-search
| # | 문제 | 난이도 | 핵심 |
|---|------|--------|------|
| 1 | Binary Search (LC 704) | Easy | 기본 이분탐색 |
| 2 | Search Insert Position (LC 35) | Easy | lower bound |
| 3 | Search Rotated Array (LC 33) | Medium | 변형 이분탐색 |
| 4 | Find Peak Element (LC 162) | Medium | 비정렬 이분탐색 |
| 5 | Koko Eating Bananas (LC 875) | Medium | 파라메트릭 서치 |

## 규칙

1. 하루 1문제만 완료해도 성공
2. 한 문제 25분 제한 -- 20분 막히면 해설 보고 재구현
3. 풀고 나면 복기 작성:
   - 왜 이 패턴인지
   - 시간/공간 복잡도
   - 오늘 실수 1개
4. 복습: D+1, D+3, D+7에 다시 풀기

## 완료 기준

- 문제 보고 패턴을 10초 안에 말할 수 있다
- 템플릿 없이 15분 안에 구현한다
- 경계값 3개를 스스로 테스트한다 (빈 입력, 답 없음, 중복/극단값)
