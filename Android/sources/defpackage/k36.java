package defpackage;

import java.util.List;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function2;
import ru.ok.messages.settings.folders.page.FolderPageViewModel;

/* renamed from: k36  reason: default package */
public final class k36 extends SuspendLambda implements Function2 {
    public List a;
    public int b;
    public final /* synthetic */ FolderPageViewModel c;
    public final /* synthetic */ z26 o;
    public final /* synthetic */ List v;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public k36(FolderPageViewModel folderPageViewModel, z26 z26, List list, Continuation continuation) {
        super(2, continuation);
        this.c = folderPageViewModel;
        this.o = z26;
        this.v = list;
    }

    public final Continuation create(Object obj, Continuation continuation) {
        return new k36(this.c, this.o, this.v, continuation);
    }

    public final Object invoke(Object obj, Object obj2) {
        return ((k36) create((d14) obj, (Continuation) obj2)).invokeSuspend(Unit.INSTANCE);
    }

    /* JADX WARNING: Removed duplicated region for block: B:27:0x00c1 A[LOOP:1: B:25:0x00bb->B:27:0x00c1, LOOP_END] */
    /* JADX WARNING: Removed duplicated region for block: B:30:0x00dc A[RETURN] */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final java.lang.Object invokeSuspend(java.lang.Object r11) {
        /*
            r10 = this;
            java.lang.Object r0 = kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED()
            int r1 = r10.b
            r2 = 3
            r3 = 0
            r4 = 2
            z26 r5 = r10.o
            r6 = 1
            ru.ok.messages.settings.folders.page.FolderPageViewModel r7 = r10.c
            if (r1 == 0) goto L_0x0030
            if (r1 == r6) goto L_0x002c
            if (r1 == r4) goto L_0x0023
            if (r1 != r2) goto L_0x001b
            kotlin.ResultKt.throwOnFailure(r11)
            goto L_0x00dd
        L_0x001b:
            java.lang.IllegalStateException r10 = new java.lang.IllegalStateException
            java.lang.String r11 = "call to 'resume' before 'invoke' with coroutine"
            r10.<init>(r11)
            throw r10
        L_0x0023:
            java.util.List r1 = r10.a
            java.util.List r1 = (java.util.List) r1
            kotlin.ResultKt.throwOnFailure(r11)
            goto L_0x00a3
        L_0x002c:
            kotlin.ResultKt.throwOnFailure(r11)
            goto L_0x0053
        L_0x0030:
            kotlin.ResultKt.throwOnFailure(r11)
            nd r11 = r7.i
            java.lang.String r1 = "FOLDER_ADD_CHATS"
            r11.e(r1)
            java.lang.String r11 = r5.a
            r10.b = r6
            u82 r1 = r7.h
            ia2 r1 = (defpackage.ia2) r1
            r1.getClass()
            k92 r8 = new k92
            r8.<init>(r1, r11, r3)
            kotlin.coroutines.CoroutineContext r11 = r1.x
            java.lang.Object r11 = defpackage.ev0.I(r11, r8, r10)
            if (r11 != r0) goto L_0x0053
            return r0
        L_0x0053:
            java.lang.Iterable r11 = (java.lang.Iterable) r11
            java.util.ArrayList r1 = new java.util.ArrayList
            int r8 = kotlin.collections.CollectionsKt__IterablesKt.collectionSizeOrDefault(r11, 10)
            r1.<init>(r8)
            java.util.Iterator r11 = r11.iterator()
        L_0x0062:
            boolean r8 = r11.hasNext()
            if (r8 == 0) goto L_0x007a
            java.lang.Object r8 = r11.next()
            a32 r8 = (defpackage.a32) r8
            m72 r8 = r8.b
            long r8 = r8.a
            java.lang.Long r8 = kotlin.coroutines.jvm.internal.Boxing.boxLong(r8)
            r1.add(r8)
            goto L_0x0062
        L_0x007a:
            java.util.List r11 = r10.v
            java.lang.Iterable r11 = (java.lang.Iterable) r11
            java.util.List r8 = kotlin.collections.CollectionsKt.minus(r1, r11)
            java.util.List r11 = kotlin.collections.CollectionsKt.minus(r11, r1)
            r1 = r11
            java.util.Collection r1 = (java.util.Collection) r1
            boolean r1 = r1.isEmpty()
            r1 = r1 ^ r6
            if (r1 == 0) goto L_0x00a4
            u82 r1 = r7.h
            java.lang.String r6 = r5.a
            r9 = r8
            java.util.List r9 = (java.util.List) r9
            r10.a = r9
            r10.b = r4
            java.lang.Object r11 = defpackage.u82.f(r1, r6, r11, r10)
            if (r11 != r0) goto L_0x00a2
            return r0
        L_0x00a2:
            r1 = r8
        L_0x00a3:
            r8 = r1
        L_0x00a4:
            java.lang.Iterable r8 = (java.lang.Iterable) r8
            kotlin.coroutines.CoroutineContext r11 = r10.getContext()
            jx3 r11 = defpackage.e14.a(r11)
            java.util.ArrayList r1 = new java.util.ArrayList
            int r4 = kotlin.collections.CollectionsKt__IterablesKt.collectionSizeOrDefault(r8, 10)
            r1.<init>(r4)
            java.util.Iterator r4 = r8.iterator()
        L_0x00bb:
            boolean r6 = r4.hasNext()
            if (r6 == 0) goto L_0x00d2
            java.lang.Object r6 = r4.next()
            j36 r8 = new j36
            r8.<init>(r6, r3, r7, r5)
            nk4 r6 = defpackage.ev0.d(r11, r3, r8, r2)
            r1.add(r6)
            goto L_0x00bb
        L_0x00d2:
            r10.a = r3
            r10.b = r2
            java.lang.Object r10 = defpackage.j4b.g(r1, r10)
            if (r10 != r0) goto L_0x00dd
            return r0
        L_0x00dd:
            kotlin.Unit r10 = kotlin.Unit.INSTANCE
            return r10
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.k36.invokeSuspend(java.lang.Object):java.lang.Object");
    }
}
