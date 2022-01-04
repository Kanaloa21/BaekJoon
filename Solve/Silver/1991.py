# 트리 순회

class Node:
    def __init__(self, me, left, right) -> None:
        self.me = me
        self.left = left
        self.right = right
        pass

class Obj:
    def __init__(self, alphabat) -> None:
        self.alphabat = chr(alphabat)
        pass

num = 3 #int(input())
obj_bundle = []

for i in range(num):
    obj_bundle.append(Obj(ord('A') + i)) 

for i in range(num):
    x, y, z = input().split()
    Node.__init__(obj_bundle[i], x, y, z)