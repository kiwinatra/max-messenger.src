package defpackage;

import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.FunctionReferenceImpl;
import org.json.JSONObject;

/* renamed from: ir6  reason: default package */
public final /* synthetic */ class ir6 implements n9e {
    public final /* synthetic */ int a;
    public final /* synthetic */ Function1 b;
    public final /* synthetic */ Object c;

    public /* synthetic */ ir6(Object obj, FunctionReferenceImpl functionReferenceImpl, int i) {
        this.a = i;
        this.c = obj;
        this.b = (Function1) functionReferenceImpl;
    }

    public final void k(JSONObject jSONObject) {
        switch (this.a) {
            case 0:
                ((xe8) this.c).getClass();
                this.b.invoke(new RuntimeException("get-participant-list-chunk error " + jSONObject));
                return;
            default:
                ((ox0) this.c).getClass();
                this.b.invoke(new RuntimeException("get-rooms error " + jSONObject));
                return;
        }
    }
}
