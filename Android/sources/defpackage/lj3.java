package defpackage;

import android.content.Context;
import android.content.res.TypedArray;
import android.util.AttributeSet;
import android.util.SparseIntArray;
import kotlin.io.encoding.Base64;
import one.me.common.drawable.SavedMessagesIconDrawable;
import org.apache.http.util.LangUtils;
import ru.ok.tamtam.nano.Protos;

/* renamed from: lj3  reason: default package */
public final class lj3 {
    public static final SparseIntArray p0;
    public int A;
    public float B;
    public int C;
    public int D;
    public int E;
    public int F;
    public int G;
    public int H;
    public int I;
    public int J;
    public int K;
    public int L;
    public int M;
    public int N;
    public int O;
    public int P;
    public int Q;
    public int R;
    public int S;
    public float T;
    public float U;
    public int V;
    public int W;
    public int X;
    public int Y;
    public int Z;
    public boolean a;
    public int a0;
    public int b;
    public int b0;
    public int c;
    public int c0;
    public int d;
    public float d0;
    public int e;
    public float e0;
    public float f;
    public int f0;
    public boolean g;
    public int g0;
    public int h;
    public int h0;
    public int i;
    public int[] i0;
    public int j;
    public String j0;
    public int k;
    public String k0;
    public int l;
    public boolean l0;
    public int m;
    public boolean m0;
    public int n;
    public boolean n0;
    public int o;
    public int o0;
    public int p;
    public int q;
    public int r;
    public int s;
    public int t;
    public int u;
    public int v;
    public float w;
    public float x;
    public String y;
    public int z;

    static {
        SparseIntArray sparseIntArray = new SparseIntArray();
        p0 = sparseIntArray;
        sparseIntArray.append(doc.Layout_layout_constraintLeft_toLeftOf, 24);
        sparseIntArray.append(doc.Layout_layout_constraintLeft_toRightOf, 25);
        sparseIntArray.append(doc.Layout_layout_constraintRight_toLeftOf, 28);
        sparseIntArray.append(doc.Layout_layout_constraintRight_toRightOf, 29);
        sparseIntArray.append(doc.Layout_layout_constraintTop_toTopOf, 35);
        sparseIntArray.append(doc.Layout_layout_constraintTop_toBottomOf, 34);
        sparseIntArray.append(doc.Layout_layout_constraintBottom_toTopOf, 4);
        sparseIntArray.append(doc.Layout_layout_constraintBottom_toBottomOf, 3);
        sparseIntArray.append(doc.Layout_layout_constraintBaseline_toBaselineOf, 1);
        sparseIntArray.append(doc.Layout_layout_editor_absoluteX, 6);
        sparseIntArray.append(doc.Layout_layout_editor_absoluteY, 7);
        sparseIntArray.append(doc.Layout_layout_constraintGuide_begin, 17);
        sparseIntArray.append(doc.Layout_layout_constraintGuide_end, 18);
        sparseIntArray.append(doc.Layout_layout_constraintGuide_percent, 19);
        sparseIntArray.append(doc.Layout_guidelineUseRtl, 90);
        sparseIntArray.append(doc.Layout_android_orientation, 26);
        sparseIntArray.append(doc.Layout_layout_constraintStart_toEndOf, 31);
        sparseIntArray.append(doc.Layout_layout_constraintStart_toStartOf, 32);
        sparseIntArray.append(doc.Layout_layout_constraintEnd_toStartOf, 10);
        sparseIntArray.append(doc.Layout_layout_constraintEnd_toEndOf, 9);
        sparseIntArray.append(doc.Layout_layout_goneMarginLeft, 13);
        sparseIntArray.append(doc.Layout_layout_goneMarginTop, 16);
        sparseIntArray.append(doc.Layout_layout_goneMarginRight, 14);
        sparseIntArray.append(doc.Layout_layout_goneMarginBottom, 11);
        sparseIntArray.append(doc.Layout_layout_goneMarginStart, 15);
        sparseIntArray.append(doc.Layout_layout_goneMarginEnd, 12);
        sparseIntArray.append(doc.Layout_layout_constraintVertical_weight, 38);
        sparseIntArray.append(doc.Layout_layout_constraintHorizontal_weight, 37);
        sparseIntArray.append(doc.Layout_layout_constraintHorizontal_chainStyle, 39);
        sparseIntArray.append(doc.Layout_layout_constraintVertical_chainStyle, 40);
        sparseIntArray.append(doc.Layout_layout_constraintHorizontal_bias, 20);
        sparseIntArray.append(doc.Layout_layout_constraintVertical_bias, 36);
        sparseIntArray.append(doc.Layout_layout_constraintDimensionRatio, 5);
        sparseIntArray.append(doc.Layout_layout_constraintLeft_creator, 91);
        sparseIntArray.append(doc.Layout_layout_constraintTop_creator, 91);
        sparseIntArray.append(doc.Layout_layout_constraintRight_creator, 91);
        sparseIntArray.append(doc.Layout_layout_constraintBottom_creator, 91);
        sparseIntArray.append(doc.Layout_layout_constraintBaseline_creator, 91);
        sparseIntArray.append(doc.Layout_android_layout_marginLeft, 23);
        sparseIntArray.append(doc.Layout_android_layout_marginRight, 27);
        sparseIntArray.append(doc.Layout_android_layout_marginStart, 30);
        sparseIntArray.append(doc.Layout_android_layout_marginEnd, 8);
        sparseIntArray.append(doc.Layout_android_layout_marginTop, 33);
        sparseIntArray.append(doc.Layout_android_layout_marginBottom, 2);
        sparseIntArray.append(doc.Layout_android_layout_width, 22);
        sparseIntArray.append(doc.Layout_android_layout_height, 21);
        sparseIntArray.append(doc.Layout_layout_constraintWidth, 41);
        sparseIntArray.append(doc.Layout_layout_constraintHeight, 42);
        sparseIntArray.append(doc.Layout_layout_constrainedWidth, 41);
        sparseIntArray.append(doc.Layout_layout_constrainedHeight, 42);
        sparseIntArray.append(doc.Layout_layout_wrapBehaviorInParent, 76);
        sparseIntArray.append(doc.Layout_layout_constraintCircle, 61);
        sparseIntArray.append(doc.Layout_layout_constraintCircleRadius, 62);
        sparseIntArray.append(doc.Layout_layout_constraintCircleAngle, 63);
        sparseIntArray.append(doc.Layout_layout_constraintWidth_percent, 69);
        sparseIntArray.append(doc.Layout_layout_constraintHeight_percent, 70);
        sparseIntArray.append(doc.Layout_chainUseRtl, 71);
        sparseIntArray.append(doc.Layout_barrierDirection, 72);
        sparseIntArray.append(doc.Layout_barrierMargin, 73);
        sparseIntArray.append(doc.Layout_constraint_referenced_ids, 74);
        sparseIntArray.append(doc.Layout_barrierAllowsGoneWidgets, 75);
    }

    public final void a(Context context, AttributeSet attributeSet) {
        TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, doc.Layout);
        int indexCount = obtainStyledAttributes.getIndexCount();
        for (int i2 = 0; i2 < indexCount; i2++) {
            int index = obtainStyledAttributes.getIndex(i2);
            SparseIntArray sparseIntArray = p0;
            int i3 = sparseIntArray.get(index);
            switch (i3) {
                case 1:
                    this.p = pj3.l(obtainStyledAttributes, index, this.p);
                    break;
                case 2:
                    this.I = obtainStyledAttributes.getDimensionPixelSize(index, this.I);
                    break;
                case 3:
                    this.o = pj3.l(obtainStyledAttributes, index, this.o);
                    break;
                case 4:
                    this.n = pj3.l(obtainStyledAttributes, index, this.n);
                    break;
                case 5:
                    this.y = obtainStyledAttributes.getString(index);
                    break;
                case 6:
                    this.C = obtainStyledAttributes.getDimensionPixelOffset(index, this.C);
                    break;
                case 7:
                    this.D = obtainStyledAttributes.getDimensionPixelOffset(index, this.D);
                    break;
                case 8:
                    this.J = obtainStyledAttributes.getDimensionPixelSize(index, this.J);
                    break;
                case 9:
                    this.v = pj3.l(obtainStyledAttributes, index, this.v);
                    break;
                case 10:
                    this.u = pj3.l(obtainStyledAttributes, index, this.u);
                    break;
                case 11:
                    this.P = obtainStyledAttributes.getDimensionPixelSize(index, this.P);
                    break;
                case 12:
                    this.Q = obtainStyledAttributes.getDimensionPixelSize(index, this.Q);
                    break;
                case 13:
                    this.M = obtainStyledAttributes.getDimensionPixelSize(index, this.M);
                    break;
                case Protos.Attaches.Attach.LOCATION /*14*/:
                    this.O = obtainStyledAttributes.getDimensionPixelSize(index, this.O);
                    break;
                case Protos.Attaches.Attach.DAILY_MEDIA /*15*/:
                    this.R = obtainStyledAttributes.getDimensionPixelSize(index, this.R);
                    break;
                case 16:
                    this.N = obtainStyledAttributes.getDimensionPixelSize(index, this.N);
                    break;
                case LangUtils.HASH_SEED /*17*/:
                    this.d = obtainStyledAttributes.getDimensionPixelOffset(index, this.d);
                    break;
                case 18:
                    this.e = obtainStyledAttributes.getDimensionPixelOffset(index, this.e);
                    break;
                case 19:
                    this.f = obtainStyledAttributes.getFloat(index, this.f);
                    break;
                case 20:
                    this.w = obtainStyledAttributes.getFloat(index, this.w);
                    break;
                case 21:
                    this.c = obtainStyledAttributes.getLayoutDimension(index, this.c);
                    break;
                case 22:
                    this.b = obtainStyledAttributes.getLayoutDimension(index, this.b);
                    break;
                case 23:
                    this.F = obtainStyledAttributes.getDimensionPixelSize(index, this.F);
                    break;
                case SavedMessagesIconDrawable.NORMAL_ICON_SIZE /*24*/:
                    this.h = pj3.l(obtainStyledAttributes, index, this.h);
                    break;
                case 25:
                    this.i = pj3.l(obtainStyledAttributes, index, this.i);
                    break;
                case 26:
                    this.E = obtainStyledAttributes.getInt(index, this.E);
                    break;
                case 27:
                    this.G = obtainStyledAttributes.getDimensionPixelSize(index, this.G);
                    break;
                case 28:
                    this.j = pj3.l(obtainStyledAttributes, index, this.j);
                    break;
                case 29:
                    this.k = pj3.l(obtainStyledAttributes, index, this.k);
                    break;
                case 30:
                    this.K = obtainStyledAttributes.getDimensionPixelSize(index, this.K);
                    break;
                case 31:
                    this.s = pj3.l(obtainStyledAttributes, index, this.s);
                    break;
                case 32:
                    this.t = pj3.l(obtainStyledAttributes, index, this.t);
                    break;
                case 33:
                    this.H = obtainStyledAttributes.getDimensionPixelSize(index, this.H);
                    break;
                case 34:
                    this.m = pj3.l(obtainStyledAttributes, index, this.m);
                    break;
                case 35:
                    this.l = pj3.l(obtainStyledAttributes, index, this.l);
                    break;
                case 36:
                    this.x = obtainStyledAttributes.getFloat(index, this.x);
                    break;
                case LangUtils.HASH_OFFSET /*37*/:
                    this.U = obtainStyledAttributes.getFloat(index, this.U);
                    break;
                case 38:
                    this.T = obtainStyledAttributes.getFloat(index, this.T);
                    break;
                case 39:
                    this.V = obtainStyledAttributes.getInt(index, this.V);
                    break;
                case SavedMessagesIconDrawable.SMALL_SIZE /*40*/:
                    this.W = obtainStyledAttributes.getInt(index, this.W);
                    break;
                case 41:
                    pj3.m(this, obtainStyledAttributes, index, 0);
                    break;
                case 42:
                    pj3.m(this, obtainStyledAttributes, index, 1);
                    break;
                default:
                    switch (i3) {
                        case 61:
                            this.z = pj3.l(obtainStyledAttributes, index, this.z);
                            break;
                        case 62:
                            this.A = obtainStyledAttributes.getDimensionPixelSize(index, this.A);
                            break;
                        case 63:
                            this.B = obtainStyledAttributes.getFloat(index, this.B);
                            break;
                        default:
                            switch (i3) {
                                case 69:
                                    this.d0 = obtainStyledAttributes.getFloat(index, 1.0f);
                                    break;
                                case 70:
                                    this.e0 = obtainStyledAttributes.getFloat(index, 1.0f);
                                    break;
                                case 71:
                                    break;
                                case 72:
                                    this.f0 = obtainStyledAttributes.getInt(index, this.f0);
                                    break;
                                case 73:
                                    this.g0 = obtainStyledAttributes.getDimensionPixelSize(index, this.g0);
                                    break;
                                case 74:
                                    this.j0 = obtainStyledAttributes.getString(index);
                                    break;
                                case 75:
                                    this.n0 = obtainStyledAttributes.getBoolean(index, this.n0);
                                    break;
                                case Base64.mimeLineLength:
                                    this.o0 = obtainStyledAttributes.getInt(index, this.o0);
                                    break;
                                case 77:
                                    this.q = pj3.l(obtainStyledAttributes, index, this.q);
                                    break;
                                case 78:
                                    this.r = pj3.l(obtainStyledAttributes, index, this.r);
                                    break;
                                case 79:
                                    this.S = obtainStyledAttributes.getDimensionPixelSize(index, this.S);
                                    break;
                                case 80:
                                    this.L = obtainStyledAttributes.getDimensionPixelSize(index, this.L);
                                    break;
                                case 81:
                                    this.X = obtainStyledAttributes.getInt(index, this.X);
                                    break;
                                case 82:
                                    this.Y = obtainStyledAttributes.getInt(index, this.Y);
                                    break;
                                case 83:
                                    this.a0 = obtainStyledAttributes.getDimensionPixelSize(index, this.a0);
                                    break;
                                case 84:
                                    this.Z = obtainStyledAttributes.getDimensionPixelSize(index, this.Z);
                                    break;
                                case 85:
                                    this.c0 = obtainStyledAttributes.getDimensionPixelSize(index, this.c0);
                                    break;
                                case 86:
                                    this.b0 = obtainStyledAttributes.getDimensionPixelSize(index, this.b0);
                                    break;
                                case 87:
                                    this.l0 = obtainStyledAttributes.getBoolean(index, this.l0);
                                    break;
                                case 88:
                                    this.m0 = obtainStyledAttributes.getBoolean(index, this.m0);
                                    break;
                                case 89:
                                    this.k0 = obtainStyledAttributes.getString(index);
                                    break;
                                case 90:
                                    this.g = obtainStyledAttributes.getBoolean(index, this.g);
                                    break;
                                case 91:
                                    Integer.toHexString(index);
                                    sparseIntArray.get(index);
                                    break;
                                default:
                                    Integer.toHexString(index);
                                    sparseIntArray.get(index);
                                    break;
                            }
                    }
            }
        }
        obtainStyledAttributes.recycle();
    }
}
