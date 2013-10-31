package dbrown_regex;

public class Fish {
    private int count;
    private String group;
    private int beginning;


    public Fish(int count, String group, int start) {
        this.count = count;
        this.group = group;
        beginning = start;
    }

    @Override
    public String toString() {
        return "Fish{" +
                "count=" + count +
                ", group='" + group + '\'' +
                ", start='" + beginning + '\'' +
                '}';
    }
}