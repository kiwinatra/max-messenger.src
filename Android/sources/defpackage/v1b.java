package defpackage;

import java.io.File;
import java.io.IOException;
import java.util.Iterator;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlin.jvm.internal.IntCompanionObject;

/* renamed from: v1b  reason: default package */
public final class v1b extends ContinuationImpl {
    public y1b a;
    public IOException b;
    public q1b c;
    public File o;
    public Iterator v;
    public /* synthetic */ Object w;
    public final /* synthetic */ y1b x;
    public int y;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public v1b(y1b y1b, Continuation continuation) {
        super(continuation);
        this.x = y1b;
    }

    public final Object invokeSuspend(Object obj) {
        this.w = obj;
        this.y |= IntCompanionObject.MIN_VALUE;
        return this.x.h((IOException) null, (y2d) null, (q1b) null, (File) null, this);
    }
}
