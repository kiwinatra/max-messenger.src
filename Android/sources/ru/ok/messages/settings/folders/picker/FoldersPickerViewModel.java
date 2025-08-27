package ru.ok.messages.settings.folders.picker;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.concurrent.CancellationException;
import kotlin.Metadata;
import kotlin.NoWhenBranchMatchedException;
import kotlin.collections.CollectionsKt;
import kotlin.coroutines.Continuation;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;

@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\u0018\u00002\u00020\u0001:\u0003\u0002\u0003\u0004¨\u0006\u0005"}, d2 = {"Lru/ok/messages/settings/folders/picker/FoldersPickerViewModel;", "Lyag;", "m86", "z76", "y76", "tamtam-app_release"}, k = 1, mv = {2, 0, 0})
@SourceDebugExtension({"SMAP\nFoldersPickerViewModel.kt\nKotlin\n*S Kotlin\n*F\n+ 1 FoldersPickerViewModel.kt\nru/ok/messages/settings/folders/picker/FoldersPickerViewModel\n+ 2 _Collections.kt\nkotlin/collections/CollectionsKt___CollectionsKt\n+ 3 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,331:1\n1557#2:332\n1628#2,3:333\n1755#2,3:336\n295#2,2:339\n1611#2,9:341\n1863#2:350\n1557#2:351\n1628#2,3:352\n1755#2,3:355\n1864#2:359\n1620#2:360\n1#3:358\n*S KotlinDebug\n*F\n+ 1 FoldersPickerViewModel.kt\nru/ok/messages/settings/folders/picker/FoldersPickerViewModel\n*L\n125#1:332\n125#1:333,3\n261#1:336,3\n268#1:339,2\n275#1:341,9\n275#1:350\n281#1:351\n281#1:352,3\n296#1:355,3\n275#1:359\n275#1:360\n275#1:358\n*E\n"})
public final class FoldersPickerViewModel extends yag {
    public final ss9 c;
    public final j16 d;
    public final my6 e;
    public final r62 f;
    public final tld g;
    public final u82 h;
    public final jua i;
    public final nd j;
    public final gaf k;
    public final xme l;
    public final etc m;
    public final xme n;
    public final etc o;
    public volatile List p = new ArrayList();
    public volatile aje q;
    public volatile String r;
    public final q04 s;

    public FoldersPickerViewModel(ss9 ss9, j16 j16, my6 my6, r62 r62, tld tld, u82 u82, jua jua, nd ndVar, gaf gaf) {
        this.c = ss9;
        this.d = j16;
        this.e = my6;
        this.f = r62;
        this.g = tld;
        this.h = u82;
        this.i = jua;
        this.j = ndVar;
        this.k = gaf;
        xme a = f6e.a(new z76(false, CollectionsKt.emptyList(), CollectionsKt.emptyList(), false, "", false));
        this.l = a;
        this.m = new etc(a);
        xme a2 = f6e.a((Object) null);
        this.n = a2;
        this.o = new etc(a2);
        osa osa = (osa) gaf;
        q04 a3 = osa.a();
        p04 p04 = q04.a;
        this.s = a3.s0(1, (String) null);
        ev0.v(b0h.C(this), osa.a(), (f14) null, new t76(this, (Continuation) null), 2);
    }

    /* JADX WARNING: type inference failed for: r5v0 */
    /* JADX WARNING: type inference failed for: r5v1 */
    /* JADX WARNING: type inference failed for: r5v3 */
    /* JADX WARNING: type inference failed for: r5v4, types: [m58, java.lang.String] */
    /* JADX WARNING: type inference failed for: r5v5 */
    /* JADX WARNING: type inference failed for: r5v9 */
    /* JADX WARNING: type inference failed for: r5v12 */
    /* JADX WARNING: Code restructure failed: missing block: B:34:0x00ce, code lost:
        if (r0.x != false) goto L_0x00db;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:38:0x00d9, code lost:
        if (r0.b() == false) goto L_0x00db;
     */
    /* JADX WARNING: Removed duplicated region for block: B:102:? A[RETURN, SYNTHETIC] */
    /* JADX WARNING: Removed duplicated region for block: B:15:0x006e  */
    /* JADX WARNING: Removed duplicated region for block: B:18:0x0086  */
    /* JADX WARNING: Removed duplicated region for block: B:71:0x01da  */
    /* JADX WARNING: Removed duplicated region for block: B:72:0x01dd  */
    /* JADX WARNING: Removed duplicated region for block: B:74:0x01e0  */
    /* JADX WARNING: Removed duplicated region for block: B:77:0x01f0  */
    /* JADX WARNING: Removed duplicated region for block: B:81:0x01ff  */
    /* JADX WARNING: Removed duplicated region for block: B:82:0x0201  */
    /* JADX WARNING: Removed duplicated region for block: B:8:0x002e  */
    /* JADX WARNING: Removed duplicated region for block: B:90:0x021a  */
    /* JADX WARNING: Removed duplicated region for block: B:92:0x0222  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static final java.lang.Object j(ru.ok.messages.settings.folders.picker.FoldersPickerViewModel r19, java.util.List r20, kotlin.coroutines.Continuation r21) {
        /*
            r0 = r21
            r19.getClass()
            boolean r1 = r0 instanceof defpackage.g86
            if (r1 == 0) goto L_0x001a
            r1 = r0
            g86 r1 = (defpackage.g86) r1
            int r2 = r1.Y
            r3 = -2147483648(0xffffffff80000000, float:-0.0)
            r4 = r2 & r3
            if (r4 == 0) goto L_0x001a
            int r2 = r2 - r3
            r1.Y = r2
            r2 = r19
            goto L_0x0021
        L_0x001a:
            g86 r1 = new g86
            r2 = r19
            r1.<init>(r2, r0)
        L_0x0021:
            java.lang.Object r0 = r1.z
            java.lang.Object r3 = kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED()
            int r4 = r1.Y
            r5 = 0
            r6 = 2
            r8 = 1
            if (r4 == 0) goto L_0x006e
            if (r4 == r8) goto L_0x005d
            if (r4 != r6) goto L_0x0055
            int r2 = r1.y
            boolean r4 = r1.x
            java.lang.String r9 = r1.w
            m58 r10 = r1.v
            java.lang.Object r11 = r1.o
            java.lang.CharSequence r11 = (java.lang.CharSequence) r11
            java.util.Iterator r12 = r1.c
            java.util.Collection r13 = r1.b
            java.util.Collection r13 = (java.util.Collection) r13
            ru.ok.messages.settings.folders.picker.FoldersPickerViewModel r14 = r1.a
            kotlin.ResultKt.throwOnFailure(r0)
        L_0x0049:
            r8 = r9
            r9 = r10
            r10 = r11
            r15 = r14
            r14 = r13
            r18 = r12
            r12 = r4
            r4 = r18
            goto L_0x01b1
        L_0x0055:
            java.lang.IllegalStateException r0 = new java.lang.IllegalStateException
            java.lang.String r1 = "call to 'resume' before 'invoke' with coroutine"
            r0.<init>(r1)
            throw r0
        L_0x005d:
            java.lang.Object r2 = r1.o
            zx5 r2 = (defpackage.zx5) r2
            java.util.Iterator r4 = r1.c
            java.util.Collection r9 = r1.b
            java.util.Collection r9 = (java.util.Collection) r9
            ru.ok.messages.settings.folders.picker.FoldersPickerViewModel r10 = r1.a
            kotlin.ResultKt.throwOnFailure(r0)
            goto L_0x015f
        L_0x006e:
            kotlin.ResultKt.throwOnFailure(r0)
            r0 = r20
            java.lang.Iterable r0 = (java.lang.Iterable) r0
            java.util.ArrayList r4 = new java.util.ArrayList
            r4.<init>()
            java.util.Iterator r0 = r0.iterator()
            r9 = r4
            r4 = r0
        L_0x0080:
            boolean r0 = r4.hasNext()
            if (r0 == 0) goto L_0x0222
            java.lang.Object r0 = r4.next()
            zx5 r0 = (defpackage.zx5) r0
            boolean r10 = r0.b()
            if (r10 != 0) goto L_0x0217
            ss9 r10 = r2.c
            boolean r11 = r10 instanceof defpackage.rs9
            java.lang.String r14 = r0.a
            if (r11 == 0) goto L_0x00d1
            rs9 r10 = (defpackage.rs9) r10
            boolean r11 = r10.b
            if (r11 != 0) goto L_0x00db
            java.util.List r10 = r10.a
            java.lang.Iterable r10 = (java.lang.Iterable) r10
            boolean r11 = r10 instanceof java.util.Collection
            if (r11 == 0) goto L_0x00b2
            r11 = r10
            java.util.Collection r11 = (java.util.Collection) r11
            boolean r11 = r11.isEmpty()
            if (r11 == 0) goto L_0x00b2
            goto L_0x00cc
        L_0x00b2:
            java.util.Iterator r10 = r10.iterator()
        L_0x00b6:
            boolean r11 = r10.hasNext()
            if (r11 == 0) goto L_0x00cc
            java.lang.Object r11 = r10.next()
            ikb r11 = (defpackage.ikb) r11
            java.lang.String r11 = r11.a
            boolean r11 = kotlin.jvm.internal.Intrinsics.areEqual((java.lang.Object) r11, (java.lang.Object) r14)
            if (r11 == 0) goto L_0x00b6
            goto L_0x0217
        L_0x00cc:
            boolean r10 = r0.x
            if (r10 == 0) goto L_0x0217
            goto L_0x00db
        L_0x00d1:
            boolean r10 = r10 instanceof defpackage.qs9
            if (r10 == 0) goto L_0x0211
            boolean r10 = r0.b()
            if (r10 != 0) goto L_0x0217
        L_0x00db:
            ss9 r10 = r2.c
            boolean r11 = r10 instanceof defpackage.rs9
            if (r11 == 0) goto L_0x0119
            rs9 r10 = (defpackage.rs9) r10
            boolean r11 = r10.b
            if (r11 == 0) goto L_0x00ea
            java.util.List r10 = r10.a
            goto L_0x00ee
        L_0x00ea:
            java.util.List r10 = kotlin.collections.CollectionsKt.emptyList()
        L_0x00ee:
            java.lang.Iterable r10 = (java.lang.Iterable) r10
            java.util.ArrayList r11 = new java.util.ArrayList
            int r12 = kotlin.collections.CollectionsKt__IterablesKt.collectionSizeOrDefault(r10, 10)
            r11.<init>(r12)
            java.util.Iterator r10 = r10.iterator()
        L_0x00fd:
            boolean r12 = r10.hasNext()
            if (r12 == 0) goto L_0x010f
            java.lang.Object r12 = r10.next()
            ikb r12 = (defpackage.ikb) r12
            java.lang.String r12 = r12.a
            r11.add(r12)
            goto L_0x00fd
        L_0x010f:
            boolean r10 = r11.contains(r14)
            r14 = r2
            r12 = r4
            r13 = r9
            r2 = r10
            goto L_0x0172
        L_0x0119:
            boolean r11 = r10 instanceof defpackage.qs9
            if (r11 == 0) goto L_0x020b
            qs9 r10 = (defpackage.qs9) r10
            long r10 = r10.a
            r62 r12 = r2.f
            a32 r10 = r12.D(r10)
            if (r10 == 0) goto L_0x016e
            m72 r10 = r10.b
            long r10 = r10.a
            r1.a = r2
            r12 = r9
            java.util.Collection r12 = (java.util.Collection) r12
            r1.b = r12
            r1.c = r4
            r1.o = r0
            r1.v = r5
            r1.w = r5
            r1.Y = r8
            u82 r12 = r2.h
            r15 = r12
            ia2 r15 = (defpackage.ia2) r15
            r15.getClass()
            o92 r13 = new o92
            r17 = 0
            r12 = r13
            r7 = r13
            r13 = r15
            r8 = r15
            r15 = r10
            r12.<init>(r13, r14, r15, r17)
            kotlin.coroutines.CoroutineContext r8 = r8.x
            java.lang.Object r7 = defpackage.ev0.I(r8, r7, r1)
            if (r7 != r3) goto L_0x015c
            goto L_0x0225
        L_0x015c:
            r10 = r2
            r2 = r0
            r0 = r7
        L_0x015f:
            java.lang.Boolean r0 = (java.lang.Boolean) r0
            boolean r0 = r0.booleanValue()
            r12 = r4
            r13 = r9
            r14 = r10
            r18 = r2
            r2 = r0
            r0 = r18
            goto L_0x0172
        L_0x016e:
            r14 = r2
            r12 = r4
            r13 = r9
            r2 = 0
        L_0x0172:
            java.lang.String r9 = r0.a
            j16 r4 = r14.d
            m58 r10 = r4.a(r0)
            ss9 r4 = r14.c
            java.lang.String r7 = r0.a
            boolean r4 = l(r4, r7)
            r1.a = r14
            r7 = r13
            java.util.Collection r7 = (java.util.Collection) r7
            r1.b = r7
            r1.c = r12
            java.lang.CharSequence r11 = r0.b
            r1.o = r11
            r1.v = r10
            r1.w = r9
            r1.x = r4
            r1.y = r2
            r1.Y = r6
            u82 r7 = r14.h
            ia2 r7 = (defpackage.ia2) r7
            r7.getClass()
            h92 r8 = new h92
            java.util.Set r0 = r0.w
            r8.<init>(r7, r0, r5)
            kotlin.coroutines.CoroutineContext r0 = r7.x
            java.lang.Object r0 = defpackage.ev0.I(r0, r8, r1)
            if (r0 != r3) goto L_0x0049
            goto L_0x0225
        L_0x01b1:
            java.lang.Iterable r0 = (java.lang.Iterable) r0
            boolean r7 = r0 instanceof java.util.Collection
            if (r7 == 0) goto L_0x01c4
            r7 = r0
            java.util.Collection r7 = (java.util.Collection) r7
            boolean r7 = r7.isEmpty()
            if (r7 == 0) goto L_0x01c4
        L_0x01c0:
            r19 = r1
            r13 = 0
            goto L_0x01fb
        L_0x01c4:
            java.util.Iterator r0 = r0.iterator()
        L_0x01c8:
            boolean r7 = r0.hasNext()
            if (r7 == 0) goto L_0x01c0
            java.lang.Object r7 = r0.next()
            a32 r7 = (defpackage.a32) r7
            ss9 r11 = r15.c
            boolean r13 = r11 instanceof defpackage.qs9
            if (r13 == 0) goto L_0x01dd
            qs9 r11 = (defpackage.qs9) r11
            goto L_0x01de
        L_0x01dd:
            r11 = r5
        L_0x01de:
            if (r11 == 0) goto L_0x01f0
            m72 r7 = r7.b
            long r5 = r7.a
            r20 = r0
            r19 = r1
            long r0 = r11.a
            int r0 = (r5 > r0 ? 1 : (r5 == r0 ? 0 : -1))
            if (r0 != 0) goto L_0x01f4
            r13 = 1
            goto L_0x01fb
        L_0x01f0:
            r20 = r0
            r19 = r1
        L_0x01f4:
            r1 = r19
            r0 = r20
            r5 = 0
            r6 = 2
            goto L_0x01c8
        L_0x01fb:
            w16 r0 = new w16
            if (r2 == 0) goto L_0x0201
            r11 = 1
            goto L_0x0202
        L_0x0201:
            r11 = 0
        L_0x0202:
            r7 = r0
            r7.<init>(r8, r9, r10, r11, r12, r13)
            r1 = r19
            r9 = r14
            r2 = r15
            goto L_0x0218
        L_0x020b:
            kotlin.NoWhenBranchMatchedException r0 = new kotlin.NoWhenBranchMatchedException
            r0.<init>()
            throw r0
        L_0x0211:
            kotlin.NoWhenBranchMatchedException r0 = new kotlin.NoWhenBranchMatchedException
            r0.<init>()
            throw r0
        L_0x0217:
            r0 = 0
        L_0x0218:
            if (r0 == 0) goto L_0x021d
            r9.add(r0)
        L_0x021d:
            r5 = 0
            r6 = 2
            r8 = 1
            goto L_0x0080
        L_0x0222:
            r3 = r9
            java.util.List r3 = (java.util.List) r3
        L_0x0225:
            return r3
        */
        throw new UnsupportedOperationException("Method not decompiled: ru.ok.messages.settings.folders.picker.FoldersPickerViewModel.j(ru.ok.messages.settings.folders.picker.FoldersPickerViewModel, java.util.List, kotlin.coroutines.Continuation):java.lang.Object");
    }

    public static boolean l(ss9 ss9, String str) {
        Object obj;
        if (ss9 instanceof rs9) {
            rs9 rs9 = (rs9) ss9;
            Iterator it = (rs9.b ? rs9.a : CollectionsKt.emptyList()).iterator();
            while (true) {
                if (!it.hasNext()) {
                    obj = null;
                    break;
                }
                obj = it.next();
                if (Intrinsics.areEqual((Object) ((ikb) obj).a, (Object) str)) {
                    break;
                }
            }
            ikb ikb = (ikb) obj;
            if (ikb != null) {
                return ikb.b;
            }
            return true;
        } else if (ss9 instanceof qs9) {
            return true;
        } else {
            throw new NoWhenBranchMatchedException();
        }
    }

    public final z76 k() {
        return (z76) this.l.getValue();
    }

    public final void m() {
        ss9 ss9 = this.c;
        if (ss9 instanceof rs9) {
            this.j.e("FOLDER_MOVE_CHATS");
            Iterable<iqd> iterable = k().c;
            ArrayList arrayList = new ArrayList(CollectionsKt__IterablesKt.collectionSizeOrDefault(iterable, 10));
            for (iqd iqd : iterable) {
                arrayList.add(iqd.a);
            }
            o85 o85 = new o85(new w76(arrayList));
            xme xme = this.n;
            xme.getClass();
            xme.m((Object) null, o85);
        } else if (ss9 instanceof qs9) {
            ev0.v(b0h.C(this), ((osa) this.k).a(), (f14) null, new a86(this, (Continuation) null), 2);
        } else {
            throw new NoWhenBranchMatchedException();
        }
    }

    public final void n(String str) {
        if (!Intrinsics.areEqual((Object) str, (Object) this.r)) {
            this.r = str;
            aje aje = this.q;
            if (aje != null) {
                aje.b((CancellationException) null);
            }
            this.q = ev0.v(b0h.C(this), this.s, (f14) null, new i86(str, this, (Continuation) null), 2);
        }
    }
}
