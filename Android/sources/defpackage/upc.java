package defpackage;

import android.media.Rating;
import android.os.Parcel;
import android.os.Parcelable;

/* renamed from: upc  reason: default package */
public final class upc implements Parcelable {
    public static final Parcelable.Creator<upc> CREATOR = new w0b(26);
    public final int a;
    public final float b;
    public Object c;

    public upc(int i, float f) {
        this.a = i;
        this.b = f;
    }

    public static upc a(Object obj) {
        upc upc;
        upc upc2 = null;
        if (obj != null) {
            Rating rating = (Rating) obj;
            int ratingStyle = rating.getRatingStyle();
            if (!rating.isRated()) {
                switch (ratingStyle) {
                    case 1:
                    case 2:
                    case 3:
                    case 4:
                    case 5:
                    case 6:
                        upc2 = new upc(ratingStyle, -1.0f);
                        break;
                }
            } else {
                float f = 1.0f;
                switch (ratingStyle) {
                    case 1:
                        if (!rating.hasHeart()) {
                            f = 0.0f;
                        }
                        upc = new upc(1, f);
                        break;
                    case 2:
                        if (!rating.isThumbUp()) {
                            f = 0.0f;
                        }
                        upc = new upc(2, f);
                        break;
                    case 3:
                    case 4:
                    case 5:
                        upc2 = d(rating.getStarRating(), ratingStyle);
                        break;
                    case 6:
                        float percentRating = rating.getPercentRating();
                        if (percentRating >= c44.DEFAULT_ASPECT_RATIO && percentRating <= 100.0f) {
                            upc2 = new upc(6, percentRating);
                            break;
                        }
                    default:
                        return null;
                }
                upc2 = upc;
            }
            upc2.getClass();
            upc2.c = obj;
        }
        return upc2;
    }

    public static upc d(float f, int i) {
        float f2;
        if (i == 3) {
            f2 = 3.0f;
        } else if (i == 4) {
            f2 = 4.0f;
        } else if (i != 5) {
            return null;
        } else {
            f2 = 5.0f;
        }
        if (f < c44.DEFAULT_ASPECT_RATIO || f > f2) {
            return null;
        }
        return new upc(i, f);
    }

    public final float b() {
        int i = this.a;
        if ((i == 3 || i == 4 || i == 5) && c()) {
            return this.b;
        }
        return -1.0f;
    }

    public final boolean c() {
        return this.b >= c44.DEFAULT_ASPECT_RATIO;
    }

    public final int describeContents() {
        return this.a;
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("Rating:style=");
        sb.append(this.a);
        sb.append(" rating=");
        float f = this.b;
        sb.append(f < c44.DEFAULT_ASPECT_RATIO ? "unrated" : String.valueOf(f));
        return sb.toString();
    }

    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeInt(this.a);
        parcel.writeFloat(this.b);
    }
}
