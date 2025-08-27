package defpackage;

import android.os.Handler;
import android.os.Looper;
import android.os.Message;
import android.os.SystemClock;
import android.os.Trace;
import com.google.android.exoplayer2.upstream.Loader$UnexpectedLoaderException;
import java.io.IOException;
import java.util.concurrent.ExecutorService;

/* renamed from: r28  reason: default package */
public final class r28 extends Handler implements Runnable {
    public Object X;
    public final /* synthetic */ Object Y;
    public final /* synthetic */ int a;
    public final int b;
    public final long c;
    public IOException o;
    public int v;
    public Thread w;
    public boolean x;
    public volatile boolean y;
    public final Object z;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public /* synthetic */ r28(Object obj, Looper looper, Object obj2, Object obj3, int i, long j, int i2) {
        super(looper);
        this.a = i2;
        this.Y = obj;
        this.z = obj2;
        this.X = obj3;
        this.b = i;
        this.c = j;
    }

    public final void a(boolean z2) {
        switch (this.a) {
            case 0:
                this.y = z2;
                this.o = null;
                if (!hasMessages(0)) {
                    synchronized (this) {
                        try {
                            this.x = true;
                            ((s28) this.z).a();
                            Thread thread = this.w;
                            if (thread != null) {
                                thread.interrupt();
                            }
                        } catch (Throwable th) {
                            while (true) {
                                throw th;
                                break;
                            }
                        }
                    }
                } else {
                    this.x = true;
                    removeMessages(0);
                    if (!z2) {
                        sendEmptyMessage(1);
                    }
                }
                if (z2) {
                    ((w28) this.Y).c = null;
                    long elapsedRealtime = SystemClock.elapsedRealtime();
                    p28 p28 = (p28) this.X;
                    p28.getClass();
                    p28.n((s28) this.z, elapsedRealtime, elapsedRealtime - this.c, true);
                    this.X = null;
                    return;
                }
                return;
            default:
                this.y = z2;
                this.o = null;
                if (!hasMessages(1)) {
                    synchronized (this) {
                        try {
                            this.x = true;
                            ((t28) this.z).a();
                            Thread thread2 = this.w;
                            if (thread2 != null) {
                                thread2.interrupt();
                            }
                        } catch (Throwable th2) {
                            while (true) {
                                throw th2;
                                break;
                            }
                        }
                    }
                } else {
                    this.x = true;
                    removeMessages(1);
                    if (!z2) {
                        sendEmptyMessage(2);
                    }
                }
                if (z2) {
                    ((l15) this.Y).b = null;
                    long elapsedRealtime2 = SystemClock.elapsedRealtime();
                    q28 q28 = (q28) this.X;
                    q28.getClass();
                    q28.E((t28) this.z, elapsedRealtime2, elapsedRealtime2 - this.c, true);
                    this.X = null;
                    return;
                }
                return;
        }
    }

    public final void handleMessage(Message message) {
        switch (this.a) {
            case 0:
                if (!this.y) {
                    int i = message.what;
                    if (i == 0) {
                        this.o = null;
                        w28 w28 = (w28) this.Y;
                        r28 r28 = (r28) w28.c;
                        r28.getClass();
                        ((ExecutorService) w28.b).execute(r28);
                        return;
                    } else if (i != 3) {
                        ((w28) this.Y).c = null;
                        long elapsedRealtime = SystemClock.elapsedRealtime();
                        long j = elapsedRealtime - this.c;
                        p28 p28 = (p28) this.X;
                        p28.getClass();
                        if (this.x) {
                            p28.n((s28) this.z, elapsedRealtime, j, false);
                            return;
                        }
                        int i2 = message.what;
                        boolean z2 = true;
                        if (i2 == 1) {
                            try {
                                p28.u((s28) this.z, elapsedRealtime, j);
                                return;
                            } catch (RuntimeException e) {
                                iq.a("Unexpected exception handling load completed", e);
                                ((w28) this.Y).o = new Loader$UnexpectedLoaderException(e);
                                return;
                            }
                        } else if (i2 == 2) {
                            IOException iOException = (IOException) message.obj;
                            this.o = iOException;
                            int i3 = this.v + 1;
                            this.v = i3;
                            p01 C = p28.C((s28) this.z, elapsedRealtime, j, iOException, i3);
                            int i4 = C.b;
                            if (i4 == 3) {
                                ((w28) this.Y).o = this.o;
                                return;
                            } else if (i4 != 2) {
                                if (i4 == 1) {
                                    this.v = 1;
                                }
                                long j2 = C.c;
                                if (j2 == -9223372036854775807L) {
                                    j2 = (long) Math.min((this.v - 1) * 1000, 5000);
                                }
                                w28 w282 = (w28) this.Y;
                                if (((r28) w282.c) != null) {
                                    z2 = false;
                                }
                                y64.j(z2);
                                w282.c = this;
                                if (j2 > 0) {
                                    sendEmptyMessageDelayed(0, j2);
                                    return;
                                }
                                this.o = null;
                                ((ExecutorService) w282.b).execute(this);
                                return;
                            } else {
                                return;
                            }
                        } else {
                            return;
                        }
                    } else {
                        throw ((Error) message.obj);
                    }
                } else {
                    return;
                }
            default:
                if (!this.y) {
                    int i5 = message.what;
                    if (i5 == 1) {
                        this.o = null;
                        l15 l15 = (l15) this.Y;
                        r28 r282 = (r28) l15.b;
                        r282.getClass();
                        ((ExecutorService) l15.a).execute(r282);
                        return;
                    } else if (i5 != 4) {
                        ((l15) this.Y).b = null;
                        long elapsedRealtime2 = SystemClock.elapsedRealtime();
                        long j3 = elapsedRealtime2 - this.c;
                        q28 q28 = (q28) this.X;
                        q28.getClass();
                        if (this.x) {
                            q28.E((t28) this.z, elapsedRealtime2, j3, false);
                            return;
                        }
                        int i6 = message.what;
                        if (i6 == 2) {
                            try {
                                q28.H((t28) this.z, elapsedRealtime2, j3);
                                return;
                            } catch (RuntimeException e2) {
                                i8b.p("Unexpected exception handling load completed", e2);
                                ((l15) this.Y).c = new androidx.media3.exoplayer.upstream.Loader$UnexpectedLoaderException(e2);
                                return;
                            }
                        } else if (i6 == 3) {
                            IOException iOException2 = (IOException) message.obj;
                            this.o = iOException2;
                            int i7 = this.v + 1;
                            this.v = i7;
                            p01 Z = q28.Z((t28) this.z, elapsedRealtime2, j3, iOException2, i7);
                            int i8 = Z.b;
                            if (i8 == 3) {
                                ((l15) this.Y).c = this.o;
                                return;
                            } else if (i8 != 2) {
                                if (i8 == 1) {
                                    this.v = 1;
                                }
                                long j4 = Z.c;
                                if (j4 == -9223372036854775807L) {
                                    j4 = (long) Math.min((this.v - 1) * 1000, 5000);
                                }
                                l15 l152 = (l15) this.Y;
                                n79.n(((r28) l152.b) == null);
                                l152.b = this;
                                if (j4 > 0) {
                                    sendEmptyMessageDelayed(1, j4);
                                    return;
                                }
                                this.o = null;
                                ((ExecutorService) l152.a).execute(this);
                                return;
                            } else {
                                return;
                            }
                        } else {
                            return;
                        }
                    } else {
                        throw ((Error) message.obj);
                    }
                } else {
                    return;
                }
        }
    }

    public final void run() {
        boolean z2;
        boolean z3;
        switch (this.a) {
            case 0:
                try {
                    synchronized (this) {
                        z2 = !this.x;
                        this.w = Thread.currentThread();
                    }
                    if (z2) {
                        String simpleName = ((s28) this.z).getClass().getSimpleName();
                        m5a.f(simpleName.length() != 0 ? "load:".concat(simpleName) : new String("load:"));
                        ((s28) this.z).load();
                        m5a.s();
                    }
                    synchronized (this) {
                        this.w = null;
                        Thread.interrupted();
                    }
                    if (!this.y) {
                        sendEmptyMessage(1);
                        return;
                    }
                    return;
                } catch (IOException e) {
                    if (!this.y) {
                        obtainMessage(2, e).sendToTarget();
                        return;
                    }
                    return;
                } catch (Exception e2) {
                    if (!this.y) {
                        iq.a("Unexpected exception loading stream", e2);
                        obtainMessage(2, new Loader$UnexpectedLoaderException(e2)).sendToTarget();
                        return;
                    }
                    return;
                } catch (OutOfMemoryError e3) {
                    if (!this.y) {
                        iq.a("OutOfMemory error loading stream", e3);
                        obtainMessage(2, new Loader$UnexpectedLoaderException(e3)).sendToTarget();
                        return;
                    }
                    return;
                } catch (Error e4) {
                    if (!this.y) {
                        iq.a("Unexpected error loading stream", e4);
                        obtainMessage(3, e4).sendToTarget();
                    }
                    throw e4;
                } catch (Throwable th) {
                    m5a.s();
                    throw th;
                }
            default:
                try {
                    synchronized (this) {
                        z3 = !this.x;
                        this.w = Thread.currentThread();
                    }
                    if (z3) {
                        Trace.beginSection("load:".concat(((t28) this.z).getClass().getSimpleName()));
                        ((t28) this.z).load();
                        Trace.endSection();
                    }
                    synchronized (this) {
                        this.w = null;
                        Thread.interrupted();
                    }
                    if (!this.y) {
                        sendEmptyMessage(2);
                        return;
                    }
                    return;
                } catch (IOException e5) {
                    if (!this.y) {
                        obtainMessage(3, e5).sendToTarget();
                        return;
                    }
                    return;
                } catch (Exception e6) {
                    if (!this.y) {
                        i8b.p("Unexpected exception loading stream", e6);
                        obtainMessage(3, new androidx.media3.exoplayer.upstream.Loader$UnexpectedLoaderException(e6)).sendToTarget();
                        return;
                    }
                    return;
                } catch (OutOfMemoryError e7) {
                    if (!this.y) {
                        i8b.p("OutOfMemory error loading stream", e7);
                        obtainMessage(3, new androidx.media3.exoplayer.upstream.Loader$UnexpectedLoaderException(e7)).sendToTarget();
                        return;
                    }
                    return;
                } catch (Error e8) {
                    if (!this.y) {
                        i8b.p("Unexpected error loading stream", e8);
                        obtainMessage(4, e8).sendToTarget();
                    }
                    throw e8;
                } catch (Throwable th2) {
                    Trace.endSection();
                    throw th2;
                }
        }
    }
}
