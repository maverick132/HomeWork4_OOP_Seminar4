public enum Priority {
        HIGH ("Высокий приоритет"),
        Medium ("Средний приоритет"),
        Low ("Низкий приоритет");

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
