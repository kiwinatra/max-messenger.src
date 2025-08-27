package defpackage;

import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.FunctionReferenceImpl;

/* renamed from: xz6  reason: default package */
public final /* synthetic */ class xz6 extends FunctionReferenceImpl implements Function1 {
    public static final xz6 a = new FunctionReferenceImpl(1, gz6.class, "getTime", "getTime()J", 0);

    public final Object invoke(Object obj) {
        return Long.valueOf(((gz6) obj).h());
    }
}
