package com.company;

class matrix {

    int n, m;
    int[][] arr;

    matrix() {
        n = m = 0;
        arr = null;
    }

    matrix(int n, int m) {
        this.n = n;
        this.m = m;
        arr = new int[n][m];
    }

    void setArrij(int i, int j, int value) {
        arr[i][j] = value;
    }

    int getArrij(int i, int j) {
        return arr[i][j];
    }

    matrix add(matrix obj) {
        if (n != obj.n || m != obj.m)
            return new matrix();
        matrix res = new matrix(n, m);
        for (int i = 0; i < n; i++)
            for (int j = 0; j < m; j++)
                res.arr[i][j] = arr[i][j] + obj.arr[i][j];
        return res;
    }

    matrix mult(matrix obj) {
        if (m != obj.n)
            return new matrix();
        matrix res = new matrix(n, obj.m);
        for (int i = 0; i < n; i++)
            for (int j = 0; j < obj.m; j++)
                for (int k = 0; k < m; k++)
                    res.arr[i][j] += arr[i][k] * obj.arr[k][j];
        return res;
    }

    void printMatrix()
    {
        for(int i = 0; i < n; i++)
        {
            for(int j = 0; j < m; j++)
                System.out.print(arr[i][j] + " ");
            System.out.println();
        }
    }
}
