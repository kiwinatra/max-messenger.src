package defpackage;

import android.util.Range;
import androidx.recyclerview.widget.RecyclerView;
import java.io.EOFException;
import java.io.IOException;
import java.net.Proxy;
import java.net.Socket;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import kotlinx.serialization.MissingFieldException;
import org.json.HTTP;

/* renamed from: u9  reason: default package */
public final class u9 implements v2f, s95 {
    public final /* synthetic */ int a;
    public int b;
    public Object c;
    public Object o;
    public Object v;
    public Object w;
    public Object x;

    public /* synthetic */ u9() {
        this.a = 3;
    }

    public boolean A() {
        return ((ArrayList) this.o).size() > 0;
    }

    public boolean B() {
        int i = this.b;
        if (i != 1 && i != 2 && i != 4 && i != 3) {
            return false;
        }
        ArrayList arrayList = (ArrayList) this.o;
        int size = arrayList == null ? 0 : arrayList.size();
        ArrayList arrayList2 = (ArrayList) this.v;
        int size2 = size + (arrayList2 == null ? 0 : arrayList2.size());
        ArrayList arrayList3 = (ArrayList) this.w;
        return size2 + (arrayList3 == null ? 0 : arrayList3.size()) == 1;
    }

    public l37 C(long j) {
        if (this.b == 4) {
            this.b = 5;
            return new l37(this, j);
        }
        throw new IllegalStateException(("state: " + this.b).toString());
    }

    /* JADX WARNING: type inference failed for: r0v5, types: [t9, java.lang.Object] */
    public t9 D(Object obj, int i, int i2, int i3) {
        t9 t9Var = (t9) ((wqb) this.c).c();
        if (t9Var == null) {
            ? obj2 = new Object();
            obj2.a = i;
            obj2.b = i2;
            obj2.d = i3;
            obj2.c = obj;
            return obj2;
        }
        t9Var.a = i;
        t9Var.b = i2;
        t9Var.d = i3;
        t9Var.c = obj;
        return t9Var;
    }

    public void E(t9 t9Var) {
        ((ArrayList) this.v).add(t9Var);
        int i = t9Var.a;
        syc syc = (syc) this.w;
        if (i == 1) {
            syc.j(t9Var.b, t9Var.d);
        } else if (i == 2) {
            int i2 = t9Var.b;
            int i3 = t9Var.d;
            RecyclerView recyclerView = (RecyclerView) syc.b;
            recyclerView.f0(i2, i3, false);
            recyclerView.t1 = true;
        } else if (i == 4) {
            syc.h(t9Var.b, t9Var.d, t9Var.c);
        } else if (i == 8) {
            syc.k(t9Var.b, t9Var.d);
        } else {
            throw new IllegalArgumentException("Unknown update op type for " + t9Var);
        }
    }

    /* JADX WARNING: Removed duplicated region for block: B:164:0x028b  */
    /* JADX WARNING: Removed duplicated region for block: B:165:0x028e  */
    /* JADX WARNING: Removed duplicated region for block: B:175:0x02ad  */
    /* JADX WARNING: Removed duplicated region for block: B:176:0x02b1  */
    /* JADX WARNING: Removed duplicated region for block: B:191:0x01ca A[SYNTHETIC] */
    /* JADX WARNING: Removed duplicated region for block: B:26:0x006d  */
    /* JADX WARNING: Removed duplicated region for block: B:27:0x0071  */
    /* JADX WARNING: Removed duplicated region for block: B:33:0x008c  */
    /* JADX WARNING: Removed duplicated region for block: B:34:0x0090  */
    /* JADX WARNING: Removed duplicated region for block: B:36:0x00a1  */
    /* JADX WARNING: Removed duplicated region for block: B:38:0x00a6  */
    /* JADX WARNING: Removed duplicated region for block: B:56:0x00d5  */
    /* JADX WARNING: Removed duplicated region for block: B:57:0x00d9  */
    /* JADX WARNING: Removed duplicated region for block: B:64:0x0100  */
    /* JADX WARNING: Removed duplicated region for block: B:65:0x0104  */
    /* JADX WARNING: Removed duplicated region for block: B:70:0x011a  */
    /* JADX WARNING: Removed duplicated region for block: B:71:0x012e  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void F() {
        /*
            r16 = this;
            r0 = r16
            r1 = -1
            r2 = 1
            java.lang.Object r3 = r0.o
            java.util.ArrayList r3 = (java.util.ArrayList) r3
            java.lang.Object r4 = r0.x
            d6a r4 = (defpackage.d6a) r4
            r4.getClass()
        L_0x000f:
            int r5 = r3.size()
            int r5 = r5 - r2
            r7 = 0
        L_0x0015:
            r8 = 8
            if (r5 < 0) goto L_0x0029
            java.lang.Object r9 = r3.get(r5)
            t9 r9 = (defpackage.t9) r9
            int r9 = r9.a
            if (r9 != r8) goto L_0x0026
            if (r7 == 0) goto L_0x0027
            goto L_0x002a
        L_0x0026:
            r7 = r2
        L_0x0027:
            int r5 = r5 + r1
            goto L_0x0015
        L_0x0029:
            r5 = r1
        L_0x002a:
            r7 = 0
            r9 = 4
            r10 = 2
            if (r5 == r1) goto L_0x01cd
            int r8 = r5 + 1
            java.lang.Object r11 = r3.get(r5)
            t9 r11 = (defpackage.t9) r11
            java.lang.Object r12 = r3.get(r8)
            t9 r12 = (defpackage.t9) r12
            int r13 = r12.a
            if (r13 == r2) goto L_0x01a3
            java.lang.Object r14 = r4.b
            u9 r14 = (defpackage.u9) r14
            if (r13 == r10) goto L_0x00ab
            if (r13 == r9) goto L_0x004b
            goto L_0x01ca
        L_0x004b:
            int r6 = r11.d
            int r10 = r12.b
            if (r6 >= r10) goto L_0x0055
            int r10 = r10 - r2
            r12.b = r10
            goto L_0x0066
        L_0x0055:
            int r13 = r12.d
            int r10 = r10 + r13
            if (r6 >= r10) goto L_0x0066
            int r13 = r13 - r2
            r12.d = r13
            int r6 = r11.b
            java.lang.Object r10 = r12.c
            t9 r6 = r14.D(r10, r9, r6, r2)
            goto L_0x0067
        L_0x0066:
            r6 = r7
        L_0x0067:
            int r10 = r11.b
            int r13 = r12.b
            if (r10 > r13) goto L_0x0071
            int r13 = r13 + r2
            r12.b = r13
            goto L_0x0084
        L_0x0071:
            int r15 = r12.d
            int r13 = r13 + r15
            if (r10 >= r13) goto L_0x0084
            int r13 = r13 - r10
            int r10 = r10 + r2
            java.lang.Object r15 = r12.c
            t9 r9 = r14.D(r15, r9, r10, r13)
            int r10 = r12.d
            int r10 = r10 - r13
            r12.d = r10
            goto L_0x0085
        L_0x0084:
            r9 = r7
        L_0x0085:
            r3.set(r8, r11)
            int r8 = r12.d
            if (r8 <= 0) goto L_0x0090
            r3.set(r5, r12)
            goto L_0x009f
        L_0x0090:
            r3.remove(r5)
            r14.getClass()
            r12.c = r7
            java.lang.Object r7 = r14.c
            wqb r7 = (defpackage.wqb) r7
            r7.b(r12)
        L_0x009f:
            if (r6 == 0) goto L_0x00a4
            r3.add(r5, r6)
        L_0x00a4:
            if (r9 == 0) goto L_0x01ca
            r3.add(r5, r9)
            goto L_0x01ca
        L_0x00ab:
            int r9 = r11.b
            int r13 = r11.d
            if (r9 >= r13) goto L_0x00c1
            int r15 = r12.b
            if (r15 != r9) goto L_0x00be
            int r15 = r12.d
            int r9 = r13 - r9
            if (r15 != r9) goto L_0x00be
            r6 = r2
            r1 = 0
            goto L_0x00d1
        L_0x00be:
            r1 = 0
        L_0x00bf:
            r6 = 0
            goto L_0x00d1
        L_0x00c1:
            int r15 = r12.b
            int r1 = r13 + 1
            if (r15 != r1) goto L_0x00cf
            int r1 = r12.d
            int r9 = r9 - r13
            if (r1 != r9) goto L_0x00cf
            r1 = r2
            r6 = r1
            goto L_0x00d1
        L_0x00cf:
            r1 = r2
            goto L_0x00bf
        L_0x00d1:
            int r9 = r12.b
            if (r13 >= r9) goto L_0x00d9
            int r9 = r9 - r2
            r12.b = r9
            goto L_0x00fa
        L_0x00d9:
            int r15 = r12.d
            int r9 = r9 + r15
            if (r13 >= r9) goto L_0x00fa
            int r15 = r15 - r2
            r12.d = r15
            r11.a = r10
            r11.d = r2
            int r1 = r12.d
            if (r1 != 0) goto L_0x01ca
            r3.remove(r8)
            r14.getClass()
            r12.c = r7
            java.lang.Object r1 = r14.c
            wqb r1 = (defpackage.wqb) r1
            r1.b(r12)
            goto L_0x01ca
        L_0x00fa:
            int r9 = r11.b
            int r13 = r12.b
            if (r9 > r13) goto L_0x0104
            int r13 = r13 + r2
            r12.b = r13
            goto L_0x0117
        L_0x0104:
            int r15 = r12.d
            int r13 = r13 + r15
            if (r9 >= r13) goto L_0x0117
            int r13 = r13 - r9
            int r9 = r9 + r2
            t9 r9 = r14.D(r7, r10, r9, r13)
            int r10 = r11.b
            int r13 = r12.b
            int r10 = r10 - r13
            r12.d = r10
            goto L_0x0118
        L_0x0117:
            r9 = r7
        L_0x0118:
            if (r6 == 0) goto L_0x012e
            r3.set(r5, r12)
            r3.remove(r8)
            r14.getClass()
            r11.c = r7
            java.lang.Object r1 = r14.c
            wqb r1 = (defpackage.wqb) r1
            r1.b(r11)
            goto L_0x01ca
        L_0x012e:
            if (r1 == 0) goto L_0x015f
            if (r9 == 0) goto L_0x0148
            int r1 = r11.b
            int r6 = r9.b
            if (r1 <= r6) goto L_0x013d
            int r6 = r9.d
            int r1 = r1 - r6
            r11.b = r1
        L_0x013d:
            int r1 = r11.d
            int r6 = r9.b
            if (r1 <= r6) goto L_0x0148
            int r6 = r9.d
            int r1 = r1 - r6
            r11.d = r1
        L_0x0148:
            int r1 = r11.b
            int r6 = r12.b
            if (r1 <= r6) goto L_0x0153
            int r6 = r12.d
            int r1 = r1 - r6
            r11.b = r1
        L_0x0153:
            int r1 = r11.d
            int r6 = r12.b
            if (r1 <= r6) goto L_0x018d
            int r6 = r12.d
            int r1 = r1 - r6
            r11.d = r1
            goto L_0x018d
        L_0x015f:
            if (r9 == 0) goto L_0x0177
            int r1 = r11.b
            int r6 = r9.b
            if (r1 < r6) goto L_0x016c
            int r6 = r9.d
            int r1 = r1 - r6
            r11.b = r1
        L_0x016c:
            int r1 = r11.d
            int r6 = r9.b
            if (r1 < r6) goto L_0x0177
            int r6 = r9.d
            int r1 = r1 - r6
            r11.d = r1
        L_0x0177:
            int r1 = r11.b
            int r6 = r12.b
            if (r1 < r6) goto L_0x0182
            int r6 = r12.d
            int r1 = r1 - r6
            r11.b = r1
        L_0x0182:
            int r1 = r11.d
            int r6 = r12.b
            if (r1 < r6) goto L_0x018d
            int r6 = r12.d
            int r1 = r1 - r6
            r11.d = r1
        L_0x018d:
            r3.set(r5, r12)
            int r1 = r11.b
            int r6 = r11.d
            if (r1 == r6) goto L_0x019a
            r3.set(r8, r11)
            goto L_0x019d
        L_0x019a:
            r3.remove(r8)
        L_0x019d:
            if (r9 == 0) goto L_0x01ca
            r3.add(r5, r9)
            goto L_0x01ca
        L_0x01a3:
            int r1 = r11.d
            int r7 = r12.b
            if (r1 >= r7) goto L_0x01ab
            r6 = -1
            goto L_0x01ac
        L_0x01ab:
            r6 = 0
        L_0x01ac:
            int r9 = r11.b
            if (r9 >= r7) goto L_0x01b1
            int r6 = r6 + r2
        L_0x01b1:
            if (r7 > r9) goto L_0x01b8
            int r7 = r12.d
            int r9 = r9 + r7
            r11.b = r9
        L_0x01b8:
            int r7 = r12.b
            if (r7 > r1) goto L_0x01c1
            int r9 = r12.d
            int r1 = r1 + r9
            r11.d = r1
        L_0x01c1:
            int r7 = r7 + r6
            r12.b = r7
            r3.set(r5, r12)
            r3.set(r8, r11)
        L_0x01ca:
            r1 = -1
            goto L_0x000f
        L_0x01cd:
            int r1 = r3.size()
            r4 = 0
        L_0x01d2:
            if (r4 >= r1) goto L_0x02df
            java.lang.Object r5 = r3.get(r4)
            t9 r5 = (defpackage.t9) r5
            int r11 = r5.a
            if (r11 == r2) goto L_0x02d5
            java.lang.Object r12 = r0.w
            syc r12 = (defpackage.syc) r12
            if (r11 == r10) goto L_0x0260
            if (r11 == r9) goto L_0x01ef
            if (r11 == r8) goto L_0x01eb
        L_0x01e8:
            r8 = r10
            goto L_0x02d9
        L_0x01eb:
            r0.E(r5)
            goto L_0x01e8
        L_0x01ef:
            int r11 = r5.b
            int r13 = r5.d
            int r13 = r13 + r11
            r14 = r11
            r6 = -1
            r15 = 0
        L_0x01f7:
            if (r11 >= r13) goto L_0x023f
            java.lang.Object r8 = r12.b
            androidx.recyclerview.widget.RecyclerView r8 = (androidx.recyclerview.widget.RecyclerView) r8
            pzc r10 = r8.O(r11, r2)
            if (r10 != 0) goto L_0x0205
            r10 = r7
            goto L_0x0212
        L_0x0205:
            mqf r8 = r8.w
            android.view.View r7 = r10.a
            boolean r7 = r8.M(r7)
            if (r7 == 0) goto L_0x0212
            boolean r7 = androidx.recyclerview.widget.RecyclerView.J1
            r10 = 0
        L_0x0212:
            if (r10 != 0) goto L_0x022a
            boolean r7 = r0.j(r11)
            if (r7 == 0) goto L_0x021b
            goto L_0x022a
        L_0x021b:
            if (r6 != r2) goto L_0x0228
            java.lang.Object r6 = r5.c
            t9 r6 = r0.D(r6, r9, r14, r15)
            r0.E(r6)
            r14 = r11
            r15 = 0
        L_0x0228:
            r6 = 0
            goto L_0x0238
        L_0x022a:
            if (r6 != 0) goto L_0x0237
            java.lang.Object r6 = r5.c
            t9 r6 = r0.D(r6, r9, r14, r15)
            r0.w(r6)
            r14 = r11
            r15 = 0
        L_0x0237:
            r6 = r2
        L_0x0238:
            int r15 = r15 + r2
            int r11 = r11 + r2
            r7 = 0
            r8 = 8
            r10 = 2
            goto L_0x01f7
        L_0x023f:
            int r7 = r5.d
            if (r15 == r7) goto L_0x0253
            java.lang.Object r7 = r5.c
            r8 = 0
            r5.c = r8
            java.lang.Object r8 = r0.c
            wqb r8 = (defpackage.wqb) r8
            r8.b(r5)
            t9 r5 = r0.D(r7, r9, r14, r15)
        L_0x0253:
            if (r6 != 0) goto L_0x0259
            r0.w(r5)
            goto L_0x025c
        L_0x0259:
            r0.E(r5)
        L_0x025c:
            r7 = 0
            r8 = 2
            goto L_0x02d9
        L_0x0260:
            int r6 = r5.b
            int r7 = r5.d
            int r7 = r7 + r6
            r8 = r6
            r10 = 0
            r11 = -1
        L_0x0268:
            if (r8 >= r7) goto L_0x02b5
            java.lang.Object r13 = r12.b
            androidx.recyclerview.widget.RecyclerView r13 = (androidx.recyclerview.widget.RecyclerView) r13
            pzc r14 = r13.O(r8, r2)
            if (r14 != 0) goto L_0x0276
        L_0x0274:
            r14 = 0
            goto L_0x0283
        L_0x0276:
            mqf r13 = r13.w
            android.view.View r15 = r14.a
            boolean r13 = r13.M(r15)
            if (r13 == 0) goto L_0x0283
            boolean r13 = androidx.recyclerview.widget.RecyclerView.J1
            goto L_0x0274
        L_0x0283:
            if (r14 != 0) goto L_0x028b
            boolean r13 = r0.j(r8)
            if (r13 == 0) goto L_0x028e
        L_0x028b:
            r13 = 0
            r14 = 2
            goto L_0x029e
        L_0x028e:
            r13 = 0
            r14 = 2
            if (r11 != r2) goto L_0x029b
            t9 r11 = r0.D(r13, r14, r6, r10)
            r0.E(r11)
            r11 = r2
            goto L_0x029c
        L_0x029b:
            r11 = 0
        L_0x029c:
            r13 = 0
            goto L_0x02ab
        L_0x029e:
            if (r11 != 0) goto L_0x02a9
            t9 r11 = r0.D(r13, r14, r6, r10)
            r0.w(r11)
            r11 = r2
            goto L_0x02aa
        L_0x02a9:
            r11 = 0
        L_0x02aa:
            r13 = r2
        L_0x02ab:
            if (r11 == 0) goto L_0x02b1
            int r8 = r8 - r10
            int r7 = r7 - r10
            r10 = r2
            goto L_0x02b2
        L_0x02b1:
            int r10 = r10 + r2
        L_0x02b2:
            int r8 = r8 + r2
            r11 = r13
            goto L_0x0268
        L_0x02b5:
            int r7 = r5.d
            if (r10 == r7) goto L_0x02c9
            r7 = 0
            r5.c = r7
            java.lang.Object r8 = r0.c
            wqb r8 = (defpackage.wqb) r8
            r8.b(r5)
            r8 = 2
            t9 r5 = r0.D(r7, r8, r6, r10)
            goto L_0x02cb
        L_0x02c9:
            r7 = 0
            r8 = 2
        L_0x02cb:
            if (r11 != 0) goto L_0x02d1
            r0.w(r5)
            goto L_0x02d9
        L_0x02d1:
            r0.E(r5)
            goto L_0x02d9
        L_0x02d5:
            r8 = r10
            r0.E(r5)
        L_0x02d9:
            int r4 = r4 + r2
            r10 = r8
            r8 = 8
            goto L_0x01d2
        L_0x02df:
            r3.clear()
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.u9.F():void");
    }

    public void G(t9 t9Var) {
        t9Var.c = null;
        ((wqb) this.c).b(t9Var);
    }

    public void H(List list) {
        int size = list.size();
        for (int i = 0; i < size; i++) {
            G((t9) list.get(i));
        }
        list.clear();
    }

    public int I(int i, int i2) {
        int i3;
        int i4;
        ArrayList arrayList = (ArrayList) this.v;
        for (int size = arrayList.size() - 1; size >= 0; size--) {
            t9 t9Var = (t9) arrayList.get(size);
            int i5 = t9Var.a;
            if (i5 == 8) {
                int i6 = t9Var.b;
                int i7 = t9Var.d;
                if (i6 < i7) {
                    i4 = i6;
                    i3 = i7;
                } else {
                    i3 = i6;
                    i4 = i7;
                }
                if (i < i4 || i > i3) {
                    if (i < i6) {
                        if (i2 == 1) {
                            t9Var.b = i6 + 1;
                            t9Var.d = i7 + 1;
                        } else if (i2 == 2) {
                            t9Var.b = i6 - 1;
                            t9Var.d = i7 - 1;
                        }
                    }
                } else if (i4 == i6) {
                    if (i2 == 1) {
                        t9Var.d = i7 + 1;
                    } else if (i2 == 2) {
                        t9Var.d = i7 - 1;
                    }
                    i++;
                } else {
                    if (i2 == 1) {
                        t9Var.b = i6 + 1;
                    } else if (i2 == 2) {
                        t9Var.b = i6 - 1;
                    }
                    i--;
                }
            } else {
                int i8 = t9Var.b;
                if (i8 <= i) {
                    if (i5 == 1) {
                        i -= t9Var.d;
                    } else if (i5 == 2) {
                        i += t9Var.d;
                    }
                } else if (i2 == 1) {
                    t9Var.b = i8 + 1;
                } else if (i2 == 2) {
                    t9Var.b = i8 - 1;
                }
            }
        }
        for (int size2 = arrayList.size() - 1; size2 >= 0; size2--) {
            t9 t9Var2 = (t9) arrayList.get(size2);
            if (t9Var2.a == 8) {
                int i9 = t9Var2.d;
                if (i9 == t9Var2.b || i9 < 0) {
                    arrayList.remove(size2);
                    t9Var2.c = null;
                    ((wqb) this.c).b(t9Var2);
                }
            } else if (t9Var2.d <= 0) {
                arrayList.remove(size2);
                t9Var2.c = null;
                ((wqb) this.c).b(t9Var2);
            }
        }
        return i;
    }

    public void J(lx6 lx6, String str) {
        if (this.b == 0) {
            wu0 wu0 = (wu0) this.x;
            wu0.M(str).M(HTTP.CRLF);
            int size = lx6.size();
            for (int i = 0; i < size; i++) {
                wu0.M(lx6.d(i)).M(": ").M(lx6.f(i)).M(HTTP.CRLF);
            }
            wu0.M(HTTP.CRLF);
            this.b = 1;
            return;
        }
        throw new IllegalStateException(("state: " + this.b).toString());
    }

    public yfe a(k4d k4d) {
        if (!d57.a(k4d)) {
            return C(0);
        }
        String b2 = k4d.w.b(org.apache.http.protocol.HTTP.TRANSFER_ENCODING);
        if (b2 == null) {
            b2 = null;
        }
        if (StringsKt__StringsJVMKt.equals(org.apache.http.protocol.HTTP.CHUNK_CODING, b2, true)) {
            m57 m57 = k4d.a.b;
            if (this.b == 4) {
                this.b = 5;
                return new k37(this, m57);
            }
            throw new IllegalStateException(("state: " + this.b).toString());
        }
        long j = u0g.j(k4d);
        if (j != -1) {
            return C(j);
        }
        if (this.b == 4) {
            this.b = 5;
            ((mtc) this.v).k();
            return new i37(this);
        }
        throw new IllegalStateException(("state: " + this.b).toString());
    }

    public void b() {
        ((wu0) this.x).flush();
    }

    public nde c(y2d y2d, long j) {
        hd8 hd8 = y2d.e;
        if (StringsKt__StringsJVMKt.equals(org.apache.http.protocol.HTTP.CHUNK_CODING, y2d.d.b(org.apache.http.protocol.HTTP.TRANSFER_ENCODING), true)) {
            if (this.b == 1) {
                this.b = 2;
                return new j37(this);
            }
            throw new IllegalStateException(("state: " + this.b).toString());
        } else if (j == -1) {
            throw new IllegalStateException("Cannot stream a request body without chunked encoding or a known content length!");
        } else if (this.b == 1) {
            this.b = 2;
            return new uk4(this);
        } else {
            throw new IllegalStateException(("state: " + this.b).toString());
        }
    }

    public void cancel() {
        Socket socket = ((mtc) this.v).b;
        if (socket != null) {
            u0g.d(socket);
        }
    }

    public long d(k4d k4d) {
        if (!d57.a(k4d)) {
            return 0;
        }
        String b2 = k4d.w.b(org.apache.http.protocol.HTTP.TRANSFER_ENCODING);
        if (b2 == null) {
            b2 = null;
        }
        if (StringsKt__StringsJVMKt.equals(org.apache.http.protocol.HTTP.CHUNK_CODING, b2, true)) {
            return -1;
        }
        return u0g.j(k4d);
    }

    public j4d e(boolean z) {
        jz2 jz2 = (jz2) this.c;
        int i = this.b;
        if (i == 1 || i == 3) {
            try {
                String H = ((xu0) jz2.c).H(jz2.b);
                jz2.b -= (long) H.length();
                cs Q = ryg.Q(H);
                int i2 = Q.b;
                j4d j4d = new j4d();
                j4d.b = (y8c) Q.c;
                j4d.c = i2;
                j4d.d = (String) Q.o;
                j4d.f = jz2.Y().e();
                if (z && i2 == 100) {
                    return null;
                }
                if (i2 == 100) {
                    this.b = 3;
                    return j4d;
                }
                this.b = 4;
                return j4d;
            } catch (EOFException e) {
                throw new IOException(a81.m("unexpected end of stream on ", ((mtc) this.v).q.a.a.g()), e);
            }
        } else {
            throw new IllegalStateException(("state: " + this.b).toString());
        }
    }

    public mtc f() {
        return (mtc) this.v;
    }

    public void g(y2d y2d) {
        Proxy.Type type = ((mtc) this.v).q.b.type();
        StringBuilder sb = new StringBuilder();
        sb.append(y2d.c);
        sb.append(' ');
        m57 m57 = y2d.b;
        if (m57.a || type != Proxy.Type.HTTP) {
            String b2 = m57.b();
            String d = m57.d();
            if (d != null) {
                b2 = b2 + '?' + d;
            }
            sb.append(b2);
        } else {
            sb.append(m57);
        }
        sb.append(" HTTP/1.1");
        J(y2d.d, sb.toString());
    }

    /* JADX WARNING: type inference failed for: r1v1, types: [ni3, java.lang.Object] */
    public Object get() {
        Range range = ((z90) this.v).a;
        qa0 qa0 = (qa0) this.x;
        int i = qa0.c;
        y90 y90 = (y90) this.w;
        int x2 = te8.x(i, y90.c, qa0.e, y90.b, qa0.d, range);
        ? obj = new Object();
        obj.b = -1;
        String str = (String) this.c;
        if (str != null) {
            obj.a = str;
            obj.b = Integer.valueOf(this.b);
            xjf xjf = (xjf) this.o;
            if (xjf != null) {
                obj.c = xjf;
                obj.f = Integer.valueOf(y90.c);
                obj.e = Integer.valueOf(y90.b);
                obj.d = Integer.valueOf(x2);
                return obj.a();
            }
            throw new NullPointerException("Null inputTimebase");
        }
        throw new NullPointerException("Null mimeType");
    }

    public void h() {
        ((wu0) this.x).flush();
    }

    public u9 i(usd usd) {
        yo7 yo7 = (yo7) this.c;
        xqg U = h88.U(yo7, usd);
        mqf mqf = (mqf) this.v;
        cs csVar = (cs) mqf.o;
        int i = csVar.b + 1;
        csVar.b = i;
        Object[] objArr = (Object[]) csVar.c;
        if (i == objArr.length) {
            int i2 = i * 2;
            csVar.c = Arrays.copyOf(objArr, i2);
            csVar.o = Arrays.copyOf((int[]) csVar.o, i2);
        }
        ((Object[]) csVar.c)[i] = usd;
        mqf.s(U.a);
        if (mqf.O() != 4) {
            int ordinal = U.ordinal();
            return (ordinal == 1 || ordinal == 2 || ordinal == 3) ? new u9(yo7, U, mqf, usd) : (((xqg) this.o) != U || !yo7.a.f) ? new u9(yo7, U, mqf, usd) : this;
        }
        mqf.A(mqf, "Unexpected leading comma", 0, (String) null, 6);
        throw null;
    }

    public boolean j(int i) {
        ArrayList arrayList = (ArrayList) this.v;
        int size = arrayList.size();
        for (int i2 = 0; i2 < size; i2++) {
            t9 t9Var = (t9) arrayList.get(i2);
            int i3 = t9Var.a;
            if (i3 == 8) {
                if (z(t9Var.d, i2 + 1) == i) {
                    return true;
                }
            } else if (i3 == 1) {
                int i4 = t9Var.b;
                int i5 = t9Var.d + i4;
                while (i4 < i5) {
                    if (z(i4, i2 + 1) == i) {
                        return true;
                    }
                    i4++;
                }
                continue;
            } else {
                continue;
            }
        }
        return false;
    }

    public void k() {
        ArrayList arrayList = (ArrayList) this.v;
        int size = arrayList.size();
        for (int i = 0; i < size; i++) {
            ((syc) this.w).g((t9) arrayList.get(i));
        }
        H(arrayList);
        this.b = 0;
    }

    public void l() {
        k();
        ArrayList arrayList = (ArrayList) this.o;
        int size = arrayList.size();
        for (int i = 0; i < size; i++) {
            t9 t9Var = (t9) arrayList.get(i);
            int i2 = t9Var.a;
            syc syc = (syc) this.w;
            if (i2 == 1) {
                syc.g(t9Var);
                syc.j(t9Var.b, t9Var.d);
            } else if (i2 == 2) {
                syc.g(t9Var);
                int i3 = t9Var.b;
                int i4 = t9Var.d;
                RecyclerView recyclerView = (RecyclerView) syc.b;
                recyclerView.f0(i3, i4, true);
                recyclerView.t1 = true;
                recyclerView.q1.d += i4;
            } else if (i2 == 4) {
                syc.g(t9Var);
                syc.h(t9Var.b, t9Var.d, t9Var.c);
            } else if (i2 == 8) {
                syc.g(t9Var);
                syc.k(t9Var.b, t9Var.d);
            }
        }
        H(arrayList);
        this.b = 0;
    }

    public boolean m() {
        boolean z;
        boolean z2;
        mqf mqf = (mqf) this.v;
        int W = mqf.W();
        String str = (String) mqf.c;
        if (W != str.length()) {
            if (str.charAt(W) == '\"') {
                W++;
                z = true;
            } else {
                z = false;
            }
            int Q = mqf.Q(W);
            if (Q >= str.length() || Q == -1) {
                mqf.A(mqf, "EOF", 0, (String) null, 6);
                throw null;
            }
            int i = Q + 1;
            char charAt = str.charAt(Q) | ' ';
            if (charAt == 'f') {
                mqf.o(i, "alse");
                z2 = false;
            } else if (charAt == 't') {
                mqf.o(i, "rue");
                z2 = true;
            } else {
                mqf.A(mqf, "Expected valid boolean literal prefix, but had '" + mqf.u() + '\'', 0, (String) null, 6);
                throw null;
            }
            if (z) {
                if (mqf.b == str.length()) {
                    mqf.A(mqf, "EOF", 0, (String) null, 6);
                    throw null;
                } else if (str.charAt(mqf.b) == '\"') {
                    mqf.b++;
                } else {
                    mqf.A(mqf, "Expected closing quotation mark", 0, (String) null, 6);
                    throw null;
                }
            }
            return z2;
        }
        mqf.A(mqf, "EOF", 0, (String) null, 6);
        throw null;
    }

    public boolean n(usd usd, int i) {
        return m();
    }

    /* JADX WARNING: Removed duplicated region for block: B:176:0x01fc A[EDGE_INSN: B:176:0x01fc->B:127:0x01fc ?: BREAK  , SYNTHETIC] */
    /* JADX WARNING: Removed duplicated region for block: B:179:0x016f A[SYNTHETIC] */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public int o(defpackage.usd r20) {
        /*
            r19 = this;
            r0 = r19
            r1 = r20
            java.lang.Object r2 = r0.o
            xqg r2 = (defpackage.xqg) r2
            int r3 = r2.ordinal()
            java.lang.Object r4 = r0.v
            mqf r4 = (defpackage.mqf) r4
            r5 = 1
            r6 = 0
            r7 = 6
            r8 = 0
            r9 = 58
            java.lang.Object r10 = r0.c
            yo7 r10 = (defpackage.yo7) r10
            r11 = -1
            if (r3 == 0) goto L_0x009d
            r1 = 2
            if (r3 == r1) goto L_0x004d
            boolean r1 = r4.X()
            boolean r3 = r4.n()
            if (r3 == 0) goto L_0x003d
            int r3 = r0.b
            if (r3 == r11) goto L_0x0037
            if (r1 == 0) goto L_0x0031
            goto L_0x0037
        L_0x0031:
            java.lang.String r0 = "Expected end of the array or comma"
            defpackage.mqf.A(r4, r0, r6, r8, r7)
            throw r8
        L_0x0037:
            int r11 = r3 + 1
            r0.b = r11
            goto L_0x02bb
        L_0x003d:
            if (r1 == 0) goto L_0x02bb
            ap7 r0 = r10.a
            boolean r0 = r0.n
            if (r0 == 0) goto L_0x0047
            goto L_0x02bb
        L_0x0047:
            java.lang.String r0 = "array"
            defpackage.o54.w(r4, r0)
            throw r8
        L_0x004d:
            int r1 = r0.b
            int r3 = r1 % 2
            if (r3 == 0) goto L_0x0055
            r3 = r5
            goto L_0x0056
        L_0x0055:
            r3 = r6
        L_0x0056:
            if (r3 == 0) goto L_0x005f
            if (r1 == r11) goto L_0x0062
            boolean r6 = r4.X()
            goto L_0x0062
        L_0x005f:
            r4.s(r9)
        L_0x0062:
            boolean r1 = r4.n()
            if (r1 == 0) goto L_0x008f
            if (r3 == 0) goto L_0x0087
            int r1 = r0.b
            r3 = 4
            if (r1 != r11) goto L_0x007c
            r1 = r6 ^ 1
            int r6 = r4.b
            if (r1 == 0) goto L_0x0076
            goto L_0x0087
        L_0x0076:
            java.lang.String r0 = "Unexpected leading comma"
            defpackage.mqf.A(r4, r0, r6, r8, r3)
            throw r8
        L_0x007c:
            int r1 = r4.b
            if (r6 == 0) goto L_0x0081
            goto L_0x0087
        L_0x0081:
            java.lang.String r0 = "Expected comma after the key-value pair"
            defpackage.mqf.A(r4, r0, r1, r8, r3)
            throw r8
        L_0x0087:
            int r1 = r0.b
            int r11 = r1 + 1
            r0.b = r11
            goto L_0x02bb
        L_0x008f:
            if (r6 == 0) goto L_0x02bb
            ap7 r0 = r10.a
            boolean r0 = r0.n
            if (r0 == 0) goto L_0x0099
            goto L_0x02bb
        L_0x0099:
            defpackage.o54.x(r4)
            throw r8
        L_0x009d:
            boolean r3 = r4.X()
        L_0x00a1:
            boolean r12 = r4.n()
            java.lang.Object r11 = r0.x
            fp7 r11 = (defpackage.fp7) r11
            if (r12 == 0) goto L_0x0234
            java.lang.Object r3 = r0.w
            ap7 r3 = (defpackage.ap7) r3
            boolean r12 = r3.c
            if (r12 == 0) goto L_0x00b8
            java.lang.String r12 = r4.x()
            goto L_0x00bc
        L_0x00b8:
            java.lang.String r12 = r4.p()
        L_0x00bc:
            r4.s(r9)
            int r9 = defpackage.m5a.G(r1, r10, r12)
            boolean r8 = r3.c
            r7 = -3
            if (r9 == r7) goto L_0x014c
            boolean r14 = r3.h
            if (r14 == 0) goto L_0x0126
            boolean r14 = r1.i(r9)
            usd r15 = r1.h(r9)
            if (r14 == 0) goto L_0x00e3
            boolean r18 = r15.c()
            if (r18 != 0) goto L_0x00e3
            boolean r18 = r4.Y(r5)
            if (r18 == 0) goto L_0x00e3
            goto L_0x011f
        L_0x00e3:
            kne r5 = r15.getKind()
            zsd r13 = defpackage.zsd.p
            boolean r5 = kotlin.jvm.internal.Intrinsics.areEqual((java.lang.Object) r5, (java.lang.Object) r13)
            if (r5 == 0) goto L_0x0126
            boolean r5 = r15.c()
            if (r5 == 0) goto L_0x00fc
            boolean r5 = r4.Y(r6)
            if (r5 == 0) goto L_0x00fc
            goto L_0x0126
        L_0x00fc:
            java.lang.String r5 = r4.P(r8)
            if (r5 != 0) goto L_0x0103
            goto L_0x0126
        L_0x0103:
            int r5 = defpackage.m5a.G(r15, r10, r5)
            ap7 r13 = r10.a
            boolean r13 = r13.f
            if (r13 != 0) goto L_0x0115
            boolean r13 = r15.c()
            if (r13 == 0) goto L_0x0115
            r13 = 1
            goto L_0x0116
        L_0x0115:
            r13 = r6
        L_0x0116:
            if (r5 != r7) goto L_0x0126
            if (r14 != 0) goto L_0x011c
            if (r13 == 0) goto L_0x0126
        L_0x011c:
            r4.t()
        L_0x011f:
            boolean r5 = r4.X()
            r7 = r5
            r5 = r6
            goto L_0x014e
        L_0x0126:
            if (r11 == 0) goto L_0x0149
            u05 r0 = r11.a
            r1 = 64
            if (r9 >= r1) goto L_0x0137
            long r5 = r0.a
            r7 = 1
            long r7 = r7 << r9
            long r5 = r5 | r7
            r0.a = r5
            goto L_0x0149
        L_0x0137:
            int r1 = r9 >>> 6
            r3 = 1
            int r1 = r1 - r3
            r3 = r9 & 63
            java.lang.Object r0 = r0.o
            long[] r0 = (long[]) r0
            r5 = r0[r1]
            r7 = 1
            long r7 = r7 << r3
            long r5 = r5 | r7
            r0[r1] = r5
        L_0x0149:
            r11 = r9
            goto L_0x02bb
        L_0x014c:
            r7 = r6
            r5 = 1
        L_0x014e:
            if (r5 == 0) goto L_0x0230
            boolean r3 = r3.b
            java.lang.Object r5 = r4.c
            java.lang.String r5 = (java.lang.String) r5
            if (r3 == 0) goto L_0x0208
            java.util.ArrayList r3 = new java.util.ArrayList
            r3.<init>()
            byte r7 = r4.O()
            r9 = 8
            if (r7 == r9) goto L_0x016f
            r11 = 6
            if (r7 == r11) goto L_0x016f
            r4.u()
            r13 = 1
            r14 = 6
            goto L_0x01fc
        L_0x016f:
            byte r7 = r4.O()
            r13 = 1
            if (r7 != r13) goto L_0x0180
            if (r8 == 0) goto L_0x017c
            r4.u()
            goto L_0x016f
        L_0x017c:
            r4.p()
            goto L_0x016f
        L_0x0180:
            if (r7 == r9) goto L_0x01eb
            r11 = 6
            if (r7 != r11) goto L_0x0187
            r14 = r11
            goto L_0x01ec
        L_0x0187:
            r11 = 9
            java.lang.Object r12 = r4.o
            cs r12 = (defpackage.cs) r12
            if (r7 != r11) goto L_0x01b5
            java.lang.Object r7 = kotlin.collections.CollectionsKt.last(r3)
            java.lang.Number r7 = (java.lang.Number) r7
            byte r7 = r7.byteValue()
            if (r7 != r9) goto L_0x01a0
            kotlin.collections.CollectionsKt.removeLast(r3)
        L_0x019e:
            r14 = 6
            goto L_0x01f3
        L_0x01a0:
            int r0 = r4.b
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            java.lang.String r2 = "found ] instead of } at path: "
            r1.<init>(r2)
            r1.append(r12)
            java.lang.String r1 = r1.toString()
            kotlinx.serialization.json.internal.JsonDecodingException r0 = defpackage.o54.c(r1, r5, r0)
            throw r0
        L_0x01b5:
            r11 = 7
            if (r7 != r11) goto L_0x01de
            java.lang.Object r7 = kotlin.collections.CollectionsKt.last(r3)
            java.lang.Number r7 = (java.lang.Number) r7
            byte r7 = r7.byteValue()
            r11 = 6
            if (r7 != r11) goto L_0x01c9
            kotlin.collections.CollectionsKt.removeLast(r3)
            goto L_0x019e
        L_0x01c9:
            int r0 = r4.b
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            java.lang.String r2 = "found } instead of ] at path: "
            r1.<init>(r2)
            r1.append(r12)
            java.lang.String r1 = r1.toString()
            kotlinx.serialization.json.internal.JsonDecodingException r0 = defpackage.o54.c(r1, r5, r0)
            throw r0
        L_0x01de:
            r11 = 10
            if (r7 == r11) goto L_0x01e3
            goto L_0x019e
        L_0x01e3:
            java.lang.String r0 = "Unexpected end of input due to malformed JSON during ignoring unknown keys"
            r1 = 0
            r14 = 6
            defpackage.mqf.A(r4, r0, r6, r1, r14)
            throw r1
        L_0x01eb:
            r14 = 6
        L_0x01ec:
            java.lang.Byte r7 = java.lang.Byte.valueOf(r7)
            r3.add(r7)
        L_0x01f3:
            r4.q()
            int r7 = r3.size()
            if (r7 != 0) goto L_0x016f
        L_0x01fc:
            boolean r3 = r4.X()
            r5 = r13
            r7 = r14
        L_0x0202:
            r8 = 0
            r9 = 58
            r11 = -1
            goto L_0x00a1
        L_0x0208:
            int r0 = r4.b
            java.lang.CharSequence r0 = r5.subSequence(r6, r0)
            java.lang.String r0 = r0.toString()
            int r0 = kotlin.text.StringsKt__StringsKt.lastIndexOf$default((java.lang.CharSequence) r0, (java.lang.String) r12, 0, false, 6, (java.lang.Object) null)
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            java.lang.String r2 = "Encountered an unknown key '"
            r1.<init>(r2)
            r1.append(r12)
            r2 = 39
            r1.append(r2)
            java.lang.String r1 = r1.toString()
            java.lang.String r2 = "Use 'ignoreUnknownKeys = true' in 'Json {}' builder to ignore unknown keys."
            r4.z(r0, r1, r2)
            r5 = 0
            throw r5
        L_0x0230:
            r3 = r7
            r5 = 1
            r7 = 6
            goto L_0x0202
        L_0x0234:
            r5 = r8
            if (r3 == 0) goto L_0x0242
            ap7 r0 = r10.a
            boolean r0 = r0.n
            if (r0 == 0) goto L_0x023e
            goto L_0x0242
        L_0x023e:
            defpackage.o54.x(r4)
            throw r5
        L_0x0242:
            if (r11 == 0) goto L_0x02ba
            u05 r0 = r11.a
            java.lang.Object r1 = r0.b
            usd r1 = (defpackage.usd) r1
            int r3 = r1.e()
        L_0x024e:
            long r7 = r0.a
            r9 = -1
            int r5 = (r7 > r9 ? 1 : (r7 == r9 ? 0 : -1))
            java.lang.Object r11 = r0.c
            kotlin.jvm.functions.Function2 r11 = (kotlin.jvm.functions.Function2) r11
            if (r5 == 0) goto L_0x027a
            long r7 = ~r7
            int r5 = java.lang.Long.numberOfTrailingZeros(r7)
            long r7 = r0.a
            r9 = 1
            long r12 = r9 << r5
            long r7 = r7 | r12
            r0.a = r7
            java.lang.Integer r7 = java.lang.Integer.valueOf(r5)
            java.lang.Object r7 = r11.invoke(r1, r7)
            java.lang.Boolean r7 = (java.lang.Boolean) r7
            boolean r7 = r7.booleanValue()
            if (r7 == 0) goto L_0x024e
            r11 = r5
            goto L_0x02bb
        L_0x027a:
            r5 = 64
            if (r3 <= r5) goto L_0x02ba
            java.lang.Object r0 = r0.o
            long[] r0 = (long[]) r0
            int r3 = r0.length
        L_0x0283:
            if (r6 >= r3) goto L_0x02ba
            int r5 = r6 + 1
            int r7 = r5 * 64
            r12 = r0[r6]
        L_0x028b:
            int r8 = (r12 > r9 ? 1 : (r12 == r9 ? 0 : -1))
            if (r8 == 0) goto L_0x02b2
            long r14 = ~r12
            int r8 = java.lang.Long.numberOfTrailingZeros(r14)
            r14 = 1
            long r16 = r14 << r8
            long r12 = r12 | r16
            int r8 = r8 + r7
            java.lang.Integer r9 = java.lang.Integer.valueOf(r8)
            java.lang.Object r9 = r11.invoke(r1, r9)
            java.lang.Boolean r9 = (java.lang.Boolean) r9
            boolean r9 = r9.booleanValue()
            if (r9 == 0) goto L_0x02af
            r0[r6] = r12
            r11 = r8
            goto L_0x02bb
        L_0x02af:
            r9 = -1
            goto L_0x028b
        L_0x02b2:
            r14 = 1
            r0[r6] = r12
            r6 = r5
            r9 = -1
            goto L_0x0283
        L_0x02ba:
            r11 = -1
        L_0x02bb:
            xqg r0 = defpackage.xqg.MAP
            if (r2 == r0) goto L_0x02cb
            java.lang.Object r0 = r4.o
            cs r0 = (defpackage.cs) r0
            java.lang.Object r1 = r0.o
            int[] r1 = (int[]) r1
            int r0 = r0.b
            r1[r0] = r11
        L_0x02cb:
            return r11
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.u9.o(usd):int");
    }

    public int p(usd usd) {
        String u = u();
        return m5a.H(usd, (yo7) this.c, u, " at path " + ((cs) ((mqf) this.v).o).s());
    }

    public boolean q() {
        fp7 fp7 = (fp7) this.x;
        return !(fp7 != null ? fp7.b : false) && !((mqf) this.v).Y(true);
    }

    public Object r(usd usd, int i, String str) {
        bye bye = bye.a;
        bye bye2 = bye.a;
        if (q()) {
            return t(bye);
        }
        return null;
    }

    public Object s(usd usd, int i, aq7 aq7, Object obj) {
        boolean z = ((xqg) this.o) == xqg.MAP && (i & 1) == 0;
        mqf mqf = (mqf) this.v;
        if (z) {
            cs csVar = (cs) mqf.o;
            int i2 = csVar.b;
            if (((int[]) csVar.o)[i2] == -2) {
                ((Object[]) csVar.c)[i2] = v02.o;
            }
        }
        Object t = t(aq7);
        if (z) {
            cs csVar2 = (cs) mqf.o;
            int i3 = csVar2.b;
            if (((int[]) csVar2.o)[i3] != -2) {
                int i4 = i3 + 1;
                csVar2.b = i4;
                Object[] objArr = (Object[]) csVar2.c;
                if (i4 == objArr.length) {
                    int i5 = i4 * 2;
                    csVar2.c = Arrays.copyOf(objArr, i5);
                    csVar2.o = Arrays.copyOf((int[]) csVar2.o, i5);
                }
            }
            int i6 = csVar2.b;
            ((Object[]) csVar2.c)[i6] = t;
            ((int[]) csVar2.o)[i6] = -2;
        }
        return t;
    }

    public Object t(aq7 aq7) {
        try {
            return aq7.a(this);
        } catch (MissingFieldException e) {
            if (StringsKt__StringsKt.contains$default((CharSequence) e.getMessage(), (CharSequence) "at path", false, 2, (Object) null)) {
                throw e;
            }
            throw new MissingFieldException((ArrayList) e.a, e.getMessage() + " at path: " + ((cs) ((mqf) this.v).o).s(), e);
        }
    }

    public String toString() {
        switch (this.a) {
            case 3:
                StringBuilder sb = new StringBuilder("ShareData{type=");
                sb.append(this.b);
                sb.append(", images=");
                sb.append((ArrayList) this.o);
                sb.append(", videos=");
                sb.append((ArrayList) this.v);
                sb.append(", text='");
                sb.append((String) this.c);
                sb.append("', shares=null, files=");
                sb.append((ArrayList) this.w);
                sb.append(", vcard='");
                return wj6.n(sb, (String) this.x, "'}");
            default:
                return super.toString();
        }
    }

    public String u() {
        boolean z = ((ap7) this.w).c;
        mqf mqf = (mqf) this.v;
        return z ? mqf.x() : mqf.t();
    }

    public String v(usd usd, int i) {
        return u();
    }

    public void w(t9 t9Var) {
        int i;
        int i2 = t9Var.a;
        if (i2 == 1 || i2 == 8) {
            throw new IllegalArgumentException("should not dispatch add or move for pre layout");
        }
        int I = I(t9Var.b, i2);
        int i3 = t9Var.b;
        int i4 = t9Var.a;
        if (i4 == 2) {
            i = 0;
        } else if (i4 == 4) {
            i = 1;
        } else {
            throw new IllegalArgumentException("op should be remove or update." + t9Var);
        }
        int i5 = 1;
        for (int i6 = 1; i6 < t9Var.d; i6++) {
            int I2 = I((i * i6) + t9Var.b, t9Var.a);
            int i7 = t9Var.a;
            if (i7 == 2 ? I2 != I : !(i7 == 4 && I2 == I + 1)) {
                t9 D = D(t9Var.c, i7, I, i5);
                x(D, i3);
                D.c = null;
                ((wqb) this.c).b(D);
                if (t9Var.a == 4) {
                    i3 += i5;
                }
                i5 = 1;
                I = I2;
            } else {
                i5++;
            }
        }
        Object obj = t9Var.c;
        t9Var.c = null;
        ((wqb) this.c).b(t9Var);
        if (i5 > 0) {
            t9 D2 = D(obj, t9Var.a, I, i5);
            x(D2, i3);
            D2.c = null;
            ((wqb) this.c).b(D2);
        }
    }

    public void x(t9 t9Var, int i) {
        syc syc = (syc) this.w;
        syc.g(t9Var);
        int i2 = t9Var.a;
        if (i2 == 2) {
            int i3 = t9Var.d;
            RecyclerView recyclerView = (RecyclerView) syc.b;
            recyclerView.f0(i, i3, true);
            recyclerView.t1 = true;
            recyclerView.q1.d += i3;
        } else if (i2 == 4) {
            syc.h(i, t9Var.d, t9Var.c);
        } else {
            throw new IllegalArgumentException("only remove and update ops can be dispatched in first pass");
        }
    }

    /* JADX WARNING: Removed duplicated region for block: B:10:0x0028  */
    /* JADX WARNING: Removed duplicated region for block: B:12:0x002f  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void y(defpackage.usd r5) {
        /*
            r4 = this;
            java.lang.Object r0 = r4.c
            yo7 r0 = (defpackage.yo7) r0
            ap7 r1 = r0.a
            boolean r1 = r1.b
            r2 = -1
            if (r1 == 0) goto L_0x0017
            int r1 = r5.e()
            if (r1 != 0) goto L_0x0017
        L_0x0011:
            int r1 = r4.o(r5)
            if (r1 != r2) goto L_0x0011
        L_0x0017:
            java.lang.Object r5 = r4.v
            mqf r5 = (defpackage.mqf) r5
            boolean r1 = r5.X()
            if (r1 == 0) goto L_0x002f
            ap7 r0 = r0.a
            boolean r0 = r0.n
            if (r0 == 0) goto L_0x0028
            goto L_0x002f
        L_0x0028:
            java.lang.String r4 = ""
            defpackage.o54.w(r5, r4)
            r4 = 0
            throw r4
        L_0x002f:
            java.lang.Object r4 = r4.o
            xqg r4 = (defpackage.xqg) r4
            char r4 = r4.b
            r5.s(r4)
            java.lang.Object r4 = r5.o
            cs r4 = (defpackage.cs) r4
            int r5 = r4.b
            java.lang.Object r0 = r4.o
            int[] r0 = (int[]) r0
            r1 = r0[r5]
            r3 = -2
            if (r1 != r3) goto L_0x004c
            r0[r5] = r2
            int r5 = r5 + r2
            r4.b = r5
        L_0x004c:
            int r5 = r4.b
            if (r5 == r2) goto L_0x0053
            int r5 = r5 + r2
            r4.b = r5
        L_0x0053:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.u9.y(usd):void");
    }

    public int z(int i, int i2) {
        ArrayList arrayList = (ArrayList) this.v;
        int size = arrayList.size();
        while (i2 < size) {
            t9 t9Var = (t9) arrayList.get(i2);
            int i3 = t9Var.a;
            if (i3 == 8) {
                int i4 = t9Var.b;
                if (i4 == i) {
                    i = t9Var.d;
                } else {
                    if (i4 < i) {
                        i--;
                    }
                    if (t9Var.d <= i) {
                        i++;
                    }
                }
            } else {
                int i5 = t9Var.b;
                if (i5 > i) {
                    continue;
                } else if (i3 == 2) {
                    int i6 = t9Var.d;
                    if (i < i5 + i6) {
                        return -1;
                    }
                    i -= i6;
                } else if (i3 == 1) {
                    i += t9Var.d;
                }
            }
            i2++;
        }
        return i;
    }

    public u9(yo7 yo7, xqg xqg, mqf mqf, usd usd) {
        this.a = 4;
        this.c = yo7;
        this.o = xqg;
        this.v = mqf;
        yo7.getClass();
        this.b = -1;
        fp7 fp7 = null;
        ap7 ap7 = yo7.a;
        this.w = ap7;
        this.x = !ap7.f ? new fp7(usd) : fp7;
    }

    public u9(String str, int i, z90 z90, y90 y90, qa0 qa0) {
        this.a = 1;
        xjf xjf = xjf.a;
        this.c = str;
        this.b = i;
        this.o = xjf;
        this.v = z90;
        this.w = y90;
        this.x = qa0;
    }

    public u9(rla rla, mtc mtc, xu0 xu0, wu0 wu0) {
        this.a = 2;
        this.o = rla;
        this.v = mtc;
        this.w = xu0;
        this.x = wu0;
        this.c = new jz2(xu0);
    }

    public u9(syc syc) {
        this.a = 0;
        this.c = new wqb(30);
        this.o = new ArrayList();
        this.v = new ArrayList();
        this.b = 0;
        this.w = syc;
        this.x = new d6a(1, (Object) this);
    }
}
