package defpackage;

import kotlin.jvm.internal.Intrinsics;

/* renamed from: e4e  reason: default package */
public final class e4e implements Comparable {
    public static final e4e c = new e4e("FATAL", 9000);
    public static final e4e o = new e4e("ERROR", 6000);
    public static final e4e v = new e4e("WARNING", 5000);
    public static final e4e w = new e4e("NOTICE", 4000);
    public static final e4e x = new e4e("INFO", 3000);
    public static final e4e y = new e4e("DEBUG", 2000);
    public final String a;
    public final int b;

    public e4e(String str, int i) {
        this.a = str;
        this.b = i;
    }

    public final int compareTo(Object obj) {
        return Intrinsics.compare(this.b, ((e4e) obj).b);
    }

    public final int hashCode() {
        return this.a.hashCode();
    }

    public final String toString() {
        return this.a;
    }
}
