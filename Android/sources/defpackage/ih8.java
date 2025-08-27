package defpackage;

import com.google.android.exoplayer2.ParserException;

/* renamed from: ih8  reason: default package */
public final class ih8 {
    public int A;
    public int B;
    public int C;
    public float D;
    public float E;
    public float F;
    public float G;
    public float H;
    public float I;
    public float J;
    public float K;
    public float L;
    public float M;
    public byte[] N;
    public int O;
    public int P;
    public int Q;
    public long R;
    public long S;
    public etf T;
    public boolean U;
    public boolean V;
    public String W;
    public ypf X;
    public int Y;
    public String a;
    public String b;
    public int c;
    public int d;
    public int e;
    public int f;
    public int g;
    public boolean h;
    public byte[] i;
    public wpf j;
    public byte[] k;
    public xv4 l;
    public int m;
    public int n;
    public int o;
    public int p;
    public int q;
    public int r;
    public float s;
    public float t;
    public float u;
    public byte[] v;
    public int w;
    public boolean x;
    public int y;
    public int z;

    public final byte[] a(String str) {
        byte[] bArr = this.k;
        if (bArr != null) {
            return bArr;
        }
        String valueOf = String.valueOf(str);
        throw ParserException.a(valueOf.length() != 0 ? "Missing CodecPrivate for codec ".concat(valueOf) : new String("Missing CodecPrivate for codec "), (RuntimeException) null);
    }
}
