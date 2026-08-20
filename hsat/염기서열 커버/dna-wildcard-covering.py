N, M = map(int, input().split())

sequences = [input() for _ in range(N)]


# 두 문자열을 하나의 초염기서열로 커버할 수 있는지 확인
def can_cover(a, b):
    for i in range(M):
        if a[i] != '.' and b[i] != '.' and a[i] != b[i]:
            return False

    return True


# 새로운 문자열을 기존 그룹에 넣을 수 있는지 확인
def can_add(group, sequence):
    for other in group:
        if not can_cover(other, sequence):
            return False

    return True


answer = N
groups = []


def dfs(index):
    global answer

    # 모든 문자열을 그룹에 배치한 경우
    if index == N:
        answer = min(answer, len(groups))
        return

    # 이미 찾은 답보다 그룹이 많아졌다면 종료
    if len(groups) >= answer:
        return

    sequence = sequences[index]

    # 기존 그룹에 넣어보기
    for group in groups:
        if can_add(group, sequence):
            group.append(sequence)

            dfs(index + 1)

            group.pop()

    # 새로운 그룹에 넣어보기
    groups.append([sequence])

    dfs(index + 1)

    groups.pop()


dfs(0)

print(answer)