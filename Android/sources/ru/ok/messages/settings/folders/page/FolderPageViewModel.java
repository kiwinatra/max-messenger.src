package ru.ok.messages.settings.folders.page;

import java.util.concurrent.CancellationException;
import kotlin.Metadata;
import kotlin.coroutines.Continuation;
import kotlin.jvm.internal.SourceDebugExtension;

@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\u0018\u00002\u00020\u0001:\u0004\u0002\u0003\u0004\u0005¨\u0006\u0006"}, d2 = {"Lru/ok/messages/settings/folders/page/FolderPageViewModel;", "Lyag;", "t36", "g36", "f36", "z26", "tamtam-app_release"}, k = 1, mv = {2, 0, 0})
@SourceDebugExtension({"SMAP\nFolderPageViewModel.kt\nKotlin\n*S Kotlin\n*F\n+ 1 FolderPageViewModel.kt\nru/ok/messages/settings/folders/page/FolderPageViewModel\n+ 2 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,495:1\n1#2:496\n*E\n"})
public final class FolderPageViewModel extends yag {
    public final z26 c;
    public final j16 d;
    public final yva e;
    public final rtb f;
    public final jua g;
    public final u82 h;
    public final nd i;
    public final gaf j;
    public final xme k;
    public final bs5 l;
    public final xme m;
    public final etc n;
    public boolean o;
    public volatile z26 p;
    public volatile pm7 q;
    public final o85 r = new o85(a36.a);

    public FolderPageViewModel(z26 z26, j16 j16, yva yva, rtb rtb, jua jua, u82 u82, nd ndVar, gaf gaf) {
        this.c = z26;
        this.d = j16;
        this.e = yva;
        this.f = rtb;
        this.g = jua;
        this.h = u82;
        this.i = ndVar;
        this.j = gaf;
        xme a = f6e.a((Object) null);
        this.k = a;
        this.l = bs0.w(new on2(new etc(a), 28));
        xme a2 = f6e.a((Object) null);
        this.m = a2;
        this.n = new etc(a2);
        this.p = z26;
        pm7 pm7 = this.q;
        if (pm7 != null) {
            pm7.b((CancellationException) null);
        }
        this.q = bs0.K(bs0.F(new ps5(((ia2) u82).j(), new h36(z26, (Continuation) null, this), 5), ((osa) gaf).a()), b0h.C(this));
    }

    /* JADX WARNING: Removed duplicated region for block: B:14:0x003f  */
    /* JADX WARNING: Removed duplicated region for block: B:31:0x0097  */
    /* JADX WARNING: Removed duplicated region for block: B:36:0x00be  */
    /* JADX WARNING: Removed duplicated region for block: B:8:0x0028  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static final java.lang.Object j(ru.ok.messages.settings.folders.page.FolderPageViewModel r8, java.util.List r9, kotlin.coroutines.Continuation r10) {
        /*
            r8.getClass()
            boolean r0 = r10 instanceof defpackage.s36
            if (r0 == 0) goto L_0x0016
            r0 = r10
            s36 r0 = (defpackage.s36) r0
            int r1 = r0.o
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L_0x0016
            int r1 = r1 - r2
            r0.o = r1
            goto L_0x001b
        L_0x0016:
            s36 r0 = new s36
            r0.<init>(r8, r10)
        L_0x001b:
            java.lang.Object r10 = r0.b
            java.lang.Object r1 = kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED()
            int r2 = r0.o
            r3 = 0
            r4 = 2
            r5 = 1
            if (r2 == 0) goto L_0x003f
            if (r2 == r5) goto L_0x0039
            if (r2 != r4) goto L_0x0031
            kotlin.ResultKt.throwOnFailure(r10)
            goto L_0x00bb
        L_0x0031:
            java.lang.IllegalStateException r8 = new java.lang.IllegalStateException
            java.lang.String r9 = "call to 'resume' before 'invoke' with coroutine"
            r8.<init>(r9)
            throw r8
        L_0x0039:
            ru.ok.messages.settings.folders.page.FolderPageViewModel r8 = r0.a
            kotlin.ResultKt.throwOnFailure(r10)
            goto L_0x0092
        L_0x003f:
            kotlin.ResultKt.throwOnFailure(r10)
            z26 r10 = r8.p
            boolean r2 = r10 instanceof defpackage.z26
            if (r2 != 0) goto L_0x004c
            kotlin.Unit r1 = kotlin.Unit.INSTANCE
            goto L_0x00c6
        L_0x004c:
            java.lang.Iterable r9 = (java.lang.Iterable) r9
            java.util.Iterator r9 = r9.iterator()
        L_0x0052:
            boolean r2 = r9.hasNext()
            if (r2 == 0) goto L_0x006a
            java.lang.Object r2 = r9.next()
            r6 = r2
            zx5 r6 = (defpackage.zx5) r6
            java.lang.String r6 = r6.a
            java.lang.String r7 = r10.a
            boolean r6 = kotlin.jvm.internal.Intrinsics.areEqual((java.lang.Object) r6, (java.lang.Object) r7)
            if (r6 == 0) goto L_0x0052
            goto L_0x006b
        L_0x006a:
            r2 = r3
        L_0x006b:
            zx5 r2 = (defpackage.zx5) r2
            if (r2 != 0) goto L_0x0095
            java.lang.String r9 = r10.a
            java.lang.String r10 = "all.chat.folder"
            boolean r9 = kotlin.jvm.internal.Intrinsics.areEqual((java.lang.Object) r9, (java.lang.Object) r10)
            if (r9 == 0) goto L_0x0095
            u82 r9 = r8.h
            r0.a = r8
            r0.o = r5
            ia2 r9 = (defpackage.ia2) r9
            r9.getClass()
            g92 r10 = new g92
            r10.<init>(r9, r3)
            kotlin.coroutines.CoroutineContext r9 = r9.x
            java.lang.Object r10 = defpackage.ev0.I(r9, r10, r0)
            if (r10 != r1) goto L_0x0092
            goto L_0x00c6
        L_0x0092:
            r2 = r10
            zx5 r2 = (defpackage.zx5) r2
        L_0x0095:
            if (r2 == 0) goto L_0x00be
            r8.getClass()
            r0.a = r3
            r0.o = r4
            gaf r9 = r8.j
            osa r9 = (defpackage.osa) r9
            q04 r9 = r9.a()
            o36 r10 = new o36
            r10.<init>(r2, r8, r3)
            java.lang.Object r8 = defpackage.ev0.I(r9, r10, r0)
            java.lang.Object r9 = kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED()
            if (r8 != r9) goto L_0x00b6
            goto L_0x00b8
        L_0x00b6:
            kotlin.Unit r8 = kotlin.Unit.INSTANCE
        L_0x00b8:
            if (r8 != r1) goto L_0x00bb
            goto L_0x00c6
        L_0x00bb:
            kotlin.Unit r1 = kotlin.Unit.INSTANCE
            goto L_0x00c6
        L_0x00be:
            xme r9 = r8.m
            o85 r8 = r8.r
            r9.setValue(r8)
            goto L_0x00bb
        L_0x00c6:
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: ru.ok.messages.settings.folders.page.FolderPageViewModel.j(ru.ok.messages.settings.folders.page.FolderPageViewModel, java.util.List, kotlin.coroutines.Continuation):java.lang.Object");
    }

    public final g36 k() {
        return (g36) this.k.getValue();
    }

    public final void l() {
        g36 g36 = (g36) this.k.getValue();
        if (g36 != null && g36.j && !this.o) {
            this.i.e("FOLDER_BACK_CLICK_TEMPLATE");
        }
        this.m.setValue(this.r);
    }

    public final void m() {
        n();
        o85 o85 = new o85(new e36(this.c.a));
        xme xme = this.m;
        xme.getClass();
        xme.m((Object) null, o85);
    }

    public final void n() {
        g36 g36 = (g36) this.k.getValue();
        if (g36 != null && g36.j) {
            this.o = true;
            this.i.e("FOLDER_CONFIGURE_TEMPLATE");
        }
    }
}
