package defpackage;

import android.util.SparseArray;

/* renamed from: lzc  reason: default package */
public final class lzc {
    public int a;
    public SparseArray b;
    public int c;
    public int d;
    public int e;
    public int f;
    public boolean g;
    public boolean h;
    public boolean i;
    public boolean j;
    public boolean k;
    public boolean l;
    public int m;
    public long n;
    public int o;

    public final void a(int i2) {
        if ((this.e & i2) == 0) {
            throw new IllegalStateException("Layout state should be one of " + Integer.toBinaryString(i2) + " but it is " + Integer.toBinaryString(this.e));
        }
    }

    public final int b() {
        return this.h ? this.c - this.d : this.f;
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("State{mTargetPosition=");
        sb.append(this.a);
        sb.append(", mData=");
        sb.append(this.b);
        sb.append(", mItemCount=");
        sb.append(this.f);
        sb.append(", mIsMeasuring=");
        sb.append(this.j);
        sb.append(", mPreviousLayoutItemCount=");
        sb.append(this.c);
        sb.append(", mDeletedInvisibleItemCountSincePreviousLayout=");
        sb.append(this.d);
        sb.append(", mStructureChanged=");
        sb.append(this.g);
        sb.append(", mInPreLayout=");
        sb.append(this.h);
        sb.append(", mRunSimpleAnimations=");
        sb.append(this.k);
        sb.append(", mRunPredictiveAnimations=");
        return wzf.l(sb, this.l, '}');
    }
}
