package by.it.yarmolenka.MathCalc_v1_severalCalcuations_singleBrackets_Exceptions.Operations.Muls;

import by.it.yarmolenka.MathCalc_v1_severalCalcuations_singleBrackets_Exceptions.CalcException;
import by.it.yarmolenka.MathCalc_v1_severalCalcuations_singleBrackets_Exceptions.Variables.Matrix;

public class MatrixMulMatrix {
    public static Matrix matrixMatrix(Matrix mat1, Matrix mat2) throws CalcException {
        if (mat1.value[0].length == mat2.value.length) {
            double[][] res = new double[mat1.value.length][mat2.value[0].length];
            for (int i = 0; i < res.length; i++)
                for (int j = 0; j < res[i].length; j++)
                    for (int k = 0; k < mat1.value[0].length; k++)
                        res[i][j] += mat1.value[i][k] * mat2.value[k][j];
            return new Matrix(res);
        } else {
            throw new CalcException("Для умножения матрицы на матрицу необходимо чтобы количество столбцов первой матрицы равнялось количеству строк второй матрицы");
        }
    }
}