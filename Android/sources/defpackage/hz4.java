package defpackage;

import android.graphics.Color;
import kotlin.KotlinVersion;
import kotlin.uuid.Uuid;

/* renamed from: hz4  reason: default package */
public abstract class hz4 {
    public static final int a = Color.argb(230, KotlinVersion.MAX_COMPONENT_VALUE, KotlinVersion.MAX_COMPONENT_VALUE, KotlinVersion.MAX_COMPONENT_VALUE);
    public static final int b = Color.argb(Uuid.SIZE_BITS, 27, 27, 27);

    /* JADX WARNING: type inference failed for: r7v0, types: [jz4] */
    /* JADX WARNING: Multi-variable type inference failed */
    /* JADX WARNING: Unknown variable types count: 1 */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static void a(defpackage.bc3 r9) {
        /*
            a7f r1 = new a7f
            r0 = 0
            m61 r2 = defpackage.m61.Y
            r1.<init>(r0, r0, r2)
            a7f r3 = new a7f
            int r0 = a
            int r4 = b
            r3.<init>(r0, r4, r2)
            android.view.Window r0 = r9.getWindow()
            android.view.View r4 = r0.getDecorView()
            android.content.res.Resources r0 = r4.getResources()
            java.lang.Object r0 = r2.invoke(r0)
            java.lang.Boolean r0 = (java.lang.Boolean) r0
            boolean r5 = r0.booleanValue()
            android.content.res.Resources r0 = r4.getResources()
            java.lang.Object r0 = r2.invoke(r0)
            java.lang.Boolean r0 = (java.lang.Boolean) r0
            boolean r6 = r0.booleanValue()
            int r0 = android.os.Build.VERSION.SDK_INT
            r2 = 30
            if (r0 < r2) goto L_0x0042
            lz4 r0 = new lz4
            r0.<init>()
        L_0x0040:
            r7 = r0
            goto L_0x0048
        L_0x0042:
            kz4 r0 = new kz4
            r0.<init>()
            goto L_0x0040
        L_0x0048:
            android.view.Window r8 = r9.getWindow()
            r0 = r7
            r2 = r3
            r3 = r8
            r0.a(r1, r2, r3, r4, r5, r6)
            android.view.Window r9 = r9.getWindow()
            r7.b(r9)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.hz4.a(bc3):void");
    }
}
