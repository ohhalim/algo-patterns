# Java 알고리즘 패턴 커리큘럼 기획서

> **상태**: 📋 기획 (계획 문서)
> **목적**: 블로그 **"알고리즘 풀 때 꼭 알아야 하는 Java 문법"**(예름, velog)을 바탕으로, 기존 `daily-practice/algo-patterns`(Python) 14개 패턴을 **Java 문법 가이드와 매핑**한 학습 커리큘럼을 설계한다.
> **이번 범위**: 기획/문서만 작성. 실제 Java 소스 구현은 다음 단계에서 승인 후 진행.

---

## 1. 학습 목적과 전제

- **시작 수준**: 기존 `06-base-ps-java/`(Java 기초 연습)를 마친 상태. Python으로 `algo-patterns` 패턴들을 이미 복습한 상태.
- **목표**: 같은 패턴을 **Java 문법으로** 체화한다. 문제를 보자마자 "어떤 자료구조/메서드를 쓸지" 바로 떠올리는 수준.
- **핵심**: 문법 자체가 답이 아니라, **패턴과 Java 자료구조 API가 연결**되는 것이 핵심.
- **전제 문서**: `06-base-ps-java/JAVA_SYNTAX_CHEATSHEET.md` (블로그 문법 요약본)을 수시로 참고.

---

## 2. 패턴 ↔ Java 문법 매핑표

각 패턴별로 **핵심 Java 문법 키워드(블로그 내용)** 를 정리했습니다.

### Phase 0. 공통 전제 (모든 문제에 적용)

| Java 문법 | 사용처 |
|----------|--------|
| `BufferedReader` + `InputStreamReader` | 빠른 입력 |
| `StringTokenizer` | 공백 분리 입력 |
| `charAt()` | 공백 없는 문자열(격자) 입력 |
| `StringBuilder` | 출력 최적화 (모아서 한 번에) |
| `import java.io.*; import java.util.*;` | 기본 import |

---

### P1. Array / 빈도수 카운팅 (Frequency Counting)

Python `04-frequency-counting` ↔ Java

| Java 문법 | 용도 |
|----------|------|
| `HashMap` + `getOrDefault` | 빈도수 세기 (`count.put(x, count.getOrDefault(x, 0) + 1)`) |
| `HashMap` + `computeIfAbsent` | 그룹핑 (값 → 리스트) |
| `HashSet` | 중복 체크 / 존재 여부 |
| `int[]` (고정 크기) | 알파벳/범위가 한정된 빈도표 (예: ASCII 26) |

**대표 문제**: Two Sum, Valid Anagram, Contains Duplicate, Group Anagrams, Top K Frequent.

---

### P2. 투 포인터 (Two Pointers)

Python `03-two-pointer` ↔ Java

| Java 문법 | 용도 |
|----------|------|
| `int[] arr`, `while (left < right)` | 양 끝에서 좁히기 |
| `Arrays.sort()` | 정렬 후 투포인터 |
| `Integer.compare` | 합/차 비교 시 오버플로우 안전 |
| `new int[]{...}` | 결과 배열 반환 (Two Sum II, 3Sum) |

**대표 문제**: Valid Palindrome, Two Sum II, 3Sum, Container With Most Water.

---

### P3. 슬라이딩 윈도우 (Sliding Window)

Python `05-sliding-window` ↔ Java

| Java 문법 | 용도 |
|----------|------|
| `HashMap` / `int[] freq` | 윈도우 내 빈도 카운트 |
| `left`, `right` 포인터 | 가변 윈도우 확장/축소 |
| `Math.max()` | 최대 길이 갱신 |

**대표 문제**: Longest Substring No Repeat, Max Sum Fixed Window.

---

### P4. 스택 / 큐 / 덱 (Stack, Queue, Deque)

Python `09-stack-and-queue` ↔ Java

| Java 문법 | 용도 |
|----------|------|
| `Deque<Integer> stack = new ArrayDeque<>()` | 스택 (push/pop/peek) |
| `Deque<Integer> queue = new ArrayDeque<>()` | 큐 (offer/poll/peek) |
| `ArrayDeque` | 코테 권장 (LinkedList보다 빠름) |
| `Stack`/`Queue` 인터페이스 | 기본 인터페이스 |

**대표 문제**: Valid Parentheses, Min Stack, Daily Temperatures(단조 스택), Queue using Stacks.

---

### P5. 정렬 / 커스텀 정렬 (Sorting)

Python `01-sorting-basics` ↔ Java

| Java 문법 | 용도 |
|----------|------|
| `Arrays.sort(int[])` | primitive 배열 (오름차순) |
| `Collections.sort(List)` | 컬렉션 정렬 |
| `Comparator` 람다 | 정렬 때마다 기준 변경 |
| `Comparable` | 객체 기본 정렬 기준 (Node class) |
| `Integer.compare` | 오버플로우 안전 비교 |

**대표 문제**: Merge Intervals, Sort Colors, Custom sort of objects.

---

### P6. 이진 탐색 (Binary Search)

Python `02-searching-patterns`, `12-binary-search-variations` ↔ Java

| Java 문법 | 용도 |
|----------|------|
| `while (low <= high)`, `mid = low + (high - low) / 2` | 기본 이분탐색 (오버플로우 안전) |
| `Arrays.binarySearch(int[], key)` | 내장 탐색 (없으면 음수 인덱스) |
| lower bound 직접 구현 | 삽입 위치, 파라메트릭 서치 |

**대표 문제**: Binary Search, Search Insert Position, Koko Eating Bananas.

---

### P7. 그리디 (Greedy)

Python `08-greedy-basics` ↔ Java

| Java 문법 | 용도 |
|----------|------|
| `PriorityQueue` | 최소/최대 선택 반복 (기본 오름차순) |
| `Collections.reverseOrder()` | 최대 힙 |
| `Math.max/min` | 최솟값·최댓값 추적 |

**대표 문제**: Best Time to Buy/Sell, Minimum cost to connect(=PQ), 유럽 회의실 배정(종료시간 정렬).

---

### P8. 재귀 / 백트래킹 (Recursion & Backtracking)

Python `09-recursion-basics` ↔ Java

| Java 문법 | 용도 |
|----------|------|
| 메서드 재귀 호출 | 피보나치, 거듭제곱, 부분집합 |
| `List<Integer> path` + `add/remove` | 백트래킹 경로 관리 |
| `new ArrayList<>(path)` | 결과 저장 시 복사본 스냅샷 |

**대표 문제**: Climbing Stairs, Subsets, Permutations.

---

### P9. BFS / DFS / 그래프 (Graph Traversal)

Python `11-tree-and-graph-bfs-dfs` ↔ Java

| Java 문법 | 용도 |
|----------|------|
| `List<List<Integer>> graph` | 인접 리스트 (가장 권장) |
| `List<List<int[]>> graph` | 가중치 그래프 `{next, cost}` |
| `int[][] graph` | 인접 행렬 (정점 수 작을 때) |
| `Deque<...> queue` | BFS (offer/poll) |
| 재귀 메서드 / `visited` 배열 | DFS |
| `PriorityQueue` | **다익스트라 (가중치 최단 경로)** |

**대표 문제**: Number of Islands(격자 DFS), BFS 최단 거리, Dijkstra.

---

### P10. DP (동적 계획법)

기존 `06_base_ps.ipynb`의 DP 포함

| Java 문법 | 용도 |
|----------|------|
| `int[] dp = new int[n+1]` | 1차원 DP |
| `Arrays.fill(dp, -1)` | 방문 여부/초기화 |
| `Math.max/min` | 점화식 갱신 |

**대표 문제**: Climbing Stairs, Maximum Subarray(Kadane), Coin Change.

---

## 3. 학습 순서 로드맵 (제안)

기존 저장소 규칙(하루 1문제, 25분 제한, D+1/D+3/D+7 복습)을 그대로 재사용합니다.

| 주차 | 패턴 | 비고 |
|------|------|------|
| 1주차 | **입출력/공통 전제** + Array/빈도수 | BufferedReader, StringBuilder, HashMap 감각 익히기 ✅ (P1 구현 완료 8/27) |
| 2주차 | 투 포인터 + 슬라이딩 윈도우 | 포인터/윈도우 개념을 Java로 |
| 3주차 | 스택/큐/덱 + 정렬/Comparator | ArrayDeque, Comparable/Comparator |
| 4주차 | 이진 탐색 + 그리디/우선순위 큐 | PriorityQueue 활용 |
| 5주차 | 재귀/백트래킹 + BFS/DFS/그래프 | 인접 리스트 그래프 |
| 6주차 | DP + 종합 복습 | 패턴 혼합 판단 능력 |

> 각 패턴은 Python에서 풀었던 것과 **동일한 문제**를 Java로 다시 푸는 것을 권장합니다. 그래야 "패턴 → Java API" 연결만 달라진다는 것을 체감할 수 있습니다.

---

## 4. 파일 구조 제안 (구현 단계에서 사용)

기존 `07-java-algorithm-patterns/` 폴더를 기준으로 구현 소스를 배치합니다.

```
07-java-algorithm-patterns/
├── JAVA_PATTERN_CURRICULUM.md      # 이 기획서
├── src/main/java/com/algopatterns/
│   ├── io/         # 입출력 + StringBuilder 연습
│   ├── frequency/  # P1 빈도수 카운팅
│   ├── twopointer/ # P2 투 포인터
│   ├── sliding/    # P3 슬라이딩 윈도우
│   ├── stackqueue/ # P4 스택/큐/덱
│   ├── sorting/    # P5 정렬 / Comparator
│   ├── search/     # P6 이진 탐색
│   ├── greedy/     # P7 그리디 / PriorityQueue
│   ├── recursion/  # P8 재귀 / 백트래킹
│   ├── graph/      # P9 BFS/DFS/그래프
│   └── dp/         # P10 DP
└── (향후 빌드 스크립트)
```

**빌드 방식**: 기존 `06-base-ps-java`와 동일하게 **빌드툴 없이** `javac`/`java`로 직접 컴파일·실행하는 방식을 권장 (현재 저장소 컨벤션 기준, Java 25 확인됨).

---

## 5. 복습/완료 기준 (기존 규칙 재사용)

1. 하루 1문제만 완료해도 성공
2. 한 문제 25분 제한 — 20분 막히면 해설 보고 재구현
3. 풀고 나면 복기 작성:
   - 왜 이 패턴인지
   - 시간/공간 복잡도
   - 오늘 실수 1개
4. 복습: D+1, D+3, D+7에 다시 풀기

**완료 기준**
- 문제 보고 어떤 **Java 자료구조/메서드**를 쓸지 10초 안에 말할 수 있다
- 템플릿 없이 15분 안에 구현한다
- 경계값 3개를 스스로 테스트한다 (빈 입력, 답 없음, 중복/극단값)

---

## 6. 다음 단계 (구현)

이 기획서가 확정되면, 다음 순서로 실제 학습자료를 생성할 수 있습니다.

- [x] 1. Java 패턴별 대표 문제 구현 (각 패키지에 파일 작성 + `main`에서 테스트) — P1 완료 (5문제, 8/27)
- [x] 2. 입출력/빈도수(P1)부터 시작해 순차적으로 진행 — P1 완료
- [x] 3. 각 파일을 저장소 컨벤션(`06-base-ps-java`의 주석/테스트 스타일)에 맞춰 작성 — P1 적용
- [ ] 4. 문제 풀면서 체크리스트 업데이트
- [ ] 5. **P2 투 포인터** 구현 (다음 차례)

