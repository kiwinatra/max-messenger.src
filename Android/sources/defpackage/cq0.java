package defpackage;

import android.content.Context;
import android.graphics.Bitmap;
import java.util.Arrays;
import java.util.Locale;
import kotlin.jvm.internal.StringCompanionObject;

/* renamed from: cq0  reason: default package */
public final class cq0 extends hk0 {
    public final Context c;
    public final int d = 3;
    public final uae e;

    public cq0(Context context) {
        this.c = context;
        StringCompanionObject stringCompanionObject = StringCompanionObject.INSTANCE;
        this.e = new uae(String.format((Locale) null, "IntrinsicBlur;%d", Arrays.copyOf(new Object[]{24}, 1)));
    }

    public final qx0 b() {
        return this.e;
    }

    public final void c(Bitmap bitmap) {
        if (bitmap.isMutable()) {
            boolean z = true;
            if (((float) bitmap.getHeight()) <= 2048.0f) {
                if (((float) bitmap.getWidth()) <= 2048.0f) {
                    int i = this.d;
                    if (i <= 0) {
                        z = false;
                    }
                    if (z) {
                        try {
                            q8.h(bitmap, i);
                        } catch (OutOfMemoryError e2) {
                            StringCompanionObject stringCompanionObject = StringCompanionObject.INSTANCE;
                            String.format((Locale) null, "OOM: %d iterations on %dx%d with %d radius", Arrays.copyOf(new Object[]{Integer.valueOf(i), Integer.valueOf(bitmap.getWidth()), Integer.valueOf(bitmap.getHeight()), 24}, 4));
                            bg5.c("IterativeBoxBlurFilter");
                            throw e2;
                        }
                    } else {
                        throw new IllegalArgumentException();
                    }
                } else {
                    throw new IllegalArgumentException();
                }
            } else {
                throw new IllegalArgumentException();
            }
        } else {
            throw new IllegalArgumentException();
        }
    }

    /* JADX WARNING: Removed duplicated region for block: B:25:0x005f  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void d(android.graphics.Bitmap r4, android.graphics.Bitmap r5) {
        /*
            r3 = this;
            android.content.Context r3 = r3.c
            r0 = 0
            android.renderscript.RenderScript r3 = android.renderscript.RenderScript.create(r3)     // Catch:{ all -> 0x005c }
            java.lang.String r1 = "Required value was null."
            if (r3 == 0) goto L_0x0052
            android.renderscript.Element r0 = android.renderscript.Element.U8_4(r3)     // Catch:{ all -> 0x003b }
            android.renderscript.ScriptIntrinsicBlur r0 = android.renderscript.ScriptIntrinsicBlur.create(r3, r0)     // Catch:{ all -> 0x003b }
            android.renderscript.Allocation r5 = android.renderscript.Allocation.createFromBitmap(r3, r5)     // Catch:{ all -> 0x003b }
            if (r5 == 0) goto L_0x0048
            android.renderscript.Allocation r2 = android.renderscript.Allocation.createFromBitmap(r3, r4)     // Catch:{ all -> 0x003b }
            if (r2 == 0) goto L_0x003e
            r1 = 24
            float r1 = (float) r1     // Catch:{ all -> 0x003b }
            r0.setRadius(r1)     // Catch:{ all -> 0x003b }
            r0.setInput(r5)     // Catch:{ all -> 0x003b }
            r0.forEach(r2)     // Catch:{ all -> 0x003b }
            r2.copyTo(r4)     // Catch:{ all -> 0x003b }
            r0.destroy()     // Catch:{ all -> 0x003b }
            r5.destroy()     // Catch:{ all -> 0x003b }
            r2.destroy()     // Catch:{ all -> 0x003b }
            r3.destroy()
            return
        L_0x003b:
            r4 = move-exception
            r0 = r3
            goto L_0x005d
        L_0x003e:
            java.lang.IllegalStateException r4 = new java.lang.IllegalStateException     // Catch:{ all -> 0x003b }
            java.lang.String r5 = r1.toString()     // Catch:{ all -> 0x003b }
            r4.<init>(r5)     // Catch:{ all -> 0x003b }
            throw r4     // Catch:{ all -> 0x003b }
        L_0x0048:
            java.lang.IllegalStateException r4 = new java.lang.IllegalStateException     // Catch:{ all -> 0x003b }
            java.lang.String r5 = r1.toString()     // Catch:{ all -> 0x003b }
            r4.<init>(r5)     // Catch:{ all -> 0x003b }
            throw r4     // Catch:{ all -> 0x003b }
        L_0x0052:
            java.lang.IllegalStateException r3 = new java.lang.IllegalStateException     // Catch:{ all -> 0x005c }
            java.lang.String r4 = r1.toString()     // Catch:{ all -> 0x005c }
            r3.<init>(r4)     // Catch:{ all -> 0x005c }
            throw r3     // Catch:{ all -> 0x005c }
        L_0x005c:
            r4 = move-exception
        L_0x005d:
            if (r0 == 0) goto L_0x0062
            r0.destroy()
        L_0x0062:
            throw r4
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.cq0.d(android.graphics.Bitmap, android.graphics.Bitmap):void");
    }
}
