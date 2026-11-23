class ProductOfNumbers {
    List<Integer> a = new ArrayList<>();

    public ProductOfNumbers() {
        a.add(1);
    }
    
    public void add(int num) {
        if (num == 0) {
            a.clear();
            a.add(1);
        } else {
            a.add(a.get(a.size() - 1) * num);
        }
    }
    
    public int getProduct(int k) {
        if (k >= a.size()) return 0;
        return a.get(a.size() - 1) / a.get(a.size() - 1 - k);
    }
}
