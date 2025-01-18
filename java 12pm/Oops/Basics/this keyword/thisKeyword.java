class thisKeyword {
    public void test() {
        System.out.println(this);
    }

    public static void main(String[] args) {
        thisKeyword obj = new thisKeyword();
        obj.test();
    }
}
