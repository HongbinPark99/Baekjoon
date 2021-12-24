t = int(input())

list = [1,1,1,2,2]
for i in range(5,100):
    list.append(list[i-5]+list[i-1])

for _ in range(t):
    n = int(input())
    print(list[n-1])