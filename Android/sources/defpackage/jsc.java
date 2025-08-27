package defpackage;

import kotlin.jvm.functions.Function0;
import ru.ok.onechat.reactions.ReactionsViewModel;

/* renamed from: jsc  reason: default package */
public final /* synthetic */ class jsc implements Function0 {
    public final /* synthetic */ int a;
    public final /* synthetic */ ReactionsViewModel b;

    public /* synthetic */ jsc(ReactionsViewModel reactionsViewModel, int i) {
        this.a = i;
        this.b = reactionsViewModel;
    }

    /* JADX WARNING: Removed duplicated region for block: B:21:0x006f  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final java.lang.Object invoke() {
        /*
            r14 = this;
            int r0 = r14.a
            switch(r0) {
                case 0: goto L_0x00fd;
                case 1: goto L_0x00e4;
                case 2: goto L_0x0010;
                default: goto L_0x0005;
            }
        L_0x0005:
            ru.ok.onechat.reactions.ReactionsViewModel r14 = r14.b
            boolean r14 = r14.o()
            java.lang.Boolean r14 = java.lang.Boolean.valueOf(r14)
            return r14
        L_0x0010:
            ru.ok.onechat.reactions.ReactionsViewModel r14 = r14.b
            kotlin.Lazy r0 = r14.p
            java.lang.Object r0 = r0.getValue()
            gk r0 = (defpackage.gk) r0
            java.util.concurrent.CopyOnWriteArrayList r1 = r0.o
            boolean r2 = r1.isEmpty()
            if (r2 != 0) goto L_0x0056
            java.util.concurrent.ConcurrentHashMap r0 = r0.n
            boolean r2 = r0.isEmpty()
            if (r2 == 0) goto L_0x002b
            goto L_0x0056
        L_0x002b:
            java.util.ArrayList r2 = new java.util.ArrayList
            r2.<init>()
            java.util.Iterator r1 = r1.iterator()
        L_0x0034:
            boolean r3 = r1.hasNext()
            if (r3 == 0) goto L_0x005a
            java.lang.Object r3 = r1.next()
            java.lang.Long r3 = (java.lang.Long) r3
            java.lang.Object r3 = r0.get(r3)
            tz9 r3 = (defpackage.tz9) r3
            if (r3 == 0) goto L_0x004f
            java.lang.Object r3 = r3.getValue()
            hi r3 = (defpackage.hi) r3
            goto L_0x0050
        L_0x004f:
            r3 = 0
        L_0x0050:
            if (r3 == 0) goto L_0x0034
            r2.add(r3)
            goto L_0x0034
        L_0x0056:
            java.util.List r2 = kotlin.collections.CollectionsKt.emptyList()
        L_0x005a:
            java.lang.Iterable r2 = (java.lang.Iterable) r2
            java.util.ArrayList r0 = new java.util.ArrayList
            int r1 = kotlin.collections.CollectionsKt__IterablesKt.collectionSizeOrDefault(r2, 10)
            r0.<init>(r1)
            java.util.Iterator r1 = r2.iterator()
        L_0x0069:
            boolean r2 = r1.hasNext()
            if (r2 == 0) goto L_0x00e3
            java.lang.Object r2 = r1.next()
            hi r2 = (defpackage.hi) r2
            kotlin.Lazy r3 = r14.o
            java.lang.Object r3 = r3.getValue()
            yd9 r3 = (defpackage.yd9) r3
            long r4 = r2.a
            zqc r6 = r14.g
            int r6 = r6.a()
            float r6 = (float) r6
            android.content.res.Resources r7 = defpackage.vo4.c()
            android.util.DisplayMetrics r7 = r7.getDisplayMetrics()
            float r7 = r7.density
            float r6 = r6 * r7
            int r13 = kotlin.math.MathKt.roundToInt((float) r6)
            kotlin.Lazy r6 = r3.c
            java.lang.Object r6 = r6.getValue()
            gk r6 = (defpackage.gk) r6
            tz9 r4 = r6.i(r4)
            java.lang.Object r4 = r4.getValue()
            hi r4 = (defpackage.hi) r4
            kotlin.Lazy r5 = r3.b
            java.lang.String r12 = r2.b
            if (r4 == 0) goto L_0x00c3
            boolean r3 = r3.e
            if (r3 == 0) goto L_0x00c3
            java.lang.Object r3 = r5.getValue()
            r7 = r3
            u25 r7 = (defpackage.u25) r7
            java.lang.String r10 = r4.c
            java.lang.String r11 = r4.e
            long r8 = r4.a
            java.lang.CharSequence r3 = r7.b(r8, r10, r11, r12, r13)
            goto L_0x00cd
        L_0x00c3:
            java.lang.Object r3 = r5.getValue()
            u25 r3 = (defpackage.u25) r3
            java.lang.CharSequence r3 = r3.e(r12, r13)
        L_0x00cd:
            hqc r7 = new hqc
            r7.<init>(r3)
            xqc r3 = new xqc
            android.graphics.drawable.Drawable r8 = ru.ok.onechat.reactions.ReactionsViewModel.l(r7)
            r9 = 0
            long r5 = r2.a
            r4 = r3
            r4.<init>(r5, r7, r8, r9)
            r0.add(r3)
            goto L_0x0069
        L_0x00e3:
            return r0
        L_0x00e4:
            ru.ok.onechat.reactions.ReactionsViewModel r14 = r14.b
            kotlin.Lazy r14 = r14.r
            java.lang.Object r14 = r14.getValue()
            gqc r14 = (defpackage.gqc) r14
            r14.getClass()
            gqc r0 = defpackage.gqc.a
            if (r14 == r0) goto L_0x00f7
            r14 = 1
            goto L_0x00f8
        L_0x00f7:
            r14 = 0
        L_0x00f8:
            java.lang.Boolean r14 = java.lang.Boolean.valueOf(r14)
            return r14
        L_0x00fd:
            ru.ok.onechat.reactions.ReactionsViewModel r14 = r14.b
            bud r14 = r14.e
            r14.getClass()
            gqc r14 = defpackage.gqc.c
            return r14
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.jsc.invoke():java.lang.Object");
    }
}
