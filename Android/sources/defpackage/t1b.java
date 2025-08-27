package defpackage;

import java.io.Closeable;
import java.io.File;
import java.io.InputStream;
import java.io.OutputStream;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlin.jvm.internal.IntCompanionObject;

/* renamed from: t1b  reason: default package */
public final class t1b extends ContinuationImpl {
    public long X;
    public /* synthetic */ Object Y;
    public final /* synthetic */ y1b Z;
    public y1b a;
    public File b;
    public File c;
    public File o;
    public Closeable v;
    public int v0;
    public Closeable w;
    public OutputStream x;
    public InputStream y;
    public byte[] z;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public t1b(y1b y1b, Continuation continuation) {
        super(continuation);
        this.Z = y1b;
    }

    public final Object invokeSuspend(Object obj) {
        this.Y = obj;
        this.v0 |= IntCompanionObject.MIN_VALUE;
        return this.Z.d((File) null, (File) null, (String) null, this);
    }
}
