package defpackage;

import android.transition.TransitionManager;
import android.view.View;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;

/* renamed from: oqc  reason: default package */
public final /* synthetic */ class oqc implements Function0 {
    public final /* synthetic */ int a;
    public final /* synthetic */ pqc b;

    public /* synthetic */ oqc(pqc pqc, int i) {
        this.a = i;
        this.b = pqc;
    }

    public final Object invoke() {
        rz9 rz9;
        int i;
        switch (this.a) {
            case 0:
                pqc pqc = this.b;
                pqc.d();
                rz9 rz92 = pqc.z;
                Object[] objArr = rz92.b;
                long[] jArr = rz92.a;
                int length = jArr.length - 2;
                if (length >= 0) {
                    int i2 = 0;
                    while (true) {
                        long j = jArr[i2];
                        if ((((~j) << 7) & j & -9187201950435737472L) != -9187201950435737472L) {
                            int i3 = 8 - ((~(i2 - length)) >>> 31);
                            for (int i4 = 0; i4 < i3; i4++) {
                                if ((255 & j) < 128) {
                                    pqc.removeView((View) objArr[(i2 << 3) + i4]);
                                }
                                j >>= 8;
                            }
                            if (i3 != 8) {
                            }
                        }
                        if (i2 != length) {
                            i2++;
                        }
                    }
                }
                pqc.c();
                pqc.e();
                if (pqc.getChildCount() == 0) {
                    pqc.setVisibility(8);
                }
                return Unit.INSTANCE;
            case 1:
                pqc pqc2 = this.b;
                TransitionManager.beginDelayedTransition(pqc2, pqc2.x);
                rz9 rz93 = pqc2.y;
                boolean z = rz93.d == 0;
                rz9 rz94 = pqc2.z;
                if (!z || rz94.d != 0) {
                    Object[] objArr2 = rz93.b;
                    long[] jArr2 = rz93.a;
                    int length2 = jArr2.length - 2;
                    long j2 = 128;
                    if (length2 >= 0) {
                        int i5 = 0;
                        while (true) {
                            long j3 = jArr2[i5];
                            rz9 = rz94;
                            if ((((~j3) << 7) & j3 & -9187201950435737472L) != -9187201950435737472L) {
                                int i6 = 8 - ((~(i5 - length2)) >>> 31);
                                int i7 = 0;
                                while (i7 < i6) {
                                    if ((j3 & 255) < j2) {
                                        ((View) objArr2[(i5 << 3) + i7]).setVisibility(0);
                                    }
                                    j3 >>= 8;
                                    i7++;
                                    j2 = 128;
                                }
                                i = 0;
                                if (i6 != 8) {
                                }
                            } else {
                                i = 0;
                            }
                            if (i5 != length2) {
                                i5++;
                                rz94 = rz9;
                                j2 = 128;
                            }
                        }
                    } else {
                        rz9 = rz94;
                        i = 0;
                    }
                    rz9 rz95 = rz9;
                    Object[] objArr3 = rz95.b;
                    long[] jArr3 = rz95.a;
                    int length3 = jArr3.length - 2;
                    if (length3 >= 0) {
                        int i8 = i;
                        while (true) {
                            long j4 = jArr3[i8];
                            if ((((~j4) << 7) & j4 & -9187201950435737472L) != -9187201950435737472L) {
                                int i9 = 8 - ((~(i8 - length3)) >>> 31);
                                for (int i10 = i; i10 < i9; i10++) {
                                    if ((j4 & 255) < 128) {
                                        ((View) objArr3[(i8 << 3) + i10]).setVisibility(8);
                                    }
                                    j4 >>= 8;
                                }
                                if (i9 != 8) {
                                }
                            }
                            if (i8 != length3) {
                                i8++;
                            }
                        }
                    }
                } else {
                    pqc2.requestLayout();
                }
                return Unit.INSTANCE;
            case 2:
                return Boolean.valueOf(this.b.c);
            default:
                pqc pqc3 = this.b;
                pqc3.d();
                pqc3.c();
                pqc3.e();
                return Unit.INSTANCE;
        }
    }
}
