package bdc.immutable_mutable;

public class CustomString {
    private final String name;

    public CustomString(String name){
        this.name =name;
    }

    public String getName() {
        return name;
    }

    public CustomString appendName(String data){
        return new CustomString(this.getName().concat(data));
    }
}
