package ru.ok.tamtam.messages.scheduled;

import android.app.Application;
import androidx.lifecycle.AndroidViewModel;
import java.util.List;
import kotlin.Lazy;
import kotlin.LazyKt;
import kotlin.Metadata;
import kotlin.coroutines.Continuation;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlin.properties.Delegates;
import kotlin.reflect.KProperty;

@Metadata(d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0000\u0018\u00002\u00020\u00012\u00020\u0002B\u0017\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\u0006\u0010\u0006\u001a\u00020\u0005¢\u0006\u0004\b\u0007\u0010\b¨\u0006\t"}, d2 = {"Lru/ok/tamtam/messages/scheduled/ScheduledSendPickerViewModel;", "Landroidx/lifecycle/AndroidViewModel;", "Lk84;", "Landroid/app/Application;", "app", "Lhdd;", "savedStateHandle", "<init>", "(Landroid/app/Application;Lhdd;)V", "scheduled-send-picker-dialog_release"}, k = 1, mv = {2, 0, 0})
@SourceDebugExtension({"SMAP\nScheduledSendPickerViewModel.kt\nKotlin\n*S Kotlin\n*F\n+ 1 ScheduledSendPickerViewModel.kt\nru/ok/tamtam/messages/scheduled/ScheduledSendPickerViewModel\n+ 2 Delegates.kt\nkotlin/properties/Delegates\n+ 3 fake.kt\nkotlin/jvm/internal/FakeKt\n+ 4 _Collections.kt\nkotlin/collections/CollectionsKt___CollectionsKt\n*L\n1#1,233:1\n33#2,3:234\n33#2,3:237\n1#3:240\n360#4,7:241\n360#4,7:248\n*S KotlinDebug\n*F\n+ 1 ScheduledSendPickerViewModel.kt\nru/ok/tamtam/messages/scheduled/ScheduledSendPickerViewModel\n*L\n159#1:234,3\n163#1:237,3\n191#1:241,7\n197#1:248,7\n*E\n"})
public final class ScheduledSendPickerViewModel extends AndroidViewModel implements k84 {
    public static final /* synthetic */ KProperty[] q;
    public final xme d;
    public final etc e;
    public final xme f;
    public final etc g;
    public final Lazy h;
    public final Lazy i = LazyKt.lazy(new red(1));
    public final Lazy j = LazyKt.lazy(new red(2));
    public final Lazy k = LazyKt.lazy(new ifb(24, this));
    public final xme l;
    public final etc m;
    public final xme n;
    public final etc o;
    public final gfd p;

    static {
        Class<ScheduledSendPickerViewModel> cls = ScheduledSendPickerViewModel.class;
        q = new KProperty[]{rae.s(cls, "sendWithNotification", "getSendWithNotification()Z", 0), rae.s(cls, "allowWorkHours", "getAllowWorkHours()Z", 0)};
    }

    public ScheduledSendPickerViewModel(Application application, hdd hdd) {
        super(application);
        xme a = f6e.a((Object) null);
        this.d = a;
        this.e = new etc(a);
        xme a2 = f6e.a((Object) null);
        this.f = a2;
        this.g = new etc(a2);
        this.h = LazyKt.lazy(new ifb(23, application));
        ev0.v(b0h.C(this), dq4.a, (f14) null, new efd(hdd, this, (Continuation) null), 2);
        Boolean bool = Boolean.TRUE;
        xme a3 = f6e.a(bool);
        this.l = a3;
        this.m = new etc(a3);
        xme a4 = f6e.a((Object) null);
        this.n = a4;
        this.o = new etc(a4);
        Delegates delegates = Delegates.INSTANCE;
        this.p = new gfd(0, bool);
        new gfd(1, bool);
    }

    /* JADX WARNING: Code restructure failed: missing block: B:9:0x0040, code lost:
        r4 = r4.b;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static final defpackage.ped j(ru.ok.tamtam.messages.scheduled.ScheduledSendPickerViewModel r13) {
        /*
            r13.getClass()
            java.util.Calendar r0 = java.util.Calendar.getInstance()
            android.app.Application r1 = r13.c
            android.content.res.Resources r1 = r1.getResources()
            int r2 = defpackage.mdc.small_time_offset
            boolean r1 = r1.getBoolean(r2)
            r2 = 12
            if (r1 == 0) goto L_0x002b
            r1 = 13
            int r1 = r0.get(r1)
            r3 = 35
            if (r1 <= r3) goto L_0x0026
            r1 = 2
            r0.add(r2, r1)
            goto L_0x002f
        L_0x0026:
            r1 = 1
            r0.add(r2, r1)
            goto L_0x002f
        L_0x002b:
            r1 = 5
            r0.add(r2, r1)
        L_0x002f:
            r1 = 11
            int r1 = r0.get(r1)
            xme r3 = r13.f
            java.lang.Object r4 = r3.getValue()
            c84 r4 = (defpackage.c84) r4
            r5 = 0
            if (r4 == 0) goto L_0x0047
            ejf r4 = r4.b
            if (r4 == 0) goto L_0x0047
            int r4 = r4.a
            goto L_0x0048
        L_0x0047:
            r4 = r5
        L_0x0048:
            if (r4 < r1) goto L_0x004b
            goto L_0x004c
        L_0x004b:
            r4 = r1
        L_0x004c:
            java.util.ArrayList r8 = defpackage.hd8.D(r1)
            java.util.Iterator r6 = r8.iterator()
            r7 = r5
        L_0x0055:
            boolean r9 = r6.hasNext()
            r10 = -1
            if (r9 == 0) goto L_0x006b
            java.lang.Object r9 = r6.next()
            ejf r9 = (defpackage.ejf) r9
            int r9 = r9.a
            if (r9 != r4) goto L_0x0068
            r11 = r7
            goto L_0x006c
        L_0x0068:
            int r7 = r7 + 1
            goto L_0x0055
        L_0x006b:
            r11 = r10
        L_0x006c:
            int r0 = r0.get(r2)
            java.lang.Object r2 = r3.getValue()
            c84 r2 = (defpackage.c84) r2
            if (r2 == 0) goto L_0x007f
            ejf r2 = r2.c
            if (r2 == 0) goto L_0x007f
            int r2 = r2.a
            goto L_0x0080
        L_0x007f:
            r2 = r5
        L_0x0080:
            if (r4 == r1) goto L_0x0083
            goto L_0x0084
        L_0x0083:
            r2 = r0
        L_0x0084:
            if (r4 == r1) goto L_0x0087
            r0 = r5
        L_0x0087:
            java.util.ArrayList r9 = defpackage.hd8.I(r0)
            java.util.Iterator r0 = r9.iterator()
        L_0x008f:
            boolean r1 = r0.hasNext()
            if (r1 == 0) goto L_0x00a4
            java.lang.Object r1 = r0.next()
            ejf r1 = (defpackage.ejf) r1
            int r1 = r1.a
            if (r1 != r2) goto L_0x00a1
            r12 = r5
            goto L_0x00a5
        L_0x00a1:
            int r5 = r5 + 1
            goto L_0x008f
        L_0x00a4:
            r12 = r10
        L_0x00a5:
            ped r0 = new ped
            kotlin.Lazy r13 = r13.k
            java.lang.Object r13 = r13.getValue()
            r7 = r13
            java.util.List r7 = (java.util.List) r7
            r10 = 0
            r6 = r0
            r6.<init>(r7, r8, r9, r10, r11, r12)
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: ru.ok.tamtam.messages.scheduled.ScheduledSendPickerViewModel.j(ru.ok.tamtam.messages.scheduled.ScheduledSendPickerViewModel):ped");
    }

    public final void k() {
        n84 n84;
        ejf ejf;
        ejf ejf2;
        xme xme = this.f;
        c84 c84 = (c84) xme.getValue();
        if (c84 != null && (n84 = c84.a) != null) {
            Integer num = null;
            if (StringsKt__StringsJVMKt.equals(n84.v, this.c.getString(jad.q), true)) {
                ev0.v(b0h.C(this), dq4.a, (f14) null, new ffd(this, (Continuation) null), 2);
                return;
            }
            c84 c842 = (c84) xme.getValue();
            n84 n842 = c842 != null ? c842.a : null;
            Lazy lazy = this.k;
            int i2 = 0;
            if (n842 != null) {
                int indexOf = ((List) lazy.getValue()).indexOf(n842);
                Integer valueOf = Integer.valueOf(indexOf);
                if (indexOf >= 0) {
                    num = valueOf;
                }
            } else {
                num = 0;
            }
            c84 c843 = (c84) xme.getValue();
            int i3 = (c843 == null || (ejf2 = c843.b) == null) ? 0 : ejf2.a;
            c84 c844 = (c84) xme.getValue();
            int i4 = (c844 == null || (ejf = c844.c) == null) ? 0 : ejf.a;
            List list = (List) lazy.getValue();
            List list2 = (List) this.i.getValue();
            List list3 = (List) this.j.getValue();
            if (num != null) {
                i2 = num.intValue();
            }
            l(new ped(list, list2, list3, i2, i3, i4));
        }
    }

    public final void l(ped ped) {
        z68.c("ScheduledSendPickerViewModel", "setData %s", ped);
        xme xme = this.d;
        xme.getClass();
        xme.m((Object) null, ped);
        c84 c84 = new c84((n84) ped.a.get(ped.d), (ejf) ped.b.get(ped.e), (ejf) ped.c.get(ped.f));
        xme xme2 = this.f;
        xme2.getClass();
        xme2.m((Object) null, c84);
        m();
    }

    public final boolean m() {
        z68.c("ScheduledSendPickerViewModel", "validateSelectedTime", new Object[0]);
        c84 c84 = (c84) this.f.getValue();
        boolean z = false;
        if (c84 == null) {
            return false;
        }
        if (System.currentTimeMillis() < c84.b()) {
            z = true;
        }
        z68.c("ScheduledSendPickerViewModel", "validateSelectedTime: " + z, new Object[0]);
        Boolean valueOf = Boolean.valueOf(z);
        xme xme = this.l;
        xme.getClass();
        xme.m((Object) null, valueOf);
        return z;
    }
}
