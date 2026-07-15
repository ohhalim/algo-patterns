def contains_duplicate(nums):
    # 1. 이미 확인한 숫자를 저장할 빈 set을 만드세요.
    # set = {} -> 이거 딕셔너리잖슴 키:값 이거 딕셔너리
    seen = set()
    # 2. nums의 숫자를 하나씩 확인하세요.
    for num in nums:
    # 3. 현재 숫자가 set에 이미 있으면 True를 즉시 반환하세요.
        if num in seen:
            return True
    # 4. 처음 확인한 숫자라면 set에 추가하세요.
        seen.add(num) # seen의 add기능을 실행한다 # 앞에있는 대상의 기능을 사용한다
    # 5. 반복문이 끝날 때까지 중복이 없으면 False를 반환하세요.
    return False


if __name__ == "__main__":
    print(contains_duplicate([1, 2, 3, 1]))  # 예상 결과: True
    print(contains_duplicate([1, 2, 3, 4]))  # 예상 결과: False
    print(contains_duplicate([]))             # 예상 결과: False
    print(contains_duplicate([5, 5]))         # 예상 결과: True
