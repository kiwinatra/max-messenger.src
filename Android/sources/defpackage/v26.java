package defpackage;

import kotlin.jvm.internal.Intrinsics;

/* renamed from: v26  reason: default package */
public final class v26 extends y26 {
    public final s26 a;

    public v26(s26 s26) {
        this.a = s26;
    }

    public final long a() {
        a32 a32 = this.a.c;
        if (a32 != null) {
            return a32.a;
        }
        return 0;
    }

    public final int b() {
        return 31290;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof v26) && Intrinsics.areEqual((Object) this.a, (Object) ((v26) obj).a);
    }

    public final int hashCode() {
        return this.a.hashCode();
    }

    public final String toString() {
        return "ChatItem(folderChatModel=" + this.a + ")";
    }
}
