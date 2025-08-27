package defpackage;

import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function2;

/* renamed from: il9  reason: default package */
public final class il9 extends SuspendLambda implements Function2 {
    public int a;
    public final /* synthetic */ xv0 b;
    public final /* synthetic */ en9 c;
    public final /* synthetic */ long o;
    public final /* synthetic */ zf7 v;
    public final /* synthetic */ dw0 w;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public il9(xv0 xv0, en9 en9, long j, zf7 zf7, dw0 dw0, Continuation continuation) {
        super(2, continuation);
        this.b = xv0;
        this.c = en9;
        this.o = j;
        this.v = zf7;
        this.w = dw0;
    }

    public final Continuation create(Object obj, Continuation continuation) {
        return new il9(this.b, this.c, this.o, this.v, this.w, continuation);
    }

    public final Object invoke(Object obj, Object obj2) {
        return ((il9) create((d14) obj, (Continuation) obj2)).invokeSuspend(Unit.INSTANCE);
    }

    /* JADX WARNING: Code restructure failed: missing block: B:20:0x0067, code lost:
        if (r7.m(ru.ok.tamtam.android.prefs.PmsKey.f12botstartparam, true) != false) goto L_0x006b;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final java.lang.Object invokeSuspend(java.lang.Object r15) {
        /*
            r14 = this;
            java.lang.Object r7 = kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED()
            int r0 = r14.a
            r1 = 2
            r2 = 1
            if (r0 == 0) goto L_0x001b
            if (r0 == r2) goto L_0x000e
            if (r0 != r1) goto L_0x0013
        L_0x000e:
            kotlin.ResultKt.throwOnFailure(r15)
            goto L_0x0131
        L_0x0013:
            java.lang.IllegalStateException r0 = new java.lang.IllegalStateException
            java.lang.String r1 = "call to 'resume' before 'invoke' with coroutine"
            r0.<init>(r1)
            throw r0
        L_0x001b:
            kotlin.ResultKt.throwOnFailure(r15)
            xv0 r0 = r14.b
            fw0 r3 = r0.b
            if (r3 != 0) goto L_0x0026
            r3 = -1
            goto L_0x002e
        L_0x0026:
            int[] r4 = defpackage.hl9.$EnumSwitchMapping$0
            int r3 = r3.ordinal()
            r3 = r4[r3]
        L_0x002e:
            zf7 r4 = r14.v
            en9 r5 = r14.c
            switch(r3) {
                case 1: goto L_0x011d;
                case 2: goto L_0x011d;
                case 3: goto L_0x00df;
                case 4: goto L_0x00d9;
                case 5: goto L_0x00aa;
                case 6: goto L_0x0080;
                case 7: goto L_0x003b;
                case 8: goto L_0x0131;
                default: goto L_0x0035;
            }
        L_0x0035:
            kotlin.NoWhenBranchMatchedException r0 = new kotlin.NoWhenBranchMatchedException
            r0.<init>()
            throw r0
        L_0x003b:
            etc r1 = r5.k1
            ome r1 = r1.a
            java.lang.Object r1 = r1.getValue()
            a32 r1 = (defpackage.a32) r1
            if (r1 == 0) goto L_0x007d
            fk9 r3 = defpackage.fk9.b
            long r6 = r1.a
            java.lang.Long r1 = kotlin.coroutines.jvm.internal.Boxing.boxLong(r6)
            java.lang.String r4 = r0.v
            r6 = 0
            if (r4 == 0) goto L_0x006a
            kotlin.Lazy r7 = r5.C0
            java.lang.Object r7 = r7.getValue()
            bud r7 = (defpackage.bud) r7
            akd r7 = (defpackage.akd) r7
            r7.getClass()
            ru.ok.tamtam.android.prefs.PmsKey r8 = ru.ok.tamtam.android.prefs.PmsKey.f12botstartparam
            boolean r2 = r7.m(r8, r2)
            if (r2 == 0) goto L_0x006a
            goto L_0x006b
        L_0x006a:
            r4 = r6
        L_0x006b:
            kfg r2 = defpackage.kfg.INLINE_BUTTON
            r3.getClass()
            long r6 = r0.x
            pa4 r0 = defpackage.fk9.q1(r6, r2, r1, r4)
            s85 r1 = r5.t1
            defpackage.xag.h(r1, r0)
            goto L_0x0131
        L_0x007d:
            kotlin.Unit r0 = kotlin.Unit.INSTANCE
            return r0
        L_0x0080:
            etc r2 = r5.k1
            ome r2 = r2.a
            java.lang.Object r2 = r2.getValue()
            a32 r2 = (defpackage.a32) r2
            if (r2 == 0) goto L_0x00a7
            kotlin.Lazy r3 = r5.b1
            java.lang.Object r3 = r3.getValue()
            ap9 r3 = (defpackage.ap9) r3
            r14.a = r1
            r5 = 0
            long r1 = r2.a
            java.lang.String r4 = r0.a
            r8 = 0
            r0 = r3
            r3 = r4
            r4 = r8
            r6 = r14
            java.lang.Object r0 = r0.b(r1, r3, r4, r5, r6)
            if (r0 != r7) goto L_0x0131
            return r7
        L_0x00a7:
            kotlin.Unit r0 = kotlin.Unit.INSTANCE
            return r0
        L_0x00aa:
            etc r0 = r5.k1
            ome r0 = r0.a
            java.lang.Object r0 = r0.getValue()
            a32 r0 = (defpackage.a32) r0
            if (r0 == 0) goto L_0x00d6
            fk9 r1 = defpackage.fk9.b
            r1.getClass()
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            java.lang.String r2 = ":location/pick?request_code=1001&chat_id="
            r1.<init>(r2)
            long r2 = r0.a
            r1.append(r2)
            java.lang.String r0 = r1.toString()
            pa4 r1 = new pa4
            r1.<init>(r0)
            s85 r0 = r5.t1
            defpackage.xag.h(r0, r1)
            goto L_0x0131
        L_0x00d6:
            kotlin.Unit r0 = kotlin.Unit.INSTANCE
            return r0
        L_0x00d9:
            java.lang.String r0 = r0.o
            r5.x(r0)
            goto L_0x0131
        L_0x00df:
            s85 r0 = r5.q1
            pg3 r1 = defpackage.d89.a
            java.lang.String r8 = r4.b
            n8e r1 = new n8e
            int r2 = defpackage.ewa.D0
            igf r11 = new igf
            r11.<init>(r2)
            int r2 = defpackage.ewa.C0
            igf r12 = new igf
            r12.<init>(r2)
            pg3 r2 = new pg3
            int r3 = defpackage.cwa.V
            int r4 = defpackage.ewa.B0
            igf r5 = new igf
            r5.<init>(r4)
            og3 r4 = defpackage.og3.c
            r2.<init>(r3, r5, r4)
            pg3 r3 = defpackage.d89.a
            pg3[] r2 = new defpackage.pg3[]{r2, r3}
            java.util.List r13 = kotlin.collections.CollectionsKt.listOf(r2)
            dw0 r9 = r14.w
            xv0 r10 = r14.b
            long r6 = r14.o
            r5 = r1
            r5.<init>(r6, r8, r9, r10, r11, r12, r13)
            defpackage.xag.h(r0, r1)
            goto L_0x0131
        L_0x011d:
            srd r0 = r5.w0
            java.lang.String r3 = r4.b
            r14.a = r2
            dw0 r4 = r14.w
            xv0 r5 = r14.b
            long r1 = r14.o
            r6 = r14
            java.lang.Object r0 = r0.E(r1, r3, r4, r5, r6)
            if (r0 != r7) goto L_0x0131
            return r7
        L_0x0131:
            kotlin.Unit r0 = kotlin.Unit.INSTANCE
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.il9.invokeSuspend(java.lang.Object):java.lang.Object");
    }
}
