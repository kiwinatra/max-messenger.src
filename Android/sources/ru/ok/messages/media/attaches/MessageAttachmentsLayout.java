package ru.ok.messages.media.attaches;

import android.content.Context;
import android.util.AttributeSet;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import com.facebook.drawee.view.SimpleDraweeView;
import ru.ok.messages.video.widgets.LiveVideoPlaceHolderView;

public class MessageAttachmentsLayout extends ViewGroup {
    public static final int x0 = ((int) ym.v.getResources().getDimension(ydc.message_max_attach_width));
    public static final int y0 = ((int) ym.v.getResources().getDimension(ydc.message_min_attach_height));
    public ro4 a;
    public o20 b;
    public a89 c;
    public w28 o;
    public p89 v;
    public a32 v0;
    public SimpleDraweeView w;
    public id3 w0;
    public vz x;
    public String y;
    public bq0 z;

    public MessageAttachmentsLayout(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        b();
    }

    public final void a(a32 a32, a89 a89) {
        this.c = a89;
        this.v0 = a32;
        this.o = a89.a.x0;
        this.v.p(a89);
        if (!cvg.c(this.o.F(0).q, this.y)) {
            this.y = null;
            this.w.setVisibility(4);
        }
    }

    public final void b() {
        this.w0 = ym.e();
        getContext();
        this.a = ro4.b();
        this.b = ((qra) this.w0).h();
        setLayoutParams(new ViewGroup.LayoutParams(-1, -2));
        SimpleDraweeView simpleDraweeView = new SimpleDraweeView(getContext());
        this.w = simpleDraweeView;
        ((sp6) simpleDraweeView.getHierarchy()).h(ydd.m);
        this.x = new vz(this.w, (uz) null);
        this.z = this.w0.b(10, 2);
        ct.G(this.w, 1000, new xu3(29, (Object) this));
        this.w.setOnLongClickListener(new z20(8, this));
        addView(this.w, new FrameLayout.LayoutParams(-1, -1));
        p89 p89 = new p89(getContext());
        this.v = p89;
        p89.setId(lic.view_message__view_attaches);
        addView(this.v);
        setClipChildren(false);
        setClipToPadding(false);
    }

    public p89 getView() {
        return this.v;
    }

    public final void onAttachedToWindow() {
        super.onAttachedToWindow();
        vz vzVar = this.x;
        if (vzVar != null) {
            vzVar.j();
        }
    }

    public final void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        vz vzVar = this.x;
        if (vzVar != null) {
            jbd.c(vzVar.t);
        }
    }

    public final void onLayout(boolean z2, int i, int i2, int i3, int i4) {
        w28 w28 = this.o;
        if (w28 == null || w28.G() != 1) {
            this.v.layout(0, 0, getMeasuredWidth(), getMeasuredHeight());
            return;
        }
        if (this.v.getMeasuredWidth() == getMeasuredWidth() && this.v.getMeasuredHeight() == getMeasuredHeight()) {
            this.v.layout(0, 0, getMeasuredWidth(), getMeasuredHeight());
        } else {
            this.v.layout((getMeasuredWidth() / 2) - (this.v.getMeasuredWidth() / 2), (getMeasuredHeight() / 2) - (this.v.getMeasuredHeight() / 2), (this.v.getMeasuredWidth() / 2) + (getMeasuredWidth() / 2), (this.v.getMeasuredHeight() / 2) + (getMeasuredHeight() / 2));
        }
        this.w.layout(0, 0, getMeasuredWidth(), getMeasuredHeight());
    }

    public final void onMeasure(int i, int i2) {
        int i3;
        int i4;
        z35 z35;
        w28 w28 = this.o;
        if (w28 == null || w28.G() != 1) {
            this.v.measure(i, i2);
            setMeasuredDimension(this.v.getMeasuredWidth(), this.v.getMeasuredHeight());
            return;
        }
        l20 F = this.o.F(0);
        int mode = View.MeasureSpec.getMode(i);
        int size = View.MeasureSpec.getSize(i);
        int F2 = ld8.F(F);
        int C = ld8.C(F);
        if (F2 == 0 || C == 0) {
            i3 = size / 2;
            i4 = size;
        } else {
            i3 = C;
            i4 = F2;
        }
        Context context = getContext();
        if (ryg.g == null) {
            float A = (float) ryg.A(context);
            ryg.g = Integer.valueOf((int) (A - (0.4f * A)));
        }
        int intValue = ryg.g.intValue();
        if (mode == 1073741824) {
            z35 = new z35();
            int i5 = (int) ((((float) i3) / ((float) i4)) * ((float) size));
            if (i5 <= intValue && i5 >= (intValue = y0)) {
                intValue = i5;
            }
            kv0.X(size, intValue, i4, i3, z35);
        } else {
            z35 = new z35();
            kv0.T(x0, size, i4, i3, y0, intValue, z35);
        }
        int i6 = z35.d;
        int i7 = z35.e;
        this.a.getClass();
        int i8 = (int) 11.0f;
        if (((float) (z35.c - i7)) < ((float) vo4.b(i8)) * 1.5f) {
            this.a.getClass();
            if (((float) (z35.b - z35.d)) < ((float) vo4.b(i8)) * 1.5f) {
                i6 = z35.b;
                i7 = z35.c;
                this.v.measure(View.MeasureSpec.makeMeasureSpec((i6 - getPaddingLeft()) - getPaddingRight(), 1073741824), View.MeasureSpec.makeMeasureSpec((i7 - getPaddingTop()) - getPaddingBottom(), 1073741824));
                setMeasuredDimension(z35.b, z35.c);
            }
        }
        lv4 lv4 = this.v.z(0).o;
        lv4.getClass();
        ((sp6) lv4).n((b9d) null);
        String str = this.y;
        String str2 = F.q;
        if (!str2.equals(str)) {
            vz vzVar = this.x;
            vzVar.u = null;
            LiveVideoPlaceHolderView liveVideoPlaceHolderView = vzVar.s;
            if (liveVideoPlaceHolderView != null) {
                liveVideoPlaceHolderView.setCorners((float[]) null);
            }
            this.x.g(F, this.c, this.v0);
            boolean g0 = ld8.g0(F, this.c);
            knb c2 = this.x.c(this.w.getController(), false, true, g0);
            ryg.c(getContext(), F, c2, ryg.j0(this.o), false);
            bq0 bq0 = this.z;
            qa7 qa7 = (qa7) c2.e;
            if (qa7 != null) {
                ra7 b2 = ra7.b(qa7);
                b2.l = bq0;
                c2.e = b2.a();
            }
            this.w.setController(c2.a());
            ((sp6) this.w.getHierarchy()).i(this.b.b(F, g0), 1);
            this.w.measure(View.MeasureSpec.makeMeasureSpec(z35.d, 1073741824), View.MeasureSpec.makeMeasureSpec(z35.e, 1073741824));
            p89.o((sp6) this.w.getHierarchy(), 0, 1, 0, false, false, this.v.D());
            this.y = str2;
            this.w.setVisibility(0);
        }
        this.v.measure(View.MeasureSpec.makeMeasureSpec((i6 - getPaddingLeft()) - getPaddingRight(), 1073741824), View.MeasureSpec.makeMeasureSpec((i7 - getPaddingTop()) - getPaddingBottom(), 1073741824));
        setMeasuredDimension(z35.b, z35.c);
    }
}
