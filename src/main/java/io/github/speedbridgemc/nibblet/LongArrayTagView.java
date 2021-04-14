package io.github.speedbridgemc.nibblet;

import org.jetbrains.annotations.NotNull;

public interface LongArrayTagView extends Tag {
    @Override
    default @NotNull TagType type() {
        return TagType.LONG_ARRAY;
    }

    int length();
    long get(int i);

    default long @NotNull [] toArray() {
        long[] array = new long[length()];
        for (int i = 0; i < array.length; i++)
            array[i] = get(i);
        return array;
    }

    @Override
    default @NotNull LongArrayTagView view() {
        return this;
    }

    @Override
    default @NotNull LongArrayTagView copy() {
        return this;
    }
}
