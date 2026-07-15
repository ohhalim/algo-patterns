def sum_numbers(nums):
    # 1. 합계를 저장할 변수 total을 0으로 초기화하세요.
    total = 0

    # 2. nums의 숫자를 하나씩 꺼내 total에 더하세요.
    for i in nums:
        total += i
    # 3. 최종 합계를 반환하세요.
    return total


if __name__ == "__main__":
    print(sum_numbers([1, 2, 3, 4]))  # 예상 결과: 10
    print(sum_numbers([]))            # 예상 결과: 0
    print(sum_numbers([-2, 5, 1]))    # 예상 결과: 4
