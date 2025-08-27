package com.yalantis.ucrop.util;

import android.graphics.Matrix;

public class MatrixUtils {
    public static final int MATRIX_VALUES_COUNT = 9;
    private static final float[] matrixValues = new float[9];

    public static float getMatrixAngle(Matrix matrix) {
        return (float) (-(Math.atan2((double) getMatrixValue(matrix, 1), (double) getMatrixValue(matrix, 0)) * 57.29577951308232d));
    }

    public static float getMatrixScale(Matrix matrix) {
        return (float) Math.sqrt(Math.pow((double) getMatrixValue(matrix, 3), 2.0d) + Math.pow((double) getMatrixValue(matrix, 0), 2.0d));
    }

    public static float getMatrixValue(Matrix matrix, int i) {
        float[] fArr = matrixValues;
        matrix.getValues(fArr);
        return fArr[i];
    }
}
