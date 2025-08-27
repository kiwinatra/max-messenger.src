package defpackage;

import java.io.Closeable;
import java.io.File;
import java.io.InputStream;
import java.io.OutputStream;
import java.io.Serializable;
import java.util.Iterator;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlin.jvm.internal.IntCompanionObject;
import kotlin.jvm.internal.Ref;

/* renamed from: w1b  reason: default package */
public final class w1b extends ContinuationImpl {
    public /* synthetic */ Object A0;
    public final /* synthetic */ y1b B0;
    public int C0;
    public Closeable X;
    public OutputStream Y;
    public InputStream Z;
    public y1b a;
    public k4d b;
    public q1b c;
    public File o;
    public Serializable v;
    public byte[] v0;
    public Object w;
    public Iterator w0;
    public Ref.LongRef x;
    public boolean x0;
    public File y;
    public long y0;
    public Closeable z;
    public int z0;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public w1b(y1b y1b, Continuation continuation) {
        super(continuation);
        this.B0 = y1b;
    }

    public final Object invokeSuspend(Object obj) {
        this.A0 = obj;
        this.C0 |= IntCompanionObject.MIN_VALUE;
        return this.B0.i((k4d) null, (q1b) null, (File) null, (File) null, false, this);
    }
}
