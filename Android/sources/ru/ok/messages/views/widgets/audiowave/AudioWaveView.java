package ru.ok.messages.views.widgets.audiowave;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.Path;
import android.util.AttributeSet;
import android.view.View;
import kotlin.Lazy;
import kotlin.Metadata;
import kotlin.jvm.JvmOverloads;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlin.math.MathKt;

@Metadata(d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0006\n\u0002\u0010\b\n\u0002\b\u0004\u0018\u00002\u00020\u00012\u00020\u0002:\u0001\u0003J\u0017\u0010\u0006\u001a\u00020\u00052\b\u0010\u0004\u001a\u0004\u0018\u00010\u0003¢\u0006\u0004\b\u0006\u0010\u0007R\"\u0010\u000b\u001a\u00020\b8\u0006@\u0006X\u000e¢\u0006\u0012\n\u0004\b\t\u0010\n\u001a\u0004\b\u000b\u0010\f\"\u0004\b\r\u0010\u000eR\u0014\u0010\u0012\u001a\u00020\u000f8BX\u0004¢\u0006\u0006\u001a\u0004\b\u0010\u0010\u0011¨\u0006\u0013"}, d2 = {"Lru/ok/messages/views/widgets/audiowave/AudioWaveView;", "Landroid/view/View;", "Lphf;", "Ld80;", "listener", "", "setListener", "(Ld80;)V", "", "D0", "Z", "isIncomingMessage", "()Z", "setIncomingMessage", "(Z)V", "", "getDataWidth", "()I", "dataWidth", "tamtam-app_release"}, k = 1, mv = {2, 0, 0})
@SourceDebugExtension({"SMAP\nAudioWaveView.kt\nKotlin\n*S Kotlin\n*F\n+ 1 AudioWaveView.kt\nru/ok/messages/views/widgets/audiowave/AudioWaveView\n+ 2 Dimensions.kt\nru/ok/tamtam/shared/Dimensions\n+ 3 ThemeHelper.kt\nru/ok/tamtam/themes/ThemeHelper\n+ 4 Canvas.kt\nandroidx/core/graphics/CanvasKt\n*L\n1#1,293:1\n28#2:294\n28#2:295\n28#2:296\n28#2:297\n75#2:304\n44#2:305\n99#2:306\n75#2:307\n44#2:308\n99#2:309\n75#2:310\n44#2:311\n99#2:312\n49#3,2:298\n45#3:300\n49#3,2:301\n45#3:303\n30#4,7:313\n30#4,7:320\n*S KotlinDebug\n*F\n+ 1 AudioWaveView.kt\nru/ok/messages/views/widgets/audiowave/AudioWaveView\n*L\n57#1:294\n58#1:295\n59#1:296\n60#1:297\n235#1:304\n235#1:305\n235#1:306\n237#1:307\n237#1:308\n237#1:309\n243#1:310\n243#1:311\n243#1:312\n87#1:298,2\n87#1:300\n89#1:301,2\n89#1:303\n257#1:313,7\n262#1:320,7\n*E\n"})
public final class AudioWaveView extends View implements phf {
    public final Paint A0;
    public final Path B0;
    public boolean C0;
    public boolean D0;
    public boolean E0;
    public d80 F0;
    public final byte[] G0;
    public final int[] a;
    public final float b;
    public final float c;
    public final float o;
    public final float v;
    public boolean v0;
    public byte[] w;
    public int w0;
    public byte[] x;
    public final Paint x0;
    public long y;
    public final Paint y0;
    public long z;
    public final Paint z0;

    @JvmOverloads
    public AudioWaveView(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 4);
    }

    private final int getDataWidth() {
        byte[] bArr = this.x;
        if (bArr == null) {
            return 0;
        }
        return (int) ((((float) (bArr.length - 1)) * this.c) + (((float) bArr.length) * this.o));
    }

    /* JADX WARNING: Removed duplicated region for block: B:11:0x002d  */
    /* JADX WARNING: Removed duplicated region for block: B:13:? A[RETURN, SYNTHETIC] */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final float a(android.view.MotionEvent r6) {
        /*
            r5 = this;
            int[] r0 = r5.a
            r5.getLocationOnScreen(r0)
            r1 = 0
            r0 = r0[r1]
            float r6 = r6.getRawX()
            int r1 = r5.getWidth()
            r2 = 1065353216(0x3f800000, float:1.0)
            r3 = 0
            if (r1 != 0) goto L_0x0017
        L_0x0015:
            r6 = r3
            goto L_0x0029
        L_0x0017:
            int r4 = r0 + r1
            float r4 = (float) r4
            int r4 = (r6 > r4 ? 1 : (r6 == r4 ? 0 : -1))
            if (r4 < 0) goto L_0x0020
            r6 = r2
            goto L_0x0029
        L_0x0020:
            float r0 = (float) r0
            int r4 = (r6 > r0 ? 1 : (r6 == r0 ? 0 : -1))
            if (r4 > 0) goto L_0x0026
            goto L_0x0015
        L_0x0026:
            float r6 = r6 - r0
            float r0 = (float) r1
            float r6 = r6 / r0
        L_0x0029:
            int r0 = (r6 > r3 ? 1 : (r6 == r3 ? 0 : -1))
            if (r0 != 0) goto L_0x0035
            long r5 = r5.y
            r0 = 1
            long r5 = r5 - r0
            float r5 = (float) r5
            float r6 = r2 / r5
        L_0x0035:
            return r6
        */
        throw new UnsupportedOperationException("Method not decompiled: ru.ok.messages.views.widgets.audiowave.AudioWaveView.a(android.view.MotionEvent):float");
    }

    public final void b(long j, byte[] bArr) {
        this.w = bArr;
        this.x = null;
        this.y = j;
        this.z = 0;
        this.w0 = 0;
        onThemeChanged(fu4.k.e(getContext()).f());
        Path path = this.B0;
        if (!path.isEmpty()) {
            path.reset();
        }
        requestLayout();
        postInvalidate();
    }

    /* JADX INFO: finally extract failed */
    public final void onDraw(Canvas canvas) {
        float f;
        Path path = this.B0;
        if (!path.isEmpty()) {
            float measuredHeight = ((float) getMeasuredHeight()) / 2.0f;
            float width = ((((float) this.z) / ((float) this.y)) * ((float) getWidth())) + 0.5f;
            boolean z2 = (this.v0 && this.z > 0) || this.E0;
            float roundToInt = (float) MathKt.roundToInt(((float) 6) * getContext().getResources().getDisplayMetrics().density);
            if (this.E0) {
                roundToInt += (float) MathKt.roundToInt(((float) 2) * getContext().getResources().getDisplayMetrics().density);
            }
            if (z2) {
                canvas.save();
                float roundToInt2 = ((float) MathKt.roundToInt(((float) 2) * getContext().getResources().getDisplayMetrics().density)) + roundToInt;
                f = width < roundToInt2 ? roundToInt2 : width;
                if (f > ((float) getWidth()) - roundToInt2) {
                    f = ((float) getWidth()) - roundToInt2;
                }
                d80 d80 = this.F0;
                if (d80 != null) {
                    d80.e(f);
                }
            } else {
                f = 0.0f;
            }
            Paint paint = this.x0;
            if (!z2) {
                canvas.drawPath(path, paint);
                return;
            }
            int save = canvas.save();
            try {
                canvas.clipRect(c44.DEFAULT_ASPECT_RATIO, c44.DEFAULT_ASPECT_RATIO, width, (float) canvas.getHeight());
                canvas.drawPath(path, this.y0);
                canvas.restoreToCount(save);
                int save2 = canvas.save();
                try {
                    canvas.clipRect(width, c44.DEFAULT_ASPECT_RATIO, (float) canvas.getWidth(), (float) canvas.getHeight());
                    canvas.drawPath(path, paint);
                    canvas.restoreToCount(save2);
                    canvas.drawCircle(f, measuredHeight, this.v + roundToInt, this.A0);
                    canvas.drawCircle(f, measuredHeight, roundToInt, this.z0);
                } catch (Throwable th) {
                    canvas.restoreToCount(save2);
                    throw th;
                }
            } catch (Throwable th2) {
                canvas.restoreToCount(save);
                throw th2;
            }
        }
    }

    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r9v0, resolved type: byte} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r9v8, resolved type: byte} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r9v15, resolved type: byte} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r9v16, resolved type: byte} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r9v17, resolved type: byte} */
    /* JADX WARNING: Multi-variable type inference failed */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void onMeasure(int r14, int r15) {
        /*
            r13 = this;
            byte[] r0 = r13.w
            if (r0 != 0) goto L_0x0008
            super.onMeasure(r14, r15)
            return
        L_0x0008:
            int r14 = android.view.View.MeasureSpec.getSize(r14)
            byte[] r1 = r13.x
            r2 = 1
            float r3 = r13.c
            r4 = 0
            float r5 = r13.o
            if (r1 == 0) goto L_0x001a
            int r1 = r13.w0
            if (r1 == r14) goto L_0x0090
        L_0x001a:
            float r1 = (float) r14
            float r6 = r3 + r5
            float r1 = r1 / r6
            int r1 = (int) r1
            if (r1 >= 0) goto L_0x0037
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            java.lang.String r1 = "Width is very small "
            r0.<init>(r1)
            r0.append(r14)
            java.lang.String r0 = r0.toString()
            java.lang.String r1 = "ru.ok.messages.views.widgets.audiowave.AudioWaveView"
            defpackage.z68.p(r1, r0)
            byte[] r0 = r13.G0
            goto L_0x008c
        L_0x0037:
            int r6 = r0.length
            if (r6 != 0) goto L_0x003b
            goto L_0x008c
        L_0x003b:
            android.animation.IntEvaluator r6 = new android.animation.IntEvaluator
            r6.<init>()
            byte[] r7 = new byte[r1]
            r8 = r4
        L_0x0043:
            if (r8 >= r1) goto L_0x008b
            if (r8 == 0) goto L_0x0083
            int r9 = r0.length
            if (r9 != r2) goto L_0x004b
            goto L_0x0083
        L_0x004b:
            int r9 = r1 + -1
            if (r8 != r9) goto L_0x0054
            int r9 = r0.length
            int r9 = r9 - r2
            byte r9 = r0[r9]
            goto L_0x0085
        L_0x0054:
            float r9 = (float) r8
            float r10 = (float) r1
            float r9 = r9 / r10
            int r10 = r0.length
            int r10 = r10 - r2
            float r10 = (float) r10
            float r9 = r9 * r10
            int r10 = (int) r9
            int r11 = r10 + 1
            int r12 = kotlin.collections.ArraysKt.getLastIndex((byte[]) r0)
            if (r10 >= r12) goto L_0x0081
            int r12 = kotlin.collections.ArraysKt.getLastIndex((byte[]) r0)
            if (r11 >= r12) goto L_0x0081
            float r12 = (float) r10
            float r9 = r9 - r12
            byte r10 = r0[r10]
            byte r11 = r0[r11]
            java.lang.Integer r10 = java.lang.Integer.valueOf(r10)
            java.lang.Integer r11 = java.lang.Integer.valueOf(r11)
            java.lang.Integer r9 = r6.evaluate(r9, r10, r11)
            int r9 = r9.intValue()
            goto L_0x0085
        L_0x0081:
            r9 = r4
            goto L_0x0085
        L_0x0083:
            byte r9 = r0[r4]
        L_0x0085:
            byte r9 = (byte) r9
            r7[r8] = r9
            int r8 = r8 + 1
            goto L_0x0043
        L_0x008b:
            r0 = r7
        L_0x008c:
            r13.x = r0
            r13.w0 = r14
        L_0x0090:
            int r14 = r13.getDataWidth()
            int r15 = android.view.View.MeasureSpec.getSize(r15)
            r13.setMeasuredDimension(r14, r15)
            byte[] r14 = r13.x
            int r15 = r13.getMeasuredHeight()
            float r15 = (float) r15
            r0 = 1073741824(0x40000000, float:2.0)
            float r15 = r15 / r0
            if (r14 == 0) goto L_0x00d9
            int r1 = r14.length
            if (r1 != 0) goto L_0x00ac
            r1 = r2
            goto L_0x00ad
        L_0x00ac:
            r1 = r4
        L_0x00ad:
            r1 = r1 ^ r2
            if (r1 == 0) goto L_0x00d9
            float r1 = r5 / r0
            int r2 = r14.length
        L_0x00b3:
            if (r4 >= r2) goto L_0x00d9
            byte r6 = r14[r4]
            float r6 = (float) r6
            int r7 = r13.getHeight()
            float r7 = (float) r7
            r8 = 1123942400(0x42fe0000, float:127.0)
            float r7 = r7 / r8
            float r7 = r7 * r6
            float r6 = r13.b
            int r8 = (r7 > r6 ? 1 : (r7 == r6 ? 0 : -1))
            if (r8 >= 0) goto L_0x00c8
            r7 = r6
        L_0x00c8:
            float r7 = r7 / r0
            float r6 = r15 - r7
            float r7 = r7 + r15
            android.graphics.Path r8 = r13.B0
            r8.moveTo(r1, r6)
            r8.lineTo(r1, r7)
            float r1 = r1 + r5
            float r1 = r1 + r3
            int r4 = r4 + 1
            goto L_0x00b3
        L_0x00d9:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: ru.ok.messages.views.widgets.audiowave.AudioWaveView.onMeasure(int, int):void");
    }

    public final void onThemeChanged(k2b k2b) {
        ws0 ws0;
        scf scf;
        scf scf2;
        if (this.D0) {
            if (isInEditMode()) {
                scf2 = vi4.f0;
            } else {
                Context context = getContext();
                Lazy lazy = scf.b0;
                scf2 = j4b.k0(context);
            }
            ws0 = scf2.i;
        } else {
            if (isInEditMode()) {
                scf = vi4.f0;
            } else {
                Context context2 = getContext();
                Lazy lazy2 = scf.b0;
                scf = j4b.k0(context2);
            }
            ws0 = scf.h;
        }
        this.x0.setColor(ws0.a.f);
        Paint paint = this.z0;
        qs0 qs0 = ws0.a;
        paint.setColor(qs0.e);
        this.A0.setColor(ws0.d.b);
        this.y0.setColor(qs0.e);
    }

    /* JADX WARNING: Code restructure failed: missing block: B:13:0x001e, code lost:
        if (r0 != 3) goto L_0x006c;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final boolean onTouchEvent(android.view.MotionEvent r5) {
        /*
            r4 = this;
            boolean r0 = r4.v0
            if (r0 == 0) goto L_0x000c
            long r0 = r4.z
            r2 = 0
            int r0 = (r0 > r2 ? 1 : (r0 == r2 ? 0 : -1))
            if (r0 > 0) goto L_0x0010
        L_0x000c:
            boolean r0 = r4.E0
            if (r0 == 0) goto L_0x006d
        L_0x0010:
            int r0 = r5.getAction()
            r1 = 1
            if (r0 == 0) goto L_0x0056
            r2 = 0
            if (r0 == r1) goto L_0x003f
            r3 = 2
            if (r0 == r3) goto L_0x0021
            r3 = 3
            if (r0 == r3) goto L_0x003f
            goto L_0x006c
        L_0x0021:
            boolean r0 = r4.E0
            if (r0 != 0) goto L_0x0026
            goto L_0x006c
        L_0x0026:
            boolean r0 = r4.C0
            if (r0 == 0) goto L_0x0033
            r4.C0 = r2
            d80 r0 = r4.F0
            if (r0 == 0) goto L_0x0033
            r0.d()
        L_0x0033:
            d80 r0 = r4.F0
            if (r0 == 0) goto L_0x006c
            float r4 = r4.a(r5)
            r0.f(r4)
            goto L_0x006c
        L_0x003f:
            r4.C0 = r2
            r4.E0 = r2
            d80 r0 = r4.F0
            if (r0 == 0) goto L_0x004e
            float r5 = r4.a(r5)
            r0.g(r5)
        L_0x004e:
            android.view.ViewParent r4 = r4.getParent()
            r4.requestDisallowInterceptTouchEvent(r2)
            goto L_0x006c
        L_0x0056:
            r4.C0 = r1
            r4.E0 = r1
            android.view.ViewParent r0 = r4.getParent()
            r0.requestDisallowInterceptTouchEvent(r1)
            d80 r0 = r4.F0
            if (r0 == 0) goto L_0x006c
            float r4 = r4.a(r5)
            r0.h(r4)
        L_0x006c:
            return r1
        L_0x006d:
            boolean r4 = super.onTouchEvent(r5)
            return r4
        */
        throw new UnsupportedOperationException("Method not decompiled: ru.ok.messages.views.widgets.audiowave.AudioWaveView.onTouchEvent(android.view.MotionEvent):boolean");
    }

    public final void setIncomingMessage(boolean z2) {
        this.D0 = z2;
    }

    public final void setListener(d80 d80) {
        this.F0 = d80;
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public AudioWaveView(Context context, AttributeSet attributeSet, int i) {
        super(context, (i & 2) != 0 ? null : attributeSet, 0);
        this.a = new int[2];
        this.B0 = new Path();
        setLayerType(1, (Paint) null);
        this.b = vo4.c().getDisplayMetrics().density * 5.0f;
        this.c = vo4.c().getDisplayMetrics().density * 2.0f;
        float f = vo4.c().getDisplayMetrics().density * 2.0f;
        this.o = f;
        this.v = vo4.c().getDisplayMetrics().density * 2.0f;
        Paint paint = new Paint(1);
        paint.setStyle(Paint.Style.STROKE);
        paint.setStrokeCap(Paint.Cap.ROUND);
        paint.setStrokeWidth(f);
        this.x0 = paint;
        Paint paint2 = new Paint(1);
        Paint.Style style = Paint.Style.FILL;
        paint2.setStyle(style);
        this.z0 = paint2;
        Paint paint3 = new Paint(1);
        paint3.setStyle(style);
        this.A0 = paint3;
        this.y0 = new Paint(paint);
        ct.b(this);
        if (ct.y(getContext())) {
            setScaleX(-1.0f);
        }
        this.G0 = new byte[0];
    }
}
