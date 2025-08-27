package defpackage;

import java.util.HashMap;

/* renamed from: uw1  reason: default package */
public final class uw1 {
    public final String a;
    public final String b;
    public final String c;
    public final String d;
    public final String e;
    public final String f;
    public final String g;
    public final String h;
    public final String i;
    public final String j;
    public final boolean k;
    public final HashMap l = new HashMap();

    public uw1(String str, String str2, String str3, String str4, String str5, String str6, String str7, String str8, String str9, String str10, boolean z) {
        this.a = str;
        this.b = str2;
        this.c = str3;
        this.d = str4;
        this.e = str5;
        this.f = str6;
        this.g = str7;
        this.h = str8;
        this.i = str9;
        this.j = str10;
        this.k = z;
    }

    public final String toString() {
        return "CandidatePair{name='" + this.a + "', localCandidateType='" + this.b + "', localAddress='" + this.c + "', remoteCandidateType='" + this.e + "', remoteAddress='" + this.f + "', rtt='" + this.h + "', transport='" + this.i + "', channelId='" + this.j + "', activeConnection=" + this.k + ", unknown=" + this.l + '}';
    }
}
