package defpackage;

import java.util.Collection;
import java.util.Iterator;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function2;
import ru.ok.messages.settings.folders.picker.FoldersPickerViewModel;

/* renamed from: i86  reason: default package */
public final class i86 extends SuspendLambda implements Function2 {
    public final /* synthetic */ FoldersPickerViewModel X;
    public FoldersPickerViewModel a;
    public String b;
    public Collection c;
    public Iterator o;
    public w16 v;
    public Collection w;
    public int x;
    public /* synthetic */ Object y;
    public final /* synthetic */ String z;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public i86(String str, FoldersPickerViewModel foldersPickerViewModel, Continuation continuation) {
        super(2, continuation);
        this.z = str;
        this.X = foldersPickerViewModel;
    }

    public final Continuation create(Object obj, Continuation continuation) {
        i86 i86 = new i86(this.z, this.X, continuation);
        i86.y = obj;
        return i86;
    }

    public final Object invoke(Object obj, Object obj2) {
        return ((i86) create((d14) obj, (Continuation) obj2)).invokeSuspend(Unit.INSTANCE);
    }

    /* JADX WARNING: Removed duplicated region for block: B:19:0x009a  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final java.lang.Object invokeSuspend(java.lang.Object r19) {
        /*
            r18 = this;
            r0 = r18
            java.lang.Object r1 = kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED()
            int r2 = r0.x
            r3 = 2
            r4 = 1
            r5 = 0
            if (r2 == 0) goto L_0x003f
            if (r2 == r4) goto L_0x003a
            if (r2 != r3) goto L_0x0032
            java.util.Collection r2 = r0.w
            java.util.Collection r2 = (java.util.Collection) r2
            w16 r4 = r0.v
            java.util.Iterator r6 = r0.o
            java.util.Collection r7 = r0.c
            java.util.Collection r7 = (java.util.Collection) r7
            java.lang.String r8 = r0.b
            ru.ok.messages.settings.folders.picker.FoldersPickerViewModel r9 = r0.a
            java.lang.Object r10 = r0.y
            d14 r10 = (defpackage.d14) r10
            kotlin.ResultKt.throwOnFailure(r19)
            r11 = r10
            r10 = r9
            r9 = r8
            r8 = r6
            r6 = r4
            r4 = r7
            r7 = r19
            goto L_0x00d1
        L_0x0032:
            java.lang.IllegalStateException r0 = new java.lang.IllegalStateException
            java.lang.String r1 = "call to 'resume' before 'invoke' with coroutine"
            r0.<init>(r1)
            throw r0
        L_0x003a:
            kotlin.ResultKt.throwOnFailure(r19)
            goto L_0x012b
        L_0x003f:
            kotlin.ResultKt.throwOnFailure(r19)
            java.lang.Object r2 = r0.y
            d14 r2 = (defpackage.d14) r2
            java.lang.String r6 = r0.z
            if (r6 == 0) goto L_0x010a
            int r6 = r6.length()
            if (r6 != 0) goto L_0x0052
            goto L_0x010a
        L_0x0052:
            boolean r4 = defpackage.e14.f(r2)
            if (r4 != 0) goto L_0x005b
            kotlin.Unit r0 = kotlin.Unit.INSTANCE
            return r0
        L_0x005b:
            ru.ok.messages.settings.folders.picker.FoldersPickerViewModel r4 = r0.X
            java.util.List r4 = r4.p
            java.lang.Iterable r4 = (java.lang.Iterable) r4
            kotlin.sequences.Sequence r4 = kotlin.collections.CollectionsKt.asSequence(r4)
            kotlin.sequences.Sequence r4 = kotlin.sequences.SequencesKt___SequencesJvmKt.filterIsInstance(r4, defpackage.w16.class)
            ru.ok.messages.settings.folders.picker.FoldersPickerViewModel r6 = r0.X
            java.lang.String r7 = r0.z
            wk r8 = new wk
            r9 = 15
            r8.<init>(r9, r6, r7)
            kotlin.sequences.Sequence r4 = kotlin.sequences.SequencesKt.filter(r4, r8)
            java.util.List r4 = kotlin.sequences.SequencesKt.toList(r4)
            java.lang.Iterable r4 = (java.lang.Iterable) r4
            ru.ok.messages.settings.folders.picker.FoldersPickerViewModel r6 = r0.X
            java.lang.String r7 = r0.z
            java.util.ArrayList r8 = new java.util.ArrayList
            int r9 = kotlin.collections.CollectionsKt__IterablesKt.collectionSizeOrDefault(r4, 10)
            r8.<init>(r9)
            java.util.Iterator r4 = r4.iterator()
            r10 = r2
            r9 = r6
            r2 = r8
            r6 = r4
            r8 = r7
        L_0x0094:
            boolean r4 = r6.hasNext()
            if (r4 == 0) goto L_0x00e3
            java.lang.Object r4 = r6.next()
            w16 r4 = (defpackage.w16) r4
            my6 r7 = r9.e
            java.lang.CharSequence r11 = r4.c
            r0.y = r10
            r0.a = r9
            r0.b = r8
            r12 = r2
            java.util.Collection r12 = (java.util.Collection) r12
            r0.c = r12
            r0.o = r6
            r0.v = r4
            r0.w = r12
            r0.x = r3
            gaf r12 = r7.b
            osa r12 = (defpackage.osa) r12
            q04 r12 = r12.a()
            ly6 r13 = new ly6
            r13.<init>(r8, r11, r7, r5)
            java.lang.Object r7 = defpackage.ev0.I(r12, r13, r0)
            if (r7 != r1) goto L_0x00cb
            return r1
        L_0x00cb:
            r11 = r10
            r10 = r9
            r9 = r8
            r8 = r6
            r6 = r4
            r4 = r2
        L_0x00d1:
            java.lang.CharSequence r7 = (java.lang.CharSequence) r7
            r12 = 59
            r13 = 0
            w16 r6 = defpackage.w16.a(r6, r7, r13, r12)
            r2.add(r6)
            r2 = r4
            r6 = r8
            r8 = r9
            r9 = r10
            r10 = r11
            goto L_0x0094
        L_0x00e3:
            r14 = r2
            java.util.List r14 = (java.util.List) r14
            boolean r1 = defpackage.e14.f(r10)
            if (r1 != 0) goto L_0x00ef
            kotlin.Unit r0 = kotlin.Unit.INSTANCE
            return r0
        L_0x00ef:
            ru.ok.messages.settings.folders.picker.FoldersPickerViewModel r0 = r0.X
            xme r1 = r0.l
            z76 r12 = r0.k()
            r15 = 0
            r16 = 0
            r13 = 0
            r17 = 61
            z76 r0 = defpackage.z76.a(r12, r13, r14, r15, r16, r17)
            r1.getClass()
            r1.m(r5, r0)
            kotlin.Unit r0 = kotlin.Unit.INSTANCE
            return r0
        L_0x010a:
            ru.ok.messages.settings.folders.picker.FoldersPickerViewModel r2 = r0.X
            r0.x = r4
            gaf r3 = r2.k
            osa r3 = (defpackage.osa) r3
            q04 r3 = r3.a()
            h86 r4 = new h86
            r4.<init>(r2, r5)
            java.lang.Object r0 = defpackage.ev0.I(r3, r4, r0)
            java.lang.Object r2 = kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED()
            if (r0 != r2) goto L_0x0126
            goto L_0x0128
        L_0x0126:
            kotlin.Unit r0 = kotlin.Unit.INSTANCE
        L_0x0128:
            if (r0 != r1) goto L_0x012b
            return r1
        L_0x012b:
            kotlin.Unit r0 = kotlin.Unit.INSTANCE
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.i86.invokeSuspend(java.lang.Object):java.lang.Object");
    }
}
