package ru.ok.android.externcalls.sdk.rate;

import java.util.List;
import kotlin.Metadata;

@Metadata(d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0006\u0018\u00002\u00020\u0001B\u001b\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00060\u0005¢\u0006\u0002\u0010\u0007R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\b\u0010\tR\u0017\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00060\u0005¢\u0006\b\n\u0000\u001a\u0004\b\n\u0010\u000b¨\u0006\f"}, d2 = {"Lru/ok/android/externcalls/sdk/rate/RateCallData;", "", "maxRateForQuestion", "", "questions", "", "Lru/ok/android/externcalls/sdk/rate/Question;", "(ILjava/util/List;)V", "getMaxRateForQuestion", "()I", "getQuestions", "()Ljava/util/List;", "calls-sdk_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
public final class RateCallData {
    private final int maxRateForQuestion;
    private final List<Question> questions;

    public RateCallData(int i, List<Question> list) {
        this.maxRateForQuestion = i;
        this.questions = list;
    }

    public final int getMaxRateForQuestion() {
        return this.maxRateForQuestion;
    }

    public final List<Question> getQuestions() {
        return this.questions;
    }
}
