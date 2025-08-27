package ru.ok.tamtam.nano;

import com.google.protobuf.nano.InvalidProtocolBufferNanoException;
import java.io.IOException;
import java.util.Arrays;
import java.util.Map;
import kotlin.uuid.Uuid;
import one.me.common.drawable.SavedMessagesIconDrawable;
import org.apache.http.HttpStatus;
import org.apache.http.util.LangUtils;

public interface Protos {

    public static final class Attaches extends ad9 {
        private static volatile Attaches[] _emptyArray;
        public Attach[] attach;
        public Attach.InlineKeyboard keyboard;
        public Attach.ReplyKeyboard replyKeyboard;
        public Attach.SendAction sendAction;

        public static final class Attach extends ad9 {
            public static final int APP = 7;
            public static final int AUDIO = 4;
            public static final int CALL = 8;
            public static final int CANCELLED = 1;
            public static final int CONTACT = 11;
            public static final int CONTROL = 1;
            public static final int DAILY_MEDIA = 15;
            public static final int DEFAULT = 0;
            public static final int ERROR = 3;
            public static final int FILE = 10;
            public static final int INLINE_KEYBOARD = 13;
            public static final int LOADED = 2;
            public static final int LOADING = 4;
            public static final int LOCATION = 14;
            public static final int MUSIC = 9;
            public static final int NOT_LOADED = 0;
            public static final int PHOTO = 2;
            public static final int PRESENT = 12;
            public static final int PROCESSED = 2;
            public static final int PROCESSING = 1;
            public static final int SHARE = 6;
            public static final int STICKER = 5;
            public static final int UNKNOWN = 0;
            public static final int VIDEO = 3;
            private static volatile Attach[] _emptyArray;
            public App app;
            public Audio audio;
            public long bytesDownloaded;
            public Call call;
            public Contact contact;
            public Control control;
            public File file;
            public InlineKeyboard inlineKeyboard;
            public boolean isDeleted;
            public boolean isProcessingOnServer;
            public long lastErrorTime;
            public long lastModified;
            public String localId;
            public String localPath;
            public Location location;
            public Photo photo;
            public Present present;
            public int processingOnServerStatus;
            public int progress;
            public float progressFloat;
            public boolean sensitive;
            public boolean sensitiveContentUnlocked;
            public Share share;
            public int status;
            public Sticker sticker;
            public long totalBytes;
            public int type;
            public Video video;

            public static final class App extends ad9 {
                private static volatile App[] _emptyArray;
                public long appId;
                public String appState;
                public String icon;
                public String message;
                public String name;
                public int state;
                public long timeout;

                public App() {
                    clear();
                }

                public static App[] emptyArray() {
                    if (_emptyArray == null) {
                        synchronized (bj7.b) {
                            try {
                                if (_emptyArray == null) {
                                    _emptyArray = new App[0];
                                }
                            } catch (Throwable th) {
                                throw th;
                            }
                        }
                    }
                    return _emptyArray;
                }

                public static App parseFrom(byte[] bArr) throws InvalidProtocolBufferNanoException {
                    return (App) ad9.mergeFrom(new App(), bArr);
                }

                public App clear() {
                    this.appId = 0;
                    this.name = "";
                    this.icon = "";
                    this.message = "";
                    this.state = 0;
                    this.timeout = 0;
                    this.appState = "";
                    this.cachedSize = -1;
                    return this;
                }

                public int computeSerializedSize() {
                    long j = this.appId;
                    int h = j != 0 ? j43.h(1, j) : 0;
                    if (!this.name.equals("")) {
                        h += j43.l(2, this.name);
                    }
                    if (!this.icon.equals("")) {
                        h += j43.l(3, this.icon);
                    }
                    if (!this.message.equals("")) {
                        h += j43.l(4, this.message);
                    }
                    int i = this.state;
                    if (i != 0) {
                        h += j43.f(5, i);
                    }
                    long j2 = this.timeout;
                    if (j2 != 0) {
                        h += j43.h(6, j2);
                    }
                    return !this.appState.equals("") ? h + j43.l(7, this.appState) : h;
                }

                public void writeTo(j43 j43) throws IOException {
                    long j = this.appId;
                    if (j != 0) {
                        j43.x(1, j);
                    }
                    if (!this.name.equals("")) {
                        j43.E(2, this.name);
                    }
                    if (!this.icon.equals("")) {
                        j43.E(3, this.icon);
                    }
                    if (!this.message.equals("")) {
                        j43.E(4, this.message);
                    }
                    int i = this.state;
                    if (i != 0) {
                        j43.w(5, i);
                    }
                    long j2 = this.timeout;
                    if (j2 != 0) {
                        j43.x(6, j2);
                    }
                    if (!this.appState.equals("")) {
                        j43.E(7, this.appState);
                    }
                }

                public static App parseFrom(i43 i43) throws IOException {
                    return new App().mergeFrom(i43);
                }

                public App mergeFrom(i43 i43) throws IOException {
                    while (true) {
                        int s = i43.s();
                        if (s == 0) {
                            return this;
                        }
                        if (s == 8) {
                            this.appId = i43.q();
                        } else if (s == 18) {
                            this.name = i43.r();
                        } else if (s == 26) {
                            this.icon = i43.r();
                        } else if (s == 34) {
                            this.message = i43.r();
                        } else if (s == 40) {
                            this.state = i43.p();
                        } else if (s == 48) {
                            this.timeout = i43.q();
                        } else if (s == 58) {
                            this.appState = i43.r();
                        } else if (!i43.u(s)) {
                            return this;
                        }
                    }
                }
            }

            public static final class Audio extends ad9 {
                public static final int FAILED = 3;
                public static final int NOT_SUPPORTED = 4;
                public static final int PROCESSING = 1;
                public static final int SUCCESS = 2;
                public static final int UNKNOWN = 0;
                private static volatile Audio[] _emptyArray;
                public long audioId;
                public long duration;
                public long lastStartTimeUpdateTimestamp;
                public long startTime;
                public String token;
                public String transcription;
                public int transcriptionStatus;
                public String url;
                public byte[] wave;

                public Audio() {
                    clear();
                }

                public static Audio[] emptyArray() {
                    if (_emptyArray == null) {
                        synchronized (bj7.b) {
                            try {
                                if (_emptyArray == null) {
                                    _emptyArray = new Audio[0];
                                }
                            } catch (Throwable th) {
                                throw th;
                            }
                        }
                    }
                    return _emptyArray;
                }

                public static Audio parseFrom(byte[] bArr) throws InvalidProtocolBufferNanoException {
                    return (Audio) ad9.mergeFrom(new Audio(), bArr);
                }

                public Audio clear() {
                    this.audioId = 0;
                    this.url = "";
                    this.duration = 0;
                    this.wave = ct.h;
                    this.token = "";
                    this.startTime = 0;
                    this.lastStartTimeUpdateTimestamp = 0;
                    this.transcription = "";
                    this.transcriptionStatus = 0;
                    this.cachedSize = -1;
                    return this;
                }

                public int computeSerializedSize() {
                    long j = this.audioId;
                    int h = j != 0 ? j43.h(1, j) : 0;
                    if (!this.url.equals("")) {
                        h += j43.l(2, this.url);
                    }
                    long j2 = this.duration;
                    if (j2 != 0) {
                        h += j43.h(3, j2);
                    }
                    if (!Arrays.equals(this.wave, ct.h)) {
                        h += j43.b(4, this.wave);
                    }
                    if (!this.token.equals("")) {
                        h += j43.l(5, this.token);
                    }
                    long j3 = this.startTime;
                    if (j3 != 0) {
                        h += j43.h(6, j3);
                    }
                    long j4 = this.lastStartTimeUpdateTimestamp;
                    if (j4 != 0) {
                        h += j43.h(7, j4);
                    }
                    if (!this.transcription.equals("")) {
                        h += j43.l(8, this.transcription);
                    }
                    int i = this.transcriptionStatus;
                    return i != 0 ? h + j43.f(9, i) : h;
                }

                public void writeTo(j43 j43) throws IOException {
                    long j = this.audioId;
                    if (j != 0) {
                        j43.x(1, j);
                    }
                    if (!this.url.equals("")) {
                        j43.E(2, this.url);
                    }
                    long j2 = this.duration;
                    if (j2 != 0) {
                        j43.x(3, j2);
                    }
                    if (!Arrays.equals(this.wave, ct.h)) {
                        j43.s(4, this.wave);
                    }
                    if (!this.token.equals("")) {
                        j43.E(5, this.token);
                    }
                    long j3 = this.startTime;
                    if (j3 != 0) {
                        j43.x(6, j3);
                    }
                    long j4 = this.lastStartTimeUpdateTimestamp;
                    if (j4 != 0) {
                        j43.x(7, j4);
                    }
                    if (!this.transcription.equals("")) {
                        j43.E(8, this.transcription);
                    }
                    int i = this.transcriptionStatus;
                    if (i != 0) {
                        j43.w(9, i);
                    }
                }

                public static Audio parseFrom(i43 i43) throws IOException {
                    return new Audio().mergeFrom(i43);
                }

                public Audio mergeFrom(i43 i43) throws IOException {
                    while (true) {
                        int s = i43.s();
                        if (s == 0) {
                            return this;
                        }
                        if (s == 8) {
                            this.audioId = i43.q();
                        } else if (s == 18) {
                            this.url = i43.r();
                        } else if (s == 24) {
                            this.duration = i43.q();
                        } else if (s == 34) {
                            this.wave = i43.g();
                        } else if (s == 42) {
                            this.token = i43.r();
                        } else if (s == 48) {
                            this.startTime = i43.q();
                        } else if (s == 56) {
                            this.lastStartTimeUpdateTimestamp = i43.q();
                        } else if (s == 66) {
                            this.transcription = i43.r();
                        } else if (s == 72) {
                            int p = i43.p();
                            if (p == 0 || p == 1 || p == 2 || p == 3 || p == 4) {
                                this.transcriptionStatus = p;
                            }
                        } else if (!i43.u(s)) {
                            return this;
                        }
                    }
                }
            }

            public static final class Button extends ad9 {
                public static final int CALLBACK = 0;
                public static final int CHAT = 5;
                public static final int DEFAULT = 0;
                public static final int LINK = 1;
                public static final int MESSAGE = 6;
                public static final int NEGATIVE = 2;
                public static final int OPEN_APP = 7;
                public static final int POSITIVE = 1;
                public static final int REQUEST_CONTACT = 2;
                public static final int REQUEST_GEO_LOCATION = 3;
                public static final int UNKNOWN_INTENT = 3;
                public static final int UNKNOWN_TYPE = 4;
                private static volatile Button[] _emptyArray;
                public long contactId;
                public int intent;
                public String payload;
                public boolean quickLocation;
                public boolean showLoading;
                public String title;
                public int type;
                public String url;

                public Button() {
                    clear();
                }

                public static Button[] emptyArray() {
                    if (_emptyArray == null) {
                        synchronized (bj7.b) {
                            try {
                                if (_emptyArray == null) {
                                    _emptyArray = new Button[0];
                                }
                            } catch (Throwable th) {
                                throw th;
                            }
                        }
                    }
                    return _emptyArray;
                }

                public static Button parseFrom(byte[] bArr) throws InvalidProtocolBufferNanoException {
                    return (Button) ad9.mergeFrom(new Button(), bArr);
                }

                public Button clear() {
                    this.title = "";
                    this.type = 0;
                    this.intent = 0;
                    this.url = "";
                    this.payload = "";
                    this.showLoading = false;
                    this.quickLocation = false;
                    this.contactId = 0;
                    this.cachedSize = -1;
                    return this;
                }

                public int computeSerializedSize() {
                    int l = !this.title.equals("") ? j43.l(1, this.title) : 0;
                    int i = this.type;
                    if (i != 0) {
                        l += j43.f(2, i);
                    }
                    int i2 = this.intent;
                    if (i2 != 0) {
                        l += j43.f(3, i2);
                    }
                    if (!this.url.equals("")) {
                        l += j43.l(4, this.url);
                    }
                    if (!this.payload.equals("")) {
                        l += j43.l(5, this.payload);
                    }
                    if (this.showLoading) {
                        l += j43.a(6);
                    }
                    if (this.quickLocation) {
                        l += j43.a(7);
                    }
                    long j = this.contactId;
                    return j != 0 ? l + j43.h(8, j) : l;
                }

                public void writeTo(j43 j43) throws IOException {
                    if (!this.title.equals("")) {
                        j43.E(1, this.title);
                    }
                    int i = this.type;
                    if (i != 0) {
                        j43.w(2, i);
                    }
                    int i2 = this.intent;
                    if (i2 != 0) {
                        j43.w(3, i2);
                    }
                    if (!this.url.equals("")) {
                        j43.E(4, this.url);
                    }
                    if (!this.payload.equals("")) {
                        j43.E(5, this.payload);
                    }
                    boolean z = this.showLoading;
                    if (z) {
                        j43.r(6, z);
                    }
                    boolean z2 = this.quickLocation;
                    if (z2) {
                        j43.r(7, z2);
                    }
                    long j = this.contactId;
                    if (j != 0) {
                        j43.x(8, j);
                    }
                }

                public static Button parseFrom(i43 i43) throws IOException {
                    return new Button().mergeFrom(i43);
                }

                public Button mergeFrom(i43 i43) throws IOException {
                    while (true) {
                        int s = i43.s();
                        if (s == 0) {
                            return this;
                        }
                        if (s != 10) {
                            if (s == 16) {
                                int p = i43.p();
                                switch (p) {
                                    case 0:
                                    case 1:
                                    case 2:
                                    case 3:
                                    case 4:
                                    case 5:
                                    case 6:
                                    case 7:
                                        this.type = p;
                                        break;
                                }
                            } else if (s == 24) {
                                int p2 = i43.p();
                                if (p2 == 0 || p2 == 1 || p2 == 2 || p2 == 3) {
                                    this.intent = p2;
                                }
                            } else if (s == 34) {
                                this.url = i43.r();
                            } else if (s == 42) {
                                this.payload = i43.r();
                            } else if (s == 48) {
                                this.showLoading = i43.f();
                            } else if (s == 56) {
                                this.quickLocation = i43.f();
                            } else if (s == 64) {
                                this.contactId = i43.q();
                            } else if (!i43.u(s)) {
                                return this;
                            }
                        } else {
                            this.title = i43.r();
                        }
                    }
                }
            }

            public static final class Buttons extends ad9 {
                private static volatile Buttons[] _emptyArray;
                public Button[] button;

                public Buttons() {
                    clear();
                }

                public static Buttons[] emptyArray() {
                    if (_emptyArray == null) {
                        synchronized (bj7.b) {
                            try {
                                if (_emptyArray == null) {
                                    _emptyArray = new Buttons[0];
                                }
                            } catch (Throwable th) {
                                throw th;
                            }
                        }
                    }
                    return _emptyArray;
                }

                public static Buttons parseFrom(byte[] bArr) throws InvalidProtocolBufferNanoException {
                    return (Buttons) ad9.mergeFrom(new Buttons(), bArr);
                }

                public Buttons clear() {
                    this.button = Button.emptyArray();
                    this.cachedSize = -1;
                    return this;
                }

                public int computeSerializedSize() {
                    Button[] buttonArr = this.button;
                    int i = 0;
                    if (buttonArr == null || buttonArr.length <= 0) {
                        return 0;
                    }
                    int i2 = 0;
                    while (true) {
                        Button[] buttonArr2 = this.button;
                        if (i >= buttonArr2.length) {
                            return i2;
                        }
                        Button button2 = buttonArr2[i];
                        if (button2 != null) {
                            i2 = j43.i(1, button2) + i2;
                        }
                        i++;
                    }
                }

                public void writeTo(j43 j43) throws IOException {
                    Button[] buttonArr = this.button;
                    if (buttonArr != null && buttonArr.length > 0) {
                        int i = 0;
                        while (true) {
                            Button[] buttonArr2 = this.button;
                            if (i < buttonArr2.length) {
                                Button button2 = buttonArr2[i];
                                if (button2 != null) {
                                    j43.y(1, button2);
                                }
                                i++;
                            } else {
                                return;
                            }
                        }
                    }
                }

                public static Buttons parseFrom(i43 i43) throws IOException {
                    return new Buttons().mergeFrom(i43);
                }

                public Buttons mergeFrom(i43 i43) throws IOException {
                    while (true) {
                        int s = i43.s();
                        if (s == 0) {
                            return this;
                        }
                        if (s == 10) {
                            int q = ct.q(i43, 10);
                            Button[] buttonArr = this.button;
                            int length = buttonArr == null ? 0 : buttonArr.length;
                            int i = q + length;
                            Button[] buttonArr2 = new Button[i];
                            if (length != 0) {
                                System.arraycopy(buttonArr, 0, buttonArr2, 0, length);
                            }
                            while (length < i - 1) {
                                Button button2 = new Button();
                                buttonArr2[length] = button2;
                                i43.j(button2);
                                i43.s();
                                length++;
                            }
                            Button button3 = new Button();
                            buttonArr2[length] = button3;
                            i43.j(button3);
                            this.button = buttonArr2;
                        } else if (!i43.u(s)) {
                            return this;
                        }
                    }
                }
            }

            public static final class Call extends ad9 {
                public static final int AUDIO = 2;
                public static final int CANCELED = 2;
                public static final int HANGUP = 1;
                public static final int MISSED = 4;
                public static final int REJECTED = 3;
                public static final int UNKNOWN_CALL_TYPE = 0;
                public static final int UNKNOWN_HANGUP_TYPE = 0;
                public static final int VIDEO = 1;
                private static volatile Call[] _emptyArray;
                public int callType;
                public long[] contactIds;
                public String conversationId;
                public int duration;
                public long durationLong;
                public int hangupType;
                public String joinLink;

                public Call() {
                    clear();
                }

                public static Call[] emptyArray() {
                    if (_emptyArray == null) {
                        synchronized (bj7.b) {
                            try {
                                if (_emptyArray == null) {
                                    _emptyArray = new Call[0];
                                }
                            } catch (Throwable th) {
                                throw th;
                            }
                        }
                    }
                    return _emptyArray;
                }

                public static Call parseFrom(byte[] bArr) throws InvalidProtocolBufferNanoException {
                    return (Call) ad9.mergeFrom(new Call(), bArr);
                }

                public Call clear() {
                    this.conversationId = "";
                    this.callType = 0;
                    this.hangupType = 0;
                    this.duration = 0;
                    this.contactIds = ct.e;
                    this.durationLong = 0;
                    this.joinLink = "";
                    this.cachedSize = -1;
                    return this;
                }

                public int computeSerializedSize() {
                    long[] jArr;
                    int i = 0;
                    int l = !this.conversationId.equals("") ? j43.l(1, this.conversationId) : 0;
                    int i2 = this.callType;
                    if (i2 != 0) {
                        l += j43.f(2, i2);
                    }
                    int i3 = this.hangupType;
                    if (i3 != 0) {
                        l += j43.f(3, i3);
                    }
                    int i4 = this.duration;
                    if (i4 != 0) {
                        l += j43.f(4, i4);
                    }
                    long[] jArr2 = this.contactIds;
                    if (jArr2 != null && jArr2.length > 0) {
                        int i5 = 0;
                        while (true) {
                            jArr = this.contactIds;
                            if (i >= jArr.length) {
                                break;
                            }
                            i5 += j43.k(jArr[i]);
                            i++;
                        }
                        l = l + i5 + jArr.length;
                    }
                    long j = this.durationLong;
                    if (j != 0) {
                        l += j43.h(6, j);
                    }
                    return !this.joinLink.equals("") ? l + j43.l(7, this.joinLink) : l;
                }

                public void writeTo(j43 j43) throws IOException {
                    if (!this.conversationId.equals("")) {
                        j43.E(1, this.conversationId);
                    }
                    int i = this.callType;
                    if (i != 0) {
                        j43.w(2, i);
                    }
                    int i2 = this.hangupType;
                    if (i2 != 0) {
                        j43.w(3, i2);
                    }
                    int i3 = this.duration;
                    if (i3 != 0) {
                        j43.w(4, i3);
                    }
                    long[] jArr = this.contactIds;
                    if (jArr != null && jArr.length > 0) {
                        int i4 = 0;
                        while (true) {
                            long[] jArr2 = this.contactIds;
                            if (i4 >= jArr2.length) {
                                break;
                            }
                            j43.x(5, jArr2[i4]);
                            i4++;
                        }
                    }
                    long j = this.durationLong;
                    if (j != 0) {
                        j43.x(6, j);
                    }
                    if (!this.joinLink.equals("")) {
                        j43.E(7, this.joinLink);
                    }
                }

                public static Call parseFrom(i43 i43) throws IOException {
                    return new Call().mergeFrom(i43);
                }

                public Call mergeFrom(i43 i43) throws IOException {
                    while (true) {
                        int s = i43.s();
                        if (s == 0) {
                            return this;
                        }
                        if (s == 10) {
                            this.conversationId = i43.r();
                        } else if (s == 16) {
                            int p = i43.p();
                            if (p == 0 || p == 1 || p == 2) {
                                this.callType = p;
                            }
                        } else if (s == 24) {
                            int p2 = i43.p();
                            if (p2 == 0 || p2 == 1 || p2 == 2 || p2 == 3 || p2 == 4) {
                                this.hangupType = p2;
                            }
                        } else if (s == 32) {
                            this.duration = i43.p();
                        } else if (s == 40) {
                            int q = ct.q(i43, 40);
                            long[] jArr = this.contactIds;
                            int length = jArr == null ? 0 : jArr.length;
                            int i = q + length;
                            long[] jArr2 = new long[i];
                            if (length != 0) {
                                System.arraycopy(jArr, 0, jArr2, 0, length);
                            }
                            while (length < i - 1) {
                                jArr2[length] = i43.q();
                                i43.s();
                                length++;
                            }
                            jArr2[length] = i43.q();
                            this.contactIds = jArr2;
                        } else if (s == 42) {
                            int e = i43.e(i43.p());
                            int c = i43.c();
                            int i2 = 0;
                            while (i43.b() > 0) {
                                i43.q();
                                i2++;
                            }
                            i43.t(c);
                            long[] jArr3 = this.contactIds;
                            int length2 = jArr3 == null ? 0 : jArr3.length;
                            int i3 = i2 + length2;
                            long[] jArr4 = new long[i3];
                            if (length2 != 0) {
                                System.arraycopy(jArr3, 0, jArr4, 0, length2);
                            }
                            while (length2 < i3) {
                                jArr4[length2] = i43.q();
                                length2++;
                            }
                            this.contactIds = jArr4;
                            i43.d(e);
                        } else if (s == 48) {
                            this.durationLong = i43.q();
                        } else if (s == 58) {
                            this.joinLink = i43.r();
                        } else if (!i43.u(s)) {
                            return this;
                        }
                    }
                }
            }

            public static final class Contact extends ad9 {
                private static volatile Contact[] _emptyArray;
                public long contactId;
                public String firstName;
                public String lastName;
                public String localPhotoUrl;
                public String name;
                public String phone;
                public String photoUrl;
                public String vcfBody;

                public Contact() {
                    clear();
                }

                public static Contact[] emptyArray() {
                    if (_emptyArray == null) {
                        synchronized (bj7.b) {
                            try {
                                if (_emptyArray == null) {
                                    _emptyArray = new Contact[0];
                                }
                            } catch (Throwable th) {
                                throw th;
                            }
                        }
                    }
                    return _emptyArray;
                }

                public static Contact parseFrom(byte[] bArr) throws InvalidProtocolBufferNanoException {
                    return (Contact) ad9.mergeFrom(new Contact(), bArr);
                }

                public Contact clear() {
                    this.vcfBody = "";
                    this.contactId = 0;
                    this.name = "";
                    this.phone = "";
                    this.photoUrl = "";
                    this.localPhotoUrl = "";
                    this.firstName = "";
                    this.lastName = "";
                    this.cachedSize = -1;
                    return this;
                }

                public int computeSerializedSize() {
                    int l = !this.vcfBody.equals("") ? j43.l(1, this.vcfBody) : 0;
                    long j = this.contactId;
                    if (j != 0) {
                        l += j43.h(2, j);
                    }
                    if (!this.name.equals("")) {
                        l += j43.l(3, this.name);
                    }
                    if (!this.phone.equals("")) {
                        l += j43.l(4, this.phone);
                    }
                    if (!this.photoUrl.equals("")) {
                        l += j43.l(5, this.photoUrl);
                    }
                    if (!this.localPhotoUrl.equals("")) {
                        l += j43.l(6, this.localPhotoUrl);
                    }
                    if (!this.firstName.equals("")) {
                        l += j43.l(7, this.firstName);
                    }
                    return !this.lastName.equals("") ? l + j43.l(8, this.lastName) : l;
                }

                public void writeTo(j43 j43) throws IOException {
                    if (!this.vcfBody.equals("")) {
                        j43.E(1, this.vcfBody);
                    }
                    long j = this.contactId;
                    if (j != 0) {
                        j43.x(2, j);
                    }
                    if (!this.name.equals("")) {
                        j43.E(3, this.name);
                    }
                    if (!this.phone.equals("")) {
                        j43.E(4, this.phone);
                    }
                    if (!this.photoUrl.equals("")) {
                        j43.E(5, this.photoUrl);
                    }
                    if (!this.localPhotoUrl.equals("")) {
                        j43.E(6, this.localPhotoUrl);
                    }
                    if (!this.firstName.equals("")) {
                        j43.E(7, this.firstName);
                    }
                    if (!this.lastName.equals("")) {
                        j43.E(8, this.lastName);
                    }
                }

                public static Contact parseFrom(i43 i43) throws IOException {
                    return new Contact().mergeFrom(i43);
                }

                public Contact mergeFrom(i43 i43) throws IOException {
                    while (true) {
                        int s = i43.s();
                        if (s == 0) {
                            return this;
                        }
                        if (s == 10) {
                            this.vcfBody = i43.r();
                        } else if (s == 16) {
                            this.contactId = i43.q();
                        } else if (s == 26) {
                            this.name = i43.r();
                        } else if (s == 34) {
                            this.phone = i43.r();
                        } else if (s == 42) {
                            this.photoUrl = i43.r();
                        } else if (s == 50) {
                            this.localPhotoUrl = i43.r();
                        } else if (s == 58) {
                            this.firstName = i43.r();
                        } else if (s == 66) {
                            this.lastName = i43.r();
                        } else if (!i43.u(s)) {
                            return this;
                        }
                    }
                }
            }

            public static final class Control extends ad9 {
                public static final int ADD = 2;
                public static final int BOT_STARTED = 11;
                public static final int CHANNEL_TYPE = 2;
                public static final int CHAT_TYPE = 1;
                public static final int DIALOG = 4;
                public static final int GROUP_CHAT_TYPE = 3;
                public static final int HELLO = 7;
                public static final int ICON = 6;
                public static final int JOIN_BY_LINK = 9;
                public static final int LEAVE = 4;
                public static final int NEW = 1;
                public static final int PIN = 10;
                public static final int REMOVE = 3;
                public static final int SYSTEM = 8;
                public static final int TITLE = 5;
                public static final int UNKNOWN = 0;
                public static final int UNKNOWN_TYPE = 0;
                private static volatile Control[] _emptyArray;
                public int chatType;
                public Rect crop;
                public int event;
                public String fullUrl;
                public String iconToken;
                public String message;
                public long pinnedMessageId;
                public long pinnedMessageServerId;
                public String shortMessage;
                public boolean showHistory;
                public String startPayload;
                public String title;
                public String url;
                public long userId;
                public long[] userIds;

                public Control() {
                    clear();
                }

                public static Control[] emptyArray() {
                    if (_emptyArray == null) {
                        synchronized (bj7.b) {
                            try {
                                if (_emptyArray == null) {
                                    _emptyArray = new Control[0];
                                }
                            } catch (Throwable th) {
                                throw th;
                            }
                        }
                    }
                    return _emptyArray;
                }

                public static Control parseFrom(byte[] bArr) throws InvalidProtocolBufferNanoException {
                    return (Control) ad9.mergeFrom(new Control(), bArr);
                }

                public Control clear() {
                    this.event = 0;
                    this.userId = 0;
                    this.userIds = ct.e;
                    this.title = "";
                    this.iconToken = "";
                    this.url = "";
                    this.crop = null;
                    this.message = "";
                    this.shortMessage = "";
                    this.showHistory = false;
                    this.chatType = 0;
                    this.fullUrl = "";
                    this.pinnedMessageId = 0;
                    this.pinnedMessageServerId = 0;
                    this.startPayload = "";
                    this.cachedSize = -1;
                    return this;
                }

                public int computeSerializedSize() {
                    long[] jArr;
                    int i = this.event;
                    int i2 = 0;
                    int f = i != 0 ? j43.f(1, i) : 0;
                    long j = this.userId;
                    if (j != 0) {
                        f += j43.h(2, j);
                    }
                    long[] jArr2 = this.userIds;
                    if (jArr2 != null && jArr2.length > 0) {
                        int i3 = 0;
                        while (true) {
                            jArr = this.userIds;
                            if (i2 >= jArr.length) {
                                break;
                            }
                            i3 += j43.k(jArr[i2]);
                            i2++;
                        }
                        f = f + i3 + jArr.length;
                    }
                    if (!this.title.equals("")) {
                        f += j43.l(4, this.title);
                    }
                    if (!this.iconToken.equals("")) {
                        f += j43.l(5, this.iconToken);
                    }
                    if (!this.url.equals("")) {
                        f += j43.l(6, this.url);
                    }
                    Rect rect = this.crop;
                    if (rect != null) {
                        f += j43.i(7, rect);
                    }
                    if (!this.message.equals("")) {
                        f += j43.l(8, this.message);
                    }
                    if (!this.shortMessage.equals("")) {
                        f += j43.l(9, this.shortMessage);
                    }
                    if (this.showHistory) {
                        f += j43.a(10);
                    }
                    int i4 = this.chatType;
                    if (i4 != 0) {
                        f += j43.f(11, i4);
                    }
                    if (!this.fullUrl.equals("")) {
                        f += j43.l(12, this.fullUrl);
                    }
                    long j2 = this.pinnedMessageId;
                    if (j2 != 0) {
                        f += j43.h(13, j2);
                    }
                    long j3 = this.pinnedMessageServerId;
                    if (j3 != 0) {
                        f += j43.h(14, j3);
                    }
                    return !this.startPayload.equals("") ? f + j43.l(16, this.startPayload) : f;
                }

                public void writeTo(j43 j43) throws IOException {
                    int i = this.event;
                    if (i != 0) {
                        j43.w(1, i);
                    }
                    long j = this.userId;
                    if (j != 0) {
                        j43.x(2, j);
                    }
                    long[] jArr = this.userIds;
                    if (jArr != null && jArr.length > 0) {
                        int i2 = 0;
                        while (true) {
                            long[] jArr2 = this.userIds;
                            if (i2 >= jArr2.length) {
                                break;
                            }
                            j43.x(3, jArr2[i2]);
                            i2++;
                        }
                    }
                    if (!this.title.equals("")) {
                        j43.E(4, this.title);
                    }
                    if (!this.iconToken.equals("")) {
                        j43.E(5, this.iconToken);
                    }
                    if (!this.url.equals("")) {
                        j43.E(6, this.url);
                    }
                    Rect rect = this.crop;
                    if (rect != null) {
                        j43.y(7, rect);
                    }
                    if (!this.message.equals("")) {
                        j43.E(8, this.message);
                    }
                    if (!this.shortMessage.equals("")) {
                        j43.E(9, this.shortMessage);
                    }
                    boolean z = this.showHistory;
                    if (z) {
                        j43.r(10, z);
                    }
                    int i3 = this.chatType;
                    if (i3 != 0) {
                        j43.w(11, i3);
                    }
                    if (!this.fullUrl.equals("")) {
                        j43.E(12, this.fullUrl);
                    }
                    long j2 = this.pinnedMessageId;
                    if (j2 != 0) {
                        j43.x(13, j2);
                    }
                    long j3 = this.pinnedMessageServerId;
                    if (j3 != 0) {
                        j43.x(14, j3);
                    }
                    if (!this.startPayload.equals("")) {
                        j43.E(16, this.startPayload);
                    }
                }

                public static Control parseFrom(i43 i43) throws IOException {
                    return new Control().mergeFrom(i43);
                }

                public Control mergeFrom(i43 i43) throws IOException {
                    while (true) {
                        int s = i43.s();
                        switch (s) {
                            case 0:
                                return this;
                            case 8:
                                int p = i43.p();
                                switch (p) {
                                    case 0:
                                    case 1:
                                    case 2:
                                    case 3:
                                    case 4:
                                    case 5:
                                    case 6:
                                    case 7:
                                    case 8:
                                    case 9:
                                    case 10:
                                    case 11:
                                        this.event = p;
                                        break;
                                }
                            case 16:
                                this.userId = i43.q();
                                break;
                            case SavedMessagesIconDrawable.NORMAL_ICON_SIZE:
                                int q = ct.q(i43, 24);
                                long[] jArr = this.userIds;
                                int length = jArr == null ? 0 : jArr.length;
                                int i = q + length;
                                long[] jArr2 = new long[i];
                                if (length != 0) {
                                    System.arraycopy(jArr, 0, jArr2, 0, length);
                                }
                                while (length < i - 1) {
                                    jArr2[length] = i43.q();
                                    i43.s();
                                    length++;
                                }
                                jArr2[length] = i43.q();
                                this.userIds = jArr2;
                                break;
                            case 26:
                                int e = i43.e(i43.p());
                                int c = i43.c();
                                int i2 = 0;
                                while (i43.b() > 0) {
                                    i43.q();
                                    i2++;
                                }
                                i43.t(c);
                                long[] jArr3 = this.userIds;
                                int length2 = jArr3 == null ? 0 : jArr3.length;
                                int i3 = i2 + length2;
                                long[] jArr4 = new long[i3];
                                if (length2 != 0) {
                                    System.arraycopy(jArr3, 0, jArr4, 0, length2);
                                }
                                while (length2 < i3) {
                                    jArr4[length2] = i43.q();
                                    length2++;
                                }
                                this.userIds = jArr4;
                                i43.d(e);
                                break;
                            case 34:
                                this.title = i43.r();
                                break;
                            case 42:
                                this.iconToken = i43.r();
                                break;
                            case 50:
                                this.url = i43.r();
                                break;
                            case 58:
                                if (this.crop == null) {
                                    this.crop = new Rect();
                                }
                                i43.j(this.crop);
                                break;
                            case 66:
                                this.message = i43.r();
                                break;
                            case 74:
                                this.shortMessage = i43.r();
                                break;
                            case 80:
                                this.showHistory = i43.f();
                                break;
                            case 88:
                                int p2 = i43.p();
                                if (p2 != 0 && p2 != 1 && p2 != 2 && p2 != 3 && p2 != 4) {
                                    break;
                                } else {
                                    this.chatType = p2;
                                    break;
                                }
                            case 98:
                                this.fullUrl = i43.r();
                                break;
                            case 104:
                                this.pinnedMessageId = i43.q();
                                break;
                            case 112:
                                this.pinnedMessageServerId = i43.q();
                                break;
                            case 130:
                                this.startPayload = i43.r();
                                break;
                            default:
                                if (i43.u(s)) {
                                    break;
                                } else {
                                    return this;
                                }
                        }
                    }
                }
            }

            public static final class File extends ad9 {
                private static volatile File[] _emptyArray;
                public long fileId;
                public String name;
                public Attach preview;
                public long size;
                public String token;

                public File() {
                    clear();
                }

                public static File[] emptyArray() {
                    if (_emptyArray == null) {
                        synchronized (bj7.b) {
                            try {
                                if (_emptyArray == null) {
                                    _emptyArray = new File[0];
                                }
                            } catch (Throwable th) {
                                throw th;
                            }
                        }
                    }
                    return _emptyArray;
                }

                public static File parseFrom(byte[] bArr) throws InvalidProtocolBufferNanoException {
                    return (File) ad9.mergeFrom(new File(), bArr);
                }

                public File clear() {
                    this.fileId = 0;
                    this.size = 0;
                    this.name = "";
                    this.preview = null;
                    this.token = "";
                    this.cachedSize = -1;
                    return this;
                }

                public int computeSerializedSize() {
                    long j = this.fileId;
                    int h = j != 0 ? j43.h(1, j) : 0;
                    long j2 = this.size;
                    if (j2 != 0) {
                        h += j43.h(2, j2);
                    }
                    if (!this.name.equals("")) {
                        h += j43.l(3, this.name);
                    }
                    Attach attach = this.preview;
                    if (attach != null) {
                        h += j43.i(4, attach);
                    }
                    return !this.token.equals("") ? h + j43.l(5, this.token) : h;
                }

                public void writeTo(j43 j43) throws IOException {
                    long j = this.fileId;
                    if (j != 0) {
                        j43.x(1, j);
                    }
                    long j2 = this.size;
                    if (j2 != 0) {
                        j43.x(2, j2);
                    }
                    if (!this.name.equals("")) {
                        j43.E(3, this.name);
                    }
                    Attach attach = this.preview;
                    if (attach != null) {
                        j43.y(4, attach);
                    }
                    if (!this.token.equals("")) {
                        j43.E(5, this.token);
                    }
                }

                public static File parseFrom(i43 i43) throws IOException {
                    return new File().mergeFrom(i43);
                }

                public File mergeFrom(i43 i43) throws IOException {
                    while (true) {
                        int s = i43.s();
                        if (s == 0) {
                            return this;
                        }
                        if (s == 8) {
                            this.fileId = i43.q();
                        } else if (s == 16) {
                            this.size = i43.q();
                        } else if (s == 26) {
                            this.name = i43.r();
                        } else if (s == 34) {
                            if (this.preview == null) {
                                this.preview = new Attach();
                            }
                            i43.j(this.preview);
                        } else if (s == 42) {
                            this.token = i43.r();
                        } else if (!i43.u(s)) {
                            return this;
                        }
                    }
                }
            }

            public static final class InlineKeyboard extends ad9 {
                private static volatile InlineKeyboard[] _emptyArray;
                public Buttons[] buttons;
                public String callbackId;

                public InlineKeyboard() {
                    clear();
                }

                public static InlineKeyboard[] emptyArray() {
                    if (_emptyArray == null) {
                        synchronized (bj7.b) {
                            try {
                                if (_emptyArray == null) {
                                    _emptyArray = new InlineKeyboard[0];
                                }
                            } catch (Throwable th) {
                                throw th;
                            }
                        }
                    }
                    return _emptyArray;
                }

                public static InlineKeyboard parseFrom(byte[] bArr) throws InvalidProtocolBufferNanoException {
                    return (InlineKeyboard) ad9.mergeFrom(new InlineKeyboard(), bArr);
                }

                public InlineKeyboard clear() {
                    this.buttons = Buttons.emptyArray();
                    this.callbackId = "";
                    this.cachedSize = -1;
                    return this;
                }

                public int computeSerializedSize() {
                    Buttons[] buttonsArr = this.buttons;
                    int i = 0;
                    if (buttonsArr != null && buttonsArr.length > 0) {
                        int i2 = 0;
                        while (true) {
                            Buttons[] buttonsArr2 = this.buttons;
                            if (i >= buttonsArr2.length) {
                                break;
                            }
                            Buttons buttons2 = buttonsArr2[i];
                            if (buttons2 != null) {
                                i2 = j43.i(1, buttons2) + i2;
                            }
                            i++;
                        }
                        i = i2;
                    }
                    return !this.callbackId.equals("") ? i + j43.l(2, this.callbackId) : i;
                }

                public void writeTo(j43 j43) throws IOException {
                    Buttons[] buttonsArr = this.buttons;
                    if (buttonsArr != null && buttonsArr.length > 0) {
                        int i = 0;
                        while (true) {
                            Buttons[] buttonsArr2 = this.buttons;
                            if (i >= buttonsArr2.length) {
                                break;
                            }
                            Buttons buttons2 = buttonsArr2[i];
                            if (buttons2 != null) {
                                j43.y(1, buttons2);
                            }
                            i++;
                        }
                    }
                    if (!this.callbackId.equals("")) {
                        j43.E(2, this.callbackId);
                    }
                }

                public static InlineKeyboard parseFrom(i43 i43) throws IOException {
                    return new InlineKeyboard().mergeFrom(i43);
                }

                public InlineKeyboard mergeFrom(i43 i43) throws IOException {
                    while (true) {
                        int s = i43.s();
                        if (s == 0) {
                            return this;
                        }
                        if (s == 10) {
                            int q = ct.q(i43, 10);
                            Buttons[] buttonsArr = this.buttons;
                            int length = buttonsArr == null ? 0 : buttonsArr.length;
                            int i = q + length;
                            Buttons[] buttonsArr2 = new Buttons[i];
                            if (length != 0) {
                                System.arraycopy(buttonsArr, 0, buttonsArr2, 0, length);
                            }
                            while (length < i - 1) {
                                Buttons buttons2 = new Buttons();
                                buttonsArr2[length] = buttons2;
                                i43.j(buttons2);
                                i43.s();
                                length++;
                            }
                            Buttons buttons3 = new Buttons();
                            buttonsArr2[length] = buttons3;
                            i43.j(buttons3);
                            this.buttons = buttonsArr2;
                        } else if (s == 18) {
                            this.callbackId = i43.r();
                        } else if (!i43.u(s)) {
                            return this;
                        }
                    }
                }
            }

            public static final class Location extends ad9 {
                private static volatile Location[] _emptyArray;
                public float accuracy;
                public double altitude;
                public float bearing;
                public boolean corrupted;
                public String deviceId;
                public long endTime;
                public LocationInfo lastLocation;
                public double latitude;
                public long livePeriod;
                public double longitude;
                public float speed;
                public long startTime;
                public LocationInfo[] track;
                public long ttl;
                public float zoom;

                public Location() {
                    clear();
                }

                public static Location[] emptyArray() {
                    if (_emptyArray == null) {
                        synchronized (bj7.b) {
                            try {
                                if (_emptyArray == null) {
                                    _emptyArray = new Location[0];
                                }
                            } catch (Throwable th) {
                                throw th;
                            }
                        }
                    }
                    return _emptyArray;
                }

                public static Location parseFrom(byte[] bArr) throws InvalidProtocolBufferNanoException {
                    return (Location) ad9.mergeFrom(new Location(), bArr);
                }

                public Location clear() {
                    this.latitude = 0.0d;
                    this.longitude = 0.0d;
                    this.zoom = c44.DEFAULT_ASPECT_RATIO;
                    this.ttl = 0;
                    this.livePeriod = 0;
                    this.track = LocationInfo.emptyArray();
                    this.deviceId = "";
                    this.lastLocation = null;
                    this.altitude = 0.0d;
                    this.accuracy = c44.DEFAULT_ASPECT_RATIO;
                    this.bearing = c44.DEFAULT_ASPECT_RATIO;
                    this.speed = c44.DEFAULT_ASPECT_RATIO;
                    this.corrupted = false;
                    this.startTime = 0;
                    this.endTime = 0;
                    this.cachedSize = -1;
                    return this;
                }

                public int computeSerializedSize() {
                    int i = 0;
                    int c = Double.doubleToLongBits(this.latitude) != Double.doubleToLongBits(0.0d) ? j43.c(1) : 0;
                    if (Double.doubleToLongBits(this.longitude) != Double.doubleToLongBits(0.0d)) {
                        c += j43.c(2);
                    }
                    if (Float.floatToIntBits(this.zoom) != Float.floatToIntBits(c44.DEFAULT_ASPECT_RATIO)) {
                        c += j43.e(3);
                    }
                    long j = this.ttl;
                    if (j != 0) {
                        c += j43.h(4, j);
                    }
                    long j2 = this.livePeriod;
                    if (j2 != 0) {
                        c += j43.h(5, j2);
                    }
                    LocationInfo[] locationInfoArr = this.track;
                    if (locationInfoArr != null && locationInfoArr.length > 0) {
                        while (true) {
                            LocationInfo[] locationInfoArr2 = this.track;
                            if (i >= locationInfoArr2.length) {
                                break;
                            }
                            LocationInfo locationInfo = locationInfoArr2[i];
                            if (locationInfo != null) {
                                c = j43.i(6, locationInfo) + c;
                            }
                            i++;
                        }
                    }
                    if (!this.deviceId.equals("")) {
                        c += j43.l(7, this.deviceId);
                    }
                    LocationInfo locationInfo2 = this.lastLocation;
                    if (locationInfo2 != null) {
                        c += j43.i(8, locationInfo2);
                    }
                    if (Double.doubleToLongBits(this.altitude) != Double.doubleToLongBits(0.0d)) {
                        c += j43.c(9);
                    }
                    if (Float.floatToIntBits(this.accuracy) != Float.floatToIntBits(c44.DEFAULT_ASPECT_RATIO)) {
                        c += j43.e(10);
                    }
                    if (Float.floatToIntBits(this.bearing) != Float.floatToIntBits(c44.DEFAULT_ASPECT_RATIO)) {
                        c += j43.e(11);
                    }
                    if (Float.floatToIntBits(this.speed) != Float.floatToIntBits(c44.DEFAULT_ASPECT_RATIO)) {
                        c += j43.e(12);
                    }
                    if (this.corrupted) {
                        c += j43.a(13);
                    }
                    long j3 = this.startTime;
                    if (j3 != 0) {
                        c += j43.h(14, j3);
                    }
                    long j4 = this.endTime;
                    return j4 != 0 ? c + j43.h(15, j4) : c;
                }

                public void writeTo(j43 j43) throws IOException {
                    if (Double.doubleToLongBits(this.latitude) != Double.doubleToLongBits(0.0d)) {
                        j43.t(this.latitude, 1);
                    }
                    if (Double.doubleToLongBits(this.longitude) != Double.doubleToLongBits(0.0d)) {
                        j43.t(this.longitude, 2);
                    }
                    if (Float.floatToIntBits(this.zoom) != Float.floatToIntBits(c44.DEFAULT_ASPECT_RATIO)) {
                        j43.v(this.zoom, 3);
                    }
                    long j = this.ttl;
                    if (j != 0) {
                        j43.x(4, j);
                    }
                    long j2 = this.livePeriod;
                    if (j2 != 0) {
                        j43.x(5, j2);
                    }
                    LocationInfo[] locationInfoArr = this.track;
                    if (locationInfoArr != null && locationInfoArr.length > 0) {
                        int i = 0;
                        while (true) {
                            LocationInfo[] locationInfoArr2 = this.track;
                            if (i >= locationInfoArr2.length) {
                                break;
                            }
                            LocationInfo locationInfo = locationInfoArr2[i];
                            if (locationInfo != null) {
                                j43.y(6, locationInfo);
                            }
                            i++;
                        }
                    }
                    if (!this.deviceId.equals("")) {
                        j43.E(7, this.deviceId);
                    }
                    LocationInfo locationInfo2 = this.lastLocation;
                    if (locationInfo2 != null) {
                        j43.y(8, locationInfo2);
                    }
                    if (Double.doubleToLongBits(this.altitude) != Double.doubleToLongBits(0.0d)) {
                        j43.t(this.altitude, 9);
                    }
                    if (Float.floatToIntBits(this.accuracy) != Float.floatToIntBits(c44.DEFAULT_ASPECT_RATIO)) {
                        j43.v(this.accuracy, 10);
                    }
                    if (Float.floatToIntBits(this.bearing) != Float.floatToIntBits(c44.DEFAULT_ASPECT_RATIO)) {
                        j43.v(this.bearing, 11);
                    }
                    if (Float.floatToIntBits(this.speed) != Float.floatToIntBits(c44.DEFAULT_ASPECT_RATIO)) {
                        j43.v(this.speed, 12);
                    }
                    boolean z = this.corrupted;
                    if (z) {
                        j43.r(13, z);
                    }
                    long j3 = this.startTime;
                    if (j3 != 0) {
                        j43.x(14, j3);
                    }
                    long j4 = this.endTime;
                    if (j4 != 0) {
                        j43.x(15, j4);
                    }
                }

                public static Location parseFrom(i43 i43) throws IOException {
                    return new Location().mergeFrom(i43);
                }

                public Location mergeFrom(i43 i43) throws IOException {
                    while (true) {
                        int s = i43.s();
                        switch (s) {
                            case 0:
                                return this;
                            case 9:
                                this.latitude = i43.h();
                                break;
                            case LangUtils.HASH_SEED:
                                this.longitude = i43.h();
                                break;
                            case 29:
                                this.zoom = i43.i();
                                break;
                            case 32:
                                this.ttl = i43.q();
                                break;
                            case SavedMessagesIconDrawable.SMALL_SIZE:
                                this.livePeriod = i43.q();
                                break;
                            case 50:
                                int q = ct.q(i43, 50);
                                LocationInfo[] locationInfoArr = this.track;
                                int length = locationInfoArr == null ? 0 : locationInfoArr.length;
                                int i = q + length;
                                LocationInfo[] locationInfoArr2 = new LocationInfo[i];
                                if (length != 0) {
                                    System.arraycopy(locationInfoArr, 0, locationInfoArr2, 0, length);
                                }
                                while (length < i - 1) {
                                    LocationInfo locationInfo = new LocationInfo();
                                    locationInfoArr2[length] = locationInfo;
                                    i43.j(locationInfo);
                                    i43.s();
                                    length++;
                                }
                                LocationInfo locationInfo2 = new LocationInfo();
                                locationInfoArr2[length] = locationInfo2;
                                i43.j(locationInfo2);
                                this.track = locationInfoArr2;
                                break;
                            case 58:
                                this.deviceId = i43.r();
                                break;
                            case 66:
                                if (this.lastLocation == null) {
                                    this.lastLocation = new LocationInfo();
                                }
                                i43.j(this.lastLocation);
                                break;
                            case 73:
                                this.altitude = i43.h();
                                break;
                            case 85:
                                this.accuracy = i43.i();
                                break;
                            case 93:
                                this.bearing = i43.i();
                                break;
                            case HttpStatus.SC_SWITCHING_PROTOCOLS:
                                this.speed = i43.i();
                                break;
                            case 104:
                                this.corrupted = i43.f();
                                break;
                            case 112:
                                this.startTime = i43.q();
                                break;
                            case 120:
                                this.endTime = i43.q();
                                break;
                            default:
                                if (i43.u(s)) {
                                    break;
                                } else {
                                    return this;
                                }
                        }
                    }
                }
            }

            public static final class Photo extends ad9 {
                private static volatile Photo[] _emptyArray;
                public String baseUrl;
                public String externalGifId;
                public boolean gif;
                public int height;
                public String mp4Url;
                public long photoId;
                public String photoToken;
                public String photoUrl;
                public byte[] previewData;
                public String previewUrl;
                public int width;

                public Photo() {
                    clear();
                }

                public static Photo[] emptyArray() {
                    if (_emptyArray == null) {
                        synchronized (bj7.b) {
                            try {
                                if (_emptyArray == null) {
                                    _emptyArray = new Photo[0];
                                }
                            } catch (Throwable th) {
                                throw th;
                            }
                        }
                    }
                    return _emptyArray;
                }

                public static Photo parseFrom(byte[] bArr) throws InvalidProtocolBufferNanoException {
                    return (Photo) ad9.mergeFrom(new Photo(), bArr);
                }

                public Photo clear() {
                    this.photoUrl = "";
                    this.width = 0;
                    this.height = 0;
                    this.gif = false;
                    this.previewData = ct.h;
                    this.photoToken = "";
                    this.photoId = 0;
                    this.mp4Url = "";
                    this.baseUrl = "";
                    this.externalGifId = "";
                    this.previewUrl = "";
                    this.cachedSize = -1;
                    return this;
                }

                public int computeSerializedSize() {
                    int l = !this.photoUrl.equals("") ? j43.l(1, this.photoUrl) : 0;
                    int i = this.width;
                    if (i != 0) {
                        l += j43.f(2, i);
                    }
                    int i2 = this.height;
                    if (i2 != 0) {
                        l += j43.f(3, i2);
                    }
                    if (this.gif) {
                        l += j43.a(4);
                    }
                    if (!Arrays.equals(this.previewData, ct.h)) {
                        l += j43.b(5, this.previewData);
                    }
                    if (!this.photoToken.equals("")) {
                        l += j43.l(6, this.photoToken);
                    }
                    long j = this.photoId;
                    if (j != 0) {
                        l += j43.h(7, j);
                    }
                    if (!this.mp4Url.equals("")) {
                        l += j43.l(8, this.mp4Url);
                    }
                    if (!this.baseUrl.equals("")) {
                        l += j43.l(10, this.baseUrl);
                    }
                    if (!this.externalGifId.equals("")) {
                        l += j43.l(11, this.externalGifId);
                    }
                    return !this.previewUrl.equals("") ? l + j43.l(12, this.previewUrl) : l;
                }

                public void writeTo(j43 j43) throws IOException {
                    if (!this.photoUrl.equals("")) {
                        j43.E(1, this.photoUrl);
                    }
                    int i = this.width;
                    if (i != 0) {
                        j43.w(2, i);
                    }
                    int i2 = this.height;
                    if (i2 != 0) {
                        j43.w(3, i2);
                    }
                    boolean z = this.gif;
                    if (z) {
                        j43.r(4, z);
                    }
                    if (!Arrays.equals(this.previewData, ct.h)) {
                        j43.s(5, this.previewData);
                    }
                    if (!this.photoToken.equals("")) {
                        j43.E(6, this.photoToken);
                    }
                    long j = this.photoId;
                    if (j != 0) {
                        j43.x(7, j);
                    }
                    if (!this.mp4Url.equals("")) {
                        j43.E(8, this.mp4Url);
                    }
                    if (!this.baseUrl.equals("")) {
                        j43.E(10, this.baseUrl);
                    }
                    if (!this.externalGifId.equals("")) {
                        j43.E(11, this.externalGifId);
                    }
                    if (!this.previewUrl.equals("")) {
                        j43.E(12, this.previewUrl);
                    }
                }

                public static Photo parseFrom(i43 i43) throws IOException {
                    return new Photo().mergeFrom(i43);
                }

                public Photo mergeFrom(i43 i43) throws IOException {
                    while (true) {
                        int s = i43.s();
                        switch (s) {
                            case 0:
                                return this;
                            case 10:
                                this.photoUrl = i43.r();
                                break;
                            case 16:
                                this.width = i43.p();
                                break;
                            case SavedMessagesIconDrawable.NORMAL_ICON_SIZE:
                                this.height = i43.p();
                                break;
                            case 32:
                                this.gif = i43.f();
                                break;
                            case 42:
                                this.previewData = i43.g();
                                break;
                            case 50:
                                this.photoToken = i43.r();
                                break;
                            case 56:
                                this.photoId = i43.q();
                                break;
                            case 66:
                                this.mp4Url = i43.r();
                                break;
                            case 82:
                                this.baseUrl = i43.r();
                                break;
                            case 90:
                                this.externalGifId = i43.r();
                                break;
                            case 98:
                                this.previewUrl = i43.r();
                                break;
                            default:
                                if (i43.u(s)) {
                                    break;
                                } else {
                                    return this;
                                }
                        }
                    }
                }
            }

            public static final class Present extends ad9 {
                public static final int ACCEPTED = 3;
                public static final int ACCEPTING = 5;
                public static final int DECLINED = 4;
                public static final int NEW = 1;
                public static final int RECEIVED = 2;
                public static final int UNKNOWN = 0;
                private static volatile Present[] _emptyArray;
                public long metadataId;
                public long presentId;
                public String presentJson;
                public long receiverId;
                public long senderId;
                public int status;

                public Present() {
                    clear();
                }

                public static Present[] emptyArray() {
                    if (_emptyArray == null) {
                        synchronized (bj7.b) {
                            try {
                                if (_emptyArray == null) {
                                    _emptyArray = new Present[0];
                                }
                            } catch (Throwable th) {
                                throw th;
                            }
                        }
                    }
                    return _emptyArray;
                }

                public static Present parseFrom(byte[] bArr) throws InvalidProtocolBufferNanoException {
                    return (Present) ad9.mergeFrom(new Present(), bArr);
                }

                public Present clear() {
                    this.presentId = 0;
                    this.metadataId = 0;
                    this.senderId = 0;
                    this.receiverId = 0;
                    this.status = 0;
                    this.presentJson = "";
                    this.cachedSize = -1;
                    return this;
                }

                public int computeSerializedSize() {
                    long j = this.presentId;
                    int h = j != 0 ? j43.h(1, j) : 0;
                    long j2 = this.metadataId;
                    if (j2 != 0) {
                        h += j43.h(2, j2);
                    }
                    long j3 = this.senderId;
                    if (j3 != 0) {
                        h += j43.h(3, j3);
                    }
                    long j4 = this.receiverId;
                    if (j4 != 0) {
                        h += j43.h(4, j4);
                    }
                    int i = this.status;
                    if (i != 0) {
                        h += j43.f(5, i);
                    }
                    return !this.presentJson.equals("") ? h + j43.l(6, this.presentJson) : h;
                }

                public void writeTo(j43 j43) throws IOException {
                    long j = this.presentId;
                    if (j != 0) {
                        j43.x(1, j);
                    }
                    long j2 = this.metadataId;
                    if (j2 != 0) {
                        j43.x(2, j2);
                    }
                    long j3 = this.senderId;
                    if (j3 != 0) {
                        j43.x(3, j3);
                    }
                    long j4 = this.receiverId;
                    if (j4 != 0) {
                        j43.x(4, j4);
                    }
                    int i = this.status;
                    if (i != 0) {
                        j43.w(5, i);
                    }
                    if (!this.presentJson.equals("")) {
                        j43.E(6, this.presentJson);
                    }
                }

                public static Present parseFrom(i43 i43) throws IOException {
                    return new Present().mergeFrom(i43);
                }

                public Present mergeFrom(i43 i43) throws IOException {
                    while (true) {
                        int s = i43.s();
                        if (s == 0) {
                            return this;
                        }
                        if (s == 8) {
                            this.presentId = i43.q();
                        } else if (s == 16) {
                            this.metadataId = i43.q();
                        } else if (s == 24) {
                            this.senderId = i43.q();
                        } else if (s == 32) {
                            this.receiverId = i43.q();
                        } else if (s == 40) {
                            int p = i43.p();
                            if (p == 0 || p == 1 || p == 2 || p == 3 || p == 4 || p == 5) {
                                this.status = p;
                            }
                        } else if (s == 50) {
                            this.presentJson = i43.r();
                        } else if (!i43.u(s)) {
                            return this;
                        }
                    }
                }
            }

            public static final class Rect extends ad9 {
                private static volatile Rect[] _emptyArray;
                public float bottom;
                public float left;
                public float right;
                public float top;

                public Rect() {
                    clear();
                }

                public static Rect[] emptyArray() {
                    if (_emptyArray == null) {
                        synchronized (bj7.b) {
                            try {
                                if (_emptyArray == null) {
                                    _emptyArray = new Rect[0];
                                }
                            } catch (Throwable th) {
                                throw th;
                            }
                        }
                    }
                    return _emptyArray;
                }

                public static Rect parseFrom(byte[] bArr) throws InvalidProtocolBufferNanoException {
                    return (Rect) ad9.mergeFrom(new Rect(), bArr);
                }

                public Rect clear() {
                    this.left = c44.DEFAULT_ASPECT_RATIO;
                    this.top = c44.DEFAULT_ASPECT_RATIO;
                    this.right = c44.DEFAULT_ASPECT_RATIO;
                    this.bottom = c44.DEFAULT_ASPECT_RATIO;
                    this.cachedSize = -1;
                    return this;
                }

                public int computeSerializedSize() {
                    int e = Float.floatToIntBits(this.left) != Float.floatToIntBits(c44.DEFAULT_ASPECT_RATIO) ? j43.e(1) : 0;
                    if (Float.floatToIntBits(this.top) != Float.floatToIntBits(c44.DEFAULT_ASPECT_RATIO)) {
                        e += j43.e(2);
                    }
                    if (Float.floatToIntBits(this.right) != Float.floatToIntBits(c44.DEFAULT_ASPECT_RATIO)) {
                        e += j43.e(3);
                    }
                    return Float.floatToIntBits(this.bottom) != Float.floatToIntBits(c44.DEFAULT_ASPECT_RATIO) ? e + j43.e(4) : e;
                }

                public void writeTo(j43 j43) throws IOException {
                    if (Float.floatToIntBits(this.left) != Float.floatToIntBits(c44.DEFAULT_ASPECT_RATIO)) {
                        j43.v(this.left, 1);
                    }
                    if (Float.floatToIntBits(this.top) != Float.floatToIntBits(c44.DEFAULT_ASPECT_RATIO)) {
                        j43.v(this.top, 2);
                    }
                    if (Float.floatToIntBits(this.right) != Float.floatToIntBits(c44.DEFAULT_ASPECT_RATIO)) {
                        j43.v(this.right, 3);
                    }
                    if (Float.floatToIntBits(this.bottom) != Float.floatToIntBits(c44.DEFAULT_ASPECT_RATIO)) {
                        j43.v(this.bottom, 4);
                    }
                }

                public static Rect parseFrom(i43 i43) throws IOException {
                    return new Rect().mergeFrom(i43);
                }

                public Rect mergeFrom(i43 i43) throws IOException {
                    while (true) {
                        int s = i43.s();
                        if (s == 0) {
                            return this;
                        }
                        if (s == 13) {
                            this.left = i43.i();
                        } else if (s == 21) {
                            this.top = i43.i();
                        } else if (s == 29) {
                            this.right = i43.i();
                        } else if (s == 37) {
                            this.bottom = i43.i();
                        } else if (!i43.u(s)) {
                            return this;
                        }
                    }
                }
            }

            public static final class ReplyButton extends ad9 {
                public static final int CONTACT = 2;
                public static final int DEFAULT = 0;
                public static final int IMAGE = 1;
                public static final int LOCATION = 3;
                public static final int MESSAGE = 0;
                public static final int NEGATIVE = 2;
                public static final int POSITIVE = 1;
                public static final int UNKNOWN = 4;
                public static final int UNKNOWN_INTENT = 3;
                private static volatile ReplyButton[] _emptyArray;
                public Photo image;
                public int intent;
                public long outgoingMessageId;
                public String text;
                public int type;

                public ReplyButton() {
                    clear();
                }

                public static ReplyButton[] emptyArray() {
                    if (_emptyArray == null) {
                        synchronized (bj7.b) {
                            try {
                                if (_emptyArray == null) {
                                    _emptyArray = new ReplyButton[0];
                                }
                            } catch (Throwable th) {
                                throw th;
                            }
                        }
                    }
                    return _emptyArray;
                }

                public static ReplyButton parseFrom(byte[] bArr) throws InvalidProtocolBufferNanoException {
                    return (ReplyButton) ad9.mergeFrom(new ReplyButton(), bArr);
                }

                public ReplyButton clear() {
                    this.text = "";
                    this.type = 0;
                    this.intent = 0;
                    this.image = null;
                    this.outgoingMessageId = 0;
                    this.cachedSize = -1;
                    return this;
                }

                public int computeSerializedSize() {
                    int l = !this.text.equals("") ? j43.l(1, this.text) : 0;
                    int i = this.type;
                    if (i != 0) {
                        l += j43.f(2, i);
                    }
                    int i2 = this.intent;
                    if (i2 != 0) {
                        l += j43.f(3, i2);
                    }
                    Photo photo = this.image;
                    if (photo != null) {
                        l += j43.i(4, photo);
                    }
                    long j = this.outgoingMessageId;
                    return j != 0 ? l + j43.h(5, j) : l;
                }

                public void writeTo(j43 j43) throws IOException {
                    if (!this.text.equals("")) {
                        j43.E(1, this.text);
                    }
                    int i = this.type;
                    if (i != 0) {
                        j43.w(2, i);
                    }
                    int i2 = this.intent;
                    if (i2 != 0) {
                        j43.w(3, i2);
                    }
                    Photo photo = this.image;
                    if (photo != null) {
                        j43.y(4, photo);
                    }
                    long j = this.outgoingMessageId;
                    if (j != 0) {
                        j43.x(5, j);
                    }
                }

                public static ReplyButton parseFrom(i43 i43) throws IOException {
                    return new ReplyButton().mergeFrom(i43);
                }

                public ReplyButton mergeFrom(i43 i43) throws IOException {
                    while (true) {
                        int s = i43.s();
                        if (s == 0) {
                            return this;
                        }
                        if (s == 10) {
                            this.text = i43.r();
                        } else if (s == 16) {
                            int p = i43.p();
                            if (p == 0 || p == 1 || p == 2 || p == 3 || p == 4) {
                                this.type = p;
                            }
                        } else if (s == 24) {
                            int p2 = i43.p();
                            if (p2 == 0 || p2 == 1 || p2 == 2 || p2 == 3) {
                                this.intent = p2;
                            }
                        } else if (s == 34) {
                            if (this.image == null) {
                                this.image = new Photo();
                            }
                            i43.j(this.image);
                        } else if (s == 40) {
                            this.outgoingMessageId = i43.q();
                        } else if (!i43.u(s)) {
                            return this;
                        }
                    }
                }
            }

            public static final class ReplyButtons extends ad9 {
                private static volatile ReplyButtons[] _emptyArray;
                public ReplyButton[] replyButton;

                public ReplyButtons() {
                    clear();
                }

                public static ReplyButtons[] emptyArray() {
                    if (_emptyArray == null) {
                        synchronized (bj7.b) {
                            try {
                                if (_emptyArray == null) {
                                    _emptyArray = new ReplyButtons[0];
                                }
                            } catch (Throwable th) {
                                throw th;
                            }
                        }
                    }
                    return _emptyArray;
                }

                public static ReplyButtons parseFrom(byte[] bArr) throws InvalidProtocolBufferNanoException {
                    return (ReplyButtons) ad9.mergeFrom(new ReplyButtons(), bArr);
                }

                public ReplyButtons clear() {
                    this.replyButton = ReplyButton.emptyArray();
                    this.cachedSize = -1;
                    return this;
                }

                public int computeSerializedSize() {
                    ReplyButton[] replyButtonArr = this.replyButton;
                    int i = 0;
                    if (replyButtonArr == null || replyButtonArr.length <= 0) {
                        return 0;
                    }
                    int i2 = 0;
                    while (true) {
                        ReplyButton[] replyButtonArr2 = this.replyButton;
                        if (i >= replyButtonArr2.length) {
                            return i2;
                        }
                        ReplyButton replyButton2 = replyButtonArr2[i];
                        if (replyButton2 != null) {
                            i2 = j43.i(1, replyButton2) + i2;
                        }
                        i++;
                    }
                }

                public void writeTo(j43 j43) throws IOException {
                    ReplyButton[] replyButtonArr = this.replyButton;
                    if (replyButtonArr != null && replyButtonArr.length > 0) {
                        int i = 0;
                        while (true) {
                            ReplyButton[] replyButtonArr2 = this.replyButton;
                            if (i < replyButtonArr2.length) {
                                ReplyButton replyButton2 = replyButtonArr2[i];
                                if (replyButton2 != null) {
                                    j43.y(1, replyButton2);
                                }
                                i++;
                            } else {
                                return;
                            }
                        }
                    }
                }

                public static ReplyButtons parseFrom(i43 i43) throws IOException {
                    return new ReplyButtons().mergeFrom(i43);
                }

                public ReplyButtons mergeFrom(i43 i43) throws IOException {
                    while (true) {
                        int s = i43.s();
                        if (s == 0) {
                            return this;
                        }
                        if (s == 10) {
                            int q = ct.q(i43, 10);
                            ReplyButton[] replyButtonArr = this.replyButton;
                            int length = replyButtonArr == null ? 0 : replyButtonArr.length;
                            int i = q + length;
                            ReplyButton[] replyButtonArr2 = new ReplyButton[i];
                            if (length != 0) {
                                System.arraycopy(replyButtonArr, 0, replyButtonArr2, 0, length);
                            }
                            while (length < i - 1) {
                                ReplyButton replyButton2 = new ReplyButton();
                                replyButtonArr2[length] = replyButton2;
                                i43.j(replyButton2);
                                i43.s();
                                length++;
                            }
                            ReplyButton replyButton3 = new ReplyButton();
                            replyButtonArr2[length] = replyButton3;
                            i43.j(replyButton3);
                            this.replyButton = replyButtonArr2;
                        } else if (!i43.u(s)) {
                            return this;
                        }
                    }
                }
            }

            public static final class ReplyKeyboard extends ad9 {
                private static volatile ReplyKeyboard[] _emptyArray;
                public ReplyButtons[] buttons;
                public boolean defaultInputDisabled;

                public ReplyKeyboard() {
                    clear();
                }

                public static ReplyKeyboard[] emptyArray() {
                    if (_emptyArray == null) {
                        synchronized (bj7.b) {
                            try {
                                if (_emptyArray == null) {
                                    _emptyArray = new ReplyKeyboard[0];
                                }
                            } catch (Throwable th) {
                                throw th;
                            }
                        }
                    }
                    return _emptyArray;
                }

                public static ReplyKeyboard parseFrom(byte[] bArr) throws InvalidProtocolBufferNanoException {
                    return (ReplyKeyboard) ad9.mergeFrom(new ReplyKeyboard(), bArr);
                }

                public ReplyKeyboard clear() {
                    this.buttons = ReplyButtons.emptyArray();
                    this.defaultInputDisabled = false;
                    this.cachedSize = -1;
                    return this;
                }

                public int computeSerializedSize() {
                    ReplyButtons[] replyButtonsArr = this.buttons;
                    int i = 0;
                    if (replyButtonsArr != null && replyButtonsArr.length > 0) {
                        int i2 = 0;
                        while (true) {
                            ReplyButtons[] replyButtonsArr2 = this.buttons;
                            if (i >= replyButtonsArr2.length) {
                                break;
                            }
                            ReplyButtons replyButtons = replyButtonsArr2[i];
                            if (replyButtons != null) {
                                i2 = j43.i(1, replyButtons) + i2;
                            }
                            i++;
                        }
                        i = i2;
                    }
                    return this.defaultInputDisabled ? i + j43.a(2) : i;
                }

                public void writeTo(j43 j43) throws IOException {
                    ReplyButtons[] replyButtonsArr = this.buttons;
                    if (replyButtonsArr != null && replyButtonsArr.length > 0) {
                        int i = 0;
                        while (true) {
                            ReplyButtons[] replyButtonsArr2 = this.buttons;
                            if (i >= replyButtonsArr2.length) {
                                break;
                            }
                            ReplyButtons replyButtons = replyButtonsArr2[i];
                            if (replyButtons != null) {
                                j43.y(1, replyButtons);
                            }
                            i++;
                        }
                    }
                    boolean z = this.defaultInputDisabled;
                    if (z) {
                        j43.r(2, z);
                    }
                }

                public static ReplyKeyboard parseFrom(i43 i43) throws IOException {
                    return new ReplyKeyboard().mergeFrom(i43);
                }

                public ReplyKeyboard mergeFrom(i43 i43) throws IOException {
                    while (true) {
                        int s = i43.s();
                        if (s == 0) {
                            return this;
                        }
                        if (s == 10) {
                            int q = ct.q(i43, 10);
                            ReplyButtons[] replyButtonsArr = this.buttons;
                            int length = replyButtonsArr == null ? 0 : replyButtonsArr.length;
                            int i = q + length;
                            ReplyButtons[] replyButtonsArr2 = new ReplyButtons[i];
                            if (length != 0) {
                                System.arraycopy(replyButtonsArr, 0, replyButtonsArr2, 0, length);
                            }
                            while (length < i - 1) {
                                ReplyButtons replyButtons = new ReplyButtons();
                                replyButtonsArr2[length] = replyButtons;
                                i43.j(replyButtons);
                                i43.s();
                                length++;
                            }
                            ReplyButtons replyButtons2 = new ReplyButtons();
                            replyButtonsArr2[length] = replyButtons2;
                            i43.j(replyButtons2);
                            this.buttons = replyButtonsArr2;
                        } else if (s == 16) {
                            this.defaultInputDisabled = i43.f();
                        } else if (!i43.u(s)) {
                            return this;
                        }
                    }
                }
            }

            public static final class SendAction extends ad9 {
                private static volatile SendAction[] _emptyArray;
                public String actionDestinationType;
                public String backgroundColor;
                public String contentType;
                public String context;
                public String nextContentType;
                public String textColor;
                public String title;

                public SendAction() {
                    clear();
                }

                public static SendAction[] emptyArray() {
                    if (_emptyArray == null) {
                        synchronized (bj7.b) {
                            try {
                                if (_emptyArray == null) {
                                    _emptyArray = new SendAction[0];
                                }
                            } catch (Throwable th) {
                                throw th;
                            }
                        }
                    }
                    return _emptyArray;
                }

                public static SendAction parseFrom(byte[] bArr) throws InvalidProtocolBufferNanoException {
                    return (SendAction) ad9.mergeFrom(new SendAction(), bArr);
                }

                public SendAction clear() {
                    this.contentType = "";
                    this.title = "";
                    this.nextContentType = "";
                    this.textColor = "";
                    this.backgroundColor = "";
                    this.context = "";
                    this.actionDestinationType = "";
                    this.cachedSize = -1;
                    return this;
                }

                public int computeSerializedSize() {
                    int l = !this.contentType.equals("") ? j43.l(1, this.contentType) : 0;
                    if (!this.title.equals("")) {
                        l += j43.l(2, this.title);
                    }
                    if (!this.nextContentType.equals("")) {
                        l += j43.l(3, this.nextContentType);
                    }
                    if (!this.textColor.equals("")) {
                        l += j43.l(4, this.textColor);
                    }
                    if (!this.backgroundColor.equals("")) {
                        l += j43.l(5, this.backgroundColor);
                    }
                    if (!this.context.equals("")) {
                        l += j43.l(6, this.context);
                    }
                    return !this.actionDestinationType.equals("") ? l + j43.l(7, this.actionDestinationType) : l;
                }

                public void writeTo(j43 j43) throws IOException {
                    if (!this.contentType.equals("")) {
                        j43.E(1, this.contentType);
                    }
                    if (!this.title.equals("")) {
                        j43.E(2, this.title);
                    }
                    if (!this.nextContentType.equals("")) {
                        j43.E(3, this.nextContentType);
                    }
                    if (!this.textColor.equals("")) {
                        j43.E(4, this.textColor);
                    }
                    if (!this.backgroundColor.equals("")) {
                        j43.E(5, this.backgroundColor);
                    }
                    if (!this.context.equals("")) {
                        j43.E(6, this.context);
                    }
                    if (!this.actionDestinationType.equals("")) {
                        j43.E(7, this.actionDestinationType);
                    }
                }

                public static SendAction parseFrom(i43 i43) throws IOException {
                    return new SendAction().mergeFrom(i43);
                }

                public SendAction mergeFrom(i43 i43) throws IOException {
                    while (true) {
                        int s = i43.s();
                        if (s == 0) {
                            return this;
                        }
                        if (s == 10) {
                            this.contentType = i43.r();
                        } else if (s == 18) {
                            this.title = i43.r();
                        } else if (s == 26) {
                            this.nextContentType = i43.r();
                        } else if (s == 34) {
                            this.textColor = i43.r();
                        } else if (s == 42) {
                            this.backgroundColor = i43.r();
                        } else if (s == 50) {
                            this.context = i43.r();
                        } else if (s == 58) {
                            this.actionDestinationType = i43.r();
                        } else if (!i43.u(s)) {
                            return this;
                        }
                    }
                }
            }

            public static final class Share extends ad9 {
                private static volatile Share[] _emptyArray;
                public boolean deleted;
                public String description;
                public String host;
                public Photo image;
                public Attach media;
                public long shareId;
                public String title;
                public String token;
                public String url;

                public Share() {
                    clear();
                }

                public static Share[] emptyArray() {
                    if (_emptyArray == null) {
                        synchronized (bj7.b) {
                            try {
                                if (_emptyArray == null) {
                                    _emptyArray = new Share[0];
                                }
                            } catch (Throwable th) {
                                throw th;
                            }
                        }
                    }
                    return _emptyArray;
                }

                public static Share parseFrom(byte[] bArr) throws InvalidProtocolBufferNanoException {
                    return (Share) ad9.mergeFrom(new Share(), bArr);
                }

                public Share clear() {
                    this.shareId = 0;
                    this.token = "";
                    this.url = "";
                    this.title = "";
                    this.description = "";
                    this.host = "";
                    this.image = null;
                    this.media = null;
                    this.deleted = false;
                    this.cachedSize = -1;
                    return this;
                }

                public int computeSerializedSize() {
                    long j = this.shareId;
                    int h = j != 0 ? j43.h(1, j) : 0;
                    if (!this.token.equals("")) {
                        h += j43.l(2, this.token);
                    }
                    if (!this.url.equals("")) {
                        h += j43.l(3, this.url);
                    }
                    if (!this.title.equals("")) {
                        h += j43.l(4, this.title);
                    }
                    if (!this.description.equals("")) {
                        h += j43.l(5, this.description);
                    }
                    if (!this.host.equals("")) {
                        h += j43.l(6, this.host);
                    }
                    Photo photo = this.image;
                    if (photo != null) {
                        h += j43.i(7, photo);
                    }
                    Attach attach = this.media;
                    if (attach != null) {
                        h += j43.i(8, attach);
                    }
                    return this.deleted ? h + j43.a(9) : h;
                }

                public void writeTo(j43 j43) throws IOException {
                    long j = this.shareId;
                    if (j != 0) {
                        j43.x(1, j);
                    }
                    if (!this.token.equals("")) {
                        j43.E(2, this.token);
                    }
                    if (!this.url.equals("")) {
                        j43.E(3, this.url);
                    }
                    if (!this.title.equals("")) {
                        j43.E(4, this.title);
                    }
                    if (!this.description.equals("")) {
                        j43.E(5, this.description);
                    }
                    if (!this.host.equals("")) {
                        j43.E(6, this.host);
                    }
                    Photo photo = this.image;
                    if (photo != null) {
                        j43.y(7, photo);
                    }
                    Attach attach = this.media;
                    if (attach != null) {
                        j43.y(8, attach);
                    }
                    boolean z = this.deleted;
                    if (z) {
                        j43.r(9, z);
                    }
                }

                public static Share parseFrom(i43 i43) throws IOException {
                    return new Share().mergeFrom(i43);
                }

                public Share mergeFrom(i43 i43) throws IOException {
                    while (true) {
                        int s = i43.s();
                        if (s == 0) {
                            return this;
                        }
                        if (s == 8) {
                            this.shareId = i43.q();
                        } else if (s == 18) {
                            this.token = i43.r();
                        } else if (s == 26) {
                            this.url = i43.r();
                        } else if (s == 34) {
                            this.title = i43.r();
                        } else if (s == 42) {
                            this.description = i43.r();
                        } else if (s == 50) {
                            this.host = i43.r();
                        } else if (s == 58) {
                            if (this.image == null) {
                                this.image = new Photo();
                            }
                            i43.j(this.image);
                        } else if (s == 66) {
                            if (this.media == null) {
                                this.media = new Attach();
                            }
                            i43.j(this.media);
                        } else if (s == 72) {
                            this.deleted = i43.f();
                        } else if (!i43.u(s)) {
                            return this;
                        }
                    }
                }
            }

            public static final class Sticker extends ad9 {
                public static final int LIVE = 2;
                public static final int LOTTIE = 4;
                public static final int POSTCARD = 3;
                public static final int STATIC = 1;
                public static final int SYSTEM = 1;
                public static final int UNKNOWN = 0;
                public static final int UNKNOWN_TYPE = 0;
                public static final int USER = 2;
                private static volatile Sticker[] _emptyArray;
                public boolean audio;
                public int authorType;
                public String firstUrl;
                public int height;
                public String lottieUrl;
                public String mp4Url;
                public String previewUrl;
                public long setId;
                public long stickerId;
                public int stickerType;
                public String[] tags;
                public long updateTime;
                public String url;
                public int width;

                public static final class AnimationProperties extends ad9 {
                    private static volatile AnimationProperties[] _emptyArray;
                    public int duration;
                    public int fps;
                    public Map<Integer, Integer> frameRepeats;
                    public int framesCount;
                    public int replayDelay;

                    public AnimationProperties() {
                        clear();
                    }

                    public static AnimationProperties[] emptyArray() {
                        if (_emptyArray == null) {
                            synchronized (bj7.b) {
                                try {
                                    if (_emptyArray == null) {
                                        _emptyArray = new AnimationProperties[0];
                                    }
                                } catch (Throwable th) {
                                    throw th;
                                }
                            }
                        }
                        return _emptyArray;
                    }

                    public static AnimationProperties parseFrom(byte[] bArr) throws InvalidProtocolBufferNanoException {
                        return (AnimationProperties) ad9.mergeFrom(new AnimationProperties(), bArr);
                    }

                    public AnimationProperties clear() {
                        this.framesCount = 0;
                        this.fps = 0;
                        this.duration = 0;
                        this.replayDelay = 0;
                        this.frameRepeats = null;
                        this.cachedSize = -1;
                        return this;
                    }

                    public int computeSerializedSize() {
                        int i = this.framesCount;
                        int f = i != 0 ? j43.f(1, i) : 0;
                        int i2 = this.fps;
                        if (i2 != 0) {
                            f += j43.f(2, i2);
                        }
                        int i3 = this.duration;
                        if (i3 != 0) {
                            f += j43.f(3, i3);
                        }
                        int i4 = this.replayDelay;
                        if (i4 != 0) {
                            f += j43.f(4, i4);
                        }
                        Map<Integer, Integer> map = this.frameRepeats;
                        return map != null ? f + bj7.a(map, 5, 5, 5) : f;
                    }

                    public AnimationProperties mergeFrom(i43 i43) throws IOException {
                        sd8 sd8 = y7e.e;
                        while (true) {
                            int s = i43.s();
                            if (s == 0) {
                                return this;
                            }
                            if (s == 8) {
                                this.framesCount = i43.p();
                            } else if (s == 16) {
                                this.fps = i43.p();
                            } else if (s == 24) {
                                this.duration = i43.p();
                            } else if (s == 32) {
                                this.replayDelay = i43.p();
                            } else if (s == 42) {
                                this.frameRepeats = bj7.b(i43, this.frameRepeats, sd8, 5, 5, (ad9) null, 8, 16);
                            } else if (!i43.u(s)) {
                                return this;
                            }
                        }
                    }

                    public void writeTo(j43 j43) throws IOException {
                        int i = this.framesCount;
                        if (i != 0) {
                            j43.w(1, i);
                        }
                        int i2 = this.fps;
                        if (i2 != 0) {
                            j43.w(2, i2);
                        }
                        int i3 = this.duration;
                        if (i3 != 0) {
                            j43.w(3, i3);
                        }
                        int i4 = this.replayDelay;
                        if (i4 != 0) {
                            j43.w(4, i4);
                        }
                        Map<Integer, Integer> map = this.frameRepeats;
                        if (map != null) {
                            bj7.d(j43, map, 5, 5, 5);
                        }
                    }

                    public static AnimationProperties parseFrom(i43 i43) throws IOException {
                        return new AnimationProperties().mergeFrom(i43);
                    }
                }

                public Sticker() {
                    clear();
                }

                public static Sticker[] emptyArray() {
                    if (_emptyArray == null) {
                        synchronized (bj7.b) {
                            try {
                                if (_emptyArray == null) {
                                    _emptyArray = new Sticker[0];
                                }
                            } catch (Throwable th) {
                                throw th;
                            }
                        }
                    }
                    return _emptyArray;
                }

                public static Sticker parseFrom(byte[] bArr) throws InvalidProtocolBufferNanoException {
                    return (Sticker) ad9.mergeFrom(new Sticker(), bArr);
                }

                public Sticker clear() {
                    this.stickerId = 0;
                    this.url = "";
                    this.width = 0;
                    this.height = 0;
                    this.mp4Url = "";
                    this.firstUrl = "";
                    this.tags = ct.g;
                    this.previewUrl = "";
                    this.updateTime = 0;
                    this.stickerType = 0;
                    this.setId = 0;
                    this.lottieUrl = "";
                    this.audio = false;
                    this.authorType = 0;
                    this.cachedSize = -1;
                    return this;
                }

                public int computeSerializedSize() {
                    long j = this.stickerId;
                    int i = 0;
                    int h = j != 0 ? j43.h(1, j) : 0;
                    if (!this.url.equals("")) {
                        h += j43.l(2, this.url);
                    }
                    int i2 = this.width;
                    if (i2 != 0) {
                        h += j43.f(3, i2);
                    }
                    int i3 = this.height;
                    if (i3 != 0) {
                        h += j43.f(4, i3);
                    }
                    if (!this.mp4Url.equals("")) {
                        h += j43.l(5, this.mp4Url);
                    }
                    if (!this.firstUrl.equals("")) {
                        h += j43.l(6, this.firstUrl);
                    }
                    String[] strArr = this.tags;
                    if (strArr != null && strArr.length > 0) {
                        int i4 = 0;
                        int i5 = 0;
                        while (true) {
                            String[] strArr2 = this.tags;
                            if (i >= strArr2.length) {
                                break;
                            }
                            String str = strArr2[i];
                            if (str != null) {
                                i5++;
                                int q = j43.q(str);
                                i4 = j43.j(q) + q + i4;
                            }
                            i++;
                        }
                        h = h + i4 + i5;
                    }
                    if (!this.previewUrl.equals("")) {
                        h += j43.l(9, this.previewUrl);
                    }
                    long j2 = this.updateTime;
                    if (j2 != 0) {
                        h += j43.h(10, j2);
                    }
                    int i6 = this.stickerType;
                    if (i6 != 0) {
                        h += j43.f(13, i6);
                    }
                    long j3 = this.setId;
                    if (j3 != 0) {
                        h += j43.h(15, j3);
                    }
                    if (!this.lottieUrl.equals("")) {
                        h += j43.l(16, this.lottieUrl);
                    }
                    if (this.audio) {
                        h += j43.a(17);
                    }
                    int i7 = this.authorType;
                    return i7 != 0 ? h + j43.f(18, i7) : h;
                }

                public void writeTo(j43 j43) throws IOException {
                    long j = this.stickerId;
                    if (j != 0) {
                        j43.x(1, j);
                    }
                    if (!this.url.equals("")) {
                        j43.E(2, this.url);
                    }
                    int i = this.width;
                    if (i != 0) {
                        j43.w(3, i);
                    }
                    int i2 = this.height;
                    if (i2 != 0) {
                        j43.w(4, i2);
                    }
                    if (!this.mp4Url.equals("")) {
                        j43.E(5, this.mp4Url);
                    }
                    if (!this.firstUrl.equals("")) {
                        j43.E(6, this.firstUrl);
                    }
                    String[] strArr = this.tags;
                    if (strArr != null && strArr.length > 0) {
                        int i3 = 0;
                        while (true) {
                            String[] strArr2 = this.tags;
                            if (i3 >= strArr2.length) {
                                break;
                            }
                            String str = strArr2[i3];
                            if (str != null) {
                                j43.E(8, str);
                            }
                            i3++;
                        }
                    }
                    if (!this.previewUrl.equals("")) {
                        j43.E(9, this.previewUrl);
                    }
                    long j2 = this.updateTime;
                    if (j2 != 0) {
                        j43.x(10, j2);
                    }
                    int i4 = this.stickerType;
                    if (i4 != 0) {
                        j43.w(13, i4);
                    }
                    long j3 = this.setId;
                    if (j3 != 0) {
                        j43.x(15, j3);
                    }
                    if (!this.lottieUrl.equals("")) {
                        j43.E(16, this.lottieUrl);
                    }
                    boolean z = this.audio;
                    if (z) {
                        j43.r(17, z);
                    }
                    int i5 = this.authorType;
                    if (i5 != 0) {
                        j43.w(18, i5);
                    }
                }

                public static Sticker parseFrom(i43 i43) throws IOException {
                    return new Sticker().mergeFrom(i43);
                }

                public Sticker mergeFrom(i43 i43) throws IOException {
                    while (true) {
                        int s = i43.s();
                        switch (s) {
                            case 0:
                                return this;
                            case 8:
                                this.stickerId = i43.q();
                                break;
                            case 18:
                                this.url = i43.r();
                                break;
                            case SavedMessagesIconDrawable.NORMAL_ICON_SIZE:
                                this.width = i43.p();
                                break;
                            case 32:
                                this.height = i43.p();
                                break;
                            case 42:
                                this.mp4Url = i43.r();
                                break;
                            case 50:
                                this.firstUrl = i43.r();
                                break;
                            case 66:
                                int q = ct.q(i43, 66);
                                String[] strArr = this.tags;
                                int length = strArr == null ? 0 : strArr.length;
                                int i = q + length;
                                String[] strArr2 = new String[i];
                                if (length != 0) {
                                    System.arraycopy(strArr, 0, strArr2, 0, length);
                                }
                                while (length < i - 1) {
                                    strArr2[length] = i43.r();
                                    i43.s();
                                    length++;
                                }
                                strArr2[length] = i43.r();
                                this.tags = strArr2;
                                break;
                            case 74:
                                this.previewUrl = i43.r();
                                break;
                            case 80:
                                this.updateTime = i43.q();
                                break;
                            case 104:
                                int p = i43.p();
                                if (p != 0 && p != 1 && p != 2 && p != 3 && p != 4) {
                                    break;
                                } else {
                                    this.stickerType = p;
                                    break;
                                }
                            case 120:
                                this.setId = i43.q();
                                break;
                            case 130:
                                this.lottieUrl = i43.r();
                                break;
                            case 136:
                                this.audio = i43.f();
                                break;
                            case 144:
                                int p2 = i43.p();
                                if (p2 != 0 && p2 != 1 && p2 != 2) {
                                    break;
                                } else {
                                    this.authorType = p2;
                                    break;
                                }
                            default:
                                if (i43.u(s)) {
                                    break;
                                } else {
                                    return this;
                                }
                        }
                    }
                }
            }

            public static final class Video extends ad9 {
                private static volatile Video[] _emptyArray;
                public int audioGroupIndex;
                public int audioTrackIndex;
                public ConvertOptions convertOptions;
                public int duration;
                public String externalSiteName;
                public String externalUrl;
                public int height;
                public boolean ignoreAutoplay;
                public boolean isThumbnailInCache;
                public boolean live;
                public byte[] previewData;
                public long startTime;
                public String thumbnail;
                public String token;
                public VideoCollage videoCollage;
                public long videoId;
                public int width;

                public static final class ConvertOptions extends ad9 {
                    private static volatile ConvertOptions[] _emptyArray;
                    public float endTrimPosition;
                    public boolean mute;
                    public Quality quality;
                    public int qualityValue;
                    public float startTrimPosition;

                    public ConvertOptions() {
                        clear();
                    }

                    public static ConvertOptions[] emptyArray() {
                        if (_emptyArray == null) {
                            synchronized (bj7.b) {
                                try {
                                    if (_emptyArray == null) {
                                        _emptyArray = new ConvertOptions[0];
                                    }
                                } catch (Throwable th) {
                                    throw th;
                                }
                            }
                        }
                        return _emptyArray;
                    }

                    public static ConvertOptions parseFrom(byte[] bArr) throws InvalidProtocolBufferNanoException {
                        return (ConvertOptions) ad9.mergeFrom(new ConvertOptions(), bArr);
                    }

                    public ConvertOptions clear() {
                        this.quality = null;
                        this.startTrimPosition = c44.DEFAULT_ASPECT_RATIO;
                        this.endTrimPosition = c44.DEFAULT_ASPECT_RATIO;
                        this.qualityValue = 0;
                        this.mute = false;
                        this.cachedSize = -1;
                        return this;
                    }

                    public int computeSerializedSize() {
                        Quality quality2 = this.quality;
                        int i = quality2 != null ? j43.i(1, quality2) : 0;
                        if (Float.floatToIntBits(this.startTrimPosition) != Float.floatToIntBits(c44.DEFAULT_ASPECT_RATIO)) {
                            i += j43.e(2);
                        }
                        if (Float.floatToIntBits(this.endTrimPosition) != Float.floatToIntBits(c44.DEFAULT_ASPECT_RATIO)) {
                            i += j43.e(3);
                        }
                        int i2 = this.qualityValue;
                        if (i2 != 0) {
                            i += j43.f(4, i2);
                        }
                        return this.mute ? i + j43.a(5) : i;
                    }

                    public void writeTo(j43 j43) throws IOException {
                        Quality quality2 = this.quality;
                        if (quality2 != null) {
                            j43.y(1, quality2);
                        }
                        if (Float.floatToIntBits(this.startTrimPosition) != Float.floatToIntBits(c44.DEFAULT_ASPECT_RATIO)) {
                            j43.v(this.startTrimPosition, 2);
                        }
                        if (Float.floatToIntBits(this.endTrimPosition) != Float.floatToIntBits(c44.DEFAULT_ASPECT_RATIO)) {
                            j43.v(this.endTrimPosition, 3);
                        }
                        int i = this.qualityValue;
                        if (i != 0) {
                            j43.w(4, i);
                        }
                        boolean z = this.mute;
                        if (z) {
                            j43.r(5, z);
                        }
                    }

                    public static ConvertOptions parseFrom(i43 i43) throws IOException {
                        return new ConvertOptions().mergeFrom(i43);
                    }

                    public ConvertOptions mergeFrom(i43 i43) throws IOException {
                        while (true) {
                            int s = i43.s();
                            if (s == 0) {
                                return this;
                            }
                            if (s == 10) {
                                if (this.quality == null) {
                                    this.quality = new Quality();
                                }
                                i43.j(this.quality);
                            } else if (s == 21) {
                                this.startTrimPosition = i43.i();
                            } else if (s == 29) {
                                this.endTrimPosition = i43.i();
                            } else if (s == 32) {
                                this.qualityValue = i43.p();
                            } else if (s == 40) {
                                this.mute = i43.f();
                            } else if (!i43.u(s)) {
                                return this;
                            }
                        }
                    }
                }

                public static final class Quality extends ad9 {
                    private static volatile Quality[] _emptyArray;
                    public int bitrate;
                    public int height;
                    public boolean isOriginal;
                    public int ordinal;
                    public int width;

                    public Quality() {
                        clear();
                    }

                    public static Quality[] emptyArray() {
                        if (_emptyArray == null) {
                            synchronized (bj7.b) {
                                try {
                                    if (_emptyArray == null) {
                                        _emptyArray = new Quality[0];
                                    }
                                } catch (Throwable th) {
                                    throw th;
                                }
                            }
                        }
                        return _emptyArray;
                    }

                    public static Quality parseFrom(byte[] bArr) throws InvalidProtocolBufferNanoException {
                        return (Quality) ad9.mergeFrom(new Quality(), bArr);
                    }

                    public Quality clear() {
                        this.ordinal = 0;
                        this.width = 0;
                        this.height = 0;
                        this.isOriginal = false;
                        this.bitrate = 0;
                        this.cachedSize = -1;
                        return this;
                    }

                    public int computeSerializedSize() {
                        int i = this.ordinal;
                        int f = i != 0 ? j43.f(1, i) : 0;
                        int i2 = this.width;
                        if (i2 != 0) {
                            f += j43.f(2, i2);
                        }
                        int i3 = this.height;
                        if (i3 != 0) {
                            f += j43.f(3, i3);
                        }
                        if (this.isOriginal) {
                            f += j43.a(4);
                        }
                        int i4 = this.bitrate;
                        return i4 != 0 ? f + j43.f(5, i4) : f;
                    }

                    public void writeTo(j43 j43) throws IOException {
                        int i = this.ordinal;
                        if (i != 0) {
                            j43.w(1, i);
                        }
                        int i2 = this.width;
                        if (i2 != 0) {
                            j43.w(2, i2);
                        }
                        int i3 = this.height;
                        if (i3 != 0) {
                            j43.w(3, i3);
                        }
                        boolean z = this.isOriginal;
                        if (z) {
                            j43.r(4, z);
                        }
                        int i4 = this.bitrate;
                        if (i4 != 0) {
                            j43.w(5, i4);
                        }
                    }

                    public static Quality parseFrom(i43 i43) throws IOException {
                        return new Quality().mergeFrom(i43);
                    }

                    public Quality mergeFrom(i43 i43) throws IOException {
                        while (true) {
                            int s = i43.s();
                            if (s == 0) {
                                return this;
                            }
                            if (s == 8) {
                                this.ordinal = i43.p();
                            } else if (s == 16) {
                                this.width = i43.p();
                            } else if (s == 24) {
                                this.height = i43.p();
                            } else if (s == 32) {
                                this.isOriginal = i43.f();
                            } else if (s == 40) {
                                this.bitrate = i43.p();
                            } else if (!i43.u(s)) {
                                return this;
                            }
                        }
                    }
                }

                public static final class VideoCollage extends ad9 {
                    private static volatile VideoCollage[] _emptyArray;
                    public int count;
                    public int frequency;
                    public int height;
                    public String url;
                    public int width;

                    public VideoCollage() {
                        clear();
                    }

                    public static VideoCollage[] emptyArray() {
                        if (_emptyArray == null) {
                            synchronized (bj7.b) {
                                try {
                                    if (_emptyArray == null) {
                                        _emptyArray = new VideoCollage[0];
                                    }
                                } catch (Throwable th) {
                                    throw th;
                                }
                            }
                        }
                        return _emptyArray;
                    }

                    public static VideoCollage parseFrom(byte[] bArr) throws InvalidProtocolBufferNanoException {
                        return (VideoCollage) ad9.mergeFrom(new VideoCollage(), bArr);
                    }

                    public VideoCollage clear() {
                        this.url = "";
                        this.frequency = 0;
                        this.height = 0;
                        this.width = 0;
                        this.count = 0;
                        this.cachedSize = -1;
                        return this;
                    }

                    public int computeSerializedSize() {
                        int l = !this.url.equals("") ? j43.l(1, this.url) : 0;
                        int i = this.frequency;
                        if (i != 0) {
                            l += j43.f(2, i);
                        }
                        int i2 = this.height;
                        if (i2 != 0) {
                            l += j43.f(3, i2);
                        }
                        int i3 = this.width;
                        if (i3 != 0) {
                            l += j43.f(4, i3);
                        }
                        int i4 = this.count;
                        return i4 != 0 ? l + j43.f(5, i4) : l;
                    }

                    public void writeTo(j43 j43) throws IOException {
                        if (!this.url.equals("")) {
                            j43.E(1, this.url);
                        }
                        int i = this.frequency;
                        if (i != 0) {
                            j43.w(2, i);
                        }
                        int i2 = this.height;
                        if (i2 != 0) {
                            j43.w(3, i2);
                        }
                        int i3 = this.width;
                        if (i3 != 0) {
                            j43.w(4, i3);
                        }
                        int i4 = this.count;
                        if (i4 != 0) {
                            j43.w(5, i4);
                        }
                    }

                    public static VideoCollage parseFrom(i43 i43) throws IOException {
                        return new VideoCollage().mergeFrom(i43);
                    }

                    public VideoCollage mergeFrom(i43 i43) throws IOException {
                        while (true) {
                            int s = i43.s();
                            if (s == 0) {
                                return this;
                            }
                            if (s == 10) {
                                this.url = i43.r();
                            } else if (s == 16) {
                                this.frequency = i43.p();
                            } else if (s == 24) {
                                this.height = i43.p();
                            } else if (s == 32) {
                                this.width = i43.p();
                            } else if (s == 40) {
                                this.count = i43.p();
                            } else if (!i43.u(s)) {
                                return this;
                            }
                        }
                    }
                }

                public Video() {
                    clear();
                }

                public static Video[] emptyArray() {
                    if (_emptyArray == null) {
                        synchronized (bj7.b) {
                            try {
                                if (_emptyArray == null) {
                                    _emptyArray = new Video[0];
                                }
                            } catch (Throwable th) {
                                throw th;
                            }
                        }
                    }
                    return _emptyArray;
                }

                public static Video parseFrom(byte[] bArr) throws InvalidProtocolBufferNanoException {
                    return (Video) ad9.mergeFrom(new Video(), bArr);
                }

                public Video clear() {
                    this.videoId = 0;
                    this.duration = 0;
                    this.thumbnail = "";
                    this.width = 0;
                    this.height = 0;
                    this.live = false;
                    this.externalUrl = "";
                    this.previewData = ct.h;
                    this.isThumbnailInCache = false;
                    this.startTime = 0;
                    this.externalSiteName = "";
                    this.convertOptions = null;
                    this.token = "";
                    this.videoCollage = null;
                    this.ignoreAutoplay = false;
                    this.audioTrackIndex = 0;
                    this.audioGroupIndex = 0;
                    this.cachedSize = -1;
                    return this;
                }

                public int computeSerializedSize() {
                    long j = this.videoId;
                    int h = j != 0 ? j43.h(1, j) : 0;
                    int i = this.duration;
                    if (i != 0) {
                        h += j43.f(2, i);
                    }
                    if (!this.thumbnail.equals("")) {
                        h += j43.l(3, this.thumbnail);
                    }
                    int i2 = this.width;
                    if (i2 != 0) {
                        h += j43.f(4, i2);
                    }
                    int i3 = this.height;
                    if (i3 != 0) {
                        h += j43.f(5, i3);
                    }
                    if (this.live) {
                        h += j43.a(6);
                    }
                    if (!this.externalUrl.equals("")) {
                        h += j43.l(7, this.externalUrl);
                    }
                    if (!Arrays.equals(this.previewData, ct.h)) {
                        h += j43.b(8, this.previewData);
                    }
                    if (this.isThumbnailInCache) {
                        h += j43.a(9);
                    }
                    long j2 = this.startTime;
                    if (j2 != 0) {
                        h += j43.h(10, j2);
                    }
                    if (!this.externalSiteName.equals("")) {
                        h += j43.l(11, this.externalSiteName);
                    }
                    ConvertOptions convertOptions2 = this.convertOptions;
                    if (convertOptions2 != null) {
                        h += j43.i(12, convertOptions2);
                    }
                    if (!this.token.equals("")) {
                        h += j43.l(13, this.token);
                    }
                    VideoCollage videoCollage2 = this.videoCollage;
                    if (videoCollage2 != null) {
                        h += j43.i(14, videoCollage2);
                    }
                    if (this.ignoreAutoplay) {
                        h += j43.a(15);
                    }
                    int i4 = this.audioTrackIndex;
                    if (i4 != 0) {
                        h += j43.f(16, i4);
                    }
                    int i5 = this.audioGroupIndex;
                    return i5 != 0 ? h + j43.f(17, i5) : h;
                }

                public void writeTo(j43 j43) throws IOException {
                    long j = this.videoId;
                    if (j != 0) {
                        j43.x(1, j);
                    }
                    int i = this.duration;
                    if (i != 0) {
                        j43.w(2, i);
                    }
                    if (!this.thumbnail.equals("")) {
                        j43.E(3, this.thumbnail);
                    }
                    int i2 = this.width;
                    if (i2 != 0) {
                        j43.w(4, i2);
                    }
                    int i3 = this.height;
                    if (i3 != 0) {
                        j43.w(5, i3);
                    }
                    boolean z = this.live;
                    if (z) {
                        j43.r(6, z);
                    }
                    if (!this.externalUrl.equals("")) {
                        j43.E(7, this.externalUrl);
                    }
                    if (!Arrays.equals(this.previewData, ct.h)) {
                        j43.s(8, this.previewData);
                    }
                    boolean z2 = this.isThumbnailInCache;
                    if (z2) {
                        j43.r(9, z2);
                    }
                    long j2 = this.startTime;
                    if (j2 != 0) {
                        j43.x(10, j2);
                    }
                    if (!this.externalSiteName.equals("")) {
                        j43.E(11, this.externalSiteName);
                    }
                    ConvertOptions convertOptions2 = this.convertOptions;
                    if (convertOptions2 != null) {
                        j43.y(12, convertOptions2);
                    }
                    if (!this.token.equals("")) {
                        j43.E(13, this.token);
                    }
                    VideoCollage videoCollage2 = this.videoCollage;
                    if (videoCollage2 != null) {
                        j43.y(14, videoCollage2);
                    }
                    boolean z3 = this.ignoreAutoplay;
                    if (z3) {
                        j43.r(15, z3);
                    }
                    int i4 = this.audioTrackIndex;
                    if (i4 != 0) {
                        j43.w(16, i4);
                    }
                    int i5 = this.audioGroupIndex;
                    if (i5 != 0) {
                        j43.w(17, i5);
                    }
                }

                public static Video parseFrom(i43 i43) throws IOException {
                    return new Video().mergeFrom(i43);
                }

                public Video mergeFrom(i43 i43) throws IOException {
                    while (true) {
                        int s = i43.s();
                        switch (s) {
                            case 0:
                                return this;
                            case 8:
                                this.videoId = i43.q();
                                break;
                            case 16:
                                this.duration = i43.p();
                                break;
                            case 26:
                                this.thumbnail = i43.r();
                                break;
                            case 32:
                                this.width = i43.p();
                                break;
                            case SavedMessagesIconDrawable.SMALL_SIZE:
                                this.height = i43.p();
                                break;
                            case 48:
                                this.live = i43.f();
                                break;
                            case 58:
                                this.externalUrl = i43.r();
                                break;
                            case 66:
                                this.previewData = i43.g();
                                break;
                            case 72:
                                this.isThumbnailInCache = i43.f();
                                break;
                            case 80:
                                this.startTime = i43.q();
                                break;
                            case 90:
                                this.externalSiteName = i43.r();
                                break;
                            case 98:
                                if (this.convertOptions == null) {
                                    this.convertOptions = new ConvertOptions();
                                }
                                i43.j(this.convertOptions);
                                break;
                            case 106:
                                this.token = i43.r();
                                break;
                            case 114:
                                if (this.videoCollage == null) {
                                    this.videoCollage = new VideoCollage();
                                }
                                i43.j(this.videoCollage);
                                break;
                            case 120:
                                this.ignoreAutoplay = i43.f();
                                break;
                            case Uuid.SIZE_BITS:
                                this.audioTrackIndex = i43.p();
                                break;
                            case 136:
                                this.audioGroupIndex = i43.p();
                                break;
                            default:
                                if (i43.u(s)) {
                                    break;
                                } else {
                                    return this;
                                }
                        }
                    }
                }
            }

            public Attach() {
                clear();
            }

            public static Attach[] emptyArray() {
                if (_emptyArray == null) {
                    synchronized (bj7.b) {
                        try {
                            if (_emptyArray == null) {
                                _emptyArray = new Attach[0];
                            }
                        } catch (Throwable th) {
                            throw th;
                        }
                    }
                }
                return _emptyArray;
            }

            public static Attach parseFrom(byte[] bArr) throws InvalidProtocolBufferNanoException {
                return (Attach) ad9.mergeFrom(new Attach(), bArr);
            }

            public Attach clear() {
                this.type = 0;
                this.photo = null;
                this.control = null;
                this.video = null;
                this.audio = null;
                this.sticker = null;
                this.share = null;
                this.app = null;
                this.call = null;
                this.status = 0;
                this.lastErrorTime = 0;
                this.progress = 0;
                this.localId = "";
                this.localPath = "";
                this.isProcessingOnServer = false;
                this.isDeleted = false;
                this.totalBytes = 0;
                this.bytesDownloaded = 0;
                this.file = null;
                this.contact = null;
                this.lastModified = 0;
                this.present = null;
                this.inlineKeyboard = null;
                this.location = null;
                this.progressFloat = c44.DEFAULT_ASPECT_RATIO;
                this.processingOnServerStatus = 0;
                this.sensitiveContentUnlocked = false;
                this.sensitive = false;
                this.cachedSize = -1;
                return this;
            }

            public int computeSerializedSize() {
                int i = this.type;
                int f = i != 0 ? j43.f(1, i) : 0;
                Photo photo2 = this.photo;
                if (photo2 != null) {
                    f += j43.i(2, photo2);
                }
                Control control2 = this.control;
                if (control2 != null) {
                    f += j43.i(3, control2);
                }
                Video video2 = this.video;
                if (video2 != null) {
                    f += j43.i(4, video2);
                }
                Audio audio2 = this.audio;
                if (audio2 != null) {
                    f += j43.i(5, audio2);
                }
                Sticker sticker2 = this.sticker;
                if (sticker2 != null) {
                    f += j43.i(6, sticker2);
                }
                Share share2 = this.share;
                if (share2 != null) {
                    f += j43.i(7, share2);
                }
                App app2 = this.app;
                if (app2 != null) {
                    f += j43.i(8, app2);
                }
                Call call2 = this.call;
                if (call2 != null) {
                    f += j43.i(9, call2);
                }
                int i2 = this.status;
                if (i2 != 0) {
                    f += j43.f(10, i2);
                }
                long j = this.lastErrorTime;
                if (j != 0) {
                    f += j43.h(11, j);
                }
                int i3 = this.progress;
                if (i3 != 0) {
                    f += j43.f(12, i3);
                }
                if (!this.localId.equals("")) {
                    f += j43.l(13, this.localId);
                }
                if (!this.localPath.equals("")) {
                    f += j43.l(14, this.localPath);
                }
                if (this.isProcessingOnServer) {
                    f += j43.a(15);
                }
                if (this.isDeleted) {
                    f += j43.a(16);
                }
                long j2 = this.totalBytes;
                if (j2 != 0) {
                    f += j43.h(17, j2);
                }
                long j3 = this.bytesDownloaded;
                if (j3 != 0) {
                    f += j43.h(18, j3);
                }
                File file2 = this.file;
                if (file2 != null) {
                    f += j43.i(20, file2);
                }
                Contact contact2 = this.contact;
                if (contact2 != null) {
                    f += j43.i(21, contact2);
                }
                long j4 = this.lastModified;
                if (j4 != 0) {
                    f += j43.h(22, j4);
                }
                Present present2 = this.present;
                if (present2 != null) {
                    f += j43.i(23, present2);
                }
                InlineKeyboard inlineKeyboard2 = this.inlineKeyboard;
                if (inlineKeyboard2 != null) {
                    f += j43.i(24, inlineKeyboard2);
                }
                Location location2 = this.location;
                if (location2 != null) {
                    f += j43.i(25, location2);
                }
                if (Float.floatToIntBits(this.progressFloat) != Float.floatToIntBits(c44.DEFAULT_ASPECT_RATIO)) {
                    f += j43.e(26);
                }
                int i4 = this.processingOnServerStatus;
                if (i4 != 0) {
                    f += j43.f(27, i4);
                }
                if (this.sensitiveContentUnlocked) {
                    f += j43.a(28);
                }
                return this.sensitive ? f + j43.a(29) : f;
            }

            public void writeTo(j43 j43) throws IOException {
                int i = this.type;
                if (i != 0) {
                    j43.w(1, i);
                }
                Photo photo2 = this.photo;
                if (photo2 != null) {
                    j43.y(2, photo2);
                }
                Control control2 = this.control;
                if (control2 != null) {
                    j43.y(3, control2);
                }
                Video video2 = this.video;
                if (video2 != null) {
                    j43.y(4, video2);
                }
                Audio audio2 = this.audio;
                if (audio2 != null) {
                    j43.y(5, audio2);
                }
                Sticker sticker2 = this.sticker;
                if (sticker2 != null) {
                    j43.y(6, sticker2);
                }
                Share share2 = this.share;
                if (share2 != null) {
                    j43.y(7, share2);
                }
                App app2 = this.app;
                if (app2 != null) {
                    j43.y(8, app2);
                }
                Call call2 = this.call;
                if (call2 != null) {
                    j43.y(9, call2);
                }
                int i2 = this.status;
                if (i2 != 0) {
                    j43.w(10, i2);
                }
                long j = this.lastErrorTime;
                if (j != 0) {
                    j43.x(11, j);
                }
                int i3 = this.progress;
                if (i3 != 0) {
                    j43.w(12, i3);
                }
                if (!this.localId.equals("")) {
                    j43.E(13, this.localId);
                }
                if (!this.localPath.equals("")) {
                    j43.E(14, this.localPath);
                }
                boolean z = this.isProcessingOnServer;
                if (z) {
                    j43.r(15, z);
                }
                boolean z2 = this.isDeleted;
                if (z2) {
                    j43.r(16, z2);
                }
                long j2 = this.totalBytes;
                if (j2 != 0) {
                    j43.x(17, j2);
                }
                long j3 = this.bytesDownloaded;
                if (j3 != 0) {
                    j43.x(18, j3);
                }
                File file2 = this.file;
                if (file2 != null) {
                    j43.y(20, file2);
                }
                Contact contact2 = this.contact;
                if (contact2 != null) {
                    j43.y(21, contact2);
                }
                long j4 = this.lastModified;
                if (j4 != 0) {
                    j43.x(22, j4);
                }
                Present present2 = this.present;
                if (present2 != null) {
                    j43.y(23, present2);
                }
                InlineKeyboard inlineKeyboard2 = this.inlineKeyboard;
                if (inlineKeyboard2 != null) {
                    j43.y(24, inlineKeyboard2);
                }
                Location location2 = this.location;
                if (location2 != null) {
                    j43.y(25, location2);
                }
                if (Float.floatToIntBits(this.progressFloat) != Float.floatToIntBits(c44.DEFAULT_ASPECT_RATIO)) {
                    j43.v(this.progressFloat, 26);
                }
                int i4 = this.processingOnServerStatus;
                if (i4 != 0) {
                    j43.w(27, i4);
                }
                boolean z3 = this.sensitiveContentUnlocked;
                if (z3) {
                    j43.r(28, z3);
                }
                boolean z4 = this.sensitive;
                if (z4) {
                    j43.r(29, z4);
                }
            }

            public static Attach parseFrom(i43 i43) throws IOException {
                return new Attach().mergeFrom(i43);
            }

            public Attach mergeFrom(i43 i43) throws IOException {
                while (true) {
                    int s = i43.s();
                    switch (s) {
                        case 0:
                            return this;
                        case 8:
                            int p = i43.p();
                            switch (p) {
                                case 0:
                                case 1:
                                case 2:
                                case 3:
                                case 4:
                                case 5:
                                case 6:
                                case 7:
                                case 8:
                                case 9:
                                case 10:
                                case 11:
                                case 12:
                                case 13:
                                case LOCATION /*14*/:
                                case DAILY_MEDIA /*15*/:
                                    this.type = p;
                                    break;
                            }
                        case 18:
                            if (this.photo == null) {
                                this.photo = new Photo();
                            }
                            i43.j(this.photo);
                            break;
                        case 26:
                            if (this.control == null) {
                                this.control = new Control();
                            }
                            i43.j(this.control);
                            break;
                        case 34:
                            if (this.video == null) {
                                this.video = new Video();
                            }
                            i43.j(this.video);
                            break;
                        case 42:
                            if (this.audio == null) {
                                this.audio = new Audio();
                            }
                            i43.j(this.audio);
                            break;
                        case 50:
                            if (this.sticker == null) {
                                this.sticker = new Sticker();
                            }
                            i43.j(this.sticker);
                            break;
                        case 58:
                            if (this.share == null) {
                                this.share = new Share();
                            }
                            i43.j(this.share);
                            break;
                        case 66:
                            if (this.app == null) {
                                this.app = new App();
                            }
                            i43.j(this.app);
                            break;
                        case 74:
                            if (this.call == null) {
                                this.call = new Call();
                            }
                            i43.j(this.call);
                            break;
                        case 80:
                            int p2 = i43.p();
                            if (p2 != 0 && p2 != 1 && p2 != 2 && p2 != 3 && p2 != 4) {
                                break;
                            } else {
                                this.status = p2;
                                break;
                            }
                        case 88:
                            this.lastErrorTime = i43.q();
                            break;
                        case 96:
                            this.progress = i43.p();
                            break;
                        case 106:
                            this.localId = i43.r();
                            break;
                        case 114:
                            this.localPath = i43.r();
                            break;
                        case 120:
                            this.isProcessingOnServer = i43.f();
                            break;
                        case Uuid.SIZE_BITS:
                            this.isDeleted = i43.f();
                            break;
                        case 136:
                            this.totalBytes = i43.q();
                            break;
                        case 144:
                            this.bytesDownloaded = i43.q();
                            break;
                        case 162:
                            if (this.file == null) {
                                this.file = new File();
                            }
                            i43.j(this.file);
                            break;
                        case 170:
                            if (this.contact == null) {
                                this.contact = new Contact();
                            }
                            i43.j(this.contact);
                            break;
                        case 176:
                            this.lastModified = i43.q();
                            break;
                        case 186:
                            if (this.present == null) {
                                this.present = new Present();
                            }
                            i43.j(this.present);
                            break;
                        case 194:
                            if (this.inlineKeyboard == null) {
                                this.inlineKeyboard = new InlineKeyboard();
                            }
                            i43.j(this.inlineKeyboard);
                            break;
                        case HttpStatus.SC_ACCEPTED:
                            if (this.location == null) {
                                this.location = new Location();
                            }
                            i43.j(this.location);
                            break;
                        case 213:
                            this.progressFloat = i43.i();
                            break;
                        case 216:
                            int p3 = i43.p();
                            if (p3 != 0 && p3 != 1 && p3 != 2) {
                                break;
                            } else {
                                this.processingOnServerStatus = p3;
                                break;
                            }
                        case 224:
                            this.sensitiveContentUnlocked = i43.f();
                            break;
                        case 232:
                            this.sensitive = i43.f();
                            break;
                        default:
                            if (i43.u(s)) {
                                break;
                            } else {
                                return this;
                            }
                    }
                }
            }
        }

        public static final class LocationInfo extends ad9 {
            private static volatile LocationInfo[] _emptyArray;
            public float accuracy;
            public double altitude;
            public float bearing;
            public double latitude;
            public double longitude;
            public float speed;
            public long time;

            public LocationInfo() {
                clear();
            }

            public static LocationInfo[] emptyArray() {
                if (_emptyArray == null) {
                    synchronized (bj7.b) {
                        try {
                            if (_emptyArray == null) {
                                _emptyArray = new LocationInfo[0];
                            }
                        } catch (Throwable th) {
                            throw th;
                        }
                    }
                }
                return _emptyArray;
            }

            public static LocationInfo parseFrom(byte[] bArr) throws InvalidProtocolBufferNanoException {
                return (LocationInfo) ad9.mergeFrom(new LocationInfo(), bArr);
            }

            public LocationInfo clear() {
                this.latitude = 0.0d;
                this.longitude = 0.0d;
                this.time = 0;
                this.altitude = 0.0d;
                this.accuracy = c44.DEFAULT_ASPECT_RATIO;
                this.bearing = c44.DEFAULT_ASPECT_RATIO;
                this.speed = c44.DEFAULT_ASPECT_RATIO;
                this.cachedSize = -1;
                return this;
            }

            public int computeSerializedSize() {
                int c = Double.doubleToLongBits(this.latitude) != Double.doubleToLongBits(0.0d) ? j43.c(1) : 0;
                if (Double.doubleToLongBits(this.longitude) != Double.doubleToLongBits(0.0d)) {
                    c += j43.c(2);
                }
                long j = this.time;
                if (j != 0) {
                    c += j43.h(3, j);
                }
                if (Double.doubleToLongBits(this.altitude) != Double.doubleToLongBits(0.0d)) {
                    c += j43.c(4);
                }
                if (Float.floatToIntBits(this.accuracy) != Float.floatToIntBits(c44.DEFAULT_ASPECT_RATIO)) {
                    c += j43.e(5);
                }
                if (Float.floatToIntBits(this.bearing) != Float.floatToIntBits(c44.DEFAULT_ASPECT_RATIO)) {
                    c += j43.e(6);
                }
                return Float.floatToIntBits(this.speed) != Float.floatToIntBits(c44.DEFAULT_ASPECT_RATIO) ? c + j43.e(7) : c;
            }

            public void writeTo(j43 j43) throws IOException {
                if (Double.doubleToLongBits(this.latitude) != Double.doubleToLongBits(0.0d)) {
                    j43.t(this.latitude, 1);
                }
                if (Double.doubleToLongBits(this.longitude) != Double.doubleToLongBits(0.0d)) {
                    j43.t(this.longitude, 2);
                }
                long j = this.time;
                if (j != 0) {
                    j43.x(3, j);
                }
                if (Double.doubleToLongBits(this.altitude) != Double.doubleToLongBits(0.0d)) {
                    j43.t(this.altitude, 4);
                }
                if (Float.floatToIntBits(this.accuracy) != Float.floatToIntBits(c44.DEFAULT_ASPECT_RATIO)) {
                    j43.v(this.accuracy, 5);
                }
                if (Float.floatToIntBits(this.bearing) != Float.floatToIntBits(c44.DEFAULT_ASPECT_RATIO)) {
                    j43.v(this.bearing, 6);
                }
                if (Float.floatToIntBits(this.speed) != Float.floatToIntBits(c44.DEFAULT_ASPECT_RATIO)) {
                    j43.v(this.speed, 7);
                }
            }

            public static LocationInfo parseFrom(i43 i43) throws IOException {
                return new LocationInfo().mergeFrom(i43);
            }

            public LocationInfo mergeFrom(i43 i43) throws IOException {
                while (true) {
                    int s = i43.s();
                    if (s == 0) {
                        return this;
                    }
                    if (s == 9) {
                        this.latitude = i43.h();
                    } else if (s == 17) {
                        this.longitude = i43.h();
                    } else if (s == 24) {
                        this.time = i43.q();
                    } else if (s == 33) {
                        this.altitude = i43.h();
                    } else if (s == 45) {
                        this.accuracy = i43.i();
                    } else if (s == 53) {
                        this.bearing = i43.i();
                    } else if (s == 61) {
                        this.speed = i43.i();
                    } else if (!i43.u(s)) {
                        return this;
                    }
                }
            }
        }

        public Attaches() {
            clear();
        }

        public static Attaches[] emptyArray() {
            if (_emptyArray == null) {
                synchronized (bj7.b) {
                    try {
                        if (_emptyArray == null) {
                            _emptyArray = new Attaches[0];
                        }
                    } catch (Throwable th) {
                        throw th;
                    }
                }
            }
            return _emptyArray;
        }

        public static Attaches parseFrom(byte[] bArr) throws InvalidProtocolBufferNanoException {
            return (Attaches) ad9.mergeFrom(new Attaches(), bArr);
        }

        public Attaches clear() {
            this.attach = Attach.emptyArray();
            this.keyboard = null;
            this.sendAction = null;
            this.replyKeyboard = null;
            this.cachedSize = -1;
            return this;
        }

        public int computeSerializedSize() {
            Attach[] attachArr = this.attach;
            int i = 0;
            if (attachArr != null && attachArr.length > 0) {
                int i2 = 0;
                while (true) {
                    Attach[] attachArr2 = this.attach;
                    if (i >= attachArr2.length) {
                        break;
                    }
                    Attach attach2 = attachArr2[i];
                    if (attach2 != null) {
                        i2 = j43.i(1, attach2) + i2;
                    }
                    i++;
                }
                i = i2;
            }
            Attach.InlineKeyboard inlineKeyboard = this.keyboard;
            if (inlineKeyboard != null) {
                i += j43.i(2, inlineKeyboard);
            }
            Attach.SendAction sendAction2 = this.sendAction;
            if (sendAction2 != null) {
                i += j43.i(3, sendAction2);
            }
            Attach.ReplyKeyboard replyKeyboard2 = this.replyKeyboard;
            return replyKeyboard2 != null ? i + j43.i(4, replyKeyboard2) : i;
        }

        public void writeTo(j43 j43) throws IOException {
            Attach[] attachArr = this.attach;
            if (attachArr != null && attachArr.length > 0) {
                int i = 0;
                while (true) {
                    Attach[] attachArr2 = this.attach;
                    if (i >= attachArr2.length) {
                        break;
                    }
                    Attach attach2 = attachArr2[i];
                    if (attach2 != null) {
                        j43.y(1, attach2);
                    }
                    i++;
                }
            }
            Attach.InlineKeyboard inlineKeyboard = this.keyboard;
            if (inlineKeyboard != null) {
                j43.y(2, inlineKeyboard);
            }
            Attach.SendAction sendAction2 = this.sendAction;
            if (sendAction2 != null) {
                j43.y(3, sendAction2);
            }
            Attach.ReplyKeyboard replyKeyboard2 = this.replyKeyboard;
            if (replyKeyboard2 != null) {
                j43.y(4, replyKeyboard2);
            }
        }

        public static Attaches parseFrom(i43 i43) throws IOException {
            return new Attaches().mergeFrom(i43);
        }

        public Attaches mergeFrom(i43 i43) throws IOException {
            while (true) {
                int s = i43.s();
                if (s == 0) {
                    return this;
                }
                if (s == 10) {
                    int q = ct.q(i43, 10);
                    Attach[] attachArr = this.attach;
                    int length = attachArr == null ? 0 : attachArr.length;
                    int i = q + length;
                    Attach[] attachArr2 = new Attach[i];
                    if (length != 0) {
                        System.arraycopy(attachArr, 0, attachArr2, 0, length);
                    }
                    while (length < i - 1) {
                        Attach attach2 = new Attach();
                        attachArr2[length] = attach2;
                        i43.j(attach2);
                        i43.s();
                        length++;
                    }
                    Attach attach3 = new Attach();
                    attachArr2[length] = attach3;
                    i43.j(attach3);
                    this.attach = attachArr2;
                } else if (s == 18) {
                    if (this.keyboard == null) {
                        this.keyboard = new Attach.InlineKeyboard();
                    }
                    i43.j(this.keyboard);
                } else if (s == 26) {
                    if (this.sendAction == null) {
                        this.sendAction = new Attach.SendAction();
                    }
                    i43.j(this.sendAction);
                } else if (s == 34) {
                    if (this.replyKeyboard == null) {
                        this.replyKeyboard = new Attach.ReplyKeyboard();
                    }
                    i43.j(this.replyKeyboard);
                } else if (!i43.u(s)) {
                    return this;
                }
            }
        }
    }

    public static final class CallHistoryState extends ad9 {
        private static volatile CallHistoryState[] _emptyArray;
        public long backwardMarker;
        public Chat.Chunk chunk;
        public long forwardMarker;
        public boolean hasNext;
        public boolean hasPrev;
        public Map<Long, MissedMessagesItem> missedMessagesIds;

        public static final class MissedMessagesItem extends ad9 {
            private static volatile MissedMessagesItem[] _emptyArray;
            public long[] ids;

            public MissedMessagesItem() {
                clear();
            }

            public static MissedMessagesItem[] emptyArray() {
                if (_emptyArray == null) {
                    synchronized (bj7.b) {
                        try {
                            if (_emptyArray == null) {
                                _emptyArray = new MissedMessagesItem[0];
                            }
                        } catch (Throwable th) {
                            throw th;
                        }
                    }
                }
                return _emptyArray;
            }

            public static MissedMessagesItem parseFrom(byte[] bArr) throws InvalidProtocolBufferNanoException {
                return (MissedMessagesItem) ad9.mergeFrom(new MissedMessagesItem(), bArr);
            }

            public MissedMessagesItem clear() {
                this.ids = ct.e;
                this.cachedSize = -1;
                return this;
            }

            public int computeSerializedSize() {
                long[] jArr = this.ids;
                int i = 0;
                if (jArr == null || jArr.length <= 0) {
                    return 0;
                }
                int i2 = 0;
                while (true) {
                    long[] jArr2 = this.ids;
                    if (i >= jArr2.length) {
                        return i2 + jArr2.length;
                    }
                    i2 += j43.k(jArr2[i]);
                    i++;
                }
            }

            public void writeTo(j43 j43) throws IOException {
                long[] jArr = this.ids;
                if (jArr != null && jArr.length > 0) {
                    int i = 0;
                    while (true) {
                        long[] jArr2 = this.ids;
                        if (i < jArr2.length) {
                            j43.x(1, jArr2[i]);
                            i++;
                        } else {
                            return;
                        }
                    }
                }
            }

            public static MissedMessagesItem parseFrom(i43 i43) throws IOException {
                return new MissedMessagesItem().mergeFrom(i43);
            }

            public MissedMessagesItem mergeFrom(i43 i43) throws IOException {
                while (true) {
                    int s = i43.s();
                    if (s == 0) {
                        return this;
                    }
                    if (s == 8) {
                        int q = ct.q(i43, 8);
                        long[] jArr = this.ids;
                        int length = jArr == null ? 0 : jArr.length;
                        int i = q + length;
                        long[] jArr2 = new long[i];
                        if (length != 0) {
                            System.arraycopy(jArr, 0, jArr2, 0, length);
                        }
                        while (length < i - 1) {
                            jArr2[length] = i43.q();
                            i43.s();
                            length++;
                        }
                        jArr2[length] = i43.q();
                        this.ids = jArr2;
                    } else if (s == 10) {
                        int e = i43.e(i43.p());
                        int c = i43.c();
                        int i2 = 0;
                        while (i43.b() > 0) {
                            i43.q();
                            i2++;
                        }
                        i43.t(c);
                        long[] jArr3 = this.ids;
                        int length2 = jArr3 == null ? 0 : jArr3.length;
                        int i3 = i2 + length2;
                        long[] jArr4 = new long[i3];
                        if (length2 != 0) {
                            System.arraycopy(jArr3, 0, jArr4, 0, length2);
                        }
                        while (length2 < i3) {
                            jArr4[length2] = i43.q();
                            length2++;
                        }
                        this.ids = jArr4;
                        i43.d(e);
                    } else if (!i43.u(s)) {
                        return this;
                    }
                }
            }
        }

        public CallHistoryState() {
            clear();
        }

        public static CallHistoryState[] emptyArray() {
            if (_emptyArray == null) {
                synchronized (bj7.b) {
                    try {
                        if (_emptyArray == null) {
                            _emptyArray = new CallHistoryState[0];
                        }
                    } catch (Throwable th) {
                        throw th;
                    }
                }
            }
            return _emptyArray;
        }

        public static CallHistoryState parseFrom(byte[] bArr) throws InvalidProtocolBufferNanoException {
            return (CallHistoryState) ad9.mergeFrom(new CallHistoryState(), bArr);
        }

        public CallHistoryState clear() {
            this.chunk = null;
            this.forwardMarker = 0;
            this.backwardMarker = 0;
            this.hasNext = false;
            this.hasPrev = false;
            this.missedMessagesIds = null;
            this.cachedSize = -1;
            return this;
        }

        public int computeSerializedSize() {
            Chat.Chunk chunk2 = this.chunk;
            int i = chunk2 != null ? j43.i(1, chunk2) : 0;
            long j = this.forwardMarker;
            if (j != 0) {
                i += j43.h(2, j);
            }
            long j2 = this.backwardMarker;
            if (j2 != 0) {
                i += j43.h(3, j2);
            }
            if (this.hasNext) {
                i += j43.a(4);
            }
            if (this.hasPrev) {
                i += j43.a(5);
            }
            Map<Long, MissedMessagesItem> map = this.missedMessagesIds;
            return map != null ? i + bj7.a(map, 6, 3, 11) : i;
        }

        public CallHistoryState mergeFrom(i43 i43) throws IOException {
            sd8 sd8 = y7e.e;
            while (true) {
                int s = i43.s();
                if (s == 0) {
                    return this;
                }
                if (s == 10) {
                    if (this.chunk == null) {
                        this.chunk = new Chat.Chunk();
                    }
                    i43.j(this.chunk);
                } else if (s == 16) {
                    this.forwardMarker = i43.q();
                } else if (s == 24) {
                    this.backwardMarker = i43.q();
                } else if (s == 32) {
                    this.hasNext = i43.f();
                } else if (s == 40) {
                    this.hasPrev = i43.f();
                } else if (s == 50) {
                    this.missedMessagesIds = bj7.b(i43, this.missedMessagesIds, sd8, 3, 11, new MissedMessagesItem(), 8, 18);
                } else if (!i43.u(s)) {
                    return this;
                }
            }
        }

        public void writeTo(j43 j43) throws IOException {
            Chat.Chunk chunk2 = this.chunk;
            if (chunk2 != null) {
                j43.y(1, chunk2);
            }
            long j = this.forwardMarker;
            if (j != 0) {
                j43.x(2, j);
            }
            long j2 = this.backwardMarker;
            if (j2 != 0) {
                j43.x(3, j2);
            }
            boolean z = this.hasNext;
            if (z) {
                j43.r(4, z);
            }
            boolean z2 = this.hasPrev;
            if (z2) {
                j43.r(5, z2);
            }
            Map<Long, MissedMessagesItem> map = this.missedMessagesIds;
            if (map != null) {
                bj7.d(j43, map, 6, 3, 11);
            }
        }

        public static CallHistoryState parseFrom(i43 i43) throws IOException {
            return new CallHistoryState().mergeFrom(i43);
        }
    }

    public static final class Chat extends ad9 {
        public static final int ACTIVE = 0;
        public static final int CHANGE_PARTICIPANT = 2;
        public static final int CHANNEL = 2;
        public static final int CHAT = 1;
        public static final int CLOSED = 5;
        public static final int DIALOG = 0;
        public static final int GROUP_CHAT = 3;
        public static final int HIDDEN = 6;
        public static final int ICON = 1;
        public static final int LEAVING = 2;
        public static final int LED = 2;
        public static final int LEFT = 1;
        public static final int PIN_MESSAGE = 3;
        public static final int PRIVATE = 1;
        public static final int PUBLIC = 0;
        public static final int REMOVED = 3;
        public static final int REMOVING = 4;
        public static final int SOUND = 0;
        public static final int TITLE = 0;
        public static final int VIBRATION = 1;
        private static volatile Chat[] _emptyArray;
        public int accessType;
        public Map<Long, AdminParticipant> adminParticipants;
        public long[] admins;
        public String baseIconUrl;
        public String baseRawIconUrl;
        public int blockedParticipantsCount;
        public BotsInfo botsInfo;
        public ChannelInfo channelInfo;
        public long[] chatFoldersIds;
        public ChatOptions chatOptions;
        public ChatSettings chatSettings;
        public ChatSubject chatSubject;
        public Chunk[] chunk;
        public long cid;
        public long created;
        public Chunk[] delayedChunk;
        public String description;
        public byte[] draft;
        public long draftUpdateTime;
        public long draftUpdateTimeForSyncLogic;
        public long firstMessageId;
        public int flagsSettings;
        public GroupChatInfo groupChatInfo;
        public boolean hidePinnedMessage;
        public long joinTime;
        public long lastDelayedUpdateTime;
        public long lastEventTime;
        public long lastFireDelayedErrorTime;
        public String lastInput;
        public long lastInputEditMessageId;
        public LastInputMedia[] lastInputMedia;
        public long lastInputReplyMessageId;
        public long lastMentionMessageId;
        public long lastMessageId;
        public long lastOpenNewMessages;
        public int lastOpenPositionOffset;
        public long lastOpenPositionTime;
        public long lastOpenReadMark;
        public PushMessage lastPushMessage;
        public long lastReactedMessageId;
        public String lastReaction;
        public long lastSearchClickTime;
        public long lastWriteTime;
        public String link;
        public Map<Long, Long> liveLocationMessageIds;
        public int[] localChanges;
        public boolean markedAsUnread;
        public ChatMedia mediaAll;
        public ChatMedia mediaAudio;
        public ChatMedia mediaFiles;
        public ChatMedia mediaLocations;
        public ChatMedia mediaMusic;
        public ChatMedia mediaPhotoVideo;
        public ChatMedia mediaShare;
        public int messagesTtlSec;
        public long modified;
        public int newMessages;
        public long owner;
        public Map<Long, Long> participants;
        public int participantsCount;
        public long pinnedMessageId;
        public int restrictions;
        public Section[] sections;
        public long serverId;
        public int status;
        public String[] stickersOrder;
        public long stickersSyncTime;
        public boolean subscribedToUpdates;
        public String title;
        public int type;
        public long unbindOkPanelCloseTime;
        public boolean unreadPin;
        public boolean unreadReply;
        public VideoConversation videoConversation;

        public static final class AdminParticipant extends ad9 {
            private static volatile AdminParticipant[] _emptyArray;
            public String alias;
            public long id;
            public long inviterId;
            public int permissions;

            public AdminParticipant() {
                clear();
            }

            public static AdminParticipant[] emptyArray() {
                if (_emptyArray == null) {
                    synchronized (bj7.b) {
                        try {
                            if (_emptyArray == null) {
                                _emptyArray = new AdminParticipant[0];
                            }
                        } catch (Throwable th) {
                            throw th;
                        }
                    }
                }
                return _emptyArray;
            }

            public static AdminParticipant parseFrom(byte[] bArr) throws InvalidProtocolBufferNanoException {
                return (AdminParticipant) ad9.mergeFrom(new AdminParticipant(), bArr);
            }

            public AdminParticipant clear() {
                this.id = 0;
                this.permissions = 0;
                this.inviterId = 0;
                this.alias = "";
                this.cachedSize = -1;
                return this;
            }

            public int computeSerializedSize() {
                long j = this.id;
                int h = j != 0 ? j43.h(1, j) : 0;
                int i = this.permissions;
                if (i != 0) {
                    h += j43.f(2, i);
                }
                long j2 = this.inviterId;
                if (j2 != 0) {
                    h += j43.h(3, j2);
                }
                return !this.alias.equals("") ? h + j43.l(4, this.alias) : h;
            }

            public void writeTo(j43 j43) throws IOException {
                long j = this.id;
                if (j != 0) {
                    j43.x(1, j);
                }
                int i = this.permissions;
                if (i != 0) {
                    j43.w(2, i);
                }
                long j2 = this.inviterId;
                if (j2 != 0) {
                    j43.x(3, j2);
                }
                if (!this.alias.equals("")) {
                    j43.E(4, this.alias);
                }
            }

            public static AdminParticipant parseFrom(i43 i43) throws IOException {
                return new AdminParticipant().mergeFrom(i43);
            }

            public AdminParticipant mergeFrom(i43 i43) throws IOException {
                while (true) {
                    int s = i43.s();
                    if (s == 0) {
                        return this;
                    }
                    if (s == 8) {
                        this.id = i43.q();
                    } else if (s == 16) {
                        this.permissions = i43.p();
                    } else if (s == 24) {
                        this.inviterId = i43.q();
                    } else if (s == 34) {
                        this.alias = i43.r();
                    } else if (!i43.u(s)) {
                        return this;
                    }
                }
            }
        }

        public static final class BotsInfo extends ad9 {
            private static volatile BotsInfo[] _emptyArray;
            public boolean hasBots;
            public boolean suspendedBot;

            public BotsInfo() {
                clear();
            }

            public static BotsInfo[] emptyArray() {
                if (_emptyArray == null) {
                    synchronized (bj7.b) {
                        try {
                            if (_emptyArray == null) {
                                _emptyArray = new BotsInfo[0];
                            }
                        } catch (Throwable th) {
                            throw th;
                        }
                    }
                }
                return _emptyArray;
            }

            public static BotsInfo parseFrom(byte[] bArr) throws InvalidProtocolBufferNanoException {
                return (BotsInfo) ad9.mergeFrom(new BotsInfo(), bArr);
            }

            public BotsInfo clear() {
                this.hasBots = false;
                this.suspendedBot = false;
                this.cachedSize = -1;
                return this;
            }

            public int computeSerializedSize() {
                int a = this.hasBots ? j43.a(1) : 0;
                return this.suspendedBot ? a + j43.a(2) : a;
            }

            public void writeTo(j43 j43) throws IOException {
                boolean z = this.hasBots;
                if (z) {
                    j43.r(1, z);
                }
                boolean z2 = this.suspendedBot;
                if (z2) {
                    j43.r(2, z2);
                }
            }

            public static BotsInfo parseFrom(i43 i43) throws IOException {
                return new BotsInfo().mergeFrom(i43);
            }

            public BotsInfo mergeFrom(i43 i43) throws IOException {
                while (true) {
                    int s = i43.s();
                    if (s == 0) {
                        return this;
                    }
                    if (s == 8) {
                        this.hasBots = i43.f();
                    } else if (s == 16) {
                        this.suspendedBot = i43.f();
                    } else if (!i43.u(s)) {
                        return this;
                    }
                }
            }
        }

        public static final class ChannelInfo extends ad9 {
            private static volatile ChannelInfo[] _emptyArray;
            public long[] admins;
            public String description;
            public int membersCount;
            public boolean signAdmin;

            public ChannelInfo() {
                clear();
            }

            public static ChannelInfo[] emptyArray() {
                if (_emptyArray == null) {
                    synchronized (bj7.b) {
                        try {
                            if (_emptyArray == null) {
                                _emptyArray = new ChannelInfo[0];
                            }
                        } catch (Throwable th) {
                            throw th;
                        }
                    }
                }
                return _emptyArray;
            }

            public static ChannelInfo parseFrom(byte[] bArr) throws InvalidProtocolBufferNanoException {
                return (ChannelInfo) ad9.mergeFrom(new ChannelInfo(), bArr);
            }

            public ChannelInfo clear() {
                this.membersCount = 0;
                this.description = "";
                this.admins = ct.e;
                this.signAdmin = false;
                this.cachedSize = -1;
                return this;
            }

            public int computeSerializedSize() {
                long[] jArr;
                int i = this.membersCount;
                int i2 = 0;
                int f = i != 0 ? j43.f(1, i) : 0;
                if (!this.description.equals("")) {
                    f += j43.l(2, this.description);
                }
                long[] jArr2 = this.admins;
                if (jArr2 != null && jArr2.length > 0) {
                    int i3 = 0;
                    while (true) {
                        jArr = this.admins;
                        if (i2 >= jArr.length) {
                            break;
                        }
                        i3 += j43.k(jArr[i2]);
                        i2++;
                    }
                    f = f + i3 + jArr.length;
                }
                return this.signAdmin ? f + j43.a(4) : f;
            }

            public void writeTo(j43 j43) throws IOException {
                int i = this.membersCount;
                if (i != 0) {
                    j43.w(1, i);
                }
                if (!this.description.equals("")) {
                    j43.E(2, this.description);
                }
                long[] jArr = this.admins;
                if (jArr != null && jArr.length > 0) {
                    int i2 = 0;
                    while (true) {
                        long[] jArr2 = this.admins;
                        if (i2 >= jArr2.length) {
                            break;
                        }
                        j43.x(3, jArr2[i2]);
                        i2++;
                    }
                }
                boolean z = this.signAdmin;
                if (z) {
                    j43.r(4, z);
                }
            }

            public static ChannelInfo parseFrom(i43 i43) throws IOException {
                return new ChannelInfo().mergeFrom(i43);
            }

            public ChannelInfo mergeFrom(i43 i43) throws IOException {
                while (true) {
                    int s = i43.s();
                    if (s == 0) {
                        return this;
                    }
                    if (s == 8) {
                        this.membersCount = i43.p();
                    } else if (s == 18) {
                        this.description = i43.r();
                    } else if (s == 24) {
                        int q = ct.q(i43, 24);
                        long[] jArr = this.admins;
                        int length = jArr == null ? 0 : jArr.length;
                        int i = q + length;
                        long[] jArr2 = new long[i];
                        if (length != 0) {
                            System.arraycopy(jArr, 0, jArr2, 0, length);
                        }
                        while (length < i - 1) {
                            jArr2[length] = i43.q();
                            i43.s();
                            length++;
                        }
                        jArr2[length] = i43.q();
                        this.admins = jArr2;
                    } else if (s == 26) {
                        int e = i43.e(i43.p());
                        int c = i43.c();
                        int i2 = 0;
                        while (i43.b() > 0) {
                            i43.q();
                            i2++;
                        }
                        i43.t(c);
                        long[] jArr3 = this.admins;
                        int length2 = jArr3 == null ? 0 : jArr3.length;
                        int i3 = i2 + length2;
                        long[] jArr4 = new long[i3];
                        if (length2 != 0) {
                            System.arraycopy(jArr3, 0, jArr4, 0, length2);
                        }
                        while (length2 < i3) {
                            jArr4[length2] = i43.q();
                            length2++;
                        }
                        this.admins = jArr4;
                        i43.d(e);
                    } else if (s == 32) {
                        this.signAdmin = i43.f();
                    } else if (!i43.u(s)) {
                        return this;
                    }
                }
            }
        }

        public static final class ChatMedia extends ad9 {
            private static volatile ChatMedia[] _emptyArray;
            public Chunk chunk;
            public Chunk[] chunks;
            public long firstMessageId;
            public long lastMessageId;
            public int totalCount;

            public ChatMedia() {
                clear();
            }

            public static ChatMedia[] emptyArray() {
                if (_emptyArray == null) {
                    synchronized (bj7.b) {
                        try {
                            if (_emptyArray == null) {
                                _emptyArray = new ChatMedia[0];
                            }
                        } catch (Throwable th) {
                            throw th;
                        }
                    }
                }
                return _emptyArray;
            }

            public static ChatMedia parseFrom(byte[] bArr) throws InvalidProtocolBufferNanoException {
                return (ChatMedia) ad9.mergeFrom(new ChatMedia(), bArr);
            }

            public ChatMedia clear() {
                this.chunk = null;
                this.totalCount = 0;
                this.firstMessageId = 0;
                this.lastMessageId = 0;
                this.chunks = Chunk.emptyArray();
                this.cachedSize = -1;
                return this;
            }

            public int computeSerializedSize() {
                Chunk chunk2 = this.chunk;
                int i = 0;
                int i2 = chunk2 != null ? j43.i(1, chunk2) : 0;
                int i3 = this.totalCount;
                if (i3 != 0) {
                    i2 += j43.f(2, i3);
                }
                long j = this.firstMessageId;
                if (j != 0) {
                    i2 += j43.h(3, j);
                }
                long j2 = this.lastMessageId;
                if (j2 != 0) {
                    i2 += j43.h(4, j2);
                }
                Chunk[] chunkArr = this.chunks;
                if (chunkArr != null && chunkArr.length > 0) {
                    while (true) {
                        Chunk[] chunkArr2 = this.chunks;
                        if (i >= chunkArr2.length) {
                            break;
                        }
                        Chunk chunk3 = chunkArr2[i];
                        if (chunk3 != null) {
                            i2 = j43.i(5, chunk3) + i2;
                        }
                        i++;
                    }
                }
                return i2;
            }

            public void writeTo(j43 j43) throws IOException {
                Chunk chunk2 = this.chunk;
                if (chunk2 != null) {
                    j43.y(1, chunk2);
                }
                int i = this.totalCount;
                if (i != 0) {
                    j43.w(2, i);
                }
                long j = this.firstMessageId;
                if (j != 0) {
                    j43.x(3, j);
                }
                long j2 = this.lastMessageId;
                if (j2 != 0) {
                    j43.x(4, j2);
                }
                Chunk[] chunkArr = this.chunks;
                if (chunkArr != null && chunkArr.length > 0) {
                    int i2 = 0;
                    while (true) {
                        Chunk[] chunkArr2 = this.chunks;
                        if (i2 < chunkArr2.length) {
                            Chunk chunk3 = chunkArr2[i2];
                            if (chunk3 != null) {
                                j43.y(5, chunk3);
                            }
                            i2++;
                        } else {
                            return;
                        }
                    }
                }
            }

            public static ChatMedia parseFrom(i43 i43) throws IOException {
                return new ChatMedia().mergeFrom(i43);
            }

            public ChatMedia mergeFrom(i43 i43) throws IOException {
                while (true) {
                    int s = i43.s();
                    if (s == 0) {
                        return this;
                    }
                    if (s == 10) {
                        if (this.chunk == null) {
                            this.chunk = new Chunk();
                        }
                        i43.j(this.chunk);
                    } else if (s == 16) {
                        this.totalCount = i43.p();
                    } else if (s == 24) {
                        this.firstMessageId = i43.q();
                    } else if (s == 32) {
                        this.lastMessageId = i43.q();
                    } else if (s == 42) {
                        int q = ct.q(i43, 42);
                        Chunk[] chunkArr = this.chunks;
                        int length = chunkArr == null ? 0 : chunkArr.length;
                        int i = q + length;
                        Chunk[] chunkArr2 = new Chunk[i];
                        if (length != 0) {
                            System.arraycopy(chunkArr, 0, chunkArr2, 0, length);
                        }
                        while (length < i - 1) {
                            Chunk chunk2 = new Chunk();
                            chunkArr2[length] = chunk2;
                            i43.j(chunk2);
                            i43.s();
                            length++;
                        }
                        Chunk chunk3 = new Chunk();
                        chunkArr2[length] = chunk3;
                        i43.j(chunk3);
                        this.chunks = chunkArr2;
                    } else if (!i43.u(s)) {
                        return this;
                    }
                }
            }
        }

        public static final class ChatOptions extends ad9 {
            private static volatile ChatOptions[] _emptyArray;
            public boolean allCanPinMessage;
            public boolean membersCanSeePrivateLink;
            public boolean official;
            public boolean onlyAdminCanAddMember;
            public boolean onlyAdminCanCall;
            public boolean onlyOwnerCanChangeIconTitle;
            public boolean sentByPhone;
            public boolean serviceChat;
            public boolean signAdmin;

            public ChatOptions() {
                clear();
            }

            public static ChatOptions[] emptyArray() {
                if (_emptyArray == null) {
                    synchronized (bj7.b) {
                        try {
                            if (_emptyArray == null) {
                                _emptyArray = new ChatOptions[0];
                            }
                        } catch (Throwable th) {
                            throw th;
                        }
                    }
                }
                return _emptyArray;
            }

            public static ChatOptions parseFrom(byte[] bArr) throws InvalidProtocolBufferNanoException {
                return (ChatOptions) ad9.mergeFrom(new ChatOptions(), bArr);
            }

            public ChatOptions clear() {
                this.signAdmin = false;
                this.onlyOwnerCanChangeIconTitle = false;
                this.official = false;
                this.allCanPinMessage = false;
                this.onlyAdminCanAddMember = false;
                this.onlyAdminCanCall = false;
                this.sentByPhone = false;
                this.serviceChat = false;
                this.membersCanSeePrivateLink = false;
                this.cachedSize = -1;
                return this;
            }

            public int computeSerializedSize() {
                int a = this.signAdmin ? j43.a(1) : 0;
                if (this.onlyOwnerCanChangeIconTitle) {
                    a += j43.a(2);
                }
                if (this.official) {
                    a += j43.a(3);
                }
                if (this.allCanPinMessage) {
                    a += j43.a(4);
                }
                if (this.onlyAdminCanAddMember) {
                    a += j43.a(5);
                }
                if (this.onlyAdminCanCall) {
                    a += j43.a(7);
                }
                if (this.sentByPhone) {
                    a += j43.a(8);
                }
                if (this.serviceChat) {
                    a += j43.a(9);
                }
                return this.membersCanSeePrivateLink ? a + j43.a(10) : a;
            }

            public void writeTo(j43 j43) throws IOException {
                boolean z = this.signAdmin;
                if (z) {
                    j43.r(1, z);
                }
                boolean z2 = this.onlyOwnerCanChangeIconTitle;
                if (z2) {
                    j43.r(2, z2);
                }
                boolean z3 = this.official;
                if (z3) {
                    j43.r(3, z3);
                }
                boolean z4 = this.allCanPinMessage;
                if (z4) {
                    j43.r(4, z4);
                }
                boolean z5 = this.onlyAdminCanAddMember;
                if (z5) {
                    j43.r(5, z5);
                }
                boolean z6 = this.onlyAdminCanCall;
                if (z6) {
                    j43.r(7, z6);
                }
                boolean z7 = this.sentByPhone;
                if (z7) {
                    j43.r(8, z7);
                }
                boolean z8 = this.serviceChat;
                if (z8) {
                    j43.r(9, z8);
                }
                boolean z9 = this.membersCanSeePrivateLink;
                if (z9) {
                    j43.r(10, z9);
                }
            }

            public static ChatOptions parseFrom(i43 i43) throws IOException {
                return new ChatOptions().mergeFrom(i43);
            }

            public ChatOptions mergeFrom(i43 i43) throws IOException {
                while (true) {
                    int s = i43.s();
                    if (s == 0) {
                        return this;
                    }
                    if (s == 8) {
                        this.signAdmin = i43.f();
                    } else if (s == 16) {
                        this.onlyOwnerCanChangeIconTitle = i43.f();
                    } else if (s == 24) {
                        this.official = i43.f();
                    } else if (s == 32) {
                        this.allCanPinMessage = i43.f();
                    } else if (s == 40) {
                        this.onlyAdminCanAddMember = i43.f();
                    } else if (s == 56) {
                        this.onlyAdminCanCall = i43.f();
                    } else if (s == 64) {
                        this.sentByPhone = i43.f();
                    } else if (s == 72) {
                        this.serviceChat = i43.f();
                    } else if (s == 80) {
                        this.membersCanSeePrivateLink = i43.f();
                    } else if (!i43.u(s)) {
                        return this;
                    }
                }
            }
        }

        public static final class ChatSettings extends ad9 {
            private static volatile ChatSettings[] _emptyArray;
            public long dontDisturbUntil;
            public long favoriteIndex;
            public boolean hideLiveLocationPanel;
            public long hideLiveLocationPanelBeforeTime;
            public long hideMyLiveLocationPanelBeforeTime;
            public long lastNotifMark;
            public long lastNotifMessageId;
            public int[] options;

            public ChatSettings() {
                clear();
            }

            public static ChatSettings[] emptyArray() {
                if (_emptyArray == null) {
                    synchronized (bj7.b) {
                        try {
                            if (_emptyArray == null) {
                                _emptyArray = new ChatSettings[0];
                            }
                        } catch (Throwable th) {
                            throw th;
                        }
                    }
                }
                return _emptyArray;
            }

            public static ChatSettings parseFrom(byte[] bArr) throws InvalidProtocolBufferNanoException {
                return (ChatSettings) ad9.mergeFrom(new ChatSettings(), bArr);
            }

            public ChatSettings clear() {
                this.dontDisturbUntil = 0;
                this.options = ct.d;
                this.lastNotifMark = 0;
                this.favoriteIndex = 0;
                this.hideLiveLocationPanel = false;
                this.hideMyLiveLocationPanelBeforeTime = 0;
                this.hideLiveLocationPanelBeforeTime = 0;
                this.lastNotifMessageId = 0;
                this.cachedSize = -1;
                return this;
            }

            public int computeSerializedSize() {
                int[] iArr;
                long j = this.dontDisturbUntil;
                int i = 0;
                int h = j != 0 ? j43.h(1, j) : 0;
                int[] iArr2 = this.options;
                if (iArr2 != null && iArr2.length > 0) {
                    int i2 = 0;
                    while (true) {
                        iArr = this.options;
                        if (i >= iArr.length) {
                            break;
                        }
                        i2 += j43.g(iArr[i]);
                        i++;
                    }
                    h = h + i2 + iArr.length;
                }
                long j2 = this.lastNotifMark;
                if (j2 != 0) {
                    h += j43.h(3, j2);
                }
                long j3 = this.favoriteIndex;
                if (j3 != 0) {
                    h += j43.h(4, j3);
                }
                if (this.hideLiveLocationPanel) {
                    h += j43.a(6);
                }
                long j4 = this.hideMyLiveLocationPanelBeforeTime;
                if (j4 != 0) {
                    h += j43.h(7, j4);
                }
                long j5 = this.hideLiveLocationPanelBeforeTime;
                if (j5 != 0) {
                    h += j43.h(8, j5);
                }
                long j6 = this.lastNotifMessageId;
                return j6 != 0 ? h + j43.h(9, j6) : h;
            }

            public void writeTo(j43 j43) throws IOException {
                long j = this.dontDisturbUntil;
                if (j != 0) {
                    j43.x(1, j);
                }
                int[] iArr = this.options;
                if (iArr != null && iArr.length > 0) {
                    int i = 0;
                    while (true) {
                        int[] iArr2 = this.options;
                        if (i >= iArr2.length) {
                            break;
                        }
                        j43.w(2, iArr2[i]);
                        i++;
                    }
                }
                long j2 = this.lastNotifMark;
                if (j2 != 0) {
                    j43.x(3, j2);
                }
                long j3 = this.favoriteIndex;
                if (j3 != 0) {
                    j43.x(4, j3);
                }
                boolean z = this.hideLiveLocationPanel;
                if (z) {
                    j43.r(6, z);
                }
                long j4 = this.hideMyLiveLocationPanelBeforeTime;
                if (j4 != 0) {
                    j43.x(7, j4);
                }
                long j5 = this.hideLiveLocationPanelBeforeTime;
                if (j5 != 0) {
                    j43.x(8, j5);
                }
                long j6 = this.lastNotifMessageId;
                if (j6 != 0) {
                    j43.x(9, j6);
                }
            }

            public static ChatSettings parseFrom(i43 i43) throws IOException {
                return new ChatSettings().mergeFrom(i43);
            }

            public ChatSettings mergeFrom(i43 i43) throws IOException {
                while (true) {
                    int s = i43.s();
                    if (s == 0) {
                        return this;
                    }
                    if (s == 8) {
                        this.dontDisturbUntil = i43.q();
                    } else if (s == 16) {
                        int q = ct.q(i43, 16);
                        int[] iArr = new int[q];
                        int i = 0;
                        for (int i2 = 0; i2 < q; i2++) {
                            if (i2 != 0) {
                                i43.s();
                            }
                            int p = i43.p();
                            if (p == 0 || p == 1 || p == 2) {
                                iArr[i] = p;
                                i++;
                            }
                        }
                        if (i != 0) {
                            int[] iArr2 = this.options;
                            int length = iArr2 == null ? 0 : iArr2.length;
                            if (length == 0 && i == q) {
                                this.options = iArr;
                            } else {
                                int[] iArr3 = new int[(length + i)];
                                if (length != 0) {
                                    System.arraycopy(iArr2, 0, iArr3, 0, length);
                                }
                                System.arraycopy(iArr, 0, iArr3, length, i);
                                this.options = iArr3;
                            }
                        }
                    } else if (s == 18) {
                        int e = i43.e(i43.p());
                        int c = i43.c();
                        int i3 = 0;
                        while (i43.b() > 0) {
                            int p2 = i43.p();
                            if (p2 == 0 || p2 == 1 || p2 == 2) {
                                i3++;
                            }
                        }
                        if (i3 != 0) {
                            i43.t(c);
                            int[] iArr4 = this.options;
                            int length2 = iArr4 == null ? 0 : iArr4.length;
                            int[] iArr5 = new int[(i3 + length2)];
                            if (length2 != 0) {
                                System.arraycopy(iArr4, 0, iArr5, 0, length2);
                            }
                            while (i43.b() > 0) {
                                int p3 = i43.p();
                                if (p3 == 0 || p3 == 1 || p3 == 2) {
                                    iArr5[length2] = p3;
                                    length2++;
                                }
                            }
                            this.options = iArr5;
                        }
                        i43.d(e);
                    } else if (s == 24) {
                        this.lastNotifMark = i43.q();
                    } else if (s == 32) {
                        this.favoriteIndex = i43.q();
                    } else if (s == 48) {
                        this.hideLiveLocationPanel = i43.f();
                    } else if (s == 56) {
                        this.hideMyLiveLocationPanelBeforeTime = i43.q();
                    } else if (s == 64) {
                        this.hideLiveLocationPanelBeforeTime = i43.q();
                    } else if (s == 72) {
                        this.lastNotifMessageId = i43.q();
                    } else if (!i43.u(s)) {
                        return this;
                    }
                }
            }
        }

        public static final class ChatSubject extends ad9 {
            private static volatile ChatSubject[] _emptyArray;
            public long[] organizationIds;

            public ChatSubject() {
                clear();
            }

            public static ChatSubject[] emptyArray() {
                if (_emptyArray == null) {
                    synchronized (bj7.b) {
                        try {
                            if (_emptyArray == null) {
                                _emptyArray = new ChatSubject[0];
                            }
                        } catch (Throwable th) {
                            throw th;
                        }
                    }
                }
                return _emptyArray;
            }

            public static ChatSubject parseFrom(byte[] bArr) throws InvalidProtocolBufferNanoException {
                return (ChatSubject) ad9.mergeFrom(new ChatSubject(), bArr);
            }

            public ChatSubject clear() {
                this.organizationIds = ct.e;
                this.cachedSize = -1;
                return this;
            }

            public int computeSerializedSize() {
                long[] jArr = this.organizationIds;
                int i = 0;
                if (jArr == null || jArr.length <= 0) {
                    return 0;
                }
                int i2 = 0;
                while (true) {
                    long[] jArr2 = this.organizationIds;
                    if (i >= jArr2.length) {
                        return i2 + jArr2.length;
                    }
                    i2 += j43.k(jArr2[i]);
                    i++;
                }
            }

            public void writeTo(j43 j43) throws IOException {
                long[] jArr = this.organizationIds;
                if (jArr != null && jArr.length > 0) {
                    int i = 0;
                    while (true) {
                        long[] jArr2 = this.organizationIds;
                        if (i < jArr2.length) {
                            j43.x(1, jArr2[i]);
                            i++;
                        } else {
                            return;
                        }
                    }
                }
            }

            public static ChatSubject parseFrom(i43 i43) throws IOException {
                return new ChatSubject().mergeFrom(i43);
            }

            public ChatSubject mergeFrom(i43 i43) throws IOException {
                while (true) {
                    int s = i43.s();
                    if (s == 0) {
                        return this;
                    }
                    if (s == 8) {
                        int q = ct.q(i43, 8);
                        long[] jArr = this.organizationIds;
                        int length = jArr == null ? 0 : jArr.length;
                        int i = q + length;
                        long[] jArr2 = new long[i];
                        if (length != 0) {
                            System.arraycopy(jArr, 0, jArr2, 0, length);
                        }
                        while (length < i - 1) {
                            jArr2[length] = i43.q();
                            i43.s();
                            length++;
                        }
                        jArr2[length] = i43.q();
                        this.organizationIds = jArr2;
                    } else if (s == 10) {
                        int e = i43.e(i43.p());
                        int c = i43.c();
                        int i2 = 0;
                        while (i43.b() > 0) {
                            i43.q();
                            i2++;
                        }
                        i43.t(c);
                        long[] jArr3 = this.organizationIds;
                        int length2 = jArr3 == null ? 0 : jArr3.length;
                        int i3 = i2 + length2;
                        long[] jArr4 = new long[i3];
                        if (length2 != 0) {
                            System.arraycopy(jArr3, 0, jArr4, 0, length2);
                        }
                        while (length2 < i3) {
                            jArr4[length2] = i43.q();
                            length2++;
                        }
                        this.organizationIds = jArr4;
                        i43.d(e);
                    } else if (!i43.u(s)) {
                        return this;
                    }
                }
            }
        }

        public static final class Chunk extends ad9 {
            private static volatile Chunk[] _emptyArray;
            public long endTime;
            public long startTime;

            public Chunk() {
                clear();
            }

            public static Chunk[] emptyArray() {
                if (_emptyArray == null) {
                    synchronized (bj7.b) {
                        try {
                            if (_emptyArray == null) {
                                _emptyArray = new Chunk[0];
                            }
                        } catch (Throwable th) {
                            throw th;
                        }
                    }
                }
                return _emptyArray;
            }

            public static Chunk parseFrom(byte[] bArr) throws InvalidProtocolBufferNanoException {
                return (Chunk) ad9.mergeFrom(new Chunk(), bArr);
            }

            public Chunk clear() {
                this.startTime = 0;
                this.endTime = 0;
                this.cachedSize = -1;
                return this;
            }

            public int computeSerializedSize() {
                long j = this.startTime;
                int h = j != 0 ? j43.h(1, j) : 0;
                long j2 = this.endTime;
                return j2 != 0 ? h + j43.h(2, j2) : h;
            }

            public void writeTo(j43 j43) throws IOException {
                long j = this.startTime;
                if (j != 0) {
                    j43.x(1, j);
                }
                long j2 = this.endTime;
                if (j2 != 0) {
                    j43.x(2, j2);
                }
            }

            public static Chunk parseFrom(i43 i43) throws IOException {
                return new Chunk().mergeFrom(i43);
            }

            public Chunk mergeFrom(i43 i43) throws IOException {
                while (true) {
                    int s = i43.s();
                    if (s == 0) {
                        return this;
                    }
                    if (s == 8) {
                        this.startTime = i43.q();
                    } else if (s == 16) {
                        this.endTime = i43.q();
                    } else if (!i43.u(s)) {
                        return this;
                    }
                }
            }
        }

        public static final class GroupChatInfo extends ad9 {
            public static final int ALL = 2;
            public static final int DISABLED = 0;
            public static final int MEMBERS = 1;
            private static volatile GroupChatInfo[] _emptyArray;
            public String baseIconUrl;
            public long groupId;
            public GroupOptions groupOptions;
            public boolean isAnswered;
            public boolean isCustomTitle;
            public boolean isImportant;
            public boolean isMember;
            public boolean isModerator;
            public int messagingPermissions;
            public String name;

            public static final class GroupOptions extends ad9 {
                private static volatile GroupOptions[] _emptyArray;
                public boolean groupPremium;

                public GroupOptions() {
                    clear();
                }

                public static GroupOptions[] emptyArray() {
                    if (_emptyArray == null) {
                        synchronized (bj7.b) {
                            try {
                                if (_emptyArray == null) {
                                    _emptyArray = new GroupOptions[0];
                                }
                            } catch (Throwable th) {
                                throw th;
                            }
                        }
                    }
                    return _emptyArray;
                }

                public static GroupOptions parseFrom(byte[] bArr) throws InvalidProtocolBufferNanoException {
                    return (GroupOptions) ad9.mergeFrom(new GroupOptions(), bArr);
                }

                public GroupOptions clear() {
                    this.groupPremium = false;
                    this.cachedSize = -1;
                    return this;
                }

                public int computeSerializedSize() {
                    if (this.groupPremium) {
                        return j43.a(1);
                    }
                    return 0;
                }

                public void writeTo(j43 j43) throws IOException {
                    boolean z = this.groupPremium;
                    if (z) {
                        j43.r(1, z);
                    }
                }

                public static GroupOptions parseFrom(i43 i43) throws IOException {
                    return new GroupOptions().mergeFrom(i43);
                }

                public GroupOptions mergeFrom(i43 i43) throws IOException {
                    while (true) {
                        int s = i43.s();
                        if (s == 0) {
                            return this;
                        }
                        if (s == 8) {
                            this.groupPremium = i43.f();
                        } else if (!i43.u(s)) {
                            return this;
                        }
                    }
                }
            }

            public GroupChatInfo() {
                clear();
            }

            public static GroupChatInfo[] emptyArray() {
                if (_emptyArray == null) {
                    synchronized (bj7.b) {
                        try {
                            if (_emptyArray == null) {
                                _emptyArray = new GroupChatInfo[0];
                            }
                        } catch (Throwable th) {
                            throw th;
                        }
                    }
                }
                return _emptyArray;
            }

            public static GroupChatInfo parseFrom(byte[] bArr) throws InvalidProtocolBufferNanoException {
                return (GroupChatInfo) ad9.mergeFrom(new GroupChatInfo(), bArr);
            }

            public GroupChatInfo clear() {
                this.groupId = 0;
                this.isAnswered = false;
                this.isModerator = false;
                this.isImportant = false;
                this.name = "";
                this.baseIconUrl = "";
                this.isCustomTitle = false;
                this.isMember = false;
                this.messagingPermissions = 0;
                this.groupOptions = null;
                this.cachedSize = -1;
                return this;
            }

            public int computeSerializedSize() {
                long j = this.groupId;
                int h = j != 0 ? j43.h(1, j) : 0;
                if (this.isAnswered) {
                    h += j43.a(2);
                }
                if (this.isModerator) {
                    h += j43.a(3);
                }
                if (this.isImportant) {
                    h += j43.a(4);
                }
                if (!this.name.equals("")) {
                    h += j43.l(5, this.name);
                }
                if (!this.baseIconUrl.equals("")) {
                    h += j43.l(6, this.baseIconUrl);
                }
                if (this.isCustomTitle) {
                    h += j43.a(7);
                }
                if (this.isMember) {
                    h += j43.a(8);
                }
                int i = this.messagingPermissions;
                if (i != 0) {
                    h += j43.f(9, i);
                }
                GroupOptions groupOptions2 = this.groupOptions;
                return groupOptions2 != null ? h + j43.i(10, groupOptions2) : h;
            }

            public void writeTo(j43 j43) throws IOException {
                long j = this.groupId;
                if (j != 0) {
                    j43.x(1, j);
                }
                boolean z = this.isAnswered;
                if (z) {
                    j43.r(2, z);
                }
                boolean z2 = this.isModerator;
                if (z2) {
                    j43.r(3, z2);
                }
                boolean z3 = this.isImportant;
                if (z3) {
                    j43.r(4, z3);
                }
                if (!this.name.equals("")) {
                    j43.E(5, this.name);
                }
                if (!this.baseIconUrl.equals("")) {
                    j43.E(6, this.baseIconUrl);
                }
                boolean z4 = this.isCustomTitle;
                if (z4) {
                    j43.r(7, z4);
                }
                boolean z5 = this.isMember;
                if (z5) {
                    j43.r(8, z5);
                }
                int i = this.messagingPermissions;
                if (i != 0) {
                    j43.w(9, i);
                }
                GroupOptions groupOptions2 = this.groupOptions;
                if (groupOptions2 != null) {
                    j43.y(10, groupOptions2);
                }
            }

            public static GroupChatInfo parseFrom(i43 i43) throws IOException {
                return new GroupChatInfo().mergeFrom(i43);
            }

            public GroupChatInfo mergeFrom(i43 i43) throws IOException {
                while (true) {
                    int s = i43.s();
                    switch (s) {
                        case 0:
                            return this;
                        case 8:
                            this.groupId = i43.q();
                            break;
                        case 16:
                            this.isAnswered = i43.f();
                            break;
                        case SavedMessagesIconDrawable.NORMAL_ICON_SIZE:
                            this.isModerator = i43.f();
                            break;
                        case 32:
                            this.isImportant = i43.f();
                            break;
                        case 42:
                            this.name = i43.r();
                            break;
                        case 50:
                            this.baseIconUrl = i43.r();
                            break;
                        case 56:
                            this.isCustomTitle = i43.f();
                            break;
                        case 64:
                            this.isMember = i43.f();
                            break;
                        case 72:
                            int p = i43.p();
                            if (p != 0 && p != 1 && p != 2) {
                                break;
                            } else {
                                this.messagingPermissions = p;
                                break;
                            }
                        case 82:
                            if (this.groupOptions == null) {
                                this.groupOptions = new GroupOptions();
                            }
                            i43.j(this.groupOptions);
                            break;
                        default:
                            if (i43.u(s)) {
                                break;
                            } else {
                                return this;
                            }
                    }
                }
            }
        }

        public static final class LastInputMedia extends ad9 {
            private static volatile LastInputMedia[] _emptyArray;
            public String attachLocalId;
            public long dateModified;
            public String editedUri;
            public String mimeType;
            public long originalDuration;
            public long originalId;
            public int originalOrientation;
            public String originalUri;
            public String thumbnailUri;
            public int type;
            public int[] wave;

            public LastInputMedia() {
                clear();
            }

            public static LastInputMedia[] emptyArray() {
                if (_emptyArray == null) {
                    synchronized (bj7.b) {
                        try {
                            if (_emptyArray == null) {
                                _emptyArray = new LastInputMedia[0];
                            }
                        } catch (Throwable th) {
                            throw th;
                        }
                    }
                }
                return _emptyArray;
            }

            public static LastInputMedia parseFrom(byte[] bArr) throws InvalidProtocolBufferNanoException {
                return (LastInputMedia) ad9.mergeFrom(new LastInputMedia(), bArr);
            }

            public LastInputMedia clear() {
                this.originalId = 0;
                this.originalUri = "";
                this.thumbnailUri = "";
                this.originalOrientation = 0;
                this.originalDuration = 0;
                this.mimeType = "";
                this.dateModified = 0;
                this.editedUri = "";
                this.type = 0;
                this.wave = ct.d;
                this.attachLocalId = "";
                this.cachedSize = -1;
                return this;
            }

            public int computeSerializedSize() {
                int[] iArr;
                long j = this.originalId;
                int i = 0;
                int h = j != 0 ? j43.h(1, j) : 0;
                if (!this.originalUri.equals("")) {
                    h += j43.l(2, this.originalUri);
                }
                if (!this.thumbnailUri.equals("")) {
                    h += j43.l(3, this.thumbnailUri);
                }
                int i2 = this.originalOrientation;
                if (i2 != 0) {
                    h += j43.f(4, i2);
                }
                long j2 = this.originalDuration;
                if (j2 != 0) {
                    h += j43.h(5, j2);
                }
                if (!this.mimeType.equals("")) {
                    h += j43.l(6, this.mimeType);
                }
                long j3 = this.dateModified;
                if (j3 != 0) {
                    h += j43.h(7, j3);
                }
                if (!this.editedUri.equals("")) {
                    h += j43.l(8, this.editedUri);
                }
                int i3 = this.type;
                if (i3 != 0) {
                    h += j43.f(9, i3);
                }
                int[] iArr2 = this.wave;
                if (iArr2 != null && iArr2.length > 0) {
                    int i4 = 0;
                    while (true) {
                        iArr = this.wave;
                        if (i >= iArr.length) {
                            break;
                        }
                        i4 += j43.g(iArr[i]);
                        i++;
                    }
                    h = h + i4 + iArr.length;
                }
                return !this.attachLocalId.equals("") ? h + j43.l(12, this.attachLocalId) : h;
            }

            public void writeTo(j43 j43) throws IOException {
                long j = this.originalId;
                if (j != 0) {
                    j43.x(1, j);
                }
                if (!this.originalUri.equals("")) {
                    j43.E(2, this.originalUri);
                }
                if (!this.thumbnailUri.equals("")) {
                    j43.E(3, this.thumbnailUri);
                }
                int i = this.originalOrientation;
                if (i != 0) {
                    j43.w(4, i);
                }
                long j2 = this.originalDuration;
                if (j2 != 0) {
                    j43.x(5, j2);
                }
                if (!this.mimeType.equals("")) {
                    j43.E(6, this.mimeType);
                }
                long j3 = this.dateModified;
                if (j3 != 0) {
                    j43.x(7, j3);
                }
                if (!this.editedUri.equals("")) {
                    j43.E(8, this.editedUri);
                }
                int i2 = this.type;
                if (i2 != 0) {
                    j43.w(9, i2);
                }
                int[] iArr = this.wave;
                if (iArr != null && iArr.length > 0) {
                    int i3 = 0;
                    while (true) {
                        int[] iArr2 = this.wave;
                        if (i3 >= iArr2.length) {
                            break;
                        }
                        j43.w(11, iArr2[i3]);
                        i3++;
                    }
                }
                if (!this.attachLocalId.equals("")) {
                    j43.E(12, this.attachLocalId);
                }
            }

            public static LastInputMedia parseFrom(i43 i43) throws IOException {
                return new LastInputMedia().mergeFrom(i43);
            }

            public LastInputMedia mergeFrom(i43 i43) throws IOException {
                while (true) {
                    int s = i43.s();
                    switch (s) {
                        case 0:
                            return this;
                        case 8:
                            this.originalId = i43.q();
                            break;
                        case 18:
                            this.originalUri = i43.r();
                            break;
                        case 26:
                            this.thumbnailUri = i43.r();
                            break;
                        case 32:
                            this.originalOrientation = i43.p();
                            break;
                        case SavedMessagesIconDrawable.SMALL_SIZE:
                            this.originalDuration = i43.q();
                            break;
                        case 50:
                            this.mimeType = i43.r();
                            break;
                        case 56:
                            this.dateModified = i43.q();
                            break;
                        case 66:
                            this.editedUri = i43.r();
                            break;
                        case 72:
                            this.type = i43.p();
                            break;
                        case 88:
                            int q = ct.q(i43, 88);
                            int[] iArr = this.wave;
                            int length = iArr == null ? 0 : iArr.length;
                            int i = q + length;
                            int[] iArr2 = new int[i];
                            if (length != 0) {
                                System.arraycopy(iArr, 0, iArr2, 0, length);
                            }
                            while (length < i - 1) {
                                iArr2[length] = i43.p();
                                i43.s();
                                length++;
                            }
                            iArr2[length] = i43.p();
                            this.wave = iArr2;
                            break;
                        case 90:
                            int e = i43.e(i43.p());
                            int c = i43.c();
                            int i2 = 0;
                            while (i43.b() > 0) {
                                i43.p();
                                i2++;
                            }
                            i43.t(c);
                            int[] iArr3 = this.wave;
                            int length2 = iArr3 == null ? 0 : iArr3.length;
                            int i3 = i2 + length2;
                            int[] iArr4 = new int[i3];
                            if (length2 != 0) {
                                System.arraycopy(iArr3, 0, iArr4, 0, length2);
                            }
                            while (length2 < i3) {
                                iArr4[length2] = i43.p();
                                length2++;
                            }
                            this.wave = iArr4;
                            i43.d(e);
                            break;
                        case 98:
                            this.attachLocalId = i43.r();
                            break;
                        default:
                            if (i43.u(s)) {
                                break;
                            } else {
                                return this;
                            }
                    }
                }
            }
        }

        public static final class PushMessage extends ad9 {
            private static volatile PushMessage[] _emptyArray;
            public long id;
            public String text;
            public long time;

            public PushMessage() {
                clear();
            }

            public static PushMessage[] emptyArray() {
                if (_emptyArray == null) {
                    synchronized (bj7.b) {
                        try {
                            if (_emptyArray == null) {
                                _emptyArray = new PushMessage[0];
                            }
                        } catch (Throwable th) {
                            throw th;
                        }
                    }
                }
                return _emptyArray;
            }

            public static PushMessage parseFrom(byte[] bArr) throws InvalidProtocolBufferNanoException {
                return (PushMessage) ad9.mergeFrom(new PushMessage(), bArr);
            }

            public PushMessage clear() {
                this.id = 0;
                this.time = 0;
                this.text = "";
                this.cachedSize = -1;
                return this;
            }

            public int computeSerializedSize() {
                long j = this.id;
                int h = j != 0 ? j43.h(1, j) : 0;
                long j2 = this.time;
                if (j2 != 0) {
                    h += j43.h(2, j2);
                }
                return !this.text.equals("") ? h + j43.l(3, this.text) : h;
            }

            public void writeTo(j43 j43) throws IOException {
                long j = this.id;
                if (j != 0) {
                    j43.x(1, j);
                }
                long j2 = this.time;
                if (j2 != 0) {
                    j43.x(2, j2);
                }
                if (!this.text.equals("")) {
                    j43.E(3, this.text);
                }
            }

            public static PushMessage parseFrom(i43 i43) throws IOException {
                return new PushMessage().mergeFrom(i43);
            }

            public PushMessage mergeFrom(i43 i43) throws IOException {
                while (true) {
                    int s = i43.s();
                    if (s == 0) {
                        return this;
                    }
                    if (s == 8) {
                        this.id = i43.q();
                    } else if (s == 16) {
                        this.time = i43.q();
                    } else if (s == 26) {
                        this.text = i43.r();
                    } else if (!i43.u(s)) {
                        return this;
                    }
                }
            }
        }

        public static final class Section extends ad9 {
            private static volatile Section[] _emptyArray;
            public boolean collapsed;
            public String id;
            public long marker;
            public long[] stickerSets;
            public long[] stickers;
            public String title;
            public int totalCount;

            public Section() {
                clear();
            }

            public static Section[] emptyArray() {
                if (_emptyArray == null) {
                    synchronized (bj7.b) {
                        try {
                            if (_emptyArray == null) {
                                _emptyArray = new Section[0];
                            }
                        } catch (Throwable th) {
                            throw th;
                        }
                    }
                }
                return _emptyArray;
            }

            public static Section parseFrom(byte[] bArr) throws InvalidProtocolBufferNanoException {
                return (Section) ad9.mergeFrom(new Section(), bArr);
            }

            public Section clear() {
                this.id = "";
                this.title = "";
                long[] jArr = ct.e;
                this.stickers = jArr;
                this.marker = 0;
                this.collapsed = false;
                this.stickerSets = jArr;
                this.totalCount = 0;
                this.cachedSize = -1;
                return this;
            }

            public int computeSerializedSize() {
                long[] jArr;
                long[] jArr2;
                int i = 0;
                int l = !this.id.equals("") ? j43.l(1, this.id) : 0;
                if (!this.title.equals("")) {
                    l += j43.l(2, this.title);
                }
                long[] jArr3 = this.stickers;
                if (jArr3 != null && jArr3.length > 0) {
                    int i2 = 0;
                    int i3 = 0;
                    while (true) {
                        jArr2 = this.stickers;
                        if (i2 >= jArr2.length) {
                            break;
                        }
                        i3 += j43.k(jArr2[i2]);
                        i2++;
                    }
                    l = l + i3 + jArr2.length;
                }
                long j = this.marker;
                if (j != 0) {
                    l += j43.h(4, j);
                }
                if (this.collapsed) {
                    l += j43.a(5);
                }
                long[] jArr4 = this.stickerSets;
                if (jArr4 != null && jArr4.length > 0) {
                    int i4 = 0;
                    while (true) {
                        jArr = this.stickerSets;
                        if (i >= jArr.length) {
                            break;
                        }
                        i4 += j43.k(jArr[i]);
                        i++;
                    }
                    l = l + i4 + jArr.length;
                }
                int i5 = this.totalCount;
                return i5 != 0 ? l + j43.f(7, i5) : l;
            }

            public void writeTo(j43 j43) throws IOException {
                if (!this.id.equals("")) {
                    j43.E(1, this.id);
                }
                if (!this.title.equals("")) {
                    j43.E(2, this.title);
                }
                long[] jArr = this.stickers;
                int i = 0;
                if (jArr != null && jArr.length > 0) {
                    int i2 = 0;
                    while (true) {
                        long[] jArr2 = this.stickers;
                        if (i2 >= jArr2.length) {
                            break;
                        }
                        j43.x(3, jArr2[i2]);
                        i2++;
                    }
                }
                long j = this.marker;
                if (j != 0) {
                    j43.x(4, j);
                }
                boolean z = this.collapsed;
                if (z) {
                    j43.r(5, z);
                }
                long[] jArr3 = this.stickerSets;
                if (jArr3 != null && jArr3.length > 0) {
                    while (true) {
                        long[] jArr4 = this.stickerSets;
                        if (i >= jArr4.length) {
                            break;
                        }
                        j43.x(6, jArr4[i]);
                        i++;
                    }
                }
                int i3 = this.totalCount;
                if (i3 != 0) {
                    j43.w(7, i3);
                }
            }

            public static Section parseFrom(i43 i43) throws IOException {
                return new Section().mergeFrom(i43);
            }

            public Section mergeFrom(i43 i43) throws IOException {
                while (true) {
                    int s = i43.s();
                    if (s == 0) {
                        return this;
                    }
                    if (s == 10) {
                        this.id = i43.r();
                    } else if (s == 18) {
                        this.title = i43.r();
                    } else if (s == 24) {
                        int q = ct.q(i43, 24);
                        long[] jArr = this.stickers;
                        int length = jArr == null ? 0 : jArr.length;
                        int i = q + length;
                        long[] jArr2 = new long[i];
                        if (length != 0) {
                            System.arraycopy(jArr, 0, jArr2, 0, length);
                        }
                        while (length < i - 1) {
                            jArr2[length] = i43.q();
                            i43.s();
                            length++;
                        }
                        jArr2[length] = i43.q();
                        this.stickers = jArr2;
                    } else if (s == 26) {
                        int e = i43.e(i43.p());
                        int c = i43.c();
                        int i2 = 0;
                        while (i43.b() > 0) {
                            i43.q();
                            i2++;
                        }
                        i43.t(c);
                        long[] jArr3 = this.stickers;
                        int length2 = jArr3 == null ? 0 : jArr3.length;
                        int i3 = i2 + length2;
                        long[] jArr4 = new long[i3];
                        if (length2 != 0) {
                            System.arraycopy(jArr3, 0, jArr4, 0, length2);
                        }
                        while (length2 < i3) {
                            jArr4[length2] = i43.q();
                            length2++;
                        }
                        this.stickers = jArr4;
                        i43.d(e);
                    } else if (s == 32) {
                        this.marker = i43.q();
                    } else if (s == 40) {
                        this.collapsed = i43.f();
                    } else if (s == 48) {
                        int q2 = ct.q(i43, 48);
                        long[] jArr5 = this.stickerSets;
                        int length3 = jArr5 == null ? 0 : jArr5.length;
                        int i4 = q2 + length3;
                        long[] jArr6 = new long[i4];
                        if (length3 != 0) {
                            System.arraycopy(jArr5, 0, jArr6, 0, length3);
                        }
                        while (length3 < i4 - 1) {
                            jArr6[length3] = i43.q();
                            i43.s();
                            length3++;
                        }
                        jArr6[length3] = i43.q();
                        this.stickerSets = jArr6;
                    } else if (s == 50) {
                        int e2 = i43.e(i43.p());
                        int c2 = i43.c();
                        int i5 = 0;
                        while (i43.b() > 0) {
                            i43.q();
                            i5++;
                        }
                        i43.t(c2);
                        long[] jArr7 = this.stickerSets;
                        int length4 = jArr7 == null ? 0 : jArr7.length;
                        int i6 = i5 + length4;
                        long[] jArr8 = new long[i6];
                        if (length4 != 0) {
                            System.arraycopy(jArr7, 0, jArr8, 0, length4);
                        }
                        while (length4 < i6) {
                            jArr8[length4] = i43.q();
                            length4++;
                        }
                        this.stickerSets = jArr8;
                        i43.d(e2);
                    } else if (s == 56) {
                        this.totalCount = i43.p();
                    } else if (!i43.u(s)) {
                        return this;
                    }
                }
            }
        }

        public static final class VideoConversation extends ad9 {
            private static volatile VideoConversation[] _emptyArray;
            public String conversationId;
            public String joinLink;
            public long startedAt;

            public VideoConversation() {
                clear();
            }

            public static VideoConversation[] emptyArray() {
                if (_emptyArray == null) {
                    synchronized (bj7.b) {
                        try {
                            if (_emptyArray == null) {
                                _emptyArray = new VideoConversation[0];
                            }
                        } catch (Throwable th) {
                            throw th;
                        }
                    }
                }
                return _emptyArray;
            }

            public static VideoConversation parseFrom(byte[] bArr) throws InvalidProtocolBufferNanoException {
                return (VideoConversation) ad9.mergeFrom(new VideoConversation(), bArr);
            }

            public VideoConversation clear() {
                this.conversationId = "";
                this.startedAt = 0;
                this.joinLink = "";
                this.cachedSize = -1;
                return this;
            }

            public int computeSerializedSize() {
                int l = !this.conversationId.equals("") ? j43.l(1, this.conversationId) : 0;
                long j = this.startedAt;
                if (j != 0) {
                    l += j43.h(2, j);
                }
                return !this.joinLink.equals("") ? l + j43.l(3, this.joinLink) : l;
            }

            public void writeTo(j43 j43) throws IOException {
                if (!this.conversationId.equals("")) {
                    j43.E(1, this.conversationId);
                }
                long j = this.startedAt;
                if (j != 0) {
                    j43.x(2, j);
                }
                if (!this.joinLink.equals("")) {
                    j43.E(3, this.joinLink);
                }
            }

            public static VideoConversation parseFrom(i43 i43) throws IOException {
                return new VideoConversation().mergeFrom(i43);
            }

            public VideoConversation mergeFrom(i43 i43) throws IOException {
                while (true) {
                    int s = i43.s();
                    if (s == 0) {
                        return this;
                    }
                    if (s == 10) {
                        this.conversationId = i43.r();
                    } else if (s == 16) {
                        this.startedAt = i43.q();
                    } else if (s == 26) {
                        this.joinLink = i43.r();
                    } else if (!i43.u(s)) {
                        return this;
                    }
                }
            }
        }

        public Chat() {
            clear();
        }

        public static Chat[] emptyArray() {
            if (_emptyArray == null) {
                synchronized (bj7.b) {
                    try {
                        if (_emptyArray == null) {
                            _emptyArray = new Chat[0];
                        }
                    } catch (Throwable th) {
                        throw th;
                    }
                }
            }
            return _emptyArray;
        }

        public static Chat parseFrom(byte[] bArr) throws InvalidProtocolBufferNanoException {
            return (Chat) ad9.mergeFrom(new Chat(), bArr);
        }

        public Chat clear() {
            this.serverId = 0;
            this.type = 0;
            this.status = 0;
            this.owner = 0;
            this.participants = null;
            this.created = 0;
            this.title = "";
            this.lastMessageId = 0;
            this.lastEventTime = 0;
            this.cid = 0;
            this.newMessages = 0;
            this.chunk = Chunk.emptyArray();
            this.lastInput = "";
            this.chatSettings = null;
            this.mediaAll = null;
            this.firstMessageId = 0;
            this.sections = Section.emptyArray();
            this.stickersOrder = ct.g;
            this.stickersSyncTime = 0;
            this.localChanges = ct.d;
            this.channelInfo = null;
            this.accessType = 0;
            this.link = "";
            this.chatSubject = null;
            this.restrictions = 0;
            this.groupChatInfo = null;
            this.participantsCount = 0;
            this.description = "";
            long[] jArr = ct.e;
            this.admins = jArr;
            this.blockedParticipantsCount = 0;
            this.chatOptions = null;
            this.mediaMusic = null;
            this.mediaAudio = null;
            this.pinnedMessageId = 0;
            this.hidePinnedMessage = false;
            this.unreadReply = false;
            this.unreadPin = false;
            this.joinTime = 0;
            this.messagesTtlSec = 0;
            this.adminParticipants = null;
            this.baseIconUrl = "";
            this.baseRawIconUrl = "";
            this.unbindOkPanelCloseTime = 0;
            this.flagsSettings = 0;
            this.videoConversation = null;
            this.lastOpenPositionTime = 0;
            this.lastOpenPositionOffset = 0;
            this.lastOpenReadMark = 0;
            this.lastWriteTime = 0;
            this.lastSearchClickTime = 0;
            this.lastOpenNewMessages = 0;
            this.lastInputMedia = LastInputMedia.emptyArray();
            this.mediaPhotoVideo = null;
            this.mediaShare = null;
            this.mediaFiles = null;
            this.botsInfo = null;
            this.mediaLocations = null;
            this.lastInputEditMessageId = 0;
            this.modified = 0;
            this.lastInputReplyMessageId = 0;
            this.draft = ct.h;
            this.draftUpdateTime = 0;
            this.subscribedToUpdates = false;
            this.liveLocationMessageIds = null;
            this.lastMentionMessageId = 0;
            this.chatFoldersIds = jArr;
            this.draftUpdateTimeForSyncLogic = 0;
            this.markedAsUnread = false;
            this.lastPushMessage = null;
            this.lastReactedMessageId = 0;
            this.lastReaction = "";
            this.lastFireDelayedErrorTime = 0;
            this.lastDelayedUpdateTime = 0;
            this.delayedChunk = Chunk.emptyArray();
            this.cachedSize = -1;
            return this;
        }

        public int computeSerializedSize() {
            long[] jArr;
            long[] jArr2;
            int[] iArr;
            long j = this.serverId;
            int i = 0;
            int h = j != 0 ? j43.h(1, j) : 0;
            int i2 = this.type;
            if (i2 != 0) {
                h += j43.f(2, i2);
            }
            int i3 = this.status;
            if (i3 != 0) {
                h += j43.f(3, i3);
            }
            long j2 = this.owner;
            if (j2 != 0) {
                h += j43.h(4, j2);
            }
            Map<Long, Long> map = this.participants;
            if (map != null) {
                h += bj7.a(map, 5, 3, 3);
            }
            long j3 = this.created;
            if (j3 != 0) {
                h += j43.h(6, j3);
            }
            if (!this.title.equals("")) {
                h += j43.l(7, this.title);
            }
            long j4 = this.lastMessageId;
            if (j4 != 0) {
                h += j43.h(10, j4);
            }
            long j5 = this.lastEventTime;
            if (j5 != 0) {
                h += j43.h(11, j5);
            }
            long j6 = this.cid;
            if (j6 != 0) {
                h += j43.h(12, j6);
            }
            int i4 = this.newMessages;
            if (i4 != 0) {
                h += j43.f(13, i4);
            }
            Chunk[] chunkArr = this.chunk;
            if (chunkArr != null && chunkArr.length > 0) {
                int i5 = 0;
                while (true) {
                    Chunk[] chunkArr2 = this.chunk;
                    if (i5 >= chunkArr2.length) {
                        break;
                    }
                    Chunk chunk2 = chunkArr2[i5];
                    if (chunk2 != null) {
                        h = j43.i(14, chunk2) + h;
                    }
                    i5++;
                }
            }
            if (!this.lastInput.equals("")) {
                h += j43.l(15, this.lastInput);
            }
            ChatSettings chatSettings2 = this.chatSettings;
            if (chatSettings2 != null) {
                h += j43.i(16, chatSettings2);
            }
            ChatMedia chatMedia = this.mediaAll;
            if (chatMedia != null) {
                h += j43.i(17, chatMedia);
            }
            long j7 = this.firstMessageId;
            if (j7 != 0) {
                h += j43.h(18, j7);
            }
            Section[] sectionArr = this.sections;
            if (sectionArr != null && sectionArr.length > 0) {
                int i6 = 0;
                while (true) {
                    Section[] sectionArr2 = this.sections;
                    if (i6 >= sectionArr2.length) {
                        break;
                    }
                    Section section = sectionArr2[i6];
                    if (section != null) {
                        h = j43.i(19, section) + h;
                    }
                    i6++;
                }
            }
            String[] strArr = this.stickersOrder;
            if (strArr != null && strArr.length > 0) {
                int i7 = 0;
                int i8 = 0;
                int i9 = 0;
                while (true) {
                    String[] strArr2 = this.stickersOrder;
                    if (i7 >= strArr2.length) {
                        break;
                    }
                    String str = strArr2[i7];
                    if (str != null) {
                        i9++;
                        int q = j43.q(str);
                        i8 += j43.j(q) + q;
                    }
                    i7++;
                }
                h = h + i8 + (i9 * 2);
            }
            long j8 = this.stickersSyncTime;
            if (j8 != 0) {
                h += j43.h(21, j8);
            }
            int[] iArr2 = this.localChanges;
            if (iArr2 != null && iArr2.length > 0) {
                int i10 = 0;
                int i11 = 0;
                while (true) {
                    iArr = this.localChanges;
                    if (i10 >= iArr.length) {
                        break;
                    }
                    i11 += j43.g(iArr[i10]);
                    i10++;
                }
                h = h + i11 + (iArr.length * 2);
            }
            ChannelInfo channelInfo2 = this.channelInfo;
            if (channelInfo2 != null) {
                h += j43.i(23, channelInfo2);
            }
            int i12 = this.accessType;
            if (i12 != 0) {
                h += j43.f(24, i12);
            }
            if (!this.link.equals("")) {
                h += j43.l(25, this.link);
            }
            ChatSubject chatSubject2 = this.chatSubject;
            if (chatSubject2 != null) {
                h += j43.i(26, chatSubject2);
            }
            int i13 = this.restrictions;
            if (i13 != 0) {
                h += j43.f(27, i13);
            }
            GroupChatInfo groupChatInfo2 = this.groupChatInfo;
            if (groupChatInfo2 != null) {
                h += j43.i(28, groupChatInfo2);
            }
            int i14 = this.participantsCount;
            if (i14 != 0) {
                h += j43.f(29, i14);
            }
            if (!this.description.equals("")) {
                h += j43.l(30, this.description);
            }
            long[] jArr3 = this.admins;
            if (jArr3 != null && jArr3.length > 0) {
                int i15 = 0;
                int i16 = 0;
                while (true) {
                    jArr2 = this.admins;
                    if (i15 >= jArr2.length) {
                        break;
                    }
                    i16 += j43.k(jArr2[i15]);
                    i15++;
                }
                h = h + i16 + (jArr2.length * 2);
            }
            int i17 = this.blockedParticipantsCount;
            if (i17 != 0) {
                h += j43.f(32, i17);
            }
            ChatOptions chatOptions2 = this.chatOptions;
            if (chatOptions2 != null) {
                h += j43.i(33, chatOptions2);
            }
            ChatMedia chatMedia2 = this.mediaMusic;
            if (chatMedia2 != null) {
                h += j43.i(34, chatMedia2);
            }
            ChatMedia chatMedia3 = this.mediaAudio;
            if (chatMedia3 != null) {
                h += j43.i(35, chatMedia3);
            }
            long j9 = this.pinnedMessageId;
            if (j9 != 0) {
                h += j43.h(36, j9);
            }
            if (this.hidePinnedMessage) {
                h += j43.a(37);
            }
            if (this.unreadReply) {
                h += j43.a(38);
            }
            if (this.unreadPin) {
                h += j43.a(39);
            }
            long j10 = this.joinTime;
            if (j10 != 0) {
                h += j43.h(40, j10);
            }
            int i18 = this.messagesTtlSec;
            if (i18 != 0) {
                h += j43.f(42, i18);
            }
            Map<Long, AdminParticipant> map2 = this.adminParticipants;
            if (map2 != null) {
                h += bj7.a(map2, 43, 3, 11);
            }
            if (!this.baseIconUrl.equals("")) {
                h += j43.l(44, this.baseIconUrl);
            }
            if (!this.baseRawIconUrl.equals("")) {
                h += j43.l(45, this.baseRawIconUrl);
            }
            long j11 = this.unbindOkPanelCloseTime;
            if (j11 != 0) {
                h += j43.h(46, j11);
            }
            int i19 = this.flagsSettings;
            if (i19 != 0) {
                h += j43.f(47, i19);
            }
            VideoConversation videoConversation2 = this.videoConversation;
            if (videoConversation2 != null) {
                h += j43.i(48, videoConversation2);
            }
            long j12 = this.lastOpenPositionTime;
            if (j12 != 0) {
                h += j43.h(49, j12);
            }
            int i20 = this.lastOpenPositionOffset;
            if (i20 != 0) {
                h += j43.f(50, i20);
            }
            long j13 = this.lastOpenReadMark;
            if (j13 != 0) {
                h += j43.h(51, j13);
            }
            long j14 = this.lastWriteTime;
            if (j14 != 0) {
                h += j43.h(52, j14);
            }
            long j15 = this.lastSearchClickTime;
            if (j15 != 0) {
                h += j43.h(53, j15);
            }
            long j16 = this.lastOpenNewMessages;
            if (j16 != 0) {
                h += j43.h(54, j16);
            }
            LastInputMedia[] lastInputMediaArr = this.lastInputMedia;
            if (lastInputMediaArr != null && lastInputMediaArr.length > 0) {
                int i21 = 0;
                while (true) {
                    LastInputMedia[] lastInputMediaArr2 = this.lastInputMedia;
                    if (i21 >= lastInputMediaArr2.length) {
                        break;
                    }
                    LastInputMedia lastInputMedia2 = lastInputMediaArr2[i21];
                    if (lastInputMedia2 != null) {
                        h = j43.i(55, lastInputMedia2) + h;
                    }
                    i21++;
                }
            }
            ChatMedia chatMedia4 = this.mediaPhotoVideo;
            if (chatMedia4 != null) {
                h += j43.i(56, chatMedia4);
            }
            ChatMedia chatMedia5 = this.mediaShare;
            if (chatMedia5 != null) {
                h += j43.i(57, chatMedia5);
            }
            ChatMedia chatMedia6 = this.mediaFiles;
            if (chatMedia6 != null) {
                h += j43.i(58, chatMedia6);
            }
            BotsInfo botsInfo2 = this.botsInfo;
            if (botsInfo2 != null) {
                h += j43.i(59, botsInfo2);
            }
            ChatMedia chatMedia7 = this.mediaLocations;
            if (chatMedia7 != null) {
                h += j43.i(60, chatMedia7);
            }
            long j17 = this.lastInputEditMessageId;
            if (j17 != 0) {
                h += j43.h(61, j17);
            }
            long j18 = this.modified;
            if (j18 != 0) {
                h += j43.h(62, j18);
            }
            long j19 = this.lastInputReplyMessageId;
            if (j19 != 0) {
                h += j43.h(63, j19);
            }
            if (!Arrays.equals(this.draft, ct.h)) {
                h += j43.b(64, this.draft);
            }
            long j20 = this.draftUpdateTime;
            if (j20 != 0) {
                h += j43.h(65, j20);
            }
            if (this.subscribedToUpdates) {
                h += j43.a(66);
            }
            Map<Long, Long> map3 = this.liveLocationMessageIds;
            if (map3 != null) {
                h += bj7.a(map3, 67, 3, 3);
            }
            long j21 = this.lastMentionMessageId;
            if (j21 != 0) {
                h += j43.h(68, j21);
            }
            long[] jArr4 = this.chatFoldersIds;
            if (jArr4 != null && jArr4.length > 0) {
                int i22 = 0;
                int i23 = 0;
                while (true) {
                    jArr = this.chatFoldersIds;
                    if (i22 >= jArr.length) {
                        break;
                    }
                    i23 += j43.k(jArr[i22]);
                    i22++;
                }
                h = h + i23 + (jArr.length * 2);
            }
            long j22 = this.draftUpdateTimeForSyncLogic;
            if (j22 != 0) {
                h += j43.h(70, j22);
            }
            if (this.markedAsUnread) {
                h += j43.a(71);
            }
            PushMessage pushMessage = this.lastPushMessage;
            if (pushMessage != null) {
                h += j43.i(72, pushMessage);
            }
            long j23 = this.lastReactedMessageId;
            if (j23 != 0) {
                h += j43.h(73, j23);
            }
            if (!this.lastReaction.equals("")) {
                h += j43.l(74, this.lastReaction);
            }
            long j24 = this.lastFireDelayedErrorTime;
            if (j24 != 0) {
                h += j43.h(75, j24);
            }
            long j25 = this.lastDelayedUpdateTime;
            if (j25 != 0) {
                h += j43.h(76, j25);
            }
            Chunk[] chunkArr3 = this.delayedChunk;
            if (chunkArr3 != null && chunkArr3.length > 0) {
                while (true) {
                    Chunk[] chunkArr4 = this.delayedChunk;
                    if (i >= chunkArr4.length) {
                        break;
                    }
                    Chunk chunk3 = chunkArr4[i];
                    if (chunk3 != null) {
                        h = j43.i(77, chunk3) + h;
                    }
                    i++;
                }
            }
            return h;
        }

        public void writeTo(j43 j43) throws IOException {
            long j = this.serverId;
            if (j != 0) {
                j43.x(1, j);
            }
            int i = this.type;
            if (i != 0) {
                j43.w(2, i);
            }
            int i2 = this.status;
            if (i2 != 0) {
                j43.w(3, i2);
            }
            long j2 = this.owner;
            if (j2 != 0) {
                j43.x(4, j2);
            }
            Map<Long, Long> map = this.participants;
            if (map != null) {
                bj7.d(j43, map, 5, 3, 3);
            }
            long j3 = this.created;
            if (j3 != 0) {
                j43.x(6, j3);
            }
            if (!this.title.equals("")) {
                j43.E(7, this.title);
            }
            long j4 = this.lastMessageId;
            if (j4 != 0) {
                j43.x(10, j4);
            }
            long j5 = this.lastEventTime;
            if (j5 != 0) {
                j43.x(11, j5);
            }
            long j6 = this.cid;
            if (j6 != 0) {
                j43.x(12, j6);
            }
            int i3 = this.newMessages;
            if (i3 != 0) {
                j43.w(13, i3);
            }
            Chunk[] chunkArr = this.chunk;
            int i4 = 0;
            if (chunkArr != null && chunkArr.length > 0) {
                int i5 = 0;
                while (true) {
                    Chunk[] chunkArr2 = this.chunk;
                    if (i5 >= chunkArr2.length) {
                        break;
                    }
                    Chunk chunk2 = chunkArr2[i5];
                    if (chunk2 != null) {
                        j43.y(14, chunk2);
                    }
                    i5++;
                }
            }
            if (!this.lastInput.equals("")) {
                j43.E(15, this.lastInput);
            }
            ChatSettings chatSettings2 = this.chatSettings;
            if (chatSettings2 != null) {
                j43.y(16, chatSettings2);
            }
            ChatMedia chatMedia = this.mediaAll;
            if (chatMedia != null) {
                j43.y(17, chatMedia);
            }
            long j7 = this.firstMessageId;
            if (j7 != 0) {
                j43.x(18, j7);
            }
            Section[] sectionArr = this.sections;
            if (sectionArr != null && sectionArr.length > 0) {
                int i6 = 0;
                while (true) {
                    Section[] sectionArr2 = this.sections;
                    if (i6 >= sectionArr2.length) {
                        break;
                    }
                    Section section = sectionArr2[i6];
                    if (section != null) {
                        j43.y(19, section);
                    }
                    i6++;
                }
            }
            String[] strArr = this.stickersOrder;
            if (strArr != null && strArr.length > 0) {
                int i7 = 0;
                while (true) {
                    String[] strArr2 = this.stickersOrder;
                    if (i7 >= strArr2.length) {
                        break;
                    }
                    String str = strArr2[i7];
                    if (str != null) {
                        j43.E(20, str);
                    }
                    i7++;
                }
            }
            long j8 = this.stickersSyncTime;
            if (j8 != 0) {
                j43.x(21, j8);
            }
            int[] iArr = this.localChanges;
            if (iArr != null && iArr.length > 0) {
                int i8 = 0;
                while (true) {
                    int[] iArr2 = this.localChanges;
                    if (i8 >= iArr2.length) {
                        break;
                    }
                    j43.w(22, iArr2[i8]);
                    i8++;
                }
            }
            ChannelInfo channelInfo2 = this.channelInfo;
            if (channelInfo2 != null) {
                j43.y(23, channelInfo2);
            }
            int i9 = this.accessType;
            if (i9 != 0) {
                j43.w(24, i9);
            }
            if (!this.link.equals("")) {
                j43.E(25, this.link);
            }
            ChatSubject chatSubject2 = this.chatSubject;
            if (chatSubject2 != null) {
                j43.y(26, chatSubject2);
            }
            int i10 = this.restrictions;
            if (i10 != 0) {
                j43.w(27, i10);
            }
            GroupChatInfo groupChatInfo2 = this.groupChatInfo;
            if (groupChatInfo2 != null) {
                j43.y(28, groupChatInfo2);
            }
            int i11 = this.participantsCount;
            if (i11 != 0) {
                j43.w(29, i11);
            }
            if (!this.description.equals("")) {
                j43.E(30, this.description);
            }
            long[] jArr = this.admins;
            if (jArr != null && jArr.length > 0) {
                int i12 = 0;
                while (true) {
                    long[] jArr2 = this.admins;
                    if (i12 >= jArr2.length) {
                        break;
                    }
                    j43.x(31, jArr2[i12]);
                    i12++;
                }
            }
            int i13 = this.blockedParticipantsCount;
            if (i13 != 0) {
                j43.w(32, i13);
            }
            ChatOptions chatOptions2 = this.chatOptions;
            if (chatOptions2 != null) {
                j43.y(33, chatOptions2);
            }
            ChatMedia chatMedia2 = this.mediaMusic;
            if (chatMedia2 != null) {
                j43.y(34, chatMedia2);
            }
            ChatMedia chatMedia3 = this.mediaAudio;
            if (chatMedia3 != null) {
                j43.y(35, chatMedia3);
            }
            long j9 = this.pinnedMessageId;
            if (j9 != 0) {
                j43.x(36, j9);
            }
            boolean z = this.hidePinnedMessage;
            if (z) {
                j43.r(37, z);
            }
            boolean z2 = this.unreadReply;
            if (z2) {
                j43.r(38, z2);
            }
            boolean z3 = this.unreadPin;
            if (z3) {
                j43.r(39, z3);
            }
            long j10 = this.joinTime;
            if (j10 != 0) {
                j43.x(40, j10);
            }
            int i14 = this.messagesTtlSec;
            if (i14 != 0) {
                j43.w(42, i14);
            }
            Map<Long, AdminParticipant> map2 = this.adminParticipants;
            if (map2 != null) {
                bj7.d(j43, map2, 43, 3, 11);
            }
            if (!this.baseIconUrl.equals("")) {
                j43.E(44, this.baseIconUrl);
            }
            if (!this.baseRawIconUrl.equals("")) {
                j43.E(45, this.baseRawIconUrl);
            }
            long j11 = this.unbindOkPanelCloseTime;
            if (j11 != 0) {
                j43.x(46, j11);
            }
            int i15 = this.flagsSettings;
            if (i15 != 0) {
                j43.w(47, i15);
            }
            VideoConversation videoConversation2 = this.videoConversation;
            if (videoConversation2 != null) {
                j43.y(48, videoConversation2);
            }
            long j12 = this.lastOpenPositionTime;
            if (j12 != 0) {
                j43.x(49, j12);
            }
            int i16 = this.lastOpenPositionOffset;
            if (i16 != 0) {
                j43.w(50, i16);
            }
            long j13 = this.lastOpenReadMark;
            if (j13 != 0) {
                j43.x(51, j13);
            }
            long j14 = this.lastWriteTime;
            if (j14 != 0) {
                j43.x(52, j14);
            }
            long j15 = this.lastSearchClickTime;
            if (j15 != 0) {
                j43.x(53, j15);
            }
            long j16 = this.lastOpenNewMessages;
            if (j16 != 0) {
                j43.x(54, j16);
            }
            LastInputMedia[] lastInputMediaArr = this.lastInputMedia;
            if (lastInputMediaArr != null && lastInputMediaArr.length > 0) {
                int i17 = 0;
                while (true) {
                    LastInputMedia[] lastInputMediaArr2 = this.lastInputMedia;
                    if (i17 >= lastInputMediaArr2.length) {
                        break;
                    }
                    LastInputMedia lastInputMedia2 = lastInputMediaArr2[i17];
                    if (lastInputMedia2 != null) {
                        j43.y(55, lastInputMedia2);
                    }
                    i17++;
                }
            }
            ChatMedia chatMedia4 = this.mediaPhotoVideo;
            if (chatMedia4 != null) {
                j43.y(56, chatMedia4);
            }
            ChatMedia chatMedia5 = this.mediaShare;
            if (chatMedia5 != null) {
                j43.y(57, chatMedia5);
            }
            ChatMedia chatMedia6 = this.mediaFiles;
            if (chatMedia6 != null) {
                j43.y(58, chatMedia6);
            }
            BotsInfo botsInfo2 = this.botsInfo;
            if (botsInfo2 != null) {
                j43.y(59, botsInfo2);
            }
            ChatMedia chatMedia7 = this.mediaLocations;
            if (chatMedia7 != null) {
                j43.y(60, chatMedia7);
            }
            long j17 = this.lastInputEditMessageId;
            if (j17 != 0) {
                j43.x(61, j17);
            }
            long j18 = this.modified;
            if (j18 != 0) {
                j43.x(62, j18);
            }
            long j19 = this.lastInputReplyMessageId;
            if (j19 != 0) {
                j43.x(63, j19);
            }
            if (!Arrays.equals(this.draft, ct.h)) {
                j43.s(64, this.draft);
            }
            long j20 = this.draftUpdateTime;
            if (j20 != 0) {
                j43.x(65, j20);
            }
            boolean z4 = this.subscribedToUpdates;
            if (z4) {
                j43.r(66, z4);
            }
            Map<Long, Long> map3 = this.liveLocationMessageIds;
            if (map3 != null) {
                bj7.d(j43, map3, 67, 3, 3);
            }
            long j21 = this.lastMentionMessageId;
            if (j21 != 0) {
                j43.x(68, j21);
            }
            long[] jArr3 = this.chatFoldersIds;
            if (jArr3 != null && jArr3.length > 0) {
                int i18 = 0;
                while (true) {
                    long[] jArr4 = this.chatFoldersIds;
                    if (i18 >= jArr4.length) {
                        break;
                    }
                    j43.x(69, jArr4[i18]);
                    i18++;
                }
            }
            long j22 = this.draftUpdateTimeForSyncLogic;
            if (j22 != 0) {
                j43.x(70, j22);
            }
            boolean z5 = this.markedAsUnread;
            if (z5) {
                j43.r(71, z5);
            }
            PushMessage pushMessage = this.lastPushMessage;
            if (pushMessage != null) {
                j43.y(72, pushMessage);
            }
            long j23 = this.lastReactedMessageId;
            if (j23 != 0) {
                j43.x(73, j23);
            }
            if (!this.lastReaction.equals("")) {
                j43.E(74, this.lastReaction);
            }
            long j24 = this.lastFireDelayedErrorTime;
            if (j24 != 0) {
                j43.x(75, j24);
            }
            long j25 = this.lastDelayedUpdateTime;
            if (j25 != 0) {
                j43.x(76, j25);
            }
            Chunk[] chunkArr3 = this.delayedChunk;
            if (chunkArr3 != null && chunkArr3.length > 0) {
                while (true) {
                    Chunk[] chunkArr4 = this.delayedChunk;
                    if (i4 < chunkArr4.length) {
                        Chunk chunk3 = chunkArr4[i4];
                        if (chunk3 != null) {
                            j43.y(77, chunk3);
                        }
                        i4++;
                    } else {
                        return;
                    }
                }
            }
        }

        public static Chat parseFrom(i43 i43) throws IOException {
            return new Chat().mergeFrom(i43);
        }

        public Chat mergeFrom(i43 i43) throws IOException {
            sd8 sd8 = y7e.e;
            while (true) {
                int s = i43.s();
                switch (s) {
                    case 0:
                        return this;
                    case 8:
                        this.serverId = i43.q();
                        break;
                    case 16:
                        int p = i43.p();
                        if (p != 0 && p != 1 && p != 2 && p != 3) {
                            break;
                        } else {
                            this.type = p;
                            break;
                        }
                    case SavedMessagesIconDrawable.NORMAL_ICON_SIZE:
                        int p2 = i43.p();
                        switch (p2) {
                            case 0:
                            case 1:
                            case 2:
                            case 3:
                            case 4:
                            case 5:
                            case 6:
                                this.status = p2;
                                break;
                        }
                    case 32:
                        this.owner = i43.q();
                        break;
                    case 42:
                        this.participants = bj7.b(i43, this.participants, sd8, 3, 3, (ad9) null, 8, 16);
                        break;
                    case 48:
                        this.created = i43.q();
                        break;
                    case 58:
                        this.title = i43.r();
                        break;
                    case 80:
                        this.lastMessageId = i43.q();
                        break;
                    case 88:
                        this.lastEventTime = i43.q();
                        break;
                    case 96:
                        this.cid = i43.q();
                        break;
                    case 104:
                        this.newMessages = i43.p();
                        break;
                    case 114:
                        int q = ct.q(i43, 114);
                        Chunk[] chunkArr = this.chunk;
                        int length = chunkArr == null ? 0 : chunkArr.length;
                        int i = q + length;
                        Chunk[] chunkArr2 = new Chunk[i];
                        if (length != 0) {
                            System.arraycopy(chunkArr, 0, chunkArr2, 0, length);
                        }
                        while (length < i - 1) {
                            Chunk chunk2 = new Chunk();
                            chunkArr2[length] = chunk2;
                            i43.j(chunk2);
                            i43.s();
                            length++;
                        }
                        Chunk chunk3 = new Chunk();
                        chunkArr2[length] = chunk3;
                        i43.j(chunk3);
                        this.chunk = chunkArr2;
                        break;
                    case 122:
                        this.lastInput = i43.r();
                        break;
                    case 130:
                        if (this.chatSettings == null) {
                            this.chatSettings = new ChatSettings();
                        }
                        i43.j(this.chatSettings);
                        break;
                    case 138:
                        if (this.mediaAll == null) {
                            this.mediaAll = new ChatMedia();
                        }
                        i43.j(this.mediaAll);
                        break;
                    case 144:
                        this.firstMessageId = i43.q();
                        break;
                    case 154:
                        int q2 = ct.q(i43, 154);
                        Section[] sectionArr = this.sections;
                        int length2 = sectionArr == null ? 0 : sectionArr.length;
                        int i2 = q2 + length2;
                        Section[] sectionArr2 = new Section[i2];
                        if (length2 != 0) {
                            System.arraycopy(sectionArr, 0, sectionArr2, 0, length2);
                        }
                        while (length2 < i2 - 1) {
                            Section section = new Section();
                            sectionArr2[length2] = section;
                            i43.j(section);
                            i43.s();
                            length2++;
                        }
                        Section section2 = new Section();
                        sectionArr2[length2] = section2;
                        i43.j(section2);
                        this.sections = sectionArr2;
                        break;
                    case 162:
                        int q3 = ct.q(i43, 162);
                        String[] strArr = this.stickersOrder;
                        int length3 = strArr == null ? 0 : strArr.length;
                        int i3 = q3 + length3;
                        String[] strArr2 = new String[i3];
                        if (length3 != 0) {
                            System.arraycopy(strArr, 0, strArr2, 0, length3);
                        }
                        while (length3 < i3 - 1) {
                            strArr2[length3] = i43.r();
                            i43.s();
                            length3++;
                        }
                        strArr2[length3] = i43.r();
                        this.stickersOrder = strArr2;
                        break;
                    case 168:
                        this.stickersSyncTime = i43.q();
                        break;
                    case 176:
                        int q4 = ct.q(i43, 176);
                        int[] iArr = this.localChanges;
                        int length4 = iArr == null ? 0 : iArr.length;
                        int i4 = q4 + length4;
                        int[] iArr2 = new int[i4];
                        if (length4 != 0) {
                            System.arraycopy(iArr, 0, iArr2, 0, length4);
                        }
                        while (length4 < i4 - 1) {
                            iArr2[length4] = i43.p();
                            i43.s();
                            length4++;
                        }
                        iArr2[length4] = i43.p();
                        this.localChanges = iArr2;
                        break;
                    case 178:
                        int e = i43.e(i43.p());
                        int c = i43.c();
                        int i5 = 0;
                        while (i43.b() > 0) {
                            i43.p();
                            i5++;
                        }
                        i43.t(c);
                        int[] iArr3 = this.localChanges;
                        int length5 = iArr3 == null ? 0 : iArr3.length;
                        int i6 = i5 + length5;
                        int[] iArr4 = new int[i6];
                        if (length5 != 0) {
                            System.arraycopy(iArr3, 0, iArr4, 0, length5);
                        }
                        while (length5 < i6) {
                            iArr4[length5] = i43.p();
                            length5++;
                        }
                        this.localChanges = iArr4;
                        i43.d(e);
                        break;
                    case 186:
                        if (this.channelInfo == null) {
                            this.channelInfo = new ChannelInfo();
                        }
                        i43.j(this.channelInfo);
                        break;
                    case 192:
                        int p3 = i43.p();
                        if (p3 != 0 && p3 != 1) {
                            break;
                        } else {
                            this.accessType = p3;
                            break;
                        }
                    case HttpStatus.SC_ACCEPTED:
                        this.link = i43.r();
                        break;
                    case 210:
                        if (this.chatSubject == null) {
                            this.chatSubject = new ChatSubject();
                        }
                        i43.j(this.chatSubject);
                        break;
                    case 216:
                        this.restrictions = i43.p();
                        break;
                    case 226:
                        if (this.groupChatInfo == null) {
                            this.groupChatInfo = new GroupChatInfo();
                        }
                        i43.j(this.groupChatInfo);
                        break;
                    case 232:
                        this.participantsCount = i43.p();
                        break;
                    case 242:
                        this.description = i43.r();
                        break;
                    case 248:
                        int q5 = ct.q(i43, 248);
                        long[] jArr = this.admins;
                        int length6 = jArr == null ? 0 : jArr.length;
                        int i7 = q5 + length6;
                        long[] jArr2 = new long[i7];
                        if (length6 != 0) {
                            System.arraycopy(jArr, 0, jArr2, 0, length6);
                        }
                        while (length6 < i7 - 1) {
                            jArr2[length6] = i43.q();
                            i43.s();
                            length6++;
                        }
                        jArr2[length6] = i43.q();
                        this.admins = jArr2;
                        break;
                    case 250:
                        int e2 = i43.e(i43.p());
                        int c2 = i43.c();
                        int i8 = 0;
                        while (i43.b() > 0) {
                            i43.q();
                            i8++;
                        }
                        i43.t(c2);
                        long[] jArr3 = this.admins;
                        int length7 = jArr3 == null ? 0 : jArr3.length;
                        int i9 = i8 + length7;
                        long[] jArr4 = new long[i9];
                        if (length7 != 0) {
                            System.arraycopy(jArr3, 0, jArr4, 0, length7);
                        }
                        while (length7 < i9) {
                            jArr4[length7] = i43.q();
                            length7++;
                        }
                        this.admins = jArr4;
                        i43.d(e2);
                        break;
                    case 256:
                        this.blockedParticipantsCount = i43.p();
                        break;
                    case 266:
                        if (this.chatOptions == null) {
                            this.chatOptions = new ChatOptions();
                        }
                        i43.j(this.chatOptions);
                        break;
                    case 274:
                        if (this.mediaMusic == null) {
                            this.mediaMusic = new ChatMedia();
                        }
                        i43.j(this.mediaMusic);
                        break;
                    case 282:
                        if (this.mediaAudio == null) {
                            this.mediaAudio = new ChatMedia();
                        }
                        i43.j(this.mediaAudio);
                        break;
                    case 288:
                        this.pinnedMessageId = i43.q();
                        break;
                    case 296:
                        this.hidePinnedMessage = i43.f();
                        break;
                    case HttpStatus.SC_NOT_MODIFIED:
                        this.unreadReply = i43.f();
                        break;
                    case 312:
                        this.unreadPin = i43.f();
                        break;
                    case 320:
                        this.joinTime = i43.q();
                        break;
                    case 336:
                        this.messagesTtlSec = i43.p();
                        break;
                    case 346:
                        this.adminParticipants = bj7.b(i43, this.adminParticipants, sd8, 3, 11, new AdminParticipant(), 8, 18);
                        break;
                    case 354:
                        this.baseIconUrl = i43.r();
                        break;
                    case 362:
                        this.baseRawIconUrl = i43.r();
                        break;
                    case 368:
                        this.unbindOkPanelCloseTime = i43.q();
                        break;
                    case 376:
                        this.flagsSettings = i43.p();
                        break;
                    case 386:
                        if (this.videoConversation == null) {
                            this.videoConversation = new VideoConversation();
                        }
                        i43.j(this.videoConversation);
                        break;
                    case 392:
                        this.lastOpenPositionTime = i43.q();
                        break;
                    case HttpStatus.SC_BAD_REQUEST:
                        this.lastOpenPositionOffset = i43.p();
                        break;
                    case HttpStatus.SC_REQUEST_TIMEOUT:
                        this.lastOpenReadMark = i43.q();
                        break;
                    case HttpStatus.SC_REQUESTED_RANGE_NOT_SATISFIABLE:
                        this.lastWriteTime = i43.q();
                        break;
                    case HttpStatus.SC_FAILED_DEPENDENCY:
                        this.lastSearchClickTime = i43.q();
                        break;
                    case 432:
                        this.lastOpenNewMessages = i43.q();
                        break;
                    case 442:
                        int q6 = ct.q(i43, 442);
                        LastInputMedia[] lastInputMediaArr = this.lastInputMedia;
                        int length8 = lastInputMediaArr == null ? 0 : lastInputMediaArr.length;
                        int i10 = q6 + length8;
                        LastInputMedia[] lastInputMediaArr2 = new LastInputMedia[i10];
                        if (length8 != 0) {
                            System.arraycopy(lastInputMediaArr, 0, lastInputMediaArr2, 0, length8);
                        }
                        while (length8 < i10 - 1) {
                            LastInputMedia lastInputMedia2 = new LastInputMedia();
                            lastInputMediaArr2[length8] = lastInputMedia2;
                            i43.j(lastInputMedia2);
                            i43.s();
                            length8++;
                        }
                        LastInputMedia lastInputMedia3 = new LastInputMedia();
                        lastInputMediaArr2[length8] = lastInputMedia3;
                        i43.j(lastInputMedia3);
                        this.lastInputMedia = lastInputMediaArr2;
                        break;
                    case 450:
                        if (this.mediaPhotoVideo == null) {
                            this.mediaPhotoVideo = new ChatMedia();
                        }
                        i43.j(this.mediaPhotoVideo);
                        break;
                    case 458:
                        if (this.mediaShare == null) {
                            this.mediaShare = new ChatMedia();
                        }
                        i43.j(this.mediaShare);
                        break;
                    case 466:
                        if (this.mediaFiles == null) {
                            this.mediaFiles = new ChatMedia();
                        }
                        i43.j(this.mediaFiles);
                        break;
                    case 474:
                        if (this.botsInfo == null) {
                            this.botsInfo = new BotsInfo();
                        }
                        i43.j(this.botsInfo);
                        break;
                    case 482:
                        if (this.mediaLocations == null) {
                            this.mediaLocations = new ChatMedia();
                        }
                        i43.j(this.mediaLocations);
                        break;
                    case 488:
                        this.lastInputEditMessageId = i43.q();
                        break;
                    case 496:
                        this.modified = i43.q();
                        break;
                    case HttpStatus.SC_GATEWAY_TIMEOUT:
                        this.lastInputReplyMessageId = i43.q();
                        break;
                    case 514:
                        this.draft = i43.g();
                        break;
                    case 520:
                        this.draftUpdateTime = i43.q();
                        break;
                    case 528:
                        this.subscribedToUpdates = i43.f();
                        break;
                    case 538:
                        this.liveLocationMessageIds = bj7.b(i43, this.liveLocationMessageIds, sd8, 3, 3, (ad9) null, 8, 16);
                        break;
                    case 544:
                        this.lastMentionMessageId = i43.q();
                        break;
                    case 552:
                        int q7 = ct.q(i43, 552);
                        long[] jArr5 = this.chatFoldersIds;
                        int length9 = jArr5 == null ? 0 : jArr5.length;
                        int i11 = q7 + length9;
                        long[] jArr6 = new long[i11];
                        if (length9 != 0) {
                            System.arraycopy(jArr5, 0, jArr6, 0, length9);
                        }
                        while (length9 < i11 - 1) {
                            jArr6[length9] = i43.q();
                            i43.s();
                            length9++;
                        }
                        jArr6[length9] = i43.q();
                        this.chatFoldersIds = jArr6;
                        break;
                    case 554:
                        int e3 = i43.e(i43.p());
                        int c3 = i43.c();
                        int i12 = 0;
                        while (i43.b() > 0) {
                            i43.q();
                            i12++;
                        }
                        i43.t(c3);
                        long[] jArr7 = this.chatFoldersIds;
                        int length10 = jArr7 == null ? 0 : jArr7.length;
                        int i13 = i12 + length10;
                        long[] jArr8 = new long[i13];
                        if (length10 != 0) {
                            System.arraycopy(jArr7, 0, jArr8, 0, length10);
                        }
                        while (length10 < i13) {
                            jArr8[length10] = i43.q();
                            length10++;
                        }
                        this.chatFoldersIds = jArr8;
                        i43.d(e3);
                        break;
                    case 560:
                        this.draftUpdateTimeForSyncLogic = i43.q();
                        break;
                    case 568:
                        this.markedAsUnread = i43.f();
                        break;
                    case 578:
                        if (this.lastPushMessage == null) {
                            this.lastPushMessage = new PushMessage();
                        }
                        i43.j(this.lastPushMessage);
                        break;
                    case 584:
                        this.lastReactedMessageId = i43.q();
                        break;
                    case 594:
                        this.lastReaction = i43.r();
                        break;
                    case 600:
                        this.lastFireDelayedErrorTime = i43.q();
                        break;
                    case 608:
                        this.lastDelayedUpdateTime = i43.q();
                        break;
                    case 618:
                        int q8 = ct.q(i43, 618);
                        Chunk[] chunkArr3 = this.delayedChunk;
                        int length11 = chunkArr3 == null ? 0 : chunkArr3.length;
                        int i14 = q8 + length11;
                        Chunk[] chunkArr4 = new Chunk[i14];
                        if (length11 != 0) {
                            System.arraycopy(chunkArr3, 0, chunkArr4, 0, length11);
                        }
                        while (length11 < i14 - 1) {
                            Chunk chunk4 = new Chunk();
                            chunkArr4[length11] = chunk4;
                            i43.j(chunk4);
                            i43.s();
                            length11++;
                        }
                        Chunk chunk5 = new Chunk();
                        chunkArr4[length11] = chunk5;
                        i43.j(chunk5);
                        this.delayedChunk = chunkArr4;
                        break;
                    default:
                        if (i43.u(s)) {
                            break;
                        } else {
                            return this;
                        }
                }
            }
        }
    }

    public static final class Contact extends ad9 {
        public static final int BLOCKED = 1;
        public static final int BOT = 1;
        public static final int EXTERNAL = 1;
        public static final int FEMALE = 2;
        public static final int HAS_WEBAPP = 3;
        public static final int IS_NULL = 0;
        public static final int MALE = 1;
        public static final int OFFICIAL = 0;
        public static final int PortalStatus_BLOCKED = 0;
        public static final int PortalStatus_REMOVED = 1;
        public static final int REMOVED = 2;
        public static final int SERVICE_ACCOUNT = 2;
        public static final int UNKNOWN = 0;
        public static final int USER_LIST = 0;
        private static volatile Contact[] _emptyArray;
        public String baseRawUrl;
        public String baseUrl;
        public String birthday;
        public String description;
        public String deviceAvatarUrl;
        public String deviceName;
        public int gender;
        public long lastSearchClickTime;
        public long lastShowingUnknownContactBar;
        public long lastSyncTime;
        public long lastUpdateTime;
        public String link;
        public MenuButton menuButton;
        public ContactName[] names;
        public int[] options;
        public long photoId;
        public int portalStatus;
        public int[] profileOptions;
        public long serverId;
        public long serverPhone;
        public int settings;
        public int status;
        public int type;
        public long unbindOkPanelCloseTime;

        public static final class ContactName extends ad9 {
            public static final int CUSTOM = 1;
            public static final int DEVICE = 2;
            public static final int ONEME = 3;
            public static final int UNKNOWN = 0;
            private static volatile ContactName[] _emptyArray;
            public String lastName;
            public String name;
            public int type;

            public ContactName() {
                clear();
            }

            public static ContactName[] emptyArray() {
                if (_emptyArray == null) {
                    synchronized (bj7.b) {
                        try {
                            if (_emptyArray == null) {
                                _emptyArray = new ContactName[0];
                            }
                        } catch (Throwable th) {
                            throw th;
                        }
                    }
                }
                return _emptyArray;
            }

            public static ContactName parseFrom(byte[] bArr) throws InvalidProtocolBufferNanoException {
                return (ContactName) ad9.mergeFrom(new ContactName(), bArr);
            }

            public ContactName clear() {
                this.name = "";
                this.type = 0;
                this.lastName = "";
                this.cachedSize = -1;
                return this;
            }

            public int computeSerializedSize() {
                int l = !this.name.equals("") ? j43.l(1, this.name) : 0;
                int i = this.type;
                if (i != 0) {
                    l += j43.f(2, i);
                }
                return !this.lastName.equals("") ? l + j43.l(3, this.lastName) : l;
            }

            public void writeTo(j43 j43) throws IOException {
                if (!this.name.equals("")) {
                    j43.E(1, this.name);
                }
                int i = this.type;
                if (i != 0) {
                    j43.w(2, i);
                }
                if (!this.lastName.equals("")) {
                    j43.E(3, this.lastName);
                }
            }

            public static ContactName parseFrom(i43 i43) throws IOException {
                return new ContactName().mergeFrom(i43);
            }

            public ContactName mergeFrom(i43 i43) throws IOException {
                while (true) {
                    int s = i43.s();
                    if (s == 0) {
                        return this;
                    }
                    if (s == 10) {
                        this.name = i43.r();
                    } else if (s == 16) {
                        int p = i43.p();
                        if (p == 0 || p == 1 || p == 2 || p == 3) {
                            this.type = p;
                        }
                    } else if (s == 26) {
                        this.lastName = i43.r();
                    } else if (!i43.u(s)) {
                        return this;
                    }
                }
            }
        }

        public static final class MenuButton extends ad9 {
            private static volatile MenuButton[] _emptyArray;
            public String text;

            public MenuButton() {
                clear();
            }

            public static MenuButton[] emptyArray() {
                if (_emptyArray == null) {
                    synchronized (bj7.b) {
                        try {
                            if (_emptyArray == null) {
                                _emptyArray = new MenuButton[0];
                            }
                        } catch (Throwable th) {
                            throw th;
                        }
                    }
                }
                return _emptyArray;
            }

            public static MenuButton parseFrom(byte[] bArr) throws InvalidProtocolBufferNanoException {
                return (MenuButton) ad9.mergeFrom(new MenuButton(), bArr);
            }

            public MenuButton clear() {
                this.text = "";
                this.cachedSize = -1;
                return this;
            }

            public int computeSerializedSize() {
                if (!this.text.equals("")) {
                    return j43.l(1, this.text);
                }
                return 0;
            }

            public void writeTo(j43 j43) throws IOException {
                if (!this.text.equals("")) {
                    j43.E(1, this.text);
                }
            }

            public static MenuButton parseFrom(i43 i43) throws IOException {
                return new MenuButton().mergeFrom(i43);
            }

            public MenuButton mergeFrom(i43 i43) throws IOException {
                while (true) {
                    int s = i43.s();
                    if (s == 0) {
                        return this;
                    }
                    if (s == 10) {
                        this.text = i43.r();
                    } else if (!i43.u(s)) {
                        return this;
                    }
                }
            }
        }

        public Contact() {
            clear();
        }

        public static Contact[] emptyArray() {
            if (_emptyArray == null) {
                synchronized (bj7.b) {
                    try {
                        if (_emptyArray == null) {
                            _emptyArray = new Contact[0];
                        }
                    } catch (Throwable th) {
                        throw th;
                    }
                }
            }
            return _emptyArray;
        }

        public static Contact parseFrom(byte[] bArr) throws InvalidProtocolBufferNanoException {
            return (Contact) ad9.mergeFrom(new Contact(), bArr);
        }

        public Contact clear() {
            this.serverId = 0;
            this.deviceAvatarUrl = "";
            this.deviceName = "";
            this.lastUpdateTime = 0;
            this.serverPhone = 0;
            this.status = 0;
            this.type = 0;
            this.gender = 0;
            this.settings = 0;
            this.names = ContactName.emptyArray();
            int[] iArr = ct.d;
            this.options = iArr;
            this.description = "";
            this.link = "";
            this.birthday = "";
            this.photoId = 0;
            this.baseUrl = "";
            this.baseRawUrl = "";
            this.unbindOkPanelCloseTime = 0;
            this.lastSearchClickTime = 0;
            this.lastSyncTime = 0;
            this.lastShowingUnknownContactBar = 0;
            this.portalStatus = 0;
            this.menuButton = null;
            this.profileOptions = iArr;
            this.cachedSize = -1;
            return this;
        }

        public int computeSerializedSize() {
            int[] iArr;
            long j = this.serverId;
            int i = 0;
            int h = j != 0 ? j43.h(1, j) : 0;
            if (!this.deviceAvatarUrl.equals("")) {
                h += j43.l(4, this.deviceAvatarUrl);
            }
            if (!this.deviceName.equals("")) {
                h += j43.l(6, this.deviceName);
            }
            long j2 = this.lastUpdateTime;
            if (j2 != 0) {
                h += j43.h(8, j2);
            }
            long j3 = this.serverPhone;
            if (j3 != 0) {
                h += j43.h(9, j3);
            }
            int i2 = this.status;
            if (i2 != 0) {
                h += j43.f(10, i2);
            }
            int i3 = this.type;
            if (i3 != 0) {
                h += j43.f(11, i3);
            }
            int i4 = this.gender;
            if (i4 != 0) {
                h += j43.f(12, i4);
            }
            int i5 = this.settings;
            if (i5 != 0) {
                h += j43.f(13, i5);
            }
            ContactName[] contactNameArr = this.names;
            if (contactNameArr != null && contactNameArr.length > 0) {
                int i6 = 0;
                while (true) {
                    ContactName[] contactNameArr2 = this.names;
                    if (i6 >= contactNameArr2.length) {
                        break;
                    }
                    ContactName contactName = contactNameArr2[i6];
                    if (contactName != null) {
                        h = j43.i(14, contactName) + h;
                    }
                    i6++;
                }
            }
            int[] iArr2 = this.options;
            if (iArr2 != null && iArr2.length > 0) {
                int i7 = 0;
                int i8 = 0;
                while (true) {
                    iArr = this.options;
                    if (i7 >= iArr.length) {
                        break;
                    }
                    i8 += j43.g(iArr[i7]);
                    i7++;
                }
                h = h + i8 + iArr.length;
            }
            if (!this.description.equals("")) {
                h += j43.l(16, this.description);
            }
            if (!this.link.equals("")) {
                h += j43.l(17, this.link);
            }
            if (!this.birthday.equals("")) {
                h += j43.l(18, this.birthday);
            }
            long j4 = this.photoId;
            if (j4 != 0) {
                h += j43.h(19, j4);
            }
            if (!this.baseUrl.equals("")) {
                h += j43.l(20, this.baseUrl);
            }
            if (!this.baseRawUrl.equals("")) {
                h += j43.l(21, this.baseRawUrl);
            }
            long j5 = this.unbindOkPanelCloseTime;
            if (j5 != 0) {
                h += j43.h(22, j5);
            }
            long j6 = this.lastSearchClickTime;
            if (j6 != 0) {
                h += j43.h(23, j6);
            }
            long j7 = this.lastSyncTime;
            if (j7 != 0) {
                h += j43.h(24, j7);
            }
            long j8 = this.lastShowingUnknownContactBar;
            if (j8 != 0) {
                h += j43.h(25, j8);
            }
            int i9 = this.portalStatus;
            if (i9 != 0) {
                h += j43.f(27, i9);
            }
            MenuButton menuButton2 = this.menuButton;
            if (menuButton2 != null) {
                h += j43.i(28, menuButton2);
            }
            int[] iArr3 = this.profileOptions;
            if (iArr3 == null || iArr3.length <= 0) {
                return h;
            }
            int i10 = 0;
            while (true) {
                int[] iArr4 = this.profileOptions;
                if (i >= iArr4.length) {
                    return h + i10 + (iArr4.length * 2);
                }
                i10 += j43.g(iArr4[i]);
                i++;
            }
        }

        public void writeTo(j43 j43) throws IOException {
            long j = this.serverId;
            if (j != 0) {
                j43.x(1, j);
            }
            if (!this.deviceAvatarUrl.equals("")) {
                j43.E(4, this.deviceAvatarUrl);
            }
            if (!this.deviceName.equals("")) {
                j43.E(6, this.deviceName);
            }
            long j2 = this.lastUpdateTime;
            if (j2 != 0) {
                j43.x(8, j2);
            }
            long j3 = this.serverPhone;
            if (j3 != 0) {
                j43.x(9, j3);
            }
            int i = this.status;
            if (i != 0) {
                j43.w(10, i);
            }
            int i2 = this.type;
            if (i2 != 0) {
                j43.w(11, i2);
            }
            int i3 = this.gender;
            if (i3 != 0) {
                j43.w(12, i3);
            }
            int i4 = this.settings;
            if (i4 != 0) {
                j43.w(13, i4);
            }
            ContactName[] contactNameArr = this.names;
            int i5 = 0;
            if (contactNameArr != null && contactNameArr.length > 0) {
                int i6 = 0;
                while (true) {
                    ContactName[] contactNameArr2 = this.names;
                    if (i6 >= contactNameArr2.length) {
                        break;
                    }
                    ContactName contactName = contactNameArr2[i6];
                    if (contactName != null) {
                        j43.y(14, contactName);
                    }
                    i6++;
                }
            }
            int[] iArr = this.options;
            if (iArr != null && iArr.length > 0) {
                int i7 = 0;
                while (true) {
                    int[] iArr2 = this.options;
                    if (i7 >= iArr2.length) {
                        break;
                    }
                    j43.w(15, iArr2[i7]);
                    i7++;
                }
            }
            if (!this.description.equals("")) {
                j43.E(16, this.description);
            }
            if (!this.link.equals("")) {
                j43.E(17, this.link);
            }
            if (!this.birthday.equals("")) {
                j43.E(18, this.birthday);
            }
            long j4 = this.photoId;
            if (j4 != 0) {
                j43.x(19, j4);
            }
            if (!this.baseUrl.equals("")) {
                j43.E(20, this.baseUrl);
            }
            if (!this.baseRawUrl.equals("")) {
                j43.E(21, this.baseRawUrl);
            }
            long j5 = this.unbindOkPanelCloseTime;
            if (j5 != 0) {
                j43.x(22, j5);
            }
            long j6 = this.lastSearchClickTime;
            if (j6 != 0) {
                j43.x(23, j6);
            }
            long j7 = this.lastSyncTime;
            if (j7 != 0) {
                j43.x(24, j7);
            }
            long j8 = this.lastShowingUnknownContactBar;
            if (j8 != 0) {
                j43.x(25, j8);
            }
            int i8 = this.portalStatus;
            if (i8 != 0) {
                j43.w(27, i8);
            }
            MenuButton menuButton2 = this.menuButton;
            if (menuButton2 != null) {
                j43.y(28, menuButton2);
            }
            int[] iArr3 = this.profileOptions;
            if (iArr3 != null && iArr3.length > 0) {
                while (true) {
                    int[] iArr4 = this.profileOptions;
                    if (i5 < iArr4.length) {
                        j43.w(29, iArr4[i5]);
                        i5++;
                    } else {
                        return;
                    }
                }
            }
        }

        public static Contact parseFrom(i43 i43) throws IOException {
            return new Contact().mergeFrom(i43);
        }

        public Contact mergeFrom(i43 i43) throws IOException {
            while (true) {
                int s = i43.s();
                switch (s) {
                    case 0:
                        return this;
                    case 8:
                        this.serverId = i43.q();
                        break;
                    case 34:
                        this.deviceAvatarUrl = i43.r();
                        break;
                    case 50:
                        this.deviceName = i43.r();
                        break;
                    case 64:
                        this.lastUpdateTime = i43.q();
                        break;
                    case 72:
                        this.serverPhone = i43.q();
                        break;
                    case 80:
                        int p = i43.p();
                        if (p != 0 && p != 1 && p != 2) {
                            break;
                        } else {
                            this.status = p;
                            break;
                        }
                    case 88:
                        int p2 = i43.p();
                        if (p2 != 0 && p2 != 1) {
                            break;
                        } else {
                            this.type = p2;
                            break;
                        }
                    case 96:
                        int p3 = i43.p();
                        if (p3 != 0 && p3 != 1 && p3 != 2) {
                            break;
                        } else {
                            this.gender = p3;
                            break;
                        }
                    case 104:
                        this.settings = i43.p();
                        break;
                    case 114:
                        int q = ct.q(i43, 114);
                        ContactName[] contactNameArr = this.names;
                        int length = contactNameArr == null ? 0 : contactNameArr.length;
                        int i = q + length;
                        ContactName[] contactNameArr2 = new ContactName[i];
                        if (length != 0) {
                            System.arraycopy(contactNameArr, 0, contactNameArr2, 0, length);
                        }
                        while (length < i - 1) {
                            ContactName contactName = new ContactName();
                            contactNameArr2[length] = contactName;
                            i43.j(contactName);
                            i43.s();
                            length++;
                        }
                        ContactName contactName2 = new ContactName();
                        contactNameArr2[length] = contactName2;
                        i43.j(contactName2);
                        this.names = contactNameArr2;
                        break;
                    case 120:
                        int q2 = ct.q(i43, 120);
                        int[] iArr = new int[q2];
                        int i2 = 0;
                        for (int i3 = 0; i3 < q2; i3++) {
                            if (i3 != 0) {
                                i43.s();
                            }
                            int p4 = i43.p();
                            if (p4 == 0 || p4 == 1 || p4 == 2 || p4 == 3) {
                                iArr[i2] = p4;
                                i2++;
                            }
                        }
                        if (i2 != 0) {
                            int[] iArr2 = this.options;
                            int length2 = iArr2 == null ? 0 : iArr2.length;
                            if (length2 != 0 || i2 != q2) {
                                int[] iArr3 = new int[(length2 + i2)];
                                if (length2 != 0) {
                                    System.arraycopy(iArr2, 0, iArr3, 0, length2);
                                }
                                System.arraycopy(iArr, 0, iArr3, length2, i2);
                                this.options = iArr3;
                                break;
                            } else {
                                this.options = iArr;
                                break;
                            }
                        } else {
                            break;
                        }
                    case 122:
                        int e = i43.e(i43.p());
                        int c = i43.c();
                        int i4 = 0;
                        while (i43.b() > 0) {
                            int p5 = i43.p();
                            if (p5 == 0 || p5 == 1 || p5 == 2 || p5 == 3) {
                                i4++;
                            }
                        }
                        if (i4 != 0) {
                            i43.t(c);
                            int[] iArr4 = this.options;
                            int length3 = iArr4 == null ? 0 : iArr4.length;
                            int[] iArr5 = new int[(i4 + length3)];
                            if (length3 != 0) {
                                System.arraycopy(iArr4, 0, iArr5, 0, length3);
                            }
                            while (i43.b() > 0) {
                                int p6 = i43.p();
                                if (p6 == 0 || p6 == 1 || p6 == 2 || p6 == 3) {
                                    iArr5[length3] = p6;
                                    length3++;
                                }
                            }
                            this.options = iArr5;
                        }
                        i43.d(e);
                        break;
                    case 130:
                        this.description = i43.r();
                        break;
                    case 138:
                        this.link = i43.r();
                        break;
                    case 146:
                        this.birthday = i43.r();
                        break;
                    case 152:
                        this.photoId = i43.q();
                        break;
                    case 162:
                        this.baseUrl = i43.r();
                        break;
                    case 170:
                        this.baseRawUrl = i43.r();
                        break;
                    case 176:
                        this.unbindOkPanelCloseTime = i43.q();
                        break;
                    case 184:
                        this.lastSearchClickTime = i43.q();
                        break;
                    case 192:
                        this.lastSyncTime = i43.q();
                        break;
                    case 200:
                        this.lastShowingUnknownContactBar = i43.q();
                        break;
                    case 216:
                        int p7 = i43.p();
                        if (p7 != 0 && p7 != 1) {
                            break;
                        } else {
                            this.portalStatus = p7;
                            break;
                        }
                    case 226:
                        if (this.menuButton == null) {
                            this.menuButton = new MenuButton();
                        }
                        i43.j(this.menuButton);
                        break;
                    case 232:
                        int q3 = ct.q(i43, 232);
                        int[] iArr6 = this.profileOptions;
                        int length4 = iArr6 == null ? 0 : iArr6.length;
                        int i5 = q3 + length4;
                        int[] iArr7 = new int[i5];
                        if (length4 != 0) {
                            System.arraycopy(iArr6, 0, iArr7, 0, length4);
                        }
                        while (length4 < i5 - 1) {
                            iArr7[length4] = i43.p();
                            i43.s();
                            length4++;
                        }
                        iArr7[length4] = i43.p();
                        this.profileOptions = iArr7;
                        break;
                    case 234:
                        int e2 = i43.e(i43.p());
                        int c2 = i43.c();
                        int i6 = 0;
                        while (i43.b() > 0) {
                            i43.p();
                            i6++;
                        }
                        i43.t(c2);
                        int[] iArr8 = this.profileOptions;
                        int length5 = iArr8 == null ? 0 : iArr8.length;
                        int i7 = i6 + length5;
                        int[] iArr9 = new int[i7];
                        if (length5 != 0) {
                            System.arraycopy(iArr8, 0, iArr9, 0, length5);
                        }
                        while (length5 < i7) {
                            iArr9[length5] = i43.p();
                            length5++;
                        }
                        this.profileOptions = iArr9;
                        i43.d(e2);
                        break;
                    default:
                        if (i43.u(s)) {
                            break;
                        } else {
                            return this;
                        }
                }
            }
        }
    }

    public static final class LogEvent extends ad9 {
        private static volatile LogEvent[] _emptyArray;
        public String event;
        public byte[] params;
        public long sessionId;
        public long time;
        public String type;
        public long userId;

        public LogEvent() {
            clear();
        }

        public static LogEvent[] emptyArray() {
            if (_emptyArray == null) {
                synchronized (bj7.b) {
                    try {
                        if (_emptyArray == null) {
                            _emptyArray = new LogEvent[0];
                        }
                    } catch (Throwable th) {
                        throw th;
                    }
                }
            }
            return _emptyArray;
        }

        public static LogEvent parseFrom(byte[] bArr) throws InvalidProtocolBufferNanoException {
            return (LogEvent) ad9.mergeFrom(new LogEvent(), bArr);
        }

        public LogEvent clear() {
            this.time = 0;
            this.type = "";
            this.event = "";
            this.params = ct.h;
            this.userId = 0;
            this.sessionId = 0;
            this.cachedSize = -1;
            return this;
        }

        public int computeSerializedSize() {
            long j = this.time;
            int h = j != 0 ? j43.h(1, j) : 0;
            if (!this.type.equals("")) {
                h += j43.l(2, this.type);
            }
            if (!this.event.equals("")) {
                h += j43.l(3, this.event);
            }
            if (!Arrays.equals(this.params, ct.h)) {
                h += j43.b(4, this.params);
            }
            long j2 = this.userId;
            if (j2 != 0) {
                h += j43.h(5, j2);
            }
            long j3 = this.sessionId;
            return j3 != 0 ? h + j43.h(6, j3) : h;
        }

        public void writeTo(j43 j43) throws IOException {
            long j = this.time;
            if (j != 0) {
                j43.x(1, j);
            }
            if (!this.type.equals("")) {
                j43.E(2, this.type);
            }
            if (!this.event.equals("")) {
                j43.E(3, this.event);
            }
            if (!Arrays.equals(this.params, ct.h)) {
                j43.s(4, this.params);
            }
            long j2 = this.userId;
            if (j2 != 0) {
                j43.x(5, j2);
            }
            long j3 = this.sessionId;
            if (j3 != 0) {
                j43.x(6, j3);
            }
        }

        public static LogEvent parseFrom(i43 i43) throws IOException {
            return new LogEvent().mergeFrom(i43);
        }

        public LogEvent mergeFrom(i43 i43) throws IOException {
            while (true) {
                int s = i43.s();
                if (s == 0) {
                    return this;
                }
                if (s == 8) {
                    this.time = i43.q();
                } else if (s == 18) {
                    this.type = i43.r();
                } else if (s == 26) {
                    this.event = i43.r();
                } else if (s == 34) {
                    this.params = i43.g();
                } else if (s == 40) {
                    this.userId = i43.q();
                } else if (s == 48) {
                    this.sessionId = i43.q();
                } else if (!i43.u(s)) {
                    return this;
                }
            }
        }
    }

    public static final class LongList extends ad9 {
        private static volatile LongList[] _emptyArray;
        public long[] value;

        public LongList() {
            clear();
        }

        public static LongList[] emptyArray() {
            if (_emptyArray == null) {
                synchronized (bj7.b) {
                    try {
                        if (_emptyArray == null) {
                            _emptyArray = new LongList[0];
                        }
                    } catch (Throwable th) {
                        throw th;
                    }
                }
            }
            return _emptyArray;
        }

        public static LongList parseFrom(byte[] bArr) throws InvalidProtocolBufferNanoException {
            return (LongList) ad9.mergeFrom(new LongList(), bArr);
        }

        public LongList clear() {
            this.value = ct.e;
            this.cachedSize = -1;
            return this;
        }

        public int computeSerializedSize() {
            long[] jArr = this.value;
            int i = 0;
            if (jArr == null || jArr.length <= 0) {
                return 0;
            }
            int i2 = 0;
            while (true) {
                long[] jArr2 = this.value;
                if (i >= jArr2.length) {
                    return i2 + jArr2.length;
                }
                i2 += j43.k(jArr2[i]);
                i++;
            }
        }

        public void writeTo(j43 j43) throws IOException {
            long[] jArr = this.value;
            if (jArr != null && jArr.length > 0) {
                int i = 0;
                while (true) {
                    long[] jArr2 = this.value;
                    if (i < jArr2.length) {
                        j43.x(1, jArr2[i]);
                        i++;
                    } else {
                        return;
                    }
                }
            }
        }

        public static LongList parseFrom(i43 i43) throws IOException {
            return new LongList().mergeFrom(i43);
        }

        public LongList mergeFrom(i43 i43) throws IOException {
            while (true) {
                int s = i43.s();
                if (s == 0) {
                    return this;
                }
                if (s == 8) {
                    int q = ct.q(i43, 8);
                    long[] jArr = this.value;
                    int length = jArr == null ? 0 : jArr.length;
                    int i = q + length;
                    long[] jArr2 = new long[i];
                    if (length != 0) {
                        System.arraycopy(jArr, 0, jArr2, 0, length);
                    }
                    while (length < i - 1) {
                        jArr2[length] = i43.q();
                        i43.s();
                        length++;
                    }
                    jArr2[length] = i43.q();
                    this.value = jArr2;
                } else if (s == 10) {
                    int e = i43.e(i43.p());
                    int c = i43.c();
                    int i2 = 0;
                    while (i43.b() > 0) {
                        i43.q();
                        i2++;
                    }
                    i43.t(c);
                    long[] jArr3 = this.value;
                    int length2 = jArr3 == null ? 0 : jArr3.length;
                    int i3 = i2 + length2;
                    long[] jArr4 = new long[i3];
                    if (length2 != 0) {
                        System.arraycopy(jArr3, 0, jArr4, 0, length2);
                    }
                    while (length2 < i3) {
                        jArr4[length2] = i43.q();
                        length2++;
                    }
                    this.value = jArr4;
                    i43.d(e);
                } else if (!i43.u(s)) {
                    return this;
                }
            }
        }
    }

    public static final class MessageElement extends ad9 {
        public static final int ANIMOJI = 10;
        public static final int CODE = 9;
        public static final int EMPHASIZED = 4;
        public static final int GROUP_MENTION = 1;
        public static final int HEADING = 8;
        public static final int LINK = 5;
        public static final int MONOSPACED = 3;
        public static final int STRIKETHROUGH = 6;
        public static final int STRONG = 2;
        public static final int UNDERLINE = 7;
        public static final int USER_MENTION = 0;
        private static volatile MessageElement[] _emptyArray;
        public long entityId;
        public String entityName;
        public int from;
        public int length;
        public LinkAttributes linkAttributes;
        public int type;

        public static final class LinkAttributes extends ad9 {
            private static volatile LinkAttributes[] _emptyArray;
            public String url;

            public LinkAttributes() {
                clear();
            }

            public static LinkAttributes[] emptyArray() {
                if (_emptyArray == null) {
                    synchronized (bj7.b) {
                        try {
                            if (_emptyArray == null) {
                                _emptyArray = new LinkAttributes[0];
                            }
                        } catch (Throwable th) {
                            throw th;
                        }
                    }
                }
                return _emptyArray;
            }

            public static LinkAttributes parseFrom(byte[] bArr) throws InvalidProtocolBufferNanoException {
                return (LinkAttributes) ad9.mergeFrom(new LinkAttributes(), bArr);
            }

            public LinkAttributes clear() {
                this.url = "";
                this.cachedSize = -1;
                return this;
            }

            public int computeSerializedSize() {
                if (!this.url.equals("")) {
                    return j43.l(1, this.url);
                }
                return 0;
            }

            public void writeTo(j43 j43) throws IOException {
                if (!this.url.equals("")) {
                    j43.E(1, this.url);
                }
            }

            public static LinkAttributes parseFrom(i43 i43) throws IOException {
                return new LinkAttributes().mergeFrom(i43);
            }

            public LinkAttributes mergeFrom(i43 i43) throws IOException {
                while (true) {
                    int s = i43.s();
                    if (s == 0) {
                        return this;
                    }
                    if (s == 10) {
                        this.url = i43.r();
                    } else if (!i43.u(s)) {
                        return this;
                    }
                }
            }
        }

        public MessageElement() {
            clear();
        }

        public static MessageElement[] emptyArray() {
            if (_emptyArray == null) {
                synchronized (bj7.b) {
                    try {
                        if (_emptyArray == null) {
                            _emptyArray = new MessageElement[0];
                        }
                    } catch (Throwable th) {
                        throw th;
                    }
                }
            }
            return _emptyArray;
        }

        public static MessageElement parseFrom(byte[] bArr) throws InvalidProtocolBufferNanoException {
            return (MessageElement) ad9.mergeFrom(new MessageElement(), bArr);
        }

        public MessageElement clear() {
            this.entityId = 0;
            this.entityName = "";
            this.type = 0;
            this.from = 0;
            this.length = 0;
            this.linkAttributes = null;
            this.cachedSize = -1;
            return this;
        }

        public int computeSerializedSize() {
            long j = this.entityId;
            int h = j != 0 ? j43.h(1, j) : 0;
            if (!this.entityName.equals("")) {
                h += j43.l(2, this.entityName);
            }
            int i = this.type;
            if (i != 0) {
                h += j43.f(3, i);
            }
            int i2 = this.from;
            if (i2 != 0) {
                h += j43.f(4, i2);
            }
            int i3 = this.length;
            if (i3 != 0) {
                h += j43.f(5, i3);
            }
            LinkAttributes linkAttributes2 = this.linkAttributes;
            return linkAttributes2 != null ? h + j43.i(6, linkAttributes2) : h;
        }

        public void writeTo(j43 j43) throws IOException {
            long j = this.entityId;
            if (j != 0) {
                j43.x(1, j);
            }
            if (!this.entityName.equals("")) {
                j43.E(2, this.entityName);
            }
            int i = this.type;
            if (i != 0) {
                j43.w(3, i);
            }
            int i2 = this.from;
            if (i2 != 0) {
                j43.w(4, i2);
            }
            int i3 = this.length;
            if (i3 != 0) {
                j43.w(5, i3);
            }
            LinkAttributes linkAttributes2 = this.linkAttributes;
            if (linkAttributes2 != null) {
                j43.y(6, linkAttributes2);
            }
        }

        public static MessageElement parseFrom(i43 i43) throws IOException {
            return new MessageElement().mergeFrom(i43);
        }

        public MessageElement mergeFrom(i43 i43) throws IOException {
            while (true) {
                int s = i43.s();
                if (s == 0) {
                    return this;
                }
                if (s == 8) {
                    this.entityId = i43.q();
                } else if (s != 18) {
                    if (s == 24) {
                        int p = i43.p();
                        switch (p) {
                            case 0:
                            case 1:
                            case 2:
                            case 3:
                            case 4:
                            case 5:
                            case 6:
                            case 7:
                            case 8:
                            case 9:
                            case 10:
                                this.type = p;
                                break;
                        }
                    } else if (s == 32) {
                        this.from = i43.p();
                    } else if (s == 40) {
                        this.length = i43.p();
                    } else if (s == 50) {
                        if (this.linkAttributes == null) {
                            this.linkAttributes = new LinkAttributes();
                        }
                        i43.j(this.linkAttributes);
                    } else if (!i43.u(s)) {
                        return this;
                    }
                } else {
                    this.entityName = i43.r();
                }
            }
        }
    }

    public static final class MessageElements extends ad9 {
        private static volatile MessageElements[] _emptyArray;
        public MessageElement[] elements;

        public MessageElements() {
            clear();
        }

        public static MessageElements[] emptyArray() {
            if (_emptyArray == null) {
                synchronized (bj7.b) {
                    try {
                        if (_emptyArray == null) {
                            _emptyArray = new MessageElements[0];
                        }
                    } catch (Throwable th) {
                        throw th;
                    }
                }
            }
            return _emptyArray;
        }

        public static MessageElements parseFrom(byte[] bArr) throws InvalidProtocolBufferNanoException {
            return (MessageElements) ad9.mergeFrom(new MessageElements(), bArr);
        }

        public MessageElements clear() {
            this.elements = MessageElement.emptyArray();
            this.cachedSize = -1;
            return this;
        }

        public int computeSerializedSize() {
            MessageElement[] messageElementArr = this.elements;
            int i = 0;
            if (messageElementArr == null || messageElementArr.length <= 0) {
                return 0;
            }
            int i2 = 0;
            while (true) {
                MessageElement[] messageElementArr2 = this.elements;
                if (i >= messageElementArr2.length) {
                    return i2;
                }
                MessageElement messageElement = messageElementArr2[i];
                if (messageElement != null) {
                    i2 = j43.i(1, messageElement) + i2;
                }
                i++;
            }
        }

        public void writeTo(j43 j43) throws IOException {
            MessageElement[] messageElementArr = this.elements;
            if (messageElementArr != null && messageElementArr.length > 0) {
                int i = 0;
                while (true) {
                    MessageElement[] messageElementArr2 = this.elements;
                    if (i < messageElementArr2.length) {
                        MessageElement messageElement = messageElementArr2[i];
                        if (messageElement != null) {
                            j43.y(1, messageElement);
                        }
                        i++;
                    } else {
                        return;
                    }
                }
            }
        }

        public static MessageElements parseFrom(i43 i43) throws IOException {
            return new MessageElements().mergeFrom(i43);
        }

        public MessageElements mergeFrom(i43 i43) throws IOException {
            while (true) {
                int s = i43.s();
                if (s == 0) {
                    return this;
                }
                if (s == 10) {
                    int q = ct.q(i43, 10);
                    MessageElement[] messageElementArr = this.elements;
                    int length = messageElementArr == null ? 0 : messageElementArr.length;
                    int i = q + length;
                    MessageElement[] messageElementArr2 = new MessageElement[i];
                    if (length != 0) {
                        System.arraycopy(messageElementArr, 0, messageElementArr2, 0, length);
                    }
                    while (length < i - 1) {
                        MessageElement messageElement = new MessageElement();
                        messageElementArr2[length] = messageElement;
                        i43.j(messageElement);
                        i43.s();
                        length++;
                    }
                    MessageElement messageElement2 = new MessageElement();
                    messageElementArr2[length] = messageElement2;
                    i43.j(messageElement2);
                    this.elements = messageElementArr2;
                } else if (!i43.u(s)) {
                    return this;
                }
            }
        }
    }

    public static final class MessagePreview extends ad9 {
        private static volatile MessagePreview[] _emptyArray;
        public Attaches attaches;
        public String text;

        public MessagePreview() {
            clear();
        }

        public static MessagePreview[] emptyArray() {
            if (_emptyArray == null) {
                synchronized (bj7.b) {
                    try {
                        if (_emptyArray == null) {
                            _emptyArray = new MessagePreview[0];
                        }
                    } catch (Throwable th) {
                        throw th;
                    }
                }
            }
            return _emptyArray;
        }

        public static MessagePreview parseFrom(byte[] bArr) throws InvalidProtocolBufferNanoException {
            return (MessagePreview) ad9.mergeFrom(new MessagePreview(), bArr);
        }

        public MessagePreview clear() {
            this.text = "";
            this.attaches = null;
            this.cachedSize = -1;
            return this;
        }

        public int computeSerializedSize() {
            int l = !this.text.equals("") ? j43.l(1, this.text) : 0;
            Attaches attaches2 = this.attaches;
            return attaches2 != null ? l + j43.i(2, attaches2) : l;
        }

        public void writeTo(j43 j43) throws IOException {
            if (!this.text.equals("")) {
                j43.E(1, this.text);
            }
            Attaches attaches2 = this.attaches;
            if (attaches2 != null) {
                j43.y(2, attaches2);
            }
        }

        public static MessagePreview parseFrom(i43 i43) throws IOException {
            return new MessagePreview().mergeFrom(i43);
        }

        public MessagePreview mergeFrom(i43 i43) throws IOException {
            while (true) {
                int s = i43.s();
                if (s == 0) {
                    return this;
                }
                if (s == 10) {
                    this.text = i43.r();
                } else if (s == 18) {
                    if (this.attaches == null) {
                        this.attaches = new Attaches();
                    }
                    i43.j(this.attaches);
                } else if (!i43.u(s)) {
                    return this;
                }
            }
        }
    }

    public static final class MessageReactionWithCount extends ad9 {
        private static volatile MessageReactionWithCount[] _emptyArray;
        public int count;
        public ReactionData reaction;

        public MessageReactionWithCount() {
            clear();
        }

        public static MessageReactionWithCount[] emptyArray() {
            if (_emptyArray == null) {
                synchronized (bj7.b) {
                    try {
                        if (_emptyArray == null) {
                            _emptyArray = new MessageReactionWithCount[0];
                        }
                    } catch (Throwable th) {
                        throw th;
                    }
                }
            }
            return _emptyArray;
        }

        public static MessageReactionWithCount parseFrom(byte[] bArr) throws InvalidProtocolBufferNanoException {
            return (MessageReactionWithCount) ad9.mergeFrom(new MessageReactionWithCount(), bArr);
        }

        public MessageReactionWithCount clear() {
            this.reaction = null;
            this.count = 0;
            this.cachedSize = -1;
            return this;
        }

        public int computeSerializedSize() {
            ReactionData reactionData = this.reaction;
            int i = reactionData != null ? j43.i(1, reactionData) : 0;
            int i2 = this.count;
            return i2 != 0 ? i + j43.f(2, i2) : i;
        }

        public void writeTo(j43 j43) throws IOException {
            ReactionData reactionData = this.reaction;
            if (reactionData != null) {
                j43.y(1, reactionData);
            }
            int i = this.count;
            if (i != 0) {
                j43.w(2, i);
            }
        }

        public static MessageReactionWithCount parseFrom(i43 i43) throws IOException {
            return new MessageReactionWithCount().mergeFrom(i43);
        }

        public MessageReactionWithCount mergeFrom(i43 i43) throws IOException {
            while (true) {
                int s = i43.s();
                if (s == 0) {
                    return this;
                }
                if (s == 10) {
                    if (this.reaction == null) {
                        this.reaction = new ReactionData();
                    }
                    i43.j(this.reaction);
                } else if (s == 16) {
                    this.count = i43.p();
                } else if (!i43.u(s)) {
                    return this;
                }
            }
        }
    }

    public static final class MessageReactions extends ad9 {
        private static volatile MessageReactions[] _emptyArray;
        public MessageReactionWithCount[] reactions;
        public int totalCount;
        public ReactionData yourReaction;

        public MessageReactions() {
            clear();
        }

        public static MessageReactions[] emptyArray() {
            if (_emptyArray == null) {
                synchronized (bj7.b) {
                    try {
                        if (_emptyArray == null) {
                            _emptyArray = new MessageReactions[0];
                        }
                    } catch (Throwable th) {
                        throw th;
                    }
                }
            }
            return _emptyArray;
        }

        public static MessageReactions parseFrom(byte[] bArr) throws InvalidProtocolBufferNanoException {
            return (MessageReactions) ad9.mergeFrom(new MessageReactions(), bArr);
        }

        public MessageReactions clear() {
            this.reactions = MessageReactionWithCount.emptyArray();
            this.totalCount = 0;
            this.yourReaction = null;
            this.cachedSize = -1;
            return this;
        }

        public int computeSerializedSize() {
            MessageReactionWithCount[] messageReactionWithCountArr = this.reactions;
            int i = 0;
            if (messageReactionWithCountArr != null && messageReactionWithCountArr.length > 0) {
                int i2 = 0;
                while (true) {
                    MessageReactionWithCount[] messageReactionWithCountArr2 = this.reactions;
                    if (i >= messageReactionWithCountArr2.length) {
                        break;
                    }
                    MessageReactionWithCount messageReactionWithCount = messageReactionWithCountArr2[i];
                    if (messageReactionWithCount != null) {
                        i2 = j43.i(1, messageReactionWithCount) + i2;
                    }
                    i++;
                }
                i = i2;
            }
            int i3 = this.totalCount;
            if (i3 != 0) {
                i += j43.f(2, i3);
            }
            ReactionData reactionData = this.yourReaction;
            return reactionData != null ? i + j43.i(3, reactionData) : i;
        }

        public void writeTo(j43 j43) throws IOException {
            MessageReactionWithCount[] messageReactionWithCountArr = this.reactions;
            if (messageReactionWithCountArr != null && messageReactionWithCountArr.length > 0) {
                int i = 0;
                while (true) {
                    MessageReactionWithCount[] messageReactionWithCountArr2 = this.reactions;
                    if (i >= messageReactionWithCountArr2.length) {
                        break;
                    }
                    MessageReactionWithCount messageReactionWithCount = messageReactionWithCountArr2[i];
                    if (messageReactionWithCount != null) {
                        j43.y(1, messageReactionWithCount);
                    }
                    i++;
                }
            }
            int i2 = this.totalCount;
            if (i2 != 0) {
                j43.w(2, i2);
            }
            ReactionData reactionData = this.yourReaction;
            if (reactionData != null) {
                j43.y(3, reactionData);
            }
        }

        public static MessageReactions parseFrom(i43 i43) throws IOException {
            return new MessageReactions().mergeFrom(i43);
        }

        public MessageReactions mergeFrom(i43 i43) throws IOException {
            while (true) {
                int s = i43.s();
                if (s == 0) {
                    return this;
                }
                if (s == 10) {
                    int q = ct.q(i43, 10);
                    MessageReactionWithCount[] messageReactionWithCountArr = this.reactions;
                    int length = messageReactionWithCountArr == null ? 0 : messageReactionWithCountArr.length;
                    int i = q + length;
                    MessageReactionWithCount[] messageReactionWithCountArr2 = new MessageReactionWithCount[i];
                    if (length != 0) {
                        System.arraycopy(messageReactionWithCountArr, 0, messageReactionWithCountArr2, 0, length);
                    }
                    while (length < i - 1) {
                        MessageReactionWithCount messageReactionWithCount = new MessageReactionWithCount();
                        messageReactionWithCountArr2[length] = messageReactionWithCount;
                        i43.j(messageReactionWithCount);
                        i43.s();
                        length++;
                    }
                    MessageReactionWithCount messageReactionWithCount2 = new MessageReactionWithCount();
                    messageReactionWithCountArr2[length] = messageReactionWithCount2;
                    i43.j(messageReactionWithCount2);
                    this.reactions = messageReactionWithCountArr2;
                } else if (s == 16) {
                    this.totalCount = i43.p();
                } else if (s == 26) {
                    if (this.yourReaction == null) {
                        this.yourReaction = new ReactionData();
                    }
                    i43.j(this.yourReaction);
                } else if (!i43.u(s)) {
                    return this;
                }
            }
        }
    }

    public static final class PendingUploadData extends ad9 {
        private static volatile PendingUploadData[] _emptyArray;
        public Map<Long, String> pendingMap;

        public PendingUploadData() {
            clear();
        }

        public static PendingUploadData[] emptyArray() {
            if (_emptyArray == null) {
                synchronized (bj7.b) {
                    try {
                        if (_emptyArray == null) {
                            _emptyArray = new PendingUploadData[0];
                        }
                    } catch (Throwable th) {
                        throw th;
                    }
                }
            }
            return _emptyArray;
        }

        public static PendingUploadData parseFrom(byte[] bArr) throws InvalidProtocolBufferNanoException {
            return (PendingUploadData) ad9.mergeFrom(new PendingUploadData(), bArr);
        }

        public PendingUploadData clear() {
            this.pendingMap = null;
            this.cachedSize = -1;
            return this;
        }

        public int computeSerializedSize() {
            Map<Long, String> map = this.pendingMap;
            if (map != null) {
                return bj7.a(map, 1, 3, 9);
            }
            return 0;
        }

        public PendingUploadData mergeFrom(i43 i43) throws IOException {
            sd8 sd8 = y7e.e;
            while (true) {
                int s = i43.s();
                if (s == 0) {
                    return this;
                }
                if (s == 10) {
                    this.pendingMap = bj7.b(i43, this.pendingMap, sd8, 3, 9, (ad9) null, 8, 18);
                } else if (!i43.u(s)) {
                    return this;
                }
            }
        }

        public void writeTo(j43 j43) throws IOException {
            Map<Long, String> map = this.pendingMap;
            if (map != null) {
                bj7.d(j43, map, 1, 3, 9);
            }
        }

        public static PendingUploadData parseFrom(i43 i43) throws IOException {
            return new PendingUploadData().mergeFrom(i43);
        }
    }

    public static final class ReactionData extends ad9 {
        public static final int EMOJI = 0;
        public static final int STICKER = 1;
        private static volatile ReactionData[] _emptyArray;
        public String reaction;
        public int type;

        public ReactionData() {
            clear();
        }

        public static ReactionData[] emptyArray() {
            if (_emptyArray == null) {
                synchronized (bj7.b) {
                    try {
                        if (_emptyArray == null) {
                            _emptyArray = new ReactionData[0];
                        }
                    } catch (Throwable th) {
                        throw th;
                    }
                }
            }
            return _emptyArray;
        }

        public static ReactionData parseFrom(byte[] bArr) throws InvalidProtocolBufferNanoException {
            return (ReactionData) ad9.mergeFrom(new ReactionData(), bArr);
        }

        public ReactionData clear() {
            this.type = 0;
            this.reaction = "";
            this.cachedSize = -1;
            return this;
        }

        public int computeSerializedSize() {
            int i = this.type;
            int f = i != 0 ? j43.f(1, i) : 0;
            return !this.reaction.equals("") ? f + j43.l(2, this.reaction) : f;
        }

        public void writeTo(j43 j43) throws IOException {
            int i = this.type;
            if (i != 0) {
                j43.w(1, i);
            }
            if (!this.reaction.equals("")) {
                j43.E(2, this.reaction);
            }
        }

        public static ReactionData parseFrom(i43 i43) throws IOException {
            return new ReactionData().mergeFrom(i43);
        }

        public ReactionData mergeFrom(i43 i43) throws IOException {
            while (true) {
                int s = i43.s();
                if (s == 0) {
                    return this;
                }
                if (s == 8) {
                    int p = i43.p();
                    if (p == 0 || p == 1) {
                        this.type = p;
                    }
                } else if (s == 18) {
                    this.reaction = i43.r();
                } else if (!i43.u(s)) {
                    return this;
                }
            }
        }
    }
}
