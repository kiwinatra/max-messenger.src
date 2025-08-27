package defpackage;

import android.content.SharedPreferences;
import java.util.HashMap;
import java.util.Set;

/* renamed from: cn5  reason: default package */
public final class cn5 implements SharedPreferences.Editor {
    public final HashMap a = new HashMap();
    public final Object b = new Object();
    public boolean c;
    public final /* synthetic */ dn5 d;

    public cn5(dn5 dn5) {
        this.d = dn5;
    }

    public final void apply() {
        wie wie = this.d.b;
        if (wie != null) {
            wie.g0("apply");
        }
        commit();
    }

    public final SharedPreferences.Editor clear() {
        synchronized (this.b) {
            this.c = true;
        }
        return this;
    }

    /* JADX WARNING: Removed duplicated region for block: B:68:0x0120 A[Catch:{ all -> 0x00bc }] */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final boolean commit() {
        /*
            r20 = this;
            r0 = r20
            dn5 r2 = r0.d
            wie r2 = r2.b
            if (r2 == 0) goto L_0x000d
            java.lang.String r3 = "commit"
            r2.g0(r3)
        L_0x000d:
            dn5 r2 = r0.d
            java.lang.Object r3 = r2.g
            monitor-enter(r3)
            qz9 r4 = new qz9     // Catch:{ all -> 0x0157 }
            qz9 r5 = r2.d     // Catch:{ all -> 0x0157 }
            int r5 = r5.e     // Catch:{ all -> 0x0157 }
            r4.<init>(r5)     // Catch:{ all -> 0x0157 }
            qz9 r5 = r2.d     // Catch:{ all -> 0x0157 }
            java.lang.Object[] r6 = r5.b     // Catch:{ all -> 0x0157 }
            java.lang.Object[] r7 = r5.c     // Catch:{ all -> 0x0157 }
            long[] r5 = r5.a     // Catch:{ all -> 0x0157 }
            int r8 = r5.length     // Catch:{ all -> 0x0157 }
            int r8 = r8 + -2
            if (r8 < 0) goto L_0x0067
            r10 = 0
        L_0x0029:
            r11 = r5[r10]     // Catch:{ all -> 0x0157 }
            long r13 = ~r11     // Catch:{ all -> 0x0157 }
            r15 = 7
            long r13 = r13 << r15
            long r13 = r13 & r11
            r15 = -9187201950435737472(0x8080808080808080, double:-2.937446524422997E-306)
            long r13 = r13 & r15
            int r13 = (r13 > r15 ? 1 : (r13 == r15 ? 0 : -1))
            if (r13 == 0) goto L_0x0062
            int r13 = r10 - r8
            int r13 = ~r13     // Catch:{ all -> 0x0157 }
            int r13 = r13 >>> 31
            r14 = 8
            int r13 = 8 - r13
            r15 = 0
        L_0x0043:
            if (r15 >= r13) goto L_0x005e
            r16 = 255(0xff, double:1.26E-321)
            long r16 = r11 & r16
            r18 = 128(0x80, double:6.32E-322)
            int r16 = (r16 > r18 ? 1 : (r16 == r18 ? 0 : -1))
            if (r16 >= 0) goto L_0x005a
            int r16 = r10 << 3
            int r16 = r16 + r15
            r9 = r6[r16]     // Catch:{ all -> 0x0157 }
            r1 = r7[r16]     // Catch:{ all -> 0x0157 }
            r4.k(r9, r1)     // Catch:{ all -> 0x0157 }
        L_0x005a:
            long r11 = r11 >> r14
            r1 = 1
            int r15 = r15 + r1
            goto L_0x0043
        L_0x005e:
            r1 = 1
            if (r13 != r14) goto L_0x0067
            goto L_0x0063
        L_0x0062:
            r1 = 1
        L_0x0063:
            if (r10 == r8) goto L_0x0067
            int r10 = r10 + r1
            goto L_0x0029
        L_0x0067:
            rz9 r1 = new rz9     // Catch:{ all -> 0x0157 }
            kotlin.Lazy r5 = r2.f     // Catch:{ all -> 0x0157 }
            java.lang.Object r5 = r5.getValue()     // Catch:{ all -> 0x0157 }
            java.util.WeakHashMap r5 = (java.util.WeakHashMap) r5     // Catch:{ all -> 0x0157 }
            java.util.Set r5 = r5.keySet()     // Catch:{ all -> 0x0157 }
            int r5 = r5.size()     // Catch:{ all -> 0x0157 }
            r1.<init>(r5)     // Catch:{ all -> 0x0157 }
            kotlin.Lazy r5 = r2.f     // Catch:{ all -> 0x0157 }
            java.lang.Object r5 = r5.getValue()     // Catch:{ all -> 0x0157 }
            java.util.WeakHashMap r5 = (java.util.WeakHashMap) r5     // Catch:{ all -> 0x0157 }
            java.util.Set r5 = r5.keySet()     // Catch:{ all -> 0x0157 }
            java.util.Iterator r5 = r5.iterator()     // Catch:{ all -> 0x0157 }
        L_0x008c:
            boolean r6 = r5.hasNext()     // Catch:{ all -> 0x0157 }
            if (r6 == 0) goto L_0x009f
            java.lang.Object r6 = r5.next()     // Catch:{ all -> 0x0157 }
            int r7 = r1.c(r6)     // Catch:{ all -> 0x0157 }
            java.lang.Object[] r8 = r1.b     // Catch:{ all -> 0x0157 }
            r8[r7] = r6     // Catch:{ all -> 0x0157 }
            goto L_0x008c
        L_0x009f:
            java.lang.Object r5 = r0.b     // Catch:{ all -> 0x0157 }
            monitor-enter(r5)     // Catch:{ all -> 0x0157 }
            int r6 = r1.d     // Catch:{ all -> 0x00bc }
            if (r6 == 0) goto L_0x00a8
            r6 = 1
            goto L_0x00a9
        L_0x00a8:
            r6 = 0
        L_0x00a9:
            oz9 r7 = new oz9     // Catch:{ all -> 0x00bc }
            r7.<init>()     // Catch:{ all -> 0x00bc }
            boolean r8 = r0.c     // Catch:{ all -> 0x00bc }
            if (r8 == 0) goto L_0x00d4
            wie r8 = r2.b     // Catch:{ all -> 0x00bc }
            if (r8 == 0) goto L_0x00bf
            java.lang.String r9 = "commit: is cleared"
            r8.g0(r9)     // Catch:{ all -> 0x00bc }
            goto L_0x00bf
        L_0x00bc:
            r0 = move-exception
            goto L_0x0159
        L_0x00bf:
            int r8 = r4.e     // Catch:{ all -> 0x00bc }
            if (r8 == 0) goto L_0x00cb
            r4.e()     // Catch:{ all -> 0x00bc }
            r8 = 1
            r9 = 0
            r17 = 1
            goto L_0x00cf
        L_0x00cb:
            r8 = 0
            r9 = 0
            r17 = 0
        L_0x00cf:
            r0.c = r9     // Catch:{ all -> 0x00bc }
            r9 = r17
            goto L_0x00d6
        L_0x00d4:
            r9 = 0
            r8 = r9
        L_0x00d6:
            java.util.HashMap r10 = r0.a     // Catch:{ all -> 0x00bc }
            java.util.Set r10 = r10.entrySet()     // Catch:{ all -> 0x00bc }
            java.util.Iterator r10 = r10.iterator()     // Catch:{ all -> 0x00bc }
        L_0x00e0:
            boolean r11 = r10.hasNext()     // Catch:{ all -> 0x00bc }
            if (r11 == 0) goto L_0x0125
            java.lang.Object r11 = r10.next()     // Catch:{ all -> 0x00bc }
            java.util.Map$Entry r11 = (java.util.Map.Entry) r11     // Catch:{ all -> 0x00bc }
            java.lang.Object r12 = r11.getKey()     // Catch:{ all -> 0x00bc }
            java.lang.String r12 = (java.lang.String) r12     // Catch:{ all -> 0x00bc }
            java.lang.Object r11 = r11.getValue()     // Catch:{ all -> 0x00bc }
            if (r12 == 0) goto L_0x00e0
            if (r11 == r0) goto L_0x0114
            if (r11 != 0) goto L_0x00fd
            goto L_0x0114
        L_0x00fd:
            boolean r13 = r4.a(r12)     // Catch:{ all -> 0x00bc }
            if (r13 == 0) goto L_0x0110
            java.lang.Object r13 = r4.c(r12)     // Catch:{ all -> 0x00bc }
            if (r13 == 0) goto L_0x0110
            boolean r13 = kotlin.jvm.internal.Intrinsics.areEqual((java.lang.Object) r13, (java.lang.Object) r11)     // Catch:{ all -> 0x00bc }
            if (r13 == 0) goto L_0x0110
            goto L_0x00e0
        L_0x0110:
            r4.k(r12, r11)     // Catch:{ all -> 0x00bc }
            goto L_0x011e
        L_0x0114:
            boolean r11 = r4.a(r12)     // Catch:{ all -> 0x00bc }
            if (r11 != 0) goto L_0x011b
            goto L_0x00e0
        L_0x011b:
            r4.i(r12)     // Catch:{ all -> 0x00bc }
        L_0x011e:
            if (r6 == 0) goto L_0x0123
            r7.c(r12)     // Catch:{ all -> 0x00bc }
        L_0x0123:
            r8 = 1
            goto L_0x00e0
        L_0x0125:
            java.util.HashMap r0 = r0.a     // Catch:{ all -> 0x00bc }
            r0.clear()     // Catch:{ all -> 0x00bc }
            if (r8 == 0) goto L_0x0148
            wie r0 = r2.b     // Catch:{ all -> 0x00bc }
            if (r0 == 0) goto L_0x0135
            java.lang.String r6 = "commit: has changes"
            r0.g0(r6)     // Catch:{ all -> 0x00bc }
        L_0x0135:
            r2.d = r4     // Catch:{ all -> 0x00bc }
            kotlin.Lazy r0 = r2.e     // Catch:{ all -> 0x00bc }
            java.lang.Object r0 = r0.getValue()     // Catch:{ all -> 0x00bc }
            hn5 r0 = (defpackage.hn5) r0     // Catch:{ all -> 0x00bc }
            r0.a(r4)     // Catch:{ all -> 0x00bc }
            r2.a(r1, r9, r7)     // Catch:{ all -> 0x00bc }
            kotlin.Unit r0 = kotlin.Unit.INSTANCE     // Catch:{ all -> 0x00bc }
            goto L_0x0153
        L_0x0148:
            wie r0 = r2.b     // Catch:{ all -> 0x00bc }
            if (r0 == 0) goto L_0x0153
            java.lang.String r1 = "commit: no changes"
            r0.g0(r1)     // Catch:{ all -> 0x00bc }
            kotlin.Unit r0 = kotlin.Unit.INSTANCE     // Catch:{ all -> 0x00bc }
        L_0x0153:
            monitor-exit(r5)     // Catch:{ all -> 0x0157 }
            monitor-exit(r3)
            r0 = 1
            return r0
        L_0x0157:
            r0 = move-exception
            goto L_0x015b
        L_0x0159:
            monitor-exit(r5)     // Catch:{ all -> 0x0157 }
            throw r0     // Catch:{ all -> 0x0157 }
        L_0x015b:
            monitor-exit(r3)
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.cn5.commit():boolean");
    }

    public final SharedPreferences.Editor putBoolean(String str, boolean z) {
        synchronized (this.b) {
            this.a.put(str, Boolean.valueOf(z));
        }
        return this;
    }

    public final SharedPreferences.Editor putFloat(String str, float f) {
        synchronized (this.b) {
            this.a.put(str, Float.valueOf(f));
        }
        return this;
    }

    public final SharedPreferences.Editor putInt(String str, int i) {
        synchronized (this.b) {
            this.a.put(str, Integer.valueOf(i));
        }
        return this;
    }

    public final SharedPreferences.Editor putLong(String str, long j) {
        synchronized (this.b) {
            this.a.put(str, Long.valueOf(j));
        }
        return this;
    }

    public final SharedPreferences.Editor putString(String str, String str2) {
        synchronized (this.b) {
            this.a.put(str, str2);
        }
        return this;
    }

    public final SharedPreferences.Editor putStringSet(String str, Set set) {
        synchronized (this.b) {
            this.a.put(str, set);
        }
        return this;
    }

    public final SharedPreferences.Editor remove(String str) {
        synchronized (this.b) {
            this.a.put(str, this);
        }
        return this;
    }
}
