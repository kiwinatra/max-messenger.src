package defpackage;

import java.util.List;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function2;
import ru.ok.messages.settings.folders.settings.presentation.FolderSettingsViewModel;

/* renamed from: t46  reason: default package */
public final class t46 extends SuspendLambda implements Function2 {
    public int a;
    public /* synthetic */ Object b;
    public final /* synthetic */ FolderSettingsViewModel c;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public t46(FolderSettingsViewModel folderSettingsViewModel, Continuation continuation) {
        super(2, continuation);
        this.c = folderSettingsViewModel;
    }

    public final Continuation create(Object obj, Continuation continuation) {
        t46 t46 = new t46(this.c, continuation);
        t46.b = obj;
        return t46;
    }

    public final Object invoke(Object obj, Object obj2) {
        return ((t46) create((List) obj, (Continuation) obj2)).invokeSuspend(Unit.INSTANCE);
    }

    /* JADX WARNING: Removed duplicated region for block: B:30:0x00d9  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final java.lang.Object invokeSuspend(java.lang.Object r11) {
        /*
            r10 = this;
            java.lang.Object r0 = kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED()
            int r1 = r10.a
            r2 = 0
            r3 = 1
            ru.ok.messages.settings.folders.settings.presentation.FolderSettingsViewModel r4 = r10.c
            if (r1 == 0) goto L_0x001e
            if (r1 != r3) goto L_0x0016
            java.lang.Object r10 = r10.b
            java.util.List r10 = (java.util.List) r10
            kotlin.ResultKt.throwOnFailure(r11)
            goto L_0x0041
        L_0x0016:
            java.lang.IllegalStateException r10 = new java.lang.IllegalStateException
            java.lang.String r11 = "call to 'resume' before 'invoke' with coroutine"
            r10.<init>(r11)
            throw r10
        L_0x001e:
            kotlin.ResultKt.throwOnFailure(r11)
            java.lang.Object r11 = r10.b
            java.util.List r11 = (java.util.List) r11
            u82 r1 = r4.e
            r10.b = r11
            r10.a = r3
            ia2 r1 = (defpackage.ia2) r1
            r1.getClass()
            l92 r5 = new l92
            r5.<init>(r1, r2)
            kotlin.coroutines.CoroutineContext r1 = r1.x
            java.lang.Object r10 = defpackage.ev0.I(r1, r5, r10)
            if (r10 != r0) goto L_0x003e
            return r0
        L_0x003e:
            r9 = r11
            r11 = r10
            r10 = r9
        L_0x0041:
            java.lang.Iterable r11 = (java.lang.Iterable) r11
            kotlin.sequences.Sequence r11 = kotlin.collections.CollectionsKt.asSequence(r11)
            s46 r0 = new s46
            r1 = 0
            r0.<init>(r4, r1)
            kotlin.sequences.Sequence r11 = kotlin.sequences.SequencesKt.map(r11, r0)
            java.util.List r11 = kotlin.sequences.SequencesKt.toList(r11)
            java.lang.Iterable r10 = (java.lang.Iterable) r10
            kotlin.sequences.Sequence r10 = kotlin.collections.CollectionsKt.asSequence(r10)
            s46 r0 = new s46
            r1 = 1
            r0.<init>(r4, r1)
            kotlin.sequences.Sequence r10 = kotlin.sequences.SequencesKt.map(r10, r0)
            java.util.List r10 = kotlin.sequences.SequencesKt.toList(r10)
            boolean r0 = r10.isEmpty()
            java.lang.String r1 = "app.extra.folders.settings.fist.open.from.channels"
            java.lang.String r5 = "app.extra.folders.settings.fist.open.from.unread"
            r6 = 0
            if (r0 == 0) goto L_0x00be
            q46 r0 = r4.c
            o46 r7 = defpackage.o46.a
            boolean r7 = kotlin.jvm.internal.Intrinsics.areEqual((java.lang.Object) r0, (java.lang.Object) r7)
            if (r7 == 0) goto L_0x0080
        L_0x007e:
            r0 = r2
            goto L_0x00cd
        L_0x0080:
            p46 r7 = defpackage.p46.a
            boolean r7 = kotlin.jvm.internal.Intrinsics.areEqual((java.lang.Object) r0, (java.lang.Object) r7)
            fq r8 = r4.f
            if (r7 == 0) goto L_0x009d
            r0 = r8
            pid r0 = (defpackage.pid) r0
            ls7 r0 = r0.g
            boolean r0 = r0.getBoolean(r5, r3)
            if (r0 == 0) goto L_0x007e
            pid r8 = (defpackage.pid) r8
            r8.i(r5, r6)
            k56 r0 = defpackage.k56.f
            goto L_0x00cd
        L_0x009d:
            n46 r5 = defpackage.n46.a
            boolean r0 = kotlin.jvm.internal.Intrinsics.areEqual((java.lang.Object) r0, (java.lang.Object) r5)
            if (r0 == 0) goto L_0x00b8
            r0 = r8
            pid r0 = (defpackage.pid) r0
            ls7 r0 = r0.g
            boolean r0 = r0.getBoolean(r1, r3)
            if (r0 == 0) goto L_0x007e
            pid r8 = (defpackage.pid) r8
            r8.i(r1, r6)
            j56 r0 = defpackage.j56.f
            goto L_0x00cd
        L_0x00b8:
            kotlin.NoWhenBranchMatchedException r10 = new kotlin.NoWhenBranchMatchedException
            r10.<init>()
            throw r10
        L_0x00be:
            fq r0 = r4.f
            pid r0 = (defpackage.pid) r0
            r0.i(r5, r6)
            fq r0 = r4.f
            pid r0 = (defpackage.pid) r0
            r0.i(r1, r6)
            goto L_0x007e
        L_0x00cd:
            fq r1 = r4.f
            pid r1 = (defpackage.pid) r1
            java.lang.String r5 = "app.extra.folders.are.folders.confugured.once"
            r1.i(r5, r3)
            if (r0 == 0) goto L_0x00d9
            goto L_0x00da
        L_0x00d9:
            r0 = r2
        L_0x00da:
            y46 r1 = new y46
            r1.<init>(r10, r11, r0)
            xme r10 = r4.i
            r10.getClass()
            r10.m(r2, r1)
            kotlin.Unit r10 = kotlin.Unit.INSTANCE
            return r10
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.t46.invokeSuspend(java.lang.Object):java.lang.Object");
    }
}
