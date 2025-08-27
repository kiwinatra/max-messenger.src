package defpackage;

import kotlin.jvm.internal.Intrinsics;

/* renamed from: lz3  reason: default package */
public final class lz3 implements kz3 {
    public String a;

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof lz3) && Intrinsics.areEqual((Object) this.a, (Object) ((lz3) obj).a);
    }

    public final int hashCode() {
        return this.a.hashCode();
    }

    public final String toString() {
        return wj6.k("ConversationIdProviderImpl(conversationId=", this.a, ")");
    }
}
