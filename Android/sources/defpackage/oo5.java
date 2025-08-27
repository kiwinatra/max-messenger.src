package defpackage;

import java.io.Closeable;
import java.io.File;
import java.io.InputStream;
import java.io.OutputStream;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlin.jvm.internal.IntCompanionObject;

/* renamed from: oo5  reason: default package */
public final class oo5 extends ContinuationImpl {
    public Closeable a;
    public Closeable b;
    public OutputStream c;
    public InputStream o;
    public byte[] v;
    public long w;
    public /* synthetic */ Object x;
    public final /* synthetic */ wc8 y;
    public int z;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public oo5(wc8 wc8, Continuation continuation) {
        super(continuation);
        this.y = wc8;
    }

    public final Object invokeSuspend(Object obj) {
        this.x = obj;
        this.z |= IntCompanionObject.MIN_VALUE;
        return this.y.q((File) null, (InputStream) null, this);
    }
}
