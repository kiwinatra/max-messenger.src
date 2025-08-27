package defpackage;

import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.FunctionReferenceImpl;
import kotlin.text.StringsKt;

/* renamed from: la4  reason: default package */
public final /* synthetic */ class la4 extends FunctionReferenceImpl implements Function1 {
    public static final la4 a = new FunctionReferenceImpl(1, StringsKt.class, "toLong", "toLong(Ljava/lang/String;)J", 1);

    public final Object invoke(Object obj) {
        return Long.valueOf(Long.parseLong((String) obj));
    }
}
