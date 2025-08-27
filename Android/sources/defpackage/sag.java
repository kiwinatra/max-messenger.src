package defpackage;

import android.util.Log;
import android.view.View;

/* renamed from: sag  reason: default package */
public abstract class sag {
    public static final rag a = new Object();
    public static final boolean b = Log.isLoggable("shared.ViewLifecycle", 3);

    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r0v13, resolved type: gv7} */
    /* JADX WARNING: type inference failed for: r0v9, types: [gv7, java.lang.Object, android.view.View$OnAttachStateChangeListener, jv7] */
    /* JADX WARNING: Code restructure failed: missing block: B:12:0x0033, code lost:
        if (r1.a(defpackage.iu7.c) == true) goto L_0x0058;
     */
    /* JADX WARNING: Multi-variable type inference failed */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static final defpackage.jv7 a(android.view.View r3) {
        /*
            m61 r0 = defpackage.m61.z0
            kotlin.sequences.Sequence r0 = kotlin.sequences.SequencesKt.generateSequence(r3, r0)
            m61 r1 = defpackage.m61.A0
            kotlin.sequences.Sequence r0 = kotlin.sequences.SequencesKt.mapNotNull(r0, r1)
            java.lang.Object r0 = kotlin.sequences.SequencesKt.firstOrNull(r0)
            jv7 r0 = (defpackage.jv7) r0
            if (r0 != 0) goto L_0x0058
            int r0 = defpackage.ric.view_custom_attach_lifecycle_owner
            java.lang.Object r0 = r3.getTag(r0)
            boolean r1 = r0 instanceof defpackage.gv7
            if (r1 == 0) goto L_0x0021
            gv7 r0 = (defpackage.gv7) r0
            goto L_0x0022
        L_0x0021:
            r0 = 0
        L_0x0022:
            if (r0 == 0) goto L_0x0036
            lv7 r1 = r0.a
            if (r1 == 0) goto L_0x0036
            iu7 r1 = r1.d
            if (r1 == 0) goto L_0x0036
            iu7 r2 = defpackage.iu7.c
            boolean r1 = r1.a(r2)
            r2 = 1
            if (r1 != r2) goto L_0x0036
            goto L_0x0058
        L_0x0036:
            gv7 r0 = new gv7
            r0.<init>()
            lv7 r1 = new lv7
            r1.<init>(r0)
            r0.a = r1
            hu7 r2 = defpackage.hu7.ON_CREATE
            r1.e(r2)
            r3.addOnAttachStateChangeListener(r0)
            boolean r1 = r3.isAttachedToWindow()
            if (r1 == 0) goto L_0x0053
            r0.onViewAttachedToWindow(r3)
        L_0x0053:
            int r1 = defpackage.ric.view_custom_attach_lifecycle_owner
            r3.setTag(r1, r0)
        L_0x0058:
            boolean r3 = b
            if (r3 == 0) goto L_0x006c
            ju7 r3 = r0.getLifecycle()
            rag r1 = a
            r3.b(r1)
            ju7 r3 = r0.getLifecycle()
            r3.a(r1)
        L_0x006c:
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.sag.a(android.view.View):jv7");
    }

    public static final vu7 b(View view) {
        return i8b.t(a(view).getLifecycle());
    }
}
