# 00. Array (list)

핵심: 순회, 인덱스 조작, in-place 변환, 구간 합(prefix sum)

## 문제 목록

| # | 파일 | 문제 | 난이도 | 핵심 포인트 | 상태 |
|---|------|------|--------|------------|------|
| 1 | `01_remove_duplicates.py` | Remove Duplicates from Sorted Array (LC 26) | Easy | in-place 덮어쓰기 | [ ] |
| 2 | `02_best_time_to_buy.py` | Best Time to Buy and Sell Stock (LC 121) | Easy | 최솟값 추적 + 최대 이익 | [ ] |
| 3 | `03_rotate_array.py` | Rotate Array (LC 189) | Medium | 뒤집기 3번 트릭 | [ ] |
| 4 | `04_product_except_self.py` | Product of Array Except Self (LC 238) | Medium | prefix/suffix 곱 | [ ] |
| 5 | `05_merge_intervals.py` | Merge Intervals (LC 56) | Medium | 정렬 후 병합 | [ ] |

## 언제 배열 조작을 쓰냐

- "정렬된 배열에서 제자리로" -> in-place 포인터
- "나 자신을 제외한 ~" -> prefix/suffix 분리
- "구간을 합치거나 겹침 판단" -> 정렬 후 순회
- "배열을 O(1) 공간으로 변형" -> 뒤집기, 스왑

## 템플릿

```python
# in-place 덮어쓰기 (slow/fast 포인터)
slow = 0
for fast in range(len(nums)):
    if nums[fast] != nums[slow]:
        slow += 1
        nums[slow] = nums[fast]

# prefix sum
prefix = [0] * (len(nums) + 1)
for i in range(len(nums)):
    prefix[i + 1] = prefix[i] + nums[i]
# 구간 합: sum(nums[l:r]) = prefix[r] - prefix[l]
```
