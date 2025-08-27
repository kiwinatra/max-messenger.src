package defpackage;

import java.util.TimeZone;
import kotlin.jvm.internal.Intrinsics;
import ru.ok.android.externcalls.analytics.internal.upload.AbstractUploader;

/* renamed from: e0g  reason: default package */
public final class e0g {
    public final String a = AbstractUploader.SDK_TYPE_STRING;
    public final String b = "25.6.4";
    public final int c = 6355;
    public final String d = null;
    public final String e;
    public final String f;
    public final String g;
    public final String h;
    public final String i;
    public final int j;
    public final TimeZone k;

    public e0g(String str, String str2, String str3, String str4, String str5) {
        TimeZone timeZone = TimeZone.getDefault();
        this.e = str;
        this.f = str2;
        this.g = str3;
        this.h = str4;
        this.i = str5;
        this.j = 2;
        this.k = timeZone;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof e0g)) {
            return false;
        }
        e0g e0g = (e0g) obj;
        return Intrinsics.areEqual((Object) this.a, (Object) e0g.a) && Intrinsics.areEqual((Object) this.b, (Object) e0g.b) && this.c == e0g.c && Intrinsics.areEqual((Object) this.d, (Object) e0g.d) && Intrinsics.areEqual((Object) this.e, (Object) e0g.e) && Intrinsics.areEqual((Object) this.f, (Object) e0g.f) && Intrinsics.areEqual((Object) this.g, (Object) e0g.g) && Intrinsics.areEqual((Object) this.h, (Object) e0g.h) && Intrinsics.areEqual((Object) this.i, (Object) e0g.i) && this.j == e0g.j && Intrinsics.areEqual((Object) this.k, (Object) e0g.k);
    }

    public final int hashCode() {
        int h2 = rae.h(this.c, g63.d(this.a.hashCode() * 31, 31, this.b), 31);
        String str = this.d;
        return this.k.hashCode() + ((tr1.y(this.j) + g63.d(g63.d(g63.d(g63.d(g63.d((h2 + (str == null ? 0 : str.hashCode())) * 31, 31, this.e), 31, this.f), 31, this.g), 31, this.h), 31, this.i)) * 31);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("UserAgent(deviceType=");
        sb.append(this.a);
        sb.append(", appVersion=");
        sb.append(this.b);
        sb.append(", buildNumber=");
        sb.append(this.c);
        sb.append(", appKey=");
        sb.append(this.d);
        sb.append(", osVersion=");
        sb.append(this.e);
        sb.append(", locale=");
        sb.append(this.f);
        sb.append(", deviceLocale=");
        sb.append(this.g);
        sb.append(", deviceName=");
        sb.append(this.h);
        sb.append(", screen=");
        sb.append(this.i);
        sb.append(", pushDeviceType=");
        int i2 = this.j;
        sb.append(i2 != 1 ? i2 != 2 ? i2 != 3 ? "null" : "RUSTORE" : "GCM" : "HUAWEI");
        sb.append(", timeZone=");
        sb.append(this.k);
        sb.append(")");
        return sb.toString();
    }
}
