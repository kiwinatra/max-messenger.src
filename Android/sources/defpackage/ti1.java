package defpackage;

import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function6;
import ru.ok.android.externcalls.sdk.audio.CallsAudioDeviceInfo;

/* renamed from: ti1  reason: default package */
public final class ti1 extends SuspendLambda implements Function6 {
    public /* synthetic */ s44 a;
    public /* synthetic */ i9b b;
    public /* synthetic */ CallsAudioDeviceInfo c;
    public /* synthetic */ y11 o;
    public /* synthetic */ dhd v;
    public final /* synthetic */ jj1 w;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public ti1(jj1 jj1, Continuation continuation) {
        super(6, continuation);
        this.w = jj1;
    }

    public final Object invoke(Object obj, Object obj2, Object obj3, Object obj4, Object obj5, Object obj6) {
        ti1 ti1 = new ti1(this.w, (Continuation) obj6);
        ti1.a = (s44) obj;
        ti1.b = (i9b) obj2;
        ti1.c = (CallsAudioDeviceInfo) obj3;
        ti1.o = (y11) obj4;
        ti1.v = (dhd) obj5;
        return ti1.invokeSuspend(Unit.INSTANCE);
    }

    /* JADX WARNING: Code restructure failed: missing block: B:14:0x0066, code lost:
        if (kotlin.jvm.internal.Intrinsics.areEqual((java.lang.Object) r12.c, (java.lang.Object) r13) != false) goto L_0x0069;
     */
    /* JADX WARNING: Removed duplicated region for block: B:95:0x021c A[LOOP:0: B:4:0x0026->B:95:0x021c, LOOP_END] */
    /* JADX WARNING: Removed duplicated region for block: B:96:0x0219 A[SYNTHETIC] */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final java.lang.Object invokeSuspend(java.lang.Object r41) {
        /*
            r40 = this;
            r0 = r40
            kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED()
            kotlin.ResultKt.throwOnFailure(r41)
            s44 r1 = r0.a
            i9b r2 = r0.b
            ru.ok.android.externcalls.sdk.audio.CallsAudioDeviceInfo r3 = r0.c
            y11 r4 = r0.o
            dhd r5 = r0.v
            y8b r6 = r2.a
            cf1 r6 = r6.a
            boolean r6 = r6.b()
            r7 = 0
            jj1 r0 = r0.w
            if (r6 != 0) goto L_0x0024
            ap1 r6 = r0.c
            r6.f(r7)
        L_0x0024:
            xme r6 = r0.x0
        L_0x0026:
            java.lang.Object r8 = r6.getValue()
            r9 = r8
            k91 r9 = (defpackage.k91) r9
            l91 r10 = r0.w
            r10.b = r1
            r10.c = r2
            r10.d = r3
            r10.e = r4
            r10.f = r5
            boolean r11 = r0.n()
            me5 r12 = r9.e
            boolean r13 = r12 instanceof defpackage.he5
            if (r13 == 0) goto L_0x004d
        L_0x0043:
            r36 = r0
            r37 = r1
            r38 = r2
            r39 = r3
            goto L_0x0203
        L_0x004d:
            boolean r12 = r12 instanceof defpackage.ge5
            java.lang.String r13 = r9.a
            if (r12 != 0) goto L_0x0054
            goto L_0x0069
        L_0x0054:
            s44 r12 = r10.b
            me5 r14 = r12.j
            boolean r14 = r14 instanceof defpackage.he5
            if (r14 != 0) goto L_0x0043
            boolean r14 = r12.g
            if (r14 == 0) goto L_0x0069
            java.lang.String r12 = r12.c
            boolean r12 = kotlin.jvm.internal.Intrinsics.areEqual((java.lang.Object) r12, (java.lang.Object) r13)
            if (r12 != 0) goto L_0x0069
            goto L_0x0043
        L_0x0069:
            s44 r12 = r10.b
            boolean r12 = r12.f
            i9b r14 = r10.c
            y8b r15 = r14.a
            cf1 r14 = r15.a
            boolean r17 = r14.isScreenCaptureEnabled()
            i9b r14 = r10.c
            y8b r14 = r14.a
            cf1 r14 = r14.a
            boolean r21 = r14.f()
            i9b r14 = r10.c
            y8b r14 = r14.a
            cf1 r14 = r14.a
            boolean r14 = r14.isScreenCaptureEnabled()
            r22 = 0
            if (r14 != 0) goto L_0x009b
            i9b r14 = r10.c
            ze1 r14 = r14.a()
            if (r14 == 0) goto L_0x0098
            goto L_0x009b
        L_0x0098:
            r18 = r22
            goto L_0x009d
        L_0x009b:
            r18 = 1
        L_0x009d:
            i9b r14 = r10.c
            ze1 r19 = r14.a()
            ni1 r23 = new ni1
            r20 = 0
            r16 = r23
            r16.<init>(r17, r18, r19, r20, r21)
            dhd r14 = r10.f
            cf1 r7 = r15.a
            if (r14 == 0) goto L_0x00e6
            zgd r14 = r14.b
            if (r14 == 0) goto L_0x00e6
            li1 r16 = new li1
            r36 = r0
            ze1 r0 = r7.getId()
            r37 = r1
            ze1 r1 = r14.c
            boolean r25 = kotlin.jvm.internal.Intrinsics.areEqual((java.lang.Object) r1, (java.lang.Object) r0)
            boolean r26 = r7.l()
            i9b r0 = r10.c
            java.util.Map r0 = r0.c
            ze1 r1 = r14.c
            java.lang.Object r0 = r0.get(r1)
            r30 = r0
            y8b r30 = (defpackage.y8b) r30
            r27 = 1
            r29 = 0
            r24 = r16
            r28 = r1
            r24.<init>(r25, r26, r27, r28, r29, r30)
            r24 = r16
            goto L_0x00ee
        L_0x00e6:
            r36 = r0
            r37 = r1
            li1 r0 = defpackage.li1.f
            r24 = r0
        L_0x00ee:
            s44 r0 = r10.b
            me5 r1 = r0.j
            boolean r14 = r1 instanceof defpackage.ie5
            r16 = 1
            r14 = r14 ^ 1
            if (r14 == 0) goto L_0x00fb
            goto L_0x00fc
        L_0x00fb:
            r1 = 0
        L_0x00fc:
            if (r1 != 0) goto L_0x0100
            me5 r1 = r9.e
        L_0x0100:
            ld9 r14 = r9.b
            if (r14 != 0) goto L_0x0106
            ld9 r14 = r0.a
        L_0x0106:
            r16 = r14
            java.lang.String r0 = r0.c
            if (r0 != 0) goto L_0x010d
            r0 = r13
        L_0x010d:
            y11 r13 = r10.e
            y11 r14 = defpackage.y11.f
            boolean r13 = kotlin.jvm.internal.Intrinsics.areEqual((java.lang.Object) r13, (java.lang.Object) r14)
            if (r13 == 0) goto L_0x011a
            l21 r9 = r9.f
            goto L_0x011b
        L_0x011a:
            r9 = 0
        L_0x011b:
            if (r9 != 0) goto L_0x0123
            y11 r9 = r10.e
            l21 r9 = defpackage.hd8.a0(r9)
        L_0x0123:
            r20 = r9
            s44 r9 = r10.b
            boolean r13 = r9.h
            i9b r14 = r10.c
            java.util.Map r14 = r14.c
            int r14 = r14.size()
            r38 = r2
            r2 = 1
            if (r14 <= r2) goto L_0x013d
            i9b r14 = r10.c
            ze1 r14 = r14.d
            r30 = r14
            goto L_0x013f
        L_0x013d:
            r30 = 0
        L_0x013f:
            i9b r14 = r10.c
            java.util.Map r14 = r14.c
            boolean r29 = r14.isEmpty()
            s44 r14 = r10.b
            boolean r14 = r14.e
            if (r14 != 0) goto L_0x0153
            if (r29 != 0) goto L_0x0150
            goto L_0x0153
        L_0x0150:
            r26 = r22
            goto L_0x0155
        L_0x0153:
            r26 = r2
        L_0x0155:
            ru.ok.android.externcalls.sdk.audio.CallsAudioDeviceInfo r14 = r10.d
            u41 r31 = defpackage.ke8.b(r14, r11)
            boolean r11 = r23.a()
            qcb r14 = r10.a
            if (r11 == 0) goto L_0x016a
            aj8 r11 = defpackage.aj8.o
            r39 = r3
            r32 = r11
            goto L_0x018e
        L_0x016a:
            i9b r11 = r10.c
            y8b r11 = r11.a
            cf1 r11 = r11.a
            boolean r11 = r11.b()
            edb r2 = r14.a()
            r39 = r3
            java.lang.String[] r3 = defpackage.edb.l
            boolean r2 = r2.b(r3)
            if (r2 != 0) goto L_0x0185
            aj8 r2 = defpackage.aj8.v
            goto L_0x018c
        L_0x0185:
            if (r11 == 0) goto L_0x018a
            aj8 r2 = defpackage.aj8.c
            goto L_0x018c
        L_0x018a:
            aj8 r2 = defpackage.aj8.b
        L_0x018c:
            r32 = r2
        L_0x018e:
            i9b r2 = r10.c
            y8b r2 = r2.a
            cf1 r2 = r2.a
            boolean r2 = r2.c()
            edb r3 = r14.a()
            java.lang.String[] r11 = defpackage.edb.h
            boolean r3 = r3.b(r11)
            if (r3 != 0) goto L_0x01a9
            aj8 r2 = defpackage.aj8.v
        L_0x01a6:
            r33 = r2
            goto L_0x01b1
        L_0x01a9:
            if (r2 == 0) goto L_0x01ae
            aj8 r2 = defpackage.aj8.c
            goto L_0x01a6
        L_0x01ae:
            aj8 r2 = defpackage.aj8.b
            goto L_0x01a6
        L_0x01b1:
            s44 r2 = r10.b
            oub r2 = r2.i
            if (r2 == 0) goto L_0x01bc
            ld9 r2 = r2.b
            r17 = r2
            goto L_0x01be
        L_0x01bc:
            r17 = 0
        L_0x01be:
            if (r13 == 0) goto L_0x01c9
            boolean r2 = r7.l()
            if (r2 == 0) goto L_0x01c9
            r28 = 1
            goto L_0x01cb
        L_0x01c9:
            r28 = r22
        L_0x01cb:
            boolean r2 = r1 instanceof defpackage.he5
            if (r2 != 0) goto L_0x01e0
            boolean r2 = r1 instanceof defpackage.ge5
            if (r2 != 0) goto L_0x01e0
            boolean r2 = r1 instanceof defpackage.ie5
            if (r2 == 0) goto L_0x01d8
            goto L_0x01e0
        L_0x01d8:
            if (r16 != 0) goto L_0x01dd
            if (r2 == 0) goto L_0x01dd
            goto L_0x01e0
        L_0x01dd:
            r34 = r22
            goto L_0x01e2
        L_0x01e0:
            r34 = 1
        L_0x01e2:
            s44 r2 = r10.b
            boolean r2 = r2.g
            i9b r3 = r10.c
            boolean r3 = r3.g
            k91 r7 = new k91
            r14 = r7
            java.lang.String r9 = r9.d
            r25 = r9
            r9 = r15
            r15 = r0
            r18 = r2
            r19 = r1
            r21 = r13
            r22 = r9
            r27 = r12
            r35 = r3
            r14.<init>(r15, r16, r17, r18, r19, r20, r21, r22, r23, r24, r25, r26, r27, r28, r29, r30, r31, r32, r33, r34, r35)
            goto L_0x0213
        L_0x0203:
            he5 r11 = defpackage.he5.b
            r15 = 0
            r17 = 2097135(0x1fffef, float:2.938712E-39)
            r10 = 0
            r12 = 0
            r13 = 0
            r14 = 0
            r16 = 0
            k91 r7 = defpackage.k91.a(r9, r10, r11, r12, r13, r14, r15, r16, r17)
        L_0x0213:
            boolean r0 = r6.b(r8, r7)
            if (r0 == 0) goto L_0x021c
            kotlin.Unit r0 = kotlin.Unit.INSTANCE
            return r0
        L_0x021c:
            r0 = r36
            r1 = r37
            r2 = r38
            r3 = r39
            r7 = 0
            goto L_0x0026
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.ti1.invokeSuspend(java.lang.Object):java.lang.Object");
    }
}
