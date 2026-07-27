def has_negative_number(nums):
    # nums에서 숫자를 하나씩 꺼내 number에 저장하며 반복하세요.

    # number가 0보다 작으면 True를 즉시 반환하세요.

    # 끝까지 음수를 찾지 못하면 False를 반환하세요.
    pass


if __name__ == "__main__":
    print(has_negative_number([1, 2, -3, 4])) # 예상 결과: True
    print(has_negative_number([1, 2, 3, 4]))  # 예상 결과: False
    print(has_negative_number([]))             # 예상 결과: False
    print(has_negative_number([-1]))           # 예상 결과: True
                            