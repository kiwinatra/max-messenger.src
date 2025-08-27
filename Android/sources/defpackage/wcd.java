package defpackage;

import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.graphics.Matrix;
import android.net.Uri;
import kotlin.ResultKt;
import kotlin.UByte;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function2;

/* renamed from: wcd  reason: default package */
public final class wcd extends SuspendLambda implements Function2 {
    public final /* synthetic */ xcd a;
    public final /* synthetic */ byte[] b;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public wcd(xcd xcd, byte[] bArr, Continuation continuation) {
        super(2, continuation);
        this.a = xcd;
        this.b = bArr;
    }

    public final Continuation create(Object obj, Continuation continuation) {
        return new wcd(this.a, this.b, continuation);
    }

    public final Object invoke(Object obj, Object obj2) {
        return ((wcd) create((d14) obj, (Continuation) obj2)).invokeSuspend(Unit.INSTANCE);
    }

    public final Object invokeSuspend(Object obj) {
        int i;
        int i2;
        int M;
        int i3;
        boolean z = true;
        IntrinsicsKt.getCOROUTINE_SUSPENDED();
        ResultKt.throwOnFailure(obj);
        xcd xcd = this.a;
        ((me) xcd.a).e.getClass();
        int i4 = m5a.e;
        byte[] bArr = this.b;
        if (bArr != null) {
            int i5 = 0;
            while (true) {
                if (i5 + 3 >= bArr.length) {
                    i2 = 0;
                    break;
                }
                i3 = i5 + 1;
                if ((bArr[i5] & UByte.MAX_VALUE) != 255) {
                    break;
                }
                byte b2 = bArr[i3] & UByte.MAX_VALUE;
                if (b2 != 255) {
                    i3 = i5 + 2;
                    if (!(b2 == 216 || b2 == 1)) {
                        if (b2 != 217 && b2 != 218) {
                            int M2 = m5a.M(bArr, i3, 2, false);
                            if (M2 >= 2 && (i3 = i3 + M2) <= bArr.length) {
                                if (b2 == 225 && M2 >= 8 && m5a.M(bArr, i5 + 4, 4, false) == 1165519206 && m5a.M(bArr, i5 + 8, 2, false) == 0) {
                                    i5 += 10;
                                    i2 = M2 - 8;
                                    break;
                                }
                            } else {
                                break;
                            }
                        } else {
                            break;
                        }
                    }
                }
                i5 = i3;
            }
            i2 = 0;
            i5 = i3;
            if (i2 > 8 && ((M = m5a.M(bArr, i5, 4, false)) == 1229531648 || M == 1296891946)) {
                if (M != 1229531648) {
                    z = false;
                }
                int M3 = m5a.M(bArr, i5 + 4, 4, z) + 2;
                if (M3 >= 10 && M3 <= i2) {
                    int i6 = i5 + M3;
                    int i7 = i2 - M3;
                    int M4 = m5a.M(bArr, i6 - 2, 2, z);
                    while (true) {
                        int i8 = M4 - 1;
                        if (M4 <= 0 || i7 < 12) {
                            break;
                        } else if (m5a.M(bArr, i6, 2, z) == 274) {
                            int M5 = m5a.M(bArr, i6 + 8, 2, z);
                            if (M5 == 3) {
                                i = 180;
                            } else if (M5 == 6) {
                                i = 90;
                            } else if (M5 == 8) {
                                i = 270;
                            }
                        } else {
                            i6 += 12;
                            i7 -= 12;
                            M4 = i8;
                        }
                    }
                }
            }
        }
        i = 0;
        Matrix matrix = new Matrix();
        matrix.setRotate((float) i);
        Bitmap decodeByteArray = BitmapFactory.decodeByteArray(bArr, 0, bArr.length);
        if (decodeByteArray.isMutable() || !matrix.isIdentity()) {
            Bitmap createBitmap = Bitmap.createBitmap(decodeByteArray, 0, 0, decodeByteArray.getWidth(), decodeByteArray.getHeight(), matrix, true);
            decodeByteArray.recycle();
            decodeByteArray = createBitmap;
        }
        to0 to0 = new to0(decodeByteArray);
        ggd ggd = xcd.a;
        Uri d = ((me) ggd).d(to0, ggd.b(false));
        decodeByteArray.recycle();
        return d;
    }
}
