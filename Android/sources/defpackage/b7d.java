package defpackage;

/* renamed from: b7d  reason: default package */
public final class b7d extends ty {
    public t74 c;
    public final ty o;
    public final String v;
    public final String w;

    public b7d(t74 t74, ty tyVar, String str, String str2) {
        super(tyVar.b, 6);
        this.c = t74;
        this.o = tyVar;
        this.v = str;
        this.w = str2;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:18:0x0049, code lost:
        r4 = move-exception;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:19:0x004a, code lost:
        kotlin.io.CloseableKt.closeFinally(r0, r3);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:20:0x004d, code lost:
        throw r4;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void q(defpackage.af6 r4) {
        /*
            r3 = this;
            java.lang.String r0 = "SELECT count(*) FROM sqlite_master WHERE name != 'android_metadata'"
            android.database.Cursor r0 = r4.r0(r0)
            boolean r1 = r0.moveToFirst()     // Catch:{ all -> 0x0015 }
            r2 = 0
            if (r1 == 0) goto L_0x0017
            int r1 = r0.getInt(r2)     // Catch:{ all -> 0x0015 }
            if (r1 != 0) goto L_0x0017
            r2 = 1
            goto L_0x0017
        L_0x0015:
            r3 = move-exception
            goto L_0x0048
        L_0x0017:
            r1 = 0
            kotlin.io.CloseableKt.closeFinally(r0, r1)
            ty r0 = r3.o
            r0.b(r4)
            if (r2 != 0) goto L_0x0041
            a7d r1 = r0.w(r4)
            boolean r2 = r1.b
            if (r2 == 0) goto L_0x002b
            goto L_0x0041
        L_0x002b:
            java.lang.IllegalStateException r3 = new java.lang.IllegalStateException
            java.lang.StringBuilder r4 = new java.lang.StringBuilder
            java.lang.String r0 = "Pre-packaged database has an invalid schema: "
            r4.<init>(r0)
            java.lang.String r0 = r1.a
            r4.append(r0)
            java.lang.String r4 = r4.toString()
            r3.<init>(r4)
            throw r3
        L_0x0041:
            r3.z(r4)
            r0.o()
            return
        L_0x0048:
            throw r3     // Catch:{ all -> 0x0049 }
        L_0x0049:
            r4 = move-exception
            kotlin.io.CloseableKt.closeFinally(r0, r3)
            throw r4
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.b7d.q(af6):void");
    }

    public final void r(af6 af6, int i, int i2) {
        v(af6, i, i2);
    }

    /* JADX WARNING: Code restructure failed: missing block: B:26:0x005d, code lost:
        r6 = move-exception;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:27:0x005e, code lost:
        kotlin.io.CloseableKt.closeFinally(r1, r5);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:28:0x0061, code lost:
        throw r6;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:38:0x008a, code lost:
        r6 = move-exception;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:39:0x008b, code lost:
        kotlin.io.CloseableKt.closeFinally(r0, r5);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:40:0x008e, code lost:
        throw r6;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void s(defpackage.af6 r6) {
        /*
            r5 = this;
            java.lang.String r0 = "SELECT 1 FROM sqlite_master WHERE type = 'table' AND name='room_master_table'"
            android.database.Cursor r0 = r6.r0(r0)
            boolean r1 = r0.moveToFirst()     // Catch:{ all -> 0x0015 }
            r2 = 0
            if (r1 == 0) goto L_0x0018
            int r1 = r0.getInt(r2)     // Catch:{ all -> 0x0015 }
            if (r1 == 0) goto L_0x0018
            r1 = 1
            goto L_0x0019
        L_0x0015:
            r5 = move-exception
            goto L_0x0089
        L_0x0018:
            r1 = r2
        L_0x0019:
            r3 = 0
            kotlin.io.CloseableKt.closeFinally(r0, r3)
            ty r0 = r5.o
            if (r1 == 0) goto L_0x0062
            er4 r1 = new er4
            java.lang.String r4 = "SELECT identity_hash FROM room_master_table WHERE id = 42 LIMIT 1"
            r1.<init>(r4)
            android.database.Cursor r1 = r6.p0(r1)
            boolean r4 = r1.moveToFirst()     // Catch:{ all -> 0x0037 }
            if (r4 == 0) goto L_0x0039
            java.lang.String r2 = r1.getString(r2)     // Catch:{ all -> 0x0037 }
            goto L_0x003a
        L_0x0037:
            r5 = move-exception
            goto L_0x005c
        L_0x0039:
            r2 = r3
        L_0x003a:
            kotlin.io.CloseableKt.closeFinally(r1, r3)
            java.lang.String r1 = r5.v
            boolean r4 = kotlin.jvm.internal.Intrinsics.areEqual((java.lang.Object) r1, (java.lang.Object) r2)
            if (r4 != 0) goto L_0x006d
            java.lang.String r4 = r5.w
            boolean r4 = kotlin.jvm.internal.Intrinsics.areEqual((java.lang.Object) r4, (java.lang.Object) r2)
            if (r4 == 0) goto L_0x004e
            goto L_0x006d
        L_0x004e:
            java.lang.IllegalStateException r5 = new java.lang.IllegalStateException
            java.lang.String r6 = "Room cannot verify the data integrity. Looks like you've changed schema but forgot to update the version number. You can simply fix this by increasing the version number. Expected identity hash: "
            java.lang.String r0 = ", found: "
            java.lang.String r6 = defpackage.g63.j(r6, r1, r0, r2)
            r5.<init>(r6)
            throw r5
        L_0x005c:
            throw r5     // Catch:{ all -> 0x005d }
        L_0x005d:
            r6 = move-exception
            kotlin.io.CloseableKt.closeFinally(r1, r5)
            throw r6
        L_0x0062:
            a7d r1 = r0.w(r6)
            boolean r2 = r1.b
            if (r2 == 0) goto L_0x0073
            r5.z(r6)
        L_0x006d:
            r0.s(r6)
            r5.c = r3
            return
        L_0x0073:
            java.lang.IllegalStateException r5 = new java.lang.IllegalStateException
            java.lang.StringBuilder r6 = new java.lang.StringBuilder
            java.lang.String r0 = "Pre-packaged database has an invalid schema: "
            r6.<init>(r0)
            java.lang.String r0 = r1.a
            r6.append(r0)
            java.lang.String r6 = r6.toString()
            r5.<init>(r6)
            throw r5
        L_0x0089:
            throw r5     // Catch:{ all -> 0x008a }
        L_0x008a:
            r6 = move-exception
            kotlin.io.CloseableKt.closeFinally(r0, r5)
            throw r6
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.b7d.s(af6):void");
    }

    /* JADX WARNING: Code restructure failed: missing block: B:30:0x0071, code lost:
        r9.add(r11.get(r14));
        r10 = r14.intValue();
        r6 = true;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:33:0x0082, code lost:
        r4 = r9;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:56:0x007f, code lost:
        continue;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void v(defpackage.af6 r17, int r18, int r19) {
        /*
            r16 = this;
            r0 = r16
            r1 = r17
            r2 = r18
            r3 = r19
            t74 r4 = r0.c
            ty r5 = r0.o
            if (r4 == 0) goto L_0x00c0
            z3a r4 = r4.d
            r4.getClass()
            if (r2 != r3) goto L_0x001b
            java.util.List r4 = kotlin.collections.CollectionsKt.emptyList()
            goto L_0x0083
        L_0x001b:
            r7 = 0
            if (r3 <= r2) goto L_0x0020
            r8 = 1
            goto L_0x0021
        L_0x0020:
            r8 = r7
        L_0x0021:
            java.util.ArrayList r9 = new java.util.ArrayList
            r9.<init>()
            r10 = r2
        L_0x0027:
            if (r8 == 0) goto L_0x002c
            if (r10 >= r3) goto L_0x0082
            goto L_0x002e
        L_0x002c:
            if (r10 <= r3) goto L_0x0082
        L_0x002e:
            java.lang.Object r11 = r4.b
            java.util.LinkedHashMap r11 = (java.util.LinkedHashMap) r11
            java.lang.Integer r12 = java.lang.Integer.valueOf(r10)
            java.lang.Object r11 = r11.get(r12)
            java.util.TreeMap r11 = (java.util.TreeMap) r11
            r12 = 0
            if (r11 != 0) goto L_0x0041
        L_0x003f:
            r4 = r12
            goto L_0x0083
        L_0x0041:
            if (r8 == 0) goto L_0x0048
            java.util.NavigableSet r13 = r11.descendingKeySet()
            goto L_0x004c
        L_0x0048:
            java.util.Set r13 = r11.keySet()
        L_0x004c:
            java.util.Iterator r13 = r13.iterator()
        L_0x0050:
            boolean r14 = r13.hasNext()
            if (r14 == 0) goto L_0x007e
            java.lang.Object r14 = r13.next()
            java.lang.Integer r14 = (java.lang.Integer) r14
            if (r8 == 0) goto L_0x0069
            int r15 = r10 + 1
            int r6 = r14.intValue()
            if (r15 > r6) goto L_0x0050
            if (r6 > r3) goto L_0x0050
            goto L_0x0071
        L_0x0069:
            int r6 = r14.intValue()
            if (r3 > r6) goto L_0x0050
            if (r6 >= r10) goto L_0x0050
        L_0x0071:
            java.lang.Object r6 = r11.get(r14)
            r9.add(r6)
            int r10 = r14.intValue()
            r6 = 1
            goto L_0x007f
        L_0x007e:
            r6 = r7
        L_0x007f:
            if (r6 != 0) goto L_0x0027
            goto L_0x003f
        L_0x0082:
            r4 = r9
        L_0x0083:
            if (r4 == 0) goto L_0x00c0
            r5.u(r1)
            java.lang.Iterable r4 = (java.lang.Iterable) r4
            java.util.Iterator r2 = r4.iterator()
        L_0x008e:
            boolean r3 = r2.hasNext()
            if (r3 == 0) goto L_0x009e
            java.lang.Object r3 = r2.next()
            pq9 r3 = (defpackage.pq9) r3
            r3.a(r1)
            goto L_0x008e
        L_0x009e:
            a7d r2 = r5.w(r1)
            boolean r3 = r2.b
            if (r3 == 0) goto L_0x00aa
            r16.z(r17)
            goto L_0x00d0
        L_0x00aa:
            java.lang.IllegalStateException r0 = new java.lang.IllegalStateException
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            java.lang.String r3 = "Migration didn't properly handle: "
            r1.<init>(r3)
            java.lang.String r2 = r2.a
            r1.append(r2)
            java.lang.String r1 = r1.toString()
            r0.<init>(r1)
            throw r0
        L_0x00c0:
            t74 r0 = r0.c
            if (r0 == 0) goto L_0x00d1
            boolean r0 = r0.a(r2, r3)
            if (r0 != 0) goto L_0x00d1
            r5.e(r1)
            r5.b(r1)
        L_0x00d0:
            return
        L_0x00d1:
            java.lang.IllegalStateException r0 = new java.lang.IllegalStateException
            java.lang.String r1 = "A migration from "
            java.lang.String r4 = " to "
            java.lang.String r5 = " was required but not found. Please provide the necessary Migration path via RoomDatabase.Builder.addMigration(Migration ...) or allow for destructive migrations via one of the RoomDatabase.Builder.fallbackToDestructiveMigration* methods."
            java.lang.String r1 = defpackage.a81.l(r1, r2, r4, r3, r5)
            r0.<init>(r1)
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.b7d.v(af6, int, int):void");
    }

    public final void z(af6 af6) {
        af6.V("CREATE TABLE IF NOT EXISTS room_master_table (id INTEGER PRIMARY KEY,identity_hash TEXT)");
        af6.V("INSERT OR REPLACE INTO room_master_table (id,identity_hash) VALUES(42, '" + this.v + "')");
    }
}
