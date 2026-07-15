def contains_number(nums, target):
    # 1. nums의 숫자를 하나씩 확인하세요.
    for i in nums:
    # 2. 현재 숫자가 target과 같으면 True를 즉시 반환하세요.
        if i == target:
            return True
    # 3. 반복문이 끝날 때까지 찾지 못하면 False를 반환하세요.
    return False


if __name__ == "__main__":
    print(contains_number([3, 1, 7, 2], 7))  # 예상 결과: True
    print(contains_number([3, 1, 7, 2], 5))  # 예상 결과: False
    print(contains_number([], 1))             # 예상 결과: False
