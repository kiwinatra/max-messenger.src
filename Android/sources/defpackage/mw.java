package defpackage;

import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.FunctionReferenceImpl;

/* renamed from: mw  reason: default package */
public final /* synthetic */ class mw extends FunctionReferenceImpl implements Function1 {
    public static final mw a = new FunctionReferenceImpl(1, gz6.class, "getTime", "getTime()J", 0);

    public final Object invoke(Object obj) {
        return Long.valueOf(((gz6) obj).h());
    }
}
