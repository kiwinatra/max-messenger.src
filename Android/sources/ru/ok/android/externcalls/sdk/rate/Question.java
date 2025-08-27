package ru.ok.android.externcalls.sdk.rate;

import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

@Metadata(d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0002\b\t\n\u0002\u0010\u000b\n\u0002\b\u0004\b\b\u0018\u00002\u00020\u0001B\u0015\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005¢\u0006\u0002\u0010\u0006J\t\u0010\u000b\u001a\u00020\u0003HÆ\u0003J\t\u0010\f\u001a\u00020\u0005HÆ\u0003J\u001d\u0010\r\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u0005HÆ\u0001J\u0013\u0010\u000e\u001a\u00020\u000f2\b\u0010\u0010\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u0011\u001a\u00020\u0003HÖ\u0001J\t\u0010\u0012\u001a\u00020\u0005HÖ\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0007\u0010\bR\u0011\u0010\u0004\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\t\u0010\n¨\u0006\u0013"}, d2 = {"Lru/ok/android/externcalls/sdk/rate/Question;", "", "index", "", "title", "", "(ILjava/lang/String;)V", "getIndex", "()I", "getTitle", "()Ljava/lang/String;", "component1", "component2", "copy", "equals", "", "other", "hashCode", "toString", "calls-sdk_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
public final class Question {
    private final int index;
    private final String title;

    public Question(int i, String str) {
        this.index = i;
        this.title = str;
    }

    public static /* synthetic */ Question copy$default(Question question, int i, String str, int i2, Object obj) {
        if ((i2 & 1) != 0) {
            i = question.index;
        }
        if ((i2 & 2) != 0) {
            str = question.title;
        }
        return question.copy(i, str);
    }

    public final int component1() {
        return this.index;
    }

    public final String component2() {
        return this.title;
    }

    public final Question copy(int i, String str) {
        return new Question(i, str);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof Question)) {
            return false;
        }
        Question question = (Question) obj;
        return this.index == question.index && Intrinsics.areEqual((Object) this.title, (Object) question.title);
    }

    public final int getIndex() {
        return this.index;
    }

    public final String getTitle() {
        return this.title;
    }

    public int hashCode() {
        return this.title.hashCode() + (Integer.hashCode(this.index) * 31);
    }

    public String toString() {
        int i = this.index;
        String str = this.title;
        return "Question(index=" + i + ", title=" + str + ")";
    }
}
