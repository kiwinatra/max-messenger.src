package defpackage;

import java.util.List;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function2;
import ru.ok.messages.settings.folders.page.FolderPageViewModel;

/* renamed from: o36  reason: default package */
public final class o36 extends SuspendLambda implements Function2 {
    public List a;
    public String b;
    public int c;
    public final /* synthetic */ zx5 o;
    public final /* synthetic */ FolderPageViewModel v;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public o36(zx5 zx5, FolderPageViewModel folderPageViewModel, Continuation continuation) {
        super(2, continuation);
        this.o = zx5;
        this.v = folderPageViewModel;
    }

    public final Continuation create(Object obj, Continuation continuation) {
        return new o36(this.o, this.v, continuation);
    }

    public final Object invoke(Object obj, Object obj2) {
        return ((o36) create((d14) obj, (Continuation) obj2)).invokeSuspend(Unit.INSTANCE);
    }

    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r6v19, resolved type: java.lang.Object} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r1v11, resolved type: java.lang.String} */
    /* JADX WARNING: Multi-variable type inference failed */
    /* JADX WARNING: Removed duplicated region for block: B:116:0x0400  */
    /* JADX WARNING: Removed duplicated region for block: B:120:0x0429 A[LOOP:2: B:118:0x0423->B:120:0x0429, LOOP_END] */
    /* JADX WARNING: Removed duplicated region for block: B:75:0x021e A[RETURN] */
    /* JADX WARNING: Removed duplicated region for block: B:79:0x0242  */
    /* JADX WARNING: Removed duplicated region for block: B:84:0x0291 A[RETURN] */
    /* JADX WARNING: Removed duplicated region for block: B:85:0x0292  */
    /* JADX WARNING: Removed duplicated region for block: B:88:0x02a4  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final java.lang.Object invokeSuspend(java.lang.Object r22) {
        /*
            r21 = this;
            r0 = r21
            r1 = 1
            java.lang.Object r2 = kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED()
            int r3 = r0.c
            r4 = 0
            r5 = 4
            r6 = 3
            r7 = 2
            if (r3 == 0) goto L_0x0045
            if (r3 == r1) goto L_0x003e
            if (r3 == r7) goto L_0x0037
            if (r3 == r6) goto L_0x002c
            if (r3 != r5) goto L_0x0024
            java.lang.String r2 = r0.b
            java.util.List r3 = r0.a
            java.util.List r3 = (java.util.List) r3
            kotlin.ResultKt.throwOnFailure(r22)
            r5 = r22
            goto L_0x0293
        L_0x0024:
            java.lang.IllegalStateException r0 = new java.lang.IllegalStateException
            java.lang.String r1 = "call to 'resume' before 'invoke' with coroutine"
            r0.<init>(r1)
            throw r0
        L_0x002c:
            java.util.List r3 = r0.a
            java.util.List r3 = (java.util.List) r3
            kotlin.ResultKt.throwOnFailure(r22)
            r5 = r22
            goto L_0x021f
        L_0x0037:
            kotlin.ResultKt.throwOnFailure(r22)
            r3 = r22
            goto L_0x01fb
        L_0x003e:
            kotlin.ResultKt.throwOnFailure(r22)
            r1 = r22
            goto L_0x0178
        L_0x0045:
            kotlin.ResultKt.throwOnFailure(r22)
            zx5 r3 = r0.o
            boolean r9 = r3.x
            if (r9 != 0) goto L_0x00b8
            boolean r1 = r3.b()
            if (r1 == 0) goto L_0x0062
            ru.ok.messages.settings.folders.page.FolderPageViewModel r1 = r0.v
            jua r1 = r1.g
            android.content.Context r1 = r1.a
            int r2 = defpackage.qad.j3
            java.lang.String r1 = r1.getString(r2)
            r13 = r1
            goto L_0x0063
        L_0x0062:
            r13 = r4
        L_0x0063:
            ru.ok.messages.settings.folders.page.FolderPageViewModel r1 = r0.v
            g36 r2 = new g36
            zx5 r3 = r0.o
            java.lang.String r10 = r3.a
            j16 r5 = r1.d
            m58 r11 = r5.a(r3)
            zx5 r3 = r0.o
            java.lang.CharSequence r12 = r3.b
            ru.ok.messages.settings.folders.page.FolderPageViewModel r3 = r0.v
            z26 r3 = r3.p
            boolean r5 = r3 instanceof defpackage.z26
            if (r5 == 0) goto L_0x007e
            goto L_0x007f
        L_0x007e:
            r3 = r4
        L_0x007f:
            if (r3 == 0) goto L_0x0086
            boolean r8 = r3.b
            r19 = r8
            goto L_0x0088
        L_0x0086:
            r19 = 0
        L_0x0088:
            ru.ok.messages.settings.folders.page.FolderPageViewModel r0 = r0.v
            xme r0 = r0.k
            java.lang.Object r0 = r0.getValue()
            g36 r0 = (defpackage.g36) r0
            if (r0 == 0) goto L_0x009c
            java.util.List r0 = r0.k
            if (r0 != 0) goto L_0x0099
            goto L_0x009c
        L_0x0099:
            r20 = r0
            goto L_0x00a1
        L_0x009c:
            java.util.List r0 = kotlin.collections.CollectionsKt.emptyList()
            goto L_0x0099
        L_0x00a1:
            r17 = 0
            r18 = 0
            r14 = 0
            r15 = 0
            r16 = 0
            r9 = r2
            r9.<init>(r10, r11, r12, r13, r14, r15, r16, r17, r18, r19, r20)
            xme r0 = r1.k
            r0.getClass()
            r0.m(r4, r2)
            kotlin.Unit r0 = kotlin.Unit.INSTANCE
            return r0
        L_0x00b8:
            boolean r3 = r3.b()
            if (r3 == 0) goto L_0x00cc
            ru.ok.messages.settings.folders.page.FolderPageViewModel r3 = r0.v
            jua r3 = r3.g
            android.content.Context r3 = r3.a
            int r9 = defpackage.qad.j3
            java.lang.String r3 = r3.getString(r9)
            r13 = r3
            goto L_0x00cd
        L_0x00cc:
            r13 = r4
        L_0x00cd:
            zx5 r3 = r0.o
            boolean r3 = r3.b()
            r14 = r3 ^ 1
            zx5 r3 = r0.o
            java.util.Set r3 = r3.w
            boolean r3 = r3.isEmpty()
            if (r3 == 0) goto L_0x00e9
            zx5 r3 = r0.o
            boolean r3 = r3.b()
            if (r3 != 0) goto L_0x00e9
            r15 = r1
            goto L_0x00ea
        L_0x00e9:
            r15 = 0
        L_0x00ea:
            ru.ok.messages.settings.folders.page.FolderPageViewModel r3 = r0.v
            g36 r12 = new g36
            zx5 r9 = r0.o
            java.lang.String r10 = r9.a
            j16 r11 = r3.d
            m58 r11 = r11.a(r9)
            zx5 r9 = r0.o
            java.lang.CharSequence r8 = r9.b
            boolean r9 = r9.b()
            r16 = r9 ^ 1
            ru.ok.messages.settings.folders.page.FolderPageViewModel r9 = r0.v
            xme r9 = r9.k
            java.lang.Object r9 = r9.getValue()
            g36 r9 = (defpackage.g36) r9
            if (r9 == 0) goto L_0x0116
            java.util.List r9 = r9.h
            if (r9 != 0) goto L_0x0113
            goto L_0x0116
        L_0x0113:
            r17 = r9
            goto L_0x011b
        L_0x0116:
            java.util.List r9 = kotlin.collections.CollectionsKt.emptyList()
            goto L_0x0113
        L_0x011b:
            ru.ok.messages.settings.folders.page.FolderPageViewModel r9 = r0.v
            z26 r9 = r9.p
            boolean r5 = r9 instanceof defpackage.z26
            if (r5 == 0) goto L_0x0124
            goto L_0x0125
        L_0x0124:
            r9 = r4
        L_0x0125:
            if (r9 == 0) goto L_0x012c
            boolean r5 = r9.b
            r19 = r5
            goto L_0x012e
        L_0x012c:
            r19 = 0
        L_0x012e:
            ru.ok.messages.settings.folders.page.FolderPageViewModel r5 = r0.v
            xme r5 = r5.k
            java.lang.Object r5 = r5.getValue()
            g36 r5 = (defpackage.g36) r5
            if (r5 == 0) goto L_0x0142
            java.util.List r5 = r5.k
            if (r5 != 0) goto L_0x013f
            goto L_0x0142
        L_0x013f:
            r20 = r5
            goto L_0x0147
        L_0x0142:
            java.util.List r5 = kotlin.collections.CollectionsKt.emptyList()
            goto L_0x013f
        L_0x0147:
            r18 = 0
            r9 = r12
            r5 = r12
            r12 = r8
            r9.<init>(r10, r11, r12, r13, r14, r15, r16, r17, r18, r19, r20)
            xme r3 = r3.k
            r3.getClass()
            r3.m(r4, r5)
            zx5 r3 = r0.o
            boolean r3 = r3.b()
            if (r3 == 0) goto L_0x01de
            ru.ok.messages.settings.folders.page.FolderPageViewModel r3 = r0.v
            u82 r3 = r3.h
            r0.c = r1
            ia2 r3 = (defpackage.ia2) r3
            r3.getClass()
            j92 r1 = new j92
            r1.<init>(r3, r4)
            kotlin.coroutines.CoroutineContext r3 = r3.x
            java.lang.Object r1 = defpackage.ev0.I(r3, r1, r0)
            if (r1 != r2) goto L_0x0178
            return r2
        L_0x0178:
            java.lang.Iterable r1 = (java.lang.Iterable) r1
            kotlin.sequences.Sequence r1 = kotlin.collections.CollectionsKt.asSequence(r1)
            ru.ok.messages.settings.folders.page.FolderPageViewModel r2 = r0.v
            rx2 r3 = new rx2
            r5 = 16
            r3.<init>(r5, r2)
            kotlin.sequences.Sequence r1 = kotlin.sequences.SequencesKt.map(r1, r3)
            java.util.List r1 = kotlin.sequences.SequencesKt.toList(r1)
            ru.ok.messages.settings.folders.page.FolderPageViewModel r0 = r0.v
            g36 r2 = r0.k()
            java.util.ArrayList r3 = new java.util.ArrayList
            r3.<init>()
            w26 r5 = new w26
            xq4 r6 = defpackage.xq4.THIN_DIVIDER
            r5.<init>()
            r3.add(r5)
            r5 = r1
            java.lang.Iterable r5 = (java.lang.Iterable) r5
            java.util.ArrayList r6 = new java.util.ArrayList
            int r7 = kotlin.collections.CollectionsKt__IterablesKt.collectionSizeOrDefault(r5, 10)
            r6.<init>(r7)
            java.util.Iterator r5 = r5.iterator()
        L_0x01b4:
            boolean r7 = r5.hasNext()
            if (r7 == 0) goto L_0x01c9
            java.lang.Object r7 = r5.next()
            c05 r7 = (defpackage.c05) r7
            x26 r8 = new x26
            r8.<init>(r7)
            r6.add(r8)
            goto L_0x01b4
        L_0x01c9:
            r3.addAll(r6)
            kotlin.Unit r5 = kotlin.Unit.INSTANCE
            r5 = 639(0x27f, float:8.95E-43)
            g36 r1 = defpackage.g36.a(r2, r4, r1, r3, r5)
            xme r0 = r0.k
            r0.getClass()
            r0.m(r4, r1)
            goto L_0x044f
        L_0x01de:
            ru.ok.messages.settings.folders.page.FolderPageViewModel r3 = r0.v
            u82 r3 = r3.h
            zx5 r5 = r0.o
            java.util.Set r5 = r5.w
            r0.c = r7
            ia2 r3 = (defpackage.ia2) r3
            r3.getClass()
            h92 r8 = new h92
            r8.<init>(r3, r5, r4)
            kotlin.coroutines.CoroutineContext r3 = r3.x
            java.lang.Object r3 = defpackage.ev0.I(r3, r8, r0)
            if (r3 != r2) goto L_0x01fb
            return r2
        L_0x01fb:
            java.util.List r3 = (java.util.List) r3
            ru.ok.messages.settings.folders.page.FolderPageViewModel r5 = r0.v
            u82 r5 = r5.h
            zx5 r8 = r0.o
            java.lang.String r8 = r8.a
            r9 = r3
            java.util.List r9 = (java.util.List) r9
            r0.a = r9
            r0.c = r6
            ia2 r5 = (defpackage.ia2) r5
            r5.getClass()
            k92 r6 = new k92
            r6.<init>(r5, r8, r4)
            kotlin.coroutines.CoroutineContext r5 = r5.x
            java.lang.Object r5 = defpackage.ev0.I(r5, r6, r0)
            if (r5 != r2) goto L_0x021f
            return r2
        L_0x021f:
            java.util.List r5 = (java.util.List) r5
            ru.ok.messages.settings.folders.page.FolderPageViewModel r6 = r0.v
            u82 r6 = r6.h
            ia2 r6 = (defpackage.ia2) r6
            kotlin.Lazy r6 = r6.G0
            java.lang.Object r6 = r6.getValue()
            java.util.List r6 = (java.util.List) r6
            java.lang.Iterable r6 = (java.lang.Iterable) r6
            zx5 r8 = r0.o
            java.util.ArrayList r9 = new java.util.ArrayList
            r9.<init>()
            java.util.Iterator r6 = r6.iterator()
        L_0x023c:
            boolean r10 = r6.hasNext()
            if (r10 == 0) goto L_0x0259
            java.lang.Object r10 = r6.next()
            r11 = r10
            kotlin.Pair r11 = (kotlin.Pair) r11
            java.util.Set r12 = r8.w
            java.lang.Object r11 = r11.getFirst()
            boolean r11 = r12.contains(r11)
            if (r11 == 0) goto L_0x023c
            r9.add(r10)
            goto L_0x023c
        L_0x0259:
            of3 r14 = new of3
            r6 = 19
            r14.<init>(r6)
            r12 = 0
            r13 = 0
            java.lang.String r10 = ", "
            r11 = 0
            r15 = 30
            java.lang.String r6 = kotlin.collections.CollectionsKt___CollectionsKt.joinToString$default(r9, r10, r11, r12, 0, r13, r14, r15, (java.lang.Object) null)
            ru.ok.messages.settings.folders.page.FolderPageViewModel r8 = r0.v
            zx5 r9 = r0.o
            boolean r9 = r9.b()
            r9 = r9 ^ r1
            r10 = r3
            java.util.List r10 = (java.util.List) r10
            r0.a = r10
            r0.b = r6
            r10 = 4
            r0.c = r10
            gaf r10 = r8.j
            osa r10 = (defpackage.osa) r10
            q04 r10 = r10.a()
            r36 r11 = new r36
            r11.<init>(r5, r8, r9, r4)
            java.lang.Object r5 = defpackage.ev0.I(r10, r11, r0)
            if (r5 != r2) goto L_0x0292
            return r2
        L_0x0292:
            r2 = r6
        L_0x0293:
            java.util.Collection r5 = (java.util.Collection) r5
            java.util.List r5 = kotlin.collections.CollectionsKt.toMutableList(r5)
            zx5 r6 = r0.o
            java.util.Set r6 = r6.w
            boolean r6 = r6.isEmpty()
            r6 = r6 ^ r1
            if (r6 == 0) goto L_0x03c7
            zx5 r6 = r0.o
            java.util.Set r6 = r6.w
            java.util.ArrayList r8 = new java.util.ArrayList
            r8.<init>()
            int r3 = r3.size()
            ru.ok.messages.settings.folders.page.FolderPageViewModel r9 = r0.v
            q82 r10 = defpackage.q82.w
            boolean r10 = r6.contains(r10)
            if (r10 == 0) goto L_0x02cc
            jua r10 = r9.g
            android.content.Context r10 = r10.a
            android.content.res.Resources r10 = r10.getResources()
            int r11 = defpackage.pad.c
            java.lang.String r10 = r10.getQuantityString(r11, r3)
            r8.add(r10)
        L_0x02cc:
            q82 r10 = defpackage.q82.y
            boolean r10 = r6.contains(r10)
            if (r10 == 0) goto L_0x02e5
            jua r10 = r9.g
            android.content.Context r10 = r10.a
            android.content.res.Resources r10 = r10.getResources()
            int r11 = defpackage.pad.d
            java.lang.String r10 = r10.getQuantityString(r11, r3)
            r8.add(r10)
        L_0x02e5:
            q82 r10 = defpackage.q82.z
            boolean r10 = r6.contains(r10)
            if (r10 == 0) goto L_0x02fe
            jua r10 = r9.g
            android.content.Context r10 = r10.a
            android.content.res.Resources r10 = r10.getResources()
            int r11 = defpackage.pad.e
            java.lang.String r10 = r10.getQuantityString(r11, r3)
            r8.add(r10)
        L_0x02fe:
            q82 r10 = defpackage.q82.v
            boolean r10 = r6.contains(r10)
            if (r10 == 0) goto L_0x0317
            jua r10 = r9.g
            android.content.Context r10 = r10.a
            android.content.res.Resources r10 = r10.getResources()
            int r11 = defpackage.pad.b
            java.lang.String r10 = r10.getQuantityString(r11, r3)
            r8.add(r10)
        L_0x0317:
            q82 r10 = defpackage.q82.X
            boolean r6 = r6.contains(r10)
            if (r6 == 0) goto L_0x0330
            jua r6 = r9.g
            android.content.Context r6 = r6.a
            android.content.res.Resources r6 = r6.getResources()
            int r9 = defpackage.pad.a
            java.lang.String r6 = r6.getQuantityString(r9, r3)
            r8.add(r6)
        L_0x0330:
            int r6 = r8.size()
            java.lang.String r15 = " "
            if (r6 <= r7) goto L_0x036c
            r12 = 0
            r13 = 0
            java.lang.String r9 = ", "
            r10 = 0
            r11 = 0
            r14 = 62
            java.lang.String r6 = kotlin.collections.CollectionsKt___CollectionsKt.joinToString$default(r8, r9, r10, r11, 0, r12, r13, r14, (java.lang.Object) null)
            java.lang.String r7 = ","
            int r7 = kotlin.text.StringsKt__StringsKt.lastIndexOf$default((java.lang.CharSequence) r6, (java.lang.String) r7, 0, false, 6, (java.lang.Object) null)
            int r1 = r1 + r7
            ru.ok.messages.settings.folders.page.FolderPageViewModel r8 = r0.v
            jua r8 = r8.g
            android.content.Context r8 = r8.a
            int r9 = defpackage.qad.F2
            java.lang.String r8 = r8.getString(r9)
            java.lang.StringBuilder r9 = new java.lang.StringBuilder
            r9.<init>(r15)
            r9.append(r8)
            java.lang.String r8 = r9.toString()
            java.lang.CharSequence r1 = kotlin.text.StringsKt.replaceRange((java.lang.CharSequence) r6, (int) r7, (int) r1, (java.lang.CharSequence) r8)
            java.lang.String r1 = r1.toString()
            goto L_0x03ac
        L_0x036c:
            int r6 = r8.size()
            if (r6 != r7) goto L_0x038d
            ru.ok.messages.settings.folders.page.FolderPageViewModel r1 = r0.v
            jua r1 = r1.g
            android.content.Context r1 = r1.a
            int r6 = defpackage.qad.F2
            java.lang.String r1 = r1.getString(r6)
            java.lang.String r9 = defpackage.wj6.k(r15, r1, r15)
            r12 = 0
            r13 = 0
            r10 = 0
            r11 = 0
            r14 = 62
            java.lang.String r1 = kotlin.collections.CollectionsKt___CollectionsKt.joinToString$default(r8, r9, r10, r11, 0, r12, r13, r14, (java.lang.Object) null)
            goto L_0x03ac
        L_0x038d:
            int r6 = r8.size()
            if (r6 != r1) goto L_0x039c
            r1 = 0
            java.lang.Object r6 = r8.get(r1)
            r1 = r6
            java.lang.String r1 = (java.lang.String) r1
            goto L_0x03ac
        L_0x039c:
            ru.ok.messages.settings.folders.page.FolderPageViewModel r1 = r0.v
            jua r1 = r1.g
            android.content.Context r1 = r1.a
            android.content.res.Resources r1 = r1.getResources()
            int r6 = defpackage.pad.c
            java.lang.String r1 = r1.getQuantityString(r6, r3)
        L_0x03ac:
            java.lang.StringBuilder r6 = new java.lang.StringBuilder
            r6.<init>()
            r6.append(r3)
            r6.append(r15)
            r6.append(r1)
            java.lang.String r1 = r6.toString()
            s26 r3 = new s26
            r6 = 0
            r3.<init>(r1, r2, r4, r6)
            r5.add(r6, r3)
        L_0x03c7:
            ru.ok.messages.settings.folders.page.FolderPageViewModel r1 = r0.v
            g36 r2 = r1.k()
            zx5 r0 = r0.o
            java.util.List r3 = kotlin.collections.CollectionsKt.createListBuilder()
            w26 r6 = new w26
            xq4 r7 = defpackage.xq4.THIN_DIVIDER
            r6.<init>()
            r3.add(r6)
            w26 r6 = new w26
            r6.<init>()
            r3.add(r6)
            u26 r6 = new u26
            n26 r7 = new n26
            int r8 = defpackage.lic.add_chats_to_folder
            int r9 = defpackage.nad.n
            int r10 = defpackage.qad.C2
            r7.<init>(r8, r9, r10)
            r6.<init>(r7)
            r3.add(r6)
            java.util.Set r0 = r0.w
            boolean r0 = r0.isEmpty()
            if (r0 == 0) goto L_0x0413
            u26 r0 = new u26
            n26 r6 = new n26
            int r7 = defpackage.lic.filter_chats_in_folder
            int r8 = defpackage.nad.m0
            int r9 = defpackage.qad.T2
            r6.<init>(r7, r8, r9)
            r0.<init>(r6)
            r3.add(r0)
        L_0x0413:
            r0 = r5
            java.lang.Iterable r0 = (java.lang.Iterable) r0
            java.util.ArrayList r6 = new java.util.ArrayList
            int r7 = kotlin.collections.CollectionsKt__IterablesKt.collectionSizeOrDefault(r0, 10)
            r6.<init>(r7)
            java.util.Iterator r0 = r0.iterator()
        L_0x0423:
            boolean r7 = r0.hasNext()
            if (r7 == 0) goto L_0x0438
            java.lang.Object r7 = r0.next()
            s26 r7 = (defpackage.s26) r7
            v26 r8 = new v26
            r8.<init>(r7)
            r6.add(r8)
            goto L_0x0423
        L_0x0438:
            r3.addAll(r6)
            kotlin.Unit r0 = kotlin.Unit.INSTANCE
            java.util.List r0 = kotlin.collections.CollectionsKt.build(r3)
            r3 = 895(0x37f, float:1.254E-42)
            g36 r0 = defpackage.g36.a(r2, r5, r4, r0, r3)
            xme r1 = r1.k
            r1.getClass()
            r1.m(r4, r0)
        L_0x044f:
            kotlin.Unit r0 = kotlin.Unit.INSTANCE
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.o36.invokeSuspend(java.lang.Object):java.lang.Object");
    }
}
