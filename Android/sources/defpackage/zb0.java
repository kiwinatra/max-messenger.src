package defpackage;

import android.content.Context;
import android.media.MediaMuxer;
import android.net.Uri;
import android.os.Build;
import java.io.IOException;
import java.util.Objects;
import java.util.concurrent.Executor;
import java.util.concurrent.RejectedExecutionException;
import java.util.concurrent.atomic.AtomicBoolean;
import java.util.concurrent.atomic.AtomicReference;

/* renamed from: zb0  reason: default package */
public final class zb0 implements AutoCloseable {
    public final tk3 X;
    public final boolean Y;
    public final boolean Z;
    public final grg a;
    public final AtomicBoolean b;
    public final AtomicReference c;
    public final AtomicReference o;
    public final AtomicReference v;
    public final long v0;
    public final AtomicBoolean w;
    public final bs6 x;
    public final an5 y;
    public final Executor z;

    public zb0(an5 an5, Executor executor, tk3 tk3, boolean z2, boolean z3, long j) {
        this.a = Build.VERSION.SDK_INT >= 30 ? new grg(10, new r33()) : new grg(10, new p9a(9));
        this.b = new AtomicBoolean(false);
        this.c = new AtomicReference((Object) null);
        this.o = new AtomicReference((Object) null);
        this.v = new AtomicReference(new l3a(27));
        this.w = new AtomicBoolean(false);
        this.x = new bs6(Boolean.FALSE);
        if (an5 != null) {
            this.y = an5;
            this.z = executor;
            this.X = tk3;
            this.Y = z2;
            this.Z = z3;
            this.v0 = j;
            return;
        }
        throw new NullPointerException("Null getOutputOptions");
    }

    public final void a(Uri uri) {
        if (this.b.get()) {
            b((tk3) this.v.getAndSet((Object) null), uri);
        }
    }

    public final void b(tk3 tk3, Uri uri) {
        if (tk3 != null) {
            ((s33) this.a.b).close();
            tk3.accept(uri);
            return;
        }
        throw new AssertionError("Recording " + this + " has already been finalized");
    }

    public final void close() {
        a(Uri.EMPTY);
    }

    public final void d(Context context) {
        if (!this.b.getAndSet(true)) {
            ((s33) this.a.b).c("finalizeRecording");
            this.c.set(new gyc(this.y));
            if (this.Y) {
                int i = Build.VERSION.SDK_INT;
                AtomicReference atomicReference = this.o;
                if (i >= 31) {
                    atomicReference.set(new hyc(this, context));
                } else {
                    atomicReference.set(new iyc(this));
                }
            }
        } else {
            throw new AssertionError("Recording " + this + " has already been initialized");
        }
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof zb0)) {
            return false;
        }
        zb0 zb0 = (zb0) obj;
        if (this.y.equals(zb0.y)) {
            Executor executor = zb0.z;
            Executor executor2 = this.z;
            if (executor2 != null ? executor2.equals(executor) : executor == null) {
                tk3 tk3 = zb0.X;
                tk3 tk32 = this.X;
                if (tk32 != null ? tk32.equals(tk3) : tk3 == null) {
                    if (this.Y == zb0.Y && this.Z == zb0.Z && this.v0 == zb0.v0) {
                        return true;
                    }
                }
            }
        }
        return false;
    }

    public final void finalize() {
        try {
            ((s33) this.a.b).a();
            tk3 tk3 = (tk3) this.v.getAndSet((Object) null);
            if (tk3 != null) {
                b(tk3, Uri.EMPTY);
            }
        } finally {
            super.finalize();
        }
    }

    public final MediaMuxer g(int i, a0 a0Var) {
        if (this.b.get()) {
            gyc gyc = (gyc) this.c.getAndSet((Object) null);
            if (gyc != null) {
                try {
                    return gyc.a(i, a0Var);
                } catch (RuntimeException e) {
                    throw new IOException("Failed to create MediaMuxer by " + e, e);
                }
            } else {
                throw new AssertionError("One-time media muxer creation has already occurred for recording " + this);
            }
        } else {
            throw new AssertionError("Recording " + this + " has not been initialized");
        }
    }

    public final int hashCode() {
        int hashCode = (this.y.b.hashCode() ^ 1000003) * 1000003;
        int i = 0;
        Executor executor = this.z;
        int hashCode2 = (hashCode ^ (executor == null ? 0 : executor.hashCode())) * 1000003;
        tk3 tk3 = this.X;
        if (tk3 != null) {
            i = tk3.hashCode();
        }
        int i2 = 1237;
        int i3 = (((hashCode2 ^ i) * 1000003) ^ (this.Y ? 1231 : 1237)) * 1000003;
        if (this.Z) {
            i2 = 1231;
        }
        long j = this.v0;
        return ((int) ((j >>> 32) ^ j)) ^ ((i3 ^ i2) * 1000003);
    }

    public final void j(h8g h8g) {
        int i;
        an5 an5 = h8g.a;
        an5 an52 = this.y;
        if (Objects.equals(an5, an52)) {
            "Sending VideoRecordEvent ".concat(h8g.getClass().getSimpleName());
            boolean z2 = h8g instanceof c8g;
            if (z2 && (i = ((c8g) h8g).c) != 0) {
                switch (i) {
                    case 0:
                    case 1:
                    case 2:
                    case 3:
                    case 4:
                    case 5:
                    case 6:
                    case 7:
                    case 8:
                    case 9:
                    case 10:
                        break;
                    default:
                        StringBuilder sb = new StringBuilder("Unknown(");
                        sb.append(i);
                        sb.append(")");
                        break;
                }
            }
            boolean z3 = h8g instanceof f8g;
            bs6 bs6 = this.x;
            if (z3 || (h8g instanceof e8g)) {
                bs6.s(Boolean.TRUE);
            } else if ((h8g instanceof d8g) || z2) {
                bs6.s(Boolean.FALSE);
            }
            Executor executor = this.z;
            if (executor != null && this.X != null) {
                try {
                    executor.execute(new ovb(11, this, h8g));
                } catch (RejectedExecutionException unused) {
                }
            }
        } else {
            throw new AssertionError("Attempted to update event listener with event from incorrect recording [Recording: " + an5 + ", Expected: " + an52 + "]");
        }
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("RecordingRecord{getOutputOptions=");
        sb.append(this.y);
        sb.append(", getCallbackExecutor=");
        sb.append(this.z);
        sb.append(", getEventListener=");
        sb.append(this.X);
        sb.append(", hasAudioEnabled=");
        sb.append(this.Y);
        sb.append(", isPersistent=");
        sb.append(this.Z);
        sb.append(", getRecordingId=");
        return wj6.m(sb, this.v0, "}");
    }
}
