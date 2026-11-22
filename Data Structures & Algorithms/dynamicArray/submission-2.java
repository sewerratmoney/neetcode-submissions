class DynamicArray {
    int capacity;
    int size;
    int[] elements;

    public DynamicArray(int capacity) {
        this.elements = new int[capacity];
        this.size = 0;
        this.capacity = capacity;
    }

    public int get(int i) {
        return this.elements[i];
    }

    public void set(int i, int n) {
        this.elements[i] = n;
    }

    public void pushback(int n) {
        if (size == capacity) {
            resize();
        }
        this.elements[size] = n;
        this.size += 1;
    }

    public int popback() {
        int back = this.elements[size - 1];
        this.elements[size - 1] = 0;
        this.size -= 1;
        return back;
    }

    private void resize() {
        if (size < capacity) {
            return;
        }
        this.capacity = this.capacity * 2;
        int[] resized = new int[this.capacity];
        for (int i = 0; i < this.size; i++) {
            resized[i] = this.elements[i];
        }
        this.elements = resized;
    }

    public int getSize() {
        return this.size;
    }

    public int getCapacity() {
        return this.capacity;
    }
}
