package com.example.warimano.exercises.section.nine.abstractclass;

public class Node extends ListItem {

    public Node(Object value) {
        super(value);
    }

    ListItem next() {
        return this.rightLink;
    }

    @Override
    ListItem setNext(ListItem rightLink) {
        return this.rightLink = rightLink;
    }

    @Override
    ListItem previous() {
        return this.leftLink;
    }

    @Override
    ListItem setPrevious(ListItem leftLink) {
        return this.leftLink = leftLink;
    }

    @Override
    int compareTo(ListItem item) {
        if (item == null) return -1;
        return ((String) super.getValue()).compareTo((String) item.getValue());
    }
}
