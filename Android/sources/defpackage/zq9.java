package defpackage;

import android.graphics.Bitmap;
import com.facebook.imagepipeline.image.CloseableStaticBitmap;
import java.io.File;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;
import java.util.List;
import java.util.concurrent.atomic.AtomicReference;
import kotlin.Lazy;
import kotlin.LazyKt;
import kotlin.Result;
import kotlin.ResultKt;
import kotlin.coroutines.jvm.internal.Boxing;
import kotlin.jvm.internal.ArrayIteratorKt;
import kotlin.time.Duration;
import kotlin.time.DurationKt;
import kotlin.time.DurationUnit;

/* renamed from: zq9  reason: default package */
public final class zq9 extends f0 {
    public final Lazy v;
    public final Lazy w;
    public final Lazy x;
    public final Lazy y;
    public final Lazy z;

    public zq9(Lazy lazy, Lazy lazy2, Lazy lazy3, Lazy lazy4, Lazy lazy5, Lazy lazy6) {
        super(lazy6, lazy3);
        this.v = lazy;
        this.w = lazy2;
        this.x = lazy4;
        this.y = lazy5;
        this.z = LazyKt.lazy(new ur(21, lazy));
    }

    public final ad9 b() {
        List list = (List) ((AtomicReference) this.c).get();
        of7 of7 = new of7();
        int size = list.size();
        nf7[] nf7Arr = new nf7[size];
        for (int i = 0; i < size; i++) {
            yq9 yq9 = (yq9) list.get(i);
            nf7 nf7 = new nf7();
            try {
                nf7.a = yq9.a;
                nf7.b = yq9.b.toString();
                CharSequence charSequence = yq9.c;
                String str = null;
                String obj = charSequence != null ? charSequence.toString() : null;
                String str2 = "";
                if (obj == null) {
                    obj = str2;
                }
                nf7.c = obj;
                nf7.d = yq9.d;
                Object[] objArr = yq9.e;
                if (objArr != null) {
                    nf7.q = (rf7[]) objArr;
                }
                String str3 = yq9.g;
                if (str3 == null) {
                    str3 = str2;
                }
                nf7.e = str3;
                nf7.f = yq9.h;
                nf7.g = yq9.i;
                nf7.h = yq9.j;
                nf7.i = yq9.k;
                nf7.j = yq9.l;
                nf7.k = yq9.m;
                nf7.l = yq9.n;
                Long l = yq9.o;
                nf7.m = l != null ? l.longValue() : -1;
                String str4 = yq9.r;
                if (str4 == null) {
                    str4 = str2;
                }
                nf7.n = str4;
                byte[] bArr = yq9.s;
                if (bArr == null) {
                    bArr = ct.h;
                }
                nf7.o = bArr;
                CharSequence charSequence2 = yq9.f;
                if (charSequence2 != null) {
                    str = charSequence2.toString();
                }
                if (str != null) {
                    str2 = str;
                }
                nf7.p = str2;
                nf7.r = yq9.p;
                nf7.s = yq9.q.toString();
                nf7.t = yq9.u;
            } catch (Throwable th) {
                z68.f(yq9.getClass().getName(), "toProto error", th);
            }
            nf7Arr[i] = nf7;
        }
        of7.a = nf7Arr;
        return of7;
    }

    public final ez d() {
        return (ez) this.z.getValue();
    }

    public final Boolean h(byte[] bArr) {
        Boolean bool;
        y33 j;
        File file = new File(((po5) ((ln5) this.v.getValue())).c(), "chats_v1");
        try {
            Result.Companion companion = Result.Companion;
            bool = Result.m23constructorimpl(Boolean.valueOf(file.exists() ? file.delete() : false));
        } catch (Throwable th) {
            Result.Companion companion2 = Result.Companion;
            bool = Result.m23constructorimpl(ResultKt.createFailure(th));
        }
        Boolean bool2 = Boolean.FALSE;
        if (Result.m29isFailureimpl(bool)) {
            bool = bool2;
        }
        if (((Boolean) bool).booleanValue()) {
            String e = e();
            a67 a67 = z68.b;
            if (a67 != null && a67.c()) {
                a67.d(w78.v, e, "prev file " + file + " deleted!", (Throwable) null);
            }
        }
        long nanoTime = System.nanoTime();
        String e2 = e();
        a67 a672 = z68.b;
        if (a672 != null && a672.c()) {
            a672.d(w78.v, e2, "loadData start", (Throwable) null);
        }
        z59 z59 = ((ba7) this.w.getValue()).f;
        try {
            of7 of7 = (of7) ad9.mergeFrom(new of7(), bArr);
            int length = of7.a.length;
            ArrayList arrayList = new ArrayList(length);
            Object[] objArr = length == 0 ? ct.c : new Object[length];
            Iterator it = ArrayIteratorKt.iterator(of7.a);
            int i = 0;
            while (it.hasNext()) {
                yq9 a = kr7.a((nf7) it.next(), new vq7(19, (Object) this));
                arrayList.add(a);
                String str = a.r;
                if (str != null) {
                    hd0 hd0 = foa.a;
                    qa7 b = foa.b(str, goa.a, 4);
                    int i2 = i + 1;
                    if (objArr.length < i2) {
                        objArr = Arrays.copyOf(objArr, Math.max(i2, (objArr.length * 3) / 2));
                    }
                    objArr[i] = b;
                    io0 d = ((ba7) this.w.getValue()).d(b, this);
                    byte[] bArr2 = a.s;
                    if (bArr2 != null) {
                        ((no0) this.y.getValue()).getClass();
                        Bitmap a2 = no0.a(bArr2);
                        if (a2 != null) {
                            if (!(vo0.d(a2) == 0 || (j = z59.j(d, y33.p0(CloseableStaticBitmap.of(a2, (b4d) ((oqb) ((Lazy) this.b).getValue()).a(), (tac) bc7.d, 0)))) == null)) {
                                j.close();
                            }
                        }
                    }
                    i = i2;
                }
            }
            ((AtomicReference) this.c).set(arrayList);
            for (int i3 = 0; i3 < i; i3++) {
                ((ba7) this.w.getValue()).f((qa7) objArr[i3], this);
            }
            String e3 = e();
            a67 a673 = z68.b;
            if (a673 != null && a673.c()) {
                w78 w78 = w78.v;
                Duration.Companion companion3 = Duration.Companion;
                a673.d(w78, e3, a81.m("loadData finish ", Duration.m1402toStringimpl(DurationKt.toDuration(System.nanoTime() - nanoTime, DurationUnit.NANOSECONDS))), (Throwable) null);
            }
            return Boxing.boxBoolean(true);
        } catch (InterruptedException e4) {
            throw e4;
        } catch (Throwable th2) {
            String e5 = e();
            a67 a674 = z68.b;
            if (a674 != null && a674.c()) {
                w78 w782 = w78.v;
                Duration.Companion companion4 = Duration.Companion;
                a674.d(w782, e5, a81.m("loadData finish ", Duration.m1402toStringimpl(DurationKt.toDuration(System.nanoTime() - nanoTime, DurationUnit.NANOSECONDS))), (Throwable) null);
            }
            throw th2;
        }
    }
}
