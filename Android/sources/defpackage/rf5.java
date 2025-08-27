package defpackage;

import java.util.zip.ZipEntry;

/* renamed from: rf5  reason: default package */
public final class rf5 extends fbf implements Comparable {
    public final ZipEntry v;
    public final int w;

    public rf5(String str, ZipEntry zipEntry, int i) {
        super(13, str, String.valueOf(zipEntry.getCrc()));
        this.v = zipEntry;
        this.w = i;
    }

    public final int compareTo(Object obj) {
        return ((String) this.b).compareTo((String) ((rf5) obj).b);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || rf5.class != obj.getClass()) {
            return false;
        }
        rf5 rf5 = (rf5) obj;
        return this.v.equals(rf5.v) && this.w == rf5.w;
    }

    public final int hashCode() {
        return this.v.hashCode() + (this.w * 31);
    }
}
