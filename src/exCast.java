// I certify the code of this lab is entirely my own work,
// but I received assistance from [insert name (Instructor)].
// Follow this with a description of the type of assistance

public class exCast {
    Object data;
    public exCast(Object data){
        this.data = data;
    }
    public Object getData(){
        return data;
    }
    public static void main(String[] args) {
        exCast intCast = new exCast(42);
        exCast strCast = new exCast("hi");
        int x = (Integer) strCast.getData();
    }
}