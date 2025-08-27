package defpackage;

import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.util.Base64;
import kotlin.Lazy;
import kotlin.Result;
import kotlin.ResultKt;

/* renamed from: no0  reason: default package */
public final class no0 {
    public final g43 a;
    public final Lazy b;
    public final Lazy c;

    public no0(g43 g43, Lazy lazy, Lazy lazy2) {
        this.a = g43;
        this.b = lazy;
        this.c = lazy2;
    }

    public static Bitmap a(byte[] bArr) {
        Object obj;
        Bitmap bitmap = null;
        if (bArr == null || bArr.length == 0) {
            return null;
        }
        try {
            Result.Companion companion = Result.Companion;
            byte[] decode = Base64.decode(bArr, 0);
            if (decode != null) {
                if (decode.length != 0) {
                    Bitmap decodeByteArray = BitmapFactory.decodeByteArray(decode, 0, decode.length);
                    if (decodeByteArray == null) {
                        return null;
                    }
                    obj = Result.m23constructorimpl(decodeByteArray);
                    if (!Result.m29isFailureimpl(obj)) {
                        bitmap = obj;
                    }
                    return bitmap;
                }
            }
            return null;
        } catch (Throwable th) {
            Result.Companion companion2 = Result.Companion;
            obj = Result.m23constructorimpl(ResultKt.createFailure(th));
        }
    }

    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r9v2, resolved type: byte[]} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r9v5, resolved type: java.lang.Object} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r9v8, resolved type: java.lang.Object} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r9v11, resolved type: byte[]} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r9v12, resolved type: byte[]} */
    /* JADX WARNING: Code restructure failed: missing block: B:33:0x0081, code lost:
        r10 = move-exception;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:34:0x0082, code lost:
        kotlin.io.CloseableKt.closeFinally(r2, r9);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:35:0x0085, code lost:
        throw r10;
     */
    /* JADX WARNING: Multi-variable type inference failed */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static byte[] c(android.graphics.Bitmap r9, byte[] r10) {
        /*
            java.lang.String r0 = "try to encode bitmap by size "
            boolean r1 = r9.isRecycled()
            if (r1 == 0) goto L_0x0009
            return r10
        L_0x0009:
            int r1 = defpackage.vo0.d(r9)
            if (r1 != 0) goto L_0x0010
            return r10
        L_0x0010:
            java.io.ByteArrayOutputStream r2 = new java.io.ByteArrayOutputStream
            r2.<init>(r1)
            java.lang.Class<no0> r1 = defpackage.no0.class
            java.lang.String r1 = r1.getName()     // Catch:{ all -> 0x0049 }
            a67 r3 = defpackage.z68.b     // Catch:{ all -> 0x0049 }
            r4 = 0
            if (r3 != 0) goto L_0x0021
            goto L_0x004b
        L_0x0021:
            boolean r5 = r3.c()     // Catch:{ all -> 0x0049 }
            if (r5 == 0) goto L_0x004b
            w78 r5 = defpackage.w78.o     // Catch:{ all -> 0x0049 }
            int r6 = r9.getWidth()     // Catch:{ all -> 0x0049 }
            int r7 = r9.getHeight()     // Catch:{ all -> 0x0049 }
            java.lang.StringBuilder r8 = new java.lang.StringBuilder     // Catch:{ all -> 0x0049 }
            r8.<init>(r0)     // Catch:{ all -> 0x0049 }
            r8.append(r6)     // Catch:{ all -> 0x0049 }
            java.lang.String r0 = "x"
            r8.append(r0)     // Catch:{ all -> 0x0049 }
            r8.append(r7)     // Catch:{ all -> 0x0049 }
            java.lang.String r0 = r8.toString()     // Catch:{ all -> 0x0049 }
            r3.d(r5, r1, r0, r4)     // Catch:{ all -> 0x0049 }
            goto L_0x004b
        L_0x0049:
            r9 = move-exception
            goto L_0x0080
        L_0x004b:
            kotlin.Result$Companion r0 = kotlin.Result.Companion     // Catch:{ all -> 0x0067 }
            android.graphics.Bitmap$CompressFormat r0 = android.graphics.Bitmap.CompressFormat.PNG     // Catch:{ all -> 0x0067 }
            r1 = 100
            r9.compress(r0, r1, r2)     // Catch:{ all -> 0x0067 }
            byte[] r9 = r2.toByteArray()     // Catch:{ all -> 0x0067 }
            int r0 = r9.length     // Catch:{ all -> 0x0067 }
            if (r0 != 0) goto L_0x005d
            r9 = r10
            goto L_0x0062
        L_0x005d:
            r0 = 0
            byte[] r9 = android.util.Base64.encode(r9, r0)     // Catch:{ all -> 0x0067 }
        L_0x0062:
            java.lang.Object r9 = kotlin.Result.m23constructorimpl(r9)     // Catch:{ all -> 0x0067 }
            goto L_0x0072
        L_0x0067:
            r9 = move-exception
            kotlin.Result$Companion r0 = kotlin.Result.Companion     // Catch:{ all -> 0x0049 }
            java.lang.Object r9 = kotlin.ResultKt.createFailure(r9)     // Catch:{ all -> 0x0049 }
            java.lang.Object r9 = kotlin.Result.m23constructorimpl(r9)     // Catch:{ all -> 0x0049 }
        L_0x0072:
            boolean r0 = kotlin.Result.m29isFailureimpl(r9)     // Catch:{ all -> 0x0049 }
            if (r0 == 0) goto L_0x0079
            goto L_0x007a
        L_0x0079:
            r10 = r9
        L_0x007a:
            byte[] r10 = (byte[]) r10     // Catch:{ all -> 0x0049 }
            kotlin.io.CloseableKt.closeFinally(r2, r4)
            return r10
        L_0x0080:
            throw r9     // Catch:{ all -> 0x0081 }
        L_0x0081:
            r10 = move-exception
            kotlin.io.CloseableKt.closeFinally(r2, r9)
            throw r10
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.no0.c(android.graphics.Bitmap, byte[]):byte[]");
    }

    /* JADX WARNING: Removed duplicated region for block: B:13:0x0035  */
    /* JADX WARNING: Removed duplicated region for block: B:18:0x0058 A[SYNTHETIC, Splitter:B:18:0x0058] */
    /* JADX WARNING: Removed duplicated region for block: B:34:? A[ORIG_RETURN, RETURN, SYNTHETIC] */
    /* JADX WARNING: Removed duplicated region for block: B:9:0x0025  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final java.lang.Object b(defpackage.qa7 r8, kotlin.coroutines.Continuation r9) {
        /*
            r7 = this;
            boolean r0 = r9 instanceof defpackage.mo0
            if (r0 == 0) goto L_0x0014
            r0 = r9
            mo0 r0 = (defpackage.mo0) r0
            int r1 = r0.o
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L_0x0014
            int r1 = r1 - r2
            r0.o = r1
        L_0x0012:
            r6 = r0
            goto L_0x001a
        L_0x0014:
            mo0 r0 = new mo0
            r0.<init>(r7, r9)
            goto L_0x0012
        L_0x001a:
            java.lang.Object r9 = r6.b
            java.lang.Object r0 = kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED()
            int r1 = r6.o
            r2 = 1
            if (r1 == 0) goto L_0x0035
            if (r1 != r2) goto L_0x002d
            no0 r7 = r6.a
            kotlin.ResultKt.throwOnFailure(r9)
            goto L_0x0053
        L_0x002d:
            java.lang.IllegalStateException r7 = new java.lang.IllegalStateException
            java.lang.String r8 = "call to 'resume' before 'invoke' with coroutine"
            r7.<init>(r8)
            throw r7
        L_0x0035:
            kotlin.ResultKt.throwOnFailure(r9)
            kotlin.Lazy r9 = r7.b
            java.lang.Object r9 = r9.getValue()
            r1 = r9
            ba7 r1 = (defpackage.ba7) r1
            r6.a = r7
            r6.o = r2
            r3 = 9223372036854775807(0x7fffffffffffffff, double:NaN)
            r5 = 0
            r2 = r8
            java.lang.Object r9 = defpackage.ld9.g(r1, r2, r3, r5, r6)
            if (r9 != r0) goto L_0x0053
            return r0
        L_0x0053:
            y33 r9 = (defpackage.y33) r9
            r8 = 0
            if (r9 == 0) goto L_0x0087
            java.lang.Object r0 = r9.e0()     // Catch:{ all -> 0x0063 }
            boolean r1 = r0 instanceof com.facebook.imagepipeline.image.CloseableStaticBitmap     // Catch:{ all -> 0x0063 }
            if (r1 == 0) goto L_0x0065
            com.facebook.imagepipeline.image.CloseableStaticBitmap r0 = (com.facebook.imagepipeline.image.CloseableStaticBitmap) r0     // Catch:{ all -> 0x0063 }
            goto L_0x0066
        L_0x0063:
            r7 = move-exception
            goto L_0x0081
        L_0x0065:
            r0 = r8
        L_0x0066:
            if (r0 == 0) goto L_0x007b
            android.graphics.Bitmap r0 = r0.getUnderlyingBitmap()     // Catch:{ all -> 0x0063 }
            g43 r7 = r7.a     // Catch:{ all -> 0x0063 }
            kotlin.Lazy r7 = r7.a     // Catch:{ all -> 0x0063 }
            java.lang.Object r7 = r7.getValue()     // Catch:{ all -> 0x0063 }
            byte[] r7 = (byte[]) r7     // Catch:{ all -> 0x0063 }
            byte[] r7 = c(r0, r7)     // Catch:{ all -> 0x0063 }
            goto L_0x007c
        L_0x007b:
            r7 = r8
        L_0x007c:
            kotlin.io.CloseableKt.closeFinally(r9, r8)
            r8 = r7
            goto L_0x0087
        L_0x0081:
            throw r7     // Catch:{ all -> 0x0082 }
        L_0x0082:
            r8 = move-exception
            kotlin.io.CloseableKt.closeFinally(r9, r7)
            throw r8
        L_0x0087:
            return r8
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.no0.b(qa7, kotlin.coroutines.Continuation):java.lang.Object");
    }
}
