package defpackage;

import java.nio.charset.Charset;
import java.nio.charset.CodingErrorAction;
import kotlin.io.ConstantsKt;
import kotlin.jvm.internal.IntCompanionObject;
import org.msgpack.core.buffer.ArrayBufferInput;

/* renamed from: fd9  reason: default package */
public abstract class fd9 {
    public static final Charset a = Charset.forName("UTF-8");
    public static final dd9 b;
    public static final ed9 c;

    /* JADX WARNING: type inference failed for: r0v2, types: [dd9, java.lang.Object] */
    /* JADX WARNING: type inference failed for: r0v3, types: [java.lang.Object, ed9] */
    static {
        ? obj = new Object();
        obj.a = ConstantsKt.MINIMUM_BLOCK_SIZE;
        obj.b = ConstantsKt.DEFAULT_BUFFER_SIZE;
        obj.c = ConstantsKt.DEFAULT_BUFFER_SIZE;
        obj.o = true;
        b = obj;
        ? obj2 = new Object();
        obj2.a = true;
        obj2.b = true;
        CodingErrorAction codingErrorAction = CodingErrorAction.REPLACE;
        obj2.c = codingErrorAction;
        obj2.o = codingErrorAction;
        obj2.v = IntCompanionObject.MAX_VALUE;
        obj2.w = ConstantsKt.DEFAULT_BUFFER_SIZE;
        obj2.x = ConstantsKt.DEFAULT_BUFFER_SIZE;
        c = obj2;
    }

    public static pf9 a(byte[] bArr) {
        ed9 ed9 = c;
        ed9.getClass();
        return new pf9(new ArrayBufferInput(bArr), ed9);
    }
}
