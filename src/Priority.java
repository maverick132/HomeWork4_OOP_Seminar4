public enum Priority {
        HIGH ("������� ���������"),
        Medium ("������� ���������"),
        Low ("������ ���������");

    private String title;

    Priority(String title) {
        this.title = title;
    }

    public String getTitle() {
        return title;
    }

    @Override
    public String toString() {
        return title;
    }

}
