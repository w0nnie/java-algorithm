a,b = input().split()
c = input()
a = int(a)
b = int(b)
c = int(c)
d = b + c
e = 0
if d >=60:
    e = d //60
    d -= 60 * e
    a += e
    if a >= 24:
        a -=24
    print(a,d)
else:
    if a >= 24:
        a -=24
    print(a, d)
    