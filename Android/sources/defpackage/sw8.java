package defpackage;

import android.content.Context;
import android.os.Looper;
import android.util.Log;
import java.lang.ref.WeakReference;
import java.util.ArrayList;

/* renamed from: sw8  reason: default package */
public final class sw8 {
    public static final boolean c = Log.isLoggable("MediaRouter", 3);
    public static ow8 d;
    public final Context a;
    public final ArrayList b = new ArrayList();

    public sw8(Context context) {
        this.a = context;
    }

    public static void b() {
        if (Looper.myLooper() != Looper.getMainLooper()) {
            throw new IllegalStateException("The media router service must only be accessed on the application's main thread.");
        }
    }

    public static ow8 c() {
        ow8 ow8 = d;
        if (ow8 == null) {
            return null;
        }
        ow8.d();
        return d;
    }

    public static sw8 d(Context context) {
        if (context != null) {
            b();
            if (d == null) {
                d = new ow8(context.getApplicationContext());
            }
            ArrayList arrayList = d.f;
            int size = arrayList.size();
            while (true) {
                size--;
                if (size >= 0) {
                    sw8 sw8 = (sw8) ((WeakReference) arrayList.get(size)).get();
                    if (sw8 == null) {
                        arrayList.remove(size);
                    } else if (sw8.a == context) {
                        return sw8;
                    }
                } else {
                    sw8 sw82 = new sw8(context);
                    arrayList.add(new WeakReference(sw82));
                    return sw82;
                }
            }
        } else {
            throw new IllegalArgumentException("context must not be null");
        }
    }

    public static boolean e(kw8 kw8) {
        if (kw8 != null) {
            b();
            ow8 c2 = c();
            c2.getClass();
            if (kw8.c()) {
                return false;
            }
            if (!c2.n) {
                ArrayList arrayList = c2.g;
                int size = arrayList.size();
                int i = 0;
                while (i < size) {
                    rw8 rw8 = (rw8) arrayList.get(i);
                    if (rw8.d() || !rw8.h(kw8)) {
                        i++;
                    }
                }
                return false;
            }
            return true;
        }
        throw new IllegalArgumentException("selector must not be null");
    }

    public static void g(int i) {
        if (i < 0 || i > 3) {
            throw new IllegalArgumentException("Unsupported reason to unselect route");
        }
        b();
        ow8 c2 = c();
        rw8 c3 = c2.c();
        if (c2.f() != c3) {
            c2.h(c3, i);
        }
    }

    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r6v19, resolved type: java.lang.Object} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r2v2, resolved type: lw8} */
    /* JADX WARNING: Multi-variable type inference failed */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void a(defpackage.kw8 r7, defpackage.q8 r8, int r9) {
        /*
            r6 = this;
            java.lang.String r0 = "selector must not be null"
            if (r7 == 0) goto L_0x00e4
            if (r8 == 0) goto L_0x00dc
            b()
            boolean r1 = c
            if (r1 == 0) goto L_0x0016
            r7.toString()
            r8.toString()
            java.lang.Integer.toHexString(r9)
        L_0x0016:
            java.util.ArrayList r1 = r6.b
            int r2 = r1.size()
            r3 = 0
            r4 = r3
        L_0x001e:
            if (r4 >= r2) goto L_0x002e
            java.lang.Object r5 = r1.get(r4)
            lw8 r5 = (defpackage.lw8) r5
            q8 r5 = r5.b
            if (r5 != r8) goto L_0x002b
            goto L_0x002f
        L_0x002b:
            int r4 = r4 + 1
            goto L_0x001e
        L_0x002e:
            r4 = -1
        L_0x002f:
            if (r4 >= 0) goto L_0x003a
            lw8 r2 = new lw8
            r2.<init>(r6, r8)
            r1.add(r2)
            goto L_0x0041
        L_0x003a:
            java.lang.Object r6 = r1.get(r4)
            r2 = r6
            lw8 r2 = (defpackage.lw8) r2
        L_0x0041:
            int r6 = r2.d
            r8 = 1
            if (r9 == r6) goto L_0x0049
            r2.d = r9
            r3 = r8
        L_0x0049:
            long r4 = android.os.SystemClock.elapsedRealtime()
            r6 = r9 & 1
            if (r6 == 0) goto L_0x0052
            r3 = r8
        L_0x0052:
            r2.e = r4
            kw8 r6 = r2.c
            r6.a()
            r7.a()
            java.util.List r6 = r6.b
            java.util.List r9 = r7.b
            boolean r6 = r6.containsAll(r9)
            if (r6 != 0) goto L_0x00d1
            kw8 r6 = r2.c
            if (r6 == 0) goto L_0x00cb
            r6.a()
            java.util.List r9 = r6.b
            boolean r9 = r9.isEmpty()
            if (r9 != 0) goto L_0x007d
            java.util.ArrayList r9 = new java.util.ArrayList
            java.util.List r6 = r6.b
            r9.<init>(r6)
            goto L_0x007e
        L_0x007d:
            r9 = 0
        L_0x007e:
            java.util.ArrayList r6 = r7.b()
            boolean r7 = r6.isEmpty()
            if (r7 != 0) goto L_0x00b3
            java.util.Iterator r6 = r6.iterator()
        L_0x008c:
            boolean r7 = r6.hasNext()
            if (r7 == 0) goto L_0x00b3
            java.lang.Object r7 = r6.next()
            java.lang.String r7 = (java.lang.String) r7
            if (r7 == 0) goto L_0x00ab
            if (r9 != 0) goto L_0x00a1
            java.util.ArrayList r9 = new java.util.ArrayList
            r9.<init>()
        L_0x00a1:
            boolean r0 = r9.contains(r7)
            if (r0 != 0) goto L_0x008c
            r9.add(r7)
            goto L_0x008c
        L_0x00ab:
            java.lang.IllegalArgumentException r6 = new java.lang.IllegalArgumentException
            java.lang.String r7 = "category must not be null"
            r6.<init>(r7)
            throw r6
        L_0x00b3:
            if (r9 != 0) goto L_0x00b8
            kw8 r6 = defpackage.kw8.c
            goto L_0x00c8
        L_0x00b8:
            android.os.Bundle r6 = new android.os.Bundle
            r6.<init>()
            java.lang.String r7 = "controlCategories"
            r6.putStringArrayList(r7, r9)
            kw8 r7 = new kw8
            r7.<init>(r9, r6)
            r6 = r7
        L_0x00c8:
            r2.c = r6
            goto L_0x00d2
        L_0x00cb:
            java.lang.IllegalArgumentException r6 = new java.lang.IllegalArgumentException
            r6.<init>(r0)
            throw r6
        L_0x00d1:
            r8 = r3
        L_0x00d2:
            if (r8 == 0) goto L_0x00db
            ow8 r6 = c()
            r6.j()
        L_0x00db:
            return
        L_0x00dc:
            java.lang.IllegalArgumentException r6 = new java.lang.IllegalArgumentException
            java.lang.String r7 = "callback must not be null"
            r6.<init>(r7)
            throw r6
        L_0x00e4:
            java.lang.IllegalArgumentException r6 = new java.lang.IllegalArgumentException
            r6.<init>(r0)
            throw r6
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.sw8.a(kw8, q8, int):void");
    }

    public final void f(q8 q8Var) {
        if (q8Var != null) {
            b();
            if (c) {
                q8Var.toString();
            }
            ArrayList arrayList = this.b;
            int size = arrayList.size();
            int i = 0;
            while (true) {
                if (i >= size) {
                    i = -1;
                    break;
                } else if (((lw8) arrayList.get(i)).b == q8Var) {
                    break;
                } else {
                    i++;
                }
            }
            if (i >= 0) {
                arrayList.remove(i);
                c().j();
                return;
            }
            return;
        }
        throw new IllegalArgumentException("callback must not be null");
    }
}
