# 전체 식당 수 
n = int(input())
# 각 식당에 있는 고객의 수 
rests = list(map(int, input().split(" ")))
# 검사팀장, 검사팀원
ldr, mbr = map(int, input().split(" "))
# 고객의 수 내림차순 
rests.sort(reverse=True)

answer = 0
# 무조건 팀장은 각 식당별로 진행해야함. 
for rest in rests:
    total = rest - ldr
    answer += 1
    if (total <= 0 ) :
        continue
    
    if (total % mbr > 0) :
        answer += total // mbr + 1
    else : 
        answer += total // mbr
print(answer)
    