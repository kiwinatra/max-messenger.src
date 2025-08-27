package defpackage;

import java.util.Locale;

/* renamed from: a75  reason: default package */
public final class a75 {
    public final String a;
    public final String b;
    public final String c;
    public final String d;
    public final String e;
    public final Long f = null;
    public final String g;
    public final int h;
    public final String i;
    public final Integer j;
    public final String k;
    public final String l;
    public final String m;
    public final Locale n;
    public final int o;

    public a75(String str, String str2, String str3, int i2, String str4, String str5, String str6, int i3, String str7, Integer num, String str8, String str9, String str10, Locale locale) {
        this.a = str;
        this.b = str2;
        this.c = str3;
        this.o = i2;
        this.d = str4;
        this.e = str5;
        this.g = str6;
        this.h = i3;
        this.i = str7;
        this.j = num;
        this.k = str8;
        this.l = str9;
        this.m = str10;
        this.n = locale;
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("EndpointParameters{conversationId='");
        sb.append(this.a);
        sb.append("', token='");
        sb.append(this.b);
        sb.append("', userId=");
        sb.append(this.c);
        sb.append(", endpointBaseUrl='");
        sb.append(this.d);
        sb.append("', appVersion='");
        sb.append(this.e);
        sb.append("', peerid=");
        sb.append(this.f);
        sb.append(", clientType='");
        sb.append(this.g);
        sb.append("', startUrlType='null', protocolVersion=");
        sb.append(this.h);
        sb.append(", capabilities='");
        sb.append(this.i);
        sb.append("', ispAsNo=");
        sb.append(this.j);
        sb.append(", ispAsOrg='");
        sb.append(this.k);
        sb.append("', locCc='");
        sb.append(this.l);
        sb.append("', locReg='");
        return wj6.n(sb, this.m, "'}");
    }
}
