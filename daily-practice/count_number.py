def count_number(nums, target):
    # 1. target의 개수를 저장할 변수를 0으로 초기화하세요.
    count = 0
    # 2. nums의 숫자를 하나씩 확인하세요.
    for num in nums:
    # 3. 현재 숫자가 target과 같으면 개수를 1 증가시키세요.
        if target == num:
            count += 1
    # 4. 최종 개수를 반환하세요.
    return count


if __name__ == "__main__":
    print(count_number([1, 2, 2, 3, 2], 2))  # 예상 결과: 3
    print(count_number([1, 2, 3], 4))        # 예상 결과: 0
    print(count_number([], 1))               # 예상 결과: 0
    print(count_number([5, 5, 5], 5))        # 예상 결과: 3
