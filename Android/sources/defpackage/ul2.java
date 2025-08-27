package defpackage;

import kotlin.jvm.internal.Intrinsics;

/* renamed from: ul2  reason: default package */
public final class ul2 {
    public final a32 a;
    public final a89 b;
    public final a89 c;
    public final hcg d;
    public final vj9 e;
    public final hq2 f;

    public ul2(a32 a32, a89 a89, a89 a892, hcg hcg, vj9 vj9, hq2 hq2) {
        this.a = a32;
        this.b = a89;
        this.c = a892;
        this.d = hcg;
        this.e = vj9;
        this.f = hq2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof ul2)) {
            return false;
        }
        ul2 ul2 = (ul2) obj;
        return Intrinsics.areEqual((Object) this.a, (Object) ul2.a) && Intrinsics.areEqual((Object) this.b, (Object) ul2.b) && Intrinsics.areEqual((Object) this.c, (Object) ul2.c) && this.d == ul2.d && Intrinsics.areEqual((Object) this.e, (Object) ul2.e) && Intrinsics.areEqual((Object) this.f, (Object) ul2.f);
    }

    public final int hashCode() {
        int hashCode = this.b.hashCode();
        int hashCode2 = this.c.hashCode();
        int hashCode3 = this.d.hashCode();
        int hashCode4 = this.e.hashCode();
        return this.f.hashCode() + ((hashCode4 + ((hashCode3 + ((hashCode2 + ((hashCode + (this.a.hashCode() * 31)) * 31)) * 31)) * 31)) * 31);
    }

    public final String toString() {
        return "ChatPreviewStubModel(chat=" + this.a + ", incomingMessage=" + this.b + ", outgoingMessage=" + this.c + ", messageViewStatus=" + this.d + ", messageTextLayoutRepository=" + this.e + ", chatTheme=" + this.f + ")";
    }
}
