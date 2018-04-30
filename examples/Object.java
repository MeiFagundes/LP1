package examples;

public class Object {
    private String string;
    private int integer;

    public Object(String string){
        setObject(string);
    }

    public void setObject(String string){
        setString(string);
        setInt(0);
    }

    public String getString(){
        return string;
    }

    public void setString(String string) {
        this.string = string;
    }

    public int getInt(){
        return integer;
    }

    public void setInt(int integer) {
        this.integer = integer;
    }

}
