# 02. Two Pointer / Sliding Window

핵심: O(n^2)를 O(n)으로. 양끝 조이기 / 구간 늘렸다 줄이기

## 문제 목록

| # | 파일 | 문제 | 난이도 | 핵심 포인트 | 상태 |
|---|------|------|--------|------------|------|
| 1 | `01_valid_palindrome.py` | Valid Palindrome (LC 125) | Easy | 양끝 투포인터 + 필터링 | [ ] |
| 2 | `02_two_sum_sorted.py` | Two Sum II - Sorted (LC 167) | Medium | 정렬된 배열 양끝 조이기 | [ ] |
| 3 | `03_three_sum.py` | 3Sum (LC 15) | Medium | 고정 + 투포인터 | [ ] |
| 4 | `04_container_water.py` | Container With Most Water (LC 11) | Medium | 양끝에서 좁히기 | [ ] |
| 5 | `05_max_subarray_len_k.py` | Max Sum Subarray of Size K | Easy | 고정 크기 슬라이딩 윈도우 | [ ] |
| 6 | `06_longest_no_repeat.py` | Longest Substring Without Repeating (LC 3) | Medium | 가변 슬라이딩 윈도우 | [ ] |
| 7 | `07_min_window_substring.py` | Minimum Window Substring (LC 76) | Hard | 가변 윈도우 + dict | [ ] |

## 언제 투포인터를 쓰냐

- 정렬된 배열 + 합/차 조건 -> 양끝 투포인터
- 연속 구간 + 조건 만족 -> 슬라이딩 윈도우
- "최소/최대 구간" -> 윈도우 늘렸다 줄이기

## 템플릿

```python
# 양끝 투포인터
left, right = 0, len(arr) - 1
while left < right:
    if 조건:
        left += 1
    else:
        right -= 1

# 슬라이딩 윈도우
left = 0
for right in range(len(arr)):
    # 윈도우에 arr[right] 추가
    while 윈도우가_조건_초과:
        # arr[left] 제거
        left += 1
    # 답 갱신
```
