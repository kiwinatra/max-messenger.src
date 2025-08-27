package defpackage;

import java.util.concurrent.atomic.AtomicIntegerFieldUpdater;
import java.util.concurrent.atomic.AtomicLongFieldUpdater;

/* renamed from: j94  reason: default package */
public final /* synthetic */ class j94 {
    public static final /* synthetic */ AtomicIntegerFieldUpdater a;
    private volatile /* synthetic */ int installations$volatile;
    private volatile /* synthetic */ long sequenceNumber$volatile;

    static {
        Class<j94> cls = j94.class;
        a = AtomicIntegerFieldUpdater.newUpdater(cls, "installations$volatile");
        AtomicLongFieldUpdater.newUpdater(cls, "sequenceNumber$volatile");
    }
}
