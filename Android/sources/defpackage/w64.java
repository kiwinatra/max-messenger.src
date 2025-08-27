package defpackage;

import android.graphics.Color;
import java.nio.ByteBuffer;
import java.nio.ByteOrder;
import java.util.concurrent.ConcurrentLinkedQueue;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.atomic.AtomicInteger;
import java.util.concurrent.locks.Condition;
import java.util.concurrent.locks.ReentrantLock;
import kotlin.NoWhenBranchMatchedException;
import kotlin.Result;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.jvm.internal.Intrinsics;

/* renamed from: w64  reason: default package */
public final class w64 extends Thread {
    public final ReentrantLock X;
    public volatile boolean Y;
    public final ic3 a;
    public final int b = 30;
    public u64 c;
    public final ConcurrentLinkedQueue o;
    public final AtomicInteger v;
    public ik w;
    public int x;
    public final ReentrantLock y;
    public final Condition z;

    public w64(u64 u64, ic3 ic3) {
        this.a = ic3;
        this.c = u64;
        this.o = new ConcurrentLinkedQueue();
        this.v = new AtomicInteger(0);
        ReentrantLock reentrantLock = new ReentrantLock();
        this.y = reentrantLock;
        this.z = reentrantLock.newCondition();
        this.X = new ReentrantLock();
    }

    public final void run() {
        byte[] bArr;
        int i;
        int i2;
        float[] fArr;
        ReentrantLock reentrantLock;
        ReentrantLock reentrantLock2;
        loop0:
        while (!this.Y) {
            ReentrantLock reentrantLock3 = this.X;
            reentrantLock3.lock();
            try {
                u64 u64 = this.c;
                boolean z2 = false;
                boolean z3 = u64 == null;
                long bufferedAmount = u64 != null ? u64.a.bufferedAmount() : 0;
                Unit unit = Unit.INSTANCE;
                if (z3) {
                    break;
                }
                while (true) {
                    if ((!this.Y) && (bufferedAmount >= 8000000 || (this.w == null && this.o.isEmpty()))) {
                        try {
                            Result.Companion companion = Result.Companion;
                            reentrantLock = this.y;
                            reentrantLock.lock();
                            this.z.await(50, TimeUnit.MILLISECONDS);
                            reentrantLock.unlock();
                            reentrantLock2 = this.X;
                            reentrantLock2.lock();
                            u64 u642 = this.c;
                            z3 = u642 == null;
                            bufferedAmount = u642 != null ? u642.a.bufferedAmount() : 0;
                            Unit unit2 = Unit.INSTANCE;
                            reentrantLock2.unlock();
                            Result.m23constructorimpl(unit2);
                            continue;
                        } catch (Throwable th) {
                            Result.Companion companion2 = Result.Companion;
                            Result.m23constructorimpl(ResultKt.createFailure(th));
                            continue;
                        }
                        if (z3) {
                            break loop0;
                        }
                    }
                }
                if (!(!this.Y)) {
                    break;
                }
                if (this.w == null) {
                    ik ikVar = (ik) this.o.poll();
                    this.w = ikVar;
                    if (ikVar == null) {
                        continue;
                    } else {
                        this.v.decrementAndGet();
                    }
                }
                ik ikVar2 = this.w;
                if (ikVar2 != null) {
                    int i3 = this.x;
                    this.x = i3 + 1;
                    int i4 = ikVar2.b;
                    gsg gsg = ikVar2.c;
                    if (ikVar2.a == 1) {
                        boolean z4 = gsg instanceof ti;
                        if (gsg instanceof ri) {
                            ((ri) gsg).getClass();
                            fArr = null;
                        } else if (z4) {
                            fArr = new float[0];
                        } else if (gsg instanceof si) {
                            throw new IllegalStateException("Internal error AnimojiSendDataPackage");
                        } else {
                            throw new NoWhenBranchMatchedException();
                        }
                        bArr = new byte[((fArr.length * 4) + 10)];
                        ByteBuffer wrap = ByteBuffer.wrap(bArr);
                        byte b2 = z4 ? (byte) 1 : 0;
                        wrap.put((byte) 1);
                        wrap.putShort((short) i3);
                        wrap.putInt(i4);
                        wrap.putShort(0);
                        wrap.put(b2);
                        wrap.order(ByteOrder.LITTLE_ENDIAN);
                        for (float putFloat : fArr) {
                            wrap.putFloat(putFloat);
                        }
                    } else {
                        boolean z5 = gsg instanceof ri;
                        if (!z5) {
                            if (gsg instanceof si) {
                                i = 3;
                            } else if (gsg instanceof ti) {
                                i = 0;
                            } else {
                                throw new NoWhenBranchMatchedException();
                            }
                            bArr = new byte[(i + 12)];
                            ByteBuffer wrap2 = ByteBuffer.wrap(bArr);
                            if (z5) {
                                i2 = 0;
                            } else if (gsg instanceof si) {
                                i2 = 2;
                            } else if (gsg instanceof ti) {
                                i2 = 1;
                            } else {
                                throw new NoWhenBranchMatchedException();
                            }
                            wrap2.put((byte) 2);
                            wrap2.putShort((short) i3);
                            wrap2.putInt(i4);
                            wrap2.putInt(0);
                            wrap2.put((byte) i2);
                            wrap2.order(ByteOrder.LITTLE_ENDIAN);
                            if (z5) {
                                ((ri) gsg).getClass();
                                throw null;
                            } else if (gsg instanceof si) {
                                si siVar = (si) gsg;
                                wrap2.put((byte) Color.red(siVar.k));
                                wrap2.put((byte) Color.green(siVar.k));
                                wrap2.put((byte) Color.blue(siVar.k));
                            } else {
                                Intrinsics.areEqual((Object) gsg, (Object) ti.k);
                            }
                        } else {
                            ((ri) gsg).getClass();
                            throw null;
                        }
                    }
                    ReentrantLock reentrantLock4 = this.X;
                    reentrantLock4.lock();
                    try {
                        if (this.c == null) {
                            z2 = true;
                        }
                        ((AtomicInteger) this.a.a).addAndGet(bArr.length);
                        u64 u643 = this.c;
                        if (u643 != null) {
                            u643.e(2, bArr);
                        }
                        ((AtomicInteger) this.a.b).incrementAndGet();
                        this.w = null;
                        Unit unit3 = Unit.INSTANCE;
                        reentrantLock4.unlock();
                        if (z2) {
                            break;
                        }
                    } catch (Throwable th2) {
                        reentrantLock4.unlock();
                        throw th2;
                    }
                } else {
                    continue;
                }
            } finally {
                reentrantLock3.unlock();
            }
        }
        this.w = null;
        this.o.clear();
    }
}
