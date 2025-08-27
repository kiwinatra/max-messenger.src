package defpackage;

import android.content.Context;
import android.opengl.GLES20;
import android.view.View;
import com.google.android.material.bottomsheet.BottomSheetBehavior;
import com.google.android.material.sidesheet.SideSheetBehavior;
import java.lang.ref.WeakReference;
import java.nio.Buffer;
import java.nio.ByteBuffer;
import java.nio.ByteOrder;
import java.security.MessageDigest;
import java.util.ArrayDeque;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;
import java.util.WeakHashMap;

/* renamed from: ur0  reason: default package */
public final class ur0 {
    public final /* synthetic */ int a;
    public int b;
    public boolean c;
    public Object d;
    public Object e;

    public /* synthetic */ ur0() {
        this.a = 4;
    }

    public zvg a() {
        vzg.f("execute parameter required", ((t0d) this.d) != null);
        return new zvg(this, (tj5[]) this.e, this.c, this.b);
    }

    public void b(int i) {
        switch (this.a) {
            case 0:
                BottomSheetBehavior bottomSheetBehavior = (BottomSheetBehavior) this.e;
                WeakReference weakReference = bottomSheetBehavior.U;
                if (weakReference != null && weakReference.get() != null) {
                    this.b = i;
                    if (!this.c) {
                        WeakHashMap weakHashMap = gag.a;
                        ((View) bottomSheetBehavior.U.get()).postOnAnimation((cf) this.d);
                        this.c = true;
                        return;
                    }
                    return;
                }
                return;
            default:
                SideSheetBehavior sideSheetBehavior = (SideSheetBehavior) this.e;
                WeakReference weakReference2 = sideSheetBehavior.p;
                if (weakReference2 != null && weakReference2.get() != null) {
                    this.b = i;
                    if (!this.c) {
                        WeakHashMap weakHashMap2 = gag.a;
                        ((View) sideSheetBehavior.p.get()).postOnAnimation((mgd) this.d);
                        this.c = true;
                        return;
                    }
                    return;
                }
                return;
        }
    }

    public void c(yr6 yr6, int i, int i2) {
        int i3;
        ArrayDeque arrayDeque = (ArrayDeque) this.d;
        n79.n(arrayDeque.isEmpty());
        n79.n(((ArrayDeque) this.e).isEmpty());
        for (int i4 = 0; i4 < this.b; i4++) {
            if (this.c) {
                ld8.c(i, i2);
                int[] iArr = new int[1];
                GLES20.glGenTextures(1, iArr, 0);
                ld8.h();
                i3 = iArr[0];
                ld8.d(3553, i3, 9729);
                GLES20.glTexImage2D(3553, 0, 34842, i, i2, 0, 6408, 5131, (Buffer) null);
                ld8.h();
            } else {
                ld8.c(i, i2);
                int[] iArr2 = new int[1];
                GLES20.glGenTextures(1, iArr2, 0);
                ld8.h();
                i3 = iArr2[0];
                ld8.d(3553, i3, 9729);
                GLES20.glTexImage2D(3553, 0, 6408, i, i2, 0, 6408, 5121, (Buffer) null);
                ld8.h();
            }
            arrayDeque.add(yr6.q(i3, i, i2));
        }
    }

    public void d() {
        Iterator g = g();
        while (true) {
            gm7 gm7 = (gm7) g;
            if (gm7.hasNext()) {
                ((gs6) gm7.next()).a();
            } else {
                ((ArrayDeque) this.d).clear();
                ((ArrayDeque) this.e).clear();
                return;
            }
        }
    }

    public void e(yr6 yr6, int i, int i2) {
        if (!((gm7) g()).hasNext()) {
            c(yr6, i, i2);
            return;
        }
        gs6 gs6 = (gs6) ((gm7) g()).next();
        if (gs6.c != i || gs6.d != i2) {
            d();
            c(yr6, i, i2);
        }
    }

    public int f() {
        return !g().hasNext() ? this.b : ((ArrayDeque) this.d).size();
    }

    public Iterator g() {
        Iterable[] iterableArr = {(ArrayDeque) this.d, (ArrayDeque) this.e};
        for (int i = 0; i < 2; i++) {
            iterableArr[i].getClass();
        }
        return new mx5(iterableArr).iterator();
    }

    public gs6 h() {
        ArrayDeque arrayDeque = (ArrayDeque) this.d;
        if (!arrayDeque.isEmpty()) {
            gs6 gs6 = (gs6) arrayDeque.remove();
            ((ArrayDeque) this.e).add(gs6);
            return gs6;
        }
        throw new IllegalStateException("Textures are all in use. Please release in-use textures before calling useTexture.");
    }

    public ur0(MessageDigest messageDigest, int i) {
        this.a = 6;
        this.d = ByteBuffer.allocate(8).order(ByteOrder.LITTLE_ENDIAN);
        this.e = messageDigest;
        this.b = i;
    }

    public ur0(List list, boolean z, CharSequence charSequence) {
        this.a = 2;
        this.d = list;
        this.b = 0;
        this.c = z;
        this.e = charSequence;
    }

    public ur0(cbe cbe) {
        this.a = 2;
        this.d = Collections.singletonList(cbe);
        this.b = 0;
        this.c = false;
        this.e = null;
    }

    public ur0(boolean z, int i) {
        this.a = 5;
        this.b = i;
        this.c = z;
        this.d = new ArrayDeque(i);
        this.e = new ArrayDeque(i);
    }

    public ur0(Context context) {
        this.a = 1;
        this.d = context;
        this.e = new Object();
        this.b = ah4.g;
    }

    public ur0(SideSheetBehavior sideSheetBehavior) {
        this.a = 3;
        this.e = sideSheetBehavior;
        this.d = new mgd(7, this);
    }

    public ur0(BottomSheetBehavior bottomSheetBehavior) {
        this.a = 0;
        this.e = bottomSheetBehavior;
        this.d = new cf(7, this);
    }
}
