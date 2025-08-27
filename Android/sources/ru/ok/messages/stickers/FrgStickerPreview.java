package ru.ok.messages.stickers;

import android.content.Context;
import android.content.Intent;
import android.graphics.PorterDuff;
import android.graphics.Typeface;
import android.os.Bundle;
import android.os.Parcelable;
import android.text.TextUtils;
import android.view.KeyEvent;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.ImageButton;
import android.widget.ImageView;
import android.widget.ProgressBar;
import android.widget.Space;
import android.widget.TextView;
import android.widget.Toast;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.coordinatorlayout.widget.CoordinatorLayout;
import androidx.fragment.app.b;
import androidx.fragment.app.c;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.a;
import com.google.android.material.bottomsheet.BottomSheetBehavior;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.Locale;
import java.util.Set;
import java.util.concurrent.ConcurrentHashMap;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.internal.IntCompanionObject;
import kotlin.jvm.internal.StringCompanionObject;
import one.me.rlottie.RLottieImageViewUtils;
import org.apache.http.HttpStatus;
import ru.ok.messages.stickers.widgets.StickerView;
import ru.ok.messages.views.fragments.base.FrgBase;
import ru.ok.messages.views.widgets.RecyclerAutofitGridView;
import ru.ok.tamtam.stickers.lottie.KeyboardLottieAnimationView;

public class FrgStickerPreview extends FrgBase implements hh6, u65 {
    public ao1 A2;
    public View B1;
    public boolean B2;
    public ImageButton C1;
    public boolean C2;
    public StickerView D1;
    public boolean D2 = true;
    public ImageButton E1;
    public Button F1;
    public ImageButton G1;
    public ImageButton H1;
    public TextView I1;
    public ProgressBar J1;
    public ConstraintLayout K1;
    public BottomSheetBehavior L1;
    public View M1;
    public ImageView N1;
    public TextView O1;
    public TextView P1;
    public Button Q1;
    public RecyclerAutofitGridView R1;
    public gv S1;
    public d23 T1;
    public ConstraintLayout U1;
    public ImageView V1;
    public TextView W1;
    public ju8 X1;
    public ype Y1;
    public String Z1;
    public q13 a2;
    public long b2;
    public vqe c2;
    public ai5 d2;
    public jbf e2;
    public km3 f2;
    public boe g2;
    public boolean h2;
    public boolean i2;
    public int j2;
    public bqe k2;
    public boolean l2;
    public ao1 m2;
    public ao1 n2;
    public Toast o2;
    public or7 p2;
    public boolean q2;
    public d6a r2;
    public or7 s2;
    public or7 t2;
    public aqg u2;
    public ure v2;
    public or7 w2;
    public boe x2;
    public gb8 y2;
    public or7 z2;

    public final void A2(View view, Bundle bundle) {
        h6 h6Var = new h6(4, this);
        c Q12 = Q1();
        jv7 X12 = X1();
        ued ued = new ued(0, (Object) null, h6Var);
        ad6 ad6 = (ad6) Q12.m.remove("ScheduledSendPickerDialogFragment:ru.ok.messages.stickers.FrgStickerPreview:result");
        if (ad6 != null) {
            ad6.a.b(ad6.c);
        }
        Q12.g0("ScheduledSendPickerDialogFragment:ru.ok.messages.stickers.FrgStickerPreview:result", X12, new uq(8, ued));
    }

    public final boolean E1() {
        ure ure = this.v2;
        return (ure == null || ure.h == 0) ? false : true;
    }

    public final void J0() {
        Context O12 = O1();
        if (O12 != null) {
            v6.T(O12);
        }
    }

    public final String V2() {
        return null;
    }

    public final void b3(int i, int i3, Intent intent) {
        if (i == 101 && i3 == -1) {
            intent.getLongArrayExtra("ru.ok.tamtam.extra.CHAT_IDS");
            cl4 cl4 = (cl4) intent.getSerializableExtra("act:chat_picker:serial");
            intent.getStringExtra("ru.ok.tamtam.extra.DESCRIPTION");
            q13 q13 = this.a2;
            if (q13 != null) {
                boe boe = this.g2;
                String str = this.Z1;
                boe boe2 = this.x2;
                q13.m(new m7f(boe, str, (boe2 == null || boe == null || boe2.Z == boe.Z) ? this.Y1 : ype.SIMILAR, this.q2 ? xpe.a : this.C2 ? xpe.b : this.B2 ? xpe.c : xpe.o), cl4);
            }
        }
    }

    public final boolean d3() {
        ConstraintLayout constraintLayout = this.K1;
        if (constraintLayout == null || constraintLayout.getVisibility() != 0 || this.L1.L == 4 || this.g2.Z <= 0) {
            return false;
        }
        X2();
        if (this.J1.getVisibility() == 0) {
            return false;
        }
        this.L1.K(4);
        return true;
    }

    public final void h3(goe goe) {
        int ordinal = goe.ordinal();
        if (ordinal == 1) {
            ((m48) this.X1).u(1.0f);
        } else if (ordinal == 2) {
            ((m48) this.X1).w();
        }
        this.D1.p(this.g2);
        StickerView stickerView = this.D1;
        stickerView.E0 = true;
        stickerView.x(true);
        d23 d23 = this.T1;
        ((tq7) d23.v).b = this.g2.a();
        d23.t();
        jbd.c(this.p2);
        sjd sjd = (sjd) tr1.h((qra) ((id3) this.p1.b));
        vi5 vi5 = (vi5) sjd.getAccessor().g(vi5.class);
        long j = this.g2.a;
        vi5.getClass();
        c10 c10 = new c10(j, 24);
        om0 om0 = vi5.j;
        om0.getClass();
        yia yia = new yia(om0, c10, 1);
        jbf z = sjd.z();
        z.getClass();
        lja s = yia.x(((kbf) z).a()).s(((kbf) sjd.z()).c());
        or7 or7 = new or7(new ii6(this, 0), new ii6(this, 4), m58.e);
        s.a(or7);
        this.p2 = or7;
        moe x = this.q1.x();
        boe boe = this.g2;
        x.getClass();
        if (!boe.Y) {
            long j3 = boe.a;
            if (x.c(j3) == null || boe.y0 != 2) {
                ConcurrentHashMap concurrentHashMap = x.c;
                Long l = (Long) concurrentHashMap.get(Long.valueOf(j3));
                long currentTimeMillis = System.currentTimeMillis();
                if (l == null || currentTimeMillis - l.longValue() >= 60000) {
                    z68.c("moe", "Call invalidate sticker", new Object[0]);
                    concurrentHashMap.put(Long.valueOf(j3), Long.valueOf(System.currentTimeMillis()));
                    ((rl) x.g.get()).c(2, Collections.singletonList(Long.valueOf(j3)));
                }
            }
        }
        r3();
    }

    /* JADX WARNING: type inference failed for: r0v6, types: [java.lang.Object, gb8] */
    public final void i2(Bundle bundle) {
        boe boe;
        super.i2(bundle);
        Bundle bundle2 = this.x;
        if (bundle2 != null) {
            String string = bundle2.getString("ru.ok.tamtam.extra.SEND_SOURCE");
            if (!TextUtils.isEmpty(string)) {
                this.r2 = new d6a(9, (Object) this.q1.c());
                ype.b.getClass();
                ype[] values = ype.values();
                int length = values.length;
                int i = 0;
                while (i < length) {
                    ype ype = values[i];
                    if (TextUtils.equals(ype.a, string)) {
                        this.Y1 = ype;
                        this.Z1 = bundle2.getString("ru.ok.tamtam.extra.SECTION");
                        this.b2 = bundle2.getLong("ru.ok.tamtam.extra.OPENED_FROM_CHAT_ID");
                        this.y2 = new Object();
                        this.D2 = bundle2.getBoolean("ru.ok.tamtam.extra.EXTRA_REGULAR_SENDING");
                        kpe kpe = (kpe) bundle2.getParcelable("ru.ok.tamtam.extra.INITIAL_STICKER");
                        if (kpe == null || (boe = kpe.a) == null) {
                            z68.f("ru.ok.messages.stickers.FrgStickerPreview", "Sticker can't be null", (Throwable) null);
                            q13 q13 = this.a2;
                            if (q13 != null) {
                                q13.i();
                                return;
                            }
                            return;
                        }
                        this.x2 = boe;
                        this.d2 = (ai5) this.q1.getAccessor().g(ai5.class);
                        this.e2 = this.q1.z();
                        this.f2 = ((qra) ((id3) this.p1.b)).m();
                        this.u2 = new aqg((bud) ((ltb) this.q1.u()).b, (FrgBase) this);
                        if (j3()) {
                            this.c2 = (vqe) this.q1.getAccessor().g(vqe.class);
                            return;
                        } else if (!i3()) {
                            this.v2 = (ure) W2(ure.class.getName(), new ii6(this, 12));
                            return;
                        } else {
                            return;
                        }
                    } else {
                        i++;
                    }
                }
                StringCompanionObject stringCompanionObject = StringCompanionObject.INSTANCE;
                throw new IllegalArgumentException(String.format(Locale.ENGLISH, "No such value %s for StickerSendSource", Arrays.copyOf(new Object[]{string}, 1)));
            }
            throw new IllegalArgumentException("You should provide EXTRA_SEND_SOURCE");
        }
        throw new IllegalArgumentException("Arguments can't be null");
    }

    public final boolean i3() {
        boe boe = this.x2;
        return boe != null && boe.Y;
    }

    public final boolean j3() {
        boe boe = this.x2;
        return boe != null && boe.Z > 0;
    }

    public final View k2(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        boe boe;
        Bundle bundle2 = bundle;
        if (this.x2 == null) {
            return new Space(O1());
        }
        Bundle bundle3 = this.x;
        if (bundle3 != null) {
            CoordinatorLayout coordinatorLayout = (CoordinatorLayout) layoutInflater.inflate(ujc.frg_sticker_preview, viewGroup, false);
            coordinatorLayout.setOnClickListener(new t84((View.OnClickListener) new ji6(this, 0), 0));
            ConstraintLayout constraintLayout = (ConstraintLayout) coordinatorLayout.findViewById(lic.frg_sticker_preview__cl_bottom_sheet);
            this.K1 = constraintLayout;
            BottomSheetBehavior C = BottomSheetBehavior.C(constraintLayout);
            this.L1 = C;
            C.I(true);
            if (bundle2 == null) {
                this.g2 = this.x2;
                this.L1.K(5);
            } else {
                this.i2 = true;
                kpe kpe = (kpe) bundle2.getParcelable("ru.ok.tamtam.extra.ACTIVE_STICKER");
                if (kpe == null || (boe = kpe.a) == null) {
                    z68.f("ru.ok.messages.stickers.FrgStickerPreview", "Sticker can't be null", (Throwable) null);
                    q13 q13 = this.a2;
                    if (q13 != null) {
                        q13.i();
                    }
                    return new Space(O1());
                }
                this.g2 = boe;
                Parcelable parcelable = bundle2.getParcelable("ru.ok.tamtam.extra.BOTTOM_SHEET_STATE");
                if (parcelable != null) {
                    this.L1.r(this.K1, parcelable);
                    this.j2 = bundle2.getInt("ru.ok.tamtam.extra.RV_FIRST_VISIBLE_ITEM");
                } else {
                    throw new IllegalArgumentException("EXTRA_BOTTOM_SHEET_STATE can't be null");
                }
            }
            if (this.g2 == null) {
                q13 q132 = this.a2;
                if (q132 != null) {
                    q132.i();
                }
                return new Space(O1());
            }
            this.B1 = coordinatorLayout.findViewById(lic.frg_sticker_preview__cl_content);
            StickerView stickerView = (StickerView) coordinatorLayout.findViewById(lic.frg_sticker_preview__sticker);
            this.D1 = stickerView;
            stickerView.setUseMaxHeight(true);
            b M12 = M1();
            if (M12 instanceof ku8) {
                this.X1 = ((ku8) M12).p();
            } else {
                z68.c("ru.ok.messages.stickers.FrgStickerPreview", "Activity is not MediaPlayerControllerProvider. Create new controller", new Object[0]);
                mu8 t = ((qra) ((id3) this.p1.b)).t();
                nu8 nu8 = nu8.b;
                t.getClass();
                this.X1 = t.q(nu8, new z50(false, false, true), this);
            }
            this.D1.setStickerMediaPlayerController(this.X1);
            ImageButton imageButton = (ImageButton) coordinatorLayout.findViewById(lic.frg_sticker_preview__btn_close);
            this.C1 = imageButton;
            imageButton.setOnClickListener(new t84((View.OnClickListener) new ji6(this, 2), 0));
            ImageButton imageButton2 = (ImageButton) coordinatorLayout.findViewById(lic.frg_sticker_preview__ib_favorite);
            this.E1 = imageButton2;
            imageButton2.setOnClickListener(new t84((View.OnClickListener) new ji6(this, 3), 0));
            Button button = (Button) coordinatorLayout.findViewById(lic.frg_sticker_preview__btn_send);
            this.F1 = button;
            button.setText(this.D2 ? qad.a : qad.v8);
            this.F1.setOnClickListener(new t84((View.OnClickListener) new ji6(this, 4), 0));
            ImageButton imageButton3 = (ImageButton) coordinatorLayout.findViewById(lic.frg_sticker_preview__ib_forward);
            this.G1 = imageButton3;
            imageButton3.setOnClickListener(new t84((View.OnClickListener) new ji6(this, 5), 0));
            ImageButton imageButton4 = (ImageButton) coordinatorLayout.findViewById(lic.frg_sticker_preview__scheduled_send_button);
            this.H1 = imageButton4;
            ct.G(imageButton4, 300, new ji6(this, 6));
            this.I1 = (TextView) coordinatorLayout.findViewById(lic.frg_sticker_preview__tv_chat_title);
            this.I1.setText(this.q1.s().k.c(bundle3.getString("ru.ok.tamtam.extra.TITLE")));
            this.I1.setVisibility(this.Y1 == ype.SUGGEST ? 8 : 0);
            this.J1 = (ProgressBar) coordinatorLayout.findViewById(lic.frg_sticker_preview__pg_set);
            int i = ((qra) ((id3) this.p1.b)).C().a.a;
            View findViewById = coordinatorLayout.findViewById(lic.frg_sticker_preview__cl_set_header);
            this.M1 = findViewById;
            findViewById.setOnClickListener(new t84((View.OnClickListener) new ji6(this, 7), 0));
            this.N1 = (ImageView) coordinatorLayout.findViewById(lic.frg_sticker_preview__cl_iv_puller);
            this.O1 = (TextView) coordinatorLayout.findViewById(lic.frg_sticker_preview__tv_set_name);
            this.P1 = (TextView) coordinatorLayout.findViewById(lic.frg_sticker_preview__tv_set_description);
            Button button2 = (Button) coordinatorLayout.findViewById(lic.frg_sticker_preview__ib_set_add);
            this.Q1 = button2;
            button2.setOnClickListener(new t84((View.OnClickListener) new ji6(this, 8), 0));
            RecyclerAutofitGridView recyclerAutofitGridView = (RecyclerAutofitGridView) coordinatorLayout.findViewById(lic.frg_sticker_preview__rv_stickers);
            this.R1 = recyclerAutofitGridView;
            recyclerAutofitGridView.setThreshold(10);
            this.R1.setClipToPadding(false);
            this.R1.setHasFixedSize(true);
            this.R1.T0();
            this.R1.m(new k61(5, this));
            RecyclerAutofitGridView recyclerAutofitGridView2 = this.R1;
            this.m1.getClass();
            iq.q(recyclerAutofitGridView2, vo4.b((int) 69.0f));
            this.R1.setColumnWidth(i);
            gv gvVar = new gv(ew3.b(G2(), nad.E2), ise.a().a.a, cvg.s(this.r1, G2()), this.y2);
            this.S1 = gvVar;
            gvVar.Y = this;
            this.T1 = new d23(this.S1, this, ((kbf) ((qra) ((id3) this.p1.b)).H()).b(), ((kbf) ((qra) ((id3) this.p1.b)).H()).c());
            this.R1.setAdapter(this.S1);
            this.R1.setItemAnimator((yyc) null);
            boolean j3 = j3();
            dj6 dj6 = m58.e;
            if (!j3 && !i3()) {
                this.R1.setPager(this);
                this.R1.setProgressView(ujc.base_list_progress);
                this.O1.setAllCaps(true);
                this.O1.setText(qad.P9);
                this.O1.setTypeface(Typeface.DEFAULT);
                this.P1.setText("");
                iq.q(this.M1, this.m1.b);
                lja s = this.v2.g.s(((kbf) this.e2).c());
                or7 or7 = new or7(new ii6(this, 5), new ii6(this, 6), dj6);
                s.a(or7);
                this.w2 = or7;
            }
            this.Q1.setEnabled(false);
            ConstraintLayout constraintLayout2 = (ConstraintLayout) coordinatorLayout.findViewById(lic.frg_sticker_preview__cl_draw);
            this.U1 = constraintLayout2;
            constraintLayout2.setOnClickListener(new t84((View.OnClickListener) new ji6(this, 1), 0));
            this.V1 = (ImageView) coordinatorLayout.findViewById(lic.frg_sticker_preview__iv_draw);
            this.W1 = (TextView) coordinatorLayout.findViewById(lic.frg_sticker_preview__tv_draw);
            Context O12 = O1();
            if (O12 != null) {
                scf scf = this.r1;
                if (j3()) {
                    this.M1.setBackground(scf.e());
                }
                this.C1.setBackground(scf.d());
                ImageButton imageButton5 = this.C1;
                PorterDuff.Mode mode = PorterDuff.Mode.SRC_IN;
                int i3 = scf.m;
                imageButton5.setColorFilter(i3, mode);
                ImageButton imageButton6 = this.E1;
                int i4 = scf.J;
                iq.c(scf, imageButton6, 0, j4b.l0(0.3f, i4), -1, this.m1.F);
                iq.f(scf, this.F1, this.m1.D, i3, scf.l, 48);
                iq.c(scf, this.G1, 0, j4b.l0(0.3f, i4), -1, this.m1.F);
                iq.c(scf, this.H1, 0, j4b.l0(0.3f, i4), -1, this.m1.F);
                this.I1.setTextColor(i3);
                iq.b0(this.J1, i3);
                float f = (float) this.m1.d;
                this.K1.setBackground(i8b.P(Integer.valueOf(scf.n), (Integer) null, (Integer) null, new float[]{f, f, f, f, 0.0f, 0.0f, 0.0f, 0.0f}));
                ImageView imageView = this.N1;
                int i5 = scf.N;
                imageView.setColorFilter(i5);
                if (j3()) {
                    this.O1.setTextColor(this.r1.G);
                } else {
                    this.O1.setTextColor(this.r1.N);
                }
                this.P1.setTextColor(i5);
                this.S1.K(cvg.s(scf, O12));
                q3();
                this.V1.setColorFilter(i3, mode);
                this.W1.setTextColor(i3);
                this.U1.setBackground(scf.e());
            }
            s3();
            this.E1.setEnabled(false);
            h3((goe) F2().getParcelable("ru.ok.tamtam.extra.NEED_TO_PLAY_SOUND"));
            if (i3()) {
                k3();
            } else if (j3()) {
                l3();
            } else {
                o3();
            }
            yia yia = new yia(((gvc) this.q1.getAccessor().g(gvc.class)).b().a(CollectionsKt.listOf(cvc.STICKER)), p9a.x, 3);
            jbf jbf = this.e2;
            jbf.getClass();
            lja s3 = new yia(yia.x(((kbf) jbf).a()), new ii6(this, 1), 3).s(((kbf) this.e2).c());
            or7 or72 = new or7(new ii6(this, 2), new ii6(this, 3), dj6);
            s3.a(or72);
            this.z2 = or72;
            return coordinatorLayout;
        }
        throw new IllegalArgumentException("Arguments can't be null");
    }

    public final void k3() {
        this.J1.setVisibility(8);
    }

    public final void l2() {
        super.l2();
        if (this.v0) {
            String name = ure.class.getName();
            if (M1() instanceof m5) {
                ((m5) M1()).y0.remove(name);
            } else {
                throw new IllegalStateException("Activity must be a child ActBase");
            }
        }
        Set<eb8> set = this.y2.a;
        if (set != null) {
            for (eb8 eb8 : set) {
                KeyboardLottieAnimationView keyboardLottieAnimationView = (KeyboardLottieAnimationView) eb8;
                keyboardLottieAnimationView.getClass();
                RLottieImageViewUtils.release(keyboardLottieAnimationView);
                keyboardLottieAnimationView.x = null;
            }
        }
    }

    public final void l3() {
        if (this.g2 != null) {
            if (j3() && this.c2 == null) {
                this.c2 = (vqe) this.q1.getAccessor().g(vqe.class);
            }
            if (this.c2 != null) {
                jbd.c(this.s2);
                jbd.c(this.t2);
                jbd.c(this.z2);
                long j = this.g2.Z;
                if (j <= 0) {
                    k3();
                    return;
                }
                pka b = this.c2.b(j);
                jbf jbf = this.e2;
                jbf.getClass();
                lja s = b.x(((kbf) jbf).a()).m(new ii6(this, 8), IntCompanionObject.MAX_VALUE).s(((kbf) this.e2).c());
                or7 or7 = new or7(new ii6(this, 10), new ii6(this, 11), m58.e);
                s.a(or7);
                this.s2 = or7;
            }
        }
    }

    public final void m2() {
        super.m2();
        jbd.c(this.s2);
        jbd.c(this.w2);
        jbd.c(this.p2);
        jbd.c(this.t2);
        jbd.c(this.m2);
        jbd.c(this.n2);
        jbd.c(this.z2);
        jbd.c(this.A2);
        d23 d23 = this.T1;
        if (d23 != null) {
            o54.k((ao1) d23.w);
        }
    }

    public final void m3() {
        a32 G;
        if (this.b2 > 0 && (G = ((qra) ((id3) this.p1.b)).l().G(this.b2)) != null) {
            m72 m72 = G.b;
            if (m72.a != 0) {
                d6b d6b = (d6b) this.q1.getAccessor().g(d6b.class);
                d6b.getClass();
                long j = m72.a;
                if (j != 0) {
                    d6b.f(j, b10.STICKER, 0);
                }
            }
        }
    }

    public final void n3(boe boe, goe goe) {
        boe boe2 = this.g2;
        if (boe2 == null || !boe2.a().equals(boe.a())) {
            this.g2 = boe;
            h3(goe);
            m3();
        }
    }

    public final void o3() {
        if (this.x2 != null) {
            if (!j3() && !i3() && this.v2 == null) {
                this.v2 = (ure) W2(ure.class.getName(), new ii6(this, 13));
            }
            ure ure = this.v2;
            if (ure != null) {
                ure.b();
            }
        }
    }

    @oye
    public void onEvent(sh3 sh3) {
        if (sh3.b == 1) {
            return;
        }
        if (this.o1) {
            StickerView stickerView = this.D1;
            if (stickerView != null && stickerView.getVisibility() == 0) {
                this.D1.x(true);
                return;
            }
            return;
        }
        ryg.S(this.s1, sh3, true);
    }

    public final void p3(cl4 cl4) {
        z68.c("ru.ok.messages.stickers.FrgStickerPreview", "sendSticker %s", cl4);
        if (this.b2 > 0) {
            q13 q13 = this.a2;
            if (q13 != null) {
                boe boe = this.g2;
                String str = this.Z1;
                boe boe2 = this.x2;
                q13.m(new m7f(boe, str, (boe2 == null || boe == null || boe2.Z == boe.Z) ? this.Y1 : ype.SIMILAR, this.q2 ? xpe.a : this.C2 ? xpe.b : this.B2 ? xpe.c : xpe.o), cl4);
                return;
            }
            return;
        }
        u5.T(this, (Bundle) null, HttpStatus.SC_SWITCHING_PROTOCOLS, cl4);
    }

    public final void q3() {
        bqe bqe;
        if (!j3() && !i3()) {
            this.Q1.setVisibility(8);
        } else if (this.g2.Z <= 0 || ((bqe = this.k2) != null && !bqe.i)) {
            this.Q1.setVisibility(0);
            scf scf = this.r1;
            if (this.l2) {
                iq.e(scf, this.Q1, this.m1.l, scf.J, scf.N);
                this.Q1.setText(qad.W1);
                return;
            }
            iq.e(scf, this.Q1, this.m1.l, scf.l, scf.m);
            this.Q1.setText(qad.c);
        } else {
            this.Q1.setVisibility(8);
        }
    }

    public final void r3() {
        bqe bqe;
        boe boe = this.g2;
        int i = 8;
        if (boe == null) {
            this.E1.setVisibility(8);
            this.F1.setVisibility(8);
            this.H1.setVisibility(8);
            this.G1.setVisibility(8);
        } else if (boe.Y) {
            this.E1.setVisibility(8);
            this.F1.setVisibility(0);
            this.G1.setVisibility(0);
            ImageButton imageButton = this.H1;
            if (!this.D2) {
                i = 0;
            }
            imageButton.setVisibility(i);
        } else if (boe.X == 1) {
            this.E1.setVisibility(8);
            this.F1.setVisibility(8);
            this.H1.setVisibility(8);
            this.G1.setVisibility(8);
        } else if (!j3() || ((bqe = this.k2) != null && !bqe.i)) {
            this.E1.setVisibility(0);
            this.F1.setVisibility(0);
            this.G1.setVisibility(0);
            ImageButton imageButton2 = this.H1;
            if (!this.D2) {
                i = 0;
            }
            imageButton2.setVisibility(i);
        } else {
            this.E1.setVisibility(8);
            this.F1.setVisibility(8);
            this.H1.setVisibility(8);
            this.G1.setVisibility(8);
        }
    }

    public final void s3() {
        if (this.q2) {
            this.E1.setImageResource(nad.i0);
        } else {
            this.E1.setImageResource(nad.h0);
        }
    }

    public final boolean t(int i, KeyEvent keyEvent) {
        return this.D1.t(i, keyEvent);
    }

    public final void t2() {
        super.t2();
        StickerView stickerView = this.D1;
        if (stickerView != null && stickerView.getVisibility() == 0) {
            StickerView stickerView2 = this.D1;
            stickerView2.E0 = false;
            if (!stickerView2.F0) {
                stickerView2.F0 = true;
                stickerView2.z.setVisibility(0);
                stickerView2.z();
                stickerView2.o();
            }
        }
        ((ib8) ((qra) ((id3) this.p1.b)).getAccessor().g(ib8.class)).a(this.y2);
    }

    public final void u1() {
        ure ure = this.v2;
        if (ure != null) {
            ure.b();
        }
    }

    public final void w2() {
        super.w2();
        StickerView stickerView = this.D1;
        if (stickerView != null && stickerView.getVisibility() == 0) {
            this.D1.x(true);
            this.D1.E0 = true;
        }
        ((ib8) ((qra) ((id3) this.p1.b)).getAccessor().g(ib8.class)).b(this.y2);
    }

    public final void x2(Bundle bundle) {
        super.x2(bundle);
        bundle.putParcelable("ru.ok.tamtam.extra.ACTIVE_STICKER", new kpe(this.g2));
        if (this.S0 instanceof CoordinatorLayout) {
            bundle.putParcelable("ru.ok.tamtam.extra.BOTTOM_SHEET_STATE", this.L1.s(this.K1));
            a layoutManager = this.R1.getLayoutManager();
            if (layoutManager instanceof LinearLayoutManager) {
                bundle.putInt("ru.ok.tamtam.extra.RV_FIRST_VISIBLE_ITEM", ((LinearLayoutManager) layoutManager).S0());
                return;
            }
            return;
        }
        throw new IllegalStateException("Root view should be CoordinatorLayout");
    }

    @oye
    public void onEvent(eu euVar) {
        boe c;
        if (!euVar.c.isEmpty()) {
            List list = euVar.c;
            int i = euVar.b;
            if (i == 2) {
                z68.c("ru.ok.messages.stickers.FrgStickerPreview", "Receive stickers update", new Object[0]);
                boe boe = this.x2;
                if (boe != null && list.contains(Long.valueOf(boe.a))) {
                    if (this.x2 != null) {
                        boe c3 = this.q1.x().c(this.x2.a);
                        if (c3 == null) {
                            z68.f("ru.ok.messages.stickers.FrgStickerPreview", "Initial sticker was deleted", (Throwable) null);
                            q13 q13 = this.a2;
                            if (q13 != null) {
                                q13.i();
                            }
                        } else if (c3.equals(this.x2)) {
                            z68.c("ru.ok.messages.stickers.FrgStickerPreview", "New sticker same as initial", new Object[0]);
                        } else {
                            z68.c("ru.ok.messages.stickers.FrgStickerPreview", "New sticker different from initial", new Object[0]);
                            long j = this.x2.Z;
                            long j3 = c3.Z;
                            if (j != j3) {
                                this.g2 = c3;
                                this.x2 = c3;
                                if (j3 > 0) {
                                    jbd.c(this.w2);
                                    this.R1.setPager((u65) null);
                                    this.O1.setAllCaps(false);
                                    this.O1.setTypeface(Typeface.SANS_SERIF);
                                    l3();
                                } else {
                                    jbd.c(this.s2);
                                    this.R1.setPager(this);
                                    this.R1.setProgressView(ujc.base_list_progress);
                                    this.O1.setAllCaps(true);
                                    TextView textView = this.O1;
                                    Typeface typeface = Typeface.DEFAULT;
                                    textView.setTypeface(typeface);
                                    q3();
                                    this.O1.setAllCaps(true);
                                    this.O1.setText(qad.P9);
                                    this.O1.setTypeface(typeface);
                                    this.P1.setText("");
                                    o3();
                                }
                                if (j3()) {
                                    this.O1.setTextColor(this.r1.G);
                                } else {
                                    this.O1.setTextColor(this.r1.N);
                                }
                            }
                        }
                    }
                    boe boe2 = this.g2;
                    if (boe2 != null) {
                        if (boe2.a == this.x2.a) {
                            h3(goe.a);
                            return;
                        }
                    }
                }
                boe boe3 = this.g2;
                if (boe3 == null || !list.contains(Long.valueOf(boe3.a))) {
                    bqe bqe = this.k2;
                    if (bqe != null) {
                        for (boe boe4 : bqe.h) {
                            if (list.contains(Long.valueOf(boe4.a)) && ((c = this.q1.x().c(this.g2.a)) == null || !c.equals(boe4))) {
                                z68.c("ru.ok.messages.stickers.FrgStickerPreview", "New stickers different from stickers from sticker set", new Object[0]);
                                l3();
                                return;
                            }
                        }
                    }
                } else {
                    boe c4 = this.q1.x().c(this.g2.a);
                    if (c4 == null) {
                        z68.f("ru.ok.messages.stickers.FrgStickerPreview", "Active sticker was deleted", (Throwable) null);
                        q13 q132 = this.a2;
                        if (q132 != null) {
                            q132.i();
                            return;
                        }
                        return;
                    } else if (c4.equals(this.g2)) {
                        z68.c("ru.ok.messages.stickers.FrgStickerPreview", "New sticker same as active", new Object[0]);
                        return;
                    } else {
                        z68.c("ru.ok.messages.stickers.FrgStickerPreview", "New sticker different from active", new Object[0]);
                        this.g2 = c4;
                        h3(goe.a);
                        return;
                    }
                }
            } else if (i == 3) {
                z68.c("ru.ok.messages.stickers.FrgStickerPreview", "Receive sticker sets update", new Object[0]);
                bqe bqe2 = this.k2;
                if (bqe2 != null && list.contains(Long.valueOf(bqe2.a))) {
                    z68.c("ru.ok.messages.stickers.FrgStickerPreview", "Have sticker set update", new Object[0]);
                    l3();
                    return;
                }
            }
            z68.c("ru.ok.messages.stickers.FrgStickerPreview", "Nothing to update", new Object[0]);
        }
    }
}
