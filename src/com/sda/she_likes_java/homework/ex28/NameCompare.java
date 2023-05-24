package com.sda.she_likes_java.homework.ex28;

import java.util.Comparator;
import java.util.function.Function;
import java.util.function.ToDoubleFunction;
import java.util.function.ToIntFunction;
import java.util.function.ToLongFunction;

public class NameCompare implements Comparator<Names> {

    public int compare (Names a, Names b){
        return a.getName().compareTo(b.getName());
    }

    @Override
    public Comparator<Names> reversed() {
        return Comparator.super.reversed();
    }

    @Override
    public Comparator<Names> thenComparing(Comparator<? super Names> other) {
        return Comparator.super.thenComparing(other);
    }

    @Override
    public <U> Comparator<Names> thenComparing(Function<? super Names, ? extends U> keyExtractor, Comparator<? super U> keyComparator) {
        return Comparator.super.thenComparing(keyExtractor, keyComparator);
    }

    @Override
    public <U extends Comparable<? super U>> Comparator<Names> thenComparing(Function<? super Names, ? extends U> keyExtractor) {
        return Comparator.super.thenComparing(keyExtractor);
    }

    @Override
    public Comparator<Names> thenComparingInt(ToIntFunction<? super Names> keyExtractor) {
        return Comparator.super.thenComparingInt(keyExtractor);
    }

    @Override
    public Comparator<Names> thenComparingLong(ToLongFunction<? super Names> keyExtractor) {
        return Comparator.super.thenComparingLong(keyExtractor);
    }

    @Override
    public Comparator<Names> thenComparingDouble(ToDoubleFunction<? super Names> keyExtractor) {
        return Comparator.super.thenComparingDouble(keyExtractor);
    }
}
