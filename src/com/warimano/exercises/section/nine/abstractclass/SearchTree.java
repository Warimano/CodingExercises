package com.warimano.exercises.section.nine.abstractclass;

public class SearchTree implements NodeList {
    private ListItem root;

    public SearchTree(ListItem root) {
        this.root = root;
    }

    @Override
    public ListItem getRoot() {
        return this.root;
    }

    @Override
    public boolean addItem(ListItem item) {
        if (this.root == null) {
            this.root = item;
            return true;
        }

        ListItem currentItem = this.root;
        while (currentItem != null) {
            int comparison = currentItem.compareTo(item);
            if (comparison < 0) {
                if (currentItem.next() != null) {
                    currentItem = currentItem.next();
                } else {
                    currentItem.setNext(item);
                    return true;
                }
            } else if (comparison > 0) {
                if (currentItem.previous() != null) {
                    currentItem = currentItem.previous();
                } else {
                    currentItem.setPrevious(item);
                    return true;
                }
            } else {
                System.out.println(item.getValue() + " is already present");
                return false;
            }
        }
        return false;
    }

    @Override
    public boolean removeItem(ListItem item) {
        if (item != null) System.out.println("Deleting item " + item.getValue());

        ListItem currentItem = this.root;
        ListItem parentItem = currentItem;

        while (currentItem != null) {
            int comparison = currentItem.compareTo(item);
            if (comparison < 0) {
                parentItem = currentItem;
                currentItem = currentItem.next();
            } else if (comparison > 0) {
                parentItem = currentItem;
                currentItem = currentItem.previous();
            } else {
                performRemoval(currentItem, parentItem);
                return true;
            }
        }
        return false;
    }

    private void performRemoval(ListItem toBeRemoved, ListItem parent) {
        if (toBeRemoved.next() == null) {
            if (parent.next() == toBeRemoved) {
                parent.setNext(toBeRemoved.previous());
            } else if (parent.previous() == toBeRemoved) {
                parent.setPrevious(toBeRemoved.previous());
            } else {
                this.root = toBeRemoved.previous();
            }
        } else if (toBeRemoved.previous() == null) {
            if (parent.next() == toBeRemoved) {
                parent.setNext(toBeRemoved.next());
            } else if (parent.previous() == toBeRemoved) {
                parent.setPrevious(toBeRemoved.next());
            } else {
                this.root = toBeRemoved.next();
            }
        } else {
            ListItem current = toBeRemoved.next();
            ListItem leftmostParent = toBeRemoved;
            while (current.previous() != null) {
                leftmostParent = current;
                current = current.previous();
            }

            toBeRemoved.setValue(current.getValue());
            if (leftmostParent == toBeRemoved) {
                toBeRemoved.setNext(current.next());
            } else {
                leftmostParent.setPrevious(current.next());
            }
        }
    }

    @Override
    public void traverse(ListItem root) {
        if (root != null) {
            traverse(root.previous());
            System.out.println(root.getValue());
            traverse(root.next());
        }
    }
}
