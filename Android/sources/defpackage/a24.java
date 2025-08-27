package defpackage;

import kotlin.jvm.internal.Intrinsics;

/* renamed from: a24  reason: default package */
public final class a24 {
    public final long a;
    public final int b;
    public final String c;
    public final String d;
    public final String e;
    public final String f;
    public final String g;
    public final String h;

    public a24(long j, int i, String str, String str2, String str3, String str4, String str5, String str6) {
        this.a = j;
        this.b = i;
        this.c = str;
        this.d = str2;
        this.e = str3;
        this.f = str4;
        this.g = str5;
        this.h = str6;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof a24)) {
            return false;
        }
        a24 a24 = (a24) obj;
        return this.a == a24.a && this.b == a24.b && Intrinsics.areEqual((Object) this.c, (Object) a24.c) && Intrinsics.areEqual((Object) this.d, (Object) a24.d) && Intrinsics.areEqual((Object) this.e, (Object) a24.e) && Intrinsics.areEqual((Object) this.f, (Object) a24.f) && Intrinsics.areEqual((Object) this.g, (Object) a24.g) && Intrinsics.areEqual((Object) this.h, (Object) a24.h);
    }

    public final int hashCode() {
        return this.h.hashCode() + g63.d(g63.d(g63.d(g63.d(g63.d((tr1.y(this.b) + (Long.hashCode(this.a) * 31)) * 31, 31, this.c), 31, this.d), 31, this.e), 31, this.f), 31, this.g);
    }

    public final String toString() {
        String str;
        StringBuilder sb = new StringBuilder("CrashDescription(timestamp=");
        sb.append(this.a);
        sb.append(", type=");
        switch (this.b) {
            case 1:
                str = "CRASH";
                break;
            case 2:
                str = "NON_FATAL";
                break;
            case 3:
                str = "FATAL";
                break;
            case 4:
                str = "ERROR";
                break;
            case 5:
                str = "WARNING";
                break;
            case 6:
                str = "NOTICE";
                break;
            case 7:
                str = "INFO";
                break;
            case 8:
                str = "DEBUG";
                break;
            case 9:
                str = "MINIDUMP";
                break;
            case 10:
                str = "ANR";
                break;
            default:
                str = "null";
                break;
        }
        sb.append(str);
        sb.append(", crashFilesDir=");
        sb.append(this.c);
        sb.append(", systemStatePath=");
        sb.append(this.d);
        sb.append(", tagsPath=");
        sb.append(this.e);
        sb.append(", stacktracePath=");
        sb.append(this.f);
        sb.append(", allStacktracesPath=");
        sb.append(this.g);
        sb.append(", logsPath=");
        return g63.l(sb, this.h, ')');
    }
}
