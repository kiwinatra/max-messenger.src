package defpackage;

import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function2;
import ru.ok.messages.gallery.GalleryViewModel;

/* renamed from: bp6  reason: default package */
public final class bp6 extends SuspendLambda implements Function2 {
    public List a;
    public GalleryViewModel b;
    public Collection c;
    public Iterator o;
    public int v;
    public final /* synthetic */ GalleryViewModel w;
    public final /* synthetic */ List x;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public bp6(GalleryViewModel galleryViewModel, List list, Continuation continuation) {
        super(2, continuation);
        this.w = galleryViewModel;
        this.x = list;
    }

    public final Continuation create(Object obj, Continuation continuation) {
        return new bp6(this.w, this.x, continuation);
    }

    public final Object invoke(Object obj, Object obj2) {
        return ((bp6) create((d14) obj, (Continuation) obj2)).invokeSuspend(Unit.INSTANCE);
    }

    /* JADX WARNING: Removed duplicated region for block: B:21:0x0089  */
    /* JADX WARNING: Removed duplicated region for block: B:26:0x00bb  */
    /* JADX WARNING: Removed duplicated region for block: B:27:0x00bf  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final java.lang.Object invokeSuspend(java.lang.Object r10) {
        /*
            r9 = this;
            java.lang.Object r0 = kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED()
            int r1 = r9.v
            r2 = 0
            r3 = 2
            r4 = 1
            ru.ok.messages.gallery.GalleryViewModel r5 = r9.w
            if (r1 == 0) goto L_0x002e
            if (r1 == r4) goto L_0x002a
            if (r1 != r3) goto L_0x0022
            java.util.Iterator r1 = r9.o
            java.util.Collection r4 = r9.c
            java.util.Collection r4 = (java.util.Collection) r4
            ru.ok.messages.gallery.GalleryViewModel r5 = r9.b
            java.util.List r6 = r9.a
            java.util.List r6 = (java.util.List) r6
            kotlin.ResultKt.throwOnFailure(r10)
            goto L_0x00b7
        L_0x0022:
            java.lang.IllegalStateException r9 = new java.lang.IllegalStateException
            java.lang.String r10 = "call to 'resume' before 'invoke' with coroutine"
            r9.<init>(r10)
            throw r9
        L_0x002a:
            kotlin.ResultKt.throwOnFailure(r10)
            goto L_0x0063
        L_0x002e:
            kotlin.ResultKt.throwOnFailure(r10)
            pl6 r10 = r5.m
            boolean r10 = r10.o
            if (r10 == 0) goto L_0x0068
            xme r10 = r5.N
            java.lang.Object r10 = r10.getValue()
            rqd r1 = defpackage.rqd.a
            if (r10 != r1) goto L_0x0068
            xme r10 = r5.N
            r9.v = r4
            on2 r1 = new on2
            r4 = 28
            r1.<init>(r10, r4)
            k26 r10 = new k26
            r4 = 12
            r10.<init>(r1, r4)
            java.lang.Object r10 = defpackage.bs0.z(r10, r9)
            java.lang.Object r1 = kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED()
            if (r10 != r1) goto L_0x005e
            goto L_0x0060
        L_0x005e:
            kotlin.Unit r10 = kotlin.Unit.INSTANCE
        L_0x0060:
            if (r10 != r0) goto L_0x0063
            return r0
        L_0x0063:
            xme r10 = r5.N
            r10.setValue(r2)
        L_0x0068:
            sqd r10 = r5.E
            r10.getClass()
            java.util.ArrayList r1 = new java.util.ArrayList
            java.util.concurrent.CopyOnWriteArraySet r10 = r10.a
            r1.<init>(r10)
            java.util.List r10 = r9.x
            java.lang.Iterable r10 = (java.lang.Iterable) r10
            java.util.ArrayList r4 = new java.util.ArrayList
            r4.<init>()
            java.util.Iterator r10 = r10.iterator()
            r6 = r1
            r1 = r10
        L_0x0083:
            boolean r10 = r1.hasNext()
            if (r10 == 0) goto L_0x00bf
            java.lang.Object r10 = r1.next()
            k48 r10 = (defpackage.k48) r10
            r7 = r6
            java.util.List r7 = (java.util.List) r7
            r9.a = r7
            r9.b = r5
            r7 = r4
            java.util.Collection r7 = (java.util.Collection) r7
            r9.c = r7
            r9.o = r1
            r9.v = r3
            kotlin.reflect.KProperty[] r7 = ru.ok.messages.gallery.GalleryViewModel.S
            gaf r7 = r5.o()
            osa r7 = (defpackage.osa) r7
            q04 r7 = r7.e()
            zo6 r8 = new zo6
            r8.<init>(r5, r10, r6, r2)
            java.lang.Object r10 = defpackage.ev0.I(r7, r8, r9)
            if (r10 != r0) goto L_0x00b7
            return r0
        L_0x00b7:
            sm6 r10 = (defpackage.sm6) r10
            if (r10 == 0) goto L_0x0083
            r4.add(r10)
            goto L_0x0083
        L_0x00bf:
            java.util.List r4 = (java.util.List) r4
            return r4
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.bp6.invokeSuspend(java.lang.Object):java.lang.Object");
    }
}
