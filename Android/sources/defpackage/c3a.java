package defpackage;

import android.view.View;

/* renamed from: c3a  reason: default package */
public final /* synthetic */ class c3a implements Runnable {
    public final /* synthetic */ int a;
    public final /* synthetic */ boolean b;
    public final /* synthetic */ View c;

    public /* synthetic */ c3a(int i, View view, boolean z) {
        this.a = i;
        this.b = z;
        this.c = view;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:15:0x003d, code lost:
        r4 = null;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void run() {
        /*
            r4 = this;
            r0 = 8
            android.view.View r1 = r4.c
            boolean r2 = r4.b
            int r4 = r4.a
            switch(r4) {
                case 0: goto L_0x005d;
                case 1: goto L_0x0057;
                default: goto L_0x000b;
            }
        L_0x000b:
            if (r2 == 0) goto L_0x0046
            java.util.WeakHashMap r4 = defpackage.gag.a
            int r4 = android.os.Build.VERSION.SDK_INT
            r2 = 30
            if (r4 < r2) goto L_0x001a
            log r4 = defpackage.cag.c(r1)
            goto L_0x003e
        L_0x001a:
            android.content.Context r4 = r1.getContext()
        L_0x001e:
            boolean r2 = r4 instanceof android.content.ContextWrapper
            r3 = 0
            if (r2 == 0) goto L_0x003d
            boolean r2 = r4 instanceof android.app.Activity
            if (r2 == 0) goto L_0x0036
            android.app.Activity r4 = (android.app.Activity) r4
            android.view.Window r4 = r4.getWindow()
            if (r4 == 0) goto L_0x003d
            log r2 = new log
            r2.<init>(r4, r1)
            r4 = r2
            goto L_0x003e
        L_0x0036:
            android.content.ContextWrapper r4 = (android.content.ContextWrapper) r4
            android.content.Context r4 = r4.getBaseContext()
            goto L_0x001e
        L_0x003d:
            r4 = r3
        L_0x003e:
            if (r4 == 0) goto L_0x0046
            ld8 r4 = r4.a
            r4.z0(r0)
            goto L_0x0056
        L_0x0046:
            android.content.Context r4 = r1.getContext()
            java.lang.Class<android.view.inputmethod.InputMethodManager> r0 = android.view.inputmethod.InputMethodManager.class
            java.lang.Object r4 = defpackage.fw3.b(r4, r0)
            android.view.inputmethod.InputMethodManager r4 = (android.view.inputmethod.InputMethodManager) r4
            r0 = 1
            r4.showSoftInput(r1, r0)
        L_0x0056:
            return
        L_0x0057:
            if (r2 != 0) goto L_0x005c
            r1.setVisibility(r0)
        L_0x005c:
            return
        L_0x005d:
            if (r2 == 0) goto L_0x0063
            r4 = 0
            r1.setVisibility(r4)
        L_0x0063:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.c3a.run():void");
    }

    public /* synthetic */ c3a(View view) {
        this.a = 2;
        this.c = view;
        this.b = false;
    }
}
