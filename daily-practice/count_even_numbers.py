def count_even_numbers(nums):
    # 짝수 개수를 저장할 count를 0으로 초기화하세요.

    # nums에서 숫자를 하나씩 꺼내 number에 저장하며 반복하세요.

    # number를 2로 나눈 나머지가 0이면 count를 1 증가시키세요.

    # 최종 count를 반환하세요.
    pass


if __name__ == "__main__":
    print(count_even_numbers([1, 2, 3, 4, 6])) # 예상 결과: 3
    print(count_even_numbers([1, 3, 5]))       # 예상 결과: 0
    print(count_even_numbers([]))              # 예상 결과: 0
    print(count_even_numbers([2, 2, 2]))       # 예상 결과: 3
