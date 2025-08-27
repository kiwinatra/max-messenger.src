package defpackage;

import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.FunctionReferenceImpl;
import kotlin.text.StringsKt;

/* renamed from: ka4  reason: default package */
public final /* synthetic */ class ka4 extends FunctionReferenceImpl implements Function1 {
    public static final ka4 a = new FunctionReferenceImpl(1, StringsKt.class, "isNotEmpty", "isNotEmpty(Ljava/lang/CharSequence;)Z", 1);

    public final Object invoke(Object obj) {
        return Boolean.valueOf(((String) obj).length() > 0);
    }
}
