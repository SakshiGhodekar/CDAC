#include <iostream>

void addMatrices(int** mat1, int** mat2, int** resultMat, int rows, int cols) {
    for (int i = 0; i < rows; ++i) {
        for (int j = 0; j < cols; ++j) {
            *(*(resultMat + i) + j) = *(*(mat1 + i) + j) + *(*(mat2 + i) + j);
        }
    }
}

int main() {
    int rows = 2, cols = 2;


    int** mat1 = new int*[rows];
    int** mat2 = new int*[rows];
    int** resultMat = new int*[rows];
    for (int i = 0; i < rows; ++i) {
        mat1[i] = new int[cols];
        mat2[i] = new int[cols];
        resultMat[i] = new int[cols];
    }

   
    mat1[0][0] = 1; mat1[0][1] = 2;
    mat1[1][0] = 3; mat1[1][1] = 4;

    mat2[0][0] = 5; mat2[0][1] = 6;
    mat2[1][0] = 7; mat2[1][1] = 8;

  
    addMatrices(mat1, mat2, resultMat, rows, cols);


    std::cout << "Resultant Matrix:" << std::endl;
    for (int i = 0; i < rows; ++i) {
        for (int j = 0; j < cols; ++j) {
            std::cout << *(*(resultMat + i) + j) << " ";
        }
        std::cout << std::endl;
    }


    for (int i = 0; i < rows; ++i) {
        delete[] mat1[i];
        delete[] mat2[i];
        delete[] resultMat[i];
    }
    delete[] mat1;
    delete[] mat2;
    delete[] resultMat;

    return 0;
}