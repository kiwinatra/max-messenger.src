package defpackage;

import android.content.Context;
import android.graphics.Bitmap;
import java.lang.reflect.Array;
import java.util.concurrent.atomic.AtomicInteger;
import kotlin.KotlinVersion;
import kotlin.Lazy;
import kotlin.LazyKt;

/* renamed from: u87  reason: default package */
public final class u87 {
    public static final AtomicInteger b = new AtomicInteger();
    public static volatile boolean c = false;
    public final Lazy a;

    public u87(Context context) {
        this.a = LazyKt.lazy(new p35(context, 7));
    }

    public static Bitmap c(Bitmap bitmap, int i) {
        int i2;
        int i3 = i;
        if (i3 < 1) {
            return null;
        }
        int width = bitmap.getWidth();
        int height = bitmap.getHeight();
        int i4 = width * height;
        int[] iArr = new int[i4];
        bitmap.getPixels(iArr, 0, width, 0, 0, width, height);
        int i5 = width - 1;
        int i6 = height - 1;
        int i7 = i3 + i3;
        int i8 = i7 + 1;
        int[] iArr2 = new int[i4];
        int[] iArr3 = new int[i4];
        int[] iArr4 = new int[i4];
        int[] iArr5 = new int[Math.max(width, height)];
        int i9 = (i7 + 2) >> 1;
        int i10 = i9 * i9;
        int i11 = i10 * 256;
        int[] iArr6 = new int[i11];
        for (int i12 = 0; i12 < i11; i12++) {
            iArr6[i12] = i12 / i10;
        }
        int[] iArr7 = new int[2];
        iArr7[1] = 3;
        iArr7[0] = i8;
        int[][] iArr8 = (int[][]) Array.newInstance(Integer.TYPE, iArr7);
        int i13 = i3 + 1;
        int i14 = 0;
        int i15 = 0;
        int i16 = 0;
        while (i14 < height) {
            int i17 = height;
            int i18 = -i3;
            int i19 = 0;
            int i20 = 0;
            int i21 = 0;
            int i22 = 0;
            int i23 = 0;
            int i24 = 0;
            int i25 = 0;
            int i26 = 0;
            int i27 = 0;
            while (i18 <= i3) {
                int i28 = i6;
                int[] iArr9 = iArr5;
                int i29 = iArr[Math.min(i5, Math.max(i18, 0)) + i15];
                int[] iArr10 = iArr8[i18 + i3];
                iArr10[0] = (i29 & 16711680) >> 16;
                iArr10[1] = (i29 & 65280) >> 8;
                iArr10[2] = i29 & KotlinVersion.MAX_COMPONENT_VALUE;
                int abs = i13 - Math.abs(i18);
                int i30 = iArr10[0];
                int i31 = (i30 * abs) + i19;
                i19 = i31 >= i11 ? i11 : i31;
                int i32 = iArr10[1];
                int i33 = i13;
                int i34 = (i32 * abs) + i20;
                i20 = i34 >= i11 ? i11 : i34;
                int i35 = iArr10[2];
                int i36 = (abs * i35) + i21;
                i21 = i36 >= i11 ? i11 : i36;
                if (i18 > 0) {
                    i25 += i30;
                    i26 += i32;
                    i27 += i35;
                } else {
                    i22 += i30;
                    i23 += i32;
                    i24 += i35;
                }
                i18++;
                i6 = i28;
                iArr5 = iArr9;
                i13 = i33;
            }
            int i37 = i6;
            int i38 = i13;
            int[] iArr11 = iArr5;
            int i39 = i3;
            int i40 = 0;
            while (i40 < width) {
                iArr2[i15] = iArr6[i19];
                iArr3[i15] = iArr6[i20];
                iArr4[i15] = iArr6[i21];
                int i41 = i19 - i22;
                int i42 = i20 - i23;
                int i43 = i21 - i24;
                int[] iArr12 = iArr8[((i39 - i3) + i8) % i8];
                int i44 = i22 - iArr12[0];
                int i45 = i23 - iArr12[1];
                int i46 = i24 - iArr12[2];
                if (i14 == 0) {
                    i2 = i11;
                    iArr11[i40] = Math.min(i40 + i3 + 1, i5);
                } else {
                    i2 = i11;
                }
                int i47 = iArr[i16 + iArr11[i40]];
                int i48 = (i47 & 16711680) >> 16;
                iArr12[0] = i48;
                int i49 = (i47 & 65280) >> 8;
                iArr12[1] = i49;
                int i50 = i47 & KotlinVersion.MAX_COMPONENT_VALUE;
                iArr12[2] = i50;
                int i51 = i25 + i48;
                int i52 = i26 + i49;
                int i53 = i27 + i50;
                i19 = i41 + i51;
                i20 = i42 + i52;
                i21 = i43 + i53;
                i39 = (i39 + 1) % i8;
                int[] iArr13 = iArr8[i39 % i8];
                int i54 = iArr13[0];
                i22 = i44 + i54;
                int i55 = iArr13[1];
                i23 = i45 + i55;
                int i56 = iArr13[2];
                i24 = i46 + i56;
                i25 = i51 - i54;
                i26 = i52 - i55;
                i27 = i53 - i56;
                i15++;
                i40++;
                i11 = i2;
            }
            int i57 = i11;
            i16 += width;
            i14++;
            height = i17;
            i6 = i37;
            iArr5 = iArr11;
            i13 = i38;
        }
        int i58 = i6;
        int i59 = i13;
        int[] iArr14 = iArr5;
        int i60 = height;
        int i61 = 0;
        while (i61 < width) {
            int i62 = -i3;
            int i63 = i62 * width;
            int i64 = 0;
            int i65 = 0;
            int i66 = 0;
            int i67 = 0;
            int i68 = 0;
            int i69 = 0;
            int i70 = 0;
            int i71 = 0;
            int i72 = 0;
            while (i62 <= i3) {
                int i73 = i8;
                int max = Math.max(0, i63) + i61;
                int[] iArr15 = iArr8[i62 + i3];
                iArr15[0] = iArr2[max];
                iArr15[1] = iArr3[max];
                iArr15[2] = iArr4[max];
                int abs2 = i59 - Math.abs(i62);
                i64 = (iArr2[max] * abs2) + i64;
                i65 = (iArr3[max] * abs2) + i65;
                i66 = (iArr4[max] * abs2) + i66;
                if (i62 > 0) {
                    i70 += iArr15[0];
                    i71 += iArr15[1];
                    i72 += iArr15[2];
                } else {
                    i67 += iArr15[0];
                    i68 += iArr15[1];
                    i69 += iArr15[2];
                }
                int i74 = i58;
                if (i62 < i74) {
                    i63 += width;
                }
                i62++;
                i58 = i74;
                i8 = i73;
            }
            int i75 = i8;
            int i76 = i58;
            int i77 = i3;
            int i78 = i60;
            int i79 = 0;
            int i80 = i61;
            while (i79 < i78) {
                iArr[i80] = (iArr[i80] & -16777216) | (iArr6[i64] << 16) | (iArr6[i65] << 8) | iArr6[i66];
                int i81 = i64 - i67;
                int i82 = i65 - i68;
                int i83 = i66 - i69;
                int[] iArr16 = iArr8[((i77 - i3) + i75) % i75];
                int i84 = i67 - iArr16[0];
                int i85 = i68 - iArr16[1];
                int i86 = i69 - iArr16[2];
                if (i61 == 0) {
                    iArr14[i79] = Math.min(i79 + i59, i76) * width;
                }
                int i87 = iArr14[i79] + i61;
                int i88 = iArr2[i87];
                iArr16[0] = i88;
                int i89 = iArr3[i87];
                iArr16[1] = i89;
                int i90 = iArr4[i87];
                iArr16[2] = i90;
                int i91 = i70 + i88;
                int i92 = i71 + i89;
                int i93 = i72 + i90;
                i64 = i81 + i91;
                i65 = i82 + i92;
                i66 = i83 + i93;
                i77 = (i77 + 1) % i75;
                int[] iArr17 = iArr8[i77];
                int i94 = iArr17[0];
                i67 = i84 + i94;
                int i95 = iArr17[1];
                i68 = i85 + i95;
                int i96 = iArr17[2];
                i69 = i86 + i96;
                i70 = i91 - i94;
                i71 = i92 - i95;
                i72 = i93 - i96;
                i80 += width;
                i79++;
                i3 = i;
            }
            i61++;
            i3 = i;
            i60 = i78;
            i58 = i76;
            i8 = i75;
        }
        bitmap.setPixels(iArr, 0, width, 0, 0, width, i60);
        return bitmap;
    }

    public final Bitmap a(Bitmap bitmap, int i) {
        if (c) {
            return c(bitmap, i);
        }
        try {
            if (b.incrementAndGet() == 2) {
                b(bitmap, i);
                return bitmap;
            }
            d(bitmap, i);
            return bitmap;
        } catch (Throwable th) {
            z68.f("u87", "blur: failed to blur image with renderscript, try with old blur", th);
            if (!(th instanceof OutOfMemoryError)) {
                return c(bitmap, i);
            }
            throw th;
        }
    }

    public final void b(Bitmap bitmap, int i) {
        long nanoTime = System.nanoTime();
        Bitmap c2 = c(bitmap, i);
        long abs = Math.abs(System.nanoTime() - nanoTime);
        z68.c("u87", "checkRsSpeedAndForceOldBlur: time for old blur %d, tempWidth=%d", Long.valueOf(abs), Integer.valueOf(c2.getWidth()));
        long nanoTime2 = System.nanoTime();
        d(bitmap, i);
        long abs2 = Math.abs(System.nanoTime() - nanoTime2);
        z68.c("u87", "checkRsSpeedAndForceOldBlur: time for rs blur %d", Long.valueOf(abs2));
        if (abs2 > abs * 3) {
            c = true;
        }
    }

    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r0v0, resolved type: android.renderscript.Allocation} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r0v1, resolved type: android.renderscript.Allocation} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r0v2, resolved type: android.renderscript.Allocation} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r0v3, resolved type: android.renderscript.Allocation} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r0v4, resolved type: android.renderscript.ScriptIntrinsicBlur} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r0v5, resolved type: android.renderscript.Allocation} */
    /* JADX WARNING: Can't wrap try/catch for region: R(13:3|4|5|6|7|8|9|10|11|12|13|14|(3:17|18|46)(1:48)) */
    /* JADX WARNING: Can't wrap try/catch for region: R(16:0|1|2|3|4|5|6|7|8|9|10|11|12|13|14|(3:17|18|46)(1:48)) */
    /* JADX WARNING: Failed to process nested try/catch */
    /* JADX WARNING: Missing exception handler attribute for start block: B:11:0x0030 */
    /* JADX WARNING: Missing exception handler attribute for start block: B:13:0x0033 */
    /* JADX WARNING: Multi-variable type inference failed */
    /* JADX WARNING: Removed duplicated region for block: B:17:0x0038 A[SYNTHETIC, Splitter:B:17:0x0038] */
    /* JADX WARNING: Removed duplicated region for block: B:30:0x004f A[SYNTHETIC, Splitter:B:30:0x004f] */
    /* JADX WARNING: Removed duplicated region for block: B:34:0x0054 A[SYNTHETIC, Splitter:B:34:0x0054] */
    /* JADX WARNING: Removed duplicated region for block: B:38:0x0059 A[SYNTHETIC, Splitter:B:38:0x0059] */
    /* JADX WARNING: Removed duplicated region for block: B:42:0x005e A[SYNTHETIC, Splitter:B:42:0x005e] */
    /* JADX WARNING: Removed duplicated region for block: B:48:? A[RETURN, SYNTHETIC] */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void d(android.graphics.Bitmap r6, int r7) {
        /*
            r5 = this;
            r0 = 0
            kotlin.Lazy r5 = r5.a     // Catch:{ all -> 0x0049 }
            java.lang.Object r5 = r5.getValue()     // Catch:{ all -> 0x0049 }
            android.renderscript.RenderScript r5 = (android.renderscript.RenderScript) r5     // Catch:{ all -> 0x0049 }
            android.renderscript.Allocation$MipmapControl r1 = android.renderscript.Allocation.MipmapControl.MIPMAP_NONE     // Catch:{ all -> 0x0049 }
            r2 = 1
            android.renderscript.Allocation r1 = android.renderscript.Allocation.createFromBitmap(r5, r6, r1, r2)     // Catch:{ all -> 0x0049 }
            android.renderscript.Type r2 = r1.getType()     // Catch:{ all -> 0x0044 }
            android.renderscript.Allocation r3 = android.renderscript.Allocation.createTyped(r5, r2)     // Catch:{ all -> 0x0040 }
            android.renderscript.Element r4 = android.renderscript.Element.U8_4(r5)     // Catch:{ all -> 0x003c }
            android.renderscript.ScriptIntrinsicBlur r0 = android.renderscript.ScriptIntrinsicBlur.create(r5, r4)     // Catch:{ all -> 0x003c }
            float r5 = (float) r7     // Catch:{ all -> 0x003c }
            r0.setRadius(r5)     // Catch:{ all -> 0x003c }
            r0.setInput(r1)     // Catch:{ all -> 0x003c }
            r0.forEach(r3)     // Catch:{ all -> 0x003c }
            r3.copyTo(r6)     // Catch:{ all -> 0x003c }
            r1.destroy()     // Catch:{ Exception -> 0x0030 }
        L_0x0030:
            r3.destroy()     // Catch:{ Exception -> 0x0033 }
        L_0x0033:
            r0.destroy()     // Catch:{ Exception -> 0x0036 }
        L_0x0036:
            if (r2 == 0) goto L_0x003b
            r2.destroy()     // Catch:{ Exception -> 0x003b }
        L_0x003b:
            return
        L_0x003c:
            r5 = move-exception
            r6 = r0
        L_0x003e:
            r0 = r1
            goto L_0x004d
        L_0x0040:
            r5 = move-exception
            r6 = r0
            r3 = r6
            goto L_0x003e
        L_0x0044:
            r5 = move-exception
            r6 = r0
            r2 = r6
            r3 = r2
            goto L_0x003e
        L_0x0049:
            r5 = move-exception
            r6 = r0
            r2 = r6
            r3 = r2
        L_0x004d:
            if (r0 == 0) goto L_0x0052
            r0.destroy()     // Catch:{ Exception -> 0x0052 }
        L_0x0052:
            if (r3 == 0) goto L_0x0057
            r3.destroy()     // Catch:{ Exception -> 0x0057 }
        L_0x0057:
            if (r6 == 0) goto L_0x005c
            r6.destroy()     // Catch:{ Exception -> 0x005c }
        L_0x005c:
            if (r2 == 0) goto L_0x0061
            r2.destroy()     // Catch:{ Exception -> 0x0061 }
        L_0x0061:
            throw r5
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.u87.d(android.graphics.Bitmap, int):void");
    }
}
