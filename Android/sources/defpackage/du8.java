package defpackage;

import android.net.Uri;
import java.io.File;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlin.jvm.internal.IntCompanionObject;

/* renamed from: du8  reason: default package */
public final class du8 extends ContinuationImpl {
    public gu8 a;
    public /* synthetic */ Object b;
    public final /* synthetic */ gu8 c;
    public int o;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public du8(gu8 gu8, Continuation continuation) {
        super(continuation);
        this.c = gu8;
    }

    public final Object invokeSuspend(Object obj) {
        this.b = obj;
        this.o |= IntCompanionObject.MIN_VALUE;
        return gu8.j(this.c, (File) null, (Uri) null, this);
    }
}
