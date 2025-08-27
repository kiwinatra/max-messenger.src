package defpackage;

import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function2;
import ru.ok.messages.settings.folders.page.FolderPageViewModel;

/* renamed from: r36  reason: default package */
public final class r36 extends SuspendLambda implements Function2 {
    public FolderPageViewModel a;
    public Collection b;
    public Iterator c;
    public Collection o;
    public boolean v;
    public int w;
    public final /* synthetic */ List x;
    public final /* synthetic */ FolderPageViewModel y;
    public final /* synthetic */ boolean z;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public r36(List list, FolderPageViewModel folderPageViewModel, boolean z2, Continuation continuation) {
        super(2, continuation);
        this.x = list;
        this.y = folderPageViewModel;
        this.z = z2;
    }

    public final Continuation create(Object obj, Continuation continuation) {
        return new r36(this.x, this.y, this.z, continuation);
    }

    public final Object invoke(Object obj, Object obj2) {
        return ((r36) create((d14) obj, (Continuation) obj2)).invokeSuspend(Unit.INSTANCE);
    }

    /* JADX WARNING: Removed duplicated region for block: B:9:0x0047  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final java.lang.Object invokeSuspend(java.lang.Object r10) {
        /*
            r9 = this;
            java.lang.Object r0 = kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED()
            int r1 = r9.w
            r2 = 1
            if (r1 == 0) goto L_0x0025
            if (r1 != r2) goto L_0x001d
            boolean r1 = r9.v
            java.util.Collection r3 = r9.o
            java.util.Collection r3 = (java.util.Collection) r3
            java.util.Iterator r4 = r9.c
            java.util.Collection r5 = r9.b
            java.util.Collection r5 = (java.util.Collection) r5
            ru.ok.messages.settings.folders.page.FolderPageViewModel r6 = r9.a
            kotlin.ResultKt.throwOnFailure(r10)
            goto L_0x0072
        L_0x001d:
            java.lang.IllegalStateException r9 = new java.lang.IllegalStateException
            java.lang.String r10 = "call to 'resume' before 'invoke' with coroutine"
            r9.<init>(r10)
            throw r9
        L_0x0025:
            kotlin.ResultKt.throwOnFailure(r10)
            java.util.List r10 = r9.x
            java.lang.Iterable r10 = (java.lang.Iterable) r10
            java.util.ArrayList r1 = new java.util.ArrayList
            int r3 = kotlin.collections.CollectionsKt__IterablesKt.collectionSizeOrDefault(r10, 10)
            r1.<init>(r3)
            java.util.Iterator r10 = r10.iterator()
            ru.ok.messages.settings.folders.page.FolderPageViewModel r3 = r9.y
            boolean r4 = r9.z
            r6 = r3
            r3 = r1
            r1 = r4
            r4 = r10
        L_0x0041:
            boolean r10 = r4.hasNext()
            if (r10 == 0) goto L_0x0079
            java.lang.Object r10 = r4.next()
            a32 r10 = (defpackage.a32) r10
            r9.a = r6
            r5 = r3
            java.util.Collection r5 = (java.util.Collection) r5
            r9.b = r5
            r9.c = r4
            r9.o = r5
            r9.v = r1
            r9.w = r2
            gaf r5 = r6.j
            osa r5 = (defpackage.osa) r5
            q04 r5 = r5.a()
            q36 r7 = new q36
            r8 = 0
            r7.<init>(r10, r6, r1, r8)
            java.lang.Object r10 = defpackage.ev0.I(r5, r7, r9)
            if (r10 != r0) goto L_0x0071
            return r0
        L_0x0071:
            r5 = r3
        L_0x0072:
            s26 r10 = (defpackage.s26) r10
            r3.add(r10)
            r3 = r5
            goto L_0x0041
        L_0x0079:
            java.util.List r3 = (java.util.List) r3
            return r3
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.r36.invokeSuspend(java.lang.Object):java.lang.Object");
    }
}
