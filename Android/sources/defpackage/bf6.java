package defpackage;

import android.database.DatabaseErrorHandler;

/* renamed from: bf6  reason: default package */
public final /* synthetic */ class bf6 implements DatabaseErrorHandler {
    public final /* synthetic */ ty a;
    public final /* synthetic */ rt6 b;

    public /* synthetic */ bf6(ty tyVar, rt6 rt6) {
        this.a = tyVar;
        this.b = rt6;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:15:0x0041, code lost:
        r0 = move-exception;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:16:0x0042, code lost:
        if (r4 != null) goto L_0x0044;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:17:0x0044, code lost:
        r3 = r4.iterator();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:19:0x004e, code lost:
        if (r3.hasNext() != false) goto L_0x0050;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:20:0x0050, code lost:
        defpackage.ty.c((java.lang.String) ((android.util.Pair) r3.next()).second);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:21:0x005e, code lost:
        r3 = r3.getPath();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:22:0x0062, code lost:
        if (r3 != null) goto L_0x0064;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:23:0x0064, code lost:
        defpackage.ty.c(r3);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:24:0x0067, code lost:
        throw r0;
     */
    /* JADX WARNING: Failed to process nested try/catch */
    /* JADX WARNING: Missing exception handler attribute for start block: B:13:0x003d */
    /* JADX WARNING: Removed duplicated region for block: B:15:0x0041 A[ExcHandler: all (r0v2 'th' java.lang.Throwable A[CUSTOM_DECLARE]), PHI: r4 
      PHI: (r4v3 java.util.List<android.util.Pair<java.lang.String, java.lang.String>>) = (r4v2 java.util.List<android.util.Pair<java.lang.String, java.lang.String>>), (r4v10 java.util.List<android.util.Pair<java.lang.String, java.lang.String>>), (r4v10 java.util.List<android.util.Pair<java.lang.String, java.lang.String>>) binds: [B:11:0x0039, B:13:0x003d, B:14:?] A[DONT_GENERATE, DONT_INLINE], Splitter:B:11:0x0039] */
    /* JADX WARNING: Removed duplicated region for block: B:27:0x006a  */
    /* JADX WARNING: Removed duplicated region for block: B:31:0x0084  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void onCorruption(android.database.sqlite.SQLiteDatabase r4) {
        /*
            r3 = this;
            int r0 = defpackage.df6.y
            rt6 r0 = r3.b
            java.lang.Object r1 = r0.b
            af6 r1 = (defpackage.af6) r1
            if (r1 == 0) goto L_0x0014
            java.lang.Object r2 = r1.b
            android.database.sqlite.SQLiteDatabase r2 = (android.database.sqlite.SQLiteDatabase) r2
            boolean r2 = kotlin.jvm.internal.Intrinsics.areEqual((java.lang.Object) r2, (java.lang.Object) r4)
            if (r2 != 0) goto L_0x001c
        L_0x0014:
            af6 r1 = new af6
            r2 = 0
            r1.<init>(r2, r4)
            r0.b = r1
        L_0x001c:
            ty r3 = r3.a
            r3.getClass()
            java.util.Objects.toString(r1)
            java.lang.Object r3 = r1.b
            android.database.sqlite.SQLiteDatabase r3 = (android.database.sqlite.SQLiteDatabase) r3
            boolean r4 = r3.isOpen()
            if (r4 != 0) goto L_0x0038
            java.lang.String r3 = r3.getPath()
            if (r3 == 0) goto L_0x008d
            defpackage.ty.c(r3)
            goto L_0x008d
        L_0x0038:
            r4 = 0
            java.util.List r4 = r3.getAttachedDbs()     // Catch:{ SQLiteException -> 0x003d, all -> 0x0041 }
        L_0x003d:
            r1.close()     // Catch:{ IOException -> 0x0068, all -> 0x0041 }
            goto L_0x0068
        L_0x0041:
            r0 = move-exception
            if (r4 == 0) goto L_0x005e
            java.lang.Iterable r4 = (java.lang.Iterable) r4
            java.util.Iterator r3 = r4.iterator()
        L_0x004a:
            boolean r4 = r3.hasNext()
            if (r4 == 0) goto L_0x0067
            java.lang.Object r4 = r3.next()
            android.util.Pair r4 = (android.util.Pair) r4
            java.lang.Object r4 = r4.second
            java.lang.String r4 = (java.lang.String) r4
            defpackage.ty.c(r4)
            goto L_0x004a
        L_0x005e:
            java.lang.String r3 = r3.getPath()
            if (r3 == 0) goto L_0x0067
            defpackage.ty.c(r3)
        L_0x0067:
            throw r0
        L_0x0068:
            if (r4 == 0) goto L_0x0084
            java.lang.Iterable r4 = (java.lang.Iterable) r4
            java.util.Iterator r3 = r4.iterator()
        L_0x0070:
            boolean r4 = r3.hasNext()
            if (r4 == 0) goto L_0x008d
            java.lang.Object r4 = r3.next()
            android.util.Pair r4 = (android.util.Pair) r4
            java.lang.Object r4 = r4.second
            java.lang.String r4 = (java.lang.String) r4
            defpackage.ty.c(r4)
            goto L_0x0070
        L_0x0084:
            java.lang.String r3 = r3.getPath()
            if (r3 == 0) goto L_0x008d
            defpackage.ty.c(r3)
        L_0x008d:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.bf6.onCorruption(android.database.sqlite.SQLiteDatabase):void");
    }
}
