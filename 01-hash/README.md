# 01. Hash (dict / set)

핵심: 빠른 조회 O(1), 빈도 세기, 중복 체크

## 문제 목록

| # | 파일 | 문제 | 난이도 | 핵심 포인트 | 상태 |
|---|------|------|--------|------------|------|
| 1 | `01_two_sum.py` | Two Sum (LC 1) | Easy | dict로 보수 찾기 | [ ] |
| 2 | `02_valid_anagram.py` | Valid Anagram (LC 242) | Easy | 문자 빈도수 비교 | [ ] |
| 3 | `03_contains_duplicate.py` | Contains Duplicate (LC 217) | Easy | set 중복 체크 | [ ] |
| 4 | `04_group_anagrams.py` | Group Anagrams (LC 49) | Medium | sorted key + dict | [ ] |
| 5 | `05_top_k_frequent.py` | Top K Frequent Elements (LC 347) | Medium | Counter + 정렬/힙 | [ ] |
| 6 | `06_longest_consecutive.py` | Longest Consecutive Sequence (LC 128) | Medium | set + 시작점 판별 | [ ] |
| 7 | `07_subarray_sum_k.py` | Subarray Sum Equals K (LC 560) | Medium | prefix sum + dict | [ ] |
| 8 | `08_two_sum_review.py` | Two Sum 복습 | Easy | 복습용 재풀이 | [ ] |

## 언제 해시를 쓰냐

- "~가 있는지 확인" -> set
- "~가 몇 번 나왔는지" -> dict (Counter)
- "O(n^2)를 O(n)으로" -> dict에 미리 저장

## 템플릿

```python
# 빈도 세기
from collections import Counter
count = Counter(nums)

# 보수 찾기
seen = {}
for i, num in enumerate(nums):
    complement = target - num
    if complement in seen:
        return [seen[complement], i]
    seen[num] = i
```
