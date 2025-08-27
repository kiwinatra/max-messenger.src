package defpackage;

import android.util.JsonReader;
import android.util.JsonToken;
import java.io.BufferedReader;
import java.io.IOException;

/* renamed from: kb0  reason: default package */
public final class kb0 {
    public final long a;

    public kb0(long j) {
        this.a = j;
    }

    public static kb0 a(BufferedReader bufferedReader) {
        JsonReader jsonReader = new JsonReader(bufferedReader);
        try {
            jsonReader.beginObject();
            while (jsonReader.hasNext()) {
                if (!jsonReader.nextName().equals("nextRequestWaitMillis")) {
                    jsonReader.skipValue();
                } else if (jsonReader.peek() == JsonToken.STRING) {
                    return new kb0(Long.parseLong(jsonReader.nextString()));
                } else {
                    kb0 kb0 = new kb0(jsonReader.nextLong());
                    jsonReader.close();
                    return kb0;
                }
            }
            throw new IOException("Response is missing nextRequestWaitMillis field.");
        } finally {
            jsonReader.close();
        }
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof kb0)) {
            return false;
        }
        return this.a == ((kb0) obj).a;
    }

    public final int hashCode() {
        long j = this.a;
        return ((int) ((j >>> 32) ^ j)) ^ 1000003;
    }

    public final String toString() {
        return wj6.m(new StringBuilder("LogResponse{nextRequestWaitMillis="), this.a, "}");
    }
}
