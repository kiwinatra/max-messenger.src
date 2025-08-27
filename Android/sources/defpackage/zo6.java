package defpackage;

import java.util.List;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function2;
import ru.ok.messages.gallery.GalleryViewModel;

/* renamed from: zo6  reason: default package */
public final class zo6 extends SuspendLambda implements Function2 {
    public final /* synthetic */ GalleryViewModel a;
    public final /* synthetic */ k48 b;
    public final /* synthetic */ List c;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public zo6(GalleryViewModel galleryViewModel, k48 k48, List list, Continuation continuation) {
        super(2, continuation);
        this.a = galleryViewModel;
        this.b = k48;
        this.c = list;
    }

    public final Continuation create(Object obj, Continuation continuation) {
        return new zo6(this.a, this.b, this.c, continuation);
    }

    public final Object invoke(Object obj, Object obj2) {
        return ((zo6) create((d14) obj, (Continuation) obj2)).invokeSuspend(Unit.INSTANCE);
    }

    /* JADX WARNING: Code restructure failed: missing block: B:13:0x0041, code lost:
        r13 = r0.c;
     */
    /* JADX WARNING: Removed duplicated region for block: B:27:0x0081  */
    /* JADX WARNING: Removed duplicated region for block: B:28:0x0085  */
    /* JADX WARNING: Removed duplicated region for block: B:30:0x0088  */
    /* JADX WARNING: Removed duplicated region for block: B:31:0x008c  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final java.lang.Object invokeSuspend(java.lang.Object r14) {
        /*
            r13 = this;
            kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED()
            kotlin.ResultKt.throwOnFailure(r14)
            ru.ok.messages.gallery.GalleryViewModel r14 = r13.a
            pl6 r0 = r14.m
            boolean r0 = r0.c
            k48 r2 = r13.b
            r1 = 0
            if (r0 != 0) goto L_0x0018
            j48 r0 = r2.Z
            j48 r3 = defpackage.j48.v
            if (r0 != r3) goto L_0x0018
            return r1
        L_0x0018:
            java.util.List r13 = r13.c
            java.lang.Iterable r13 = (java.lang.Iterable) r13
            java.util.Iterator r13 = r13.iterator()
        L_0x0020:
            boolean r0 = r13.hasNext()
            if (r0 == 0) goto L_0x003c
            java.lang.Object r0 = r13.next()
            r3 = r0
            uqd r3 = (defpackage.uqd) r3
            d48 r3 = r3.a
            android.net.Uri r4 = r2.b
            android.net.Uri r3 = r3.c()
            boolean r3 = defpackage.y64.a(r4, r3)
            if (r3 == 0) goto L_0x0020
            goto L_0x003d
        L_0x003c:
            r0 = r1
        L_0x003d:
            uqd r0 = (defpackage.uqd) r0
            if (r0 == 0) goto L_0x0049
            dfb r13 = r0.c
            if (r13 == 0) goto L_0x0049
            android.net.Uri r13 = r13.v
            r7 = r13
            goto L_0x004a
        L_0x0049:
            r7 = r1
        L_0x004a:
            android.net.Uri r13 = r2.Y
            if (r0 == 0) goto L_0x006c
            dfb r3 = r0.c
            d48 r4 = r0.a
            boolean r3 = defpackage.dfb.b(r3, r4)
            if (r3 == 0) goto L_0x006c
            dfb r3 = r0.c
            android.net.Uri r3 = defpackage.dfb.a(r3, r4)
            java.lang.String r5 = r3.getPath()
            java.lang.String r4 = r4.c
            boolean r4 = kotlin.text.StringsKt__StringsJVMKt.equals$default(r5, r4, false, 2, (java.lang.Object) null)
            if (r4 != 0) goto L_0x006c
            r9 = r3
            goto L_0x006d
        L_0x006c:
            r9 = r13
        L_0x006d:
            pl6 r13 = r14.m
            boolean r6 = r13.o
            wm6 r13 = r14.q
            v3d r10 = r13.h
            d48 r13 = defpackage.cvg.M(r2)
            sqd r14 = r14.E
            int r3 = r14.h(r13)
            if (r0 == 0) goto L_0x0085
            p4g r13 = r0.b
            r11 = r13
            goto L_0x0086
        L_0x0085:
            r11 = r1
        L_0x0086:
            if (r0 == 0) goto L_0x008c
            dfb r13 = r0.c
            r12 = r13
            goto L_0x008d
        L_0x008c:
            r12 = r1
        L_0x008d:
            sm6 r13 = new sm6
            long r4 = r2.a
            r8 = 0
            r1 = r13
            r1.<init>(r2, r3, r4, r6, r7, r8, r9, r10, r11, r12)
            return r13
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.zo6.invokeSuspend(java.lang.Object):java.lang.Object");
    }
}
