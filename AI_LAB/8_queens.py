def print_solution(board):
    for row in board:
        print(" ".join('Q' if cell else '.' for cell in row))
    print("\n")

def is_safe(board, row, col):
    for i in range(col):
        if board[row][i]:
            return False
    for i, j in zip(range(row, -1, -1), range(col, -1, -1)):
        if board[i][j]:
            return False
    for i, j in zip(range(row, len(board), 1), range(col, -1, -1)):
        if board[i][j]:
            return False
    return True

def solve_nq_util(board, col):
    if col >= len(board):
        print_solution(board)
        return True
    res = False
    for i in range(len(board)):
        if is_safe(board, i, col):
            board[i][col] = 1
            res = solve_nq_util(board, col + 1) or res
            board[i][col] = 0
    return res
           

def solve_nq(N):
    board = [[0 for _ in range(N)] for _ in range(N)]
    if not solve_nq_util(board, 0):
        print("Solution does not exist")

N = int(input("Enter the size of the chessboard (N): "))
if N <= 0 or N > 100: 
    print(f"Invalid board size. Please choose a value between 1 and 100")
else:
    solve_nq(N)


