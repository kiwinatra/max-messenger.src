package defpackage;

import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function2;
import ru.ok.messages.gallery.GalleryViewModel;

/* renamed from: co6  reason: default package */
public final class co6 extends SuspendLambda implements Function2 {
    public int a;
    public /* synthetic */ Object b;
    public final /* synthetic */ GalleryViewModel c;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public co6(GalleryViewModel galleryViewModel, Continuation continuation) {
        super(2, continuation);
        this.c = galleryViewModel;
    }

    public final Continuation create(Object obj, Continuation continuation) {
        co6 co6 = new co6(this.c, continuation);
        co6.b = obj;
        return co6;
    }

    public final Object invoke(Object obj, Object obj2) {
        return ((co6) create((d14) obj, (Continuation) obj2)).invokeSuspend(Unit.INSTANCE);
    }

    /* JADX WARNING: Removed duplicated region for block: B:31:0x00c3  */
    /* JADX WARNING: Removed duplicated region for block: B:33:0x00c6  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final java.lang.Object invokeSuspend(java.lang.Object r10) {
        /*
            r9 = this;
            java.lang.Object r0 = kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED()
            int r1 = r9.a
            r2 = 2
            r3 = 1
            ru.ok.messages.gallery.GalleryViewModel r4 = r9.c
            r5 = 0
            if (r1 == 0) goto L_0x002d
            if (r1 == r3) goto L_0x0022
            if (r1 != r2) goto L_0x001a
            java.lang.Object r9 = r9.b
            d14 r9 = (defpackage.d14) r9
            kotlin.ResultKt.throwOnFailure(r10)
            goto L_0x00bb
        L_0x001a:
            java.lang.IllegalStateException r9 = new java.lang.IllegalStateException
            java.lang.String r10 = "call to 'resume' before 'invoke' with coroutine"
            r9.<init>(r10)
            throw r9
        L_0x0022:
            java.lang.Object r1 = r9.b
            d14 r1 = (defpackage.d14) r1
            kotlin.ResultKt.throwOnFailure(r10)
            r8 = r1
            r1 = r10
            r10 = r8
            goto L_0x006e
        L_0x002d:
            kotlin.ResultKt.throwOnFailure(r10)
            java.lang.Object r10 = r9.b
            d14 r10 = (defpackage.d14) r10
            java.lang.String r1 = ru.ok.messages.gallery.GalleryViewModel.T
            java.lang.String r6 = "loadMoreItems(): loadingItemsJob start"
            defpackage.z68.c(r1, r6, new java.lang.Object[0])
            xme r1 = r4.t
            java.lang.Boolean r6 = kotlin.coroutines.jvm.internal.Boxing.boxBoolean(r3)
            o85 r7 = new o85
            r7.<init>(r6)
            r1.getClass()
            r1.m(r5, r7)
            xme r1 = r4.y
            java.lang.Object r1 = r1.getValue()
            pm6 r1 = (defpackage.pm6) r1
            if (r1 != 0) goto L_0x0059
            kotlin.Unit r9 = kotlin.Unit.INSTANCE
            return r9
        L_0x0059:
            wm6 r6 = r4.q
            int r6 = r6.f
            r9.b = r10
            r9.a = r3
            s48 r3 = r4.f
            yd7 r3 = (defpackage.yd7) r3
            wk6 r1 = r1.a
            java.lang.Object r1 = r3.e(r1, r6, r9)
            if (r1 != r0) goto L_0x006e
            return r0
        L_0x006e:
            r48 r1 = (defpackage.r48) r1
            xme r3 = r4.t
            r6 = 0
            java.lang.Boolean r6 = kotlin.coroutines.jvm.internal.Boxing.boxBoolean(r6)
            o85 r7 = new o85
            r7.<init>(r6)
            r3.getClass()
            r3.m(r5, r7)
            java.lang.String r3 = ru.ok.messages.gallery.GalleryViewModel.T
            java.lang.StringBuilder r6 = new java.lang.StringBuilder
            java.lang.String r7 = "loadMoreItems(): get result "
            r6.<init>(r7)
            r6.append(r1)
            java.lang.String r6 = r6.toString()
            defpackage.z68.c(r3, r6, new java.lang.Object[0])
            boolean r3 = defpackage.e14.f(r10)
            if (r3 != 0) goto L_0x009e
            kotlin.Unit r9 = kotlin.Unit.INSTANCE
            return r9
        L_0x009e:
            boolean r3 = r1 instanceof defpackage.p48
            if (r3 == 0) goto L_0x00a5
            kotlin.Unit r9 = kotlin.Unit.INSTANCE
            return r9
        L_0x00a5:
            boolean r3 = r1 instanceof defpackage.q48
            if (r3 == 0) goto L_0x00e9
            q48 r1 = (defpackage.q48) r1
            java.util.List r1 = r1.a
            r9.b = r10
            r9.a = r2
            java.lang.Object r9 = ru.ok.messages.gallery.GalleryViewModel.k(r4, r1, r9)
            if (r9 != r0) goto L_0x00b8
            return r0
        L_0x00b8:
            r8 = r10
            r10 = r9
            r9 = r8
        L_0x00bb:
            java.util.List r10 = (java.util.List) r10
            boolean r9 = defpackage.e14.f(r9)
            if (r9 != 0) goto L_0x00c6
            kotlin.Unit r9 = kotlin.Unit.INSTANCE
            return r9
        L_0x00c6:
            xme r9 = r4.o
            o85 r0 = new o85
            java.util.List r1 = r4.m()
            java.util.Collection r1 = (java.util.Collection) r1
            java.lang.Iterable r10 = (java.lang.Iterable) r10
            java.util.List r10 = kotlin.collections.CollectionsKt.plus(r1, r10)
            r0.<init>(r10)
            r9.getClass()
            r9.m(r5, r0)
            java.lang.String r9 = ru.ok.messages.gallery.GalleryViewModel.T
            java.lang.String r10 = "loadMoreItems(): loadingItemsJob finish"
            defpackage.z68.c(r9, r10, new java.lang.Object[0])
            kotlin.Unit r9 = kotlin.Unit.INSTANCE
            return r9
        L_0x00e9:
            kotlin.NoWhenBranchMatchedException r9 = new kotlin.NoWhenBranchMatchedException
            r9.<init>()
            throw r9
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.co6.invokeSuspend(java.lang.Object):java.lang.Object");
    }
}
