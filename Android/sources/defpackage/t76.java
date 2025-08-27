package defpackage;

import java.util.List;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function2;
import ru.ok.messages.settings.folders.picker.FoldersPickerViewModel;

/* renamed from: t76  reason: default package */
public final class t76 extends SuspendLambda implements Function2 {
    public List a;
    public FoldersPickerViewModel b;
    public FoldersPickerViewModel c;
    public int o;
    public final /* synthetic */ FoldersPickerViewModel v;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public t76(FoldersPickerViewModel foldersPickerViewModel, Continuation continuation) {
        super(2, continuation);
        this.v = foldersPickerViewModel;
    }

    public final Continuation create(Object obj, Continuation continuation) {
        return new t76(this.v, continuation);
    }

    public final Object invoke(Object obj, Object obj2) {
        return ((t76) create((d14) obj, (Continuation) obj2)).invokeSuspend(Unit.INSTANCE);
    }

    /* JADX WARNING: Removed duplicated region for block: B:19:0x008e A[RETURN] */
    /* JADX WARNING: Removed duplicated region for block: B:20:0x008f  */
    /* JADX WARNING: Removed duplicated region for block: B:23:0x00c5  */
    /* JADX WARNING: Removed duplicated region for block: B:25:0x00d1  */
    /* JADX WARNING: Removed duplicated region for block: B:30:0x0116  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final java.lang.Object invokeSuspend(java.lang.Object r15) {
        /*
            r14 = this;
            java.lang.Object r0 = kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED()
            int r1 = r14.o
            r2 = 0
            r3 = 3
            r4 = 2
            r5 = 1
            if (r1 == 0) goto L_0x0038
            if (r1 == r5) goto L_0x0034
            if (r1 == r4) goto L_0x0025
            if (r1 != r3) goto L_0x001d
            ru.ok.messages.settings.folders.picker.FoldersPickerViewModel r0 = r14.b
            java.util.List r1 = r14.a
            java.util.List r1 = (java.util.List) r1
            kotlin.ResultKt.throwOnFailure(r15)
            goto L_0x0091
        L_0x001d:
            java.lang.IllegalStateException r14 = new java.lang.IllegalStateException
            java.lang.String r15 = "call to 'resume' before 'invoke' with coroutine"
            r14.<init>(r15)
            throw r14
        L_0x0025:
            ru.ok.messages.settings.folders.picker.FoldersPickerViewModel r1 = r14.c
            ru.ok.messages.settings.folders.picker.FoldersPickerViewModel r4 = r14.b
            java.util.List r6 = r14.a
            java.util.List r6 = (java.util.List) r6
            kotlin.ResultKt.throwOnFailure(r15)
            r13 = r4
            r4 = r1
            r1 = r13
            goto L_0x007b
        L_0x0034:
            kotlin.ResultKt.throwOnFailure(r15)
            goto L_0x0054
        L_0x0038:
            kotlin.ResultKt.throwOnFailure(r15)
            ru.ok.messages.settings.folders.picker.FoldersPickerViewModel r15 = r14.v
            u82 r15 = r15.h
            r14.o = r5
            ia2 r15 = (defpackage.ia2) r15
            r15.getClass()
            j92 r1 = new j92
            r1.<init>(r15, r2)
            kotlin.coroutines.CoroutineContext r15 = r15.x
            java.lang.Object r15 = defpackage.ev0.I(r15, r1, r14)
            if (r15 != r0) goto L_0x0054
            return r0
        L_0x0054:
            java.util.List r15 = (java.util.List) r15
            ru.ok.messages.settings.folders.picker.FoldersPickerViewModel r1 = r14.v
            u82 r6 = r1.h
            r7 = r15
            java.util.List r7 = (java.util.List) r7
            r14.a = r7
            r14.b = r1
            r14.c = r1
            r14.o = r4
            ia2 r6 = (defpackage.ia2) r6
            r6.getClass()
            j92 r4 = new j92
            r4.<init>(r6, r2)
            kotlin.coroutines.CoroutineContext r6 = r6.x
            java.lang.Object r4 = defpackage.ev0.I(r6, r4, r14)
            if (r4 != r0) goto L_0x0078
            return r0
        L_0x0078:
            r6 = r15
            r15 = r4
            r4 = r1
        L_0x007b:
            java.util.List r15 = (java.util.List) r15
            r7 = r6
            java.util.List r7 = (java.util.List) r7
            r14.a = r7
            r14.b = r1
            r14.c = r2
            r14.o = r3
            java.lang.Object r15 = ru.ok.messages.settings.folders.picker.FoldersPickerViewModel.j(r4, r15, r14)
            if (r15 != r0) goto L_0x008f
            return r0
        L_0x008f:
            r0 = r1
            r1 = r6
        L_0x0091:
            java.util.Collection r15 = (java.util.Collection) r15
            java.util.List r15 = kotlin.collections.CollectionsKt.toMutableList(r15)
            r0.p = r15
            ru.ok.messages.settings.folders.picker.FoldersPickerViewModel r15 = r14.v
            java.util.List r15 = r15.p
            java.lang.Iterable r15 = (java.lang.Iterable) r15
            kotlin.sequences.Sequence r15 = kotlin.collections.CollectionsKt.asSequence(r15)
            of3 r0 = new of3
            r3 = 22
            r0.<init>(r3)
            kotlin.sequences.Sequence r15 = kotlin.sequences.SequencesKt.filter(r15, r0)
            of3 r0 = new of3
            r3 = 23
            r0.<init>(r3)
            kotlin.sequences.Sequence r15 = kotlin.sequences.SequencesKt.map(r15, r0)
            java.util.List r9 = kotlin.sequences.SequencesKt.toList(r15)
            ru.ok.messages.settings.folders.picker.FoldersPickerViewModel r15 = r14.v
            ss9 r0 = r15.c
            boolean r3 = r0 instanceof defpackage.rs9
            if (r3 == 0) goto L_0x00d1
            jua r15 = r15.i
            android.content.Context r15 = r15.a
            int r0 = defpackage.qad.e3
            java.lang.String r15 = r15.getString(r0)
        L_0x00cf:
            r11 = r15
            goto L_0x00e0
        L_0x00d1:
            boolean r0 = r0 instanceof defpackage.qs9
            if (r0 == 0) goto L_0x0157
            jua r15 = r15.i
            android.content.Context r15 = r15.a
            int r0 = defpackage.qad.g3
            java.lang.String r15 = r15.getString(r0)
            goto L_0x00cf
        L_0x00e0:
            ru.ok.messages.settings.folders.picker.FoldersPickerViewModel r15 = r14.v
            xme r0 = r15.l
            z76 r3 = new z76
            java.util.List r15 = r15.p
            boolean r7 = r15.isEmpty()
            java.util.ArrayList r8 = new java.util.ArrayList
            ru.ok.messages.settings.folders.picker.FoldersPickerViewModel r15 = r14.v
            java.util.List r15 = r15.p
            java.util.Collection r15 = (java.util.Collection) r15
            r8.<init>(r15)
            r15 = r9
            java.util.Collection r15 = (java.util.Collection) r15
            boolean r15 = r15.isEmpty()
            r10 = r15 ^ 1
            ru.ok.messages.settings.folders.picker.FoldersPickerViewModel r15 = r14.v
            ss9 r15 = r15.c
            boolean r12 = r15 instanceof defpackage.rs9
            r6 = r3
            r6.<init>(r7, r8, r9, r10, r11, r12)
            r0.getClass()
            r0.m(r2, r3)
            boolean r15 = r1.isEmpty()
            if (r15 == 0) goto L_0x0154
            ru.ok.messages.settings.folders.picker.FoldersPickerViewModel r14 = r14.v
            java.util.List r15 = r14.p
            java.util.Collection r15 = (java.util.Collection) r15
            boolean r15 = r15.isEmpty()
            r15 = r15 ^ r5
            if (r15 == 0) goto L_0x0124
            goto L_0x0154
        L_0x0124:
            u82 r15 = r14.h
            ia2 r15 = (defpackage.ia2) r15
            on2 r15 = r15.j()
            k86 r0 = new k86
            r0.<init>(r14, r2)
            ps5 r1 = new ps5
            r2 = 5
            r1.<init>(r15, r0, r2)
            eu5 r15 = new eu5
            r0 = 0
            r15.<init>(r1, r0)
            eu5 r15 = defpackage.bs0.Y(r15, r5)
            gaf r0 = r14.k
            osa r0 = (defpackage.osa) r0
            q04 r0 = r0.a()
            bs5 r15 = defpackage.bs0.F(r15, r0)
            u33 r14 = defpackage.b0h.C(r14)
            defpackage.bs0.K(r15, r14)
        L_0x0154:
            kotlin.Unit r14 = kotlin.Unit.INSTANCE
            return r14
        L_0x0157:
            kotlin.NoWhenBranchMatchedException r14 = new kotlin.NoWhenBranchMatchedException
            r14.<init>()
            throw r14
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.t76.invokeSuspend(java.lang.Object):java.lang.Object");
    }
}
