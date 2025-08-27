package ru.ok.messages.stickers.widgets;

import android.animation.ValueAnimator;
import android.content.Context;
import android.content.res.TypedArray;
import android.util.AttributeSet;
import android.view.MotionEvent;
import android.view.View;
import android.widget.RelativeLayout;
import java.util.Set;
import java.util.WeakHashMap;
import kotlin.Metadata;
import kotlin.jvm.JvmOverloads;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlin.math.MathKt;

@Metadata(d1 = {"\u00006\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0010\b\n\u0002\b\r\u0018\u00002\u00020\u0001:\u0004\u0002\u0007\"\u000fJ\u0017\u0010\u0005\u001a\u00020\u00042\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002¢\u0006\u0004\b\u0005\u0010\u0006J\u0017\u0010\t\u001a\u00020\u00042\b\u0010\b\u001a\u0004\u0018\u00010\u0007¢\u0006\u0004\b\t\u0010\nJ\u0015\u0010\r\u001a\u00020\u00042\u0006\u0010\f\u001a\u00020\u000b¢\u0006\u0004\b\r\u0010\u000eR$\u0010\u0015\u001a\u00020\u000f2\u0006\u0010\u0010\u001a\u00020\u000f8\u0006@BX\u000e¢\u0006\f\n\u0004\b\u0011\u0010\u0012\u001a\u0004\b\u0013\u0010\u0014R\u0014\u0010\u0019\u001a\u00020\u00168BX\u0004¢\u0006\u0006\u001a\u0004\b\u0017\u0010\u0018R\u0014\u0010\u001b\u001a\u00020\u00168BX\u0004¢\u0006\u0006\u001a\u0004\b\u001a\u0010\u0018R\u0014\u0010\u001d\u001a\u00020\u00168BX\u0004¢\u0006\u0006\u001a\u0004\b\u001c\u0010\u0018R\u0014\u0010\u001f\u001a\u00020\u00168BX\u0004¢\u0006\u0006\u001a\u0004\b\u001e\u0010\u0018R\u0014\u0010!\u001a\u00020\u00168BX\u0004¢\u0006\u0006\u001a\u0004\b \u0010\u0018¨\u0006#"}, d2 = {"Lru/ok/messages/stickers/widgets/StickerSlideRelativeLayout;", "Landroid/widget/RelativeLayout;", "Lqre;", "listener", "", "setListener", "(Lqre;)V", "Lpre;", "bottomView", "setBottomView", "(Lpre;)V", "", "showSuggest", "setShowSuggest", "(Z)V", "Lrre;", "value", "o", "Lrre;", "getState", "()Lrre;", "state", "", "getStateOffset", "()I", "stateOffset", "getInitialOffset", "initialOffset", "getSuggestOffset", "suggestOffset", "getFullScreenOffset", "fullScreenOffset", "getGutterSize", "gutterSize", "rr0", "tamtam-app_release"}, k = 1, mv = {2, 0, 0})
@SourceDebugExtension({"SMAP\nStickerSlideRelativeLayout.kt\nKotlin\n*S Kotlin\n*F\n+ 1 StickerSlideRelativeLayout.kt\nru/ok/messages/stickers/widgets/StickerSlideRelativeLayout\n+ 2 Dimensions.kt\nru/ok/tamtam/shared/Dimensions\n*L\n1#1,350:1\n75#2:351\n44#2:352\n99#2:353\n75#2:354\n44#2:355\n99#2:356\n75#2:357\n44#2:358\n99#2:359\n*S KotlinDebug\n*F\n+ 1 StickerSlideRelativeLayout.kt\nru/ok/messages/stickers/widgets/StickerSlideRelativeLayout\n*L\n49#1:351\n49#1:352\n49#1:353\n50#1:354\n50#1:355\n50#1:356\n175#1:357\n175#1:358\n175#1:359\n*E\n"})
public final class StickerSlideRelativeLayout extends RelativeLayout {
    public static final /* synthetic */ int z0 = 0;
    public final int a;
    public final int b;
    public final kag c;
    public rre o;
    public rre v;
    public qre v0;
    public int w = -1;
    public pre w0;
    public boolean x;
    public StickersView x0;
    public boolean y;
    public final int y0;
    public boolean z;

    @JvmOverloads
    public StickerSlideRelativeLayout(Context context, AttributeSet attributeSet) {
        super(context, attributeSet, 0);
        rre rre = rre.a;
        this.o = rre;
        this.v = rre;
        TypedArray obtainStyledAttributes = getContext().obtainStyledAttributes(attributeSet, wnc.StickerSlideRelativeLayout);
        this.y0 = obtainStyledAttributes.getResourceId(wnc.StickerSlideRelativeLayout_composeLayout, 0);
        obtainStyledAttributes.recycle();
        this.a = MathKt.roundToInt(((float) 24) * getContext().getResources().getDisplayMetrics().density);
        this.b = MathKt.roundToInt(((float) 64) * getContext().getResources().getDisplayMetrics().density);
        this.c = kag.h(this, 0.5f, new rr0(2, this));
        setEnabled(false);
    }

    /* access modifiers changed from: private */
    public final int getFullScreenOffset() {
        StickersView stickersView = this.x0;
        if (stickersView == null) {
            stickersView = null;
        }
        return -stickersView.getPullerlHeight();
    }

    private final int getGutterSize() {
        return this.o == rre.c ? this.b : this.a;
    }

    /* access modifiers changed from: private */
    public final int getInitialOffset() {
        pre pre = this.w0;
        int i = 0;
        if (pre != null) {
            s3a s3a = (s3a) pre;
            if (((View) s3a.c).getVisibility() == 0) {
                i = ((View) s3a.c).getMeasuredHeight();
            }
        }
        return getMeasuredHeight() - i;
    }

    /* access modifiers changed from: private */
    public final int getStateOffset() {
        int i = sre.$EnumSwitchMapping$0[this.o.ordinal()];
        return i != 1 ? i != 2 ? getFullScreenOffset() : getSuggestOffset() : getInitialOffset();
    }

    /* access modifiers changed from: private */
    public final int getSuggestOffset() {
        int initialOffset = getInitialOffset();
        StickersView stickersView = this.x0;
        if (stickersView == null) {
            stickersView = null;
        }
        return a81.e((float) 4, getContext().getResources().getDisplayMetrics().density, initialOffset - stickersView.getCellHeight());
    }

    public final void computeScroll() {
        if (this.c.g()) {
            WeakHashMap weakHashMap = gag.a;
            postInvalidateOnAnimation();
        }
    }

    public final void e(rre rre) {
        if (f(rre)) {
            StickersView stickersView = this.x0;
            if (stickersView == null) {
                stickersView = null;
            }
            ValueAnimator ofInt = ValueAnimator.ofInt(new int[]{stickersView.getTop(), getStateOffset()});
            ofInt.setDuration(250);
            ofInt.addUpdateListener(new z00(25, (Object) this));
            ofInt.addListener(new z6(14, (Object) this));
            this.y = true;
            ofInt.start();
        }
    }

    public final boolean f(rre rre) {
        rre rre2 = this.o;
        if (rre == rre2) {
            return false;
        }
        this.v = rre2;
        this.o = rre;
        rre rre3 = rre.a;
        setEnabled(rre != rre3);
        qre qre = this.v0;
        if (qre != null) {
            rre rre4 = this.v;
            boolean z2 = this.c.a == 1;
            j4a j4a = (j4a) qre;
            z68.c("StickersView", "onStickerPanelStateChanged: %s => %s ", rre4, rre);
            rre rre5 = rre.c;
            View view = j4a.v;
            s3a s3a = j4a.o;
            View view2 = j4a.w;
            if (rre == rre5) {
                j4a.x0.setTabsVisible(true);
                if (view != null) {
                    view.setVisibility(4);
                }
                j4a.c0();
                j4a.y0.m(0);
                if (view2 != null) {
                    view2.setVisibility(4);
                }
                j4a.N(new pv1(6, (Object) rre4, (Object) z2 ? s3a == null ? "" : s3a.e0() : null));
                j4a.x0.setState(2);
            } else {
                j4a.x0.setState(1);
            }
            if (rre4 == rre5) {
                j4a.c0();
                j4a.y0.m(8);
                if (!(view2 == null || s3a == null || !s3a.g0())) {
                    view2.setVisibility(0);
                }
                if (view != null) {
                    view.setVisibility(0);
                }
            }
            if ((rre == rre3 || rre == rre.b) && s3a != null) {
                ((View) s3a.c).setVisibility(0);
            }
            rre rre6 = rre.b;
            Set<a2a> set = (Set) j4a.a;
            if (rre == rre6) {
                j4a.x0.setTabsVisible(false);
                for (a2a a2a : set) {
                    a2a.v.a.getClass();
                }
            }
            if (rre == rre6 && rre4 == rre3) {
                ((nd) j4a.Y.b).e("STICKERS_SUGGEST_OPEN");
            }
            if (rre == rre3) {
                for (a2a a2a2 : set) {
                    a2a2.v.a.getClass();
                }
            }
            j4a.x0.setSearchHintVisible(false);
        }
        return true;
    }

    public final rre getState() {
        return this.o;
    }

    public final void onFinishInflate() {
        super.onFinishInflate();
        this.x0 = (StickersView) findViewById(lic.view_stickers);
        bringChildToFront(findViewById(this.y0));
    }

    /* JADX WARNING: Code restructure failed: missing block: B:18:0x0052, code lost:
        if (r0 == r4) goto L_0x0054;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:5:0x001e, code lost:
        if (((java.lang.Boolean) r0.x.get()).booleanValue() == false) goto L_0x0020;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final boolean onInterceptTouchEvent(android.view.MotionEvent r9) {
        /*
            r8 = this;
            qre r0 = r8.v0
            r1 = 0
            if (r0 == 0) goto L_0x0020
            j4a r0 = (defpackage.j4a) r0
            ru.ok.messages.stickers.widgets.StickerSlideRelativeLayout r2 = r0.w0
            rre r2 = r2.getState()
            rre r3 = defpackage.rre.c
            if (r2 != r3) goto L_0x0012
            goto L_0x0020
        L_0x0012:
            u2f r0 = r0.x
            java.lang.Object r0 = r0.get()
            java.lang.Boolean r0 = (java.lang.Boolean) r0
            boolean r0 = r0.booleanValue()
            if (r0 != 0) goto L_0x0026
        L_0x0020:
            boolean r0 = r8.isEnabled()
            if (r0 != 0) goto L_0x0027
        L_0x0026:
            return r1
        L_0x0027:
            float r0 = r9.getX()
            int r0 = (int) r0
            float r2 = r9.getY()
            int r2 = (int) r2
            kag r3 = r8.c
            android.view.View r0 = r3.i(r0, r2)
            int r2 = r9.getAction()
            r4 = 0
            r5 = 1
            if (r2 != 0) goto L_0x0065
            pre r1 = r8.w0
            if (r1 == 0) goto L_0x004c
            s3a r1 = (defpackage.s3a) r1
            java.lang.Object r1 = r1.c
            android.view.View r1 = (android.view.View) r1
            if (r1 != r0) goto L_0x004c
            goto L_0x0054
        L_0x004c:
            ru.ok.messages.stickers.widgets.StickersView r1 = r8.x0
            if (r1 != 0) goto L_0x0051
            goto L_0x0052
        L_0x0051:
            r4 = r1
        L_0x0052:
            if (r0 != r4) goto L_0x005b
        L_0x0054:
            float r0 = r9.getY()
            int r0 = (int) r0
            r8.w = r0
        L_0x005b:
            rre r0 = r8.o
            rre r1 = defpackage.rre.c
            if (r0 == r1) goto L_0x00e5
            r8.x = r5
            goto L_0x00e5
        L_0x0065:
            int r0 = r9.getAction()
            r2 = 2
            if (r0 != r2) goto L_0x00e0
            int r0 = r8.w
            if (r0 <= 0) goto L_0x0086
            rre r2 = r8.o
            rre r6 = defpackage.rre.c
            if (r2 != r6) goto L_0x0086
            float r0 = (float) r0
            float r2 = r9.getY()
            int r0 = (r0 > r2 ? 1 : (r0 == r2 ? 0 : -1))
            if (r0 <= 0) goto L_0x0086
            float r0 = r9.getY()
            int r0 = (int) r0
            r8.w = r0
        L_0x0086:
            int r0 = r8.w
            if (r0 <= 0) goto L_0x00e5
            float r0 = (float) r0
            float r2 = r9.getY()
            float r0 = r0 - r2
            float r0 = java.lang.Math.abs(r0)
            int r2 = r8.getGutterSize()
            float r2 = (float) r2
            int r0 = (r0 > r2 ? 1 : (r0 == r2 ? 0 : -1))
            if (r0 <= 0) goto L_0x009f
            r0 = r5
            goto L_0x00a0
        L_0x009f:
            r0 = r1
        L_0x00a0:
            rre r2 = r8.o
            rre r6 = defpackage.rre.c
            if (r2 != r6) goto L_0x00ca
            ru.ok.messages.stickers.widgets.StickersView r2 = r8.x0
            if (r2 != 0) goto L_0x00ab
            r2 = r4
        L_0x00ab:
            java.util.ArrayList r6 = r2.z0
            androidx.viewpager2.widget.ViewPager2 r7 = r2.o
            int r7 = r7.getCurrentItem()
            java.lang.Object r6 = r6.get(r7)
            ose r6 = (defpackage.ose) r6
            rse r2 = r2.v
            c0 r2 = r2.E(r6)
            if (r2 != 0) goto L_0x00c2
            goto L_0x00ca
        L_0x00c2:
            int r2 = r2.getVerticalOffset()
            if (r2 != 0) goto L_0x00c9
            goto L_0x00ca
        L_0x00c9:
            r0 = r1
        L_0x00ca:
            if (r0 == 0) goto L_0x00e5
            android.view.View r0 = r3.r
            if (r0 != 0) goto L_0x00dd
            ru.ok.messages.stickers.widgets.StickersView r0 = r8.x0
            if (r0 != 0) goto L_0x00d5
            goto L_0x00d6
        L_0x00d5:
            r4 = r0
        L_0x00d6:
            int r9 = r9.getPointerId(r1)
            r3.c(r4, r9)
        L_0x00dd:
            r8.x = r5
            return r5
        L_0x00e0:
            r0 = -1
            r8.w = r0
            r8.x = r1
        L_0x00e5:
            boolean r8 = r3.q(r9)
            return r8
        */
        throw new UnsupportedOperationException("Method not decompiled: ru.ok.messages.stickers.widgets.StickerSlideRelativeLayout.onInterceptTouchEvent(android.view.MotionEvent):boolean");
    }

    public final void onLayout(boolean z2, int i, int i2, int i3, int i4) {
        int i5;
        kag kag = this.c;
        if (z2 && kag.a == 2) {
            kag.a();
        }
        if (!this.y || z2) {
            StickersView stickersView = null;
            if (kag.a == 1) {
                StickersView stickersView2 = this.x0;
                if (stickersView2 == null) {
                    stickersView2 = null;
                }
                i5 = stickersView2.getTop();
            } else {
                i5 = 0;
            }
            super.onLayout(z2, i, i2, i3, i4);
            StickersView stickersView3 = this.x0;
            if (stickersView3 == null) {
                stickersView3 = null;
            }
            if (stickersView3.getVisibility() != 8) {
                StickersView stickersView4 = this.x0;
                StickersView stickersView5 = stickersView4 == null ? null : stickersView4;
                if (stickersView4 == null) {
                    stickersView4 = null;
                }
                int left = stickersView4.getLeft();
                StickersView stickersView6 = this.x0;
                if (stickersView6 == null) {
                    stickersView6 = null;
                }
                int top = stickersView6.getTop();
                StickersView stickersView7 = this.x0;
                if (stickersView7 == null) {
                    stickersView7 = null;
                }
                int right = stickersView7.getRight();
                StickersView stickersView8 = this.x0;
                if (stickersView8 == null) {
                    stickersView8 = null;
                }
                int top2 = stickersView8.getTop();
                StickersView stickersView9 = this.x0;
                if (stickersView9 == null) {
                    stickersView9 = null;
                }
                int measuredHeight = stickersView9.getMeasuredHeight() + top2;
                StickersView stickersView10 = this.x0;
                if (stickersView10 == null) {
                    stickersView10 = null;
                }
                stickersView5.layout(left, top, right, stickersView10.getPullerlHeight() + measuredHeight);
                if (i5 == 0) {
                    StickersView stickersView11 = this.x0;
                    if (stickersView11 == null) {
                        stickersView11 = null;
                    }
                    stickersView11.offsetTopAndBottom(getStateOffset());
                } else {
                    StickersView stickersView12 = this.x0;
                    if (stickersView12 == null) {
                        stickersView12 = null;
                    }
                    stickersView12.offsetTopAndBottom(i5);
                }
                if (this.o == rre.a && kag.a == 0) {
                    StickersView stickersView13 = this.x0;
                    if (stickersView13 != null) {
                        stickersView = stickersView13;
                    }
                    stickersView.setListVisible(false);
                    return;
                }
                StickersView stickersView14 = this.x0;
                if (stickersView14 != null) {
                    stickersView = stickersView14;
                }
                stickersView.setListVisible(true);
            }
        }
    }

    public final void onMeasure(int i, int i2) {
        super.onMeasure(i, i2);
        StickersView stickersView = this.x0;
        StickersView stickersView2 = null;
        StickersView stickersView3 = stickersView == null ? null : stickersView;
        if (stickersView == null) {
            stickersView = null;
        }
        int makeMeasureSpec = View.MeasureSpec.makeMeasureSpec(stickersView.getMeasuredWidth(), 1073741824);
        StickersView stickersView4 = this.x0;
        if (stickersView4 == null) {
            stickersView4 = null;
        }
        int measuredHeight = stickersView4.getMeasuredHeight();
        StickersView stickersView5 = this.x0;
        if (stickersView5 != null) {
            stickersView2 = stickersView5;
        }
        stickersView3.measure(makeMeasureSpec, View.MeasureSpec.makeMeasureSpec(stickersView2.getPullerlHeight() + measuredHeight, 1073741824));
    }

    public final boolean onTouchEvent(MotionEvent motionEvent) {
        this.c.k(motionEvent);
        return true;
    }

    public final void requestDisallowInterceptTouchEvent(boolean z2) {
        int i;
        if (this.o != rre.b && (i = this.c.a) != 2 && i != 1) {
            super.requestDisallowInterceptTouchEvent(z2);
            if (z2) {
                this.w = -1;
            }
        }
    }

    public final void setBottomView(pre pre) {
        this.w0 = pre;
    }

    public final void setListener(qre qre) {
        this.v0 = qre;
    }

    public final void setShowSuggest(boolean z2) {
        this.z = z2;
    }
}
