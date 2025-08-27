package defpackage;

import android.view.GestureDetector;
import android.view.MotionEvent;
import android.view.View;
import android.widget.PopupWindow;
import androidx.recyclerview.widget.RecyclerView;
import ru.ok.tamtam.animoji.views.AnimojiTextView;
import ru.ok.tamtam.stickers.view.SquareFrameLayout;

/* renamed from: b45  reason: default package */
public final class b45 extends SquareFrameLayout implements GestureDetector.OnGestureListener {
    public AnimojiTextView a;
    public a45 b;
    public GestureDetector c;
    public xoe o;
    public boolean v;
    public boolean w;

    public final boolean onDown(MotionEvent motionEvent) {
        return false;
    }

    public final boolean onFling(MotionEvent motionEvent, MotionEvent motionEvent2, float f, float f2) {
        return false;
    }

    public final boolean onScroll(MotionEvent motionEvent, MotionEvent motionEvent2, float f, float f2) {
        return false;
    }

    public final void onShowPress(MotionEvent motionEvent) {
    }

    public final boolean onSingleTapUp(MotionEvent motionEvent) {
        performClick();
        return true;
    }

    public final boolean onTouchEvent(MotionEvent motionEvent) {
        if (this.b == null) {
            return super.onTouchEvent(motionEvent);
        }
        int action = motionEvent.getAction();
        boolean z = false;
        if (action == 0) {
            setPressed(true);
        } else if (action == 1 || action == 3) {
            setPressed(false);
        }
        this.c.onTouchEvent(motionEvent);
        j15 j15 = ((f15) this.b).a;
        j15.getClass();
        if (motionEvent.getAction() == 1) {
            PopupWindow popupWindow = j15.x;
            if (popupWindow != null && popupWindow.isShowing()) {
                View contentView = j15.x.getContentView();
                if (contentView instanceof z25) {
                    z25 z25 = (z25) contentView;
                    e15 selectedEmoji = z25.getSelectedEmoji();
                    e15 originalEmoji = z25.getOriginalEmoji();
                    if (!(selectedEmoji == null || originalEmoji == null)) {
                        j15.E();
                        h15 h15 = j15.o;
                        if (h15 != null) {
                            h15.f(originalEmoji, selectedEmoji);
                        }
                    }
                }
                j15.E();
            }
        } else {
            PopupWindow popupWindow2 = j15.x;
            if (popupWindow2 != null && popupWindow2.isShowing()) {
                View contentView2 = j15.x.getContentView();
                if (contentView2 instanceof z25) {
                    z25 z252 = (z25) contentView2;
                    int[] iArr = new int[2];
                    z252.getLocationOnScreen(iArr);
                    View H = z252.w.H(Math.max(Math.min(motionEvent.getRawX() - ((float) iArr[0]), (float) (z252.getWidth() - z252.A0)), (float) z252.A0), Math.max(Math.min(motionEvent.getRawY() - ((float) iArr[1]), (float) (z252.getHeight() - z252.A0)), (float) z252.A0));
                    if (H instanceof b45) {
                        z252.w.getClass();
                        int S = RecyclerView.S(H);
                        if (!(S == -1 || z252.z0 == S)) {
                            z252.z0 = S;
                            j15 j152 = z252.x;
                            if (j152.z != S) {
                                j152.z = S;
                                j152.m();
                            }
                        }
                    }
                }
                z = true;
            }
        }
        if (this.v != z) {
            this.v = z;
            getParent().requestDisallowInterceptTouchEvent(this.v);
        }
        return true;
    }

    public void setAnimojiEnabled(boolean z) {
        AnimojiTextView animojiTextView = this.a;
        if (animojiTextView != null) {
            animojiTextView.setAnimojiEnabled(z);
        }
    }

    public void setEmojiCompatEnabled(boolean z) {
        AnimojiTextView animojiTextView = this.a;
        if (animojiTextView != null) {
            animojiTextView.setEmojiCompatEnabled(z);
        }
    }

    public void setHighlighted(boolean z) {
        if (this.o != null) {
            if (this.w != z || getBackground() == null) {
                this.w = z;
                if (z) {
                    setBackground(xoe.a(this.o.t));
                } else {
                    setBackground(xoe.a(this.o.c));
                }
            }
        }
    }

    public void setText(CharSequence charSequence) {
        this.a.setText(charSequence);
    }

    public void setTheme(xoe xoe) {
        this.o = xoe;
        setHighlighted(this.w);
    }

    public void setTouchListener(a45 a45) {
        this.b = a45;
    }
}
