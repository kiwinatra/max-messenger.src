package defpackage;

import kotlin.jvm.functions.Function3;

/* renamed from: tu0  reason: default package */
public abstract class tu0 {
    public static final f22 a = new f22(-1, (f22) null, (ru0) null, 0);
    public static final int b = hd8.Y(32, 0, 0, 12, "kotlinx.coroutines.bufferedChannel.segmentSize");
    public static final int c = hd8.Y(10000, 0, 0, 12, "kotlinx.coroutines.bufferedChannel.expandBufferCompletionWaitIterations");
    public static final bpa d = new bpa(10, "BUFFERED");
    public static final bpa e = new bpa(10, "SHOULD_BUFFER");
    public static final bpa f = new bpa(10, "S_RESUMING_BY_RCV");
    public static final bpa g = new bpa(10, "RESUMING_BY_EB");
    public static final bpa h = new bpa(10, "POISONED");
    public static final bpa i = new bpa(10, "DONE_RCV");
    public static final bpa j = new bpa(10, "INTERRUPTED_SEND");
    public static final bpa k = new bpa(10, "INTERRUPTED_RCV");
    public static final bpa l = new bpa(10, "CHANNEL_CLOSED");
    public static final bpa m = new bpa(10, "SUSPEND");
    public static final bpa n = new bpa(10, "SUSPEND_NO_WAITER");
    public static final bpa o = new bpa(10, "FAILED");
    public static final bpa p = new bpa(10, "NO_RECEIVE_RESULT");
    public static final bpa q = new bpa(10, "CLOSE_HANDLER_CLOSED");
    public static final bpa r = new bpa(10, "CLOSE_HANDLER_INVOKED");
    public static final bpa s = new bpa(10, "NO_CLOSE_CAUSE");

    public static final boolean a(kw1 kw1, Object obj, Function3 function3) {
        bpa f2 = kw1.f(obj, function3);
        if (f2 == null) {
            return false;
        }
        kw1.v(f2);
        return true;
    }
}
