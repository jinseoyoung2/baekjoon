# https://www.acmicpc.net/problem/5800
# 문제
# 각 반의 학생들의 수학 시험 성적이 주어졌을 때, 최대 점수, 최소 점수, 점수 차이를 구하는 프로그램을 작성하시오.
# 입력 =>
# 첫째 줄에 중덕 고등학교에 있는 반의 수 K (1 ≤ K ≤ 100)가 주어진다.
# 다음 K개 줄에는 각 반의 학생수 N (2 ≤ N ≤ 50)과 각 학생의 수학 성적이 주어진다.
# 시험 성적은 0보다 크거나 같고, 100보다 작거나 같은 정수이고, 공백으로 나누어져 있다. 
# 출력 => 각 반에 대한 출력은 다음과 같이 두 줄로 이루어져 있다.
# 첫째 줄에는 "Class X"를 출력한다. X는 반의 번호이며 입력으로 주어진 순서대로 1부터 증가한다.
# 둘째 줄에는 가장 높은 점수, 낮은 점수, 성적을 내림차순으로 정렬했을 때 가장 큰 인접한 점수 차이 출력

K=int(input())
for i in range(K):
    A=list(map(int, input().split()))
    del A[0]
    A.sort()
    B=[]
    for j in range(0, len(A)-1):
        B.append(A[j+1]-A[j])
    print('Class', i+1)
    print('Max %d, Min %d, Largest gap %d'%(max(A),min(A),max(B)))