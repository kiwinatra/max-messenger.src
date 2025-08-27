package ru.ok.android.externcalls.sdk.id;

import android.os.Parcel;
import android.os.Parcelable;
import java.io.Serializable;
import java.util.Objects;

public final class ParticipantId implements Parcelable, Serializable {
    public static final Parcelable.Creator<ParticipantId> CREATOR = new Parcelable.Creator<ParticipantId>() {
        public ParticipantId createFromParcel(Parcel parcel) {
            return new ParticipantId(parcel, 0);
        }

        public ParticipantId[] newArray(int i) {
            return new ParticipantId[i];
        }
    };
    public final int deviceIndex;
    public final String id;
    public final boolean isAnon;

    public /* synthetic */ ParticipantId(Parcel parcel, int i) {
        this(parcel);
    }

    public static ParticipantId authorized(String str) {
        return new ParticipantId(str, false, 0);
    }

    public static ParticipantId fromStringValue(String str) {
        String[] split = str.split(":");
        return new ParticipantId(split[0], false, split.length > 1 ? Integer.parseInt(split[1]) : 0);
    }

    public static ParticipantId withoutDeviceId(String str, boolean z) {
        return new ParticipantId(str, z, 0);
    }

    public int describeContents() {
        return 0;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || ParticipantId.class != obj.getClass()) {
            return false;
        }
        ParticipantId participantId = (ParticipantId) obj;
        if (this.deviceIndex == participantId.deviceIndex && this.isAnon == participantId.isAnon) {
            return this.id.equals(participantId.id);
        }
        return false;
    }

    public int hashCode() {
        return Objects.hash(new Object[]{this.id, Boolean.valueOf(this.isAnon), Integer.valueOf(this.deviceIndex)});
    }

    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(this.isAnon ? wj6.n(new StringBuilder("anon{"), this.id, "}") : wj6.n(new StringBuilder("{"), this.id, "}"));
        sb.append(":d");
        sb.append(this.deviceIndex);
        return sb.toString();
    }

    public String toStringValue() {
        return this.id + ":" + this.deviceIndex;
    }

    public void writeToParcel(Parcel parcel, int i) {
        parcel.writeString(this.id);
        parcel.writeByte(this.isAnon ? (byte) 1 : 0);
        parcel.writeInt(this.deviceIndex);
    }

    public ParticipantId(String str, boolean z, int i) {
        this.id = str;
        this.isAnon = z;
        this.deviceIndex = i;
    }

    @Deprecated
    public ParticipantId(String str) {
        this(str, false, 0);
    }

    @Deprecated
    public ParticipantId(String str, boolean z) {
        this(str, z, 0);
    }

    private ParticipantId(Parcel parcel) {
        String readString = parcel.readString();
        Objects.requireNonNull(readString);
        this.id = readString;
        this.isAnon = parcel.readByte() != 0;
        this.deviceIndex = parcel.readInt();
    }
}
