package ru.ok.messages.channels;

import android.content.Context;
import android.content.res.ColorStateList;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.RippleDrawable;
import android.util.AttributeSet;
import android.view.LayoutInflater;
import android.view.View;
import android.widget.Button;
import android.widget.FrameLayout;
import android.widget.ImageButton;
import android.widget.LinearLayout;
import android.widget.ProgressBar;
import java.io.IOException;
import java.util.Arrays;
import kotlin.Lazy;

public class ChatControlBottomView extends FrameLayout {
    public static final /* synthetic */ int v0 = 0;
    public o52 a = o52.a;
    public final View b;
    public final LinearLayout c;
    public final ImageButton o;
    public final ImageButton v;
    public final Button w;
    public final Button x;
    public final Button y;
    public final Button z;

    public ChatControlBottomView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet, 0);
        LayoutInflater.from(getContext()).inflate(ujc.view_public_chat_control, this, true);
        this.b = findViewById(lic.view_channel_control__tv_progress);
        this.c = (LinearLayout) findViewById(lic.view_channel_control__ll_channel_controls);
        ImageButton imageButton = (ImageButton) findViewById(lic.view_channel_control__btn_mute);
        this.o = imageButton;
        ct.H(imageButton, new x4(21, (Object) this));
        Button button = (Button) findViewById(lic.view_channel_control__btn_mute_big);
        this.x = button;
        ct.H(button, new x4(21, (Object) this));
        ImageButton imageButton2 = (ImageButton) findViewById(lic.view_channel_control__btn_unmute);
        this.v = imageButton2;
        ct.H(imageButton2, new x4(21, (Object) this));
        Button button2 = (Button) findViewById(lic.view_channel_control__btn_unmute_big);
        this.w = button2;
        ct.H(button2, new x4(21, (Object) this));
        Button button3 = (Button) findViewById(lic.view_channel_control__btn_invite);
        this.y = button3;
        ct.H(button3, new x4(21, (Object) this));
        Button button4 = (Button) findViewById(lic.view_public_chat_control__btn_action);
        this.z = button4;
        ct.H(button4, new x4(21, (Object) this));
        a();
        b();
    }

    public final void a() {
        Context context = getContext();
        Lazy lazy = scf.b0;
        scf k0 = j4b.k0(context);
        setBackgroundColor(k0.n);
        findViewById(lic.view_public_chat_control__separator).setBackgroundColor(k0.L);
        int i = k0.l;
        iq.b0((ProgressBar) findViewById(lic.view_channel_control__pb_progress), i);
        ImageButton imageButton = this.o;
        imageButton.setColorFilter(i);
        imageButton.setBackground(k0.d());
        ImageButton imageButton2 = this.v;
        int i2 = k0.N;
        imageButton2.setColorFilter(i2);
        imageButton2.setBackground(k0.d());
        RippleDrawable e = k0.e();
        Button button = this.y;
        button.setBackground(e);
        button.setTextColor(i);
        RippleDrawable e2 = k0.e();
        Button button2 = this.x;
        button2.setBackground(e2);
        button2.setTextColor(i2);
        hsg.D(iq.E(nad.X0, i2, getContext()), (Drawable) null, (Drawable) null, (Drawable) null, button2);
        RippleDrawable e3 = k0.e();
        Button button3 = this.w;
        button3.setBackground(e3);
        button3.setTextColor(i);
        hsg.D(iq.E(nad.W0, i, getContext()), (Drawable) null, (Drawable) null, (Drawable) null, button3);
        int ordinal = this.a.ordinal();
        int i3 = k0.j;
        int i4 = k0.m;
        Button button4 = this.z;
        if (ordinal != 0) {
            if (!(ordinal == 4 || ordinal == 5)) {
                if (ordinal != 6) {
                    switch (ordinal) {
                        case 9:
                            button4.setTextColor(i2);
                            button4.setBackground(k0.e());
                            return;
                        case 10:
                            button4.setBackground(k0.e());
                            button4.setTextColor(i);
                            return;
                        case 11:
                            break;
                        default:
                            return;
                    }
                } else {
                    button4.setBackgroundColor(i);
                    button4.setTextColor(i4);
                    button4.setBackground(i8b.f(i, i3, j4b.l0(0.3f, i), 0));
                    button4.setTextColor(new ColorStateList(new int[][]{new int[]{16842919}, new int[]{-16842910}, new int[0]}, new int[]{i4, i4, i4}));
                    return;
                }
            }
            button4.setTextColor(i2);
            button4.setBackground(k0.e());
            return;
        }
        button4.setBackgroundColor(i);
        button4.setTextColor(i4);
        button4.setBackground(i8b.f(i, i3, j4b.l0(0.3f, i), 0));
        button4.setTextColor(new ColorStateList(new int[][]{new int[]{16842919}, new int[]{-16842910}, new int[0]}, new int[]{i4, i4, i4}));
    }

    public final void b() {
        ImageButton imageButton = this.o;
        imageButton.setVisibility(4);
        ImageButton imageButton2 = this.v;
        imageButton2.setVisibility(4);
        View view = this.b;
        view.setVisibility(4);
        LinearLayout linearLayout = this.c;
        linearLayout.setVisibility(4);
        Button button = this.x;
        button.setVisibility(4);
        Button button2 = this.w;
        button2.setVisibility(4);
        Button button3 = this.z;
        button3.setVisibility(4);
        switch (this.a.ordinal()) {
            case 0:
                button3.setText(qad.L0);
                button3.setVisibility(0);
                break;
            case 1:
                imageButton.setVisibility(0);
                linearLayout.setVisibility(0);
                break;
            case 2:
                imageButton2.setVisibility(0);
                linearLayout.setVisibility(0);
                break;
            case 3:
                view.setVisibility(0);
                break;
            case 4:
                button3.setVisibility(0);
                button3.setText(qad.C0);
                break;
            case 5:
                button3.setVisibility(0);
                button3.setText(qad.Y0);
                break;
            case 6:
                button3.setText(qad.W0);
                button3.setVisibility(0);
                break;
            case 7:
                button.setVisibility(0);
                break;
            case 8:
                button2.setVisibility(0);
                break;
            case 9:
                button3.setText(qad.ba);
                button3.setVisibility(0);
                break;
            case 10:
                button3.setText(qad.M);
                button3.setVisibility(0);
                break;
            case 11:
                button3.setText(qad.i5);
                button3.setVisibility(0);
                break;
        }
        a();
    }

    public o52 getState() {
        return this.a;
    }

    public void setListener(n52 n52) {
    }

    public void setState(o52 o52) {
        z68.c("ru.ok.messages.channels.ChatControlBottomView", "setState %s", o52);
        if (this.a.equals(o52)) {
            z68.n("ru.ok.messages.channels.ChatControlBottomView", (IOException) null, "setState %s ignore!", Arrays.copyOf(new Object[]{o52}, 1));
            return;
        }
        this.a = o52;
        b();
    }
}
