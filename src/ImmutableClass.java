public final class ImmutableClass {

    private final int id;
    private final String name;


    public ImmutableClass(int id, String name) {
        this.id = id;
        this.name = name;
    }

    @Override
    public String toString() {
        return "ImmutableClass{" +
                "id=" + id +
                ", name='" + name + '\'' +
                '}';
    }

    public int getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public static void main(String[] args) {
        ImmutableClass ic = new ImmutableClass(1,"chandan");
        System.out.println(ic.getId()+"-"+ic.getName());


    }
}
