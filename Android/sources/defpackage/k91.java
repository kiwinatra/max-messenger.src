package defpackage;

import kotlin.jvm.internal.Intrinsics;

/* renamed from: k91  reason: default package */
public final class k91 {
    public final String a;
    public final ld9 b;
    public final ld9 c;
    public final boolean d;
    public final me5 e;
    public final l21 f;
    public final boolean g;
    public final y8b h;
    public final ni1 i;
    public final li1 j;
    public final String k;
    public final boolean l;
    public final boolean m;
    public final boolean n;
    public final boolean o;
    public final ze1 p;
    public final u41 q;
    public final aj8 r;
    public final aj8 s;
    public final boolean t;
    public final boolean u;

    public k91(String str, ld9 ld9, ld9 ld92, boolean z, me5 me5, l21 l21, boolean z2, y8b y8b, ni1 ni1, li1 li1, String str2, boolean z3, boolean z4, boolean z5, boolean z6, ze1 ze1, u41 u41, aj8 aj8, aj8 aj82, boolean z7, boolean z8) {
        this.a = str;
        this.b = ld9;
        this.c = ld92;
        this.d = z;
        this.e = me5;
        this.f = l21;
        this.g = z2;
        this.h = y8b;
        this.i = ni1;
        this.j = li1;
        this.k = str2;
        this.l = z3;
        this.m = z4;
        this.n = z5;
        this.o = z6;
        this.p = ze1;
        this.q = u41;
        this.r = aj8;
        this.s = aj82;
        this.t = z7;
        this.u = z8;
    }

    public static k91 a(k91 k91, ld9 ld9, me5 me5, l21 l21, boolean z, aj8 aj8, aj8 aj82, boolean z2, int i2) {
        aj8 aj83;
        u41 u41;
        boolean z3;
        boolean z4;
        k91 k912 = k91;
        String str = k912.a;
        ld9 ld92 = k912.b;
        ld9 ld93 = (i2 & 4) != 0 ? k912.c : ld9;
        boolean z5 = k912.d;
        me5 me52 = (i2 & 16) != 0 ? k912.e : me5;
        l21 l212 = (i2 & 32) != 0 ? k912.f : l21;
        boolean z6 = (i2 & 64) != 0 ? k912.g : z;
        y8b y8b = k912.h;
        ni1 ni1 = k912.i;
        li1 li1 = k912.j;
        String str2 = k912.k;
        boolean z7 = k912.l;
        boolean z8 = k912.m;
        boolean z9 = k912.n;
        boolean z10 = k912.o;
        ze1 ze1 = k912.p;
        u41 u412 = k912.q;
        if ((i2 & 131072) != 0) {
            u41 = u412;
            aj83 = k912.r;
        } else {
            u41 = u412;
            aj83 = aj8;
        }
        aj8 aj84 = (i2 & 262144) != 0 ? k912.s : aj82;
        boolean z11 = k912.t;
        if ((i2 & 1048576) != 0) {
            z4 = z11;
            z3 = k912.u;
        } else {
            z4 = z11;
            z3 = z2;
        }
        k91.getClass();
        return new k91(str, ld92, ld93, z5, me52, l212, z6, y8b, ni1, li1, str2, z7, z8, z9, z10, ze1, u41, aj83, aj84, z4, z3);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof k91)) {
            return false;
        }
        k91 k91 = (k91) obj;
        return Intrinsics.areEqual((Object) this.a, (Object) k91.a) && Intrinsics.areEqual((Object) this.b, (Object) k91.b) && Intrinsics.areEqual((Object) this.c, (Object) k91.c) && this.d == k91.d && Intrinsics.areEqual((Object) this.e, (Object) k91.e) && Intrinsics.areEqual((Object) this.f, (Object) k91.f) && this.g == k91.g && Intrinsics.areEqual((Object) this.h, (Object) k91.h) && Intrinsics.areEqual((Object) this.i, (Object) k91.i) && Intrinsics.areEqual((Object) this.j, (Object) k91.j) && Intrinsics.areEqual((Object) this.k, (Object) k91.k) && this.l == k91.l && this.m == k91.m && this.n == k91.n && this.o == k91.o && Intrinsics.areEqual((Object) this.p, (Object) k91.p) && Intrinsics.areEqual((Object) this.q, (Object) k91.q) && this.r == k91.r && this.s == k91.s && this.t == k91.t && this.u == k91.u;
    }

    public final int hashCode() {
        int i2 = 0;
        String str = this.a;
        int hashCode = (str == null ? 0 : str.hashCode()) * 31;
        ld9 ld9 = this.b;
        int hashCode2 = (hashCode + (ld9 == null ? 0 : ld9.hashCode())) * 31;
        ld9 ld92 = this.c;
        int hashCode3 = (this.e.hashCode() + g63.e((hashCode2 + (ld92 == null ? 0 : ld92.hashCode())) * 31, 31, this.d)) * 31;
        l21 l21 = this.f;
        int e2 = g63.e((hashCode3 + (l21 == null ? 0 : l21.hashCode())) * 31, 31, this.g);
        y8b y8b = this.h;
        int hashCode4 = (this.j.hashCode() + ((this.i.hashCode() + ((e2 + (y8b == null ? 0 : y8b.hashCode())) * 31)) * 31)) * 31;
        String str2 = this.k;
        int e3 = g63.e(g63.e(g63.e(g63.e((hashCode4 + (str2 == null ? 0 : str2.hashCode())) * 31, 31, this.l), 31, this.m), 31, this.n), 31, this.o);
        ze1 ze1 = this.p;
        if (ze1 != null) {
            i2 = ze1.hashCode();
        }
        return Boolean.hashCode(this.u) + g63.e((this.s.hashCode() + ((this.r.hashCode() + ((this.q.hashCode() + ((e3 + i2) * 31)) * 31)) * 31)) * 31, 31, this.t);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("CallInfoState(conversationId=");
        sb.append(this.a);
        sb.append(", target=");
        sb.append(this.b);
        sb.append(", recallTarget=");
        sb.append(this.c);
        sb.append(", isIncoming=");
        sb.append(this.d);
        sb.append(", callState=");
        sb.append(this.e);
        sb.append(", chatInfo=");
        sb.append(this.f);
        sb.append(", isGroupCall=");
        sb.append(this.g);
        sb.append(", me=");
        sb.append(this.h);
        sb.append(", screenSharingState=");
        sb.append(this.i);
        sb.append(", recordSharingState=");
        sb.append(this.j);
        sb.append(", joinLink=");
        sb.append(this.k);
        sb.append(", hasOpponentsOnce=");
        sb.append(this.l);
        sb.append(", isConnectedOnce=");
        sb.append(this.m);
        sb.append(", isMeCallAdmin=");
        sb.append(this.n);
        sb.append(", isInCallMeOnly=");
        sb.append(this.o);
        sb.append(", primarySpeaker=");
        sb.append(this.p);
        sb.append(", dynamicType=");
        sb.append(this.q);
        sb.append(", isVideoEnabled=");
        sb.append(this.r);
        sb.append(", isMicrophoneEnabled=");
        sb.append(this.s);
        sb.append(", isCallUnavailable=");
        sb.append(this.t);
        sb.append(", hasAnyCameraEnabled=");
        return tr1.m(sb, this.u, ")");
    }

    /* JADX WARNING: Illegal instructions before constructor call */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public /* synthetic */ k91() {
        /*
            r22 = this;
            ie5 r5 = defpackage.ie5.b
            ni1 r9 = defpackage.ni1.e
            li1 r10 = defpackage.li1.f
            s41 r0 = new s41
            ru.ok.android.externcalls.sdk.audio.CallsAudioDeviceInfo$Companion r1 = ru.ok.android.externcalls.sdk.audio.CallsAudioDeviceInfo.Companion
            ru.ok.android.externcalls.sdk.audio.CallsAudioDeviceInfo r1 = r1.getNONE()
            r0.<init>(r1)
            aj8 r19 = defpackage.aj8.v
            r21 = 0
            r1 = 0
            r2 = 0
            r3 = 0
            r4 = 0
            r6 = 0
            r7 = 0
            r8 = 0
            r11 = 0
            r12 = 0
            r13 = 0
            r14 = 0
            r15 = 1
            r16 = 0
            r20 = 0
            r17 = r0
            r0 = r22
            r18 = r19
            r0.<init>(r1, r2, r3, r4, r5, r6, r7, r8, r9, r10, r11, r12, r13, r14, r15, r16, r17, r18, r19, r20, r21)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.k91.<init>():void");
    }
}
