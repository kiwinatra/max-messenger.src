package defpackage;

import kotlin.jvm.functions.Function0;

/* renamed from: yjd  reason: default package */
public final /* synthetic */ class yjd implements Function0 {
    public final /* synthetic */ int a;
    public final /* synthetic */ akd b;

    public /* synthetic */ yjd(akd akd, int i) {
        this.a = i;
        this.b = akd;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:31:0x00ac, code lost:
        r6 = kotlin.collections.CollectionsKt.toHashSet(r1);
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final java.lang.Object invoke() {
        /*
            r6 = this;
            int r0 = r6.a
            switch(r0) {
                case 0: goto L_0x00bf;
                case 1: goto L_0x0098;
                case 2: goto L_0x0087;
                default: goto L_0x0005;
            }
        L_0x0005:
            ru.ok.tamtam.android.prefs.PmsKey r0 = ru.ok.tamtam.android.prefs.PmsKey.f118videopreview
            r1 = 0
            akd r6 = r6.b
            java.lang.String r0 = r6.z(r0, r1)
            r1 = 480(0x1e0, float:6.73E-43)
            r2 = 270(0x10e, float:3.78E-43)
            if (r0 == 0) goto L_0x007a
            int r3 = r0.length()
            if (r3 != 0) goto L_0x001b
            goto L_0x007a
        L_0x001b:
            kotlin.Lazy r3 = defpackage.akd.s     // Catch:{ all -> 0x004c }
            java.lang.Object r3 = r3.getValue()     // Catch:{ all -> 0x004c }
            java.util.regex.Pattern r3 = (java.util.regex.Pattern) r3     // Catch:{ all -> 0x004c }
            java.util.Locale r4 = java.util.Locale.US     // Catch:{ all -> 0x004c }
            java.lang.String r4 = r0.toUpperCase(r4)     // Catch:{ all -> 0x004c }
            java.util.regex.Matcher r3 = r3.matcher(r4)     // Catch:{ all -> 0x004c }
            boolean r4 = r3.find()     // Catch:{ all -> 0x004c }
            if (r4 == 0) goto L_0x006d
            r4 = 1
            java.lang.String r4 = r3.group(r4)     // Catch:{ all -> 0x004c }
            java.lang.String r5 = "Required value was null."
            if (r4 == 0) goto L_0x0058
            int r1 = java.lang.Integer.parseInt(r4)     // Catch:{ all -> 0x004c }
            r4 = 2
            java.lang.String r3 = r3.group(r4)     // Catch:{ all -> 0x004c }
            if (r3 == 0) goto L_0x004e
            int r2 = java.lang.Integer.parseInt(r3)     // Catch:{ all -> 0x004c }
            goto L_0x006d
        L_0x004c:
            r3 = move-exception
            goto L_0x0062
        L_0x004e:
            java.lang.IllegalArgumentException r3 = new java.lang.IllegalArgumentException     // Catch:{ all -> 0x004c }
            java.lang.String r4 = r5.toString()     // Catch:{ all -> 0x004c }
            r3.<init>(r4)     // Catch:{ all -> 0x004c }
            throw r3     // Catch:{ all -> 0x004c }
        L_0x0058:
            java.lang.IllegalArgumentException r3 = new java.lang.IllegalArgumentException     // Catch:{ all -> 0x004c }
            java.lang.String r4 = r5.toString()     // Catch:{ all -> 0x004c }
            r3.<init>(r4)     // Catch:{ all -> 0x004c }
            throw r3     // Catch:{ all -> 0x004c }
        L_0x0062:
            java.lang.Object[] r0 = new java.lang.Object[]{r0}
            java.lang.String r6 = r6.e
            java.lang.String r4 = "invalid video preview template %s"
            defpackage.z68.h(r6, r3, r4, r0)
        L_0x006d:
            java.lang.Integer r6 = java.lang.Integer.valueOf(r1)
            java.lang.Integer r0 = java.lang.Integer.valueOf(r2)
            kotlin.Pair r6 = kotlin.TuplesKt.to(r6, r0)
            goto L_0x0086
        L_0x007a:
            java.lang.Integer r6 = java.lang.Integer.valueOf(r1)
            java.lang.Integer r0 = java.lang.Integer.valueOf(r2)
            kotlin.Pair r6 = kotlin.TuplesKt.to(r6, r0)
        L_0x0086:
            return r6
        L_0x0087:
            ru.ok.tamtam.android.prefs.PmsKey r0 = ru.ok.tamtam.android.prefs.PmsKey.f100savedmessagesenabled
            akd r6 = r6.b
            r6.getClass()
            r1 = 0
            boolean r6 = r6.m(r0, r1)
            java.lang.Boolean r6 = java.lang.Boolean.valueOf(r6)
            return r6
        L_0x0098:
            akd r6 = r6.b
            java.util.HashSet r0 = defpackage.bud.a
            ru.ok.tamtam.android.prefs.PmsKey r1 = ru.ok.tamtam.android.prefs.PmsKey.f95reacterrors     // Catch:{ all -> 0x00b6 }
            r6.getClass()     // Catch:{ all -> 0x00b6 }
            java.lang.String r1 = r1.name()     // Catch:{ all -> 0x00b6 }
            r2 = 0
            java.util.List r1 = r6.g(r1, r2)     // Catch:{ all -> 0x00b6 }
            if (r1 == 0) goto L_0x00be
            java.lang.Iterable r1 = (java.lang.Iterable) r1     // Catch:{ all -> 0x00b6 }
            java.util.HashSet r6 = kotlin.collections.CollectionsKt.toHashSet(r1)     // Catch:{ all -> 0x00b6 }
            if (r6 == 0) goto L_0x00be
            r0 = r6
            goto L_0x00be
        L_0x00b6:
            r1 = move-exception
            java.lang.String r6 = r6.e
            java.lang.String r2 = "reactErrors parse failure!"
            defpackage.z68.f(r6, r2, r1)
        L_0x00be:
            return r0
        L_0x00bf:
            akd r6 = r6.b
            int r6 = r6.n()
            java.lang.Integer r6 = java.lang.Integer.valueOf(r6)
            om0 r6 = defpackage.om0.I(r6)
            return r6
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.yjd.invoke():java.lang.Object");
    }
}
