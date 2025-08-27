package defpackage;

import java.util.HashSet;
import java.util.Set;
import kotlin.collections.SetsKt;

/* renamed from: w84  reason: default package */
public final class w84 {
    public static final w84 f = new w84(false, false, SetsKt.emptySet(), false, (mj5) null);
    public final boolean a;
    public final boolean b;
    public final boolean c;
    public final mj5 d;
    public final HashSet e;

    public w84(boolean z, boolean z2, Set set, boolean z3, mj5 mj5) {
        this.a = z;
        this.b = z2;
        this.c = z3;
        this.d = mj5;
        this.e = new HashSet(set);
    }

    public final String toString() {
        HashSet hashSet = this.e;
        return "DispatchParams(retry=" + this.a + ", skipDebounce=" + this.b + ", allChats=" + this.c + ", serverChats=" + hashSet + ", notification=" + this.d + ")";
    }
}
