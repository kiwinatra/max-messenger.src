package defpackage;

import kotlin.Unit;

/* renamed from: dyb  reason: default package */
public final class dyb extends v5a {
    public final long b;

    public dyb(long j) {
        super(Unit.INSTANCE);
        this.b = j;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof dyb) && this.b == ((dyb) obj).b;
    }

    public final int hashCode() {
        return Long.hashCode(this.b);
    }

    public final String toString() {
        return wj6.m(new StringBuilder("BackToChat(chatId="), this.b, ")");
    }
}
