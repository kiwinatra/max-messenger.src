package ru.ok.messages.calls.views;

import android.content.Context;
import android.graphics.drawable.Drawable;
import android.util.AttributeSet;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.ProgressBar;
import android.widget.TextView;
import androidx.constraintlayout.widget.ConstraintLayout;
import java.util.Objects;
import java.util.concurrent.TimeUnit;

public class CallLinkCreatedView extends ConstraintLayout {
    public static final /* synthetic */ int O0 = 0;
    public final ImageView E0;
    public final Button F0;
    public final Button G0;
    public final TextView H0;
    public final TextView I0;
    public final TextView J0;
    public final ProgressBar K0;
    public boolean L0;
    public final ro4 M0 = ro4.b();
    public ao1 N0;

    public CallLinkCreatedView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        View.inflate(getContext(), ujc.view_call_link_created, this);
        getContext();
        setMaxWidth(vo4.b((int) 450.0f));
        setBackgroundResource(nad.d);
        ro4 ro4 = this.M0;
        int i = ro4.s;
        setPadding(i, i, i, ro4.q);
        ProgressBar progressBar = (ProgressBar) findViewById(lic.view_call_link_created__pb_loading);
        this.K0 = progressBar;
        iq.b0(progressBar, -1);
        this.E0 = (ImageView) findViewById(lic.view_call_link_created__btn_share);
        int a = fw3.a(getContext(), lad.r);
        this.E0.setBackground(i8b.f(0, a, 0, this.M0.b));
        y64.n(this.E0, new hb1(this, 0));
        this.H0 = (TextView) findViewById(lic.view_call_link_created__tv_link);
        Drawable b = ew3.b(getContext(), nad.U1);
        iq.a0(b, -1);
        hsg.D(b, (Drawable) null, (Drawable) null, (Drawable) null, this.H0);
        this.H0.setBackground(i8b.f(0, a, 0, this.M0.b));
        y64.n(this.H0, new hb1(this, 0));
        this.I0 = (TextView) findViewById(lic.view_call_link_created__tv_title);
        this.J0 = (TextView) findViewById(lic.view_call_link_created__tv_description);
        Button button = (Button) findViewById(lic.view_call_link_created__btn_close);
        this.F0 = button;
        button.setBackground(i8b.f(0, a, 0, this.M0.b));
        y64.n(this.F0, new hb1(this, 0));
        Button button2 = (Button) findViewById(lic.view_call_link_created__btn_copy);
        this.G0 = button2;
        button2.setBackground(i8b.f(0, a, 0, this.M0.b));
        y64.n(this.G0, new hb1(this, 0));
    }

    public final void L(boolean z) {
        int i = 0;
        if (z) {
            setBackgroundResource(nad.d);
            ro4 ro4 = this.M0;
            int i2 = ro4.s;
            setPadding(i2, i2, i2, ro4.q);
        } else {
            setBackground((Drawable) null);
            setPadding(0, 0, 0, 0);
        }
        this.H0.setVisibility(z ? 0 : 8);
        this.I0.setVisibility(z ? 0 : 8);
        this.J0.setVisibility(z ? 0 : 8);
        this.E0.setVisibility(z ? 0 : 8);
        this.F0.setVisibility(z ? 0 : 8);
        Button button = this.G0;
        if (!z) {
            i = 8;
        }
        button.setVisibility(i);
    }

    public void setLink(String str) {
        this.H0.setText(str);
    }

    public void setListener(ib1 ib1) {
    }

    public void setLoading(boolean z) {
        if (z != this.L0) {
            this.L0 = z;
            if (z) {
                jbd.c(this.N0);
                this.K0.setVisibility(8);
                L(false);
                TimeUnit timeUnit = TimeUnit.MILLISECONDS;
                lfd a = qe.a();
                Objects.requireNonNull(timeUnit, "unit is null");
                ao1 ao1 = new ao1(0, new fm0(11), new hb1(this, 1));
                Objects.requireNonNull(ao1, "observer is null");
                try {
                    fb3 fb3 = new fb3(0, ao1);
                    ao1.c(fb3);
                    qq4.c(fb3, a.d(fb3, 300, timeUnit));
                    this.N0 = ao1;
                } catch (NullPointerException e) {
                    throw e;
                } catch (Throwable th) {
                    hd8.Z(th);
                    n54.D(th);
                    NullPointerException nullPointerException = new NullPointerException("Actually not, but can't pass out an exception otherwise...");
                    nullPointerException.initCause(th);
                    throw nullPointerException;
                }
            } else {
                jbd.c(this.N0);
                this.K0.setVisibility(8);
                L(true);
            }
        }
    }
}
