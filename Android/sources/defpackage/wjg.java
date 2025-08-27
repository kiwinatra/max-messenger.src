package defpackage;

import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;

@SourceDebugExtension({"SMAP\nJsBridge.kt\nKotlin\n*S Kotlin\n*F\n+ 1 JsBridge.kt\none/me/webapp/domain/jsbridge/WebAppShareRequest\n+ 2 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,198:1\n1#2:199\n*E\n"})
/* renamed from: wjg  reason: default package */
public final class wjg {
    public static final vjg Companion = new Object();
    public final String a;
    public final String b;
    public final String c;

    public /* synthetic */ wjg(String str, int i, String str2, String str3) {
        if ((i & 1) == 0) {
            this.a = null;
        } else {
            this.a = str;
        }
        if ((i & 2) == 0) {
            this.b = null;
        } else {
            this.b = str2;
        }
        if ((i & 4) == 0) {
            this.c = null;
        } else {
            this.c = str3;
        }
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof wjg)) {
            return false;
        }
        wjg wjg = (wjg) obj;
        return Intrinsics.areEqual((Object) this.a, (Object) wjg.a) && Intrinsics.areEqual((Object) this.b, (Object) wjg.b) && Intrinsics.areEqual((Object) this.c, (Object) wjg.c);
    }

    public final int hashCode() {
        int i = 0;
        String str = this.a;
        int hashCode = (str == null ? 0 : str.hashCode()) * 31;
        String str2 = this.b;
        int hashCode2 = (hashCode + (str2 == null ? 0 : str2.hashCode())) * 31;
        String str3 = this.c;
        if (str3 != null) {
            i = str3.hashCode();
        }
        return hashCode2 + i;
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("WebAppShareRequest(url=");
        sb.append(this.a);
        sb.append(", title=");
        sb.append(this.b);
        sb.append(", text=");
        return wj6.n(sb, this.c, ")");
    }
}
