package defpackage;

import android.content.Context;
import android.graphics.Bitmap;
import android.graphics.Gainmap;
import android.opengl.GLES20;
import android.opengl.GLUtils;
import android.opengl.Matrix;
import androidx.media3.common.util.GlUtil$GlException;
import java.io.IOException;
import java.lang.reflect.Array;
import java.util.Arrays;
import java.util.List;

/* renamed from: gi4  reason: default package */
public final class gi4 extends kj0 implements gf5, z1d {
    public static final k0d v;
    public static final float[] w = {1.0f, 1.0f, 1.0f, c44.DEFAULT_ASPECT_RATIO, -0.1646f, 1.8814f, 1.4746f, -0.5714f, c44.DEFAULT_ASPECT_RATIO};
    public static final float[] x = {1.1689f, 1.1689f, 1.1689f, c44.DEFAULT_ASPECT_RATIO, -0.1881f, 2.1502f, 1.6853f, -0.653f, c44.DEFAULT_ASPECT_RATIO};
    public final bs6 h;
    public final tb7 i;
    public final tb7 j;
    public final boolean k;
    public final float[][] l;
    public final float[][] m;
    public final float[] n = ld8.q();
    public final float[] o = ld8.q();
    public final float[] p = new float[16];
    public k0d q = v;
    public Gainmap r;
    public int s = -1;
    public boolean t;
    public boolean u;

    static {
        float[] fArr = {-1.0f, -1.0f, c44.DEFAULT_ASPECT_RATIO, 1.0f};
        float[] fArr2 = {-1.0f, 1.0f, c44.DEFAULT_ASPECT_RATIO, 1.0f};
        float[] fArr3 = {1.0f, 1.0f, c44.DEFAULT_ASPECT_RATIO, 1.0f};
        float[] fArr4 = {1.0f, -1.0f, c44.DEFAULT_ASPECT_RATIO, 1.0f};
        lx5 lx5 = tb7.b;
        Object[] objArr = {fArr, fArr2, fArr3, fArr4};
        f6e.g(4, objArr);
        v = tb7.n(4, objArr);
    }

    public gi4(bs6 bs6, tb7 tb7, tb7 tb72, int i2, boolean z) {
        super(z);
        this.h = bs6;
        this.i = tb7;
        this.j = tb72;
        this.k = z;
        int size = tb7.size();
        int[] iArr = new int[2];
        iArr[1] = 16;
        iArr[0] = size;
        Class cls = Float.TYPE;
        this.l = (float[][]) Array.newInstance(cls, iArr);
        int size2 = tb72.size();
        int[] iArr2 = new int[2];
        iArr2[1] = 16;
        iArr2[0] = size2;
        this.m = (float[][]) Array.newInstance(cls, iArr2);
    }

    public static gi4 h(Context context, k0d k0d, k0d k0d2, boolean z) {
        return new gi4(j(context, "shaders/vertex_shader_transformation_es2.glsl", k0d2.isEmpty() ? "shaders/fragment_shader_copy_es2.glsl" : "shaders/fragment_shader_transformation_es2.glsl"), tb7.p(k0d), tb7.p(k0d2), 1, z);
    }

    public static gi4 i(Context context, k0d k0d, List list, m53 m53, int i2) {
        boolean g = m53.g(m53);
        boolean z = false;
        boolean z2 = i2 == 2;
        bs6 j2 = j(context, g ? "shaders/vertex_shader_transformation_es3.glsl" : "shaders/vertex_shader_transformation_es2.glsl", g ? "shaders/fragment_shader_oetf_es3.glsl" : z2 ? "shaders/fragment_shader_transformation_sdr_oetf_es2.glsl" : list.isEmpty() ? "shaders/fragment_shader_copy_es2.glsl" : "shaders/fragment_shader_transformation_es2.glsl");
        int i3 = m53.c;
        if (g) {
            if (i3 == 7 || i3 == 6) {
                z = true;
            }
            n79.g(z);
            j2.q(i3, "uOutputColorTransfer");
        } else if (z2) {
            if (i3 == 3 || i3 == 10) {
                z = true;
            }
            n79.g(z);
            j2.q(i3, "uOutputColorTransfer");
        }
        return new gi4(j2, tb7.p(k0d), tb7.p(list), m53.c, g);
    }

    public static bs6 j(Context context, String str, String str2) {
        try {
            bs6 bs6 = new bs6(context, str, str2);
            bs6.n("uTexTransformationMatrix", ld8.q());
            return bs6;
        } catch (GlUtil$GlException | IOException e) {
            throw new Exception(e);
        }
    }

    public static gi4 k(bs6 bs6, m53 m53, m53 m532, int i2, k0d k0d) {
        bs6 bs62 = bs6;
        m53 m533 = m532;
        boolean g = m53.g(m53);
        int i3 = m53.a;
        boolean z = false;
        boolean z2 = (i3 == 1 || i3 == 2) && m533.a == 6;
        int i4 = m533.c;
        if (g) {
            if (i4 == 3) {
                i4 = 10;
            }
            n79.g(i4 == 1 || i4 == 10 || i4 == 6 || i4 == 7);
            bs6.q(i4, "uOutputColorTransfer");
        } else if (z2) {
            n79.g(i4 == 1 || i4 == 6 || i4 == 7);
            bs6.q(i4, "uOutputColorTransfer");
        } else {
            int i5 = i2;
            bs6.q(i2, "uSdrWorkingColorSpace");
            n79.g(i4 == 3 || i4 == 1);
            bs6.q(i4, "uOutputColorTransfer");
        }
        k0d k0d2 = k0d.v;
        if (g || z2) {
            z = true;
        }
        return new gi4(bs6, k0d, k0d2, m533.c, z);
    }

    public static boolean n(float[][] fArr, float[][] fArr2) {
        boolean z = false;
        for (int i2 = 0; i2 < fArr.length; i2++) {
            float[] fArr3 = fArr[i2];
            float[] fArr4 = fArr2[i2];
            if (!Arrays.equals(fArr3, fArr4)) {
                n79.m("A 4x4 transformation matrix must have 16 elements", fArr4.length == 16);
                System.arraycopy(fArr4, 0, fArr3, 0, fArr4.length);
                z = true;
            }
        }
        return z;
    }

    public final void d(int i2, long j2) {
        boolean z;
        bs6 bs6 = this.h;
        tb7 tb7 = this.j;
        int size = tb7.size();
        int[] iArr = new int[2];
        iArr[1] = 16;
        int i3 = 0;
        iArr[0] = size;
        Class cls = Float.TYPE;
        float[][] fArr = (float[][]) Array.newInstance(cls, iArr);
        if (tb7.size() <= 0) {
            boolean n2 = n(this.m, fArr);
            float[] fArr2 = this.o;
            if (!n2) {
                z = false;
            } else {
                ld8.v0(fArr2);
                if (tb7.size() <= 0) {
                    z = true;
                } else {
                    rae.w(tb7.get(0));
                    throw null;
                }
            }
            tb7 tb72 = this.i;
            int size2 = tb72.size();
            int[] iArr2 = new int[2];
            iArr2[1] = 16;
            iArr2[0] = size2;
            float[][] fArr3 = (float[][]) Array.newInstance(cls, iArr2);
            for (int i4 = 0; i4 < tb72.size(); i4++) {
                fArr3[i4] = ((hh8) tb72.get(i4)).b(j2);
            }
            float[][] fArr4 = this.l;
            boolean n3 = n(fArr4, fArr3);
            float[] fArr5 = this.n;
            if (n3) {
                ld8.v0(fArr5);
                this.q = v;
                int length = fArr4.length;
                int i5 = 0;
                while (true) {
                    float[] fArr6 = this.p;
                    if (i5 >= length) {
                        int i6 = i3;
                        float[] fArr7 = fArr6;
                        Matrix.invertM(fArr7, i6, fArr5, i6);
                        this.q = f6e.K(fArr7, this.q);
                        break;
                    }
                    float[] fArr8 = fArr4[i5];
                    float[] fArr9 = fArr6;
                    Matrix.multiplyMM(fArr6, 0, fArr8, 0, this.n, 0);
                    System.arraycopy(fArr9, i3, fArr5, i3, fArr9.length);
                    k0d K = f6e.K(fArr8, this.q);
                    n79.f("A polygon must have at least 3 vertices.", K.size() >= 3);
                    qb7 qb7 = new qb7();
                    qb7.f(K);
                    float[][] fArr10 = f6e.g;
                    int i7 = 0;
                    while (i7 < 6) {
                        float[] fArr11 = fArr10[i7];
                        k0d j3 = qb7.j();
                        qb7 qb72 = new qb7();
                        for (int i8 = 0; i8 < j3.size(); i8++) {
                            float[] fArr12 = (float[]) j3.get(i8);
                            float[] fArr13 = (float[]) j3.get(((j3.size() + i8) - 1) % j3.size());
                            if (f6e.x(fArr12, fArr11)) {
                                if (!f6e.x(fArr13, fArr11)) {
                                    float[] j4 = f6e.j(fArr11, fArr11, fArr13, fArr12);
                                    if (!Arrays.equals(fArr12, j4)) {
                                        qb72.d(j4);
                                    }
                                }
                                qb72.d(fArr12);
                            } else if (f6e.x(fArr13, fArr11)) {
                                float[] j5 = f6e.j(fArr11, fArr11, fArr13, fArr12);
                                if (!Arrays.equals(fArr13, j5)) {
                                    qb72.d(j5);
                                }
                            }
                        }
                        i7++;
                        qb7 = qb72;
                    }
                    k0d j6 = qb7.j();
                    this.q = j6;
                    if (j6.size() < 3) {
                        break;
                    }
                    i5++;
                    i3 = 0;
                }
                i3 = 1;
            }
            boolean z2 = z || i3 != 0;
            if (this.q.size() >= 3) {
                if (!this.t || z2 || !this.u) {
                    try {
                        bs6.t();
                        m();
                        bs6.r(i2, 0, "uTexSampler");
                        bs6.n("uTransformationMatrix", fArr5);
                        bs6.o(fArr2);
                        bs6.l(ld8.u(this.q));
                        bs6.f();
                        GLES20.glDrawArrays(6, 0, this.q.size());
                        ld8.h();
                        this.u = true;
                    } catch (GlUtil$GlException e) {
                        throw new Exception(e);
                    }
                }
            }
        } else {
            rae.w(tb7.get(0));
            throw null;
        }
    }

    public final void l(Gainmap gainmap) {
        if (this.k) {
            Gainmap gainmap2 = this.r;
            if (gainmap2 == null || gainmap2.getGamma() != gainmap.getGamma() || gainmap2.getRatioMax() != gainmap.getRatioMax() || gainmap2.getRatioMin() != gainmap.getRatioMin() || gainmap2.getEpsilonHdr() != gainmap.getEpsilonHdr() || gainmap2.getEpsilonSdr() != gainmap.getEpsilonSdr() || gainmap2.getDisplayRatioForFullHdr() != gainmap.getDisplayRatioForFullHdr() || gainmap2.getMinDisplayRatioForHdrTransition() != gainmap.getMinDisplayRatioForHdrTransition() || gainmap2.getGainmapContents() != gainmap.getGainmapContents() || gainmap2.getGainmapContents().getGenerationId() != gainmap.getGainmapContents().getGenerationId()) {
                this.u = false;
                this.r = gainmap;
                int i2 = this.s;
                if (i2 == -1) {
                    Bitmap b = gainmap.getGainmapContents();
                    int[] iArr = new int[1];
                    GLES20.glGenTextures(1, iArr, 0);
                    ld8.h();
                    int i3 = iArr[0];
                    ld8.c(b.getWidth(), b.getHeight());
                    ld8.d(3553, i3, 9729);
                    GLUtils.texImage2D(3553, 0, b, 0);
                    ld8.h();
                    this.s = i3;
                    return;
                }
                Bitmap b2 = gainmap.getGainmapContents();
                ld8.c(b2.getWidth(), b2.getHeight());
                ld8.d(3553, i2, 9729);
                GLUtils.texImage2D(3553, 0, b2, 0);
                ld8.h();
            }
        }
    }

    public final void m() {
        if (this.r != null) {
            if (v0g.a >= 34) {
                int i2 = this.s;
                bs6 bs6 = this.h;
                bs6.r(i2, 1, "uGainmapTexSampler");
                Gainmap gainmap = this.r;
                int i3 = gainmap.getGainmapContents().getConfig() == Bitmap.Config.ALPHA_8 ? 1 : 0;
                float[] j2 = gainmap.getGamma();
                int i4 = (j2[0] == 1.0f && j2[1] == 1.0f && j2[2] == 1.0f) ? 1 : 0;
                int i5 = (!i8b.e(j2) || !i8b.e(gainmap.getRatioMax()) || !i8b.e(gainmap.getRatioMin())) ? 0 : 1;
                bs6.q(i3, "uGainmapIsAlpha");
                bs6.q(i4, "uNoGamma");
                bs6.q(i5, "uSingleChannel");
                float[] n2 = gainmap.getRatioMin();
                bs6.n("uLogRatioMin", new float[]{(float) Math.log((double) n2[0]), (float) Math.log((double) n2[1]), (float) Math.log((double) n2[2])});
                float[] m2 = gainmap.getRatioMax();
                bs6.n("uLogRatioMax", new float[]{(float) Math.log((double) m2[0]), (float) Math.log((double) m2[1]), (float) Math.log((double) m2[2])});
                bs6.n("uEpsilonSdr", gainmap.getEpsilonSdr());
                bs6.n("uEpsilonHdr", gainmap.getEpsilonHdr());
                bs6.n("uGainmapGamma", j2);
                bs6.m("uDisplayRatioHdr", gainmap.getDisplayRatioForFullHdr());
                bs6.m("uDisplayRatioSdr", gainmap.getMinDisplayRatioForHdrTransition());
                ld8.h();
                return;
            }
            throw new IllegalStateException("Gainmaps not supported under API 34.");
        }
    }

    public final void release() {
        try {
            this.a.d();
            try {
                GLES20.glDeleteProgram(this.h.a);
                ld8.h();
                int i2 = this.s;
                if (i2 != -1) {
                    GLES20.glDeleteTextures(1, new int[]{i2}, 0);
                    ld8.h();
                }
            } catch (GlUtil$GlException e) {
                throw new Exception(e);
            }
        } catch (GlUtil$GlException e2) {
            throw new Exception(e2);
        }
    }
}
