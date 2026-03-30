# 05. Binary Search

핵심: 단조성이 있으면 반씩 날린다. O(n) -> O(log n)

## 문제 목록

| # | 파일 | 문제 | 난이도 | 핵심 포인트 | 상태 |
|---|------|------|--------|------------|------|
| 1 | `01_binary_search.py` | Binary Search (LC 704) | Easy | 기본 이분탐색 | [ ] |
| 2 | `02_search_insert.py` | Search Insert Position (LC 35) | Easy | lower bound 감각 | [ ] |
| 3 | `03_first_bad_version.py` | First Bad Version (LC 278) | Easy | 조건 만족 최소값 | [ ] |
| 4 | `04_search_rotated.py` | Search in Rotated Sorted Array (LC 33) | Medium | 변형 이분탐색 | [ ] |
| 5 | `05_find_peak.py` | Find Peak Element (LC 162) | Medium | 비정렬 이분탐색 | [ ] |
| 6 | `06_koko_bananas.py` | Koko Eating Bananas (LC 875) | Medium | 파라메트릭 서치 입문 | [ ] |

## 언제 이분탐색을 쓰냐

- 정렬된 배열에서 값 찾기 -> 기본 이분탐색
- "조건 만족하는 최소/최대" -> lower/upper bound
- "답이 커지면 항상 만족" (단조성) -> 파라메트릭 서치

## 템플릿

```python
# 기본 이분탐색
def binary_search(nums, target):
    lo, hi = 0, len(nums) - 1
    while lo <= hi:
        mid = (lo + hi) // 2
        if nums[mid] == target:
            return mid
        elif nums[mid] < target:
            lo = mid + 1
        else:
            hi = mid - 1
    return -1

# 파라메트릭 서치 (조건 만족 최소값)
def parametric(lo, hi):
    while lo < hi:
        mid = (lo + hi) // 2
        if 조건_만족(mid):
            hi = mid
        else:
            lo = mid + 1
    return lo
```
