package Ex2;

import java.util.HashSet;
import java.util.List;

class TreeImpl<T extends Comparable<T>> implements Tree<T> {
    private Node<T> rootNode;
    private int size;

    @Override
    public void addValue(T value) {
        Node<T> newNode = new Node<T>(value, null, null);
        size++;

        if (rootNode == null) {
            rootNode = newNode;
            return;
        }

        Node<T> parent = null;
        insertRecursive(parent, rootNode, newNode);
    }

    private void insertRecursive(Node<T> parent, Node<T> current, Node<T> node) {
        if (current == null) {
            if (parent.getValue().compareTo(node.getValue()) > 0) {
                parent.setLeft(node);
            } else {
                parent.setRight(node);
            }
            return;
        }

        if (current.getValue().compareTo(node.getValue()) > 0) {
            insertRecursive(current, current.getLeft(), node);
        } else {
            insertRecursive(current, current.getRight(), node);
        }
    }

    @Override
    public void addAll(List<T> values) {
        for (T value : values) {
            addValue(value);
        }
    }

    @Override
    public HashSet<T> getValues(T inf, T sup) {
        HashSet<T> newSet = new HashSet<T>();
        addRecursive(newSet, rootNode, inf, sup);
        return newSet;
    }

    private void addRecursive(HashSet<T> set, Node<T> current, T inf, T sup) {
        if (current == null) {
            return;
        }

        addRecursive(set, current.getLeft(), inf, sup);

        if (current.getValue().compareTo(inf) >= 0
            && current.getValue().compareTo(sup) <= 0)
                set.add(current.getValue());

        addRecursive(set, current.getRight(), inf, sup);
    }

    @Override
    public int size() {
        return size;
    }

    @Override
    public boolean isEmpty() {
        return rootNode == null;
    }
}
