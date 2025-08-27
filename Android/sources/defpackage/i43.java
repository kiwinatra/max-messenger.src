package defpackage;

import com.google.protobuf.nano.InvalidProtocolBufferNanoException;
import java.io.IOException;
import java.io.Serializable;
import kotlin.UByte;
import kotlin.jvm.internal.ByteCompanionObject;
import kotlin.jvm.internal.IntCompanionObject;
import org.apache.http.util.LangUtils;
import ru.ok.tamtam.nano.Protos;

/* renamed from: i43  reason: default package */
public final class i43 {
    public final byte[] a;
    public final int b;
    public int c;
    public int d;
    public int e;
    public int f;
    public int g = IntCompanionObject.MAX_VALUE;
    public int h;

    public i43(byte[] bArr, int i, int i2) {
        this.a = bArr;
        this.b = i;
        this.c = i2 + i;
        this.e = i;
    }

    public final void a(int i) {
        if (this.f != i) {
            throw new IOException("Protocol message end-group tag did not match expected tag.");
        }
    }

    public final int b() {
        int i = this.g;
        if (i == Integer.MAX_VALUE) {
            return -1;
        }
        return i - this.e;
    }

    public final int c() {
        return this.e - this.b;
    }

    public final void d(int i) {
        this.g = i;
        int i2 = this.c + this.d;
        this.c = i2;
        if (i2 > i) {
            int i3 = i2 - i;
            this.d = i3;
            this.c = i2 - i3;
            return;
        }
        this.d = 0;
    }

    public final int e(int i) {
        if (i >= 0) {
            int i2 = i + this.e;
            int i3 = this.g;
            if (i2 <= i3) {
                this.g = i2;
                int i4 = this.c + this.d;
                this.c = i4;
                if (i4 > i2) {
                    int i5 = i4 - i2;
                    this.d = i5;
                    this.c = i4 - i5;
                } else {
                    this.d = 0;
                }
                return i3;
            }
            throw InvalidProtocolBufferNanoException.a();
        }
        throw new IOException("CodedInputStream encountered an embedded string or message which claimed to have negative size.");
    }

    public final boolean f() {
        return p() != 0;
    }

    public final byte[] g() {
        int p = p();
        int i = this.c;
        int i2 = this.e;
        if (p > i - i2 || p <= 0) {
            return p == 0 ? ct.h : m(p);
        }
        byte[] bArr = new byte[p];
        System.arraycopy(this.a, i2, bArr, 0, p);
        this.e += p;
        return bArr;
    }

    public final double h() {
        return Double.longBitsToDouble(o());
    }

    public final float i() {
        return Float.intBitsToFloat(n());
    }

    public final void j(ad9 ad9) {
        int p = p();
        if (this.h < 64) {
            int e2 = e(p);
            this.h++;
            ad9.mergeFrom(this);
            a(0);
            this.h--;
            d(e2);
            return;
        }
        throw new IOException("Protocol message had too many levels of nesting.  May be malicious.  Use CodedInputStream.setRecursionLimit() to increase the depth limit.");
    }

    /* JADX WARNING: type inference failed for: r4v18, types: [byte[], java.io.Serializable] */
    public final Serializable k(int i) {
        switch (i) {
            case 1:
                return Double.valueOf(h());
            case 2:
                return Float.valueOf(i());
            case 3:
                return Long.valueOf(q());
            case 4:
                return Long.valueOf(q());
            case 5:
                return Integer.valueOf(p());
            case 6:
                return Long.valueOf(o());
            case 7:
                return Integer.valueOf(n());
            case 8:
                return Boolean.valueOf(f());
            case 9:
                return r();
            case 12:
                return g();
            case 13:
                return Integer.valueOf(p());
            case Protos.Attaches.Attach.LOCATION /*14*/:
                return Integer.valueOf(p());
            case Protos.Attaches.Attach.DAILY_MEDIA /*15*/:
                return Integer.valueOf(n());
            case 16:
                return Long.valueOf(o());
            case LangUtils.HASH_SEED /*17*/:
                int p = p();
                return Integer.valueOf((-(p & 1)) ^ (p >>> 1));
            case 18:
                long q = q();
                return Long.valueOf((-(q & 1)) ^ (q >>> 1));
            default:
                throw new IllegalArgumentException(wj6.h(i, "Unknown type "));
        }
    }

    public final byte l() {
        int i = this.e;
        if (i != this.c) {
            this.e = i + 1;
            return this.a[i];
        }
        throw InvalidProtocolBufferNanoException.a();
    }

    public final byte[] m(int i) {
        if (i >= 0) {
            int i2 = this.e;
            int i3 = i2 + i;
            int i4 = this.g;
            if (i3 > i4) {
                v(i4 - i2);
                throw InvalidProtocolBufferNanoException.a();
            } else if (i <= this.c - i2) {
                byte[] bArr = new byte[i];
                System.arraycopy(this.a, i2, bArr, 0, i);
                this.e += i;
                return bArr;
            } else {
                throw InvalidProtocolBufferNanoException.a();
            }
        } else {
            throw new IOException("CodedInputStream encountered an embedded string or message which claimed to have negative size.");
        }
    }

    public final int n() {
        byte l = l();
        byte l2 = l();
        byte l3 = l();
        return ((l() & UByte.MAX_VALUE) << 24) | (l & UByte.MAX_VALUE) | ((l2 & UByte.MAX_VALUE) << 8) | ((l3 & UByte.MAX_VALUE) << 16);
    }

    public final long o() {
        byte l = l();
        byte l2 = l();
        return ((((long) l2) & 255) << 8) | (((long) l) & 255) | ((((long) l()) & 255) << 16) | ((((long) l()) & 255) << 24) | ((((long) l()) & 255) << 32) | ((((long) l()) & 255) << 40) | ((((long) l()) & 255) << 48) | ((((long) l()) & 255) << 56);
    }

    public final int p() {
        int i;
        byte l = l();
        if (l >= 0) {
            return l;
        }
        byte b2 = l & ByteCompanionObject.MAX_VALUE;
        byte l2 = l();
        if (l2 >= 0) {
            i = l2 << 7;
        } else {
            b2 |= (l2 & ByteCompanionObject.MAX_VALUE) << 7;
            byte l3 = l();
            if (l3 >= 0) {
                i = l3 << 14;
            } else {
                b2 |= (l3 & ByteCompanionObject.MAX_VALUE) << 14;
                byte l4 = l();
                if (l4 >= 0) {
                    i = l4 << 21;
                } else {
                    byte b3 = b2 | ((l4 & ByteCompanionObject.MAX_VALUE) << 21);
                    byte l5 = l();
                    byte b4 = b3 | (l5 << 28);
                    if (l5 >= 0) {
                        return b4;
                    }
                    for (int i2 = 0; i2 < 5; i2++) {
                        if (l() >= 0) {
                            return b4;
                        }
                    }
                    throw new IOException("CodedInputStream encountered a malformed varint.");
                }
            }
        }
        return i | b2;
    }

    public final long q() {
        long j = 0;
        for (int i = 0; i < 64; i += 7) {
            byte l = l();
            j |= ((long) (l & ByteCompanionObject.MAX_VALUE)) << i;
            if ((l & ByteCompanionObject.MIN_VALUE) == 0) {
                return j;
            }
        }
        throw new IOException("CodedInputStream encountered a malformed varint.");
    }

    public final String r() {
        int p = p();
        int i = this.c;
        int i2 = this.e;
        if (p > i - i2 || p <= 0) {
            return new String(m(p), bj7.a);
        }
        String str = new String(this.a, i2, p, bj7.a);
        this.e += p;
        return str;
    }

    public final int s() {
        if (this.e == this.c) {
            this.f = 0;
            return 0;
        }
        int p = p();
        this.f = p;
        if (p != 0) {
            return p;
        }
        throw new IOException("Protocol message contained an invalid tag (zero).");
    }

    public final void t(int i) {
        int i2 = this.e;
        int i3 = this.b;
        if (i > i2 - i3) {
            StringBuilder o = wj6.o(i, "Position ", " is beyond current ");
            o.append(this.e - i3);
            throw new IllegalArgumentException(o.toString());
        } else if (i >= 0) {
            this.e = i3 + i;
        } else {
            throw new IllegalArgumentException(wj6.h(i, "Bad position "));
        }
    }

    public final boolean u(int i) {
        int s;
        int i2 = i & 7;
        if (i2 == 0) {
            p();
            return true;
        } else if (i2 == 1) {
            o();
            return true;
        } else if (i2 == 2) {
            v(p());
            return true;
        } else if (i2 == 3) {
            do {
                s = s();
                if (s == 0 || !u(s)) {
                    a(((i >>> 3) << 3) | 4);
                }
                s = s();
                break;
            } while (!u(s));
            a(((i >>> 3) << 3) | 4);
            return true;
        } else if (i2 == 4) {
            return false;
        } else {
            if (i2 == 5) {
                n();
                return true;
            }
            throw new IOException("Protocol message tag had invalid wire type.");
        }
    }

    public final void v(int i) {
        if (i >= 0) {
            int i2 = this.e;
            int i3 = i2 + i;
            int i4 = this.g;
            if (i3 > i4) {
                v(i4 - i2);
                throw InvalidProtocolBufferNanoException.a();
            } else if (i <= this.c - i2) {
                this.e = i3;
            } else {
                throw InvalidProtocolBufferNanoException.a();
            }
        } else {
            throw new IOException("CodedInputStream encountered an embedded string or message which claimed to have negative size.");
        }
    }
}
