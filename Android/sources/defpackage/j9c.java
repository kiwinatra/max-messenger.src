package defpackage;

import one.me.common.drawable.SavedMessagesIconDrawable;
import ru.ok.tamtam.nano.Protos;

/* renamed from: j9c  reason: default package */
public final class j9c extends ad9 {
    public h9c[] a;
    public String b;
    public long c;
    public long d;
    public long e;
    public i9c[] f;
    public Protos.Attaches g;
    public long h;
    public Protos.MessageElements i;
    public boolean j;
    public long k;

    public j9c() {
        if (h9c.o == null) {
            synchronized (bj7.b) {
                try {
                    if (h9c.o == null) {
                        h9c.o = new h9c[0];
                    }
                } catch (Throwable th) {
                    throw th;
                }
            }
        }
        this.a = h9c.o;
        this.b = "";
        this.c = 0;
        this.d = 0;
        this.e = 0;
        if (i9c.e == null) {
            synchronized (bj7.b) {
                try {
                    if (i9c.e == null) {
                        i9c.e = new i9c[0];
                    }
                } catch (Throwable th2) {
                    throw th2;
                }
            }
        }
        this.f = i9c.e;
        this.g = null;
        this.h = 0;
        this.i = null;
        this.j = false;
        this.k = 0;
        this.cachedSize = -1;
    }

    public final int computeSerializedSize() {
        int i2;
        h9c[] h9cArr = this.a;
        int i3 = 0;
        if (h9cArr != null && h9cArr.length > 0) {
            int i4 = 0;
            i2 = 0;
            while (true) {
                h9c[] h9cArr2 = this.a;
                if (i4 >= h9cArr2.length) {
                    break;
                }
                h9c h9c = h9cArr2[i4];
                if (h9c != null) {
                    i2 += j43.i(1, h9c);
                }
                i4++;
            }
        } else {
            i2 = 0;
        }
        if (!this.b.equals("")) {
            i2 += j43.l(2, this.b);
        }
        long j2 = this.c;
        if (j2 != 0) {
            i2 += j43.h(3, j2);
        }
        long j3 = this.d;
        if (j3 != 0) {
            i2 += j43.h(4, j3);
        }
        long j4 = this.e;
        if (j4 != 0) {
            i2 += j43.h(5, j4);
        }
        i9c[] i9cArr = this.f;
        if (i9cArr != null && i9cArr.length > 0) {
            while (true) {
                i9c[] i9cArr2 = this.f;
                if (i3 >= i9cArr2.length) {
                    break;
                }
                i9c i9c = i9cArr2[i3];
                if (i9c != null) {
                    i2 = j43.i(6, i9c) + i2;
                }
                i3++;
            }
        }
        Protos.Attaches attaches = this.g;
        if (attaches != null) {
            i2 += j43.i(7, attaches);
        }
        long j5 = this.h;
        if (j5 != 0) {
            i2 += j43.h(8, j5);
        }
        Protos.MessageElements messageElements = this.i;
        if (messageElements != null) {
            i2 += j43.i(9, messageElements);
        }
        if (this.j) {
            i2 += j43.a(10);
        }
        long j6 = this.k;
        return j6 != 0 ? i2 + j43.h(11, j6) : i2;
    }

    public final ad9 mergeFrom(i43 i43) {
        while (true) {
            int s = i43.s();
            switch (s) {
                case 0:
                    break;
                case 10:
                    int q = ct.q(i43, 10);
                    h9c[] h9cArr = this.a;
                    int length = h9cArr == null ? 0 : h9cArr.length;
                    int i2 = q + length;
                    h9c[] h9cArr2 = new h9c[i2];
                    if (length != 0) {
                        System.arraycopy(h9cArr, 0, h9cArr2, 0, length);
                    }
                    while (length < i2 - 1) {
                        h9c h9c = new h9c();
                        h9cArr2[length] = h9c;
                        i43.j(h9c);
                        i43.s();
                        length++;
                    }
                    h9c h9c2 = new h9c();
                    h9cArr2[length] = h9c2;
                    i43.j(h9c2);
                    this.a = h9cArr2;
                    continue;
                case 18:
                    this.b = i43.r();
                    continue;
                case SavedMessagesIconDrawable.NORMAL_ICON_SIZE /*24*/:
                    this.c = i43.q();
                    continue;
                case 32:
                    this.d = i43.q();
                    continue;
                case SavedMessagesIconDrawable.SMALL_SIZE /*40*/:
                    this.e = i43.q();
                    continue;
                case 50:
                    int q2 = ct.q(i43, 50);
                    i9c[] i9cArr = this.f;
                    int length2 = i9cArr == null ? 0 : i9cArr.length;
                    int i3 = q2 + length2;
                    i9c[] i9cArr2 = new i9c[i3];
                    if (length2 != 0) {
                        System.arraycopy(i9cArr, 0, i9cArr2, 0, length2);
                    }
                    while (length2 < i3 - 1) {
                        i9c i9c = new i9c();
                        i9cArr2[length2] = i9c;
                        i43.j(i9c);
                        i43.s();
                        length2++;
                    }
                    i9c i9c2 = new i9c();
                    i9cArr2[length2] = i9c2;
                    i43.j(i9c2);
                    this.f = i9cArr2;
                    continue;
                case 58:
                    if (this.g == null) {
                        this.g = new Protos.Attaches();
                    }
                    i43.j(this.g);
                    continue;
                case 64:
                    this.h = i43.q();
                    continue;
                case 74:
                    if (this.i == null) {
                        this.i = new Protos.MessageElements();
                    }
                    i43.j(this.i);
                    continue;
                case 80:
                    this.j = i43.f();
                    continue;
                case 88:
                    this.k = i43.q();
                    continue;
                default:
                    if (!i43.u(s)) {
                        break;
                    } else {
                        continue;
                    }
            }
        }
        return this;
    }

    public final void writeTo(j43 j43) {
        h9c[] h9cArr = this.a;
        int i2 = 0;
        if (h9cArr != null && h9cArr.length > 0) {
            int i3 = 0;
            while (true) {
                h9c[] h9cArr2 = this.a;
                if (i3 >= h9cArr2.length) {
                    break;
                }
                h9c h9c = h9cArr2[i3];
                if (h9c != null) {
                    j43.y(1, h9c);
                }
                i3++;
            }
        }
        if (!this.b.equals("")) {
            j43.E(2, this.b);
        }
        long j2 = this.c;
        if (j2 != 0) {
            j43.x(3, j2);
        }
        long j3 = this.d;
        if (j3 != 0) {
            j43.x(4, j3);
        }
        long j4 = this.e;
        if (j4 != 0) {
            j43.x(5, j4);
        }
        i9c[] i9cArr = this.f;
        if (i9cArr != null && i9cArr.length > 0) {
            while (true) {
                i9c[] i9cArr2 = this.f;
                if (i2 >= i9cArr2.length) {
                    break;
                }
                i9c i9c = i9cArr2[i2];
                if (i9c != null) {
                    j43.y(6, i9c);
                }
                i2++;
            }
        }
        Protos.Attaches attaches = this.g;
        if (attaches != null) {
            j43.y(7, attaches);
        }
        long j5 = this.h;
        if (j5 != 0) {
            j43.x(8, j5);
        }
        Protos.MessageElements messageElements = this.i;
        if (messageElements != null) {
            j43.y(9, messageElements);
        }
        boolean z = this.j;
        if (z) {
            j43.r(10, z);
        }
        long j6 = this.k;
        if (j6 != 0) {
            j43.x(11, j6);
        }
    }
}
