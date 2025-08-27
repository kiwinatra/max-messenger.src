package defpackage;

import android.content.Context;
import android.content.res.TypedArray;
import android.util.AttributeSet;
import android.util.SparseIntArray;

/* renamed from: oj3  reason: default package */
public final class oj3 {
    public static final SparseIntArray n;
    public float a;
    public float b;
    public float c;
    public float d;
    public float e;
    public float f;
    public float g;
    public int h;
    public float i;
    public float j;
    public float k;
    public boolean l;
    public float m;

    static {
        SparseIntArray sparseIntArray = new SparseIntArray();
        n = sparseIntArray;
        sparseIntArray.append(doc.Transform_android_rotation, 1);
        sparseIntArray.append(doc.Transform_android_rotationX, 2);
        sparseIntArray.append(doc.Transform_android_rotationY, 3);
        sparseIntArray.append(doc.Transform_android_scaleX, 4);
        sparseIntArray.append(doc.Transform_android_scaleY, 5);
        sparseIntArray.append(doc.Transform_android_transformPivotX, 6);
        sparseIntArray.append(doc.Transform_android_transformPivotY, 7);
        sparseIntArray.append(doc.Transform_android_translationX, 8);
        sparseIntArray.append(doc.Transform_android_translationY, 9);
        sparseIntArray.append(doc.Transform_android_translationZ, 10);
        sparseIntArray.append(doc.Transform_android_elevation, 11);
        sparseIntArray.append(doc.Transform_transformPivotTarget, 12);
    }

    public final void a(Context context, AttributeSet attributeSet) {
        TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, doc.Transform);
        int indexCount = obtainStyledAttributes.getIndexCount();
        for (int i2 = 0; i2 < indexCount; i2++) {
            int index = obtainStyledAttributes.getIndex(i2);
            switch (n.get(index)) {
                case 1:
                    this.a = obtainStyledAttributes.getFloat(index, this.a);
                    break;
                case 2:
                    this.b = obtainStyledAttributes.getFloat(index, this.b);
                    break;
                case 3:
                    this.c = obtainStyledAttributes.getFloat(index, this.c);
                    break;
                case 4:
                    this.d = obtainStyledAttributes.getFloat(index, this.d);
                    break;
                case 5:
                    this.e = obtainStyledAttributes.getFloat(index, this.e);
                    break;
                case 6:
                    this.f = obtainStyledAttributes.getDimension(index, this.f);
                    break;
                case 7:
                    this.g = obtainStyledAttributes.getDimension(index, this.g);
                    break;
                case 8:
                    this.i = obtainStyledAttributes.getDimension(index, this.i);
                    break;
                case 9:
                    this.j = obtainStyledAttributes.getDimension(index, this.j);
                    break;
                case 10:
                    this.k = obtainStyledAttributes.getDimension(index, this.k);
                    break;
                case 11:
                    this.l = true;
                    this.m = obtainStyledAttributes.getDimension(index, this.m);
                    break;
                case 12:
                    this.h = pj3.l(obtainStyledAttributes, index, this.h);
                    break;
            }
        }
        obtainStyledAttributes.recycle();
    }
}
