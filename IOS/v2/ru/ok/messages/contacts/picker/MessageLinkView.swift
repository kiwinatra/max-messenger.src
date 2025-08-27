package ru.ok.messages.contacts.picker;

import android.content.Context;
import android.util.AttributeSet;
import android.view.View;
import android.widget.FrameLayout;
import android.widget.ImageView;
import android.widget.TextView;
import kotlin.Lazy;

public class MessageLinkView extends FrameLayout {
    public final TextView a;
    public final ImageView b;

    public MessageLinkView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        View.inflate(getContext(), ujc.view_message_link, this);
        Context context2 = getContext();
        Lazy lazy = scf.b0;
        scf k0 = j4b.k0(context2);
        setBackgroundColor(k0.n);
        TextView textView = (TextView) findViewById(lic.view_message_link__tv_link);
        this.a = textView;
        int i = k0.l;
        textView.setTextColor(i);
        this.a.setBackground(k0.e());
        ImageView imageView = (ImageView) findViewById(lic.view_message_link__iv_share);
        this.b = imageView;
        imageView.setBackground(k0.d());
        this.b.setColorFilter(i);
    }
}
