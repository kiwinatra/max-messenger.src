package defpackage;

import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function2;
import ru.ok.messages.gallery.GalleryViewModel;

/* renamed from: dp6  reason: default package */
public final class dp6 extends SuspendLambda implements Function2 {
    public long a;
    public List b;
    public GalleryViewModel c;
    public Collection o;
    public Iterator v;
    public int w;
    public final /* synthetic */ m02 x;
    public final /* synthetic */ GalleryViewModel y;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public dp6(m02 m02, GalleryViewModel galleryViewModel, Continuation continuation) {
        super(2, continuation);
        this.x = m02;
        this.y = galleryViewModel;
    }

    public final Continuation create(Object obj, Continuation continuation) {
        return new dp6(this.x, this.y, continuation);
    }

    public final Object invoke(Object obj, Object obj2) {
        return ((dp6) create((d14) obj, (Continuation) obj2)).invokeSuspend(Unit.INSTANCE);
    }

    /* JADX WARNING: Removed duplicated region for block: B:20:0x00a3  */
    /* JADX WARNING: Removed duplicated region for block: B:9:0x0058  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final java.lang.Object invokeSuspend(java.lang.Object r13) {
        /*
            r12 = this;
            java.lang.Object r0 = kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED()
            int r1 = r12.w
            r2 = 1
            ru.ok.messages.gallery.GalleryViewModel r3 = r12.y
            if (r1 == 0) goto L_0x0028
            if (r1 != r2) goto L_0x0020
            long r4 = r12.a
            java.util.Iterator r1 = r12.v
            java.util.Collection r6 = r12.o
            java.util.Collection r6 = (java.util.Collection) r6
            ru.ok.messages.gallery.GalleryViewModel r7 = r12.c
            java.util.List r8 = r12.b
            java.util.List r8 = (java.util.List) r8
            kotlin.ResultKt.throwOnFailure(r13)
            goto L_0x009f
        L_0x0020:
            java.lang.IllegalStateException r12 = new java.lang.IllegalStateException
            java.lang.String r13 = "call to 'resume' before 'invoke' with coroutine"
            r12.<init>(r13)
            throw r12
        L_0x0028:
            kotlin.ResultKt.throwOnFailure(r13)
            m02 r13 = r12.x
            d48 r13 = r13.a()
            long r4 = r13.b
            sqd r13 = r3.E
            r13.getClass()
            java.util.ArrayList r1 = new java.util.ArrayList
            java.util.concurrent.CopyOnWriteArraySet r13 = r13.a
            r1.<init>(r13)
            java.util.List r13 = r3.m()
            java.lang.Iterable r13 = (java.lang.Iterable) r13
            java.util.ArrayList r6 = new java.util.ArrayList
            r6.<init>()
            java.util.Iterator r13 = r13.iterator()
            r8 = r1
            r7 = r3
            r1 = r13
        L_0x0051:
            boolean r13 = r1.hasNext()
            r9 = 0
            if (r13 == 0) goto L_0x00ad
            java.lang.Object r13 = r1.next()
            um6 r13 = (defpackage.um6) r13
            qm6 r10 = defpackage.qm6.b
            boolean r10 = kotlin.jvm.internal.Intrinsics.areEqual((java.lang.Object) r13, (java.lang.Object) r10)
            if (r10 == 0) goto L_0x0067
            goto L_0x00a1
        L_0x0067:
            boolean r10 = r13 instanceof defpackage.sm6
            if (r10 == 0) goto L_0x00a7
            sm6 r13 = (defpackage.sm6) r13
            long r10 = r13.d
            int r10 = (r10 > r4 ? 1 : (r10 == r4 ? 0 : -1))
            if (r10 != 0) goto L_0x00a1
            r10 = r8
            java.util.List r10 = (java.util.List) r10
            r12.b = r10
            r12.c = r7
            r10 = r6
            java.util.Collection r10 = (java.util.Collection) r10
            r12.o = r10
            r12.v = r1
            r12.a = r4
            r12.w = r2
            kotlin.reflect.KProperty[] r10 = ru.ok.messages.gallery.GalleryViewModel.S
            gaf r10 = r7.o()
            osa r10 = (defpackage.osa) r10
            q04 r10 = r10.e()
            zo6 r11 = new zo6
            k48 r13 = r13.b
            r11.<init>(r7, r13, r8, r9)
            java.lang.Object r13 = defpackage.ev0.I(r10, r11, r12)
            if (r13 != r0) goto L_0x009f
            return r0
        L_0x009f:
            sm6 r13 = (defpackage.sm6) r13
        L_0x00a1:
            if (r13 == 0) goto L_0x0051
            r6.add(r13)
            goto L_0x0051
        L_0x00a7:
            kotlin.NoWhenBranchMatchedException r12 = new kotlin.NoWhenBranchMatchedException
            r12.<init>()
            throw r12
        L_0x00ad:
            java.util.List r6 = (java.util.List) r6
            xme r12 = r3.o
            o85 r13 = new o85
            r13.<init>(r6)
            r12.getClass()
            r12.m(r9, r13)
            r12 = 0
            r3.R = r12
            kotlin.Unit r12 = kotlin.Unit.INSTANCE
            return r12
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.dp6.invokeSuspend(java.lang.Object):java.lang.Object");
    }
}
