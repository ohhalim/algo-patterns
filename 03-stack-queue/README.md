# 03. Stack / Queue

핵심: 순서가 중요한 문제. "마지막에 넣은 걸 먼저" vs "먼저 넣은 걸 먼저"

## 문제 목록

| # | 파일 | 문제 | 난이도 | 핵심 포인트 | 상태 |
|---|------|------|--------|------------|------|
| 1 | `01_valid_parentheses.py` | Valid Parentheses (LC 20) | Easy | 스택 기본 - 괄호 매칭 | [ ] |
| 2 | `02_min_stack.py` | Min Stack (LC 155) | Medium | 보조 스택으로 최솟값 추적 | [ ] |
| 3 | `03_daily_temperatures.py` | Daily Temperatures (LC 739) | Medium | 단조 스택 입문 | [ ] |
| 4 | `04_next_greater_element.py` | Next Greater Element I (LC 496) | Easy | 단조 스택 + 해시 | [ ] |
| 5 | `05_implement_queue_stack.py` | Implement Queue using Stacks (LC 232) | Easy | 스택 2개로 큐 구현 | [ ] |
| 6 | `06_evaluate_rpn.py` | Evaluate Reverse Polish Notation (LC 150) | Medium | 스택으로 후위표기식 계산 | [ ] |
| 7 | `07_sliding_window_max.py` | Sliding Window Maximum (LC 239) | Hard | 덱(deque) 활용 | [ ] |

## 언제 스택/큐를 쓰냐

- 괄호, 짝 맞추기 -> 스택
- "이전/다음 큰 수" -> 단조 스택
- FIFO 순서 처리, BFS -> 큐/덱
- 되돌리기(undo) -> 스택

## 템플릿

```python
# 스택 기본
stack = []
for char in s:
    if stack and 매칭_조건:
        stack.pop()
    else:
        stack.append(char)

# 단조 스택 (다음 큰 수)
stack = []  # 인덱스 저장
for i in range(len(nums)):
    while stack and nums[i] > nums[stack[-1]]:
        idx = stack.pop()
        result[idx] = nums[i]
    stack.append(i)
```
