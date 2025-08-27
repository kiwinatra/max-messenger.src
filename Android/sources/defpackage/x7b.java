package defpackage;

import android.graphics.Bitmap;
import android.util.SparseBooleanArray;
import java.util.ArrayList;
import java.util.List;

/* renamed from: x7b  reason: default package */
public final class x7b {
    public final Bitmap a;
    public final ArrayList b;
    public int c = 16;
    public final int d = 12544;
    public final int e = -1;
    public final ArrayList f;

    public x7b(Bitmap bitmap) {
        ArrayList arrayList = new ArrayList();
        this.b = arrayList;
        ArrayList arrayList2 = new ArrayList();
        this.f = arrayList2;
        if (bitmap == null || bitmap.isRecycled()) {
            throw new IllegalArgumentException("Bitmap is not valid");
        }
        arrayList2.add(zc4.w);
        this.a = bitmap;
        arrayList.add(bdf.d);
        arrayList.add(bdf.e);
        arrayList.add(bdf.f);
        arrayList.add(bdf.g);
        arrayList.add(bdf.h);
        arrayList.add(bdf.i);
    }

    public final zc4 a() {
        ArrayList arrayList;
        int i;
        boolean z;
        int i2;
        char c2;
        float f2;
        int max;
        Bitmap bitmap = this.a;
        if (bitmap != null) {
            int i3 = this.d;
            double d2 = -1.0d;
            if (i3 > 0) {
                int height = bitmap.getHeight() * bitmap.getWidth();
                if (height > i3) {
                    d2 = Math.sqrt(((double) i3) / ((double) height));
                }
            } else {
                int i4 = this.e;
                if (i4 > 0 && (max = Math.max(bitmap.getWidth(), bitmap.getHeight())) > i4) {
                    d2 = ((double) i4) / ((double) max);
                }
            }
            int i5 = 0;
            Bitmap createScaledBitmap = d2 <= 0.0d ? bitmap : Bitmap.createScaledBitmap(bitmap, (int) Math.ceil(((double) bitmap.getWidth()) * d2), (int) Math.ceil(((double) bitmap.getHeight()) * d2), false);
            int width = createScaledBitmap.getWidth();
            int height2 = createScaledBitmap.getHeight();
            int[] iArr = new int[(width * height2)];
            createScaledBitmap.getPixels(iArr, 0, width, 0, 0, width, height2);
            int i6 = this.c;
            ArrayList arrayList2 = this.f;
            q13 q13 = new q13(iArr, i6, arrayList2.isEmpty() ? null : (w7b[]) arrayList2.toArray(new w7b[arrayList2.size()]));
            if (createScaledBitmap != bitmap) {
                createScaledBitmap.recycle();
            }
            ArrayList arrayList3 = this.b;
            zc4 zc4 = new zc4((ArrayList) q13.o, arrayList3);
            int size = arrayList3.size();
            int i7 = 0;
            while (true) {
                SparseBooleanArray sparseBooleanArray = (SparseBooleanArray) zc4.o;
                if (i7 < size) {
                    bdf bdf = (bdf) arrayList3.get(i7);
                    float[] fArr = bdf.c;
                    int length = fArr.length;
                    boolean z2 = false;
                    float f3 = 0.0f;
                    for (int i8 = i5; i8 < length; i8++) {
                        float f4 = fArr[i8];
                        if (f4 > c44.DEFAULT_ASPECT_RATIO) {
                            f3 += f4;
                        }
                    }
                    if (f3 != c44.DEFAULT_ASPECT_RATIO) {
                        int length2 = fArr.length;
                        for (int i9 = i5; i9 < length2; i9++) {
                            float f5 = fArr[i9];
                            if (f5 > c44.DEFAULT_ASPECT_RATIO) {
                                fArr[i9] = f5 / f3;
                            }
                        }
                    }
                    List list = (List) zc4.a;
                    int size2 = list.size();
                    int i10 = i5;
                    float f6 = 0.0f;
                    y7b y7b = null;
                    while (i10 < size2) {
                        y7b y7b2 = (y7b) list.get(i10);
                        float[] b2 = y7b2.b();
                        float f7 = b2[1];
                        float[] fArr2 = bdf.a;
                        if (f7 >= fArr2[i5] && f7 <= fArr2[2]) {
                            float f8 = b2[2];
                            float[] fArr3 = bdf.b;
                            if (f8 >= fArr3[i5] && f8 <= fArr3[2]) {
                                if (!sparseBooleanArray.get(y7b2.d)) {
                                    float[] b3 = y7b2.b();
                                    y7b y7b3 = (y7b) zc4.v;
                                    if (y7b3 != null) {
                                        i2 = y7b3.e;
                                        arrayList = arrayList3;
                                    } else {
                                        arrayList = arrayList3;
                                        i2 = 1;
                                    }
                                    float[] fArr4 = bdf.c;
                                    i = 0;
                                    float f9 = fArr4[0];
                                    if (f9 > c44.DEFAULT_ASPECT_RATIO) {
                                        c2 = 1;
                                        f2 = (1.0f - Math.abs(b3[1] - fArr2[1])) * f9;
                                    } else {
                                        c2 = 1;
                                        f2 = c44.DEFAULT_ASPECT_RATIO;
                                    }
                                    float f10 = fArr4[c2];
                                    float abs = f10 > c44.DEFAULT_ASPECT_RATIO ? (1.0f - Math.abs(b3[2] - fArr3[c2])) * f10 : c44.DEFAULT_ASPECT_RATIO;
                                    float f11 = fArr4[2];
                                    z = false;
                                    float f12 = f2 + abs + (f11 > c44.DEFAULT_ASPECT_RATIO ? f11 * (((float) y7b2.e) / ((float) i2)) : 0.0f);
                                    if (y7b == null || f12 > f6) {
                                        f6 = f12;
                                        y7b = y7b2;
                                    }
                                } else {
                                    arrayList = arrayList3;
                                    i = i5;
                                    z = false;
                                }
                                i10++;
                                z2 = z;
                                i5 = i;
                                arrayList3 = arrayList;
                            }
                        }
                        arrayList = arrayList3;
                        i = i5;
                        z = z2;
                        i10++;
                        z2 = z;
                        i5 = i;
                        arrayList3 = arrayList;
                    }
                    ArrayList arrayList4 = arrayList3;
                    int i11 = i5;
                    if (y7b != null) {
                        sparseBooleanArray.append(y7b.d, true);
                    }
                    ((ts) zc4.c).put(bdf, y7b);
                    i7++;
                    i5 = i11;
                    arrayList3 = arrayList4;
                } else {
                    sparseBooleanArray.clear();
                    return zc4;
                }
            }
        } else {
            throw new AssertionError();
        }
    }
}
