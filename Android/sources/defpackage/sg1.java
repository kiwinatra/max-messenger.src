package defpackage;

import kotlin.jvm.internal.Intrinsics;

/* renamed from: sg1  reason: default package */
public final class sg1 {
    public final y35 a;
    public final y35 b;
    public final y35 c;
    public final y35 d;
    public final y35 e;
    public final y35 f;

    public sg1(int i, int i2, int i3, int i4, int i5, int i6) {
        y35 y35 = new y35(8, (Object) Integer.valueOf(i));
        y35 y352 = new y35(8, (Object) Integer.valueOf(i2));
        y35 y353 = new y35(8, (Object) Integer.valueOf(i3));
        y35 y354 = new y35(8, (Object) Integer.valueOf(i4));
        y35 y355 = new y35(8, (Object) Integer.valueOf(i5));
        y35 y356 = new y35(8, (Object) Integer.valueOf(i6));
        this.a = y35;
        this.b = y352;
        this.c = y353;
        this.d = y354;
        this.e = y355;
        this.f = y356;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof sg1)) {
            return false;
        }
        sg1 sg1 = (sg1) obj;
        return Intrinsics.areEqual((Object) this.a, (Object) sg1.a) && Intrinsics.areEqual((Object) this.b, (Object) sg1.b) && Intrinsics.areEqual((Object) this.c, (Object) sg1.c) && Intrinsics.areEqual((Object) this.d, (Object) sg1.d) && Intrinsics.areEqual((Object) this.e, (Object) sg1.e) && Intrinsics.areEqual((Object) this.f, (Object) sg1.f);
    }

    public final int hashCode() {
        int hashCode = this.b.hashCode();
        int hashCode2 = this.c.hashCode();
        int hashCode3 = this.d.hashCode();
        int hashCode4 = this.e.hashCode();
        return this.f.hashCode() + ((hashCode4 + ((hashCode3 + ((hashCode2 + ((hashCode + (this.a.hashCode() * 31)) * 31)) * 31)) * 31)) * 31);
    }

    public final String toString() {
        return "SoundConfig(end=" + this.a + ", ringtone=" + this.b + ", beep=" + this.c + ", connecting=" + this.d + ", connected=" + this.e + ", busy=" + this.f + ")";
    }
}
