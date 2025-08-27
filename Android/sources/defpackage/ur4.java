package defpackage;

import kotlin.reflect.KProperty;

/* renamed from: ur4  reason: default package */
public final class ur4 {
    public static final /* synthetic */ KProperty[] h;
    public static final String i;
    public final hs7 a;
    public final hs7 b;
    public final hs7 c;
    public final hs7 d;
    public final hs7 e;
    public final hs7 f;
    public final hs7 g;

    static {
        Class<ur4> cls = ur4.class;
        h = new KProperty[]{wj6.p(cls, "chatController", "getChatController()Lru/ok/tamtam/chats/ChatController;", 0), wj6.p(cls, "contactController", "getContactController()Lru/ok/tamtam/contacts/ContactController;", 0), wj6.p(cls, "draftSerializer", "getDraftSerializer()Lru/ok/tamtam/draft/DraftSerializer;", 0), wj6.p(cls, "messageController", "getMessageController()Lru/ok/tamtam/messages/MessageController;", 0), wj6.p(cls, "api", "getApi()Lru/ok/tamtam/api/Api;", 0), wj6.p(cls, "tamTamObservables", "getTamTamObservables()Lru/ok/tamtam/rx/TamTamObservables;", 0), wj6.p(cls, "ioNetworkScheduler", "getIoNetworkScheduler()Lio/reactivex/rxjava3/core/Scheduler;", 0)};
        i = cls.getName();
    }

    public ur4(hs7 hs7, hs7 hs72, hs7 hs73, hs7 hs74, hs7 hs75, hs7 hs76, hs7 hs77) {
        this.a = hs7;
        this.b = hs72;
        this.c = hs73;
        this.d = hs74;
        this.e = hs75;
        this.f = hs76;
        this.g = hs77;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:40:0x00e0, code lost:
        if (((defpackage.fa9) r4.get()).f(r6, r8.longValue()) == false) goto L_0x00e2;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:41:0x00e2, code lost:
        r0 = r8;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:45:0x00f8, code lost:
        if (((defpackage.fa9) r4.get()).f(r6, r8.longValue()) == false) goto L_0x00e2;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void a(java.lang.Long r13, java.lang.Long r14, defpackage.qtd r15) {
        /*
            r12 = this;
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            java.lang.String r1 = "execute: chatId="
            r0.<init>(r1)
            r0.append(r13)
            java.lang.String r1 = ", contactId="
            r0.append(r1)
            r0.append(r14)
            java.lang.String r1 = ", serverDraft="
            r0.append(r1)
            r0.append(r15)
            java.lang.String r0 = r0.toString()
            java.lang.String r1 = i
            defpackage.z68.c(r1, r0, new java.lang.Object[0])
            r0 = 0
            r2 = 1
            kotlin.reflect.KProperty[] r3 = h
            r4 = 0
            if (r13 == 0) goto L_0x0040
            long r6 = r13.longValue()
            int r6 = (r6 > r4 ? 1 : (r6 == r4 ? 0 : -1))
            if (r6 == 0) goto L_0x0040
            r62 r14 = r12.b()
            long r6 = r13.longValue()
            a32 r13 = r14.D(r6)
            goto L_0x0093
        L_0x0040:
            if (r14 == 0) goto L_0x0092
            long r6 = r14.longValue()
            int r13 = (r6 > r4 ? 1 : (r6 == r4 ? 0 : -1))
            if (r13 == 0) goto L_0x0092
            r13 = r3[r2]
            hs7 r13 = r12.b
            java.lang.Object r13 = r13.get()
            km3 r13 = (defpackage.km3) r13
            long r6 = r14.longValue()
            r8 = 0
            vk3 r13 = r13.p(r6, r8)
            if (r13 == 0) goto L_0x006a
            boolean r13 = r13.w()
            if (r13 == 0) goto L_0x006a
            java.lang.String r13 = "contact is blocked"
            defpackage.z68.c(r1, r13, new java.lang.Object[0])
        L_0x006a:
            r62 r13 = r12.b()
            long r6 = r14.longValue()
            a32 r13 = r13.K(r6)
            if (r13 == 0) goto L_0x007e
            boolean r6 = r13.E()
            if (r6 != 0) goto L_0x0093
        L_0x007e:
            java.lang.String r13 = "No dialog on device. Create it"
            defpackage.z68.c(r1, r13, new java.lang.Object[0])
            r62 r13 = r12.b()
            java.util.List r14 = kotlin.collections.CollectionsKt.listOf(r14)
            l72 r6 = defpackage.l72.a
            a32 r13 = r13.b(r6, r14, r0, r0)
            goto L_0x0093
        L_0x0092:
            r13 = r0
        L_0x0093:
            if (r13 != 0) goto L_0x009b
            java.lang.String r12 = "Chat is null. Ignore"
            defpackage.z68.p(r1, r12)
            return
        L_0x009b:
            m72 r14 = r13.b
            pt4 r6 = r14.f0
            if (r6 == 0) goto L_0x00ab
            java.lang.Long r6 = r6.a()
            if (r6 == 0) goto L_0x00ab
            long r4 = r6.longValue()
        L_0x00ab:
            long r6 = r15.g
            int r4 = (r4 > r6 ? 1 : (r4 == r6 ? 0 : -1))
            if (r4 <= 0) goto L_0x00b7
            java.lang.String r12 = "We already have this draft. Ignore"
            defpackage.z68.p(r1, r12)
            return
        L_0x00b7:
            long r4 = r14.g0
            int r4 = (r4 > r6 ? 1 : (r4 == r6 ? 0 : -1))
            if (r4 != 0) goto L_0x00c7
            pt4 r4 = r14.f0
            if (r4 != 0) goto L_0x00c7
            java.lang.String r12 = "draft was discarded, ignore it!"
            defpackage.z68.p(r1, r12)
            return
        L_0x00c7:
            hs7 r4 = r12.d
            r5 = 3
            long r6 = r13.a
            java.lang.Long r8 = r15.f
            if (r8 == 0) goto L_0x00e4
            r9 = r3[r5]
            java.lang.Object r9 = r4.get()
            fa9 r9 = (defpackage.fa9) r9
            long r10 = r8.longValue()
            boolean r9 = r9.f(r6, r10)
            if (r9 != 0) goto L_0x00e4
        L_0x00e2:
            r0 = r8
            goto L_0x00fb
        L_0x00e4:
            java.lang.Long r8 = r15.e
            if (r8 == 0) goto L_0x00fb
            r5 = r3[r5]
            java.lang.Object r4 = r4.get()
            fa9 r4 = (defpackage.fa9) r4
            long r9 = r8.longValue()
            boolean r4 = r4.f(r6, r9)
            if (r4 != 0) goto L_0x00fb
            goto L_0x00e2
        L_0x00fb:
            if (r0 != 0) goto L_0x0101
            r12.c(r13, r15)
            return
        L_0x0101:
            java.lang.StringBuilder r4 = new java.lang.StringBuilder
            java.lang.String r5 = "Don't have message "
            r4.<init>(r5)
            r4.append(r0)
            java.lang.String r5 = ". Request it"
            r4.append(r5)
            java.lang.String r4 = r4.toString()
            defpackage.z68.p(r1, r4)
            r1 = 4
            r1 = r3[r1]
            hs7 r1 = r12.e
            java.lang.Object r1 = r1.get()
            rl r1 = (defpackage.rl) r1
            np2 r4 = new np2
            long r5 = r14.a
            java.util.List r14 = kotlin.collections.CollectionsKt.listOf(r0)
            r4.<init>((long) r5, (java.util.List) r14)
            r14 = 6
            r14 = r3[r14]
            hs7 r14 = r12.g
            java.lang.Object r14 = r14.get()
            lfd r14 = (defpackage.lfd) r14
            jna r1 = (defpackage.jna) r1
            fce r14 = r1.U(r4, r14)
            ch2 r0 = new ch2
            java.lang.Class<fu> r1 = defpackage.fu.class
            r4 = 12
            r0.<init>(r4, r1)
            wbe r14 = r14.i(r0)
            r0 = 5
            r0 = r3[r0]
            hs7 r0 = r12.f
            java.lang.Object r0 = r0.get()
            gcf r0 = (defpackage.gcf) r0
            r0.getClass()
            ecf r1 = new ecf
            r3 = 0
            r1.<init>(r0, r2, r3)
            dx5 r14 = r14.k(r1)
            o5h r0 = new o5h
            r0.<init>(r12, r13, r15)
            w28 r1 = new w28
            r2 = 8
            r1.<init>((java.lang.Object) r12, (java.lang.Object) r13, (java.lang.Object) r15, (int) r2)
            ao1 r12 = new ao1
            r13 = 3
            r12.<init>(r13, r0, r1)
            r14.l(r12)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.ur4.a(java.lang.Long, java.lang.Long, qtd):void");
    }

    public final r62 b() {
        KProperty kProperty = h[0];
        return (r62) this.a.get();
    }

    public final void c(a32 a32, qtd qtd) {
        z68.c(i, "Save server draft", new Object[0]);
        KProperty kProperty = h[2];
        b().n(a32.a, qtd.g, ((xt4) this.c.get()).d(a32.a, qtd));
    }
}
