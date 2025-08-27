package defpackage;

import kotlin.jvm.internal.Intrinsics;
import org.json.JSONObject;

/* renamed from: rp6  reason: default package */
public final class rp6 implements r9e {
    public final JSONObject a;

    public rp6(JSONObject jSONObject) {
        this.a = jSONObject;
    }

    public final JSONObject a() {
        return this.a;
    }

    public final void b(int i, String str) {
        this.a.put(str, i);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof rp6) && Intrinsics.areEqual((Object) this.a, (Object) ((rp6) obj).a);
    }

    public final int hashCode() {
        return this.a.hashCode();
    }

    public final String toString() {
        return "GenericCommand(params=" + this.a + ")";
    }
}
