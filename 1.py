NA = -1


def sortedMerge(a, b, n, m):

    i = n - 1
    j = m - 1

    lastIndex = n + m - 1


    while (j >= 0):
        if (i >= 0 and a[i] > b[j]):
            a[lastIndex] = a[i]
            i -= 1
        else:
            a[lastIndex] = b[j]
            j -= 1

        lastIndex -= 1

def printArray(arr, n):
    print("Array A after merging B in sorted order : ")

    for i in range(0, n):
        print(arr[i], end=" ")


size_a = 10

a = [21, 24, 25, 29, 31, NA, NA, NA, NA, NA]
n = 5

b = [19, 22, 23, 27, 32]
m = 5

sortedMerge(a, b, n, m)
printArray(a, size_a)
NA = -1


def sortedMerge(a, b, n, m):

    i = n - 1
    j = m - 1

    lastIndex = n + m - 1


    while (j >= 0):
        if (i >= 0 and a[i] > b[j]):
            a[lastIndex] = a[i]
            i -= 1
        else:
            a[lastIndex] = b[j]
            j -= 1

        lastIndex -= 1

def printArray(arr, n):
    print("Array A after merging B in sorted order : ")

    for i in range(0, n):
        print(arr[i], end=" ")


size_a = 10

a = [21, 24, 25, 29, 31, NA, NA, NA, NA, NA]
n = 5

b = [19, 22, 23, 27, 32]
m = 5

sortedMerge(a, b, n, m)
printArray(a, size_a)
# I want to get rid of this all as soon as possible
# and this is very necessary at any cost
# lajkani dastani nat sharmani
