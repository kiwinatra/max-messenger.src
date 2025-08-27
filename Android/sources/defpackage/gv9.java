package defpackage;

import kotlin.jvm.internal.Intrinsics;

/* renamed from: gv9  reason: default package */
public final class gv9 extends ibf {
    public ud9 c;

    public final void c(pf9 pf9, String str) {
        if (Intrinsics.areEqual((Object) str, (Object) "reactionInfo")) {
            this.c = td9.a(pf9);
        } else {
            pf9.A();
        }
    }

    public final String toString() {
        return String.valueOf(this.c);
    }
}
