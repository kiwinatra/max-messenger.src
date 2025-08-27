package defpackage;

import android.animation.Animator;
import android.animation.AnimatorSet;
import android.animation.ObjectAnimator;
import android.animation.ValueAnimator;
import android.content.Context;
import android.graphics.PointF;
import android.graphics.RectF;
import android.util.AttributeSet;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewStub;
import android.view.animation.DecelerateInterpolator;
import android.widget.Space;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import androidx.recyclerview.widget.b;
import java.util.List;
import kotlin.KotlinVersion;
import kotlin.Lazy;
import kotlin.LazyKt;
import kotlin.LazyThreadSafetyMode;
import kotlin.Unit;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Ref;
import kotlin.math.MathKt;
import kotlin.uuid.Uuid;

/* renamed from: rk1  reason: default package */
public final class rk1 extends ConstraintLayout implements uy3, oi1, mi1, kmb {
    public final tm1 E0;
    public final Lazy F0 = oh1.a.c();
    public final Lazy G0;
    public b H0;
    public final Lazy I0;
    public final Lazy J0;
    public final Lazy K0;
    public final Lazy L0;
    public PointF M0;
    public final ViewStub N0;
    public final ViewStub O0;
    public p6g P0;
    public vy3 Q0;
    public final Lazy R0;
    public lk1 S0;
    public gd8 T0;
    public v4b U0;
    public boolean V0;
    public pk1 W0;
    public nmb X0;

    public rk1(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        nk1 nk1 = new nk1(this, 4);
        LazyThreadSafetyMode lazyThreadSafetyMode = LazyThreadSafetyMode.NONE;
        this.G0 = LazyKt.lazy(lazyThreadSafetyMode, nk1);
        this.I0 = LazyKt.lazy(lazyThreadSafetyMode, new ok1(context, this, 0));
        this.J0 = LazyKt.lazy(lazyThreadSafetyMode, new ok1(context, this, 1));
        this.K0 = LazyKt.lazy(lazyThreadSafetyMode, new v4(context, 10));
        this.L0 = LazyKt.lazy(lazyThreadSafetyMode, new v4(context, 11));
        this.R0 = LazyKt.lazy(lazyThreadSafetyMode, new lj1(2));
        setLayoutParams(new fj3(-1, -1));
        tm1 tm1 = new tm1(context, (AttributeSet) null);
        tm1.setId(kgc.call_user_full_avatar);
        tm1.setVideoLayoutUpdatesControllerProvider(new nk1(this, 5));
        this.E0 = tm1;
        ViewStub viewStub = new ViewStub(context);
        viewStub.setId(kgc.call_speaker_opponents_view);
        this.N0 = viewStub;
        ViewStub viewStub2 = new ViewStub(context);
        viewStub2.setId(qqa.Z0);
        this.O0 = viewStub2;
        addView(tm1, -1, -1);
        addView(viewStub2);
        addView(viewStub);
        addView(getBottomSpaceView());
        addView(getTopSpaceView());
        pj3 h = ct.h(this);
        int id = getTopSpaceView().getId();
        h.e(id, 3, 0, 3);
        h.e(id, 6, 0, 6);
        h.e(id, 7, 0, 7);
        int id2 = viewStub2.getId();
        h.e(id2, 7, 0, 7);
        tr1.u((float) 16, vo4.c().getDisplayMetrics().density, new ila(h, 7, id2, 4));
        h.e(id2, 4, 0, 4);
        int id3 = tm1.getId();
        h.e(id3, 3, 0, 3);
        h.e(id3, 4, 0, 4);
        h.e(id3, 6, 0, 6);
        h.e(id3, 7, 0, 7);
        int id4 = viewStub.getId();
        h.e(id4, 4, getBottomSpaceView().getId(), 3);
        tr1.u((float) 4, vo4.c().getDisplayMetrics().density, new ila(h, 4, id4, 4));
        h.e(id4, 6, 0, 6);
        h.e(id4, 7, 0, 7);
        int id5 = getBottomSpaceView().getId();
        h.e(id5, 4, 0, 4);
        h.e(id5, 6, 0, 6);
        h.e(id5, 7, 0, 7);
        h.a(this);
    }

    public static Unit L(rk1 rk1, gd8 gd8) {
        rk1.setMainSpeaker(gd8);
        return Unit.INSTANCE;
    }

    public static RecyclerView M(Context context, rk1 rk1) {
        RecyclerView recyclerView = new RecyclerView(context, (AttributeSet) null);
        recyclerView.setId(kgc.call_speaker_opponents_view);
        recyclerView.setAdapter(rk1.getOpponentsAdapter());
        recyclerView.setLayoutManager(new LinearLayoutManager(0, false));
        recyclerView.j(new w51(MathKt.roundToInt(((float) 4) * vo4.c().getDisplayMetrics().density), 1));
        recyclerView.setLayoutParams(new fj3(-1, -2));
        b bVar = rk1.H0;
        if (bVar != null) {
            recyclerView.setRecycledViewPool(bVar);
        }
        return recyclerView;
    }

    public static Unit N(boolean z, rk1 rk1, List list) {
        if (z) {
            rk1.getOpponentsAdapter().G(list);
        } else {
            rk1.getOpponentsView().post(new c(18, rk1, list));
        }
        return Unit.INSTANCE;
    }

    public static void O(rk1 rk1, List list) {
        rk1.getOpponentsAdapter().G(list);
    }

    public static Unit P(rk1 rk1) {
        rk1.q(rk1.getMarginTop());
        rk1.m(rk1.getMarginBottom());
        return Unit.INSTANCE;
    }

    private final Space getBottomSpaceView() {
        return (Space) this.L0.getValue();
    }

    private final rf1 getFakePipView() {
        return (rf1) this.J0.getValue();
    }

    /* JADX WARNING: Code restructure failed: missing block: B:2:0x0006, code lost:
        r1 = ((defpackage.zy3) r1).k;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private final defpackage.ty3 getMarginBottom() {
        /*
            r1 = this;
            ty3 r0 = defpackage.ty3.d
            vy3 r1 = r1.Q0
            if (r1 == 0) goto L_0x000e
            zy3 r1 = (defpackage.zy3) r1
            ty3 r1 = r1.k
            if (r1 != 0) goto L_0x000d
            goto L_0x000e
        L_0x000d:
            r0 = r1
        L_0x000e:
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.rk1.getMarginBottom():ty3");
    }

    /* JADX WARNING: Code restructure failed: missing block: B:2:0x0006, code lost:
        r1 = ((defpackage.zy3) r1).j;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private final defpackage.ty3 getMarginTop() {
        /*
            r1 = this;
            ty3 r0 = defpackage.ty3.d
            vy3 r1 = r1.Q0
            if (r1 == 0) goto L_0x000e
            zy3 r1 = (defpackage.zy3) r1
            ty3 r1 = r1.j
            if (r1 != 0) goto L_0x000d
            goto L_0x000e
        L_0x000d:
            r0 = r1
        L_0x000e:
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.rk1.getMarginTop():ty3");
    }

    private final wd1 getOpponentsAdapter() {
        return (wd1) this.G0.getValue();
    }

    private final RecyclerView getOpponentsView() {
        return (RecyclerView) this.I0.getValue();
    }

    private final qmb getPipAnimation() {
        return (qmb) this.R0.getValue();
    }

    private final b91 getPipPositionMediator() {
        return (b91) this.F0.getValue();
    }

    private final Space getTopSpaceView() {
        return (Space) this.K0.getValue();
    }

    private final void setMainSpeaker(gd8 gd8) {
        ze1 ze1;
        lk1 lk1;
        gd8 gd82 = this.T0;
        boolean z = true;
        boolean z2 = !Intrinsics.areEqual((Object) gd82 != null ? gd82.g : null, (Object) gd8 != null ? gd8.g : null);
        this.T0 = gd8;
        qm1 qm1 = gd8 == null ? qm1.c : !gd8.e ? qm1.b : qm1.a;
        tm1 tm1 = this.E0;
        tm1.setBackgroundState(qm1);
        boolean z3 = false;
        boolean z4 = gd8 != null ? gd8.f : false;
        if (gd8 == null || !gd8.e) {
            z = false;
        }
        if (Intrinsics.areEqual((Object) tm1.V0, (Object) Boolean.valueOf(z4)) || !y7e.F(tm1.E0)) {
            tm1.V0 = Boolean.valueOf(z4);
        } else {
            tm1.V0 = Boolean.valueOf(z4);
            if (z) {
                tm1.c0(z4 ? Uuid.SIZE_BITS : KotlinVersion.MAX_COMPONENT_VALUE, false);
            }
        }
        tm1.setAvatar(gd8 != null ? gd8.a : null);
        if (gd8 != null) {
            z3 = gd8.d;
        }
        tm1.Y(z3);
        tm1.d0(gd8 != null ? gd8.g : null);
        tm1.Z(gd8 != null ? gd8.j : null, gd8 != null ? gd8.k : null);
        if (gd8 == null || (ze1 = gd8.c) == null) {
            ze1 = ze1.c;
        }
        tm1.setParticipantId(ze1);
        if (z2 && (lk1 = this.S0) != null) {
            o0g o0g = gd8 != null ? gd8.g : null;
            mk1 mk1 = (mk1) lk1;
            if (!Intrinsics.areEqual((Object) mk1.b, (Object) o0g)) {
                mk1.b = o0g;
                for (kk1 B : mk1.a) {
                    B.B();
                }
            }
        }
        U(this.V0, (Function1) null);
    }

    public final void C(long j, List list, boolean z) {
        this.E0.C(j, list, z);
    }

    public final void Q(rf1 rf1, PointF pointF) {
        PointF y = kne.y(rf1.getContext());
        if (getMarginBottom().b() == 0) {
            if (pointF == null) {
                pointF = y;
            }
            this.M0 = pointF;
            return;
        }
        this.M0 = null;
        PointF pointF2 = new PointF(y.x, y.y - ((float) getMarginBottom().a));
        if (pointF != null) {
            if (!(pointF.x == c44.DEFAULT_ASPECT_RATIO || pointF.y == c44.DEFAULT_ASPECT_RATIO)) {
                if (pointF.y > pointF2.y) {
                    pointF = new PointF(pointF.x, pointF2.y);
                }
                rf1.setStartPosition(pointF);
            }
        }
        pointF = pointF2;
        rf1.setStartPosition(pointF);
    }

    public final void R(nmb nmb) {
        this.X0 = nmb;
        if (y7e.I(this.O0)) {
            getFakePipView().setBoundariesOffset(nmb);
        }
    }

    public final void S(gd8 gd8, v4b v4b) {
        boolean z;
        v4b v4b2 = this.U0;
        if (!(v4b2 == null || v4b == null)) {
            if (!Intrinsics.areEqual((Object) v4b2.c, (Object) v4b.c)) {
                z = true;
                if (y7e.I(this.O0) || !z) {
                    setMainSpeaker(gd8);
                    T(v4b);
                }
                T(v4b);
                qmb pipAnimation = getPipAnimation();
                rf1 fakePipView = getFakePipView();
                s2 s2Var = new s2(14, (Object) this, (Object) gd8);
                pipAnimation.getClass();
                tm1 tm1 = this.E0;
                sz0 sz0 = new sz0((Object) s2Var, (Object) pipAnimation, (Object) tm1, 8);
                RectF rectF = new RectF(tm1.getX(), tm1.getY(), tm1.getX() + ((float) tm1.getMeasuredWidth()), tm1.getY() + ((float) tm1.getMeasuredHeight()));
                RectF rectF2 = new RectF(fakePipView.getX(), fakePipView.getY(), fakePipView.getX() + ((float) fakePipView.getMeasuredWidth()), fakePipView.getY() + ((float) fakePipView.getMeasuredHeight()));
                float width = rectF2.width() / rectF.width();
                float height = rectF2.height() / rectF.height();
                tm1.setPivotX(rectF.top);
                tm1.setPivotY(rectF.left);
                AnimatorSet animatorSet = new AnimatorSet();
                ObjectAnimator ofFloat = ObjectAnimator.ofFloat(tm1, View.X, new float[]{rectF.left, rectF2.left});
                ObjectAnimator ofFloat2 = ObjectAnimator.ofFloat(tm1, View.Y, new float[]{rectF.top, rectF2.top});
                ObjectAnimator ofFloat3 = ObjectAnimator.ofFloat(tm1, View.SCALE_X, new float[]{1.0f, width});
                ObjectAnimator ofFloat4 = ObjectAnimator.ofFloat(tm1, View.SCALE_Y, new float[]{1.0f, height});
                ValueAnimator ofFloat5 = ValueAnimator.ofFloat(new float[]{0.0f, vo4.c().getDisplayMetrics().density * 16.0f});
                ofFloat5.addUpdateListener(new hg(tm1, 1));
                animatorSet.playTogether(new Animator[]{ofFloat, ofFloat2, ofFloat3, ofFloat4, ofFloat5, ObjectAnimator.ofFloat(fakePipView, View.ALPHA, new float[]{1.0f, c44.DEFAULT_ASPECT_RATIO})});
                animatorSet.setDuration(200);
                animatorSet.setInterpolator(new DecelerateInterpolator());
                animatorSet.addListener(new pmb(pipAnimation, tm1, fakePipView, rectF, sz0));
                animatorSet.start();
                return;
            }
        }
        z = false;
        if (y7e.I(this.O0)) {
        }
        setMainSpeaker(gd8);
        T(v4b);
    }

    public final void T(v4b v4b) {
        ViewStub viewStub = this.O0;
        if ((v4b != null || y7e.I(viewStub)) && !Intrinsics.areEqual((Object) this.U0, (Object) v4b)) {
            this.U0 = v4b;
            Ref.BooleanRef booleanRef = new Ref.BooleanRef();
            rf1 fakePipView = getFakePipView();
            if (!y7e.I(viewStub)) {
                ViewGroup viewGroup = (ViewGroup) viewStub.getParent();
                int indexOfChild = viewGroup.indexOfChild(viewStub);
                viewGroup.removeViewInLayout(viewStub);
                ViewGroup.LayoutParams layoutParams = viewStub.getLayoutParams();
                layoutParams.height = fakePipView.getLayoutParams().height;
                layoutParams.width = fakePipView.getLayoutParams().width;
                fakePipView.setId(viewStub.getId());
                viewGroup.addView(fakePipView, indexOfChild, layoutParams);
                booleanRef.element = true;
                rf1 fakePipView2 = getFakePipView();
                c91 c91 = (c91) getPipPositionMediator();
                c91.getClass();
                PointF pointF = c91.b;
                Q(fakePipView2, new PointF(pointF.x, pointF.y));
                nmb nmb = this.X0;
                if (nmb != null) {
                    getFakePipView().setBoundariesOffset(nmb);
                }
                Unit unit = Unit.INSTANCE;
            }
            if (v4b != null) {
                getFakePipView().d(v4b);
            }
            y7e.k(getFakePipView(), v4b != null, booleanRef.element ? 0 : 150, (Function1) null, 4);
        }
    }

    public final void U(boolean z, Function1 function1) {
        ty3 ty3;
        if (y7e.I(this.N0)) {
            vy3 vy3 = this.Q0;
            if (!(vy3 == null || (ty3 = ((zy3) vy3).k) == null || ty3.c)) {
                z = false;
            }
            y7e.k(getOpponentsView(), z, 0, function1, 2);
        }
    }

    public final void a(boolean z) {
        if (z) {
            this.E0.a(z);
        }
    }

    public final void e(RectF rectF, boolean z) {
        if (y7e.P(this, z)) {
            float f = rectF.left;
            tm1 tm1 = this.E0;
            tm1.setX(f);
            tm1.setY(rectF.top);
            tm1.setPivotX(c44.DEFAULT_ASPECT_RATIO);
            tm1.setPivotY(c44.DEFAULT_ASPECT_RATIO);
            tm1.setScaleX(rectF.width() / ((float) tm1.getWidth()));
            tm1.setScaleY(rectF.height() / ((float) tm1.getHeight()));
        }
    }

    public final void g(boolean z) {
        if (y7e.I(this.O0)) {
            rf1 fakePipView = getFakePipView();
            if (y7e.P(fakePipView, z) && getShouldScaleMainOpponent()) {
                fakePipView.setAlpha(c44.DEFAULT_ASPECT_RATIO);
            }
        }
    }

    /* JADX WARNING: Code restructure failed: missing block: B:2:0x0008, code lost:
        r3 = r0.g;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public boolean getShouldScaleMainOpponent() {
        /*
            r6 = this;
            gd8 r0 = r6.T0
            v4b r6 = r6.U0
            r1 = 0
            r2 = 1
            if (r0 == 0) goto L_0x0012
            o0g r3 = r0.g
            if (r3 == 0) goto L_0x0012
            boolean r3 = r3.c
            if (r3 != r2) goto L_0x0012
            r3 = r2
            goto L_0x0013
        L_0x0012:
            r3 = r1
        L_0x0013:
            if (r6 == 0) goto L_0x001f
            o0g r4 = r6.g
            if (r4 == 0) goto L_0x001f
            boolean r4 = r4.c
            if (r4 != r2) goto L_0x001f
            r4 = r2
            goto L_0x0020
        L_0x001f:
            r4 = r1
        L_0x0020:
            if (r0 == 0) goto L_0x002a
            boolean r5 = r0.h
            if (r5 != 0) goto L_0x002a
            if (r3 == 0) goto L_0x002a
        L_0x0028:
            r1 = r2
            goto L_0x0040
        L_0x002a:
            if (r6 == 0) goto L_0x0033
            boolean r5 = r6.i
            if (r5 != 0) goto L_0x0033
            if (r4 == 0) goto L_0x0033
            goto L_0x0040
        L_0x0033:
            if (r0 == 0) goto L_0x003c
            boolean r0 = r0.h
            if (r0 != r2) goto L_0x003c
            if (r3 == 0) goto L_0x003c
            goto L_0x0028
        L_0x003c:
            if (r6 == 0) goto L_0x0040
            boolean r6 = r6.i
        L_0x0040:
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.rk1.getShouldScaleMainOpponent():boolean");
    }

    public final void m(ty3 ty3) {
        kne.Q(getBottomSpaceView(), ty3.b());
        if (y7e.I(this.O0) && this.M0 != null) {
            Q(getFakePipView(), this.M0);
        }
    }

    public final void q(ty3 ty3) {
        kne.R(getTopSpaceView(), ty3.b());
    }

    public final void setCallSpeakerMediator(lk1 lk1) {
        this.S0 = lk1;
    }

    public final void setControlsMediator(vy3 vy3) {
        this.Q0 = vy3;
    }

    public final void setListener(pk1 pk1) {
        this.W0 = pk1;
        this.E0.setListener(pk1);
    }

    public final void setOpponents(List<y4b> list) {
        y4b y4b = (y4b) CollectionsKt.firstOrNull(list);
        List list2 = y4b != null ? y4b.c : null;
        if (list2 == null) {
            list2 = CollectionsKt.emptyList();
        }
        boolean isEmpty = list2.isEmpty();
        ViewStub viewStub = this.N0;
        if (!isEmpty || y7e.I(viewStub)) {
            y7e.C(viewStub, getOpponentsView(), new nk1(this, 0));
            boolean z = true;
            boolean z2 = !list2.isEmpty();
            if (getOpponentsView().getVisibility() != 0) {
                z = false;
            }
            this.V0 = z2;
            U(z2, new x91(z, this, list2, 1));
        }
    }

    public final void setOpponentsViewPool(b bVar) {
        if (y7e.I(this.N0)) {
            getOpponentsView().setRecycledViewPool(bVar);
        }
        this.H0 = bVar;
    }

    public final void setStatus(CharSequence charSequence) {
        this.E0.setStatus(charSequence);
    }

    public final void setTitle(CharSequence charSequence) {
        this.E0.setName(charSequence);
    }

    public final void setVideoLayoutUpdatesController(p6g p6g) {
        this.P0 = p6g;
    }

    public final List v(sy3 sy3, sy3 sy32) {
        List createListBuilder = CollectionsKt.createListBuilder();
        createListBuilder.add(h88.z(getTopSpaceView(), sy3, (sy3) null, 2));
        createListBuilder.add(h88.z(getBottomSpaceView(), (sy3) null, sy32, 1));
        if (y7e.I(this.N0)) {
            createListBuilder.add(h88.y(getOpponentsView(), sy32.a));
        }
        return CollectionsKt.build(createListBuilder);
    }

    public final void x(boolean z) {
        if (z) {
            tm1 tm1 = this.E0;
            tm1.x(z);
            tm1.setX(c44.DEFAULT_ASPECT_RATIO);
            tm1.setY(c44.DEFAULT_ASPECT_RATIO);
            tm1.setPivotX(c44.DEFAULT_ASPECT_RATIO);
            tm1.setPivotY(c44.DEFAULT_ASPECT_RATIO);
            tm1.setScaleX(1.0f);
            tm1.setScaleY(1.0f);
            if (y7e.I(this.O0)) {
                getFakePipView().setAlpha(1.0f);
            }
        }
    }

    public final void y(long j, List list, boolean z) {
        this.E0.y(j, list, z);
    }
}
