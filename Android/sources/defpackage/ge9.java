package defpackage;

import android.net.Uri;
import java.util.List;
import kotlin.jvm.internal.Intrinsics;

/* renamed from: ge9  reason: default package */
public final class ge9 extends ykd {
    public final long X;
    public final int Y = hra.r;
    public final long Z;
    public final Uri c;
    public final List o;
    public final b89 v;
    public final a32 w;
    public final String x;
    public final isb y;
    public final CharSequence z;

    public ge9(Uri uri, List list, b89 b89, a32 a32, String str, isb isb, CharSequence charSequence, long j) {
        super(xkd.v, list);
        this.c = uri;
        this.o = list;
        this.v = b89;
        this.w = a32;
        this.x = str;
        this.y = isb;
        this.z = charSequence;
        this.X = j;
        this.Z = b89.a;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof ge9)) {
            return false;
        }
        ge9 ge9 = (ge9) obj;
        return Intrinsics.areEqual((Object) this.c, (Object) ge9.c) && Intrinsics.areEqual((Object) this.o, (Object) ge9.o) && Intrinsics.areEqual((Object) this.v, (Object) ge9.v) && Intrinsics.areEqual((Object) this.w, (Object) ge9.w) && Intrinsics.areEqual((Object) this.x, (Object) ge9.x) && Intrinsics.areEqual((Object) this.y, (Object) ge9.y) && Intrinsics.areEqual((Object) this.z, (Object) ge9.z) && this.X == ge9.X;
    }

    public final long getItemId() {
        return this.Z;
    }

    public final boolean h(ykd ykd) {
        ge9 ge9 = (ge9) ykd;
        if (Intrinsics.areEqual((Object) this.c, (Object) ge9.c)) {
            b89 b89 = this.v;
            long j = b89.c;
            b89 b892 = ge9.v;
            return j == b892.c && Intrinsics.areEqual((Object) b89.x, (Object) b892.x) && b89.v == b892.v;
        }
    }

    public final int hashCode() {
        int i = 0;
        Uri uri = this.c;
        int hashCode = (this.v.hashCode() + rae.i(this.o, (uri == null ? 0 : uri.hashCode()) * 31, 31)) * 31;
        a32 a32 = this.w;
        int hashCode2 = (hashCode + (a32 == null ? 0 : a32.hashCode())) * 31;
        String str = this.x;
        int hashCode3 = (this.y.hashCode() + ((hashCode2 + (str == null ? 0 : str.hashCode())) * 31)) * 31;
        CharSequence charSequence = this.z;
        if (charSequence != null) {
            i = charSequence.hashCode();
        }
        return Long.hashCode(this.X) + ((hashCode3 + i) * 31);
    }

    public final int i() {
        return this.Y;
    }

    public final boolean n(ykd ykd) {
        return this.Z == ykd.getItemId();
    }

    public final String toString() {
        String y2 = vzg.y(this.z);
        StringBuilder sb = new StringBuilder("MessageSearchModel(avatar=");
        sb.append(this.c);
        sb.append(", messageHighlights=");
        sb.append(this.o);
        sb.append(", message=");
        sb.append(this.v);
        sb.append(", chat=");
        sb.append(this.w);
        sb.append(", feedback=");
        sb.append(this.x);
        sb.append(", preProcessedText=");
        sb.append(this.y);
        sb.append(", preProcessedChatTitle=");
        sb.append(y2);
        sb.append(", chatId=");
        sb.append(this.X);
        sb.append(", viewType=");
        sb.append(this.Y);
        sb.append(", itemId=");
        return wj6.m(sb, this.Z, ")");
    }
}
