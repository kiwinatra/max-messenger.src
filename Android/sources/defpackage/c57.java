package defpackage;

import java.util.Iterator;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.ArrayIteratorKt;
import kotlin.jvm.internal.markers.KMappedMarker;

/* renamed from: c57  reason: default package */
public final class c57 implements Iterable, KMappedMarker {
    public final /* synthetic */ int a;
    public final Object b;

    public /* synthetic */ c57(int i, Object obj) {
        this.a = i;
        this.b = obj;
    }

    public boolean b(String str) {
        for (b57 b57 : (b57[]) this.b) {
            if (StringsKt__StringsJVMKt.equals(b57.a, str, true)) {
                return true;
            }
        }
        return false;
    }

    public final Iterator iterator() {
        switch (this.a) {
            case 0:
                return ArrayIteratorKt.iterator((b57[]) this.b);
            default:
                return new xsd((usd) this.b, 1);
        }
    }

    public String toString() {
        switch (this.a) {
            case 0:
                return "[" + ArraysKt___ArraysKt.joinToString$default((Object[]) (b57[]) this.b, (CharSequence) ", ", (CharSequence) null, (CharSequence) null, 0, (CharSequence) null, (Function1) null, 62, (Object) null) + ']';
            default:
                return super.toString();
        }
    }
}
