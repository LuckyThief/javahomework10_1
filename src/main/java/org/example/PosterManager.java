package org.example;

public class PosterManager {
    private PosterItem[] items = new PosterItem[0];
    private int last = 5;

    public PosterManager(int last) {
        this.last = last;
    }

    public void save(PosterItem item) {
        PosterItem[] tmp = new PosterItem[items.length + 1];
        for (int i = 0; i < items.length; i++) {
            tmp[i] = items[i];
        }
        tmp[tmp.length - 1] = item;
        items = tmp;
    }

    public PosterItem[] getItems() {
        return items;
    }

    public PosterItem[] findAll() {
        PosterItem[] items = getItems();

        return items;
    }

    public PosterItem[] findLast() {
        int resultLength;
        if (items.length >= last) {
            resultLength = last;
        } else {
            resultLength = items.length;
        }

        PosterItem[] result = new PosterItem[resultLength];
        for (int i = 0; i < result.length; i++) {
            result[i] = items[items.length - 1 - i];
        }
        return result;
    }
}
