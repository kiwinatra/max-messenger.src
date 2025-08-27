package defpackage;

import android.media.MediaMuxer;
import androidx.recyclerview.widget.StaggeredGridLayoutManager;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;
import kotlin.jvm.internal.IntCompanionObject;

/* renamed from: d0a  reason: default package */
public final class d0a {
    public int a;
    public int b;
    public boolean c;
    public boolean d;
    public boolean e;
    public Object f;
    public Object g;

    public d0a(StaggeredGridLayoutManager staggeredGridLayoutManager) {
        this.g = staggeredGridLayoutManager;
        c();
    }

    public void a() {
        ArrayList arrayList = (ArrayList) this.g;
        Iterator it = arrayList.iterator();
        while (it.hasNext()) {
            c0a c0a = (c0a) it.next();
            ((MediaMuxer) this.f).writeSampleData(c0a.a, c0a.b, c0a.c);
        }
        arrayList.clear();
    }

    public boolean b() {
        boolean z = this.d;
        boolean z2 = (z && this.a != -1) || (!z && this.a == -1);
        boolean z3 = this.e;
        return z2 && ((z3 && this.b != -1) || (!z3 && this.b == -1));
    }

    public void c() {
        this.a = -1;
        this.b = IntCompanionObject.MIN_VALUE;
        this.c = false;
        this.d = false;
        this.e = false;
        int[] iArr = (int[]) this.f;
        if (iArr != null) {
            Arrays.fill(iArr, -1);
        }
    }
}
