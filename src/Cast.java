public class Cast<E> {
    E data;
    public Cast(E data){
        this.data = data;
    }
    public E getData(){
        return data;
    }

       /* Cast<Integer> intCast = new Cast<Integer>(42);
        int x = intCast.getData();

        Cast<String> strCast = new Cast<String>("hi");
        String s = strCast.getData();

        String t = (String) intCast.getData();
        int y = (Integer) strCast.getData();
        intCast = strCast;

        */
    }

