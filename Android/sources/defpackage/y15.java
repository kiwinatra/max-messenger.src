package defpackage;

import android.view.inputmethod.EditorInfo;
import android.view.inputmethod.InputConnection;
import android.widget.EditText;
import kotlin.jvm.internal.IntCompanionObject;

/* renamed from: y15  reason: default package */
public final class y15 {
    public final wsb a;
    public int b = IntCompanionObject.MAX_VALUE;
    public int c = 0;

    /* JADX WARNING: type inference failed for: r1v1, types: [wsb, java.lang.Object] */
    /* JADX WARNING: type inference failed for: r2v2, types: [android.text.Editable$Factory, z15] */
    /* JADX WARNING: Can't wrap try/catch for region: R(6:7|8|9|10|11|12) */
    /* JADX WARNING: Missing exception handler attribute for start block: B:11:0x003f */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public y15(android.widget.EditText r6, boolean r7) {
        /*
            r5 = this;
            r5.<init>()
            r0 = 2147483647(0x7fffffff, float:NaN)
            r5.b = r0
            r0 = 0
            r5.c = r0
            java.lang.String r1 = "editText cannot be null"
            defpackage.bs0.q(r6, r1)
            wsb r1 = new wsb
            r1.<init>()
            r1.a = r6
            w35 r2 = new w35
            r2.<init>(r6, r7)
            r1.b = r2
            r6.addTextChangedListener(r2)
            z15 r7 = defpackage.z15.b
            if (r7 != 0) goto L_0x0048
            java.lang.Object r7 = defpackage.z15.a
            monitor-enter(r7)
            z15 r2 = defpackage.z15.b     // Catch:{ all -> 0x0042 }
            if (r2 != 0) goto L_0x0044
            z15 r2 = new z15     // Catch:{ all -> 0x0042 }
            r2.<init>()     // Catch:{ all -> 0x0042 }
            java.lang.String r3 = "android.text.DynamicLayout$ChangeWatcher"
            java.lang.Class<z15> r4 = defpackage.z15.class
            java.lang.ClassLoader r4 = r4.getClassLoader()     // Catch:{ all -> 0x003f }
            java.lang.Class r0 = java.lang.Class.forName(r3, r0, r4)     // Catch:{ all -> 0x003f }
            defpackage.z15.c = r0     // Catch:{ all -> 0x003f }
        L_0x003f:
            defpackage.z15.b = r2     // Catch:{ all -> 0x0042 }
            goto L_0x0044
        L_0x0042:
            r5 = move-exception
            goto L_0x0046
        L_0x0044:
            monitor-exit(r7)     // Catch:{ all -> 0x0042 }
            goto L_0x0048
        L_0x0046:
            monitor-exit(r7)     // Catch:{ all -> 0x0042 }
            throw r5
        L_0x0048:
            z15 r7 = defpackage.z15.b
            r6.setEditableFactory(r7)
            r5.a = r1
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.y15.<init>(android.widget.EditText, boolean):void");
    }

    public final f25 a(InputConnection inputConnection, EditorInfo editorInfo) {
        if (inputConnection == null) {
            return null;
        }
        wsb wsb = this.a;
        wsb.getClass();
        if (!(inputConnection instanceof f25)) {
            inputConnection = new f25((EditText) wsb.a, inputConnection, editorInfo);
        }
        return (f25) inputConnection;
    }
}
