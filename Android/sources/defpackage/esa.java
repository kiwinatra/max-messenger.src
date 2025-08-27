package defpackage;

import java.util.concurrent.ConcurrentHashMap;
import kotlin.Lazy;
import one.me.messages.list.loader.MessageModel;

/* renamed from: esa  reason: default package */
public final class esa {
    public final String a = esa.class.getName();
    public final Lazy b;
    public final Lazy c;
    public final Lazy d;
    public final Lazy e;

    public esa(Lazy lazy, Lazy lazy2, Lazy lazy3, Lazy lazy4) {
        this.b = lazy;
        this.c = lazy2;
        this.d = lazy3;
        this.e = lazy4;
    }

    public static boolean d(ge8 ge8, MessageModel messageModel, gsb gsb) {
        if (messageModel.B0 == oa9.ERROR) {
            return true;
        }
        xz xzVar = messageModel.X;
        if (xzVar.c || xzVar.b) {
            return true;
        }
        CharSequence c2 = gsb.c(ge8.a);
        return (c2 == null || c2.length() == 0) ^ true;
    }

    /* JADX WARNING: Removed duplicated region for block: B:12:0x0033  */
    /* JADX WARNING: Removed duplicated region for block: B:22:0x0072  */
    /* JADX WARNING: Removed duplicated region for block: B:23:0x0077  */
    /* JADX WARNING: Removed duplicated region for block: B:25:0x007a  */
    /* JADX WARNING: Removed duplicated region for block: B:8:0x0023  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final java.lang.Object a(defpackage.he8 r7, kotlin.coroutines.Continuation r8) {
        /*
            r6 = this;
            boolean r0 = r8 instanceof defpackage.bsa
            if (r0 == 0) goto L_0x0013
            r0 = r8
            bsa r0 = (defpackage.bsa) r0
            int r1 = r0.o
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L_0x0013
            int r1 = r1 - r2
            r0.o = r1
            goto L_0x0018
        L_0x0013:
            bsa r0 = new bsa
            r0.<init>(r6, r8)
        L_0x0018:
            java.lang.Object r8 = r0.b
            java.lang.Object r1 = kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED()
            int r2 = r0.o
            r3 = 1
            if (r2 == 0) goto L_0x0033
            if (r2 != r3) goto L_0x002b
            ge8 r6 = r0.a
            kotlin.ResultKt.throwOnFailure(r8)
            goto L_0x0067
        L_0x002b:
            java.lang.IllegalStateException r6 = new java.lang.IllegalStateException
            java.lang.String r7 = "call to 'resume' before 'invoke' with coroutine"
            r6.<init>(r7)
            throw r6
        L_0x0033:
            kotlin.ResultKt.throwOnFailure(r8)
            ge8 r7 = (defpackage.ge8) r7
            one.me.messages.list.loader.MessageModel r8 = r7.b()
            yc9 r8 = r8.E0
            yc9 r2 = defpackage.yc9.d
            boolean r8 = kotlin.jvm.internal.Intrinsics.areEqual((java.lang.Object) r8, (java.lang.Object) r2)
            if (r8 != 0) goto L_0x004d
            one.me.messages.list.loader.MessageModel r6 = r7.b()
            yc9 r6 = r6.E0
            return r6
        L_0x004d:
            kotlin.Lazy r6 = r6.e
            java.lang.Object r6 = r6.getValue()
            eu3 r6 = (defpackage.eu3) r6
            one.me.messages.list.loader.MessageModel r8 = r7.b()
            long r4 = r8.z0
            r0.a = r7
            r0.o = r3
            java.lang.Object r8 = r6.b(r4, r0)
            if (r8 != r1) goto L_0x0066
            return r1
        L_0x0066:
            r6 = r7
        L_0x0067:
            vk3 r8 = (defpackage.vk3) r8
            one.me.messages.list.loader.MessageModel r6 = r6.b()
            long r6 = r6.z0
            r0 = 0
            if (r8 == 0) goto L_0x0077
            java.lang.CharSequence r1 = r8.q()
            goto L_0x0078
        L_0x0077:
            r1 = r0
        L_0x0078:
            if (r8 == 0) goto L_0x0080
            kl0 r0 = defpackage.kl0.b
            java.lang.String r0 = r8.t(r0)
        L_0x0080:
            yc9 r8 = new yc9
            r8.<init>(r6, r1, r0)
            return r8
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.esa.a(he8, kotlin.coroutines.Continuation):java.lang.Object");
    }

    /* JADX WARNING: Removed duplicated region for block: B:12:0x0037  */
    /* JADX WARNING: Removed duplicated region for block: B:8:0x0023  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final java.lang.Object b(defpackage.ge8 r7, defpackage.rr2 r8, int r9, int r10, kotlin.coroutines.Continuation r11) {
        /*
            r6 = this;
            boolean r0 = r11 instanceof defpackage.csa
            if (r0 == 0) goto L_0x0013
            r0 = r11
            csa r0 = (defpackage.csa) r0
            int r1 = r0.w
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L_0x0013
            int r1 = r1 - r2
            r0.w = r1
            goto L_0x0018
        L_0x0013:
            csa r0 = new csa
            r0.<init>(r6, r11)
        L_0x0018:
            java.lang.Object r11 = r0.o
            java.lang.Object r1 = kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED()
            int r2 = r0.w
            r3 = 1
            if (r2 == 0) goto L_0x0037
            if (r2 != r3) goto L_0x002f
            int r10 = r0.c
            he8 r7 = r0.b
            esa r6 = r0.a
            kotlin.ResultKt.throwOnFailure(r11)
            goto L_0x0090
        L_0x002f:
            java.lang.IllegalStateException r6 = new java.lang.IllegalStateException
            java.lang.String r7 = "call to 'resume' before 'invoke' with coroutine"
            r6.<init>(r7)
            throw r6
        L_0x0037:
            kotlin.ResultKt.throwOnFailure(r11)
            rr2 r11 = defpackage.rr2.a
            r2 = 0
            if (r8 != r11) goto L_0x0041
            goto L_0x00b1
        L_0x0041:
            a32 r8 = r7.a
            boolean r8 = r8.K()
            if (r8 == 0) goto L_0x0061
            a32 r7 = r7.a
            boolean r8 = r7.Y()
            kotlin.Lazy r6 = r6.b
            java.lang.Object r6 = r6.getValue()
            bsd r6 = (defpackage.bsd) r6
            java.lang.String r7 = r7.r()
            r9 = 4
            android.text.Layout r2 = defpackage.bsd.b(r6, r7, r8, r9)
            goto L_0x00b1
        L_0x0061:
            boolean r8 = defpackage.ct0.b(r9)
            if (r8 == 0) goto L_0x00b1
            boolean r8 = defpackage.ct0.c(r9)
            if (r8 != 0) goto L_0x0073
            boolean r8 = defpackage.ct0.a(r9)
            if (r8 == 0) goto L_0x00b1
        L_0x0073:
            kotlin.Lazy r8 = r6.e
            java.lang.Object r8 = r8.getValue()
            eu3 r8 = (defpackage.eu3) r8
            one.me.messages.list.loader.MessageModel r9 = r7.b()
            long r4 = r9.z0
            r0.a = r6
            r0.b = r7
            r0.c = r10
            r0.w = r3
            java.lang.Object r11 = r8.b(r4, r0)
            if (r11 != r1) goto L_0x0090
            return r1
        L_0x0090:
            vk3 r11 = (defpackage.vk3) r11
            r8 = 0
            if (r11 == 0) goto L_0x009c
            boolean r9 = r11.z()
            if (r9 != r3) goto L_0x009c
            goto L_0x009d
        L_0x009c:
            r3 = r8
        L_0x009d:
            kotlin.Lazy r6 = r6.b
            java.lang.Object r6 = r6.getValue()
            bsd r6 = (defpackage.bsd) r6
            ge8 r7 = (defpackage.ge8) r7
            gsb r7 = r7.b
            java.lang.CharSequence r7 = r7.b()
            android.text.Layout r2 = r6.a(r7, r3, r10)
        L_0x00b1:
            return r2
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.esa.b(ge8, rr2, int, int, kotlin.coroutines.Continuation):java.lang.Object");
    }

    public final boolean c(ge8 ge8, MessageModel messageModel, MessageModel messageModel2) {
        if (messageModel2 == null || messageModel2.w0 != null) {
            return false;
        }
        int i = (messageModel.c > 0 ? 1 : (messageModel.c == 0 ? 0 : -1));
        long j = messageModel2.c;
        if ((i < 0 && j > 0) || (i > 0 && j < 0)) {
            return false;
        }
        ConcurrentHashMap concurrentHashMap = ((esb) this.d.getValue()).c;
        long j2 = messageModel2.a;
        gsb gsb = (gsb) concurrentHashMap.get(Long.valueOf(j2));
        if (gsb == null) {
            z68.p(this.a, wj6.j(j2, "PreProcessedData for message=MessageModel(", ") is null"));
            return false;
        }
        gsb gsb2 = ge8.b;
        gsb2.e();
        d84 d84 = gsb2.n;
        gsb.e();
        return !(j4b.U(d84, gsb.n) ^ true) && messageModel.z0 == messageModel2.z0 && !d(ge8, messageModel, ge8.b) && !d(ge8, messageModel2, gsb);
    }

    /* JADX WARNING: type inference failed for: r6v3, types: [he8] */
    /* JADX WARNING: Multi-variable type inference failed */
    /* JADX WARNING: Removed duplicated region for block: B:103:0x0206  */
    /* JADX WARNING: Removed duplicated region for block: B:104:0x021b  */
    /* JADX WARNING: Removed duplicated region for block: B:107:0x022e  */
    /* JADX WARNING: Removed duplicated region for block: B:15:0x0064  */
    /* JADX WARNING: Removed duplicated region for block: B:183:0x032f  */
    /* JADX WARNING: Removed duplicated region for block: B:184:0x0332  */
    /* JADX WARNING: Removed duplicated region for block: B:187:0x0354 A[RETURN] */
    /* JADX WARNING: Removed duplicated region for block: B:188:0x0355  */
    /* JADX WARNING: Removed duplicated region for block: B:195:0x038a  */
    /* JADX WARNING: Removed duplicated region for block: B:201:0x039f  */
    /* JADX WARNING: Removed duplicated region for block: B:204:0x03a3 A[RETURN] */
    /* JADX WARNING: Removed duplicated region for block: B:205:0x03a4  */
    /* JADX WARNING: Removed duplicated region for block: B:9:0x002c  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final java.lang.Object e(defpackage.ge8 r21, kotlin.coroutines.Continuation r22) {
        /*
            r20 = this;
            r6 = r20
            r7 = r21
            r0 = r22
            boolean r1 = r0 instanceof defpackage.dsa
            if (r1 == 0) goto L_0x001a
            r1 = r0
            dsa r1 = (defpackage.dsa) r1
            int r2 = r1.X
            r3 = -2147483648(0xffffffff80000000, float:-0.0)
            r4 = r2 & r3
            if (r4 == 0) goto L_0x001a
            int r2 = r2 - r3
            r1.X = r2
        L_0x0018:
            r8 = r1
            goto L_0x0020
        L_0x001a:
            dsa r1 = new dsa
            r1.<init>(r6, r0)
            goto L_0x0018
        L_0x0020:
            java.lang.Object r0 = r8.y
            java.lang.Object r9 = kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED()
            int r1 = r8.X
            r2 = 1
            r12 = 2
            if (r1 == 0) goto L_0x0064
            if (r1 == r2) goto L_0x0045
            if (r1 != r12) goto L_0x003d
            java.lang.Object r1 = r8.b
            one.me.messages.list.loader.MessageModel r1 = (one.me.messages.list.loader.MessageModel) r1
            java.lang.Object r2 = r8.a
            one.me.messages.list.loader.MessageModel r2 = (one.me.messages.list.loader.MessageModel) r2
            kotlin.ResultKt.throwOnFailure(r0)
            goto L_0x03a5
        L_0x003d:
            java.lang.IllegalStateException r0 = new java.lang.IllegalStateException
            java.lang.String r1 = "call to 'resume' before 'invoke' with coroutine"
            r0.<init>(r1)
            throw r0
        L_0x0045:
            int r1 = r8.x
            one.me.messages.list.loader.MessageModel r2 = r8.w
            android.text.Layout r3 = r8.v
            one.me.messages.list.loader.MessageModel r4 = r8.o
            one.me.messages.list.loader.MessageModel r5 = r8.c
            java.lang.Object r6 = r8.b
            he8 r6 = (defpackage.he8) r6
            java.lang.Object r7 = r8.a
            esa r7 = (defpackage.esa) r7
            kotlin.ResultKt.throwOnFailure(r0)
            r10 = r1
            r1 = r4
            r14 = r5
            r19 = r7
            r7 = r6
            r6 = r19
            goto L_0x0358
        L_0x0064:
            kotlin.ResultKt.throwOnFailure(r0)
            one.me.messages.list.loader.MessageModel r0 = r21.b()
            boolean r0 = r0.A0
            asa r1 = new asa
            r3 = 0
            r1.<init>(r6, r7, r3)
            kotlin.LazyThreadSafetyMode r3 = kotlin.LazyThreadSafetyMode.NONE
            kotlin.Lazy r1 = kotlin.LazyKt.lazy((kotlin.LazyThreadSafetyMode) r3, r1)
            asa r4 = new asa
            r5 = 1
            r4.<init>(r6, r7, r5)
            kotlin.Lazy r3 = kotlin.LazyKt.lazy((kotlin.LazyThreadSafetyMode) r3, r4)
            a32 r4 = r7.a
            boolean r5 = r4.K()
            r13 = 0
            if (r5 == 0) goto L_0x0091
            r0 = 201326592(0xc000000, float:9.8607613E-32)
        L_0x008e:
            r10 = r0
            goto L_0x015d
        L_0x0091:
            java.util.List r5 = r21.c()
            int r5 = r5.size()
            r14 = 134217728(0x8000000, float:3.85186E-34)
            if (r5 > r2) goto L_0x00a5
            if (r0 == 0) goto L_0x00a2
            r0 = 67108864(0x4000000, float:1.5046328E-36)
            goto L_0x00a3
        L_0x00a2:
            r0 = r13
        L_0x00a3:
            r0 = r0 | r14
            goto L_0x008e
        L_0x00a5:
            int r5 = r7.c
            r15 = 268435456(0x10000000, float:2.5243549E-29)
            if (r5 != 0) goto L_0x00d4
            java.util.List r1 = r21.c()
            java.lang.Object r1 = r1.get(r13)
            one.me.messages.list.loader.MessageModel r1 = (one.me.messages.list.loader.MessageModel) r1
            java.util.List r3 = r21.c()
            java.lang.Object r3 = r3.get(r2)
            one.me.messages.list.loader.MessageModel r3 = (one.me.messages.list.loader.MessageModel) r3
            boolean r1 = r6.c(r7, r1, r3)
            if (r1 == 0) goto L_0x00cd
            if (r0 == 0) goto L_0x00ca
            r0 = 67108864(0x4000000, float:1.5046328E-36)
            goto L_0x00cb
        L_0x00ca:
            r0 = r13
        L_0x00cb:
            r0 = r0 | r15
            goto L_0x008e
        L_0x00cd:
            if (r0 == 0) goto L_0x00d2
            r0 = 67108864(0x4000000, float:1.5046328E-36)
            goto L_0x00a3
        L_0x00d2:
            r0 = r13
            goto L_0x00a3
        L_0x00d4:
            java.util.List r16 = r21.c()
            int r10 = kotlin.collections.CollectionsKt.getLastIndex(r16)
            r16 = 1073741824(0x40000000, float:2.0)
            if (r5 != r10) goto L_0x010b
            java.util.List r1 = r21.c()
            java.lang.Object r1 = r1.get(r5)
            one.me.messages.list.loader.MessageModel r1 = (one.me.messages.list.loader.MessageModel) r1
            java.util.List r3 = r21.c()
            int r5 = r5 - r2
            java.lang.Object r3 = r3.get(r5)
            one.me.messages.list.loader.MessageModel r3 = (one.me.messages.list.loader.MessageModel) r3
            boolean r1 = r6.c(r7, r1, r3)
            if (r1 == 0) goto L_0x0104
            if (r0 == 0) goto L_0x0100
            r0 = 67108864(0x4000000, float:1.5046328E-36)
            goto L_0x0101
        L_0x0100:
            r0 = r13
        L_0x0101:
            r0 = r0 | r16
            goto L_0x008e
        L_0x0104:
            if (r0 == 0) goto L_0x0109
            r0 = 67108864(0x4000000, float:1.5046328E-36)
            goto L_0x00a3
        L_0x0109:
            r0 = r13
            goto L_0x00a3
        L_0x010b:
            java.lang.Object r5 = r1.getValue()
            java.lang.Boolean r5 = (java.lang.Boolean) r5
            boolean r5 = r5.booleanValue()
            if (r5 != 0) goto L_0x012c
            java.lang.Object r5 = r3.getValue()
            java.lang.Boolean r5 = (java.lang.Boolean) r5
            boolean r5 = r5.booleanValue()
            if (r5 != 0) goto L_0x012c
            if (r0 == 0) goto L_0x0129
            r0 = 67108864(0x4000000, float:1.5046328E-36)
            goto L_0x00a3
        L_0x0129:
            r0 = r13
            goto L_0x00a3
        L_0x012c:
            java.lang.Object r1 = r1.getValue()
            java.lang.Boolean r1 = (java.lang.Boolean) r1
            boolean r1 = r1.booleanValue()
            if (r1 != 0) goto L_0x013f
            if (r0 == 0) goto L_0x013d
            r0 = 67108864(0x4000000, float:1.5046328E-36)
            goto L_0x00cb
        L_0x013d:
            r0 = r13
            goto L_0x00cb
        L_0x013f:
            java.lang.Object r1 = r3.getValue()
            java.lang.Boolean r1 = (java.lang.Boolean) r1
            boolean r1 = r1.booleanValue()
            if (r1 == 0) goto L_0x0156
            if (r0 == 0) goto L_0x0150
            r0 = 67108864(0x4000000, float:1.5046328E-36)
            goto L_0x0151
        L_0x0150:
            r0 = r13
        L_0x0151:
            r1 = 536870912(0x20000000, float:1.0842022E-19)
            r0 = r0 | r1
            goto L_0x008e
        L_0x0156:
            if (r0 == 0) goto L_0x015b
            r0 = 67108864(0x4000000, float:1.5046328E-36)
            goto L_0x0101
        L_0x015b:
            r0 = r13
            goto L_0x0101
        L_0x015d:
            one.me.messages.list.loader.MessageModel r14 = r21.b()
            rr2 r0 = r14.x0
            one.me.messages.list.loader.MessageModel r1 = r21.b()
            long r11 = r1.z0
            boolean r1 = r4.E()
            if (r1 != 0) goto L_0x0171
        L_0x016f:
            r1 = 0
            goto L_0x0188
        L_0x0171:
            boolean r1 = r4.G(r11)
            if (r1 != 0) goto L_0x0178
            goto L_0x016f
        L_0x0178:
            m72 r1 = r4.b
            java.util.Map r1 = r1.R
            java.lang.Long r3 = java.lang.Long.valueOf(r11)
            java.lang.Object r1 = r1.get(r3)
            v62 r1 = (defpackage.v62) r1
            java.lang.String r1 = r1.d
        L_0x0188:
            rr2 r3 = defpackage.rr2.a
            gsb r5 = r7.b
            if (r0 == r3) goto L_0x0202
            one.me.messages.list.loader.MessageModel r0 = r21.b()
            boolean r0 = r0.A0
            if (r0 == 0) goto L_0x0202
            r17 = 0
            int r0 = (r11 > r17 ? 1 : (r11 == r17 ? 0 : -1))
            if (r0 == 0) goto L_0x0202
            boolean r0 = r4.K()
            if (r0 != 0) goto L_0x0202
            boolean r0 = defpackage.ct0.b(r10)
            if (r0 == 0) goto L_0x0202
            boolean r0 = defpackage.ct0.c(r10)
            if (r0 != 0) goto L_0x01b4
            boolean r0 = defpackage.ct0.a(r10)
            if (r0 == 0) goto L_0x0202
        L_0x01b4:
            r0 = 6
            kotlin.Lazy r3 = r6.c
            if (r1 == 0) goto L_0x01cc
            boolean r17 = kotlin.text.StringsKt.isBlank(r1)
            if (r17 == 0) goto L_0x01c0
            goto L_0x01cc
        L_0x01c0:
            java.lang.Object r3 = r3.getValue()
            bsd r3 = (defpackage.bsd) r3
            android.text.Layout r0 = defpackage.bsd.b(r3, r1, r13, r0)
        L_0x01ca:
            r11 = r0
            goto L_0x0203
        L_0x01cc:
            boolean r1 = r4.Z(r11)
            if (r1 == 0) goto L_0x01e7
            java.lang.Object r1 = r3.getValue()
            bsd r1 = (defpackage.bsd) r1
            yva r3 = r5.a
            android.content.Context r3 = r3.a
            int r11 = defpackage.lxa.l2
            java.lang.String r3 = r3.getString(r11)
            android.text.Layout r0 = defpackage.bsd.b(r1, r3, r13, r0)
            goto L_0x01ca
        L_0x01e7:
            boolean r1 = r4.G(r11)
            if (r1 == 0) goto L_0x0202
            java.lang.Object r1 = r3.getValue()
            bsd r1 = (defpackage.bsd) r1
            yva r3 = r5.a
            android.content.Context r3 = r3.a
            int r11 = defpackage.lxa.X1
            java.lang.String r3 = r3.getString(r11)
            android.text.Layout r0 = defpackage.bsd.b(r1, r3, r13, r0)
            goto L_0x01ca
        L_0x0202:
            r11 = 0
        L_0x0203:
            r0 = 4
            if (r11 == 0) goto L_0x021b
            int r1 = r11.getWidth()
            float r3 = (float) r0
            android.content.res.Resources r12 = defpackage.vo4.c()
            android.util.DisplayMetrics r12 = r12.getDisplayMetrics()
            float r12 = r12.density
            int r1 = defpackage.g63.b(r3, r12, r1)
            r12 = r1
            goto L_0x021c
        L_0x021b:
            r12 = r13
        L_0x021c:
            one.me.messages.list.loader.MessageModel r1 = r21.b()
            xz r1 = r1.X
            o00 r1 = r1.d
            one.me.messages.list.loader.MessageModel r3 = r21.b()
            zc9 r3 = r3.w0
            if (r3 == 0) goto L_0x022e
            goto L_0x0327
        L_0x022e:
            java.lang.CharSequence r3 = r5.c(r4)
            if (r3 == 0) goto L_0x023d
            int r3 = r3.length()
            if (r3 != 0) goto L_0x023b
            goto L_0x023d
        L_0x023b:
            r3 = r13
            goto L_0x023e
        L_0x023d:
            r3 = r2
        L_0x023e:
            r3 = r3 ^ r2
            if (r3 == 0) goto L_0x0257
            one.me.messages.list.loader.MessageModel r3 = r21.b()
            xz r3 = r3.X
            o00 r3 = r3.d
            if (r3 == 0) goto L_0x024d
            r3 = r2
            goto L_0x024e
        L_0x024d:
            r3 = r13
        L_0x024e:
            r3 = r3 ^ r2
            if (r3 == 0) goto L_0x0257
            r0 = 4096(0x1000, float:5.74E-42)
        L_0x0253:
            r13 = r0 | r10
            goto L_0x0327
        L_0x0257:
            boolean r3 = r1 instanceof defpackage.i01
            if (r3 == 0) goto L_0x025e
            r0 = 256(0x100, float:3.59E-43)
            goto L_0x0253
        L_0x025e:
            boolean r3 = r1 instanceof defpackage.vp6
            if (r3 == 0) goto L_0x0265
            r0 = 64
            goto L_0x0253
        L_0x0265:
            one.me.messages.list.loader.MessageModel r3 = r21.b()
            java.lang.CharSequence r3 = r3.o
            int r3 = r3.length()
            if (r3 <= 0) goto L_0x0284
            one.me.messages.list.loader.MessageModel r3 = r21.b()
            xz r3 = r3.X
            o00 r3 = r3.d
            if (r3 == 0) goto L_0x027c
            r13 = r2
        L_0x027c:
            r3 = r13 ^ 1
            if (r3 == 0) goto L_0x0284
            r13 = r2 | r10
            goto L_0x0327
        L_0x0284:
            one.me.messages.list.loader.MessageModel r3 = r21.b()
            xz r3 = r3.X
            boolean r3 = r3.a
            if (r3 == 0) goto L_0x02ad
            boolean r3 = r1 instanceof defpackage.ybe
            if (r3 == 0) goto L_0x02ad
            r3 = 2
            r0 = r3 | r10
            one.me.messages.list.loader.MessageModel r1 = r21.b()
            java.lang.CharSequence r1 = r1.o
            int r1 = r1.length()
            if (r1 <= 0) goto L_0x0333
            one.me.messages.list.loader.MessageModel r1 = r21.b()
            jf9 r1 = r1.Z
            if (r1 == 0) goto L_0x0333
            r0 = r10 | 3
            goto L_0x0333
        L_0x02ad:
            boolean r3 = r1 instanceof defpackage.ede
            if (r3 == 0) goto L_0x02ca
            r0 = r0 | r10
            one.me.messages.list.loader.MessageModel r1 = r21.b()
            java.lang.CharSequence r1 = r1.o
            int r1 = r1.length()
            if (r1 <= 0) goto L_0x0333
            one.me.messages.list.loader.MessageModel r1 = r21.b()
            jf9 r1 = r1.Z
            if (r1 == 0) goto L_0x0333
            r0 = r10 | 5
            goto L_0x0333
        L_0x02ca:
            boolean r0 = r1 instanceof defpackage.o43
            if (r0 == 0) goto L_0x02e8
            r0 = 8192(0x2000, float:1.14794E-41)
            r0 = r0 | r10
            one.me.messages.list.loader.MessageModel r1 = r21.b()
            java.lang.CharSequence r1 = r1.o
            int r1 = r1.length()
            if (r1 <= 0) goto L_0x0333
            one.me.messages.list.loader.MessageModel r1 = r21.b()
            jf9 r1 = r1.Z
            if (r1 == 0) goto L_0x0333
            r0 = r10 | 8193(0x2001, float:1.1481E-41)
            goto L_0x0333
        L_0x02e8:
            boolean r0 = r1 instanceof defpackage.toe
            if (r0 == 0) goto L_0x0303
            toe r1 = (defpackage.toe) r1
            gpe r0 = r1.a
            java.lang.String r0 = r0.v
            if (r0 == 0) goto L_0x02ff
            int r0 = r0.length()
            if (r0 != 0) goto L_0x02fb
            goto L_0x02ff
        L_0x02fb:
            r0 = 16384(0x4000, float:2.2959E-41)
            goto L_0x0253
        L_0x02ff:
            r0 = 128(0x80, float:1.794E-43)
            goto L_0x0253
        L_0x0303:
            boolean r0 = r1 instanceof defpackage.dl3
            if (r0 == 0) goto L_0x030b
            r0 = 16
            goto L_0x0253
        L_0x030b:
            boolean r0 = r1 instanceof defpackage.w4e
            if (r0 == 0) goto L_0x0313
            r0 = 512(0x200, float:7.175E-43)
            goto L_0x0253
        L_0x0313:
            boolean r0 = r1 instanceof defpackage.l50
            if (r0 == 0) goto L_0x031b
            r0 = 8
            goto L_0x0253
        L_0x031b:
            boolean r0 = r1 instanceof defpackage.bl5
            if (r0 == 0) goto L_0x0323
            r0 = 32
            goto L_0x0253
        L_0x0323:
            r0 = 33554432(0x2000000, float:9.403955E-38)
            goto L_0x0253
        L_0x0327:
            one.me.messages.list.loader.MessageModel r0 = r21.b()
            nc9 r0 = r0.v0
            if (r0 == 0) goto L_0x0332
            r0 = r13 | 1024(0x400, float:1.435E-42)
            goto L_0x0333
        L_0x0332:
            r0 = r13
        L_0x0333:
            r14.F0 = r0
            r8.a = r6
            r8.b = r7
            r8.c = r14
            r8.o = r14
            r8.v = r11
            r8.w = r14
            r8.x = r10
            r8.X = r2
            rr2 r2 = r14.x0
            r0 = r20
            r1 = r21
            r3 = r10
            r4 = r12
            r5 = r8
            java.lang.Object r0 = r0.b(r1, r2, r3, r4, r5)
            if (r0 != r9) goto L_0x0355
            return r9
        L_0x0355:
            r3 = r11
            r1 = r14
            r2 = r1
        L_0x0358:
            android.text.Layout r0 = (android.text.Layout) r0
            r2.C0 = r0
            r1.D0 = r3
            r8.a = r14
            r8.b = r1
            r0 = 0
            r8.c = r0
            r8.o = r0
            r8.v = r0
            r8.w = r0
            r2 = 2
            r8.X = r2
            r6.getClass()
            r2 = r7
            ge8 r2 = (defpackage.ge8) r2
            a32 r3 = r2.a
            boolean r3 = r3.N()
            if (r3 != 0) goto L_0x039f
            a32 r2 = r2.a
            boolean r2 = r2.K()
            if (r2 != 0) goto L_0x039f
            r2 = 67108864(0x4000000, float:1.5046328E-36)
            r2 = r2 & r10
            if (r2 != 0) goto L_0x038a
            goto L_0x039f
        L_0x038a:
            boolean r0 = defpackage.ct0.a(r10)
            if (r0 != 0) goto L_0x039a
            boolean r0 = defpackage.ct0.c(r10)
            if (r0 == 0) goto L_0x0397
            goto L_0x039a
        L_0x0397:
            yc9 r11 = defpackage.yc9.d
            goto L_0x03a0
        L_0x039a:
            java.lang.Object r0 = r6.a(r7, r8)
            goto L_0x03a1
        L_0x039f:
            r11 = r0
        L_0x03a0:
            r0 = r11
        L_0x03a1:
            if (r0 != r9) goto L_0x03a4
            return r9
        L_0x03a4:
            r2 = r14
        L_0x03a5:
            yc9 r0 = (defpackage.yc9) r0
            r1.E0 = r0
            return r2
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.esa.e(ge8, kotlin.coroutines.Continuation):java.lang.Object");
    }
}
