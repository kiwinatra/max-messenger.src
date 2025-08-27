package defpackage;

import android.text.Layout;
import kotlin.jvm.internal.Intrinsics;

/* renamed from: ec9  reason: default package */
public final class ec9 implements gc9 {
    public final long a;
    public final String b;
    public final Layout c;
    public final Layout d;

    public ec9(long j, String str, Layout layout, Layout layout2) {
        this.a = j;
        this.b = str;
        this.c = layout;
        this.d = layout2;
    }

    public final Layout a() {
        return this.c;
    }

    public final Layout b() {
        return this.d;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof ec9)) {
            return false;
        }
        ec9 ec9 = (ec9) obj;
        return this.a == ec9.a && Intrinsics.areEqual((Object) this.b, (Object) ec9.b) && Intrinsics.areEqual((Object) this.c, (Object) ec9.c) && Intrinsics.areEqual((Object) this.d, (Object) ec9.d);
    }

    public final int hashCode() {
        int hashCode = Long.hashCode(this.a) * 31;
        String str = this.b;
        int hashCode2 = str == null ? 0 : str.hashCode();
        return this.d.hashCode() + ((this.c.hashCode() + ((hashCode + hashCode2) * 31)) * 31);
    }

    public final String toString() {
        return "Channel(chatId=" + this.a + ", channelLink=" + this.b + ", bodyLayout=" + this.c + ", forwardedTitleLayout=" + this.d + ")";
    }
}
