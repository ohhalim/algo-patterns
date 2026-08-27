# 알고리즘 풀 때 꼭 알아야 하는 Java 문법 (참고용) Cheatsheet

> **원글 출처**: "알고리즘 풀 때 꼭 알아야 하는 Java 문법" — 작성자 **예름** (velog, 2026-07-27)
> **목적**: 자바 알고리즘/코테 문제 풀 때 필요한 지식을 **실전에서 쓰는 것만** 정리한 요약본.
> 세부 개념의 깊이있는 설명 대신, 문제 풀이에 바로 쓸 수 있는 문법과 자료구조 사용법 위주로 담았습니다.

---

## 목차

- [입출력](#입출력)
- [출력 / StringBuilder](#출력--stringbuilder)
- [자료구조](#자료구조)
  - [Array](#array)
  - [Collection (공통)](#collection-공통)
  - [List](#list)
  - [Set / TreeSet](#set--treeset)
  - [Map](#map)
  - [Deque](#deque)
  - [PriorityQueue](#priorityqueue)
- [Graph 표현 3가지](#graph-표현-3가지)
- [ArrayList vs LinkedList vs int[]](#arraylist-vs-linkedlist-vs-int)
- [정렬 / Comparable / Comparator](#정렬--comparable--comparator)
- [기타](#기타)

---

## 입출력

입출력은 가장 기본이지만 처음엔 가장 어렵습니다. **빠르게** 읽고 쓰기 위해 `BufferedReader`를 씁니다.

### 기본 (한 줄씩 입력)

```java
import java.io.*;
import java.util.*;

class Main {
    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String str = br.readLine();                    // 한 줄 문자열
        int i = Integer.parseInt(br.readLine());       // int는 Integer.parseInt()로 변환
        long l = Long.parseLong(br.readLine());        // long도 동일
    }
}
```

### 한 줄에 여러 입력 (공백 구분)

```java
class Main {
    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine()); // 토큰화해서 임시 저장
        String s1 = st.nextToken();   // 공백 기준으로 잘라서 반환
        int n1  = Integer.parseInt(st.nextToken());
        int n2  = Integer.parseInt(st.nextToken());
    }
}
```

### 공백 없는 문자열 (격자/보드 입력)

예: 아래처럼 공백 없이 주어지는 보드.

```
BBWB
BWBW
BBWB
WBBW
```

`StringTokenizer`는 공백 기준으로만 자르므로 쓸 수 없습니다. 문자열로 받아 `charAt()`으로 한 글자씩 뽑습니다.

```java
class Main {
    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int N = Integer.parseInt(br.readLine());
        int[][] board = new int[N][N];

        for (int i = 0; i < N; i++) {
            String line = br.readLine();            // 문자열 한 줄 받고
            for (int j = 0; j < N; j++) {
                board[i][j] = line.charAt(j);       // 한 글자씩 저장
            }
        }
    }
}
```

---

## 출력 / StringBuilder

- `System.out.print()`: 출력 후 개행 문자(`\n`) 없음
- `System.out.println()`: 출력 후 개행 문자(`\n`) 있음

`System.out.println()`을 여러 번 호출하면 시간이 오래 걸려 간혹 **시간초과**가 발생합니다. 그럴 땐 `StringBuilder`에 임시 모아둔 뒤 마지막에 한 번만 출력합니다.

```java
class Main {
    public static void main(String[] args) throws Exception {
        StringBuilder sb = new StringBuilder();
        int answer = 0;
        sb.append(answer).append('\n');   // 개행 문자도 append 해야 개행됨
        // sb.append("...");

        System.out.println(sb.toString()); // .toString()은 생략 가능
    }
}
```

### StringBuilder vs StringBuffer

| 구분 | StringBuilder | StringBuffer |
|------|--------------|--------------|
| **thread-safe** | ❌ (동시성 미보장) | ✅ (동시성 보장) |
| 성능 | 더 빠름 | 상대적으로 느림 |

알고리즘/코테는 당연히 **멀티스레드를 고려하지 않으므로** 조금이라도 빠른 `StringBuilder`를 쓰는 게 이득입니다.

---

## 자료구조

Java의 대표 자료구조: **List, Set, Map**. 이들은 `Collection`을 상속하므로 `Collection`의 함수들을 그대로 쓸 수 있습니다.

> **Collection 공통/핵심 함수**
> - `add(e)`: 원소 하나 추가
> - `addAll(c)`: 컬렉션 전체 추가
> - `contains(o)`: 포함 여부
> - `containsAll(c)`: 전체 포함 여부
> - `isEmpty()`: 비어 있는지
> - `size()`: 원소 개수
> - `clear()`: 전체 삭제
> - `remove(o)`: 해당 원소 삭제
> - `removeAll(c)`: 해당 컬렉션에 포함된 원소 전체 삭제
> - `toArray()`: 배열로 변환

---

### Array

가장 기본. 크기가 고정된 배열입니다.

```java
int[] arr = new int[10];
```

**`Arrays.fill()`** — 배열을 특정 값으로 채우기

```java
import java.util.*;

// 1차원
int[] arr = new int[10];
Arrays.fill(arr, -1); // { -1, -1, ..., -1 }

// 2차원 (행마다 채워야 함)
int[][] arr2 = new int[10][10];
for (int i = 0; i < 10; i++) {
    Arrays.fill(arr2[i], -1);
}
```

**`Arrays.copyOf()`** — 배열 복사

```java
int[] arr = { 1, 2, 3 };
int[] copy = Arrays.copyOf(arr, arr.length); // 내용/길이 복사
```

### List

**제네릭 타입은 반드시 참조 타입(Wrapper)이어야 합니다.** primitive(`int`, `long`...)는 쓸 수 없습니다.

```java
List<Integer> intList     = new ArrayList<>();
List<Long>    longList    = new ArrayList<>();
List<Double>  doubleList  = new ArrayList<>();
List<Character> charList  = new ArrayList<>();
List<Boolean> booleanList = new ArrayList<>();
List<String>  stringList  = new ArrayList<>();

// List<int> list = new ArrayList<>(); // ❌ 컴파일 에러 — 반드시 Wrapper

list.add(1);
list.get(0);
list.set(0, 10);
list.remove(0);
list.size();
list.contains(10);
Collections.sort(list);
```

**주요 연산과 복잡도**

| 분류 | 함수 | 시간복잡도 | 설명 |
|------|------|-----------|------|
| 추가 | `add(e)` | 평균 O(1) | 맨 뒤에 추가 |
| 위치 추가 | `add(index, e)` | O(N) | 원하는 위치에 추가 |
| 전체 추가 | `addAll(c)` | O(M) | 맨 뒤에 컬렉션 추가 |
| 조회 | `get(index)` | O(1) | 해당 위치 원소 반환 |
| 첫 위치 | `indexOf(o)` | O(N) | 처음 등장 인덱스 |
| 마지막 위치 | `lastIndexOf(o)` | O(N) | 마지막 등장 인덱스 |
| 삭제(인덱스) | `remove(index)` | O(N) | 해당 위치 원소 삭제 후 반환 |
| 삭제(원소) | `remove(o)` | O(N) | 해당 원소 삭제 |
| 수정 | `set(index, e)` | O(1) | 해당 위치 원소 변경 |

---

### Set / TreeSet

**Set (HashSet)** — 순서를 보장하지 않음. 중복 허용 안 함.

```java
Set<Integer> set = new HashSet<>();
set.add(1);
set.remove(1);
set.contains(1);
set.size();

// 특정 값 꺼내기: 인덱스 접근 불가 → 순회하거나 배열/리스트로 변환
for (int num : set) {
    System.out.println(num);
}
```

| 함수 | 시간복잡도 | 설명 |
|------|-----------|------|
| `add(e)` | 평균 O(1) | 추가 (중복이면 무시) |
| `contains(o)` | 평균 O(1) | 포함 여부 |
| `remove(o)` | 평균 O(1) | 삭제 |
| `clear()` | O(N) | 전체 삭제 |
| `isEmpty()` / `size()` | O(1) | 비어있는지 / 개수 |

**TreeSet** — 원소를 **자동 정렬**해서 저장. 항상 정렬된 순서 유지.

```java
TreeSet<Integer> set = new TreeSet<>();
set.add(3); set.add(1); set.add(2);
System.out.println(set); // [1, 2, 3]

set.first();      // 최소값
set.last();       // 최대값
set.ceiling(4);   // 4 이상인 최소 원소
set.floor(4);     // 4 이하인 최대 원소
set.higher(4);    // 4 초과인 최소 원소
set.lower(4);     // 4 미만인 최대 원소
set.pollFirst();  // 최소값 삭제 후 반환
set.pollLast();   // 최대값 삭제 후 반환
```

모두 O(log N) (add/remove/contains/first/last/ceiling/floor/higher/lower/pollFirst/pollLast), isEmpty/size는 O(1).

---


### Map

```java
Map<String, Integer> map = new HashMap<>();

map.put(1, "A");
map.get(1);
map.getOrDefault(0, "B");   // 키가 없으면 기본값 반환
map.remove(1);
map.containsKey(1);
map.containsValue("B");

// key 순회
for (String key : map.keySet()) { }

// key-value 조합 순회
for (Map.Entry<String, Integer> entry : map.entrySet()) { }
```

**리스트를 값으로 쓰는 패턴 (그룹핑 핵심)**

```java
// 방법 1: containsKey 분기
if (!map.containsKey(key)) {
    map.put(key, new ArrayList<>());
}
map.get(key).add(value);

// 방법 2: 한 줄로 (권장)
map.computeIfAbsent(key, k -> new ArrayList<>()).add(value);
```

| 함수 | 시간복잡도 | 설명 |
|------|-----------|------|
| `put(k, v)` | 평균 O(1) | 키에 값 저장 (기존 키면 덮어쓰기) |
| `get(k)` | 평균 O(1) | 해당 키의 값 반환 |
| `getOrDefault(k, d)` | 평균 O(1) | 키 없으면 기본값 |
| `containsKey(k)` | 평균 O(1) | 키 존재 여부 |
| `containsValue(v)` | O(N) | 값 존재 여부 |
| `remove(k)` | 평균 O(1) | 삭제 |
| `keySet()` / `values()` / `entrySet()` | O(1) | 뷰 반환 |
| `computeIfAbsent(k, fn)` | 평균 O(1) | 키 없으면 값 생성 후 반환 |

---

### Deque

양쪽에서 삽입·삭제가 가능한 자료구조. **Queue와 Stack 모두 구현 가능**해서 코테에서 가장 많이 씁니다.

```java
Deque<Integer> dq = new ArrayDeque<>();

dq.offer(1);   // 큐처럼 사용
dq.poll();     // 큐처럼 사용
dq.push(2);    // 스택처럼 사용
dq.pop();      // 스택처럼 사용
dq.peek();

dq.addFirst(x);  dq.addLast(x);
dq.pollFirst();  dq.pollLast();
dq.peekFirst();  dq.peekLast();
```

| 분류 | 함수 | 설명 |
|------|------|------|
| 앞/뒤 추가 | `addFirst/addLast` | 실패 시 예외 |
| 앞/뒤 추가 | `offerFirst/offerLast` | 실패 시 false |
| 앞/뒤 조회 | `getFirst/getLast` | 비면 예외 |
| 앞/뒤 조회 | `peekFirst/peekLast` | 비면 null |
| 앞/뒤 삭제 | `removeFirst/removeLast` | 비면 예외 |
| 앞/뒤 삭제 | `pollFirst/pollLast` | 비면 null |

전부 O(1). contains/clear는 O(N).

---

### PriorityQueue

자동 정렬되는 Queue. **기본은 오름차순(최소 힙)** 입니다.

```java
// 기본 (오름차순)
PriorityQueue<Integer> pq = new PriorityQueue<>();

// 내림차순 (최대 힙)
PriorityQueue<Integer> pq2 = new PriorityQueue<>(Collections.reverseOrder());
// ⚠️ (o1,o2) -> o2 - o1 은 오버플로우 위험이 있어 지양
PriorityQueue<Integer> pq3 = new PriorityQueue<>((o1,o2) -> Integer.compare(o2,o1));
```

| 함수 | 시간복잡도 | 설명 |
|------|-----------|------|
| `offer(e)` / `add(e)` | O(log N) | 우선순위에 맞게 추가 |
| `peek()` | O(1) | 최우선 원소 (비면 null) |
| `element()` | O(1) | 최우선 원소 (비면 예외) |
| `poll()` | O(log N) | 최우선 원소 삭제 후 반환 |
| `remove(o)` / `contains(o)` | O(N) | 특정 원소 |

---


## Graph 표현 3가지

Java에는 그래프가 내장 없음 → 직접 구현. 대표적으로 **인접 리스트 / 인접 행렬 / 간선 리스트**.

### 인접 리스트 (가장 권장)

```java
List<List<Integer>> graph = new ArrayList<>();
for (int i = 0; i <= N; i++) graph.add(new ArrayList<>());
graph.get(1).add(2);
graph.get(1).add(3);
graph.get(2).add(4);

// 가중치가 있으면 int[]{ 다음 정점, 가중치 } 로 저장
List<List<int[]>> wgraph = new ArrayList<>();
for (int i = 0; i <= N; i++) wgraph.add(new ArrayList<>());
wgraph.get(1).add(new int[]{ 2, 5 });
wgraph.get(1).add(new int[]{ 3, 2 });

// 순회
for (int[] edge : wgraph.get(now)) {
    int next = edge[0];
    int cost = edge[1];
}
```

- 공간: O(V + E)
- 특정 정점의 인접 정점 순회: O(degree(V))
- 두 정점 연결 여부 확인: O(degree(V))
- 간선 추가: 평균 O(1)

### 인접 행렬

```java
int[][] graph = new int[N + 1][N + 1];
graph[1][2] = 1;  // 연결 여부
graph[1][3] = 1;
graph[1][2] = 5;  // 가중치 그래프는 가중치 저장

// 무방향 가중치:
graph[1][2] = 5;
graph[2][1] = 3;
```

- 공간: O(V²)
- 특정 정점의 인접 정점 순회: O(V)
- 두 정점 연결 여부 확인: **O(1)**

### 간선 리스트

```java
List<int[]> edges = new ArrayList<>();
edges.add(new int[]{ 1, 2, 5 });  // { 출발, 도착, 가중치 }
edges.add(new int[]{ 1, 3, 10 });

for (int[] edge : edges) {
    int from = edge[0];
    int to   = edge[1];
    int cost = edge[2];
}
```

- 공간: O(E)

---

## ArrayList vs LinkedList vs int[]

| 구분 | ArrayList\<Integer\> | LinkedList\<Integer\> | int[] |
|------|---------------------|----------------------|-------|
| 구조 | 동적 배열 | 연결 리스트 | 고정 배열 |
| 크기 변경 | ✅ | ✅ | ❌ |
| 인덱스 조회 | O(1) | O(N) | O(1) |
| 마지막 추가 | 평균 O(1) | O(1) | ❌ |
| 중간 삽입·삭제 | O(N) | 탐색 포함 O(N) | 직접 이동 |
| primitive 저장 | ❌ | ❌ | ✅ |
| **코테 사용 빈도** | ⭐⭐⭐⭐⭐ | ⭐ | ⭐⭐⭐⭐⭐ |

**핵심 특징**
- **ArrayList**: 인덱스 조회 빠름 O(1), 중간 삽입·삭제 느림 O(N). 코테에서 가장 많이 쓰는 List.
- **LinkedList**: 삽입·삭제 자체는 빠르지만 위치 탐색이 O(N). 코테에선 거의 안 씀. Queue/Deque는 `ArrayDeque` 권장.
- **int[]**: 크기 고정, primitive 직접 저장 → 메모리/성능 최고. 크기를 미리 안다면 최고 선택.

### List.of() vs Arrays.asList()

```java
List<Integer> list1 = List.of(1, 2, 3);
List<Integer> list2 = Arrays.asList(1, 2, 3);
```

둘 다 **크기가 고정**되어 `add()`, `remove()` 사용 불가.

| 구분 | List.of() | Arrays.asList() |
|------|-----------|-----------------|
| add(), remove() | ❌ | ❌ |
| set() | ❌ | ✅ |
| null 저장 | ❌ | ✅ |
| 원본 배열과 연결 | ❌ | ✅ |

**수정 가능한 리스트가 필요하면** 새 `ArrayList`로 감싸기:

```java
List<Integer> list = new ArrayList<>(List.of(1, 2, 3));
List<Integer> list = new ArrayList<>(Arrays.asList(1, 2, 3));
```

---


## 정렬 / Comparable / Comparator

정렬의 기본은 **오름차순**입니다.

### Arrays.sort() — 배열 정렬

primitive 배열은 Comparator를 쓸 수 없고, **객체 배열(Integer[])은 Comparator를 쓸 수 있습니다.**

```java
int[] arr = new int[10];
Arrays.sort(arr);   // 오름차순

// 내림차순 (Wrapper 클래스여야 Comparator 사용 가능)
Integer[] arr2 = { 1, 2, 3 };
Arrays.sort(arr2, Comparator.reverseOrder());
```

### Collections.sort() — Collection 정렬

```java
List<Integer> list = new ArrayList<>();
Collections.sort(list);
```

### Comparable vs Comparator

**Comparable** — 객체 내부에 기본 정렬 기준을 정의 (`compareTo` 하나만 구현)

```java
class Node implements Comparable<Node> {
    int cost;

    @Override
    public int compareTo(Node o) {
        return Integer.compare(this.cost, o.cost); // this.cost - o.cost 대신 권장
    }
}
```

**Comparator** — 정렬할 때마다 기준을 바꾸고 싶을 때 사용

```java
Collections.sort(list, (o1, o2) -> {
    if (o1.cost != o2.cost) return Integer.compare(o1.cost, o2.cost);
    return Integer.compare(o1.idx, o2.idx);
});
```

> ⚠️ `a - b` 뺄셈 방식은 Integer 오버플로우 위험이 있어 `Integer.compare(a, b)` 권장.

---

## 기타

### length vs length() vs size()

- `length` : **배열**의 길이
- `length()` : **String**의 길이
- `size()` : **Collection**의 길이

```java
int[] arr = new int[10];
System.out.println(arr.length);            // 10

String str = "안녕하세요";
System.out.println(str.length());          // 5

List<Integer> list = new ArrayList<>(Arrays.asList(1, 2, 3));
System.out.println(list.size());           // 3
```

### Math

```java
Math.max(a, b);   // 최대
Math.min(a, b);   // 최소
Math.abs(x);      // 절대값
Math.sqrt(x);     // 루트
Math.pow(a, b);   // 제곱수
Math.ceil(x);     // 올림
Math.floor(x);    // 내림
Math.round(x);    // 반올림
```

### 문자열 ⇄ 숫자

```java
int n = Integer.parseInt(str);
long l = Long.parseLong(str);
String s = String.valueOf(n);
```

### 자주 쓰는 import

이 두 개만 import하면 99%는 커버됩니다.

```java
import java.io.*;
import java.util.*;
```

---

## 핵심 요약

1. **입력**은 `BufferedReader` + `StringTokenizer`, **출력**은 `StringBuilder` 모아서 한 번에.
2. `List`/`Set`의 제네릭은 **Wrapper 타입**만.
3. `HashMap`의 `getOrDefault`/`computeIfAbsent`가 그룹핑/빈도수에서 최고.
4. Queue/Stack은 `ArrayDeque`(Deque), 정렬 큐는 `PriorityQueue`(기본 오름차순).
5. 그래프는 **인접 리스트 `List<List<int[]>>`** 가 기본.
6. 정렬 기준 커스텀은 `Integer.compare` 사용 (오버플로우 안전).

