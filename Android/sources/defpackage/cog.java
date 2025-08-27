package defpackage;

import android.view.DisplayCutout;
import android.view.View;
import android.view.WindowInsets;
import java.util.Objects;

/* renamed from: cog  reason: default package */
public abstract class cog extends bog {
    public cog(iog iog, WindowInsets windowInsets) {
        super(iog, windowInsets);
    }

    public iog a() {
        return iog.g((View) null, this.c.consumeDisplayCutout());
    }

    public gq4 e() {
        DisplayCutout displayCutout = this.c.getDisplayCutout();
        if (displayCutout == null) {
            return null;
        }
        return new gq4(displayCutout);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof cog)) {
            return false;
        }
        cog cog = (cog) obj;
        return Objects.equals(this.c, cog.c) && Objects.equals(this.g, cog.g);
    }

    public int hashCode() {
        return this.c.hashCode();
    }
}
