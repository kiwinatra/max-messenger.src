package defpackage;

import java.util.Collection;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function2;
import ru.ok.messages.gallery.GalleryViewModel;

/* renamed from: sn6  reason: default package */
public final class sn6 extends SuspendLambda implements Function2 {
    public Collection a;
    public int b;
    public final /* synthetic */ GalleryViewModel c;
    public final /* synthetic */ wk6 o;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public sn6(GalleryViewModel galleryViewModel, wk6 wk6, Continuation continuation) {
        super(2, continuation);
        this.c = galleryViewModel;
        this.o = wk6;
    }

    public final Continuation create(Object obj, Continuation continuation) {
        return new sn6(this.c, this.o, continuation);
    }

    public final Object invoke(Object obj, Object obj2) {
        return ((sn6) create((d14) obj, (Continuation) obj2)).invokeSuspend(Unit.INSTANCE);
    }

    /* JADX WARNING: Removed duplicated region for block: B:22:0x00c1  */
    /* JADX WARNING: Removed duplicated region for block: B:24:0x00c4  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final java.lang.Object invokeSuspend(java.lang.Object r12) {
        /*
            r11 = this;
            java.lang.Object r0 = kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED()
            int r1 = r11.b
            r2 = 0
            r3 = 3
            r4 = 2
            wk6 r5 = r11.o
            r6 = 1
            r7 = 0
            ru.ok.messages.gallery.GalleryViewModel r8 = r11.c
            if (r1 == 0) goto L_0x0035
            if (r1 == r6) goto L_0x0031
            if (r1 == r4) goto L_0x0028
            if (r1 != r3) goto L_0x0020
            java.util.Collection r11 = r11.a
            java.util.Collection r11 = (java.util.Collection) r11
            kotlin.ResultKt.throwOnFailure(r12)
            goto L_0x00dd
        L_0x0020:
            java.lang.IllegalStateException r11 = new java.lang.IllegalStateException
            java.lang.String r12 = "call to 'resume' before 'invoke' with coroutine"
            r11.<init>(r12)
            throw r11
        L_0x0028:
            java.util.Collection r1 = r11.a
            java.util.List r1 = (java.util.List) r1
            kotlin.ResultKt.throwOnFailure(r12)
            goto L_0x00aa
        L_0x0031:
            kotlin.ResultKt.throwOnFailure(r12)
            goto L_0x0084
        L_0x0035:
            kotlin.ResultKt.throwOnFailure(r12)
            xme r12 = r8.t
            java.lang.Object r12 = r12.getValue()
            o85 r12 = (defpackage.o85) r12
            java.lang.Object r12 = r12.a
            java.lang.Boolean r12 = (java.lang.Boolean) r12
            boolean r12 = r12.booleanValue()
            if (r12 == 0) goto L_0x004d
            kotlin.Unit r11 = kotlin.Unit.INSTANCE
            return r11
        L_0x004d:
            java.lang.String r12 = ru.ok.messages.gallery.GalleryViewModel.T
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            java.lang.String r9 = "start fetch medias for "
            r1.<init>(r9)
            r1.append(r5)
            java.lang.String r1 = r1.toString()
            defpackage.z68.c(r12, r1, new java.lang.Object[0])
            java.lang.Boolean r12 = kotlin.coroutines.jvm.internal.Boxing.boxBoolean(r6)
            o85 r1 = new o85
            r1.<init>(r12)
            xme r12 = r8.t
            r12.getClass()
            r12.m(r7, r1)
            vk6 r12 = r5.a
            s48 r1 = r8.f
            yd7 r1 = (defpackage.yd7) r1
            java.util.List r12 = r1.d(r12)
            r11.b = r6
            java.lang.Object r12 = ru.ok.messages.gallery.GalleryViewModel.k(r8, r12, r11)
            if (r12 != r0) goto L_0x0084
            return r0
        L_0x0084:
            r1 = r12
            java.util.List r1 = (java.util.List) r1
            xme r12 = r8.o
            o85 r9 = new o85
            r9.<init>(r1)
            r12.getClass()
            r12.m(r7, r9)
            wm6 r12 = r8.q
            int r12 = r12.f
            r9 = r1
            java.util.Collection r9 = (java.util.Collection) r9
            r11.a = r9
            r11.b = r4
            s48 r4 = r8.f
            yd7 r4 = (defpackage.yd7) r4
            java.lang.Object r12 = r4.e(r5, r12, r11)
            if (r12 != r0) goto L_0x00aa
            return r0
        L_0x00aa:
            r48 r12 = (defpackage.r48) r12
            xme r4 = r8.t
            java.lang.Boolean r9 = kotlin.coroutines.jvm.internal.Boxing.boxBoolean(r2)
            o85 r10 = new o85
            r10.<init>(r9)
            r4.getClass()
            r4.m(r7, r10)
            boolean r4 = r12 instanceof defpackage.p48
            if (r4 == 0) goto L_0x00c4
            kotlin.Unit r11 = kotlin.Unit.INSTANCE
            return r11
        L_0x00c4:
            boolean r4 = r12 instanceof defpackage.q48
            if (r4 == 0) goto L_0x011c
            java.util.Collection r1 = (java.util.Collection) r1
            q48 r12 = (defpackage.q48) r12
            java.util.List r12 = r12.a
            r4 = r1
            java.util.Collection r4 = (java.util.Collection) r4
            r11.a = r4
            r11.b = r3
            java.lang.Object r12 = ru.ok.messages.gallery.GalleryViewModel.k(r8, r12, r11)
            if (r12 != r0) goto L_0x00dc
            return r0
        L_0x00dc:
            r11 = r1
        L_0x00dd:
            java.lang.Iterable r12 = (java.lang.Iterable) r12
            java.util.List r11 = kotlin.collections.CollectionsKt.plus(r11, r12)
            java.lang.String r12 = ru.ok.messages.gallery.GalleryViewModel.T
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            java.lang.String r1 = "finish fetch medias for "
            r0.<init>(r1)
            r0.append(r5)
            java.lang.String r0 = r0.toString()
            defpackage.z68.c(r12, r0, new java.lang.Object[0])
            xme r12 = r8.w
            pl6 r0 = r8.m
            boolean r0 = r0.b
            if (r0 != 0) goto L_0x0105
            boolean r0 = r11.isEmpty()
            if (r0 == 0) goto L_0x0105
            r2 = r6
        L_0x0105:
            java.lang.Boolean r0 = kotlin.coroutines.jvm.internal.Boxing.boxBoolean(r2)
            r12.setValue(r0)
            o85 r12 = new o85
            r12.<init>(r11)
            xme r11 = r8.o
            r11.getClass()
            r11.m(r7, r12)
            kotlin.Unit r11 = kotlin.Unit.INSTANCE
            return r11
        L_0x011c:
            kotlin.NoWhenBranchMatchedException r11 = new kotlin.NoWhenBranchMatchedException
            r11.<init>()
            throw r11
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.sn6.invokeSuspend(java.lang.Object):java.lang.Object");
    }
}
