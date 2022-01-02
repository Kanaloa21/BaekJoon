# 유기농 배추

import sys
sys.setrecursionlimit(10**6)

def searchlist(i, j):
	global listend, groupend, mylist, rlist, x, y 
	if i > 0:
		if mylist[i-1][j] == 1 & ((i-1, j) not in rlist[groupend]):
			rlist[groupend].append((i-1, j))
	if i < y-1:
		if mylist[i+1][j] == 1 and ((i+1, j) not in rlist[groupend]):
			rlist[groupend].append((i+1, j))  
	if j > 0:
		if mylist[i][j-1] == 1 & ((i, j-1) not in rlist[groupend]):
			rlist[groupend].append((i, j-1))
	if j < x-1:
		if mylist[i][j+1] == 1 & ((i, j+1) not in rlist[groupend]):
			rlist[groupend].append((i, j+1))
	
	if listend+1 < len(rlist[groupend]):
		listend+=1
		searchlist(rlist[groupend][listend][0], rlist[groupend][listend][1])
	else:
		listend = -1
		groupend += 1
	mylist[i][j] = 0
	pass

repeat_cnt = int(input())

for i in range(repeat_cnt):
	x, y , rlist_cnt = input().split()
	x = int(x)
	y = int(y)
	rlist_cnt = int(rlist_cnt)
	mylist = [[0 for i in range(x)] for i in range(y)]
	rlist = [[] for i in range(rlist_cnt)]

	for i in range(int(rlist_cnt)):
		dx, dy = input().split()
		mylist[int(dy)][int(dx)] = 1

	groupend = 0
	listend = -1 

	for i in range(y):
		for j in range(x):
			# found 1
			if mylist[i][j] == 1:
				rlist[groupend].append((i, j))
				listend += 1
				searchlist(i, j)

	rlist = list(filter(None, rlist))
	print(len(rlist))
