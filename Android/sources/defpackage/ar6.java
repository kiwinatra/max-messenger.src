package defpackage;

import java.util.List;
import kotlin.Lazy;
import kotlin.collections.CollectionsKt;

/* renamed from: ar6  reason: default package */
public final class ar6 {
    public final Lazy a;
    public final Lazy b;
    public final Lazy c;

    public ar6(Lazy lazy, Lazy lazy2, Lazy lazy3) {
        this.a = lazy;
        this.b = lazy2;
        this.c = lazy3;
    }

    /* JADX WARNING: Removed duplicated region for block: B:39:0x009b A[Catch:{ all -> 0x009f }] */
    /* JADX WARNING: Removed duplicated region for block: B:42:0x00a1 A[Catch:{ all -> 0x009f }] */
    /* JADX WARNING: Removed duplicated region for block: B:44:0x00a4 A[Catch:{ all -> 0x009f }] */
    /* JADX WARNING: Removed duplicated region for block: B:45:0x00b2 A[Catch:{ all -> 0x009f }] */
    /* JADX WARNING: Removed duplicated region for block: B:50:0x00c8  */
    /* JADX WARNING: Removed duplicated region for block: B:60:0x00e2  */
    /* JADX WARNING: Removed duplicated region for block: B:79:0x0062 A[SYNTHETIC] */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final java.util.List a(defpackage.a32 r14, java.lang.CharSequence r15) {
        /*
            r13 = this;
            r0 = 0
            if (r15 == 0) goto L_0x0008
            java.lang.CharSequence r15 = kotlin.text.StringsKt.trim((java.lang.CharSequence) r15)
            goto L_0x0009
        L_0x0008:
            r15 = r0
        L_0x0009:
            if (r15 == 0) goto L_0x0138
            int r1 = r15.length()
            if (r1 != 0) goto L_0x0013
            goto L_0x0138
        L_0x0013:
            kotlin.Lazy r1 = r13.a
            r2 = 0
            r3 = 1
            if (r14 == 0) goto L_0x003c
            java.lang.Object r1 = r1.getValue()
            yva r1 = (defpackage.yva) r1
            r1.getClass()
            m72 r14 = r14.b
            java.util.Map r4 = r14.e
            int r4 = r4.size()
            int r14 = r14.c()
            if (r4 < r14) goto L_0x0032
            r14 = r3
            goto L_0x0033
        L_0x0032:
            r14 = r2
        L_0x0033:
            wa9 r4 = defpackage.wa9.a
            xva r1 = r1.o
            java.util.List r14 = r1.c(r15, r14)
            goto L_0x004d
        L_0x003c:
            java.lang.Object r14 = r1.getValue()
            yva r14 = (defpackage.yva) r14
            r14.getClass()
            wa9 r1 = defpackage.wa9.a
            xva r14 = r14.o
            java.util.List r14 = r14.c(r15, r3)
        L_0x004d:
            java.util.ArrayList r1 = new java.util.ArrayList
            java.util.Collection r14 = (java.util.Collection) r14
            r1.<init>(r14)
            boolean r14 = r1.isEmpty()
            r14 = r14 ^ r3
            java.lang.String r4 = "url"
            if (r14 == 0) goto L_0x00e8
            java.util.Iterator r14 = r1.iterator()
            r5 = r2
        L_0x0062:
            boolean r6 = r14.hasNext()
            if (r6 == 0) goto L_0x00e7
            java.lang.Object r6 = r14.next()
            ta9 r6 = (defpackage.ta9) r6
            if (r5 != 0) goto L_0x0089
            sa9 r5 = r6.c
            r5.getClass()
            sa9 r7 = defpackage.sa9.a
            if (r5 == r7) goto L_0x007d
            sa9 r7 = defpackage.sa9.b
            if (r5 != r7) goto L_0x0087
        L_0x007d:
            java.lang.String r5 = r6.b
            if (r5 == 0) goto L_0x0087
            int r5 = r5.length()
            if (r5 != 0) goto L_0x0089
        L_0x0087:
            r5 = r2
            goto L_0x008a
        L_0x0089:
            r5 = r3
        L_0x008a:
            java.util.Map r7 = r6.f
            if (r7 == 0) goto L_0x0062
            java.lang.Object r7 = r7.get(r4)
            if (r7 != 0) goto L_0x0095
            goto L_0x0062
        L_0x0095:
            kotlin.Result$Companion r8 = kotlin.Result.Companion     // Catch:{ all -> 0x009f }
            boolean r8 = r15 instanceof android.text.Spanned     // Catch:{ all -> 0x009f }
            if (r8 == 0) goto L_0x00a1
            r8 = r15
            android.text.Spanned r8 = (android.text.Spanned) r8     // Catch:{ all -> 0x009f }
            goto L_0x00a2
        L_0x009f:
            r8 = move-exception
            goto L_0x00b8
        L_0x00a1:
            r8 = r0
        L_0x00a2:
            if (r8 == 0) goto L_0x00b2
            int r9 = r6.d     // Catch:{ all -> 0x009f }
            int r10 = r6.e     // Catch:{ all -> 0x009f }
            int r10 = r10 + r9
            java.lang.Class<ky7> r11 = defpackage.ky7.class
            java.lang.Object[] r8 = r8.getSpans(r9, r10, r11)     // Catch:{ all -> 0x009f }
            ky7[] r8 = (defpackage.ky7[]) r8     // Catch:{ all -> 0x009f }
            goto L_0x00b3
        L_0x00b2:
            r8 = r0
        L_0x00b3:
            java.lang.Object r8 = kotlin.Result.m23constructorimpl(r8)     // Catch:{ all -> 0x009f }
            goto L_0x00c2
        L_0x00b8:
            kotlin.Result$Companion r9 = kotlin.Result.Companion
            java.lang.Object r8 = kotlin.ResultKt.createFailure(r8)
            java.lang.Object r8 = kotlin.Result.m23constructorimpl(r8)
        L_0x00c2:
            boolean r9 = kotlin.Result.m29isFailureimpl(r8)
            if (r9 == 0) goto L_0x00c9
            r8 = r0
        L_0x00c9:
            ky7[] r8 = (defpackage.ky7[]) r8
            sa9 r9 = defpackage.sa9.w
            sa9 r6 = r6.c
            if (r6 != r9) goto L_0x0062
            boolean r6 = r7 instanceof java.lang.CharSequence
            if (r6 == 0) goto L_0x0062
            java.lang.CharSequence r7 = (java.lang.CharSequence) r7
            boolean r6 = kotlin.text.StringsKt__StringsKt.contains$default((java.lang.CharSequence) r15, (java.lang.CharSequence) r7, false, 2, (java.lang.Object) null)
            if (r6 != 0) goto L_0x0062
            if (r8 == 0) goto L_0x00e2
            int r6 = r8.length
            if (r6 != 0) goto L_0x0062
        L_0x00e2:
            r14.remove()
            goto L_0x0062
        L_0x00e7:
            r2 = r5
        L_0x00e8:
            kotlin.Lazy r13 = r13.c
            java.lang.Object r13 = r13.getValue()
            nd r13 = (defpackage.nd) r13
            java.lang.String r14 = "MENTION_MSG_SEND"
            r13.c(r2, r14)
            java.util.regex.Pattern r13 = android.util.Patterns.WEB_URL
            java.util.regex.Matcher r13 = r13.matcher(r15)
        L_0x00fb:
            boolean r14 = r13.find()
            if (r14 == 0) goto L_0x0137
            java.lang.String r14 = r13.group()     // Catch:{ all -> 0x012a }
            ta9 r15 = new ta9     // Catch:{ all -> 0x012a }
            sa9 r9 = defpackage.sa9.w     // Catch:{ all -> 0x012a }
            int r10 = r13.start()     // Catch:{ all -> 0x012a }
            int r0 = r13.end()     // Catch:{ all -> 0x012a }
            int r2 = r13.start()     // Catch:{ all -> 0x012a }
            int r11 = r0 - r2
            kotlin.Pair r14 = kotlin.TuplesKt.to(r4, r14)     // Catch:{ all -> 0x012a }
            java.util.Map r12 = kotlin.collections.MapsKt.mapOf(r14)     // Catch:{ all -> 0x012a }
            r6 = 0
            r8 = 0
            r5 = r15
            r5.<init>(r6, r8, r9, r10, r11, r12)     // Catch:{ all -> 0x012a }
            r1.add(r15)     // Catch:{ all -> 0x012a }
            goto L_0x00fb
        L_0x012a:
            r14 = move-exception
            java.lang.Class<ar6> r15 = defpackage.ar6.class
            java.lang.String r15 = r15.getName()
            java.lang.String r0 = "failure to find link"
            defpackage.z68.f(r15, r0, r14)
            goto L_0x00fb
        L_0x0137:
            return r1
        L_0x0138:
            java.util.List r13 = kotlin.collections.CollectionsKt.emptyList()
            return r13
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.ar6.a(a32, java.lang.CharSequence):java.util.List");
    }

    public final List b(CharSequence charSequence, long j) {
        a32 a32 = (a32) ((my2) ((qx2) this.b.getValue())).o(j).a.getValue();
        return a32 == null ? CollectionsKt.emptyList() : a(a32, charSequence);
    }
}
