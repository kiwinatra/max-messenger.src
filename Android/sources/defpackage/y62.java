package defpackage;

import android.os.SystemClock;
import com.google.android.gms.common.api.ApiException;
import com.google.android.gms.common.api.Status;
import com.google.android.gms.common.internal.a;
import com.google.android.gms.tasks.Task;
import java.util.Collections;
import java.util.List;
import org.apache.http.HttpStatus;

/* renamed from: y62  reason: default package */
public final class y62 implements ima {
    public int a;
    public long b;
    public long c;
    public Object o;
    public Object v;

    public static ki3 b(kvg kvg, a aVar, int i) {
        h5h h5h = aVar.D0;
        ki3 ki3 = h5h == null ? null : h5h.o;
        if (ki3 != null && ki3.b) {
            int[] iArr = ki3.o;
            int i2 = 0;
            if (iArr == null) {
                int[] iArr2 = ki3.w;
                if (iArr2 != null) {
                    while (i2 < iArr2.length) {
                        if (iArr2[i2] != i) {
                            i2++;
                        }
                    }
                }
            } else {
                while (i2 < iArr.length) {
                    if (iArr[i2] != i) {
                        i2++;
                    }
                }
            }
            if (kvg.n < ki3.v) {
                return ki3;
            }
            return null;
        }
        return null;
    }

    public z62 a() {
        if (((List) this.v) == null) {
            this.v = Collections.emptyList();
        }
        return new z62((f72) this.o, this.a, this.b, this.c, (List) this.v);
    }

    public void q(Task task) {
        int i;
        int i2;
        int i3;
        int i4;
        int i5;
        int i6;
        long j;
        int i7;
        if (((ht6) this.o).a()) {
            c8d c8d = (c8d) b8d.n().a;
            if (c8d == null || c8d.b) {
                kvg kvg = (kvg) ((ht6) this.o).X.get((bm) this.v);
                if (kvg != null) {
                    ql qlVar = kvg.d;
                    if (qlVar instanceof a) {
                        a aVar = (a) qlVar;
                        long j2 = 0;
                        boolean z = true;
                        boolean z2 = this.b > 0;
                        int i8 = aVar.y0;
                        if (c8d != null) {
                            boolean z3 = z2 & c8d.c;
                            int i9 = c8d.o;
                            int i10 = c8d.v;
                            i3 = c8d.a;
                            if (aVar.D0 != null && !aVar.c()) {
                                ki3 b2 = b(kvg, aVar, this.a);
                                if (b2 != null) {
                                    if (!b2.c || this.b <= 0) {
                                        z = false;
                                    }
                                    i10 = b2.v;
                                    z3 = z;
                                } else {
                                    return;
                                }
                            }
                            i2 = i9;
                            i = i10;
                        } else {
                            i3 = 0;
                            i = 100;
                            i2 = 5000;
                        }
                        ht6 ht6 = (ht6) this.o;
                        if (task.h()) {
                            i5 = 0;
                            i4 = 0;
                        } else {
                            if (((s7h) task).d) {
                                i5 = 100;
                            } else {
                                Exception e = task.e();
                                if (e instanceof ApiException) {
                                    Status status = ((ApiException) e).a;
                                    i7 = status.a;
                                    bi3 bi3 = status.o;
                                    if (bi3 != null) {
                                        i4 = bi3.b;
                                        i5 = i7;
                                    }
                                } else {
                                    i7 = HttpStatus.SC_SWITCHING_PROTOCOLS;
                                }
                                i5 = i7;
                            }
                            i4 = -1;
                        }
                        if (z2) {
                            long j3 = this.b;
                            long j4 = this.c;
                            long currentTimeMillis = System.currentTimeMillis();
                            i6 = (int) (SystemClock.elapsedRealtime() - j4);
                            j = j3;
                            j2 = currentTimeMillis;
                        } else {
                            j = 0;
                            i6 = -1;
                        }
                        lq9 lq9 = new lq9(this.a, i5, i4, j, j2, (String) null, (String) null, i8, i6);
                        ht6.getClass();
                        uvg uvg = new uvg(lq9, i3, (long) i2, i);
                        ws9 ws9 = ht6.v0;
                        ws9.sendMessage(ws9.obtainMessage(18, uvg));
                    }
                }
            }
        }
    }
}
