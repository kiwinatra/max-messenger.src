package ru.ok.messages.calls.views;

import android.content.Context;
import android.util.AttributeSet;
import androidx.appcompat.widget.AppCompatTextView;
import java.io.UnsupportedEncodingException;
import java.net.URLDecoder;

public class RateCallTextView extends AppCompatTextView {
    public RateCallTextView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        setRate(0);
    }

    private String getAwfulSmile() {
        return j("%F0%9F%91%BF");
    }

    private String getBadSmile() {
        return j("%F0%9F%98%AC");
    }

    private String getGhostSmile() {
        return j("%F0%9F%91%BB");
    }

    private String getLaughtSmile() {
        return j("%F0%9F%98%80");
    }

    private String getNormalSmile() {
        return j("%F0%9F%98%90");
    }

    private String getSimpleSmile() {
        return j("%F0%9F%98%8A");
    }

    public static String j(String str) {
        try {
            return URLDecoder.decode(str, "UTF-8");
        } catch (UnsupportedEncodingException unused) {
            return "";
        }
    }

    public void setRate(int i) {
        String str;
        if (i == 1) {
            str = getContext().getString(qad.c0) + " " + getAwfulSmile();
        } else if (i == 2) {
            str = getContext().getString(qad.d0) + " " + getBadSmile();
        } else if (i == 3) {
            str = getContext().getString(qad.e0) + " " + getNormalSmile();
        } else if (i == 4) {
            str = getContext().getString(qad.f0) + " " + getSimpleSmile();
        } else if (i != 5) {
            str = getContext().getString(qad.b0) + " " + getGhostSmile();
        } else {
            str = getContext().getString(qad.g0) + " " + getLaughtSmile();
        }
        setText(((qra) ym.e()).v().k.c(str));
    }
}
