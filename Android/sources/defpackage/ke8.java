package defpackage;

import android.content.Context;
import android.text.SpannableStringBuilder;
import java.util.ArrayList;
import java.util.List;
import kotlin.NoWhenBranchMatchedException;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.internal.Intrinsics;
import ru.ok.android.externcalls.sdk.audio.CallsAudioDeviceInfo;

/* renamed from: ke8  reason: default package */
public abstract class ke8 {
    public static final ArrayList a(List list, int i, x4b x4b, int i2) {
        Iterable chunked = CollectionsKt.chunked(list, i);
        ArrayList arrayList = new ArrayList(CollectionsKt__IterablesKt.collectionSizeOrDefault(chunked, 10));
        int i3 = 0;
        for (Object next : chunked) {
            int i4 = i3 + 1;
            if (i3 < 0) {
                CollectionsKt.throwIndexOverflow();
            }
            arrayList.add(new y4b(i3 + i2, x4b, (List) next));
            i3 = i4;
        }
        return arrayList;
    }

    public static final u41 b(CallsAudioDeviceInfo callsAudioDeviceInfo, boolean z) {
        int i = je8.$EnumSwitchMapping$0[callsAudioDeviceInfo.getDeviceType().ordinal()];
        return i != 1 ? i != 2 ? (i == 3 || i == 4) ? new p41(callsAudioDeviceInfo, z) : i != 5 ? new s41(callsAudioDeviceInfo) : new r41(callsAudioDeviceInfo) : new q41(callsAudioDeviceInfo) : new t41(callsAudioDeviceInfo);
    }

    public static final la1 c(y8b y8b, boolean z, boolean z2, boolean z3, hl1 hl1, me5 me5, ze1 ze1) {
        ca1 ca1;
        y8b y8b2 = y8b;
        hl1 hl12 = hl1;
        p0g p0g = (!z || !y8b2.a.b()) ? z ? p0g.o : (!z2 || !Intrinsics.areEqual((Object) y8b2.a.getId(), (Object) ze1)) ? z2 ? p0g.a : p0g.o : p0g.c : p0g.b;
        lge lge = !(me5 instanceof ke5) ? lge.c : y8b2.a.j() ? lge.a : !y8b2.a.c() ? lge.b : lge.c;
        boolean z4 = !z && !y8b2.a.isConnected();
        ze1 id = y8b2.a.getId();
        jm1 jm1 = y8b2.b;
        zd0 zd0 = new zd0(new gd0(jm1.i(), jm1.a()), jm1.o());
        String name = jm1.getName();
        cf1 cf1 = y8b2.a;
        boolean b = cf1.b();
        boolean c = cf1.c();
        boolean j = cf1.j();
        boolean h = cf1.h();
        boolean e = cf1.e();
        long j2 = cf1.getId().a;
        boolean b2 = cf1.b();
        x8g q = cf1.q();
        boolean z5 = z || cf1.isConnected();
        boolean r = cf1.r();
        boolean isScreenCaptureEnabled = cf1.isScreenCaptureEnabled();
        x8g n = cf1.n();
        cf1 cf12 = cf1;
        boolean z6 = r;
        jm1 jm12 = jm1;
        boolean z7 = isScreenCaptureEnabled;
        zd0 zd02 = zd0;
        o0g o0g = new o0g(j2, z, b2, q, z5, z6, z7, n);
        int ordinal = cf12.p().ordinal();
        if (ordinal == 0) {
            ca1 = ca1.a;
        } else if (ordinal == 1) {
            ca1 = ca1.b;
        } else if (ordinal == 2) {
            ca1 = ca1.c;
        } else {
            throw new NoWhenBranchMatchedException();
        }
        ca1 ca12 = ca1;
        String name2 = jm12.getName();
        boolean isScreenCaptureEnabled2 = cf12.isScreenCaptureEnabled();
        Context context = hl12.a;
        if (z) {
            name2 = context.getString(ykc.call_me_member);
        }
        SpannableStringBuilder b3 = hl1.b(name2, z, lge, z4, z3, isScreenCaptureEnabled2, me5);
        boolean m = cf12.m();
        String name3 = jm12.getName();
        Context context2 = hl12.a;
        if (m) {
            name3 = context2.getString(ykc.call_me_member);
        }
        String string = (!cf12.m() || cf12.isConnected()) ? cf12.j() ? context2.getString(sqa.N0) : !cf12.c() ? context2.getString(sqa.M0) : null : context2.getString(sqa.H0);
        return new la1(id, name, b3, name3 + " " + string, zd02, j, z4, b, c, z, h, e, o0g, p0g, ca12, lge);
    }

    public static final gd8 d(la1 la1, k91 k91, hl1 hl1) {
        lge lge;
        SpannableStringBuilder spannableStringBuilder;
        la1 la12 = la1;
        k91 k912 = k91;
        boolean z = k912.g;
        boolean z2 = false;
        boolean z3 = z ? false : la12.w;
        boolean z4 = k912.u;
        String str = la12.b;
        boolean z5 = la12.x;
        boolean z6 = k912.m;
        o0g o0g = la12.v0;
        boolean z7 = la12.X;
        lge lge2 = la12.y0;
        if (z4 || z) {
            lge = lge2;
            spannableStringBuilder = null;
        } else {
            if (o0g != null) {
                z2 = o0g.g;
            }
            lge = lge2;
            spannableStringBuilder = hl1.e(z7, lge2, str, z, z5, z6, z2, k912.e);
        }
        return new gd8(la12.v, str, la12.a, z3, z6, z5, o0g, z7, lge, spannableStringBuilder, la12.o);
    }

    public static final v4b e(la1 la1, boolean z, boolean z2, boolean z3) {
        la1 la12 = la1;
        boolean z4 = false;
        boolean z5 = z ? la12.w : false;
        if (z2 || z3) {
            z4 = la12.x;
        }
        boolean z6 = z4;
        p0g p0g = z ? la12.w0 : null;
        if (p0g == null) {
            p0g = p0g.o;
        }
        return new v4b(la12.v, la12.b, la12.a, z5, la12.z, z6, la12.v0, p0g, la12.X, la12.c);
    }
}
