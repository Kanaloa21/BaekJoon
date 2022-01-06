# 트리 순회
import sys

class Node:
    def __init__(self, data, left, right):
        self.data = data
        self.left = left
        self.right = right

def preorder(node):
    print(node.data, end='')
    if node.left != '.':
        preorder(dic[node.left])
    if node.right != '.':
        preorder(dic[node.right])

def inorder(node):
    if node.left != '.':
        inorder(dic[node.left])
    print(node.data, end='')
    if node.right != '.':
        inorder(dic[node.right])

def postorder(node):
    if node.left != '.':
        postorder(dic[node.left])
    if node.right != '.':
        postorder(dic[node.right])
    print(node.data, end='')


if __name__ == "__main__":
    N = int(input())
    dic = {}

    for _ in range(N):
        data, left, right = map(str, sys.stdin.readline().strip().split())
        dic[data] = Node(data, left, right)

    preorder(dic['A'])
    print()
    inorder(dic['A'])
    print()
    postorder(dic['A'])
